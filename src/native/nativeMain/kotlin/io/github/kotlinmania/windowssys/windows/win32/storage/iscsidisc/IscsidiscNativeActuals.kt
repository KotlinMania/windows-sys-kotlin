@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addISNSServerA(address: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addISNSServerA(address?.value?.toCPointer<ByteVar>())

public actual fun addISNSServerW(address: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addISNSServerW(address?.value?.toCPointer<ByteVar>())

public actual fun addIScsiConnectionA(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionA(uniquesessionid?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>(), initiatorportnumber, targetportal?.value?.toCPointer<ByteVar>(), securityflags, loginoptions?.value?.toCPointer<ByteVar>(), keysize, key?.value?.toCPointer<ByteVar>(), connectionid?.value?.toCPointer<ByteVar>())

public actual fun addIScsiConnectionW(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionW(uniquesessionid?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>(), initiatorportnumber, targetportal?.value?.toCPointer<ByteVar>(), securityflags, loginoptions?.value?.toCPointer<ByteVar>(), keysize, key?.value?.toCPointer<ByteVar>(), connectionid?.value?.toCPointer<ByteVar>())

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalA(initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, loginoptions?.value?.toCPointer<ByteVar>(), securityflags, portal?.value?.toCPointer<ByteVar>())

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalW(initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, loginoptions?.value?.toCPointer<ByteVar>(), securityflags, portal?.value?.toCPointer<ByteVar>())

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetA(targetname?.value?.toCPointer<ByteVar>(), targetalias?.value?.toCPointer<ByteVar>(), targetflags, persist, mappings?.value?.toCPointer<ByteVar>(), loginoptions?.value?.toCPointer<ByteVar>(), portalgroup?.value?.toCPointer<ByteVar>())

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetW(targetname?.value?.toCPointer<ByteVar>(), targetalias?.value?.toCPointer<ByteVar>(), targetflags, persist, mappings?.value?.toCPointer<ByteVar>(), loginoptions?.value?.toCPointer<ByteVar>(), portalgroup?.value?.toCPointer<ByteVar>())

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceA(devicepath?.value?.toCPointer<ByteVar>())

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceW(devicepath?.value?.toCPointer<ByteVar>())

public actual fun addRadiusServerA(address: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addRadiusServerA(address?.value?.toCPointer<ByteVar>())

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_addRadiusServerW(address?.value?.toCPointer<ByteVar>())

public actual fun clearPersistentIScsiDevices(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_clearPersistentIScsiDevices()

public actual fun getDevicesForIScsiSessionA(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionA(uniquesessionid?.value?.toCPointer<ByteVar>(), devicecount?.value?.toCPointer<ByteVar>(), devices?.value?.toCPointer<ByteVar>())

public actual fun getDevicesForIScsiSessionW(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionW(uniquesessionid?.value?.toCPointer<ByteVar>(), devicecount?.value?.toCPointer<ByteVar>(), devices?.value?.toCPointer<ByteVar>())

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoA(initiatorname?.value?.toCPointer<ByteVar>(), initiatorportnumber, reserved?.value?.toCPointer<ByteVar>(), authinfo?.value?.toCPointer<ByteVar>())

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoW(initiatorname?.value?.toCPointer<ByteVar>(), initiatorportnumber, reserved?.value?.toCPointer<ByteVar>(), authinfo?.value?.toCPointer<ByteVar>())

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameA(initiatornodename?.value?.toCPointer<ByteVar>())

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameW(initiatornodename?.value?.toCPointer<ByteVar>())

public actual fun getIScsiSessionListA(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListA(buffersize?.value?.toCPointer<ByteVar>(), sessioncount?.value?.toCPointer<ByteVar>(), sessioninfo?.value?.toCPointer<ByteVar>())

public actual fun getIScsiSessionListEx(buffersize: COpaquePointer?, sessioncountptr: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListEx(buffersize?.value?.toCPointer<ByteVar>(), sessioncountptr?.value?.toCPointer<ByteVar>(), sessioninfo?.value?.toCPointer<ByteVar>())

public actual fun getIScsiSessionListW(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListW(buffersize?.value?.toCPointer<ByteVar>(), sessioncount?.value?.toCPointer<ByteVar>(), sessioninfo?.value?.toCPointer<ByteVar>())

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationA(targetname?.value?.toCPointer<ByteVar>(), discoverymechanism?.value?.toCPointer<ByteVar>(), infoclass, buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationW(targetname?.value?.toCPointer<ByteVar>(), discoverymechanism?.value?.toCPointer<ByteVar>(), infoclass, buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun getIScsiVersionInformation(versioninfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_getIScsiVersionInformation(versioninfo?.value?.toCPointer<ByteVar>())

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetA(targetname?.value?.toCPointer<ByteVar>(), isinformationalsession, initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, targetportal?.value?.toCPointer<ByteVar>(), securityflags, mappings?.value?.toCPointer<ByteVar>(), loginoptions?.value?.toCPointer<ByteVar>(), keysize, key?.value?.toCPointer<ByteVar>(), ispersistent, uniquesessionid?.value?.toCPointer<ByteVar>(), uniqueconnectionid?.value?.toCPointer<ByteVar>())

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetW(targetname?.value?.toCPointer<ByteVar>(), isinformationalsession, initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, targetportal?.value?.toCPointer<ByteVar>(), securityflags, mappings?.value?.toCPointer<ByteVar>(), loginoptions?.value?.toCPointer<ByteVar>(), keysize, key?.value?.toCPointer<ByteVar>(), ispersistent, uniquesessionid?.value?.toCPointer<ByteVar>(), uniqueconnectionid?.value?.toCPointer<ByteVar>())

public actual fun logoutIScsiTarget(uniquesessionid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_logoutIScsiTarget(uniquesessionid?.value?.toCPointer<ByteVar>())

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_refreshISNSServerA(address?.value?.toCPointer<ByteVar>())

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_refreshISNSServerW(address?.value?.toCPointer<ByteVar>())

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalA(initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, portal?.value?.toCPointer<ByteVar>())

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalW(initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, portal?.value?.toCPointer<ByteVar>())

public actual fun removeISNSServerA(address: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeISNSServerA(address?.value?.toCPointer<ByteVar>())

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeISNSServerW(address?.value?.toCPointer<ByteVar>())

public actual fun removeIScsiConnection(uniquesessionid: COpaquePointer?, connectionid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeIScsiConnection(uniquesessionid?.value?.toCPointer<ByteVar>(), connectionid?.value?.toCPointer<ByteVar>())

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetA(initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, targetname?.value?.toCPointer<ByteVar>(), portal?.value?.toCPointer<ByteVar>())

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetW(initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, targetname?.value?.toCPointer<ByteVar>(), portal?.value?.toCPointer<ByteVar>())

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalA(initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, portal?.value?.toCPointer<ByteVar>())

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalW(initiatorinstance?.value?.toCPointer<ByteVar>(), initiatorportnumber, portal?.value?.toCPointer<ByteVar>())

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetA(targetname?.value?.toCPointer<ByteVar>())

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetW(targetname?.value?.toCPointer<ByteVar>())

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceA(devicepath?.value?.toCPointer<ByteVar>())

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceW(devicepath?.value?.toCPointer<ByteVar>())

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeRadiusServerA(address?.value?.toCPointer<ByteVar>())

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_removeRadiusServerW(address?.value?.toCPointer<ByteVar>())

public actual fun reportActiveIScsiTargetMappingsA(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsA(buffersize?.value?.toCPointer<ByteVar>(), mappingcount?.value?.toCPointer<ByteVar>(), mappings?.value?.toCPointer<ByteVar>())

public actual fun reportActiveIScsiTargetMappingsW(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsW(buffersize?.value?.toCPointer<ByteVar>(), mappingcount?.value?.toCPointer<ByteVar>(), mappings?.value?.toCPointer<ByteVar>())

public actual fun reportISNSServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportISNSServerListA(buffersizeinchar?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportISNSServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportISNSServerListW(buffersizeinchar?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiInitiatorListA(buffersize: COpaquePointer?, buffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListA(buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiInitiatorListW(buffersize: COpaquePointer?, buffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListW(buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiPersistentLoginsA(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsA(count?.value?.toCPointer<ByteVar>(), persistentlogininfo?.value?.toCPointer<ByteVar>(), buffersizeinbytes?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiPersistentLoginsW(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsW(count?.value?.toCPointer<ByteVar>(), persistentlogininfo?.value?.toCPointer<ByteVar>(), buffersizeinbytes?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiSendTargetPortalsA(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsA(portalcount?.value?.toCPointer<ByteVar>(), portalinfo?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiSendTargetPortalsExA(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExA(portalcount?.value?.toCPointer<ByteVar>(), portalinfosize?.value?.toCPointer<ByteVar>(), portalinfo?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiSendTargetPortalsExW(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExW(portalcount?.value?.toCPointer<ByteVar>(), portalinfosize?.value?.toCPointer<ByteVar>(), portalinfo?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiSendTargetPortalsW(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsW(portalcount?.value?.toCPointer<ByteVar>(), portalinfo?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsA(initiatorname?.value?.toCPointer<ByteVar>(), targetname?.value?.toCPointer<ByteVar>(), targetportaltag?.value?.toCPointer<ByteVar>(), elementcount?.value?.toCPointer<ByteVar>(), portals?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsW(initiatorname?.value?.toCPointer<ByteVar>(), targetname?.value?.toCPointer<ByteVar>(), targetportaltag?.value?.toCPointer<ByteVar>(), elementcount?.value?.toCPointer<ByteVar>(), portals?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsA(forceupdate, buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsW(forceupdate, buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesA(buffersizeinchar?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesW(buffersizeinchar?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportRadiusServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListA(buffersizeinchar?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun reportRadiusServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListW(buffersizeinchar?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun sendScsiInquiry(uniquesessionid: COpaquePointer?, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_sendScsiInquiry(uniquesessionid?.value?.toCPointer<ByteVar>(), lun, evpdcmddt, pagecode, scsistatus?.value?.toCPointer<ByteVar>(), responsesize?.value?.toCPointer<ByteVar>(), responsebuffer?.value?.toCPointer<ByteVar>(), sensesize?.value?.toCPointer<ByteVar>(), sensebuffer?.value?.toCPointer<ByteVar>())

public actual fun sendScsiReadCapacity(uniquesessionid: COpaquePointer?, lun: ULong, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_sendScsiReadCapacity(uniquesessionid?.value?.toCPointer<ByteVar>(), lun, scsistatus?.value?.toCPointer<ByteVar>(), responsesize?.value?.toCPointer<ByteVar>(), responsebuffer?.value?.toCPointer<ByteVar>(), sensesize?.value?.toCPointer<ByteVar>(), sensebuffer?.value?.toCPointer<ByteVar>())

public actual fun sendScsiReportLuns(uniquesessionid: COpaquePointer?, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_sendScsiReportLuns(uniquesessionid?.value?.toCPointer<ByteVar>(), scsistatus?.value?.toCPointer<ByteVar>(), responsesize?.value?.toCPointer<ByteVar>(), responsebuffer?.value?.toCPointer<ByteVar>(), sensesize?.value?.toCPointer<ByteVar>(), sensebuffer?.value?.toCPointer<ByteVar>())

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: COpaquePointer?, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiGroupPresharedKey(keylength, key?.value?.toCPointer<ByteVar>(), persist)

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoA(initiatorname?.value?.toCPointer<ByteVar>(), initiatorportnumber, authinfo?.value?.toCPointer<ByteVar>(), persist)

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoW(initiatorname?.value?.toCPointer<ByteVar>(), initiatorportnumber, authinfo?.value?.toCPointer<ByteVar>(), persist)

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorCHAPSharedSecret(sharedsecretlength, sharedsecret?.value?.toCPointer<ByteVar>())

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameA(initiatornodename?.value?.toCPointer<ByteVar>())

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameW(initiatornodename?.value?.toCPointer<ByteVar>())

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength, sharedsecret?.value?.toCPointer<ByteVar>())

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressA(initiatorname?.value?.toCPointer<ByteVar>(), initiatorportnumber, destinationaddress?.value?.toCPointer<ByteVar>(), outermodeaddress?.value?.toCPointer<ByteVar>(), persist)

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressW(initiatorname?.value?.toCPointer<ByteVar>(), initiatorportnumber, destinationaddress?.value?.toCPointer<ByteVar>(), outermodeaddress?.value?.toCPointer<ByteVar>(), persist)

public actual fun setupPersistentIScsiDevices(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiDevices()

public actual fun setupPersistentIScsiVolumes(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiVolumes()
