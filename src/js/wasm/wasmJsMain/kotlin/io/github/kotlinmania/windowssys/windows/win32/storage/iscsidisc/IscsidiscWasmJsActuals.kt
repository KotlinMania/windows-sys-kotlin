@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public actual fun AddISNSServerA(address: PCSTR): UInt =
    0u

public actual fun AddISNSServerW(address: PCWSTR): UInt =
    0u

public actual fun AddIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt =
    0u

public actual fun AddIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt =
    0u

public actual fun AddIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt =
    0u

public actual fun AddIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt =
    0u

public actual fun AddIScsiStaticTargetA(targetname: PCSTR, targetalias: PCSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt =
    0u

public actual fun AddIScsiStaticTargetW(targetname: PCWSTR, targetalias: PCWSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt =
    0u

public actual fun AddPersistentIScsiDeviceA(devicepath: PCSTR): UInt =
    0u

public actual fun AddPersistentIScsiDeviceW(devicepath: PCWSTR): UInt =
    0u

public actual fun AddRadiusServerA(address: PCSTR): UInt =
    0u

public actual fun AddRadiusServerW(address: PCWSTR): UInt =
    0u

public actual fun ClearPersistentIScsiDevices(): UInt =
    0u

public actual fun GetDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): UInt =
    0u

public actual fun GetDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): UInt =
    0u

public actual fun GetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt =
    0u

public actual fun GetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt =
    0u

public actual fun GetIScsiInitiatorNodeNameA(initiatornodename: PSTR): UInt =
    0u

public actual fun GetIScsiInitiatorNodeNameW(initiatornodename: PWSTR): UInt =
    0u

public actual fun GetIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt =
    0u

public actual fun GetIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): UInt =
    0u

public actual fun GetIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt =
    0u

public actual fun GetIScsiTargetInformationA(targetname: PCSTR, discoverymechanism: PCSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt =
    0u

public actual fun GetIScsiTargetInformationW(targetname: PCWSTR, discoverymechanism: PCWSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt =
    0u

public actual fun GetIScsiVersionInformation(versioninfo: Long): UInt =
    0u

public actual fun LoginIScsiTargetA(targetname: PCSTR, isinformationalsession: Boolean, initiatorinstance: PCSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt =
    0u

public actual fun LoginIScsiTargetW(targetname: PCWSTR, isinformationalsession: Boolean, initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt =
    0u

public actual fun LogoutIScsiTarget(uniquesessionid: Long): UInt =
    0u

public actual fun RefreshISNSServerA(address: PCSTR): UInt =
    0u

public actual fun RefreshISNSServerW(address: PCWSTR): UInt =
    0u

public actual fun RefreshIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt =
    0u

public actual fun RefreshIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt =
    0u

public actual fun RemoveISNSServerA(address: PCSTR): UInt =
    0u

public actual fun RemoveISNSServerW(address: PCWSTR): UInt =
    0u

public actual fun RemoveIScsiConnection(uniquesessionid: Long, connectionid: Long): UInt =
    0u

public actual fun RemoveIScsiPersistentTargetA(initiatorinstance: PCSTR, initiatorportnumber: UInt, targetname: PCSTR, portal: Long): UInt =
    0u

public actual fun RemoveIScsiPersistentTargetW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetname: PCWSTR, portal: Long): UInt =
    0u

public actual fun RemoveIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt =
    0u

public actual fun RemoveIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt =
    0u

public actual fun RemoveIScsiStaticTargetA(targetname: PCSTR): UInt =
    0u

public actual fun RemoveIScsiStaticTargetW(targetname: PCWSTR): UInt =
    0u

public actual fun RemovePersistentIScsiDeviceA(devicepath: PCSTR): UInt =
    0u

public actual fun RemovePersistentIScsiDeviceW(devicepath: PCWSTR): UInt =
    0u

public actual fun RemoveRadiusServerA(address: PCSTR): UInt =
    0u

public actual fun RemoveRadiusServerW(address: PCWSTR): UInt =
    0u

public actual fun ReportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): UInt =
    0u

public actual fun ReportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): UInt =
    0u

public actual fun ReportISNSServerListA(buffersizeinchar: Long, buffer: PSTR): UInt =
    0u

public actual fun ReportISNSServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    0u

public actual fun ReportIScsiInitiatorListA(buffersize: Long, buffer: PSTR): UInt =
    0u

public actual fun ReportIScsiInitiatorListW(buffersize: Long, buffer: PWSTR): UInt =
    0u

public actual fun ReportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt =
    0u

public actual fun ReportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt =
    0u

public actual fun ReportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): UInt =
    0u

public actual fun ReportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt =
    0u

public actual fun ReportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt =
    0u

public actual fun ReportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): UInt =
    0u

public actual fun ReportIScsiTargetPortalsA(initiatorname: PCSTR, targetname: PCSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt =
    0u

public actual fun ReportIScsiTargetPortalsW(initiatorname: PCWSTR, targetname: PCWSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt =
    0u

public actual fun ReportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: PSTR): UInt =
    0u

public actual fun ReportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: PWSTR): UInt =
    0u

public actual fun ReportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: PSTR): UInt =
    0u

public actual fun ReportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    0u

public actual fun ReportRadiusServerListA(buffersizeinchar: Long, buffer: PSTR): UInt =
    0u

public actual fun ReportRadiusServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    0u

public actual fun SendScsiInquiry(uniquesessionid: Long, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    0u

public actual fun SendScsiReadCapacity(uniquesessionid: Long, lun: ULong, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    0u

public actual fun SendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    0u

public actual fun SetIScsiGroupPresharedKey(keylength: UInt, key: Long, persist: Boolean): UInt =
    0u

public actual fun SetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt =
    0u

public actual fun SetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt =
    0u

public actual fun SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt =
    0u

public actual fun SetIScsiInitiatorNodeNameA(initiatornodename: PCSTR): UInt =
    0u

public actual fun SetIScsiInitiatorNodeNameW(initiatornodename: PCWSTR): UInt =
    0u

public actual fun SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt =
    0u

public actual fun SetIScsiTunnelModeOuterAddressA(initiatorname: PCSTR, initiatorportnumber: UInt, destinationaddress: PCSTR, outermodeaddress: PCSTR, persist: Boolean): UInt =
    0u

public actual fun SetIScsiTunnelModeOuterAddressW(initiatorname: PCWSTR, initiatorportnumber: UInt, destinationaddress: PCWSTR, outermodeaddress: PCWSTR, persist: Boolean): UInt =
    0u

public actual fun SetupPersistentIScsiDevices(): UInt =
    0u

public actual fun SetupPersistentIScsiVolumes(): UInt =
    0u
