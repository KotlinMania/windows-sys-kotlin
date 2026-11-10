@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val _windowsWin32StorageIscsidiscNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addISNSServerA(address: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addISNSServerA((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addISNSServerW(address: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addISNSServerW((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiConnectionA(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionA((uniquesessionid?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString(), initiatorportnumber.toInt(), (targetportal?.value ?: 0L).toString(), securityflags.toString(), (loginoptions?.value ?: 0L).toString(), keysize.toInt(), (key?.value ?: 0L).toString(), (connectionid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiConnectionW(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionW((uniquesessionid?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString(), initiatorportnumber.toInt(), (targetportal?.value ?: 0L).toString(), securityflags.toString(), (loginoptions?.value ?: 0L).toString(), keysize.toInt(), (key?.value ?: 0L).toString(), (connectionid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalA((initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (loginoptions?.value ?: 0L).toString(), securityflags.toString(), (portal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalW((initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (loginoptions?.value ?: 0L).toString(), securityflags.toString(), (portal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetA((targetname?.value ?: 0L).toString(), (targetalias?.value ?: 0L).toString(), targetflags.toInt(), persist, (mappings?.value ?: 0L).toString(), (loginoptions?.value ?: 0L).toString(), (portalgroup?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetW((targetname?.value ?: 0L).toString(), (targetalias?.value ?: 0L).toString(), targetflags.toInt(), persist, (mappings?.value ?: 0L).toString(), (loginoptions?.value ?: 0L).toString(), (portalgroup?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceA((devicepath?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceW((devicepath?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRadiusServerA(address: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addRadiusServerA((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_addRadiusServerW((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearPersistentIScsiDevices(): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_clearPersistentIScsiDevices() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicesForIScsiSessionA(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionA((uniquesessionid?.value ?: 0L).toString(), (devicecount?.value ?: 0L).toString(), (devices?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicesForIScsiSessionW(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionW((uniquesessionid?.value ?: 0L).toString(), (devicecount?.value ?: 0L).toString(), (devices?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoA((initiatorname?.value ?: 0L).toString(), initiatorportnumber.toInt(), (reserved?.value ?: 0L).toString(), (authinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoW((initiatorname?.value ?: 0L).toString(), initiatorportnumber.toInt(), (reserved?.value ?: 0L).toString(), (authinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameA((initiatornodename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameW((initiatornodename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListA(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListA((buffersize?.value ?: 0L).toString(), (sessioncount?.value ?: 0L).toString(), (sessioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListEx(buffersize: COpaquePointer?, sessioncountptr: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListEx((buffersize?.value ?: 0L).toString(), (sessioncountptr?.value ?: 0L).toString(), (sessioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListW(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListW((buffersize?.value ?: 0L).toString(), (sessioncount?.value ?: 0L).toString(), (sessioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationA((targetname?.value ?: 0L).toString(), (discoverymechanism?.value ?: 0L).toString(), infoclass, (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationW((targetname?.value ?: 0L).toString(), (discoverymechanism?.value ?: 0L).toString(), infoclass, (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiVersionInformation(versioninfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_getIScsiVersionInformation((versioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetA((targetname?.value ?: 0L).toString(), isinformationalsession, (initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (targetportal?.value ?: 0L).toString(), securityflags.toString(), (mappings?.value ?: 0L).toString(), (loginoptions?.value ?: 0L).toString(), keysize.toInt(), (key?.value ?: 0L).toString(), ispersistent, (uniquesessionid?.value ?: 0L).toString(), (uniqueconnectionid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetW((targetname?.value ?: 0L).toString(), isinformationalsession, (initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (targetportal?.value ?: 0L).toString(), securityflags.toString(), (mappings?.value ?: 0L).toString(), (loginoptions?.value ?: 0L).toString(), keysize.toInt(), (key?.value ?: 0L).toString(), ispersistent, (uniquesessionid?.value ?: 0L).toString(), (uniqueconnectionid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logoutIScsiTarget(uniquesessionid: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_logoutIScsiTarget((uniquesessionid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_refreshISNSServerA((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_refreshISNSServerW((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalA((initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (portal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalW((initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (portal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeISNSServerA(address: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeISNSServerA((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeISNSServerW((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiConnection(uniquesessionid: COpaquePointer?, connectionid: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeIScsiConnection((uniquesessionid?.value ?: 0L).toString(), (connectionid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetA((initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (targetname?.value ?: 0L).toString(), (portal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetW((initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (targetname?.value ?: 0L).toString(), (portal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalA((initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (portal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalW((initiatorinstance?.value ?: 0L).toString(), initiatorportnumber.toInt(), (portal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetA((targetname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetW((targetname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceA((devicepath?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceW((devicepath?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeRadiusServerA((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_removeRadiusServerW((address?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportActiveIScsiTargetMappingsA(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsA((buffersize?.value ?: 0L).toString(), (mappingcount?.value ?: 0L).toString(), (mappings?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportActiveIScsiTargetMappingsW(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsW((buffersize?.value ?: 0L).toString(), (mappingcount?.value ?: 0L).toString(), (mappings?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportISNSServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportISNSServerListA((buffersizeinchar?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportISNSServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportISNSServerListW((buffersizeinchar?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiInitiatorListA(buffersize: COpaquePointer?, buffer: Pstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListA((buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiInitiatorListW(buffersize: COpaquePointer?, buffer: Pwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListW((buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiPersistentLoginsA(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsA((count?.value ?: 0L).toString(), (persistentlogininfo?.value ?: 0L).toString(), (buffersizeinbytes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiPersistentLoginsW(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsW((count?.value ?: 0L).toString(), (persistentlogininfo?.value ?: 0L).toString(), (buffersizeinbytes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsA(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsA((portalcount?.value ?: 0L).toString(), (portalinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsExA(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExA((portalcount?.value ?: 0L).toString(), (portalinfosize?.value ?: 0L).toString(), (portalinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsExW(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExW((portalcount?.value ?: 0L).toString(), (portalinfosize?.value ?: 0L).toString(), (portalinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsW(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsW((portalcount?.value ?: 0L).toString(), (portalinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsA((initiatorname?.value ?: 0L).toString(), (targetname?.value ?: 0L).toString(), (targetportaltag?.value ?: 0L).toString(), (elementcount?.value ?: 0L).toString(), (portals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsW((initiatorname?.value ?: 0L).toString(), (targetname?.value ?: 0L).toString(), (targetportaltag?.value ?: 0L).toString(), (elementcount?.value ?: 0L).toString(), (portals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsA(forceupdate, (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsW(forceupdate, (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesA((buffersizeinchar?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesW((buffersizeinchar?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportRadiusServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListA((buffersizeinchar?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportRadiusServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListW((buffersizeinchar?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiInquiry(uniquesessionid: COpaquePointer?, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_sendScsiInquiry((uniquesessionid?.value ?: 0L).toString(), lun.toString(), evpdcmddt.toInt(), pagecode.toInt(), (scsistatus?.value ?: 0L).toString(), (responsesize?.value ?: 0L).toString(), (responsebuffer?.value ?: 0L).toString(), (sensesize?.value ?: 0L).toString(), (sensebuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiReadCapacity(uniquesessionid: COpaquePointer?, lun: ULong, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_sendScsiReadCapacity((uniquesessionid?.value ?: 0L).toString(), lun.toString(), (scsistatus?.value ?: 0L).toString(), (responsesize?.value ?: 0L).toString(), (responsebuffer?.value ?: 0L).toString(), (sensesize?.value ?: 0L).toString(), (sensebuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiReportLuns(uniquesessionid: COpaquePointer?, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_sendScsiReportLuns((uniquesessionid?.value ?: 0L).toString(), (scsistatus?.value ?: 0L).toString(), (responsesize?.value ?: 0L).toString(), (responsebuffer?.value ?: 0L).toString(), (sensesize?.value ?: 0L).toString(), (sensebuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: COpaquePointer?, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiGroupPresharedKey(keylength.toInt(), (key?.value ?: 0L).toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoA((initiatorname?.value ?: 0L).toString(), initiatorportnumber.toInt(), (authinfo?.value ?: 0L).toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoW((initiatorname?.value ?: 0L).toString(), initiatorportnumber.toInt(), (authinfo?.value ?: 0L).toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorCHAPSharedSecret(sharedsecretlength.toInt(), (sharedsecret?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameA((initiatornodename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameW((initiatornodename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength.toInt(), (sharedsecret?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressA((initiatorname?.value ?: 0L).toString(), initiatorportnumber.toInt(), (destinationaddress?.value ?: 0L).toString(), (outermodeaddress?.value ?: 0L).toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressW((initiatorname?.value ?: 0L).toString(), initiatorportnumber.toInt(), (destinationaddress?.value ?: 0L).toString(), (outermodeaddress?.value ?: 0L).toString(), persist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPersistentIScsiDevices(): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiDevices() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPersistentIScsiVolumes(): UInt =
    if (_windowsWin32StorageIscsidiscNapiAddon != null) (_windowsWin32StorageIscsidiscNapiAddon.windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiVolumes() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
