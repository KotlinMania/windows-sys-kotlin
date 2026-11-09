package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public expect fun AddISNSServerA(address: PCSTR): UInt

public expect fun AddISNSServerW(address: PCWSTR): UInt

public expect fun AddIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt

public expect fun AddIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt

public expect fun AddIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt

public expect fun AddIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt

public expect fun AddIScsiStaticTargetA(targetname: PCSTR, targetalias: PCSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt

public expect fun AddIScsiStaticTargetW(targetname: PCWSTR, targetalias: PCWSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt

public expect fun AddPersistentIScsiDeviceA(devicepath: PCSTR): UInt

public expect fun AddPersistentIScsiDeviceW(devicepath: PCWSTR): UInt

public expect fun AddRadiusServerA(address: PCSTR): UInt

public expect fun AddRadiusServerW(address: PCWSTR): UInt

public expect fun ClearPersistentIScsiDevices(): UInt

public expect fun GetDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): UInt

public expect fun GetDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): UInt

public expect fun GetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt

public expect fun GetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt

public expect fun GetIScsiInitiatorNodeNameA(initiatornodename: PSTR): UInt

public expect fun GetIScsiInitiatorNodeNameW(initiatornodename: PWSTR): UInt

public expect fun GetIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt

public expect fun GetIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): UInt

public expect fun GetIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt

public expect fun GetIScsiTargetInformationA(targetname: PCSTR, discoverymechanism: PCSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt

public expect fun GetIScsiTargetInformationW(targetname: PCWSTR, discoverymechanism: PCWSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt

public expect fun GetIScsiVersionInformation(versioninfo: Long): UInt

public expect fun LoginIScsiTargetA(targetname: PCSTR, isinformationalsession: Boolean, initiatorinstance: PCSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt

public expect fun LoginIScsiTargetW(targetname: PCWSTR, isinformationalsession: Boolean, initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt

public expect fun LogoutIScsiTarget(uniquesessionid: Long): UInt

public expect fun RefreshISNSServerA(address: PCSTR): UInt

public expect fun RefreshISNSServerW(address: PCWSTR): UInt

public expect fun RefreshIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt

public expect fun RefreshIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt

public expect fun RemoveISNSServerA(address: PCSTR): UInt

public expect fun RemoveISNSServerW(address: PCWSTR): UInt

public expect fun RemoveIScsiConnection(uniquesessionid: Long, connectionid: Long): UInt

public expect fun RemoveIScsiPersistentTargetA(initiatorinstance: PCSTR, initiatorportnumber: UInt, targetname: PCSTR, portal: Long): UInt

public expect fun RemoveIScsiPersistentTargetW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetname: PCWSTR, portal: Long): UInt

public expect fun RemoveIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt

public expect fun RemoveIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt

public expect fun RemoveIScsiStaticTargetA(targetname: PCSTR): UInt

public expect fun RemoveIScsiStaticTargetW(targetname: PCWSTR): UInt

public expect fun RemovePersistentIScsiDeviceA(devicepath: PCSTR): UInt

public expect fun RemovePersistentIScsiDeviceW(devicepath: PCWSTR): UInt

public expect fun RemoveRadiusServerA(address: PCSTR): UInt

public expect fun RemoveRadiusServerW(address: PCWSTR): UInt

public expect fun ReportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): UInt

public expect fun ReportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): UInt

public expect fun ReportISNSServerListA(buffersizeinchar: Long, buffer: PSTR): UInt

public expect fun ReportISNSServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt

public expect fun ReportIScsiInitiatorListA(buffersize: Long, buffer: PSTR): UInt

public expect fun ReportIScsiInitiatorListW(buffersize: Long, buffer: PWSTR): UInt

public expect fun ReportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt

public expect fun ReportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt

public expect fun ReportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): UInt

public expect fun ReportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt

public expect fun ReportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt

public expect fun ReportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): UInt

public expect fun ReportIScsiTargetPortalsA(initiatorname: PCSTR, targetname: PCSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt

public expect fun ReportIScsiTargetPortalsW(initiatorname: PCWSTR, targetname: PCWSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt

public expect fun ReportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: PSTR): UInt

public expect fun ReportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: PWSTR): UInt

public expect fun ReportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: PSTR): UInt

public expect fun ReportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: PWSTR): UInt

public expect fun ReportRadiusServerListA(buffersizeinchar: Long, buffer: PSTR): UInt

public expect fun ReportRadiusServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt

public expect fun SendScsiInquiry(uniquesessionid: Long, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt

public expect fun SendScsiReadCapacity(uniquesessionid: Long, lun: ULong, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt

public expect fun SendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt

public expect fun SetIScsiGroupPresharedKey(keylength: UInt, key: Long, persist: Boolean): UInt

public expect fun SetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt

public expect fun SetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt

public expect fun SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt

public expect fun SetIScsiInitiatorNodeNameA(initiatornodename: PCSTR): UInt

public expect fun SetIScsiInitiatorNodeNameW(initiatornodename: PCWSTR): UInt

public expect fun SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt

public expect fun SetIScsiTunnelModeOuterAddressA(initiatorname: PCSTR, initiatorportnumber: UInt, destinationaddress: PCSTR, outermodeaddress: PCSTR, persist: Boolean): UInt

public expect fun SetIScsiTunnelModeOuterAddressW(initiatorname: PCWSTR, initiatorportnumber: UInt, destinationaddress: PCWSTR, outermodeaddress: PCWSTR, persist: Boolean): UInt

public expect fun SetupPersistentIScsiDevices(): UInt

public expect fun SetupPersistentIScsiVolumes(): UInt
