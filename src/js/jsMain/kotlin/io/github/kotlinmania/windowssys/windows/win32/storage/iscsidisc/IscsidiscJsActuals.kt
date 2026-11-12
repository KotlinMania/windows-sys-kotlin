@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val windowsWin32StorageIscsidiscNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addISNSServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddISNSServerA(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addISNSServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddISNSServerW(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiConnectionA(uniquesessionid: MutPtr, reserved: MutPtr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, loginoptions: MutPtr, keysize: UInt, key: Pcstr, connectionid: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(uniquesessionid.rawAddress.toString(), reserved.rawAddress.toString(), initiatorportnumber.toInt(), targetportal.rawAddress.toString(), securityflags.toString(), loginoptions.rawAddress.toString(), keysize.toInt(), key.rawAddress.toString(), connectionid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiConnectionW(uniquesessionid: MutPtr, reserved: MutPtr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, loginoptions: MutPtr, keysize: UInt, key: Pcstr, connectionid: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(uniquesessionid.rawAddress.toString(), reserved.rawAddress.toString(), initiatorportnumber.toInt(), targetportal.rawAddress.toString(), securityflags.toString(), loginoptions.rawAddress.toString(), keysize.toInt(), key.rawAddress.toString(), connectionid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: MutPtr, securityflags: ULong, portal: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), loginoptions.rawAddress.toString(), securityflags.toString(), portal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: MutPtr, securityflags: ULong, portal: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), loginoptions.rawAddress.toString(), securityflags.toString(), portal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: MutPtr, loginoptions: MutPtr, portalgroup: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(targetname.rawAddress.toString(), targetalias.rawAddress.toString(), targetflags.toInt(), persist, mappings.rawAddress.toString(), loginoptions.rawAddress.toString(), portalgroup.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: MutPtr, loginoptions: MutPtr, portalgroup: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(targetname.rawAddress.toString(), targetalias.rawAddress.toString(), targetflags.toInt(), persist, mappings.rawAddress.toString(), loginoptions.rawAddress.toString(), portalgroup.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(devicepath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(devicepath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRadiusServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddRadiusServerA(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscAddRadiusServerW(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearPersistentIScsiDevices(): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicesForIScsiSessionA(uniquesessionid: MutPtr, devicecount: MutPtr, devices: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(uniquesessionid.rawAddress.toString(), devicecount.rawAddress.toString(), devices.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicesForIScsiSessionW(uniquesessionid: MutPtr, devicecount: MutPtr, devices: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(uniquesessionid.rawAddress.toString(), devicecount.rawAddress.toString(), devices.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: MutPtr, authinfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), reserved.rawAddress.toString(), authinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: MutPtr, authinfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), reserved.rawAddress.toString(), authinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(initiatornodename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(initiatornodename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListA(buffersize: MutPtr, sessioncount: MutPtr, sessioninfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(buffersize.rawAddress.toString(), sessioncount.rawAddress.toString(), sessioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListEx(buffersize: MutPtr, sessioncountptr: MutPtr, sessioninfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(buffersize.rawAddress.toString(), sessioncountptr.rawAddress.toString(), sessioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListW(buffersize: MutPtr, sessioncount: MutPtr, sessioninfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(buffersize.rawAddress.toString(), sessioncount.rawAddress.toString(), sessioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(targetname.rawAddress.toString(), discoverymechanism.rawAddress.toString(), infoclass, buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(targetname.rawAddress.toString(), discoverymechanism.rawAddress.toString(), infoclass, buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiVersionInformation(versioninfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(versioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, mappings: MutPtr, loginoptions: MutPtr, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr, uniqueconnectionid: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(targetname.rawAddress.toString(), isinformationalsession, initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), targetportal.rawAddress.toString(), securityflags.toString(), mappings.rawAddress.toString(), loginoptions.rawAddress.toString(), keysize.toInt(), key.rawAddress.toString(), ispersistent, uniquesessionid.rawAddress.toString(), uniqueconnectionid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: MutPtr, securityflags: ULong, mappings: MutPtr, loginoptions: MutPtr, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr, uniqueconnectionid: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(targetname.rawAddress.toString(), isinformationalsession, initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), targetportal.rawAddress.toString(), securityflags.toString(), mappings.rawAddress.toString(), loginoptions.rawAddress.toString(), keysize.toInt(), key.rawAddress.toString(), ispersistent, uniquesessionid.rawAddress.toString(), uniqueconnectionid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logoutIScsiTarget(uniquesessionid: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(uniquesessionid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), portal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), portal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeISNSServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiConnection(uniquesessionid: MutPtr, connectionid: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(uniquesessionid.rawAddress.toString(), connectionid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), targetname.rawAddress.toString(), portal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), targetname.rawAddress.toString(), portal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), portal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), portal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(targetname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(targetname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(devicepath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(devicepath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportActiveIScsiTargetMappingsA(buffersize: MutPtr, mappingcount: MutPtr, mappings: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(buffersize.rawAddress.toString(), mappingcount.rawAddress.toString(), mappings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportActiveIScsiTargetMappingsW(buffersize: MutPtr, mappingcount: MutPtr, mappings: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(buffersize.rawAddress.toString(), mappingcount.rawAddress.toString(), mappings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportISNSServerListA(buffersizeinchar: MutPtr, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportISNSServerListA(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportISNSServerListW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportISNSServerListW(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiInitiatorListA(buffersize: MutPtr, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiInitiatorListW(buffersize: MutPtr, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiPersistentLoginsA(count: MutPtr, persistentlogininfo: MutPtr, buffersizeinbytes: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(count.rawAddress.toString(), persistentlogininfo.rawAddress.toString(), buffersizeinbytes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiPersistentLoginsW(count: MutPtr, persistentlogininfo: MutPtr, buffersizeinbytes: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(count.rawAddress.toString(), persistentlogininfo.rawAddress.toString(), buffersizeinbytes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsA(portalcount: MutPtr, portalinfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(portalcount.rawAddress.toString(), portalinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsExA(portalcount: MutPtr, portalinfosize: MutPtr, portalinfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(portalcount.rawAddress.toString(), portalinfosize.rawAddress.toString(), portalinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsExW(portalcount: MutPtr, portalinfosize: MutPtr, portalinfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(portalcount.rawAddress.toString(), portalinfosize.rawAddress.toString(), portalinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsW(portalcount: MutPtr, portalinfo: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(portalcount.rawAddress.toString(), portalinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: MutPtr, elementcount: MutPtr, portals: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(initiatorname.rawAddress.toString(), targetname.rawAddress.toString(), targetportaltag.rawAddress.toString(), elementcount.rawAddress.toString(), portals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: MutPtr, elementcount: MutPtr, portals: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(initiatorname.rawAddress.toString(), targetname.rawAddress.toString(), targetportaltag.rawAddress.toString(), elementcount.rawAddress.toString(), portals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: MutPtr, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(forceupdate, buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: MutPtr, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(forceupdate, buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: MutPtr, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportRadiusServerListA(buffersizeinchar: MutPtr, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportRadiusServerListW(buffersizeinchar: MutPtr, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiInquiry(uniquesessionid: MutPtr, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSendScsiInquiry(uniquesessionid.rawAddress.toString(), lun.toString(), evpdcmddt.toInt(), pagecode.toInt(), scsistatus.rawAddress.toString(), responsesize.rawAddress.toString(), responsebuffer.rawAddress.toString(), sensesize.rawAddress.toString(), sensebuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiReadCapacity(uniquesessionid: MutPtr, lun: ULong, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(uniquesessionid.rawAddress.toString(), lun.toString(), scsistatus.rawAddress.toString(), responsesize.rawAddress.toString(), responsebuffer.rawAddress.toString(), sensesize.rawAddress.toString(), sensebuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiReportLuns(uniquesessionid: MutPtr, scsistatus: MutPtr, responsesize: MutPtr, responsebuffer: MutPtr, sensesize: MutPtr, sensebuffer: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(uniquesessionid.rawAddress.toString(), scsistatus.rawAddress.toString(), responsesize.rawAddress.toString(), responsebuffer.rawAddress.toString(), sensesize.rawAddress.toString(), sensebuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: MutPtr, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(keylength.toInt(), key.rawAddress.toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: MutPtr, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), authinfo.rawAddress.toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: MutPtr, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), authinfo.rawAddress.toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(sharedsecretlength.toInt(), sharedsecret.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(initiatornodename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(initiatornodename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength.toInt(), sharedsecret.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), destinationaddress.rawAddress.toString(), outermodeaddress.rawAddress.toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), destinationaddress.rawAddress.toString(), outermodeaddress.rawAddress.toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPersistentIScsiDevices(): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPersistentIScsiVolumes(): UInt =
    if (windowsWin32StorageIscsidiscNapiAddon != null) (windowsWin32StorageIscsidiscNapiAddon.windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
