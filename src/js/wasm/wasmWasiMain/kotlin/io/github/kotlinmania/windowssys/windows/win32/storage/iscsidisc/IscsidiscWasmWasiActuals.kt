@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addISNSServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddISNSServerA")

public actual fun addISNSServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddISNSServerW")

public actual fun addIScsiConnectionA(uniquesessionid: MutPtr, reserved: MutPtr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, loginoptions: MutPtr, keysize: UInt, key: Pcstr, connectionid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA")

public actual fun addIScsiConnectionW(uniquesessionid: MutPtr, reserved: MutPtr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, loginoptions: MutPtr, keysize: UInt, key: Pcstr, connectionid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW")

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: MutPtr, securityflags: ULong, portal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA")

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: MutPtr, securityflags: ULong, portal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW")

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: MutPtr, loginoptions: MutPtr, portalgroup: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA")

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: MutPtr, loginoptions: MutPtr, portalgroup: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW")

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA")

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW")

public actual fun addRadiusServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddRadiusServerA")

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscAddRadiusServerW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices")
private external fun wasiWindowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices(): Int

public actual fun clearPersistentIScsiDevices(): UInt =
    wasiWindowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices().toUInt()

public actual fun getDevicesForIScsiSessionA(uniquesessionid: MutPtr, devicecount: MutPtr, devices: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA")

public actual fun getDevicesForIScsiSessionW(uniquesessionid: MutPtr, devicecount: MutPtr, devices: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW")

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: MutPtr, authinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA")

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: MutPtr, authinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW")

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA")

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW")

public actual fun getIScsiSessionListA(buffersize: MutPtr, sessioncount: MutPtr, sessioninfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA")

public actual fun getIScsiSessionListEx(buffersize: MutPtr, sessioncountptr: MutPtr, sessioninfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx")

public actual fun getIScsiSessionListW(buffersize: MutPtr, sessioncount: MutPtr, sessioninfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW")

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: MutPtr, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA")

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: MutPtr, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW")

public actual fun getIScsiVersionInformation(versioninfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation")

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, mappings: MutPtr, loginoptions: MutPtr, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr, uniqueconnectionid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA")

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, mappings: MutPtr, loginoptions: MutPtr, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr, uniqueconnectionid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW")

public actual fun logoutIScsiTarget(uniquesessionid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget")

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA")

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW")

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA")

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW")

public actual fun removeISNSServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA")

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW")

public actual fun removeIScsiConnection(uniquesessionid: MutPtr, connectionid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection")

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA")

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW")

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA")

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW")

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA")

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW")

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA")

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW")

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA")

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW")

public actual fun reportActiveIScsiTargetMappingsA(buffersize: MutPtr, mappingcount: MutPtr, mappings: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA")

public actual fun reportActiveIScsiTargetMappingsW(buffersize: MutPtr, mappingcount: MutPtr, mappings: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW")

public actual fun reportISNSServerListA(buffersizeinchar: MutPtr, buffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportISNSServerListA")

public actual fun reportISNSServerListW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportISNSServerListW")

public actual fun reportIScsiInitiatorListA(buffersize: MutPtr, buffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA")

public actual fun reportIScsiInitiatorListW(buffersize: MutPtr, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW")

public actual fun reportIScsiPersistentLoginsA(count: MutPtr, persistentlogininfo: MutPtr, buffersizeinbytes: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA")

public actual fun reportIScsiPersistentLoginsW(count: MutPtr, persistentlogininfo: MutPtr, buffersizeinbytes: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW")

public actual fun reportIScsiSendTargetPortalsA(portalcount: MutPtr, portalinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA")

public actual fun reportIScsiSendTargetPortalsExA(portalcount: MutPtr, portalinfosize: MutPtr, portalinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA")

public actual fun reportIScsiSendTargetPortalsExW(portalcount: MutPtr, portalinfosize: MutPtr, portalinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW")

public actual fun reportIScsiSendTargetPortalsW(portalcount: MutPtr, portalinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW")

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: MutPtr, elementcount: MutPtr, portals: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA")

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: MutPtr, elementcount: MutPtr, portals: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW")

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: MutPtr, buffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA")

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: MutPtr, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW")

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: MutPtr, buffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA")

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW")

public actual fun reportRadiusServerListA(buffersizeinchar: MutPtr, buffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA")

public actual fun reportRadiusServerListW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW")

public actual fun sendScsiInquiry(uniquesessionid: MutPtr, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSendScsiInquiry")

public actual fun sendScsiReadCapacity(uniquesessionid: MutPtr, lun: ULong, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity")

public actual fun sendScsiReportLuns(uniquesessionid: MutPtr, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns")

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: MutPtr, persist: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey")

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: MutPtr, persist: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA")

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: MutPtr, persist: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW")

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret")

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA")

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW")

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret")

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA")

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices")
private external fun wasiWindowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices(): Int

public actual fun setupPersistentIScsiDevices(): UInt =
    wasiWindowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes")
private external fun wasiWindowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes(): Int

public actual fun setupPersistentIScsiVolumes(): UInt =
    wasiWindowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes().toUInt()
