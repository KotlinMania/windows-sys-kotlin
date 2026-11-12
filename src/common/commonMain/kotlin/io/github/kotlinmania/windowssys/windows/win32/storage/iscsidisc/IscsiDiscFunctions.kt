package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun addISNSServerA(address: Pcstr): UInt

public expect fun addISNSServerW(address: Pcwstr): UInt

public expect fun addIScsiConnectionA(uniquesessionid: MutPtr<IscsiUniqueSessionId>, reserved: MutPtr<CVoid>, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortala>, securityflags: ULong, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, connectionid: MutPtr<IscsiUniqueSessionId>): UInt

public expect fun addIScsiConnectionW(uniquesessionid: MutPtr<IscsiUniqueSessionId>, reserved: MutPtr<CVoid>, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortalw>, securityflags: ULong, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, connectionid: MutPtr<IscsiUniqueSessionId>): UInt

public expect fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: MutPtr<IscsiLoginOptions>, securityflags: ULong, portal: MutPtr<IscsiTargetPortala>): UInt

public expect fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: MutPtr<IscsiLoginOptions>, securityflags: ULong, portal: MutPtr<IscsiTargetPortalw>): UInt

public expect fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: MutPtr<IscsiTargetMappinga>, loginoptions: MutPtr<IscsiLoginOptions>, portalgroup: MutPtr<IscsiTargetPortalGroupa>): UInt

public expect fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: MutPtr<IscsiTargetMappingw>, loginoptions: MutPtr<IscsiLoginOptions>, portalgroup: MutPtr<IscsiTargetPortalGroupw>): UInt

public expect fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt

public expect fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt

public expect fun addRadiusServerA(address: Pcstr): UInt

public expect fun addRadiusServerW(address: Pcwstr): UInt

public expect fun clearPersistentIScsiDevices(): UInt

public expect fun getDevicesForIScsiSessionA(uniquesessionid: MutPtr<IscsiUniqueSessionId>, devicecount: MutPtr<UInt>, devices: MutPtr<IscsiDeviceOnSessiona>): UInt

public expect fun getDevicesForIScsiSessionW(uniquesessionid: MutPtr<IscsiUniqueSessionId>, devicecount: MutPtr<UInt>, devices: MutPtr<IscsiDeviceOnSessionw>): UInt

public expect fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: MutPtr<UInt>, authinfo: MutPtr<IkeAuthenticationInformation>): UInt

public expect fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: MutPtr<UInt>, authinfo: MutPtr<IkeAuthenticationInformation>): UInt

public expect fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt

public expect fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt

public expect fun getIScsiSessionListA(buffersize: MutPtr<UInt>, sessioncount: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfoa>): UInt

public expect fun getIScsiSessionListEx(buffersize: MutPtr<UInt>, sessioncountptr: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfoEx>): UInt

public expect fun getIScsiSessionListW(buffersize: MutPtr<UInt>, sessioncount: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfow>): UInt

public expect fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt

public expect fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt

public expect fun getIScsiVersionInformation(versioninfo: MutPtr<IscsiVersionInfo>): UInt

public expect fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortala>, securityflags: ULong, mappings: MutPtr<IscsiTargetMappinga>, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr<IscsiUniqueSessionId>, uniqueconnectionid: MutPtr<IscsiUniqueSessionId>): UInt

public expect fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortalw>, securityflags: ULong, mappings: MutPtr<IscsiTargetMappingw>, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr<IscsiUniqueSessionId>, uniqueconnectionid: MutPtr<IscsiUniqueSessionId>): UInt

public expect fun logoutIScsiTarget(uniquesessionid: MutPtr<IscsiUniqueSessionId>): UInt

public expect fun refreshISNSServerA(address: Pcstr): UInt

public expect fun refreshISNSServerW(address: Pcwstr): UInt

public expect fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortala>): UInt

public expect fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortalw>): UInt

public expect fun removeISNSServerA(address: Pcstr): UInt

public expect fun removeISNSServerW(address: Pcwstr): UInt

