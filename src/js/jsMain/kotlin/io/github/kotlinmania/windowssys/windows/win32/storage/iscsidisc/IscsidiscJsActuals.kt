@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private val _windowsWin32StorageIscsidiscNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddISNSServerA(address: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddISNSServerA(address.toString()) as Int).toUInt() else 0u

public actual fun AddISNSServerW(address: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddISNSServerW(address.toString()) as Int).toUInt() else 0u

public actual fun AddIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA(uniquesessionid.toString(), reserved.toString(), initiatorportnumber.toInt(), targetportal.toString(), securityflags.toString(), loginoptions.toString(), keysize.toInt(), key.toString(), connectionid.toString()) as Int).toUInt() else 0u

public actual fun AddIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW(uniquesessionid.toString(), reserved.toString(), initiatorportnumber.toInt(), targetportal.toString(), securityflags.toString(), loginoptions.toString(), keysize.toInt(), key.toString(), connectionid.toString()) as Int).toUInt() else 0u

public actual fun AddIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA(initiatorinstance.toString(), initiatorportnumber.toInt(), loginoptions.toString(), securityflags.toString(), portal.toString()) as Int).toUInt() else 0u

public actual fun AddIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW(initiatorinstance.toString(), initiatorportnumber.toInt(), loginoptions.toString(), securityflags.toString(), portal.toString()) as Int).toUInt() else 0u

public actual fun AddIScsiStaticTargetA(targetname: PCSTR, targetalias: PCSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA(targetname.toString(), targetalias.toString(), targetflags.toInt(), persist, mappings.toString(), loginoptions.toString(), portalgroup.toString()) as Int).toUInt() else 0u

public actual fun AddIScsiStaticTargetW(targetname: PCWSTR, targetalias: PCWSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW(targetname.toString(), targetalias.toString(), targetflags.toInt(), persist, mappings.toString(), loginoptions.toString(), portalgroup.toString()) as Int).toUInt() else 0u

public actual fun AddPersistentIScsiDeviceA(devicepath: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA(devicepath.toString()) as Int).toUInt() else 0u

public actual fun AddPersistentIScsiDeviceW(devicepath: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW(devicepath.toString()) as Int).toUInt() else 0u

public actual fun AddRadiusServerA(address: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA(address.toString()) as Int).toUInt() else 0u

public actual fun AddRadiusServerW(address: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW(address.toString()) as Int).toUInt() else 0u

public actual fun ClearPersistentIScsiDevices(): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices() as Int).toUInt() else 0u

public actual fun GetDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA(uniquesessionid.toString(), devicecount.toString(), devices.toString()) as Int).toUInt() else 0u

