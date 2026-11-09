@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun AddISNSServerA(address: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddISNSServerA(address.toCPointer<ByteVar>())

public actual fun AddISNSServerW(address: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddISNSServerW(address.toCPointer<ByteVar>())

public actual fun AddIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA(uniquesessionid.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), initiatorportnumber, targetportal.toCPointer<ByteVar>(), securityflags, loginoptions.toCPointer<ByteVar>(), keysize, key.toCPointer<ByteVar>(), connectionid.toCPointer<ByteVar>())

public actual fun AddIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW(uniquesessionid.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), initiatorportnumber, targetportal.toCPointer<ByteVar>(), securityflags, loginoptions.toCPointer<ByteVar>(), keysize, key.toCPointer<ByteVar>(), connectionid.toCPointer<ByteVar>())

public actual fun AddIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA(initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, loginoptions.toCPointer<ByteVar>(), securityflags, portal.toCPointer<ByteVar>())

public actual fun AddIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW(initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, loginoptions.toCPointer<ByteVar>(), securityflags, portal.toCPointer<ByteVar>())

public actual fun AddIScsiStaticTargetA(targetname: PCSTR, targetalias: PCSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA(targetname.toCPointer<ByteVar>(), targetalias.toCPointer<ByteVar>(), targetflags, persist, mappings.toCPointer<ByteVar>(), loginoptions.toCPointer<ByteVar>(), portalgroup.toCPointer<ByteVar>())

public actual fun AddIScsiStaticTargetW(targetname: PCWSTR, targetalias: PCWSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW(targetname.toCPointer<ByteVar>(), targetalias.toCPointer<ByteVar>(), targetflags, persist, mappings.toCPointer<ByteVar>(), loginoptions.toCPointer<ByteVar>(), portalgroup.toCPointer<ByteVar>())

public actual fun AddPersistentIScsiDeviceA(devicepath: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA(devicepath.toCPointer<ByteVar>())

public actual fun AddPersistentIScsiDeviceW(devicepath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW(devicepath.toCPointer<ByteVar>())

public actual fun AddRadiusServerA(address: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA(address.toCPointer<ByteVar>())

public actual fun AddRadiusServerW(address: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW(address.toCPointer<ByteVar>())

public actual fun ClearPersistentIScsiDevices(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices()

public actual fun GetDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA(uniquesessionid.toCPointer<ByteVar>(), devicecount.toCPointer<ByteVar>(), devices.toCPointer<ByteVar>())

public actual fun GetDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW(uniquesessionid.toCPointer<ByteVar>(), devicecount.toCPointer<ByteVar>(), devices.toCPointer<ByteVar>())

public actual fun GetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA(initiatorname.toCPointer<ByteVar>(), initiatorportnumber, reserved.toCPointer<ByteVar>(), authinfo.toCPointer<ByteVar>())

public actual fun GetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW(initiatorname.toCPointer<ByteVar>(), initiatorportnumber, reserved.toCPointer<ByteVar>(), authinfo.toCPointer<ByteVar>())

public actual fun GetIScsiInitiatorNodeNameA(initiatornodename: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA(initiatornodename.toCPointer<ByteVar>())

public actual fun GetIScsiInitiatorNodeNameW(initiatornodename: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW(initiatornodename.toCPointer<ByteVar>())

public actual fun GetIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA(buffersize.toCPointer<ByteVar>(), sessioncount.toCPointer<ByteVar>(), sessioninfo.toCPointer<ByteVar>())

public actual fun GetIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx(buffersize.toCPointer<ByteVar>(), sessioncountptr.toCPointer<ByteVar>(), sessioninfo.toCPointer<ByteVar>())

public actual fun GetIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW(buffersize.toCPointer<ByteVar>(), sessioncount.toCPointer<ByteVar>(), sessioninfo.toCPointer<ByteVar>())

public actual fun GetIScsiTargetInformationA(targetname: PCSTR, discoverymechanism: PCSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA(targetname.toCPointer<ByteVar>(), discoverymechanism.toCPointer<ByteVar>(), infoclass, buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun GetIScsiTargetInformationW(targetname: PCWSTR, discoverymechanism: PCWSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW(targetname.toCPointer<ByteVar>(), discoverymechanism.toCPointer<ByteVar>(), infoclass, buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun GetIScsiVersionInformation(versioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation(versioninfo.toCPointer<ByteVar>())

public actual fun LoginIScsiTargetA(targetname: PCSTR, isinformationalsession: Boolean, initiatorinstance: PCSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA(targetname.toCPointer<ByteVar>(), isinformationalsession, initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, targetportal.toCPointer<ByteVar>(), securityflags, mappings.toCPointer<ByteVar>(), loginoptions.toCPointer<ByteVar>(), keysize, key.toCPointer<ByteVar>(), ispersistent, uniquesessionid.toCPointer<ByteVar>(), uniqueconnectionid.toCPointer<ByteVar>())

public actual fun LoginIScsiTargetW(targetname: PCWSTR, isinformationalsession: Boolean, initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW(targetname.toCPointer<ByteVar>(), isinformationalsession, initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, targetportal.toCPointer<ByteVar>(), securityflags, mappings.toCPointer<ByteVar>(), loginoptions.toCPointer<ByteVar>(), keysize, key.toCPointer<ByteVar>(), ispersistent, uniquesessionid.toCPointer<ByteVar>(), uniqueconnectionid.toCPointer<ByteVar>())

public actual fun LogoutIScsiTarget(uniquesessionid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget(uniquesessionid.toCPointer<ByteVar>())

public actual fun RefreshISNSServerA(address: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA(address.toCPointer<ByteVar>())

public actual fun RefreshISNSServerW(address: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW(address.toCPointer<ByteVar>())

public actual fun RefreshIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA(initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, portal.toCPointer<ByteVar>())

public actual fun RefreshIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW(initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, portal.toCPointer<ByteVar>())

public actual fun RemoveISNSServerA(address: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA(address.toCPointer<ByteVar>())

public actual fun RemoveISNSServerW(address: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW(address.toCPointer<ByteVar>())

public actual fun RemoveIScsiConnection(uniquesessionid: Long, connectionid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection(uniquesessionid.toCPointer<ByteVar>(), connectionid.toCPointer<ByteVar>())

public actual fun RemoveIScsiPersistentTargetA(initiatorinstance: PCSTR, initiatorportnumber: UInt, targetname: PCSTR, portal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA(initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, targetname.toCPointer<ByteVar>(), portal.toCPointer<ByteVar>())

public actual fun RemoveIScsiPersistentTargetW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetname: PCWSTR, portal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW(initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, targetname.toCPointer<ByteVar>(), portal.toCPointer<ByteVar>())

public actual fun RemoveIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA(initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, portal.toCPointer<ByteVar>())

public actual fun RemoveIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW(initiatorinstance.toCPointer<ByteVar>(), initiatorportnumber, portal.toCPointer<ByteVar>())

public actual fun RemoveIScsiStaticTargetA(targetname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA(targetname.toCPointer<ByteVar>())

public actual fun RemoveIScsiStaticTargetW(targetname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW(targetname.toCPointer<ByteVar>())

public actual fun RemovePersistentIScsiDeviceA(devicepath: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA(devicepath.toCPointer<ByteVar>())

public actual fun RemovePersistentIScsiDeviceW(devicepath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW(devicepath.toCPointer<ByteVar>())

public actual fun RemoveRadiusServerA(address: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA(address.toCPointer<ByteVar>())

public actual fun RemoveRadiusServerW(address: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW(address.toCPointer<ByteVar>())

public actual fun ReportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA(buffersize.toCPointer<ByteVar>(), mappingcount.toCPointer<ByteVar>(), mappings.toCPointer<ByteVar>())

public actual fun ReportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW(buffersize.toCPointer<ByteVar>(), mappingcount.toCPointer<ByteVar>(), mappings.toCPointer<ByteVar>())

public actual fun ReportISNSServerListA(buffersizeinchar: Long, buffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA(buffersizeinchar.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportISNSServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW(buffersizeinchar.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportIScsiInitiatorListA(buffersize: Long, buffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA(buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportIScsiInitiatorListW(buffersize: Long, buffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW(buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA(count.toCPointer<ByteVar>(), persistentlogininfo.toCPointer<ByteVar>(), buffersizeinbytes.toCPointer<ByteVar>())

public actual fun ReportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW(count.toCPointer<ByteVar>(), persistentlogininfo.toCPointer<ByteVar>(), buffersizeinbytes.toCPointer<ByteVar>())

public actual fun ReportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA(portalcount.toCPointer<ByteVar>(), portalinfo.toCPointer<ByteVar>())

public actual fun ReportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA(portalcount.toCPointer<ByteVar>(), portalinfosize.toCPointer<ByteVar>(), portalinfo.toCPointer<ByteVar>())

public actual fun ReportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW(portalcount.toCPointer<ByteVar>(), portalinfosize.toCPointer<ByteVar>(), portalinfo.toCPointer<ByteVar>())

public actual fun ReportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW(portalcount.toCPointer<ByteVar>(), portalinfo.toCPointer<ByteVar>())

public actual fun ReportIScsiTargetPortalsA(initiatorname: PCSTR, targetname: PCSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA(initiatorname.toCPointer<ByteVar>(), targetname.toCPointer<ByteVar>(), targetportaltag.toCPointer<ByteVar>(), elementcount.toCPointer<ByteVar>(), portals.toCPointer<ByteVar>())

public actual fun ReportIScsiTargetPortalsW(initiatorname: PCWSTR, targetname: PCWSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW(initiatorname.toCPointer<ByteVar>(), targetname.toCPointer<ByteVar>(), targetportaltag.toCPointer<ByteVar>(), elementcount.toCPointer<ByteVar>(), portals.toCPointer<ByteVar>())

public actual fun ReportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA(forceupdate, buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW(forceupdate, buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA(buffersizeinchar.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW(buffersizeinchar.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportRadiusServerListA(buffersizeinchar: Long, buffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA(buffersizeinchar.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ReportRadiusServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW(buffersizeinchar.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun SendScsiInquiry(uniquesessionid: Long, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry(uniquesessionid.toCPointer<ByteVar>(), lun, evpdcmddt, pagecode, scsistatus.toCPointer<ByteVar>(), responsesize.toCPointer<ByteVar>(), responsebuffer.toCPointer<ByteVar>(), sensesize.toCPointer<ByteVar>(), sensebuffer.toCPointer<ByteVar>())

public actual fun SendScsiReadCapacity(uniquesessionid: Long, lun: ULong, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity(uniquesessionid.toCPointer<ByteVar>(), lun, scsistatus.toCPointer<ByteVar>(), responsesize.toCPointer<ByteVar>(), responsebuffer.toCPointer<ByteVar>(), sensesize.toCPointer<ByteVar>(), sensebuffer.toCPointer<ByteVar>())

public actual fun SendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns(uniquesessionid.toCPointer<ByteVar>(), scsistatus.toCPointer<ByteVar>(), responsesize.toCPointer<ByteVar>(), responsebuffer.toCPointer<ByteVar>(), sensesize.toCPointer<ByteVar>(), sensebuffer.toCPointer<ByteVar>())

public actual fun SetIScsiGroupPresharedKey(keylength: UInt, key: Long, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey(keylength, key.toCPointer<ByteVar>(), persist)

public actual fun SetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA(initiatorname.toCPointer<ByteVar>(), initiatorportnumber, authinfo.toCPointer<ByteVar>(), persist)

public actual fun SetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW(initiatorname.toCPointer<ByteVar>(), initiatorportnumber, authinfo.toCPointer<ByteVar>(), persist)

public actual fun SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength, sharedsecret.toCPointer<ByteVar>())

public actual fun SetIScsiInitiatorNodeNameA(initiatornodename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA(initiatornodename.toCPointer<ByteVar>())

public actual fun SetIScsiInitiatorNodeNameW(initiatornodename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW(initiatornodename.toCPointer<ByteVar>())

public actual fun SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength, sharedsecret.toCPointer<ByteVar>())

public actual fun SetIScsiTunnelModeOuterAddressA(initiatorname: PCSTR, initiatorportnumber: UInt, destinationaddress: PCSTR, outermodeaddress: PCSTR, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA(initiatorname.toCPointer<ByteVar>(), initiatorportnumber, destinationaddress.toCPointer<ByteVar>(), outermodeaddress.toCPointer<ByteVar>(), persist)

public actual fun SetIScsiTunnelModeOuterAddressW(initiatorname: PCWSTR, initiatorportnumber: UInt, destinationaddress: PCWSTR, outermodeaddress: PCWSTR, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW(initiatorname.toCPointer<ByteVar>(), initiatorportnumber, destinationaddress.toCPointer<ByteVar>(), outermodeaddress.toCPointer<ByteVar>(), persist)

public actual fun SetupPersistentIScsiDevices(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices()

public actual fun SetupPersistentIScsiVolumes(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes()