public expect fun removeIScsiConnection(uniquesessionid: MutPtr<IscsiUniqueSessionId>, connectionid: MutPtr<IscsiUniqueSessionId>): UInt

public expect fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: MutPtr<IscsiTargetPortala>): UInt

public expect fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: MutPtr<IscsiTargetPortalw>): UInt

public expect fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortala>): UInt

public expect fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortalw>): UInt

public expect fun removeIScsiStaticTargetA(targetname: Pcstr): UInt

public expect fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt

public expect fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt

public expect fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt

public expect fun removeRadiusServerA(address: Pcstr): UInt

public expect fun removeRadiusServerW(address: Pcwstr): UInt

public expect fun reportActiveIScsiTargetMappingsA(buffersize: MutPtr<UInt>, mappingcount: MutPtr<UInt>, mappings: MutPtr<IscsiTargetMappinga>): UInt

public expect fun reportActiveIScsiTargetMappingsW(buffersize: MutPtr<UInt>, mappingcount: MutPtr<UInt>, mappings: MutPtr<IscsiTargetMappingw>): UInt

public expect fun reportISNSServerListA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt

public expect fun reportISNSServerListW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt

public expect fun reportIScsiInitiatorListA(buffersize: MutPtr<UInt>, buffer: Pstr): UInt

public expect fun reportIScsiInitiatorListW(buffersize: MutPtr<UInt>, buffer: Pwstr): UInt

public expect fun reportIScsiPersistentLoginsA(count: MutPtr<UInt>, persistentlogininfo: MutPtr<PersistentIscsiLoginInfoa>, buffersizeinbytes: MutPtr<UInt>): UInt

public expect fun reportIScsiPersistentLoginsW(count: MutPtr<UInt>, persistentlogininfo: MutPtr<PersistentIscsiLoginInfow>, buffersizeinbytes: MutPtr<UInt>): UInt

public expect fun reportIScsiSendTargetPortalsA(portalcount: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoa>): UInt

public expect fun reportIScsiSendTargetPortalsExA(portalcount: MutPtr<UInt>, portalinfosize: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoExa>): UInt

public expect fun reportIScsiSendTargetPortalsExW(portalcount: MutPtr<UInt>, portalinfosize: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoExw>): UInt

public expect fun reportIScsiSendTargetPortalsW(portalcount: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfow>): UInt

public expect fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: MutPtr<UShort>, elementcount: MutPtr<UInt>, portals: MutPtr<IscsiTargetPortala>): UInt

public expect fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: MutPtr<UShort>, elementcount: MutPtr<UInt>, portals: MutPtr<IscsiTargetPortalw>): UInt

public expect fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: MutPtr<UInt>, buffer: Pstr): UInt

public expect fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: MutPtr<UInt>, buffer: Pwstr): UInt

public expect fun reportPersistentIScsiDevicesA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt

public expect fun reportPersistentIScsiDevicesW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt

public expect fun reportRadiusServerListA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt

public expect fun reportRadiusServerListW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt

public expect fun sendScsiInquiry(uniquesessionid: MutPtr<IscsiUniqueSessionId>, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt

public expect fun sendScsiReadCapacity(uniquesessionid: MutPtr<IscsiUniqueSessionId>, lun: ULong, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt

public expect fun sendScsiReportLuns(uniquesessionid: MutPtr<IscsiUniqueSessionId>, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt

public expect fun setIScsiGroupPresharedKey(keylength: UInt, key: MutPtr<UByte>, persist: Boolean): UInt

public expect fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: MutPtr<IkeAuthenticationInformation>, persist: Boolean): UInt

public expect fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: MutPtr<IkeAuthenticationInformation>, persist: Boolean): UInt

public expect fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr<UByte>): UInt

public expect fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt

public expect fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt

public expect fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr<UByte>): UInt

public expect fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt

public expect fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt

public expect fun setupPersistentIScsiDevices(): UInt

public expect fun setupPersistentIScsiVolumes(): UInt
