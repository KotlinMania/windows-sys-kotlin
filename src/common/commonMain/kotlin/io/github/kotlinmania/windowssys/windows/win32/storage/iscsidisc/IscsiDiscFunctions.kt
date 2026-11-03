package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun AddISNSServerA(address: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddISNSServerA", longArrayOf(address)).toUInt()
}

public fun AddISNSServerW(address: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddISNSServerW", longArrayOf(address)).toUInt()
}

public fun AddIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddIScsiConnectionA", longArrayOf(uniquesessionid, reserved, initiatorportnumber.toLong(), targetportal, securityflags.toLong(), loginoptions, keysize.toLong(), key, connectionid)).toUInt()
}

public fun AddIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddIScsiConnectionW", longArrayOf(uniquesessionid, reserved, initiatorportnumber.toLong(), targetportal, securityflags.toLong(), loginoptions, keysize.toLong(), key, connectionid)).toUInt()
}

public fun AddIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddIScsiSendTargetPortalA", longArrayOf(initiatorinstance, initiatorportnumber.toLong(), loginoptions, securityflags.toLong(), portal)).toUInt()
}

public fun AddIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddIScsiSendTargetPortalW", longArrayOf(initiatorinstance, initiatorportnumber.toLong(), loginoptions, securityflags.toLong(), portal)).toUInt()
}

public fun AddIScsiStaticTargetA(targetname: PCSTR, targetalias: PCSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddIScsiStaticTargetA", longArrayOf(targetname, targetalias, targetflags.toLong(), if (persist) 1L else 0L, mappings, loginoptions, portalgroup)).toUInt()
}

public fun AddIScsiStaticTargetW(targetname: PCWSTR, targetalias: PCWSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddIScsiStaticTargetW", longArrayOf(targetname, targetalias, targetflags.toLong(), if (persist) 1L else 0L, mappings, loginoptions, portalgroup)).toUInt()
}

public fun AddPersistentIScsiDeviceA(devicepath: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddPersistentIScsiDeviceA", longArrayOf(devicepath)).toUInt()
}

public fun AddPersistentIScsiDeviceW(devicepath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddPersistentIScsiDeviceW", longArrayOf(devicepath)).toUInt()
}

public fun AddRadiusServerA(address: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddRadiusServerA", longArrayOf(address)).toUInt()
}

public fun AddRadiusServerW(address: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "AddRadiusServerW", longArrayOf(address)).toUInt()
}

public fun ClearPersistentIScsiDevices(): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ClearPersistentIScsiDevices", longArrayOf()).toUInt()
}

public fun GetDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetDevicesForIScsiSessionA", longArrayOf(uniquesessionid, devicecount, devices)).toUInt()
}

public fun GetDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetDevicesForIScsiSessionW", longArrayOf(uniquesessionid, devicecount, devices)).toUInt()
}

public fun GetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiIKEInfoA", longArrayOf(initiatorname, initiatorportnumber.toLong(), reserved, authinfo)).toUInt()
}

public fun GetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiIKEInfoW", longArrayOf(initiatorname, initiatorportnumber.toLong(), reserved, authinfo)).toUInt()
}

public fun GetIScsiInitiatorNodeNameA(initiatornodename: PSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiInitiatorNodeNameA", longArrayOf(initiatornodename)).toUInt()
}

public fun GetIScsiInitiatorNodeNameW(initiatornodename: PWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiInitiatorNodeNameW", longArrayOf(initiatornodename)).toUInt()
}

public fun GetIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiSessionListA", longArrayOf(buffersize, sessioncount, sessioninfo)).toUInt()
}

public fun GetIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiSessionListEx", longArrayOf(buffersize, sessioncountptr, sessioninfo)).toUInt()
}

public fun GetIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiSessionListW", longArrayOf(buffersize, sessioncount, sessioninfo)).toUInt()
}

public fun GetIScsiTargetInformationA(targetname: PCSTR, discoverymechanism: PCSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiTargetInformationA", longArrayOf(targetname, discoverymechanism, infoclass.toLong(), buffersize, buffer)).toUInt()
}

public fun GetIScsiTargetInformationW(targetname: PCWSTR, discoverymechanism: PCWSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiTargetInformationW", longArrayOf(targetname, discoverymechanism, infoclass.toLong(), buffersize, buffer)).toUInt()
}

public fun GetIScsiVersionInformation(versioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "GetIScsiVersionInformation", longArrayOf(versioninfo)).toUInt()
}

public fun LoginIScsiTargetA(targetname: PCSTR, isinformationalsession: Boolean, initiatorinstance: PCSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "LoginIScsiTargetA", longArrayOf(targetname, if (isinformationalsession) 1L else 0L, initiatorinstance, initiatorportnumber.toLong(), targetportal, securityflags.toLong(), mappings, loginoptions, keysize.toLong(), key, if (ispersistent) 1L else 0L, uniquesessionid, uniqueconnectionid)).toUInt()
}