public actual fun GetDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW(uniquesessionid.toString(), devicecount.toString(), devices.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA(initiatorname.toString(), initiatorportnumber.toInt(), reserved.toString(), authinfo.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW(initiatorname.toString(), initiatorportnumber.toInt(), reserved.toString(), authinfo.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiInitiatorNodeNameA(initiatornodename: PSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA(initiatornodename.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiInitiatorNodeNameW(initiatornodename: PWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW(initiatornodename.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA(buffersize.toString(), sessioncount.toString(), sessioninfo.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx(buffersize.toString(), sessioncountptr.toString(), sessioninfo.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW(buffersize.toString(), sessioncount.toString(), sessioninfo.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiTargetInformationA(targetname: PCSTR, discoverymechanism: PCSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA(targetname.toString(), discoverymechanism.toString(), infoclass, buffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiTargetInformationW(targetname: PCWSTR, discoverymechanism: PCWSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW(targetname.toString(), discoverymechanism.toString(), infoclass, buffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun GetIScsiVersionInformation(versioninfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation(versioninfo.toString()) as Int).toUInt() else 0u

public actual fun LoginIScsiTargetA(targetname: PCSTR, isinformationalsession: Boolean, initiatorinstance: PCSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA(targetname.toString(), isinformationalsession, initiatorinstance.toString(), initiatorportnumber.toInt(), targetportal.toString(), securityflags.toString(), mappings.toString(), loginoptions.toString(), keysize.toInt(), key.toString(), ispersistent, uniquesessionid.toString(), uniqueconnectionid.toString()) as Int).toUInt() else 0u

public actual fun LoginIScsiTargetW(targetname: PCWSTR, isinformationalsession: Boolean, initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW(targetname.toString(), isinformationalsession, initiatorinstance.toString(), initiatorportnumber.toInt(), targetportal.toString(), securityflags.toString(), mappings.toString(), loginoptions.toString(), keysize.toInt(), key.toString(), ispersistent, uniquesessionid.toString(), uniqueconnectionid.toString()) as Int).toUInt() else 0u

public actual fun LogoutIScsiTarget(uniquesessionid: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget(uniquesessionid.toString()) as Int).toUInt() else 0u

public actual fun RefreshISNSServerA(address: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA(address.toString()) as Int).toUInt() else 0u

public actual fun RefreshISNSServerW(address: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW(address.toString()) as Int).toUInt() else 0u

public actual fun RefreshIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA(initiatorinstance.toString(), initiatorportnumber.toInt(), portal.toString()) as Int).toUInt() else 0u

public actual fun RefreshIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW(initiatorinstance.toString(), initiatorportnumber.toInt(), portal.toString()) as Int).toUInt() else 0u

public actual fun RemoveISNSServerA(address: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA(address.toString()) as Int).toUInt() else 0u

public actual fun RemoveISNSServerW(address: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW(address.toString()) as Int).toUInt() else 0u

public actual fun RemoveIScsiConnection(uniquesessionid: Long, connectionid: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection(uniquesessionid.toString(), connectionid.toString()) as Int).toUInt() else 0u

public actual fun RemoveIScsiPersistentTargetA(initiatorinstance: PCSTR, initiatorportnumber: UInt, targetname: PCSTR, portal: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA(initiatorinstance.toString(), initiatorportnumber.toInt(), targetname.toString(), portal.toString()) as Int).toUInt() else 0u

public actual fun RemoveIScsiPersistentTargetW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetname: PCWSTR, portal: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW(initiatorinstance.toString(), initiatorportnumber.toInt(), targetname.toString(), portal.toString()) as Int).toUInt() else 0u

public actual fun RemoveIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA(initiatorinstance.toString(), initiatorportnumber.toInt(), portal.toString()) as Int).toUInt() else 0u

public actual fun RemoveIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW(initiatorinstance.toString(), initiatorportnumber.toInt(), portal.toString()) as Int).toUInt() else 0u

public actual fun RemoveIScsiStaticTargetA(targetname: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA(targetname.toString()) as Int).toUInt() else 0u

public actual fun RemoveIScsiStaticTargetW(targetname: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW(targetname.toString()) as Int).toUInt() else 0u

public actual fun RemovePersistentIScsiDeviceA(devicepath: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA(devicepath.toString()) as Int).toUInt() else 0u

public actual fun RemovePersistentIScsiDeviceW(devicepath: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW(devicepath.toString()) as Int).toUInt() else 0u

public actual fun RemoveRadiusServerA(address: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA(address.toString()) as Int).toUInt() else 0u

public actual fun RemoveRadiusServerW(address: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW(address.toString()) as Int).toUInt() else 0u

public actual fun ReportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA(buffersize.toString(), mappingcount.toString(), mappings.toString()) as Int).toUInt() else 0u

public actual fun ReportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW(buffersize.toString(), mappingcount.toString(), mappings.toString()) as Int).toUInt() else 0u

public actual fun ReportISNSServerListA(buffersizeinchar: Long, buffer: PSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA(buffersizeinchar.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportISNSServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW(buffersizeinchar.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiInitiatorListA(buffersize: Long, buffer: PSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA(buffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiInitiatorListW(buffersize: Long, buffer: PWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW(buffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA(count.toString(), persistentlogininfo.toString(), buffersizeinbytes.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW(count.toString(), persistentlogininfo.toString(), buffersizeinbytes.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA(portalcount.toString(), portalinfo.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA(portalcount.toString(), portalinfosize.toString(), portalinfo.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW(portalcount.toString(), portalinfosize.toString(), portalinfo.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW(portalcount.toString(), portalinfo.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiTargetPortalsA(initiatorname: PCSTR, targetname: PCSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA(initiatorname.toString(), targetname.toString(), targetportaltag.toString(), elementcount.toString(), portals.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiTargetPortalsW(initiatorname: PCWSTR, targetname: PCWSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW(initiatorname.toString(), targetname.toString(), targetportaltag.toString(), elementcount.toString(), portals.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: PSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA(forceupdate, buffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: PWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW(forceupdate, buffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: PSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA(buffersizeinchar.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW(buffersizeinchar.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportRadiusServerListA(buffersizeinchar: Long, buffer: PSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA(buffersizeinchar.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun ReportRadiusServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW(buffersizeinchar.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun SendScsiInquiry(uniquesessionid: Long, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry(uniquesessionid.toString(), lun.toString(), evpdcmddt.toInt(), pagecode.toInt(), scsistatus.toString(), responsesize.toString(), responsebuffer.toString(), sensesize.toString(), sensebuffer.toString()) as Int).toUInt() else 0u

public actual fun SendScsiReadCapacity(uniquesessionid: Long, lun: ULong, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity(uniquesessionid.toString(), lun.toString(), scsistatus.toString(), responsesize.toString(), responsebuffer.toString(), sensesize.toString(), sensebuffer.toString()) as Int).toUInt() else 0u

public actual fun SendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns(uniquesessionid.toString(), scsistatus.toString(), responsesize.toString(), responsebuffer.toString(), sensesize.toString(), sensebuffer.toString()) as Int).toUInt() else 0u

public actual fun SetIScsiGroupPresharedKey(keylength: UInt, key: Long, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey(keylength.toInt(), key.toString(), persist) as Int).toUInt() else 0u

public actual fun SetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA(initiatorname.toString(), initiatorportnumber.toInt(), authinfo.toString(), persist) as Int).toUInt() else 0u

public actual fun SetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW(initiatorname.toString(), initiatorportnumber.toInt(), authinfo.toString(), persist) as Int).toUInt() else 0u

public actual fun SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength.toInt(), sharedsecret.toString()) as Int).toUInt() else 0u

public actual fun SetIScsiInitiatorNodeNameA(initiatornodename: PCSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA(initiatornodename.toString()) as Int).toUInt() else 0u

public actual fun SetIScsiInitiatorNodeNameW(initiatornodename: PCWSTR): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW(initiatornodename.toString()) as Int).toUInt() else 0u

public actual fun SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength.toInt(), sharedsecret.toString()) as Int).toUInt() else 0u

public actual fun SetIScsiTunnelModeOuterAddressA(initiatorname: PCSTR, initiatorportnumber: UInt, destinationaddress: PCSTR, outermodeaddress: PCSTR, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA(initiatorname.toString(), initiatorportnumber.toInt(), destinationaddress.toString(), outermodeaddress.toString(), persist) as Int).toUInt() else 0u

public actual fun SetIScsiTunnelModeOuterAddressW(initiatorname: PCWSTR, initiatorportnumber: UInt, destinationaddress: PCWSTR, outermodeaddress: PCWSTR, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW(initiatorname.toString(), initiatorportnumber.toInt(), destinationaddress.toString(), outermodeaddress.toString(), persist) as Int).toUInt() else 0u

public actual fun SetupPersistentIScsiDevices(): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices() as Int).toUInt() else 0u

public actual fun SetupPersistentIScsiVolumes(): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes() as Int).toUInt() else 0u
