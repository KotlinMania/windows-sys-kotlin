@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public actual fun addISNSServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addISNSServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addIScsiConnectionA(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addIScsiConnectionW(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addRadiusServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearPersistentIScsiDevices(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDevicesForIScsiSessionA(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDevicesForIScsiSessionW(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiSessionListA(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiSessionListEx(buffersize: COpaquePointer?, sessioncountptr: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiSessionListW(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIScsiVersionInformation(versioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun logoutIScsiTarget(uniquesessionid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeISNSServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeIScsiConnection(uniquesessionid: COpaquePointer?, connectionid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportActiveIScsiTargetMappingsA(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportActiveIScsiTargetMappingsW(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportISNSServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportISNSServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiInitiatorListA(buffersize: COpaquePointer?, buffer: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiInitiatorListW(buffersize: COpaquePointer?, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiPersistentLoginsA(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiPersistentLoginsW(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiSendTargetPortalsA(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiSendTargetPortalsExA(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiSendTargetPortalsExW(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiSendTargetPortalsW(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportRadiusServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportRadiusServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendScsiInquiry(uniquesessionid: COpaquePointer?, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendScsiReadCapacity(uniquesessionid: COpaquePointer?, lun: ULong, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendScsiReportLuns(uniquesessionid: COpaquePointer?, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: COpaquePointer?, persist: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupPersistentIScsiDevices(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupPersistentIScsiVolumes(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
