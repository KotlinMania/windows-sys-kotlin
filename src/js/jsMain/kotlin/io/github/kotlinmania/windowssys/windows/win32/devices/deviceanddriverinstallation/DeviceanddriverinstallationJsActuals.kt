@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.Priority
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage

private val _windowsWin32DevicesDeviceanddriverinstallationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmpWaitNoPendingInstallEvents(dwtimeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddEmptyLogConf(plclogconf: COpaquePointer?, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddEmptyLogConf((plclogconf?.value ?: 0L).toString(), dndevinst.toInt(), priority, ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddEmptyLogConfEx(plclogconf: COpaquePointer?, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddEmptyLogConfEx((plclogconf?.value ?: 0L).toString(), dndevinst.toInt(), priority, ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIda(dndevinst.toInt(), (pszid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdw(dndevinst.toInt(), (pszid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdExA(dndevinst.toInt(), (pszid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdExW(dndevinst.toInt(), (pszid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddRange(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddResDes(prdresdes: COpaquePointer?, lclogconf: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddResDes((prdresdes?.value ?: 0L).toString(), lclogconf.toString(), resourceid.toInt(), (resourcedata?.value ?: 0L).toString(), resourcelen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddResDesEx(prdresdes: COpaquePointer?, lclogconf: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddResDesEx((prdresdes?.value ?: 0L).toString(), lclogconf.toString(), resourceid.toInt(), (resourcedata?.value ?: 0L).toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmConnectMachineA(uncservername: Pcstr, phmachine: COpaquePointer?): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmConnectMachineA((uncservername?.value ?: 0L).toString(), (phmachine?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmConnectMachineW(uncservername: Pcwstr, phmachine: COpaquePointer?): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmConnectMachineW((uncservername?.value ?: 0L).toString(), (phmachine?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeA((pdndevinst?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), dnparent.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeW((pdndevinst?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), dnparent.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeExA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeExA((pdndevinst?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), dnparent.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeExW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeExW((pdndevinst?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), dnparent.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateRangeList(prlh: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateRangeList((prlh?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteClassKey(classguid: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteClassKey((classguid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteClassKeyEx(classguid: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteClassKeyEx((classguid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDevNodeKey(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDevNodeKeyEx(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyA((pszdeviceinterface?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyW((pszdeviceinterface?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyExA((pszdeviceinterface?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyExW((pszdeviceinterface?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteRange(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, pbconflictdetected: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDetectResourceConflict(dndevinst.toInt(), resourceid.toInt(), (resourcedata?.value ?: 0L).toString(), resourcelen.toInt(), (pbconflictdetected?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, pbconflictdetected: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDetectResourceConflictEx(dndevinst.toInt(), resourceid.toInt(), (resourcedata?.value ?: 0L).toString(), resourcelen.toInt(), (pbconflictdetected?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisableDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisconnectMachine(hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisconnectMachine(hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDupRangeList(rlhold.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnableDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateClasses(ulclassindex: UInt, classguid: COpaquePointer?, ulflags: CmEnumerateFlags): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateClasses(ulclassindex.toInt(), (classguid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: COpaquePointer?, ulflags: CmEnumerateFlags, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateClassesEx(ulclassindex.toInt(), (classguid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsA(ulenumindex.toInt(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsW(ulenumindex.toInt(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsExA(ulenumindex.toInt(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsExW(ulenumindex.toInt(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFindRange(pullstart: COpaquePointer?, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFindRange((pullstart?.value ?: 0L).toString(), ullstart.toString(), ullength.toInt(), ullalignment.toString(), ullend.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFirstRange(rlh: ULong, pullstart: COpaquePointer?, pullend: COpaquePointer?, preelement: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFirstRange(rlh.toString(), (pullstart?.value ?: 0L).toString(), (pullend?.value ?: 0L).toString(), (preelement?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConf(lclogconftobefreed.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConfEx(lclogconftobefreed.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConfHandle(lclogconf: ULong): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConfHandle(lclogconf.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeRangeList(rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDes(prdresdes: COpaquePointer?, rdresdes: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDes((prdresdes?.value ?: 0L).toString(), rdresdes.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDesEx((prdresdes?.value ?: 0L).toString(), rdresdes.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDesHandle(rdresdes: ULong): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDesHandle(rdresdes.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResourceConflictHandle(clconflictlist.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetChild(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetChild((pdndevinst?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetChildEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetChildEx((pdndevinst?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameA(classguid: COpaquePointer?, pszkeyname: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameA((classguid?.value ?: 0L).toString(), (pszkeyname?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameW(classguid: COpaquePointer?, pszkeyname: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameW((classguid?.value ?: 0L).toString(), (pszkeyname?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameExA(classguid: COpaquePointer?, pszkeyname: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameExA((classguid?.value ?: 0L).toString(), (pszkeyname?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameExW(classguid: COpaquePointer?, pszkeyname: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameExW((classguid?.value ?: 0L).toString(), (pszkeyname?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameA(classguid: COpaquePointer?, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameA((classguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameW(classguid: COpaquePointer?, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameW((classguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameExA(classguid: COpaquePointer?, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameExA((classguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameExW(classguid: COpaquePointer?, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameExW((classguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyW((classguid?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), (propertybuffersize?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyExW((classguid?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), (propertybuffersize?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyKeys(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyKeys((classguid?.value ?: 0L).toString(), (propertykeyarray?.value ?: 0L).toString(), (propertykeycount?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyKeysEx(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyKeysEx((classguid?.value ?: 0L).toString(), (propertykeyarray?.value ?: 0L).toString(), (propertykeycount?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassRegistryPropertyA(classguid: COpaquePointer?, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassRegistryPropertyA((classguid?.value ?: 0L).toString(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassRegistryPropertyW(classguid: COpaquePointer?, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassRegistryPropertyW((classguid?.value ?: 0L).toString(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDepth(puldepth: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDepth((puldepth?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDepthEx(puldepth: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDepthEx((puldepth?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyA(dndevinst.toInt(), (pszcustompropertyname?.value ?: 0L).toString(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyW(dndevinst.toInt(), (pszcustompropertyname?.value ?: 0L).toString(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyExA(dndevinst.toInt(), (pszcustompropertyname?.value ?: 0L).toString(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyExW(dndevinst.toInt(), (pszcustompropertyname?.value ?: 0L).toString(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyW(dndevinst.toInt(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), (propertybuffersize?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyExW(dndevinst.toInt(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), (propertybuffersize?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyKeys(dndevinst.toInt(), (propertykeyarray?.value ?: 0L).toString(), (propertykeycount?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyKeysEx(dndevinst.toInt(), (propertykeyarray?.value ?: 0L).toString(), (propertykeycount?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeStatus(pulstatus: COpaquePointer?, pulproblemnumber: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeStatus((pulstatus?.value ?: 0L).toString(), (pulproblemnumber?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeStatusEx(pulstatus: COpaquePointer?, pulproblemnumber: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeStatusEx((pulstatus?.value ?: 0L).toString(), (pulproblemnumber?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIda(dndevinst.toInt(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdw(dndevinst.toInt(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdExA(dndevinst.toInt(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdExW(dndevinst.toInt(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListA((pszfilter?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListW((pszfilter?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListExA((pszfilter?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListExW((pszfilter?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeA(pullen: COpaquePointer?, pszfilter: Pcstr, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeA((pullen?.value ?: 0L).toString(), (pszfilter?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeW(pullen: COpaquePointer?, pszfilter: Pcwstr, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeW((pullen?.value ?: 0L).toString(), (pszfilter?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeExA(pullen: COpaquePointer?, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeExA((pullen?.value ?: 0L).toString(), (pszfilter?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeExW(pullen: COpaquePointer?, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeExW((pullen?.value ?: 0L).toString(), (pszfilter?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdSize(pullen: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdSize((pullen?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdSizeEx(pullen: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdSizeEx((pullen?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasA((pszdeviceinterface?.value ?: 0L).toString(), (aliasinterfaceguid?.value ?: 0L).toString(), (pszaliasdeviceinterface?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasW((pszdeviceinterface?.value ?: 0L).toString(), (aliasinterfaceguid?.value ?: 0L).toString(), (pszaliasdeviceinterface?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasExA((pszdeviceinterface?.value ?: 0L).toString(), (aliasinterfaceguid?.value ?: 0L).toString(), (pszaliasdeviceinterface?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasExW((pszdeviceinterface?.value ?: 0L).toString(), (aliasinterfaceguid?.value ?: 0L).toString(), (pszaliasdeviceinterface?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListA(interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListA((interfaceclassguid?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListW(interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListW((interfaceclassguid?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListExA(interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListExA((interfaceclassguid?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListExW(interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListExW((interfaceclassguid?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeA(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeA((pullen?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeW(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeW((pullen?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeExA(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeExA((pullen?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeExW(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeExW((pullen?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyW((pszdeviceinterface?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), (propertybuffersize?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyExW((pszdeviceinterface?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), (propertybuffersize?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyKeysW((pszdeviceinterface?.value ?: 0L).toString(), (propertykeyarray?.value ?: 0L).toString(), (propertykeycount?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyKeysExW((pszdeviceinterface?.value ?: 0L).toString(), (propertykeyarray?.value ?: 0L).toString(), (propertykeycount?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetFirstLogConf(plclogconf: COpaquePointer?, dndevinst: UInt, ulflags: CmLogConf): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetFirstLogConf((plclogconf?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetFirstLogConfEx(plclogconf: COpaquePointer?, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetFirstLogConfEx((plclogconf?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetGlobalState(pulstate: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetGlobalState((pulstate?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetGlobalStateEx(pulstate: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetGlobalStateEx((pulstate?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsA((pdeviceid?.value ?: 0L).toString(), ulhardwareprofile.toInt(), (pulvalue?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsW((pdeviceid?.value ?: 0L).toString(), ulhardwareprofile.toInt(), (pulvalue?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsExA((pdeviceid?.value ?: 0L).toString(), ulhardwareprofile.toInt(), (pulvalue?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsExW((pdeviceid?.value ?: 0L).toString(), ulhardwareprofile.toInt(), (pulvalue?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoA(ulindex.toInt(), (phwprofileinfo?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoW(ulindex.toInt(), (phwprofileinfo?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoExA(ulindex.toInt(), (phwprofileinfo?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoExW(ulindex.toInt(), (phwprofileinfo?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetLogConfPriority(lclogconf: ULong, ppriority: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetLogConfPriority(lclogconf.toString(), (ppriority?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetLogConfPriorityEx(lclogconf.toString(), (ppriority?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextLogConf(plclogconf: COpaquePointer?, lclogconf: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextLogConf((plclogconf?.value ?: 0L).toString(), lclogconf.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextLogConfEx(plclogconf: COpaquePointer?, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextLogConfEx((plclogconf?.value ?: 0L).toString(), lclogconf.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextResDes(prdresdes: COpaquePointer?, rdresdes: ULong, forresource: CmRestype, presourceid: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextResDes((prdresdes?.value ?: 0L).toString(), rdresdes.toString(), forresource.toInt(), (presourceid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, forresource: CmRestype, presourceid: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextResDesEx((prdresdes?.value ?: 0L).toString(), rdresdes.toString(), forresource.toInt(), (presourceid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetParent(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetParent((pdndevinst?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetParentEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetParentEx((pdndevinst?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesData(rdresdes: ULong, buffer: COpaquePointer?, bufferlen: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesData(rdresdes.toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataEx(rdresdes: ULong, buffer: COpaquePointer?, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataEx(rdresdes.toString(), (buffer?.value ?: 0L).toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataSize(pulsize: COpaquePointer?, rdresdes: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataSize((pulsize?.value ?: 0L).toString(), rdresdes.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataSizeEx(pulsize: COpaquePointer?, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataSizeEx((pulsize?.value ?: 0L).toString(), rdresdes.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: COpaquePointer?): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictCount(clconflictlist.toString(), (pulcount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: COpaquePointer?): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictDetailsA(clconflictlist.toString(), ulindex.toInt(), (pconflictdetails?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: COpaquePointer?): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictDetailsW(clconflictlist.toString(), ulindex.toInt(), (pconflictdetails?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetSibling(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetSibling((pdndevinst?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetSiblingEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetSiblingEx((pdndevinst?.value ?: 0L).toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetVersion(): UShort =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetVersion() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetVersionEx(hmachine: Long): UShort =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetVersionEx(hmachine.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIntersectRangeList(rlhold1.toString(), rlhold2.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmInvertRangeList(rlhold.toString(), rlhnew.toString(), ullmaxvalue.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsDockStationPresent(pbpresent: COpaquePointer?): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsDockStationPresent((pbpresent?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsDockStationPresentEx(pbpresent: COpaquePointer?, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsDockStationPresentEx((pbpresent?.value ?: 0L).toString(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsVersionAvailable(wversion: UShort): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsVersionAvailable(wversion.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsVersionAvailableEx(wversion.toInt(), hmachine.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeA((pdndevinst?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeW((pdndevinst?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeExA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeExA((pdndevinst?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeExW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeExW((pdndevinst?.value ?: 0L).toString(), (pdeviceid?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmMapCrToWin32Err(cmreturncode.toInt(), defaulterr.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmMergeRangeList(rlhold1.toString(), rlhold2.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmModifyResDes(prdresdes: COpaquePointer?, rdresdes: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmModifyResDes((prdresdes?.value ?: 0L).toString(), rdresdes.toString(), resourceid.toInt(), (resourcedata?.value ?: 0L).toString(), resourcelen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmModifyResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmModifyResDesEx((prdresdes?.value ?: 0L).toString(), rdresdes.toString(), resourceid.toInt(), (resourcedata?.value ?: 0L).toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmMoveDevNode(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmMoveDevNodeEx(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmNextRange(preelement: COpaquePointer?, pullstart: COpaquePointer?, pullend: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmNextRange((preelement?.value ?: 0L).toString(), (pullstart?.value ?: 0L).toString(), (pullend?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyA(classguid: COpaquePointer?, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyA((classguid?.value ?: 0L).toString(), (pszclassname?.value ?: 0L).toString(), samdesired.toInt(), disposition.toInt(), (phkclass?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyW(classguid: COpaquePointer?, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyW((classguid?.value ?: 0L).toString(), (pszclassname?.value ?: 0L).toString(), samdesired.toInt(), disposition.toInt(), (phkclass?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyExA(classguid: COpaquePointer?, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyExA((classguid?.value ?: 0L).toString(), (pszclassname?.value ?: 0L).toString(), samdesired.toInt(), disposition.toInt(), (phkclass?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyExW(classguid: COpaquePointer?, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyExW((classguid?.value ?: 0L).toString(), (pszclassname?.value ?: 0L).toString(), samdesired.toInt(), disposition.toInt(), (phkclass?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDevNodeKey(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), (phkdevice?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDevNodeKeyEx(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), (phkdevice?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyA((pszdeviceinterface?.value ?: 0L).toString(), samdesired.toInt(), disposition.toInt(), (phkdeviceinterface?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyW((pszdeviceinterface?.value ?: 0L).toString(), samdesired.toInt(), disposition.toInt(), (phkdeviceinterface?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyExA((pszdeviceinterface?.value ?: 0L).toString(), samdesired.toInt(), disposition.toInt(), (phkdeviceinterface?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyExW((pszdeviceinterface?.value ?: 0L).toString(), samdesired.toInt(), disposition.toInt(), (phkdeviceinterface?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeA(dnancestor.toInt(), (pvetotype?.value ?: 0L).toString(), (pszvetoname?.value ?: 0L).toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeW(dnancestor.toInt(), (pvetotype?.value ?: 0L).toString(), (pszvetoname?.value ?: 0L).toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeExA(dnancestor.toInt(), (pvetotype?.value ?: 0L).toString(), (pszvetoname?.value ?: 0L).toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeExW(dnancestor.toInt(), (pvetotype?.value ?: 0L).toString(), (pszvetoname?.value ?: 0L).toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeData(pdata: COpaquePointer?, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeData((pdata?.value ?: 0L).toString(), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeDataEx(pdata: COpaquePointer?, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeDataEx((pdata?.value ?: 0L).toString(), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeSize(pulsize: COpaquePointer?, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeSize((pulsize?.value ?: 0L).toString(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeSizeEx(pulsize: COpaquePointer?, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeSizeEx((pulsize?.value ?: 0L).toString(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryRemoveSubTree(dnancestor.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryResourceConflictList(pclconflictlist: COpaquePointer?, dndevinst: UInt, resourceid: CmRestype, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryResourceConflictList((pclconflictlist?.value ?: 0L).toString(), dndevinst.toInt(), resourceid.toInt(), (resourcedata?.value ?: 0L).toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmReenumerateDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmReenumerateDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceDriver(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceDriverEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceA(dndevinst.toInt(), (interfaceclassguid?.value ?: 0L).toString(), (pszreference?.value ?: 0L).toString(), (pszdeviceinterface?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceW(dndevinst.toInt(), (interfaceclassguid?.value ?: 0L).toString(), (pszreference?.value ?: 0L).toString(), (pszdeviceinterface?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceExA(dndevinst.toInt(), (interfaceclassguid?.value ?: 0L).toString(), (pszreference?.value ?: 0L).toString(), (pszdeviceinterface?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceExW(dndevinst.toInt(), (interfaceclassguid?.value ?: 0L).toString(), (pszreference?.value ?: 0L).toString(), (pszdeviceinterface?.value ?: 0L).toString(), (pullength?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterNotification(pfilter: COpaquePointer?, pcontext: COpaquePointer?, pcallback: PcmNotifyCallback, pnotifycontext: COpaquePointer?): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterNotification((pfilter?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), 0L.toString(), (pnotifycontext?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRemoveSubTree(dnancestor.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectA(dndevinst.toInt(), (pvetotype?.value ?: 0L).toString(), (pszvetoname?.value ?: 0L).toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectW(dndevinst.toInt(), (pvetotype?.value ?: 0L).toString(), (pszvetoname?.value ?: 0L).toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectExA(dndevinst.toInt(), (pvetotype?.value ?: 0L).toString(), (pszvetoname?.value ?: 0L).toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectExW(dndevinst.toInt(), (pvetotype?.value ?: 0L).toString(), (pszvetoname?.value ?: 0L).toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestEjectPc(): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestEjectPc() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestEjectPcEx(hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestEjectPcEx(hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRunDetection(ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRunDetection(ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRunDetectionEx(ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassPropertyW((classguid?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassPropertyExW((classguid?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassRegistryPropertyA(classguid: COpaquePointer?, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassRegistryPropertyA((classguid?.value ?: 0L).toString(), ulproperty.toInt(), (buffer?.value ?: 0L).toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassRegistryPropertyW(classguid: COpaquePointer?, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassRegistryPropertyW((classguid?.value ?: 0L).toString(), ulproperty.toInt(), (buffer?.value ?: 0L).toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeProblem(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeProblemEx(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodePropertyW(dndevinst.toInt(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodePropertyExW(dndevinst.toInt(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), (buffer?.value ?: 0L).toString(), ullength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), (buffer?.value ?: 0L).toString(), ullength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), (buffer?.value ?: 0L).toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), (buffer?.value ?: 0L).toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDeviceInterfacePropertyW((pszdeviceinterface?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDeviceInterfacePropertyExW((pszdeviceinterface?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProf(ulhardwareprofile.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfEx(ulhardwareprofile.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsA((pdeviceid?.value ?: 0L).toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsW((pdeviceid?.value ?: 0L).toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsExA((pdeviceid?.value ?: 0L).toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsExW((pdeviceid?.value ?: 0L).toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetupDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetupDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmTestRangeAvailable(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUninstallDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUninstallDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceA((pszdeviceinterface?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceW((pszdeviceinterface?.value ?: 0L).toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceExA((pszdeviceinterface?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceExW((pszdeviceinterface?.value ?: 0L).toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterNotification((notifycontext?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, flags: DiinstalldeviceFlags, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDevice((hwndparent?.value ?: 0L).toString(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDriverA((hwndparent?.value ?: 0L).toString(), (infpath?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDriverW((hwndparent?.value ?: 0L).toString(), (infpath?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diRollbackDriver(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diShowUpdateDevice((hwndparent?.value ?: 0L).toString(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diShowUpdateDriver((hwndparent?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDevice((hwndparent?.value ?: 0L).toString(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDriverA((hwndparent?.value ?: 0L).toString(), (infpath?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDriverW((hwndparent?.value ?: 0L).toString(), (infpath?.value ?: 0L).toString(), flags.toInt(), (needreboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_installHinfSectionA((window?.value ?: 0L).toString(), (modulehandle?.value ?: 0L).toString(), (commandline?.value ?: 0L).toString(), showcommand)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_installHinfSectionW((window?.value ?: 0L).toString(), (modulehandle?.value ?: 0L).toString(), (commandline?.value ?: 0L).toString(), showcommand)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupAddInstallSectionToDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddInstallSectionToDiskSpaceListA((diskspace?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (layoutinfhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddInstallSectionToDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcwstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddInstallSectionToDiskSpaceListW((diskspace?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (layoutinfhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddSectionToDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddSectionToDiskSpaceListA((diskspace?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), operation.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddSectionToDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddSectionToDiskSpaceListW((diskspace?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), operation.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToDiskSpaceListA(diskspace: COpaquePointer?, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToDiskSpaceListA((diskspace?.value ?: 0L).toString(), (targetfilespec?.value ?: 0L).toString(), filesize.toString(), operation.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToDiskSpaceListW(diskspace: COpaquePointer?, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToDiskSpaceListW((diskspace?.value ?: 0L).toString(), (targetfilespec?.value ?: 0L).toString(), filesize.toString(), operation.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToSourceListA(flags.toInt(), (source?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToSourceListW(flags.toInt(), (source?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAdjustDiskSpaceListA(diskspace: COpaquePointer?, driveroot: Pcstr, amount: Long, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAdjustDiskSpaceListA((diskspace?.value ?: 0L).toString(), (driveroot?.value ?: 0L).toString(), amount.toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAdjustDiskSpaceListW(diskspace: COpaquePointer?, driveroot: Pcwstr, amount: Long, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAdjustDiskSpaceListW((diskspace?.value ?: 0L).toString(), (driveroot?.value ?: 0L).toString(), amount.toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupBackupErrorA((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (targetfile?.value ?: 0L).toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupBackupErrorW((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (targetfile?.value ?: 0L).toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCancelTemporarySourceList(): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCancelTemporarySourceList() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCloseFileQueue(queuehandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseFileQueue((queuehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCloseInfFile(infhandle: COpaquePointer?) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseInfFile((infhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupCloseLog() {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseLog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupCommitFileQueueA(owner: Hwnd, queuehandle: COpaquePointer?, msghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCommitFileQueueA((owner?.value ?: 0L).toString(), (queuehandle?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCommitFileQueueW(owner: Hwnd, queuehandle: COpaquePointer?, msghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCommitFileQueueW((owner?.value ?: 0L).toString(), (queuehandle?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupConfigureWmiFromInfSectionA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupConfigureWmiFromInfSectionA((infhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupConfigureWmiFromInfSectionW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupConfigureWmiFromInfSectionW((infhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyErrorA((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (diskname?.value ?: 0L).toString(), (pathtosource?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (targetpathfile?.value ?: 0L).toString(), win32errorcode.toInt(), style.toInt(), (pathbuffer?.value ?: 0L).toString(), pathbuffersize.toInt(), (pathrequiredsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyErrorW((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (diskname?.value ?: 0L).toString(), (pathtosource?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (targetpathfile?.value ?: 0L).toString(), win32errorcode.toInt(), style.toInt(), (pathbuffer?.value ?: 0L).toString(), pathbuffersize.toInt(), (pathrequiredsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: COpaquePointer?, destinationinffilenamecomponent: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyOEMInfA((sourceinffilename?.value ?: 0L).toString(), (oemsourcemedialocation?.value ?: 0L).toString(), oemsourcemediatype.toInt(), copystyle.toInt(), (destinationinffilename?.value ?: 0L).toString(), destinationinffilenamesize.toInt(), (requiredsize?.value ?: 0L).toString(), (destinationinffilenamecomponent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: COpaquePointer?, destinationinffilenamecomponent: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyOEMInfW((sourceinffilename?.value ?: 0L).toString(), (oemsourcemedialocation?.value ?: 0L).toString(), oemsourcemediatype.toInt(), copystyle.toInt(), (destinationinffilename?.value ?: 0L).toString(), destinationinffilenamesize.toInt(), (requiredsize?.value ?: 0L).toString(), (destinationinffilenamecomponent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCreateDiskSpaceListA(reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCreateDiskSpaceListA((reserved1?.value ?: 0L).toString(), reserved2.toInt(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCreateDiskSpaceListW(reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCreateDiskSpaceListW((reserved1?.value ?: 0L).toString(), reserved2.toInt(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDecompressOrCopyFileA((sourcefilename?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), (compressiontype?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDecompressOrCopyFileW((sourcefilename?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), (compressiontype?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDefaultQueueCallbackA(context: COpaquePointer?, notification: UInt, param1: ULong, param2: ULong): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDefaultQueueCallbackA((context?.value ?: 0L).toString(), notification.toInt(), param1.toString(), param2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDefaultQueueCallbackW(context: COpaquePointer?, notification: UInt, param1: ULong, param2: ULong): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDefaultQueueCallbackW((context?.value ?: 0L).toString(), notification.toInt(), param1.toString(), param2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDeleteErrorA((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDeleteErrorW((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDestroyDiskSpaceList(diskspace: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDestroyDiskSpaceList((diskspace?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiAskForOEMDisk(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoList(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoList(flags.toInt(), (classguidlist?.value ?: 0L).toString(), classguidlistsize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoListExA(flags.toInt(), (classguidlist?.value ?: 0L).toString(), classguidlistsize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoListExW(flags.toInt(), (classguidlist?.value ?: 0L).toString(), classguidlistsize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildDriverInfoList(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), drivertype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCallClassInstaller(installfunction.toInt(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCancelDriverInfoSearch(deviceinfoset.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiChangeState(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameA((classname?.value ?: 0L).toString(), (classguidlist?.value ?: 0L).toString(), classguidlistsize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameExA((classname?.value ?: 0L).toString(), (classguidlist?.value ?: 0L).toString(), classguidlistsize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameExW((classname?.value ?: 0L).toString(), (classguidlist?.value ?: 0L).toString(), classguidlistsize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameW((classname?.value ?: 0L).toString(), (classguidlist?.value ?: 0L).toString(), classguidlistsize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidA(classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidA((classguid?.value ?: 0L).toString(), (classname?.value ?: 0L).toString(), classnamesize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidExA(classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidExA((classguid?.value ?: 0L).toString(), (classname?.value ?: 0L).toString(), classnamesize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidExW(classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidExW((classguid?.value ?: 0L).toString(), (classname?.value ?: 0L).toString(), classnamesize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidW(classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidW((classguid?.value ?: 0L).toString(), (classname?.value ?: 0L).toString(), classnamesize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: COpaquePointer?, infsectionname: Pcstr): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDevRegKeyA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), (infhandle?.value ?: 0L).toString(), (infsectionname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: COpaquePointer?, infsectionname: Pcwstr): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDevRegKeyW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), (infhandle?.value ?: 0L).toString(), (infsectionname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: COpaquePointer?, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoA(deviceinfoset.toString(), (devicename?.value ?: 0L).toString(), (classguid?.value ?: 0L).toString(), (devicedescription?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), creationflags.toInt(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoList(classguid: COpaquePointer?, hwndparent: Hwnd): Hdevinfo =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoList((classguid?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoListExA(classguid: COpaquePointer?, hwndparent: Hwnd, machinename: Pcstr, reserved: COpaquePointer?): Hdevinfo =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoListExA((classguid?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoListExW(classguid: COpaquePointer?, hwndparent: Hwnd, machinename: Pcwstr, reserved: COpaquePointer?): Hdevinfo =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoListExW((classguid?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: COpaquePointer?, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoW(deviceinfoset.toString(), (devicename?.value ?: 0L).toString(), (classguid?.value ?: 0L).toString(), (devicedescription?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), creationflags.toInt(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (referencestring?.value ?: 0L).toString(), creationflags.toInt(), (deviceinterfacedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt, infhandle: COpaquePointer?, infsectionname: Pcstr): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), reserved.toInt(), samdesired.toInt(), (infhandle?.value ?: 0L).toString(), (infsectionname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt, infhandle: COpaquePointer?, infsectionname: Pcwstr): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), reserved.toInt(), samdesired.toInt(), (infhandle?.value ?: 0L).toString(), (infsectionname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (referencestring?.value ?: 0L).toString(), creationflags.toInt(), (deviceinterfacedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDevRegKey(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInfo(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInterfaceData(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInterfaceRegKey(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyClassImageList(classimagelistdata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyClassImageList((classimagelistdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyDeviceInfoList(deviceinfoset.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyDriverInfoList(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), drivertype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDeviceInfo(deviceinfoset.toString(), memberindex.toInt(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, memberindex: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDeviceInterfaces(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), memberindex.toInt(), (deviceinterfacedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDriverInfoA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), drivertype.toInt(), memberindex.toInt(), (driverinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDriverInfoW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), drivertype.toInt(), memberindex.toInt(), (driverinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualModelsSectionA(context: COpaquePointer?, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualModelsSectionA((context?.value ?: 0L).toString(), (alternateplatforminfo?.value ?: 0L).toString(), (infsectionwithext?.value ?: 0L).toString(), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualModelsSectionW(context: COpaquePointer?, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualModelsSectionW((context?.value ?: 0L).toString(), (alternateplatforminfo?.value ?: 0L).toString(), (infsectionwithext?.value ?: 0L).toString(), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallA(infhandle: COpaquePointer?, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallA((infhandle?.value ?: 0L).toString(), (infsectionname?.value ?: 0L).toString(), (infsectionwithext?.value ?: 0L).toString(), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L).toString(), (extension?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallExA(infhandle: COpaquePointer?, infsectionname: Pcstr, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallExA((infhandle?.value ?: 0L).toString(), (infsectionname?.value ?: 0L).toString(), (alternateplatforminfo?.value ?: 0L).toString(), (infsectionwithext?.value ?: 0L).toString(), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L).toString(), (extension?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallExW(infhandle: COpaquePointer?, infsectionname: Pcwstr, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallExW((infhandle?.value ?: 0L).toString(), (infsectionname?.value ?: 0L).toString(), (alternateplatforminfo?.value ?: 0L).toString(), (infsectionwithext?.value ?: 0L).toString(), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L).toString(), (extension?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallW(infhandle: COpaquePointer?, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallW((infhandle?.value ?: 0L).toString(), (infsectionname?.value ?: 0L).toString(), (infsectionwithext?.value ?: 0L).toString(), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L).toString(), (extension?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassBitmapIndex(classguid: COpaquePointer?, miniiconindex: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassBitmapIndex((classguid?.value ?: 0L).toString(), (miniiconindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionA(classguid: COpaquePointer?, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionA((classguid?.value ?: 0L).toString(), (classdescription?.value ?: 0L).toString(), classdescriptionsize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionExA(classguid: COpaquePointer?, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionExA((classguid?.value ?: 0L).toString(), (classdescription?.value ?: 0L).toString(), classdescriptionsize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionExW(classguid: COpaquePointer?, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionExW((classguid?.value ?: 0L).toString(), (classdescription?.value ?: 0L).toString(), classdescriptionsize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionW(classguid: COpaquePointer?, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionW((classguid?.value ?: 0L).toString(), (classdescription?.value ?: 0L).toString(), classdescriptionsize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertysheetheader: COpaquePointer?, propertysheetheaderpagelistsize: UInt, requiredsize: COpaquePointer?, propertysheettype: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevPropertySheetsA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (propertysheetheader?.value ?: 0L).toString(), propertysheetheaderpagelistsize.toInt(), (requiredsize?.value ?: 0L).toString(), propertysheettype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertysheetheader: COpaquePointer?, propertysheetheaderpagelistsize: UInt, requiredsize: COpaquePointer?, propertysheettype: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevPropertySheetsW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (propertysheetheader?.value ?: 0L).toString(), propertysheetheaderpagelistsize.toInt(), (requiredsize?.value ?: 0L).toString(), propertysheettype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsA(classguid: COpaquePointer?, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsA((classguid?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsExA(classguid: COpaquePointer?, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: COpaquePointer?): Hdevinfo =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsExA((classguid?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), flags.toInt(), deviceinfoset.toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsExW(classguid: COpaquePointer?, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: COpaquePointer?): Hdevinfo =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsExW((classguid?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), flags.toInt(), deviceinfoset.toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsW(classguid: COpaquePointer?, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsW((classguid?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageIndex(classimagelistdata: COpaquePointer?, classguid: COpaquePointer?, imageindex: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageIndex((classimagelistdata?.value ?: 0L).toString(), (classguid?.value ?: 0L).toString(), (imageindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageList(classimagelistdata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageList((classimagelistdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageListExA(classimagelistdata: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageListExA((classimagelistdata?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageListExW(classimagelistdata: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageListExW((classimagelistdata?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassInstallParamsA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (classinstallparams?.value ?: 0L).toString(), classinstallparamssize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassInstallParamsW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (classinstallparams?.value ?: 0L).toString(), classinstallparamssize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyExW((classguid?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString(), flags.toInt(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyKeys(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyKeys((classguid?.value ?: 0L).toString(), (propertykeyarray?.value ?: 0L).toString(), propertykeycount.toInt(), (requiredpropertykeycount?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyKeysExW(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyKeysExW((classguid?.value ?: 0L).toString(), (propertykeyarray?.value ?: 0L).toString(), propertykeycount.toInt(), (requiredpropertykeycount?.value ?: 0L).toString(), flags.toInt(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyW((classguid?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassRegistryPropertyA(classguid: COpaquePointer?, property: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassRegistryPropertyA((classguid?.value ?: 0L).toString(), property.toInt(), (propertyregdatatype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassRegistryPropertyW(classguid: COpaquePointer?, property: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassRegistryPropertyW((classguid?.value ?: 0L).toString(), property.toInt(), (propertyregdatatype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetCustomDevicePropertyA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (custompropertyname?.value ?: 0L).toString(), flags.toInt(), (propertyregdatatype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetCustomDevicePropertyW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (custompropertyname?.value ?: 0L).toString(), flags.toInt(), (propertyregdatatype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListClass(deviceinfoset.toString(), (classguid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListDetailA(deviceinfoset.toString(), (deviceinfosetdetaildata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListDetailW(deviceinfoset.toString(), (deviceinfosetdetaildata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstallParamsA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (deviceinstallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstallParamsW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (deviceinstallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstanceIdA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (deviceinstanceid?.value ?: 0L).toString(), deviceinstanceidsize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstanceIdW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (deviceinstanceid?.value ?: 0L).toString(), deviceinstanceidsize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliasdeviceinterfacedata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceAlias(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), (aliasinterfaceclassguid?.value ?: 0L).toString(), (aliasdeviceinterfacedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, deviceinterfacedetaildata: COpaquePointer?, deviceinterfacedetaildatasize: UInt, requiredsize: COpaquePointer?, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceDetailA(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), (deviceinterfacedetaildata?.value ?: 0L).toString(), deviceinterfacedetaildatasize.toInt(), (requiredsize?.value ?: 0L).toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, deviceinterfacedetaildata: COpaquePointer?, deviceinterfacedetaildatasize: UInt, requiredsize: COpaquePointer?, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceDetailW(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), (deviceinterfacedetaildata?.value ?: 0L).toString(), deviceinterfacedetaildatasize.toInt(), (requiredsize?.value ?: 0L).toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfacePropertyKeys(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), (propertykeyarray?.value ?: 0L).toString(), propertykeycount.toInt(), (requiredpropertykeycount?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfacePropertyW(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDevicePropertyKeys(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (propertykeyarray?.value ?: 0L).toString(), propertykeycount.toInt(), (requiredpropertykeycount?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDevicePropertyW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), (propertytype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceRegistryPropertyA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), property.toInt(), (propertyregdatatype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceRegistryPropertyW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), property.toInt(), (propertyregdatatype?.value ?: 0L).toString(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinfodetaildata: COpaquePointer?, driverinfodetaildatasize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInfoDetailA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString(), (driverinfodetaildata?.value ?: 0L).toString(), driverinfodetaildatasize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinfodetaildata: COpaquePointer?, driverinfodetaildatasize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInfoDetailW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString(), (driverinfodetaildata?.value ?: 0L).toString(), driverinfodetaildatasize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInstallParamsA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString(), (driverinstallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInstallParamsW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString(), (driverinstallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameA(hwprofile.toInt(), (friendlyname?.value ?: 0L).toString(), friendlynamesize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameExA(hwprofile.toInt(), (friendlyname?.value ?: 0L).toString(), friendlynamesize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameExW(hwprofile.toInt(), (friendlyname?.value ?: 0L).toString(), friendlynamesize.toInt(), (requiredsize?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameW(hwprofile.toInt(), (friendlyname?.value ?: 0L).toString(), friendlynamesize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileList(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileList((hwprofilelist?.value ?: 0L).toString(), hwprofilelistsize.toInt(), (requiredsize?.value ?: 0L).toString(), (currentlyactiveindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileListExA(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileListExA((hwprofilelist?.value ?: 0L).toString(), hwprofilelistsize.toInt(), (requiredsize?.value ?: 0L).toString(), (currentlyactiveindex?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileListExW(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileListExW((hwprofilelist?.value ?: 0L).toString(), hwprofilelistsize.toInt(), (requiredsize?.value ?: 0L).toString(), (currentlyactiveindex?.value ?: 0L).toString(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetINFClassA(infname: Pcstr, classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetINFClassA((infname?.value ?: 0L).toString(), (classguid?.value ?: 0L).toString(), (classname?.value ?: 0L).toString(), classnamesize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetINFClassW(infname: Pcwstr, classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetINFClassW((infname?.value ?: 0L).toString(), (classguid?.value ?: 0L).toString(), (classname?.value ?: 0L).toString(), classnamesize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDevice(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDriverA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDriverW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, installwizarddata: COpaquePointer?, pagetype: UInt, flags: UInt): Hpropsheetpage =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetWizardPage(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (installwizarddata?.value ?: 0L).toString(), pagetype.toInt(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassA((hwndparent?.value ?: 0L).toString(), (inffilename?.value ?: 0L).toString(), flags.toInt(), (filequeue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: COpaquePointer?, interfaceclassguid: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassExA((hwndparent?.value ?: 0L).toString(), (inffilename?.value ?: 0L).toString(), flags.toInt(), (filequeue?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), (reserved2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: COpaquePointer?, interfaceclassguid: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassExW((hwndparent?.value ?: 0L).toString(), (inffilename?.value ?: 0L).toString(), flags.toInt(), (filequeue?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), (reserved2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassW((hwndparent?.value ?: 0L).toString(), (inffilename?.value ?: 0L).toString(), flags.toInt(), (filequeue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDevice(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDeviceInterfaces(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDriverFiles(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiLoadClassIcon(classguid: COpaquePointer?, largeicon: COpaquePointer?, miniiconindex: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiLoadClassIcon((classguid?.value ?: 0L).toString(), (largeicon?.value ?: 0L).toString(), (miniiconindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiLoadDeviceIcon(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), cxicon.toInt(), cyicon.toInt(), flags.toInt(), (hicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKey(classguid: COpaquePointer?, samdesired: UInt): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKey((classguid?.value ?: 0L).toString(), samdesired.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKeyExA(classguid: COpaquePointer?, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: COpaquePointer?): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKeyExA((classguid?.value ?: 0L).toString(), samdesired.toInt(), flags.toInt(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKeyExW(classguid: COpaquePointer?, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKeyExW((classguid?.value ?: 0L).toString(), samdesired.toInt(), flags.toInt(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDevRegKey(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), samdesired.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInfoA(deviceinfoset.toString(), (deviceinstanceid?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), openflags.toInt(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInfoW(deviceinfoset.toString(), (deviceinstanceid?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), openflags.toInt(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceA(deviceinfoset.toString(), (devicepath?.value ?: 0L).toString(), openflags.toInt(), (deviceinterfacedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt): Hkey =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceRegKey(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), reserved.toInt(), samdesired.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceW(deviceinfoset.toString(), (devicepath?.value ?: 0L).toString(), openflags.toInt(), (deviceinterfacedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRegisterCoDeviceInstallers(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: COpaquePointer?, dupdeviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRegisterDeviceInfo(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), flags.toInt(), 0L.toString(), (comparecontext?.value ?: 0L).toString(), (dupdeviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRemoveDevice(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRemoveDeviceInterface(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRestartDevices(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectBestCompatDrv(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectDevice(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectOEMDrv((hwndparent?.value ?: 0L).toString(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassInstallParamsA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (classinstallparams?.value ?: 0L).toString(), classinstallparamssize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassInstallParamsW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (classinstallparams?.value ?: 0L).toString(), classinstallparamssize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassPropertyExW((classguid?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), flags.toInt(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassPropertyW((classguid?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassRegistryPropertyA(classguid: COpaquePointer?, property: UInt, propertybuffer: COpaquePointer?, propertybuffersize: UInt, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassRegistryPropertyA((classguid?.value ?: 0L).toString(), property.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassRegistryPropertyW(classguid: COpaquePointer?, property: UInt, propertybuffer: COpaquePointer?, propertybuffersize: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassRegistryPropertyW((classguid?.value ?: 0L).toString(), property.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), (machinename?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInstallParamsA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (deviceinstallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInstallParamsW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (deviceinstallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, flags: UInt, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInterfaceDefault(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), flags.toInt(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInterfacePropertyW(deviceinfoset.toString(), (deviceinterfacedata?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDevicePropertyW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), propertytype.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertybuffer: COpaquePointer?, propertybuffersize: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceRegistryPropertyA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), property.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertybuffer: COpaquePointer?, propertybuffersize: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceRegistryPropertyW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), property.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDriverInstallParamsA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString(), (driverinstallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDriverInstallParamsW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString(), (driverinstallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDevice(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDriverA(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDriverW(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (driverinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiUnremoveDevice(deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDuplicateDiskSpaceListA(diskspace: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDuplicateDiskSpaceListA((diskspace?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDuplicateDiskSpaceListW(diskspace: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDuplicateDiskSpaceListW((diskspace?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupEnumInfSectionsA(infhandle: COpaquePointer?, index: UInt, buffer: Pstr, size: UInt, sizeneeded: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupEnumInfSectionsA((infhandle?.value ?: 0L).toString(), index.toInt(), (buffer?.value ?: 0L).toString(), size.toInt(), (sizeneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupEnumInfSectionsW(infhandle: COpaquePointer?, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupEnumInfSectionsW((infhandle?.value ?: 0L).toString(), index.toInt(), (buffer?.value ?: 0L).toString(), size.toInt(), (sizeneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindFirstLineA(infhandle: COpaquePointer?, section: Pcstr, key: Pcstr, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindFirstLineA((infhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindFirstLineW(infhandle: COpaquePointer?, section: Pcwstr, key: Pcwstr, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindFirstLineW((infhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextLine(contextin: COpaquePointer?, contextout: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextLine((contextin?.value ?: 0L).toString(), (contextout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextMatchLineA(contextin: COpaquePointer?, key: Pcstr, contextout: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextMatchLineA((contextin?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (contextout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextMatchLineW(contextin: COpaquePointer?, key: Pcwstr, contextout: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextMatchLineW((contextin?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (contextout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFreeSourceListA(list: COpaquePointer?, count: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFreeSourceListA((list?.value ?: 0L).toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFreeSourceListW(list: COpaquePointer?, count: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFreeSourceListW((list?.value ?: 0L).toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBackupInformationA(queuehandle: COpaquePointer?, backupparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBackupInformationA((queuehandle?.value ?: 0L).toString(), (backupparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBackupInformationW(queuehandle: COpaquePointer?, backupparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBackupInformationW((queuehandle?.value ?: 0L).toString(), (backupparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBinaryField(context: COpaquePointer?, fieldindex: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBinaryField((context?.value ?: 0L).toString(), fieldindex.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFieldCount(context: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFieldCount((context?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoA((sourcefilename?.value ?: 0L).toString(), (actualsourcefilename?.value ?: 0L).toString(), (sourcefilesize?.value ?: 0L).toString(), (targetfilesize?.value ?: 0L).toString(), (compressiontype?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoExA((sourcefilename?.value ?: 0L).toString(), (actualsourcefilenamebuffer?.value ?: 0L).toString(), actualsourcefilenamebufferlen.toInt(), (requiredbufferlen?.value ?: 0L).toString(), (sourcefilesize?.value ?: 0L).toString(), (targetfilesize?.value ?: 0L).toString(), (compressiontype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoExW((sourcefilename?.value ?: 0L).toString(), (actualsourcefilenamebuffer?.value ?: 0L).toString(), actualsourcefilenamebufferlen.toInt(), (requiredbufferlen?.value ?: 0L).toString(), (sourcefilesize?.value ?: 0L).toString(), (targetfilesize?.value ?: 0L).toString(), (compressiontype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoW((sourcefilename?.value ?: 0L).toString(), (actualsourcefilename?.value ?: 0L).toString(), (sourcefilesize?.value ?: 0L).toString(), (targetfilesize?.value ?: 0L).toString(), (compressiontype?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileQueueCount(filequeue: COpaquePointer?, subqueuefileop: UInt, numoperations: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileQueueCount((filequeue?.value ?: 0L).toString(), subqueuefileop.toInt(), (numoperations?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileQueueFlags(filequeue: COpaquePointer?, flags: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileQueueFlags((filequeue?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: COpaquePointer?, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfDriverStoreLocationA((filename?.value ?: 0L).toString(), (alternateplatforminfo?.value ?: 0L).toString(), (localename?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: COpaquePointer?, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfDriverStoreLocationW((filename?.value ?: 0L).toString(), (alternateplatforminfo?.value ?: 0L).toString(), (localename?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfFileListA((directorypath?.value ?: 0L).toString(), infstyle.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfFileListW((directorypath?.value ?: 0L).toString(), infstyle.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfInformationA(infspec: COpaquePointer?, searchcontrol: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfInformationA((infspec?.value ?: 0L).toString(), searchcontrol.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfInformationW(infspec: COpaquePointer?, searchcontrol: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfInformationW((infspec?.value ?: 0L).toString(), searchcontrol.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfPublishedNameA((driverstorelocation?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfPublishedNameW((driverstorelocation?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetIntField(context: COpaquePointer?, fieldindex: UInt, integervalue: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetIntField((context?.value ?: 0L).toString(), fieldindex.toInt(), (integervalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineByIndexA(infhandle: COpaquePointer?, section: Pcstr, index: UInt, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineByIndexA((infhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), index.toInt(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineByIndexW(infhandle: COpaquePointer?, section: Pcwstr, index: UInt, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineByIndexW((infhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), index.toInt(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineCountA(infhandle: COpaquePointer?, section: Pcstr): Int =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineCountA((infhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineCountW(infhandle: COpaquePointer?, section: Pcwstr): Int =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineCountW((infhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineTextA(context: COpaquePointer?, infhandle: COpaquePointer?, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineTextA((context?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineTextW(context: COpaquePointer?, infhandle: COpaquePointer?, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineTextW((context?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetMultiSzFieldA(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetMultiSzFieldA((context?.value ?: 0L).toString(), fieldindex.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetMultiSzFieldW(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetMultiSzFieldW((context?.value ?: 0L).toString(), fieldindex.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetNonInteractiveMode(): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetNonInteractiveMode() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileLocationA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcstr, sourceid: COpaquePointer?, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileLocationA((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (sourceid?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileLocationW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcwstr, sourceid: COpaquePointer?, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileLocationW((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (sourceid?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileSizeA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcstr, section: Pcstr, filesize: COpaquePointer?, roundingfactor: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileSizeA((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), (filesize?.value ?: 0L).toString(), roundingfactor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileSizeW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcwstr, section: Pcwstr, filesize: COpaquePointer?, roundingfactor: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileSizeW((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), (filesize?.value ?: 0L).toString(), roundingfactor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceInfoA(infhandle: COpaquePointer?, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceInfoA((infhandle?.value ?: 0L).toString(), sourceid.toInt(), infodesired.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceInfoW(infhandle: COpaquePointer?, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceInfoW((infhandle?.value ?: 0L).toString(), sourceid.toInt(), infodesired.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetStringFieldA(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetStringFieldA((context?.value ?: 0L).toString(), fieldindex.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetStringFieldW(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetStringFieldW((context?.value ?: 0L).toString(), fieldindex.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetTargetPathA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetTargetPathA((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetTargetPathW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetTargetPathW((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetThreadLogToken(): ULong =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetThreadLogToken() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitDefaultQueueCallback((ownerwindow?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitDefaultQueueCallbackEx((ownerwindow?.value ?: 0L).toString(), (alternateprogresswindow?.value ?: 0L).toString(), progressmessage.toInt(), reserved1.toInt(), (reserved2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitializeFileLogA((logfilename?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitializeFileLogW((logfilename?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileA((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (sourcepathroot?.value ?: 0L).toString(), (destinationname?.value ?: 0L).toString(), copystyle.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileExA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: COpaquePointer?, filewasinuse: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileExA((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (sourcepathroot?.value ?: 0L).toString(), (destinationname?.value ?: 0L).toString(), copystyle.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), (filewasinuse?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileExW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: COpaquePointer?, filewasinuse: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileExW((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (sourcepathroot?.value ?: 0L).toString(), (destinationname?.value ?: 0L).toString(), copystyle.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), (filewasinuse?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileW((infhandle?.value ?: 0L).toString(), (infcontext?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (sourcepathroot?.value ?: 0L).toString(), (destinationname?.value ?: 0L).toString(), copystyle.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFilesFromInfSectionA(infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, filequeue: COpaquePointer?, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFilesFromInfSectionA((infhandle?.value ?: 0L).toString(), (layoutinfhandle?.value ?: 0L).toString(), (filequeue?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), copyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFilesFromInfSectionW(infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, filequeue: COpaquePointer?, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFilesFromInfSectionW((infhandle?.value ?: 0L).toString(), (layoutinfhandle?.value ?: 0L).toString(), (filequeue?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), copyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: COpaquePointer?, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: COpaquePointer?, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFromInfSectionA((owner?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), flags.toInt(), (relativekeyroot?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), copyflags.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: COpaquePointer?, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: COpaquePointer?, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFromInfSectionW((owner?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), flags.toInt(), (relativekeyroot?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), copyflags.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: SpsvcinstFlags): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionA((infhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionExA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionExA((infhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), flags.toInt(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), (reserved2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionExW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionExW((infhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), flags.toInt(), deviceinfoset.toString(), (deviceinfodata?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), (reserved2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionW((infhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupIterateCabinetA((cabinetfile?.value ?: 0L).toString(), reserved.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupIterateCabinetW((cabinetfile?.value ?: 0L).toString(), reserved.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogErrorA((messagestring?.value ?: 0L).toString(), severity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogErrorW((messagestring?.value ?: 0L).toString(), severity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogFileA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogFileA((fileloghandle?.value ?: 0L).toString(), (logsectionname?.value ?: 0L).toString(), (sourcefilename?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), checksum.toInt(), (disktagfile?.value ?: 0L).toString(), (diskdescription?.value ?: 0L).toString(), (otherinfo?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogFileW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogFileW((fileloghandle?.value ?: 0L).toString(), (logsectionname?.value ?: 0L).toString(), (sourcefilename?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), checksum.toInt(), (disktagfile?.value ?: 0L).toString(), (diskdescription?.value ?: 0L).toString(), (otherinfo?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: COpaquePointer?, errorline: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenAppendInfFileA((filename?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (errorline?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: COpaquePointer?, errorline: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenAppendInfFileW((filename?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (errorline?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenFileQueue(): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenFileQueue() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenInfFileA((filename?.value ?: 0L).toString(), (infclass?.value ?: 0L).toString(), infstyle.toInt(), (errorline?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenInfFileW((filename?.value ?: 0L).toString(), (infclass?.value ?: 0L).toString(), infstyle.toInt(), (errorline?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenLog(erase: Bool): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenLog(erase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenMasterInf(): COpaquePointer? =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenMasterInf() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPrepareQueueForRestoreA(queuehandle: COpaquePointer?, backuppath: Pcstr, restoreflags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPrepareQueueForRestoreA((queuehandle?.value ?: 0L).toString(), (backuppath?.value ?: 0L).toString(), restoreflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPrepareQueueForRestoreW(queuehandle: COpaquePointer?, backuppath: Pcwstr, restoreflags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPrepareQueueForRestoreW((queuehandle?.value ?: 0L).toString(), (backuppath?.value ?: 0L).toString(), restoreflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptForDiskA((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (diskname?.value ?: 0L).toString(), (pathtosource?.value ?: 0L).toString(), (filesought?.value ?: 0L).toString(), (tagfile?.value ?: 0L).toString(), diskpromptstyle.toInt(), (pathbuffer?.value ?: 0L).toString(), pathbuffersize.toInt(), (pathrequiredsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptForDiskW((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (diskname?.value ?: 0L).toString(), (pathtosource?.value ?: 0L).toString(), (filesought?.value ?: 0L).toString(), (tagfile?.value ?: 0L).toString(), diskpromptstyle.toInt(), (pathbuffer?.value ?: 0L).toString(), pathbuffersize.toInt(), (pathrequiredsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptReboot(filequeue: COpaquePointer?, owner: Hwnd, scanonly: Bool): Int =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptReboot((filequeue?.value ?: 0L).toString(), (owner?.value ?: 0L).toString(), scanonly) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryDrivesInDiskSpaceListA(diskspace: COpaquePointer?, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryDrivesInDiskSpaceListA((diskspace?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryDrivesInDiskSpaceListW(diskspace: COpaquePointer?, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryDrivesInDiskSpaceListW((diskspace?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryFileLogA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryFileLogA((fileloghandle?.value ?: 0L).toString(), (logsectionname?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), desiredinfo, (dataout?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryFileLogW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryFileLogW((fileloghandle?.value ?: 0L).toString(), (logsectionname?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), desiredinfo, (dataout?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfFileInformationA(infinformation: COpaquePointer?, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfFileInformationA((infinformation?.value ?: 0L).toString(), infindex.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfFileInformationW(infinformation: COpaquePointer?, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfFileInformationW((infinformation?.value ?: 0L).toString(), infindex.toInt(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfOriginalFileInformationA(infinformation: COpaquePointer?, infindex: UInt, alternateplatforminfo: COpaquePointer?, originalfileinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfOriginalFileInformationA((infinformation?.value ?: 0L).toString(), infindex.toInt(), (alternateplatforminfo?.value ?: 0L).toString(), (originalfileinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfOriginalFileInformationW(infinformation: COpaquePointer?, infindex: UInt, alternateplatforminfo: COpaquePointer?, originalfileinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfOriginalFileInformationW((infinformation?.value ?: 0L).toString(), infindex.toInt(), (alternateplatforminfo?.value ?: 0L).toString(), (originalfileinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfVersionInformationA(infinformation: COpaquePointer?, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfVersionInformationA((infinformation?.value ?: 0L).toString(), infindex.toInt(), (key?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfVersionInformationW(infinformation: COpaquePointer?, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfVersionInformationW((infinformation?.value ?: 0L).toString(), infindex.toInt(), (key?.value ?: 0L).toString(), (returnbuffer?.value ?: 0L).toString(), returnbuffersize.toInt(), (requiredsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySourceListA(flags: UInt, list: COpaquePointer?, count: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySourceListA(flags.toInt(), (list?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySourceListW(flags: UInt, list: COpaquePointer?, count: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySourceListW(flags.toInt(), (list?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySpaceRequiredOnDriveA(diskspace: COpaquePointer?, drivespec: Pcstr, spacerequired: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySpaceRequiredOnDriveA((diskspace?.value ?: 0L).toString(), (drivespec?.value ?: 0L).toString(), (spacerequired?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySpaceRequiredOnDriveW(diskspace: COpaquePointer?, drivespec: Pcwstr, spacerequired: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySpaceRequiredOnDriveW((diskspace?.value ?: 0L).toString(), (drivespec?.value ?: 0L).toString(), (spacerequired?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyA(queuehandle: COpaquePointer?, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyA((queuehandle?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), (sourcepath?.value ?: 0L).toString(), (sourcefilename?.value ?: 0L).toString(), (sourcedescription?.value ?: 0L).toString(), (sourcetagfile?.value ?: 0L).toString(), (targetdirectory?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyIndirectA(copyparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyIndirectA((copyparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyIndirectW(copyparams: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyIndirectW((copyparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopySectionA(queuehandle: COpaquePointer?, sourcerootpath: Pcstr, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr, copystyle: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopySectionA((queuehandle?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopySectionW(queuehandle: COpaquePointer?, sourcerootpath: Pcwstr, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr, copystyle: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopySectionW((queuehandle?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyW(queuehandle: COpaquePointer?, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyW((queuehandle?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), (sourcepath?.value ?: 0L).toString(), (sourcefilename?.value ?: 0L).toString(), (sourcedescription?.value ?: 0L).toString(), (sourcetagfile?.value ?: 0L).toString(), (targetdirectory?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDefaultCopyA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDefaultCopyA((queuehandle?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), (sourcefilename?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDefaultCopyW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDefaultCopyW((queuehandle?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (sourcerootpath?.value ?: 0L).toString(), (sourcefilename?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteA(queuehandle: COpaquePointer?, pathpart1: Pcstr, pathpart2: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteA((queuehandle?.value ?: 0L).toString(), (pathpart1?.value ?: 0L).toString(), (pathpart2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteSectionA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteSectionA((queuehandle?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteSectionW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteSectionW((queuehandle?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteW(queuehandle: COpaquePointer?, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteW((queuehandle?.value ?: 0L).toString(), (pathpart1?.value ?: 0L).toString(), (pathpart2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameA(queuehandle: COpaquePointer?, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameA((queuehandle?.value ?: 0L).toString(), (sourcepath?.value ?: 0L).toString(), (sourcefilename?.value ?: 0L).toString(), (targetpath?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameSectionA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameSectionA((queuehandle?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameSectionW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameSectionW((queuehandle?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (section?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameW(queuehandle: COpaquePointer?, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameW((queuehandle?.value ?: 0L).toString(), (sourcepath?.value ?: 0L).toString(), (sourcefilename?.value ?: 0L).toString(), (targetpath?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFileLogEntryA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, targetfilename: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFileLogEntryA((fileloghandle?.value ?: 0L).toString(), (logsectionname?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFileLogEntryW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFileLogEntryW((fileloghandle?.value ?: 0L).toString(), (logsectionname?.value ?: 0L).toString(), (targetfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromDiskSpaceListA(diskspace: COpaquePointer?, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromDiskSpaceListA((diskspace?.value ?: 0L).toString(), (targetfilespec?.value ?: 0L).toString(), operation.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromDiskSpaceListW(diskspace: COpaquePointer?, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromDiskSpaceListW((diskspace?.value ?: 0L).toString(), (targetfilespec?.value ?: 0L).toString(), operation.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromSourceListA(flags.toInt(), (source?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromSourceListW(flags.toInt(), (source?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveInstallSectionFromDiskSpaceListA((diskspace?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (layoutinfhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcwstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveInstallSectionFromDiskSpaceListW((diskspace?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (layoutinfhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveSectionFromDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveSectionFromDiskSpaceListA((diskspace?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), operation.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveSectionFromDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveSectionFromDiskSpaceListW((diskspace?.value ?: 0L).toString(), (infhandle?.value ?: 0L).toString(), (listinfhandle?.value ?: 0L).toString(), (sectionname?.value ?: 0L).toString(), operation.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRenameErrorA((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (targetfile?.value ?: 0L).toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRenameErrorW((hwndparent?.value ?: 0L).toString(), (dialogtitle?.value ?: 0L).toString(), (sourcefile?.value ?: 0L).toString(), (targetfile?.value ?: 0L).toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupScanFileQueueA(filequeue: COpaquePointer?, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: COpaquePointer?, result: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupScanFileQueueA((filequeue?.value ?: 0L).toString(), flags.toInt(), (window?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupScanFileQueueW(filequeue: COpaquePointer?, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: COpaquePointer?, result: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupScanFileQueueW((filequeue?.value ?: 0L).toString(), flags.toInt(), (window?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdA(infhandle: COpaquePointer?, id: UInt, directory: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdA((infhandle?.value ?: 0L).toString(), id.toInt(), (directory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdExA(infhandle: COpaquePointer?, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdExA((infhandle?.value ?: 0L).toString(), id.toInt(), (directory?.value ?: 0L).toString(), flags.toInt(), reserved1.toInt(), (reserved2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdExW(infhandle: COpaquePointer?, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdExW((infhandle?.value ?: 0L).toString(), id.toInt(), (directory?.value ?: 0L).toString(), flags.toInt(), reserved1.toInt(), (reserved2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdW(infhandle: COpaquePointer?, id: UInt, directory: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdW((infhandle?.value ?: 0L).toString(), id.toInt(), (directory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueAlternatePlatformA(queuehandle: COpaquePointer?, alternateplatforminfo: COpaquePointer?, alternatedefaultcatalogfile: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueAlternatePlatformA((queuehandle?.value ?: 0L).toString(), (alternateplatforminfo?.value ?: 0L).toString(), (alternatedefaultcatalogfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueAlternatePlatformW(queuehandle: COpaquePointer?, alternateplatforminfo: COpaquePointer?, alternatedefaultcatalogfile: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueAlternatePlatformW((queuehandle?.value ?: 0L).toString(), (alternateplatforminfo?.value ?: 0L).toString(), (alternatedefaultcatalogfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueFlags(filequeue: COpaquePointer?, flagmask: UInt, flags: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueFlags((filequeue?.value ?: 0L).toString(), flagmask.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetNonInteractiveMode(noninteractiveflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetPlatformPathOverrideA(override: Pcstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetPlatformPathOverrideA((override?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetPlatformPathOverrideW((override?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetSourceListA(flags: UInt, sourcelist: COpaquePointer?, sourcecount: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetSourceListA(flags.toInt(), (sourcelist?.value ?: 0L).toString(), sourcecount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetSourceListW(flags: UInt, sourcelist: COpaquePointer?, sourcecount: UInt): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetSourceListW(flags.toInt(), (sourcelist?.value ?: 0L).toString(), sourcecount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetThreadLogToken(logtoken: ULong) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetThreadLogToken(logtoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupTermDefaultQueueCallback(context: COpaquePointer?) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupTermDefaultQueueCallback((context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupTerminateFileLog(fileloghandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupTerminateFileLog((fileloghandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallNewlyCopiedInfs(filequeue: COpaquePointer?, flags: UInt, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallNewlyCopiedInfs((filequeue?.value ?: 0L).toString(), flags.toInt(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallOEMInfA((inffilename?.value ?: 0L).toString(), flags.toInt(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallOEMInfW((inffilename?.value ?: 0L).toString(), flags.toInt(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: COpaquePointer?, infsignerinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupVerifyInfFileA((infname?.value ?: 0L).toString(), (altplatforminfo?.value ?: 0L).toString(), (infsignerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: COpaquePointer?, infsignerinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupVerifyInfFileW((infname?.value ?: 0L).toString(), (altplatforminfo?.value ?: 0L).toString(), (infsignerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLog(logtoken.toString(), category.toInt(), flags.toInt(), (messagestr?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLogError(logtoken.toString(), category.toInt(), logflags.toInt(), error.toInt(), (messagestr?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: COpaquePointer?, context: COpaquePointer?) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLogInfLine(logtoken.toString(), flags.toInt(), (infhandle?.value ?: 0L).toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_updateDriverForPlugAndPlayDevicesA((hwndparent?.value ?: 0L).toString(), (hardwareid?.value ?: 0L).toString(), (fullinfpath?.value ?: 0L).toString(), installflags.toInt(), (brebootrequired?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_updateDriverForPlugAndPlayDevicesW((hwndparent?.value ?: 0L).toString(), (hardwareid?.value ?: 0L).toString(), (fullinfpath?.value ?: 0L).toString(), installflags.toInt(), (brebootrequired?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
