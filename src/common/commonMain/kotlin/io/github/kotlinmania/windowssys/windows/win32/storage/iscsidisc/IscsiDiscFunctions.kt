package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun addISNSServerA(address: Pcstr): UInt

public expect fun addISNSServerW(address: Pcwstr): UInt

public expect fun addIScsiConnectionA(uniquesessionid: MutPtr, reserved: MutPtr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, loginoptions: MutPtr, keysize: UInt, key: Pcstr, connectionid: MutPtr): UInt

public expect fun addIScsiConnectionW(uniquesessionid: MutPtr, reserved: MutPtr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, loginoptions: MutPtr, keysize: UInt, key: Pcstr, connectionid: MutPtr): UInt

public expect fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: MutPtr, securityflags: ULong, portal: MutPtr): UInt

public expect fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: MutPtr, securityflags: ULong, portal: MutPtr): UInt

public expect fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: MutPtr, loginoptions: MutPtr, portalgroup: MutPtr): UInt

public expect fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: MutPtr, loginoptions: MutPtr, portalgroup: MutPtr): UInt

public expect fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt

public expect fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt

public expect fun addRadiusServerA(address: Pcstr): UInt

public expect fun addRadiusServerW(address: Pcwstr): UInt

public expect fun clearPersistentIScsiDevices(): UInt

public expect fun getDevicesForIScsiSessionA(uniquesessionid: MutPtr, devicecount: MutPtr, devices: MutPtr): UInt

public expect fun getDevicesForIScsiSessionW(uniquesessionid: MutPtr, devicecount: MutPtr, devices: MutPtr): UInt

public expect fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: MutPtr, authinfo: MutPtr): UInt

public expect fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: MutPtr, authinfo: MutPtr): UInt

public expect fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt

public expect fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt

public expect fun getIScsiSessionListA(buffersize: MutPtr, sessioncount: MutPtr, sessioninfo: MutPtr): UInt

public expect fun getIScsiSessionListEx(buffersize: MutPtr, sessioncountptr: MutPtr, sessioninfo: MutPtr): UInt

public expect fun getIScsiSessionListW(buffersize: MutPtr, sessioncount: MutPtr, sessioninfo: MutPtr): UInt

public expect fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: MutPtr, buffer: MutPtr): UInt

public expect fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: MutPtr, buffer: MutPtr): UInt

public expect fun getIScsiVersionInformation(versioninfo: MutPtr): UInt

public expect fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, mappings: MutPtr, loginoptions: MutPtr, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr, uniqueconnectionid: MutPtr): UInt

public expect fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, mappings: MutPtr, loginoptions: MutPtr, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr, uniqueconnectionid: MutPtr): UInt

public expect fun logoutIScsiTarget(uniquesessionid: MutPtr): UInt

public expect fun refreshISNSServerA(address: Pcstr): UInt

public expect fun refreshISNSServerW(address: Pcwstr): UInt

public expect fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr): UInt

public expect fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr): UInt

public expect fun removeISNSServerA(address: Pcstr): UInt

public expect fun removeISNSServerW(address: Pcwstr): UInt

public expect fun removeIScsiConnection(uniquesessionid: MutPtr, connectionid: MutPtr): UInt

public expect fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: MutPtr): UInt

public expect fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: MutPtr): UInt

public expect fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr): UInt

public expect fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr): UInt

public expect fun removeIScsiStaticTargetA(targetname: Pcstr): UInt

public expect fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt

public expect fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt

public expect fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt

public expect fun removeRadiusServerA(address: Pcstr): UInt

public expect fun removeRadiusServerW(address: Pcwstr): UInt

public expect fun reportActiveIScsiTargetMappingsA(buffersize: MutPtr, mappingcount: MutPtr, mappings: MutPtr): UInt

public expect fun reportActiveIScsiTargetMappingsW(buffersize: MutPtr, mappingcount: MutPtr, mappings: MutPtr): UInt

public expect fun reportISNSServerListA(buffersizeinchar: MutPtr, buffer: Pstr): UInt

public expect fun reportISNSServerListW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt

public expect fun reportIScsiInitiatorListA(buffersize: MutPtr, buffer: Pstr): UInt

public expect fun reportIScsiInitiatorListW(buffersize: MutPtr, buffer: Pwstr): UInt

public expect fun reportIScsiPersistentLoginsA(count: MutPtr, persistentlogininfo: MutPtr, buffersizeinbytes: MutPtr): UInt

public expect fun reportIScsiPersistentLoginsW(count: MutPtr, persistentlogininfo: MutPtr, buffersizeinbytes: MutPtr): UInt

public expect fun reportIScsiSendTargetPortalsA(portalcount: MutPtr, portalinfo: MutPtr): UInt

public expect fun reportIScsiSendTargetPortalsExA(portalcount: MutPtr, portalinfosize: MutPtr, portalinfo: MutPtr): UInt

public expect fun reportIScsiSendTargetPortalsExW(portalcount: MutPtr, portalinfosize: MutPtr, portalinfo: MutPtr): UInt

public expect fun reportIScsiSendTargetPortalsW(portalcount: MutPtr, portalinfo: MutPtr): UInt

public expect fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: MutPtr, elementcount: MutPtr, portals: MutPtr): UInt

public expect fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: MutPtr, elementcount: MutPtr, portals: MutPtr): UInt

public expect fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: MutPtr, buffer: Pstr): UInt

public expect fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: MutPtr, buffer: Pwstr): UInt

public expect fun reportPersistentIScsiDevicesA(buffersizeinchar: MutPtr, buffer: Pstr): UInt

public expect fun reportPersistentIScsiDevicesW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt

public expect fun reportRadiusServerListA(buffersizeinchar: MutPtr, buffer: Pstr): UInt

public expect fun reportRadiusServerListW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt

public expect fun sendScsiInquiry(uniquesessionid: MutPtr, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt

public expect fun sendScsiReadCapacity(uniquesessionid: MutPtr, lun: ULong, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt

public expect fun sendScsiReportLuns(uniquesessionid: MutPtr, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt

public expect fun setIScsiGroupPresharedKey(keylength: UInt, key: MutPtr, persist: Boolean): UInt

public expect fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: MutPtr, persist: Boolean): UInt

public expect fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: MutPtr, persist: Boolean): UInt

public expect fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr): UInt

public expect fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt

public expect fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt

public expect fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr): UInt

public expect fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt

public expect fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt

public expect fun setupPersistentIScsiDevices(): UInt

public expect fun setupPersistentIScsiVolumes(): UInt