public fun LoginIScsiTargetW(targetname: PCWSTR, isinformationalsession: Boolean, initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "LoginIScsiTargetW", longArrayOf(targetname, if (isinformationalsession) 1L else 0L, initiatorinstance, initiatorportnumber.toLong(), targetportal, securityflags.toLong(), mappings, loginoptions, keysize.toLong(), key, if (ispersistent) 1L else 0L, uniquesessionid, uniqueconnectionid)).toUInt()
}

public fun LogoutIScsiTarget(uniquesessionid: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "LogoutIScsiTarget", longArrayOf(uniquesessionid)).toUInt()
}

public fun RefreshISNSServerA(address: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RefreshISNSServerA", longArrayOf(address)).toUInt()
}

public fun RefreshISNSServerW(address: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RefreshISNSServerW", longArrayOf(address)).toUInt()
}

public fun RefreshIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RefreshIScsiSendTargetPortalA", longArrayOf(initiatorinstance, initiatorportnumber.toLong(), portal)).toUInt()
}

public fun RefreshIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RefreshIScsiSendTargetPortalW", longArrayOf(initiatorinstance, initiatorportnumber.toLong(), portal)).toUInt()
}

public fun RemoveISNSServerA(address: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveISNSServerA", longArrayOf(address)).toUInt()
}

public fun RemoveISNSServerW(address: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveISNSServerW", longArrayOf(address)).toUInt()
}

public fun RemoveIScsiConnection(uniquesessionid: Long, connectionid: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveIScsiConnection", longArrayOf(uniquesessionid, connectionid)).toUInt()
}

public fun RemoveIScsiPersistentTargetA(initiatorinstance: PCSTR, initiatorportnumber: UInt, targetname: PCSTR, portal: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveIScsiPersistentTargetA", longArrayOf(initiatorinstance, initiatorportnumber.toLong(), targetname, portal)).toUInt()
}

public fun RemoveIScsiPersistentTargetW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetname: PCWSTR, portal: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveIScsiPersistentTargetW", longArrayOf(initiatorinstance, initiatorportnumber.toLong(), targetname, portal)).toUInt()
}

public fun RemoveIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveIScsiSendTargetPortalA", longArrayOf(initiatorinstance, initiatorportnumber.toLong(), portal)).toUInt()
}

public fun RemoveIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveIScsiSendTargetPortalW", longArrayOf(initiatorinstance, initiatorportnumber.toLong(), portal)).toUInt()
}

public fun RemoveIScsiStaticTargetA(targetname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveIScsiStaticTargetA", longArrayOf(targetname)).toUInt()
}

public fun RemoveIScsiStaticTargetW(targetname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveIScsiStaticTargetW", longArrayOf(targetname)).toUInt()
}

public fun RemovePersistentIScsiDeviceA(devicepath: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemovePersistentIScsiDeviceA", longArrayOf(devicepath)).toUInt()
}

public fun RemovePersistentIScsiDeviceW(devicepath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemovePersistentIScsiDeviceW", longArrayOf(devicepath)).toUInt()
}

public fun RemoveRadiusServerA(address: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveRadiusServerA", longArrayOf(address)).toUInt()
}

public fun RemoveRadiusServerW(address: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "RemoveRadiusServerW", longArrayOf(address)).toUInt()
}

public fun ReportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportActiveIScsiTargetMappingsA", longArrayOf(buffersize, mappingcount, mappings)).toUInt()
}

public fun ReportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportActiveIScsiTargetMappingsW", longArrayOf(buffersize, mappingcount, mappings)).toUInt()
}

public fun ReportISNSServerListA(buffersizeinchar: Long, buffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportISNSServerListA", longArrayOf(buffersizeinchar, buffer)).toUInt()
}

public fun ReportISNSServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportISNSServerListW", longArrayOf(buffersizeinchar, buffer)).toUInt()
}

public fun ReportIScsiInitiatorListA(buffersize: Long, buffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiInitiatorListA", longArrayOf(buffersize, buffer)).toUInt()
}

public fun ReportIScsiInitiatorListW(buffersize: Long, buffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiInitiatorListW", longArrayOf(buffersize, buffer)).toUInt()
}

public fun ReportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiPersistentLoginsA", longArrayOf(count, persistentlogininfo, buffersizeinbytes)).toUInt()
}

public fun ReportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiPersistentLoginsW", longArrayOf(count, persistentlogininfo, buffersizeinbytes)).toUInt()
}

public fun ReportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiSendTargetPortalsA", longArrayOf(portalcount, portalinfo)).toUInt()
}

