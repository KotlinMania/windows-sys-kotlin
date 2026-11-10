package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun addISNSServerA(address: Pcstr): UInt

public expect fun addISNSServerW(address: Pcwstr): UInt

public expect fun addIScsiConnectionA(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt

public expect fun addIScsiConnectionW(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt

public expect fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt

public expect fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt

public expect fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt

public expect fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt

public expect fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt

public expect fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt

public expect fun addRadiusServerA(address: Pcstr): UInt

public expect fun addRadiusServerW(address: Pcwstr): UInt

public expect fun clearPersistentIScsiDevices(): UInt

public expect fun getDevicesForIScsiSessionA(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt

public expect fun getDevicesForIScsiSessionW(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt

public expect fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt

public expect fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt

public expect fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt

public expect fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt

public expect fun getIScsiSessionListA(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt

public expect fun getIScsiSessionListEx(buffersize: COpaquePointer?, sessioncountptr: COpaquePointer?, sessioninfo: COpaquePointer?): UInt

public expect fun getIScsiSessionListW(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt

public expect fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt

public expect fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt

public expect fun getIScsiVersionInformation(versioninfo: COpaquePointer?): UInt

public expect fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt

public expect fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt

public expect fun logoutIScsiTarget(uniquesessionid: COpaquePointer?): UInt

public expect fun refreshISNSServerA(address: Pcstr): UInt

public expect fun refreshISNSServerW(address: Pcwstr): UInt

public expect fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt

public expect fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt

public expect fun removeISNSServerA(address: Pcstr): UInt

public expect fun removeISNSServerW(address: Pcwstr): UInt

public expect fun removeIScsiConnection(uniquesessionid: COpaquePointer?, connectionid: COpaquePointer?): UInt

public expect fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: COpaquePointer?): UInt

public expect fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: COpaquePointer?): UInt

public expect fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt

public expect fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt

public expect fun removeIScsiStaticTargetA(targetname: Pcstr): UInt

public expect fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt

public expect fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt

public expect fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt

public expect fun removeRadiusServerA(address: Pcstr): UInt

public expect fun removeRadiusServerW(address: Pcwstr): UInt

public expect fun reportActiveIScsiTargetMappingsA(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt

public expect fun reportActiveIScsiTargetMappingsW(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt

public expect fun reportISNSServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt

public expect fun reportISNSServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt

public expect fun reportIScsiInitiatorListA(buffersize: COpaquePointer?, buffer: Pstr): UInt

public expect fun reportIScsiInitiatorListW(buffersize: COpaquePointer?, buffer: Pwstr): UInt

public expect fun reportIScsiPersistentLoginsA(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt

public expect fun reportIScsiPersistentLoginsW(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt

public expect fun reportIScsiSendTargetPortalsA(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt

public expect fun reportIScsiSendTargetPortalsExA(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt

public expect fun reportIScsiSendTargetPortalsExW(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt

public expect fun reportIScsiSendTargetPortalsW(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt

public expect fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt

public expect fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt

public expect fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pstr): UInt

public expect fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pwstr): UInt

public expect fun reportPersistentIScsiDevicesA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt

public expect fun reportPersistentIScsiDevicesW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt

public expect fun reportRadiusServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt

public expect fun reportRadiusServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt

public expect fun sendScsiInquiry(uniquesessionid: COpaquePointer?, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt

public expect fun sendScsiReadCapacity(uniquesessionid: COpaquePointer?, lun: ULong, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt

public expect fun sendScsiReportLuns(uniquesessionid: COpaquePointer?, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt

public expect fun setIScsiGroupPresharedKey(keylength: UInt, key: COpaquePointer?, persist: Boolean): UInt

public expect fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt

public expect fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt

public expect fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt

public expect fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt

public expect fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt

public expect fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt

public expect fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt

public expect fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt

public expect fun setupPersistentIScsiDevices(): UInt

public expect fun setupPersistentIScsiVolumes(): UInt