public fun ReportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiSendTargetPortalsExA", longArrayOf(portalcount, portalinfosize, portalinfo)).toUInt()
}

public fun ReportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiSendTargetPortalsExW", longArrayOf(portalcount, portalinfosize, portalinfo)).toUInt()
}

public fun ReportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiSendTargetPortalsW", longArrayOf(portalcount, portalinfo)).toUInt()
}

public fun ReportIScsiTargetPortalsA(initiatorname: PCSTR, targetname: PCSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiTargetPortalsA", longArrayOf(initiatorname, targetname, targetportaltag, elementcount, portals)).toUInt()
}

public fun ReportIScsiTargetPortalsW(initiatorname: PCWSTR, targetname: PCWSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiTargetPortalsW", longArrayOf(initiatorname, targetname, targetportaltag, elementcount, portals)).toUInt()
}

public fun ReportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiTargetsA", longArrayOf(if (forceupdate) 1L else 0L, buffersize, buffer)).toUInt()
}

public fun ReportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportIScsiTargetsW", longArrayOf(if (forceupdate) 1L else 0L, buffersize, buffer)).toUInt()
}

public fun ReportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportPersistentIScsiDevicesA", longArrayOf(buffersizeinchar, buffer)).toUInt()
}

public fun ReportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportPersistentIScsiDevicesW", longArrayOf(buffersizeinchar, buffer)).toUInt()
}

public fun ReportRadiusServerListA(buffersizeinchar: Long, buffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportRadiusServerListA", longArrayOf(buffersizeinchar, buffer)).toUInt()
}

public fun ReportRadiusServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "ReportRadiusServerListW", longArrayOf(buffersizeinchar, buffer)).toUInt()
}

public fun SendScsiInquiry(uniquesessionid: Long, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SendScsiInquiry", longArrayOf(uniquesessionid, lun.toLong(), evpdcmddt.toLong(), pagecode.toLong(), scsistatus, responsesize, responsebuffer, sensesize, sensebuffer)).toUInt()
}

public fun SendScsiReadCapacity(uniquesessionid: Long, lun: ULong, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SendScsiReadCapacity", longArrayOf(uniquesessionid, lun.toLong(), scsistatus, responsesize, responsebuffer, sensesize, sensebuffer)).toUInt()
}

public fun SendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SendScsiReportLuns", longArrayOf(uniquesessionid, scsistatus, responsesize, responsebuffer, sensesize, sensebuffer)).toUInt()
}

public fun SetIScsiGroupPresharedKey(keylength: UInt, key: Long, persist: Boolean): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiGroupPresharedKey", longArrayOf(keylength.toLong(), key, if (persist) 1L else 0L)).toUInt()
}

public fun SetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiIKEInfoA", longArrayOf(initiatorname, initiatorportnumber.toLong(), authinfo, if (persist) 1L else 0L)).toUInt()
}

public fun SetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiIKEInfoW", longArrayOf(initiatorname, initiatorportnumber.toLong(), authinfo, if (persist) 1L else 0L)).toUInt()
}

public fun SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiInitiatorCHAPSharedSecret", longArrayOf(sharedsecretlength.toLong(), sharedsecret)).toUInt()
}

public fun SetIScsiInitiatorNodeNameA(initiatornodename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiInitiatorNodeNameA", longArrayOf(initiatornodename)).toUInt()
}

public fun SetIScsiInitiatorNodeNameW(initiatornodename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiInitiatorNodeNameW", longArrayOf(initiatornodename)).toUInt()
}

public fun SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiInitiatorRADIUSSharedSecret", longArrayOf(sharedsecretlength.toLong(), sharedsecret)).toUInt()
}

public fun SetIScsiTunnelModeOuterAddressA(initiatorname: PCSTR, initiatorportnumber: UInt, destinationaddress: PCSTR, outermodeaddress: PCSTR, persist: Boolean): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiTunnelModeOuterAddressA", longArrayOf(initiatorname, initiatorportnumber.toLong(), destinationaddress, outermodeaddress, if (persist) 1L else 0L)).toUInt()
}

public fun SetIScsiTunnelModeOuterAddressW(initiatorname: PCWSTR, initiatorportnumber: UInt, destinationaddress: PCWSTR, outermodeaddress: PCWSTR, persist: Boolean): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetIScsiTunnelModeOuterAddressW", longArrayOf(initiatorname, initiatorportnumber.toLong(), destinationaddress, outermodeaddress, if (persist) 1L else 0L)).toUInt()
}

public fun SetupPersistentIScsiDevices(): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetupPersistentIScsiDevices", longArrayOf()).toUInt()
}

public fun SetupPersistentIScsiVolumes(): UInt {
    return Win32DynamicFfi.invoke("iscsidsc.dll", "SetupPersistentIScsiVolumes", longArrayOf()).toUInt()
}
