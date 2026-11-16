@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32DevicesDeviceanddriverinstallationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(dwtimeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddEmptyLogConf(plclogconf: MutPtr, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf(plclogconf.rawAddress.toString(), dndevinst.toInt(), priority, ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddEmptyLogConfEx(plclogconf: MutPtr, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx(plclogconf.rawAddress.toString(), dndevinst.toInt(), priority, ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda(dndevinst.toInt(), pszid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw(dndevinst.toInt(), pszid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA(dndevinst.toInt(), pszid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW(dndevinst.toInt(), pszid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddResDes(prdresdes: MutPtr, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes(prdresdes.rawAddress.toString(), lclogconf.toString(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddResDesEx(prdresdes: MutPtr, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx(prdresdes.rawAddress.toString(), lclogconf.toString(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmConnectMachineA(uncservername: Pcstr, phmachine: MutPtr): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA(uncservername.rawAddress.toString(), phmachine.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmConnectMachineW(uncservername: Pcwstr, phmachine: MutPtr): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW(uncservername.rawAddress.toString(), phmachine.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeA(pdndevinst: MutPtr, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), dnparent.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeW(pdndevinst: MutPtr, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), dnparent.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeExA(pdndevinst: MutPtr, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), dnparent.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeExW(pdndevinst: MutPtr, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), dnparent.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateRangeList(prlh: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList(prlh.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteClassKey(classguid: ConstPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey(classguid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteClassKeyEx(classguid: ConstPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx(classguid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA(pszdeviceinterface.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW(pszdeviceinterface.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA(pszdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW(pszdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, pbconflictdetected: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict(dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), pbconflictdetected.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, pbconflictdetected: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx(dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), pbconflictdetected.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisconnectMachine(hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(rlhold.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateClasses(ulclassindex: UInt, classguid: MutPtr, ulflags: CmEnumerateFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses(ulclassindex.toInt(), classguid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: MutPtr, ulflags: CmEnumerateFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx(ulclassindex.toInt(), classguid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA(ulenumindex.toInt(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW(ulenumindex.toInt(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA(ulenumindex.toInt(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW(ulenumindex.toInt(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFindRange(pullstart: MutPtr, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange(pullstart.rawAddress.toString(), ullstart.toString(), ullength.toInt(), ullalignment.toString(), ullend.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFirstRange(rlh: ULong, pullstart: MutPtr, pullend: MutPtr, preelement: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange(rlh.toString(), pullstart.rawAddress.toString(), pullend.rawAddress.toString(), preelement.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(lclogconftobefreed.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(lclogconftobefreed.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConfHandle(lclogconf: ULong): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(lclogconf.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDes(prdresdes: MutPtr, rdresdes: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes(prdresdes.rawAddress.toString(), rdresdes.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDesEx(prdresdes: MutPtr, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx(prdresdes.rawAddress.toString(), rdresdes.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDesHandle(rdresdes: ULong): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(rdresdes.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(clconflictlist.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetChild(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetChildEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameA(classguid: ConstPtr, pszkeyname: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA(classguid.rawAddress.toString(), pszkeyname.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameW(classguid: ConstPtr, pszkeyname: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW(classguid.rawAddress.toString(), pszkeyname.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameExA(classguid: ConstPtr, pszkeyname: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA(classguid.rawAddress.toString(), pszkeyname.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameExW(classguid: ConstPtr, pszkeyname: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW(classguid.rawAddress.toString(), pszkeyname.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameA(classguid: ConstPtr, buffer: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA(classguid.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameW(classguid: ConstPtr, buffer: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW(classguid.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameExA(classguid: ConstPtr, buffer: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA(classguid.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameExW(classguid: ConstPtr, buffer: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW(classguid.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyKeys(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys(classguid.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyKeysEx(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx(classguid.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassRegistryPropertyA(classguid: ConstPtr, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA(classguid.rawAddress.toString(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassRegistryPropertyW(classguid: ConstPtr, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW(classguid.rawAddress.toString(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDepth(puldepth: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth(puldepth.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDepthEx(puldepth: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx(puldepth.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA(dndevinst.toInt(), pszcustompropertyname.rawAddress.toString(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW(dndevinst.toInt(), pszcustompropertyname.rawAddress.toString(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA(dndevinst.toInt(), pszcustompropertyname.rawAddress.toString(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW(dndevinst.toInt(), pszcustompropertyname.rawAddress.toString(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW(dndevinst.toInt(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW(dndevinst.toInt(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys(dndevinst.toInt(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx(dndevinst.toInt(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeStatus(pulstatus: MutPtr, pulproblemnumber: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus(pulstatus.rawAddress.toString(), pulproblemnumber.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeStatusEx(pulstatus: MutPtr, pulproblemnumber: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx(pulstatus.rawAddress.toString(), pulproblemnumber.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda(dndevinst.toInt(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw(dndevinst.toInt(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA(dndevinst.toInt(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW(dndevinst.toInt(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA(pszfilter.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW(pszfilter.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA(pszfilter.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW(pszfilter.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeA(pullen: MutPtr, pszfilter: Pcstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA(pullen.rawAddress.toString(), pszfilter.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeW(pullen: MutPtr, pszfilter: Pcwstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW(pullen.rawAddress.toString(), pszfilter.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeExA(pullen: MutPtr, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA(pullen.rawAddress.toString(), pszfilter.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeExW(pullen: MutPtr, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW(pullen.rawAddress.toString(), pszfilter.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdSize(pullen: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize(pullen.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdSizeEx(pullen: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx(pullen.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA(pszdeviceinterface.rawAddress.toString(), aliasinterfaceguid.rawAddress.toString(), pszaliasdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW(pszdeviceinterface.rawAddress.toString(), aliasinterfaceguid.rawAddress.toString(), pszaliasdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA(pszdeviceinterface.rawAddress.toString(), aliasinterfaceguid.rawAddress.toString(), pszaliasdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW(pszdeviceinterface.rawAddress.toString(), aliasinterfaceguid.rawAddress.toString(), pszaliasdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListA(interfaceclassguid: ConstPtr, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA(interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListW(interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW(interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListExA(interfaceclassguid: ConstPtr, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA(interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListExW(interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW(interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeA(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA(pullen.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeW(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW(pullen.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeExA(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA(pullen.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeExW(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW(pullen.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW(pszdeviceinterface.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW(pszdeviceinterface.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW(pszdeviceinterface.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetFirstLogConf(plclogconf: MutPtr, dndevinst: UInt, ulflags: CmLogConf): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf(plclogconf.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetFirstLogConfEx(plclogconf: MutPtr, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx(plclogconf.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetGlobalState(pulstate: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState(pulstate.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetGlobalStateEx(pulstate: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx(pulstate.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA(pdeviceid.rawAddress.toString(), ulhardwareprofile.toInt(), pulvalue.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW(pdeviceid.rawAddress.toString(), ulhardwareprofile.toInt(), pulvalue.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA(pdeviceid.rawAddress.toString(), ulhardwareprofile.toInt(), pulvalue.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW(pdeviceid.rawAddress.toString(), ulhardwareprofile.toInt(), pulvalue.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA(ulindex.toInt(), phwprofileinfo.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW(ulindex.toInt(), phwprofileinfo.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA(ulindex.toInt(), phwprofileinfo.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW(ulindex.toInt(), phwprofileinfo.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetLogConfPriority(lclogconf: ULong, ppriority: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority(lclogconf.toString(), ppriority.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx(lclogconf.toString(), ppriority.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextLogConf(plclogconf: MutPtr, lclogconf: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf(plclogconf.rawAddress.toString(), lclogconf.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextLogConfEx(plclogconf: MutPtr, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx(plclogconf.rawAddress.toString(), lclogconf.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextResDes(prdresdes: MutPtr, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes(prdresdes.rawAddress.toString(), rdresdes.toString(), forresource.toInt(), presourceid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextResDesEx(prdresdes: MutPtr, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx(prdresdes.rawAddress.toString(), rdresdes.toString(), forresource.toInt(), presourceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetParent(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetParentEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesData(rdresdes: ULong, buffer: MutPtr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData(rdresdes.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataEx(rdresdes: ULong, buffer: MutPtr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx(rdresdes.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataSize(pulsize: MutPtr, rdresdes: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize(pulsize.rawAddress.toString(), rdresdes.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataSizeEx(pulsize: MutPtr, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx(pulsize.rawAddress.toString(), rdresdes.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: MutPtr): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount(clconflictlist.toString(), pulcount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA(clconflictlist.toString(), ulindex.toInt(), pconflictdetails.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW(clconflictlist.toString(), ulindex.toInt(), pconflictdetails.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetSibling(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetSiblingEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetVersion(): UShort =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetVersionEx(hmachine: Long): UShort =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(hmachine.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(rlhold1.toString(), rlhold2.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(rlhold.toString(), rlhnew.toString(), ullmaxvalue.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsDockStationPresent(pbpresent: MutPtr): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent(pbpresent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsDockStationPresentEx(pbpresent: MutPtr, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx(pbpresent.rawAddress.toString(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsVersionAvailable(wversion: UShort): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(wversion.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(wversion.toInt(), hmachine.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeA(pdndevinst: MutPtr, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeW(pdndevinst: MutPtr, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeExA(pdndevinst: MutPtr, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeExW(pdndevinst: MutPtr, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(cmreturncode.toInt(), defaulterr.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(rlhold1.toString(), rlhold2.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmModifyResDes(prdresdes: MutPtr, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes(prdresdes.rawAddress.toString(), rdresdes.toString(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmModifyResDesEx(prdresdes: MutPtr, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx(prdresdes.rawAddress.toString(), rdresdes.toString(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmNextRange(preelement: MutPtr, pullstart: MutPtr, pullend: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange(preelement.rawAddress.toString(), pullstart.rawAddress.toString(), pullend.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyA(classguid: ConstPtr, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA(classguid.rawAddress.toString(), pszclassname.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkclass.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyW(classguid: ConstPtr, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW(classguid.rawAddress.toString(), pszclassname.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkclass.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyExA(classguid: ConstPtr, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA(classguid.rawAddress.toString(), pszclassname.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkclass.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyExW(classguid: ConstPtr, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW(classguid.rawAddress.toString(), pszclassname.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkclass.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA(pszdeviceinterface.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW(pszdeviceinterface.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA(pszdeviceinterface.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW(pszdeviceinterface.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA(dnancestor.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW(dnancestor.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA(dnancestor.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW(dnancestor.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeData(pdata: MutPtr, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData(pdata.rawAddress.toString(), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeDataEx(pdata: MutPtr, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx(pdata.rawAddress.toString(), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeSize(pulsize: MutPtr, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize(pulsize.rawAddress.toString(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeSizeEx(pulsize: MutPtr, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx(pulsize.rawAddress.toString(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(dnancestor.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryResourceConflictList(pclconflictlist: MutPtr, dndevinst: UInt, resourceid: CmRestype, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList(pclconflictlist.rawAddress.toString(), dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA(dndevinst.toInt(), interfaceclassguid.rawAddress.toString(), pszreference.rawAddress.toString(), pszdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW(dndevinst.toInt(), interfaceclassguid.rawAddress.toString(), pszreference.rawAddress.toString(), pszdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA(dndevinst.toInt(), interfaceclassguid.rawAddress.toString(), pszreference.rawAddress.toString(), pszdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW(dndevinst.toInt(), interfaceclassguid.rawAddress.toString(), pszreference.rawAddress.toString(), pszdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterNotification(pfilter: ConstPtr, pcontext: ConstPtr, pcallback: PcmNotifyCallback, pnotifycontext: MutPtr): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification(pfilter.rawAddress.toString(), pcontext.rawAddress.toString(), 0L.toString(), pnotifycontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(dnancestor.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA(dndevinst.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW(dndevinst.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA(dndevinst.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW(dndevinst.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestEjectPc(): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestEjectPcEx(hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRunDetection(ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassRegistryPropertyA(classguid: ConstPtr, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA(classguid.rawAddress.toString(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassRegistryPropertyW(classguid: ConstPtr, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW(classguid.rawAddress.toString(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW(dndevinst.toInt(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW(dndevinst.toInt(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW(pszdeviceinterface.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW(pszdeviceinterface.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(ulhardwareprofile.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(ulhardwareprofile.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA(pdeviceid.rawAddress.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW(pdeviceid.rawAddress.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA(pdeviceid.rawAddress.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW(pdeviceid.rawAddress.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA(pszdeviceinterface.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW(pszdeviceinterface.rawAddress.toString(), ulflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA(pszdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW(pszdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification(notifycontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, flags: DiinstalldeviceFlags, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice(hwndparent.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA(hwndparent.rawAddress.toString(), infpath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW(hwndparent.rawAddress.toString(), infpath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, flags: UInt, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice(hwndparent.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver(hwndparent.rawAddress.toString(), filepath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, flags: UInt, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice(hwndparent.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA(hwndparent.rawAddress.toString(), infpath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW(hwndparent.rawAddress.toString(), infpath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA(window.rawAddress.toString(), modulehandle.rawAddress.toString(), commandline.rawAddress.toString(), showcommand)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW(window.rawAddress.toString(), modulehandle.rawAddress.toString(), commandline.rawAddress.toString(), showcommand)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupAddInstallSectionToDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcstr, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddInstallSectionToDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcwstr, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddSectionToDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddSectionToDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToDiskSpaceListA(diskspace: ConstPtr, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA(diskspace.rawAddress.toString(), targetfilespec.rawAddress.toString(), filesize.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToDiskSpaceListW(diskspace: ConstPtr, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW(diskspace.rawAddress.toString(), targetfilespec.rawAddress.toString(), filesize.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA(flags.toInt(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW(flags.toInt(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAdjustDiskSpaceListA(diskspace: ConstPtr, driveroot: Pcstr, amount: Long, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA(diskspace.rawAddress.toString(), driveroot.rawAddress.toString(), amount.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAdjustDiskSpaceListW(diskspace: ConstPtr, driveroot: Pcwstr, amount: Long, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW(diskspace.rawAddress.toString(), driveroot.rawAddress.toString(), amount.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), sourcefile.rawAddress.toString(), targetfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), sourcefile.rawAddress.toString(), targetfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCancelTemporarySourceList(): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCloseFileQueue(queuehandle: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue(queuehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCloseInfFile(infhandle: ConstPtr) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile(infhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupCloseLog() {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupCommitFileQueueA(owner: Hwnd, queuehandle: ConstPtr, msghandler: PspFileCallbackA, context: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA(owner.rawAddress.toString(), queuehandle.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCommitFileQueueW(owner: Hwnd, queuehandle: ConstPtr, msghandler: PspFileCallbackW, context: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW(owner.rawAddress.toString(), queuehandle.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupConfigureWmiFromInfSectionA(infhandle: ConstPtr, sectionname: Pcstr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupConfigureWmiFromInfSectionW(infhandle: ConstPtr, sectionname: Pcwstr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), diskname.rawAddress.toString(), pathtosource.rawAddress.toString(), sourcefile.rawAddress.toString(), targetpathfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt(), pathbuffer.rawAddress.toString(), pathbuffersize.toInt(), pathrequiredsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), diskname.rawAddress.toString(), pathtosource.rawAddress.toString(), sourcefile.rawAddress.toString(), targetpathfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt(), pathbuffer.rawAddress.toString(), pathbuffersize.toInt(), pathrequiredsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: MutPtr, destinationinffilenamecomponent: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA(sourceinffilename.rawAddress.toString(), oemsourcemedialocation.rawAddress.toString(), oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename.rawAddress.toString(), destinationinffilenamesize.toInt(), requiredsize.rawAddress.toString(), destinationinffilenamecomponent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: MutPtr, destinationinffilenamecomponent: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW(sourceinffilename.rawAddress.toString(), oemsourcemedialocation.rawAddress.toString(), oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename.rawAddress.toString(), destinationinffilenamesize.toInt(), requiredsize.rawAddress.toString(), destinationinffilenamecomponent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCreateDiskSpaceListA(reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA(reserved1.rawAddress.toString(), reserved2.toInt(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCreateDiskSpaceListW(reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW(reserved1.rawAddress.toString(), reserved2.toInt(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: ConstPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA(sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), compressiontype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: ConstPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW(sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), compressiontype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDefaultQueueCallbackA(context: ConstPtr, notification: UInt, param1: ULong, param2: ULong): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA(context.rawAddress.toString(), notification.toInt(), param1.toString(), param2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDefaultQueueCallbackW(context: ConstPtr, notification: UInt, param1: ULong, param2: ULong): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW(context.rawAddress.toString(), notification.toInt(), param1.toString(), param2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), file.rawAddress.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), file.rawAddress.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDestroyDiskSpaceList(diskspace: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList(diskspace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoList(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList(flags.toInt(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA(flags.toInt(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW(flags.toInt(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, drivertype: SetupDiDriverType): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), drivertype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller(installfunction.toInt(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(deviceinfoset.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA(classname.rawAddress.toString(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA(classname.rawAddress.toString(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW(classname.rawAddress.toString(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW(classname.rawAddress.toString(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidA(classguid: ConstPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA(classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidExA(classguid: ConstPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA(classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidExW(classguid: ConstPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW(classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidW(classguid: ConstPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW(classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr, infsectionname: Pcstr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle.rawAddress.toString(), infsectionname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr, infsectionname: Pcwstr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle.rawAddress.toString(), infsectionname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: ConstPtr, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA(deviceinfoset.toString(), devicename.rawAddress.toString(), classguid.rawAddress.toString(), devicedescription.rawAddress.toString(), hwndparent.rawAddress.toString(), creationflags.toInt(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoList(classguid: ConstPtr, hwndparent: Hwnd): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList(classguid.rawAddress.toString(), hwndparent.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoListExA(classguid: ConstPtr, hwndparent: Hwnd, machinename: Pcstr, reserved: ConstPtr): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA(classguid.rawAddress.toString(), hwndparent.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoListExW(classguid: ConstPtr, hwndparent: Hwnd, machinename: Pcwstr, reserved: ConstPtr): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW(classguid.rawAddress.toString(), hwndparent.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: ConstPtr, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW(deviceinfoset.toString(), devicename.rawAddress.toString(), classguid.rawAddress.toString(), devicedescription.rawAddress.toString(), hwndparent.rawAddress.toString(), creationflags.toInt(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), referencestring.rawAddress.toString(), creationflags.toInt(), deviceinterfacedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt, infhandle: ConstPtr, infsectionname: Pcstr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), reserved.toInt(), samdesired.toInt(), infhandle.rawAddress.toString(), infsectionname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt, infhandle: ConstPtr, infsectionname: Pcwstr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), reserved.toInt(), samdesired.toInt(), infhandle.rawAddress.toString(), infsectionname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), referencestring.rawAddress.toString(), creationflags.toInt(), deviceinterfacedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyClassImageList(classimagelistdata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList(classimagelistdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(deviceinfoset.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), drivertype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo(deviceinfoset.toString(), memberindex.toInt(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, memberindex: UInt, deviceinterfacedata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), memberindex.toInt(), deviceinterfacedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), drivertype.toInt(), memberindex.toInt(), driverinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), drivertype.toInt(), memberindex.toInt(), driverinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualModelsSectionA(context: ConstPtr, alternateplatforminfo: ConstPtr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA(context.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualModelsSectionW(context: ConstPtr, alternateplatforminfo: ConstPtr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW(context.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallA(infhandle: ConstPtr, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA(infhandle.rawAddress.toString(), infsectionname.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), extension.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallExA(infhandle: ConstPtr, infsectionname: Pcstr, alternateplatforminfo: ConstPtr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA(infhandle.rawAddress.toString(), infsectionname.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), extension.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallExW(infhandle: ConstPtr, infsectionname: Pcwstr, alternateplatforminfo: ConstPtr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW(infhandle.rawAddress.toString(), infsectionname.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), extension.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallW(infhandle: ConstPtr, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW(infhandle.rawAddress.toString(), infsectionname.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), extension.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassBitmapIndex(classguid: ConstPtr, miniiconindex: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex(classguid.rawAddress.toString(), miniiconindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionA(classguid: ConstPtr, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA(classguid.rawAddress.toString(), classdescription.rawAddress.toString(), classdescriptionsize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionExA(classguid: ConstPtr, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA(classguid.rawAddress.toString(), classdescription.rawAddress.toString(), classdescriptionsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionExW(classguid: ConstPtr, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW(classguid.rawAddress.toString(), classdescription.rawAddress.toString(), classdescriptionsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionW(classguid: ConstPtr, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW(classguid.rawAddress.toString(), classdescription.rawAddress.toString(), classdescriptionsize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertysheetheader: ConstPtr, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr, propertysheettype: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertysheetheader.rawAddress.toString(), propertysheetheaderpagelistsize.toInt(), requiredsize.rawAddress.toString(), propertysheettype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertysheetheader: ConstPtr, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr, propertysheettype: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertysheetheader.rawAddress.toString(), propertysheetheaderpagelistsize.toInt(), requiredsize.rawAddress.toString(), propertysheettype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsA(classguid: ConstPtr, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA(classguid.rawAddress.toString(), enumerator.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsExA(classguid: ConstPtr, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: ConstPtr): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA(classguid.rawAddress.toString(), enumerator.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt(), deviceinfoset.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsExW(classguid: ConstPtr, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: ConstPtr): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW(classguid.rawAddress.toString(), enumerator.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt(), deviceinfoset.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsW(classguid: ConstPtr, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW(classguid.rawAddress.toString(), enumerator.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageIndex(classimagelistdata: ConstPtr, classguid: ConstPtr, imageindex: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex(classimagelistdata.rawAddress.toString(), classguid.rawAddress.toString(), imageindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageList(classimagelistdata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList(classimagelistdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageListExA(classimagelistdata: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA(classimagelistdata.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageListExW(classimagelistdata: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW(classimagelistdata.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: MutPtr, classinstallparamssize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), classinstallparams.rawAddress.toString(), classinstallparamssize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: MutPtr, classinstallparamssize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), classinstallparams.rawAddress.toString(), classinstallparamssize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyKeys(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys(classguid.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.toInt(), requiredpropertykeycount.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyKeysExW(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW(classguid.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.toInt(), requiredpropertykeycount.rawAddress.toString(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassRegistryPropertyA(classguid: ConstPtr, property: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA(classguid.rawAddress.toString(), property.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassRegistryPropertyW(classguid: ConstPtr, property: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW(classguid.rawAddress.toString(), property.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), custompropertyname.rawAddress.toString(), flags.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), custompropertyname.rawAddress.toString(), flags.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass(deviceinfoset.toString(), classguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA(deviceinfoset.toString(), deviceinfosetdetaildata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW(deviceinfoset.toString(), deviceinfosetdetaildata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstanceid.rawAddress.toString(), deviceinstanceidsize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstanceid.rawAddress.toString(), deviceinstanceidsize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, aliasinterfaceclassguid: ConstPtr, aliasdeviceinterfacedata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), aliasinterfaceclassguid.rawAddress.toString(), aliasdeviceinterfacedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, deviceinterfacedetaildata: MutPtr, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), deviceinterfacedetaildata.rawAddress.toString(), deviceinterfacedetaildatasize.toInt(), requiredsize.rawAddress.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, deviceinterfacedetaildata: MutPtr, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), deviceinterfacedetaildata.rawAddress.toString(), deviceinterfacedetaildatasize.toInt(), requiredsize.rawAddress.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.toInt(), requiredpropertykeycount.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.toInt(), requiredpropertykeycount.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), property.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), property.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinfodetaildata: MutPtr, driverinfodetaildatasize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinfodetaildata.rawAddress.toString(), driverinfodetaildatasize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinfodetaildata: MutPtr, driverinfodetaildatasize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinfodetaildata.rawAddress.toString(), driverinfodetaildatasize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinstallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinstallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA(hwprofile.toInt(), friendlyname.rawAddress.toString(), friendlynamesize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA(hwprofile.toInt(), friendlyname.rawAddress.toString(), friendlynamesize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW(hwprofile.toInt(), friendlyname.rawAddress.toString(), friendlynamesize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW(hwprofile.toInt(), friendlyname.rawAddress.toString(), friendlynamesize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileList(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList(hwprofilelist.rawAddress.toString(), hwprofilelistsize.toInt(), requiredsize.rawAddress.toString(), currentlyactiveindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileListExA(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA(hwprofilelist.rawAddress.toString(), hwprofilelistsize.toInt(), requiredsize.rawAddress.toString(), currentlyactiveindex.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileListExW(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW(hwprofilelist.rawAddress.toString(), hwprofilelistsize.toInt(), requiredsize.rawAddress.toString(), currentlyactiveindex.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetINFClassA(infname: Pcstr, classguid: MutPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA(infname.rawAddress.toString(), classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetINFClassW(infname: Pcwstr, classguid: MutPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW(infname.rawAddress.toString(), classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, installwizarddata: ConstPtr, pagetype: UInt, flags: UInt): Hpropsheetpage =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), installwizarddata.rawAddress.toString(), pagetype.toInt(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA(hwndparent.rawAddress.toString(), inffilename.rawAddress.toString(), flags.toInt(), filequeue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr, interfaceclassguid: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA(hwndparent.rawAddress.toString(), inffilename.rawAddress.toString(), flags.toInt(), filequeue.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr, interfaceclassguid: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW(hwndparent.rawAddress.toString(), inffilename.rawAddress.toString(), flags.toInt(), filequeue.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW(hwndparent.rawAddress.toString(), inffilename.rawAddress.toString(), flags.toInt(), filequeue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiLoadClassIcon(classguid: ConstPtr, largeicon: MutPtr, miniiconindex: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon(classguid.rawAddress.toString(), largeicon.rawAddress.toString(), miniiconindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), cxicon.toInt(), cyicon.toInt(), flags.toInt(), hicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKey(classguid: ConstPtr, samdesired: UInt): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey(classguid.rawAddress.toString(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKeyExA(classguid: ConstPtr, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: ConstPtr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA(classguid.rawAddress.toString(), samdesired.toInt(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKeyExW(classguid: ConstPtr, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW(classguid.rawAddress.toString(), samdesired.toInt(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA(deviceinfoset.toString(), deviceinstanceid.rawAddress.toString(), hwndparent.rawAddress.toString(), openflags.toInt(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW(deviceinfoset.toString(), deviceinstanceid.rawAddress.toString(), hwndparent.rawAddress.toString(), openflags.toInt(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA(deviceinfoset.toString(), devicepath.rawAddress.toString(), openflags.toInt(), deviceinterfacedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), reserved.toInt(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW(deviceinfoset.toString(), devicepath.rawAddress.toString(), openflags.toInt(), deviceinterfacedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: ConstPtr, dupdeviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), flags.toInt(), 0L.toString(), comparecontext.rawAddress.toString(), dupdeviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv(hwndparent.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: ConstPtr, classinstallparamssize: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), classinstallparams.rawAddress.toString(), classinstallparamssize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: ConstPtr, classinstallparamssize: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), classinstallparams.rawAddress.toString(), classinstallparamssize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassRegistryPropertyA(classguid: ConstPtr, property: UInt, propertybuffer: ConstPtr, propertybuffersize: UInt, machinename: Pcstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA(classguid.rawAddress.toString(), property.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassRegistryPropertyW(classguid: ConstPtr, property: UInt, propertybuffer: ConstPtr, propertybuffersize: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW(classguid.rawAddress.toString(), property.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr, flags: UInt, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), flags.toInt(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, property: SetupDiRegistryProperty, propertybuffer: ConstPtr, propertybuffersize: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), property.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, property: SetupDiRegistryProperty, propertybuffer: ConstPtr, propertybuffersize: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), property.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinstallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinstallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, driverinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, driverinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDuplicateDiskSpaceListA(diskspace: ConstPtr, reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA(diskspace.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDuplicateDiskSpaceListW(diskspace: ConstPtr, reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW(diskspace.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupEnumInfSectionsA(infhandle: ConstPtr, index: UInt, buffer: Pstr, size: UInt, sizeneeded: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA(infhandle.rawAddress.toString(), index.toInt(), buffer.rawAddress.toString(), size.toInt(), sizeneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupEnumInfSectionsW(infhandle: ConstPtr, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW(infhandle.rawAddress.toString(), index.toInt(), buffer.rawAddress.toString(), size.toInt(), sizeneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindFirstLineA(infhandle: ConstPtr, section: Pcstr, key: Pcstr, context: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA(infhandle.rawAddress.toString(), section.rawAddress.toString(), key.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindFirstLineW(infhandle: ConstPtr, section: Pcwstr, key: Pcwstr, context: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW(infhandle.rawAddress.toString(), section.rawAddress.toString(), key.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextLine(contextin: ConstPtr, contextout: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine(contextin.rawAddress.toString(), contextout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextMatchLineA(contextin: ConstPtr, key: Pcstr, contextout: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA(contextin.rawAddress.toString(), key.rawAddress.toString(), contextout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextMatchLineW(contextin: ConstPtr, key: Pcwstr, contextout: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW(contextin.rawAddress.toString(), key.rawAddress.toString(), contextout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFreeSourceListA(list: MutPtr, count: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA(list.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFreeSourceListW(list: MutPtr, count: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW(list.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBackupInformationA(queuehandle: ConstPtr, backupparams: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA(queuehandle.rawAddress.toString(), backupparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBackupInformationW(queuehandle: ConstPtr, backupparams: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW(queuehandle.rawAddress.toString(), backupparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBinaryField(context: ConstPtr, fieldindex: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFieldCount(context: ConstPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount(context.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA(sourcefilename.rawAddress.toString(), actualsourcefilename.rawAddress.toString(), sourcefilesize.rawAddress.toString(), targetfilesize.rawAddress.toString(), compressiontype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA(sourcefilename.rawAddress.toString(), actualsourcefilenamebuffer.rawAddress.toString(), actualsourcefilenamebufferlen.toInt(), requiredbufferlen.rawAddress.toString(), sourcefilesize.rawAddress.toString(), targetfilesize.rawAddress.toString(), compressiontype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW(sourcefilename.rawAddress.toString(), actualsourcefilenamebuffer.rawAddress.toString(), actualsourcefilenamebufferlen.toInt(), requiredbufferlen.rawAddress.toString(), sourcefilesize.rawAddress.toString(), targetfilesize.rawAddress.toString(), compressiontype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW(sourcefilename.rawAddress.toString(), actualsourcefilename.rawAddress.toString(), sourcefilesize.rawAddress.toString(), targetfilesize.rawAddress.toString(), compressiontype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileQueueCount(filequeue: ConstPtr, subqueuefileop: UInt, numoperations: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount(filequeue.rawAddress.toString(), subqueuefileop.toInt(), numoperations.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileQueueFlags(filequeue: ConstPtr, flags: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags(filequeue.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: ConstPtr, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA(filename.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), localename.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: ConstPtr, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW(filename.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), localename.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA(directorypath.rawAddress.toString(), infstyle.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW(directorypath.rawAddress.toString(), infstyle.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfInformationA(infspec: ConstPtr, searchcontrol: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA(infspec.rawAddress.toString(), searchcontrol.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfInformationW(infspec: ConstPtr, searchcontrol: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW(infspec.rawAddress.toString(), searchcontrol.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA(driverstorelocation.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW(driverstorelocation.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetIntField(context: ConstPtr, fieldindex: UInt, integervalue: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField(context.rawAddress.toString(), fieldindex.toInt(), integervalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineByIndexA(infhandle: ConstPtr, section: Pcstr, index: UInt, context: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA(infhandle.rawAddress.toString(), section.rawAddress.toString(), index.toInt(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineByIndexW(infhandle: ConstPtr, section: Pcwstr, index: UInt, context: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW(infhandle.rawAddress.toString(), section.rawAddress.toString(), index.toInt(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineCountA(infhandle: ConstPtr, section: Pcstr): Int =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA(infhandle.rawAddress.toString(), section.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineCountW(infhandle: ConstPtr, section: Pcwstr): Int =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW(infhandle.rawAddress.toString(), section.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineTextA(context: ConstPtr, infhandle: ConstPtr, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA(context.rawAddress.toString(), infhandle.rawAddress.toString(), section.rawAddress.toString(), key.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineTextW(context: ConstPtr, infhandle: ConstPtr, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW(context.rawAddress.toString(), infhandle.rawAddress.toString(), section.rawAddress.toString(), key.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetMultiSzFieldA(context: ConstPtr, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetMultiSzFieldW(context: ConstPtr, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetNonInteractiveMode(): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileLocationA(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcstr, sourceid: MutPtr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), filename.rawAddress.toString(), sourceid.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileLocationW(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcwstr, sourceid: MutPtr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), filename.rawAddress.toString(), sourceid.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileSizeA(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcstr, section: Pcstr, filesize: MutPtr, roundingfactor: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), filename.rawAddress.toString(), section.rawAddress.toString(), filesize.rawAddress.toString(), roundingfactor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileSizeW(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcwstr, section: Pcwstr, filesize: MutPtr, roundingfactor: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), filename.rawAddress.toString(), section.rawAddress.toString(), filesize.rawAddress.toString(), roundingfactor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceInfoA(infhandle: ConstPtr, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA(infhandle.rawAddress.toString(), sourceid.toInt(), infodesired.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceInfoW(infhandle: ConstPtr, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW(infhandle.rawAddress.toString(), sourceid.toInt(), infodesired.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetStringFieldA(context: ConstPtr, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetStringFieldW(context: ConstPtr, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetTargetPathA(infhandle: ConstPtr, infcontext: ConstPtr, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), section.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetTargetPathW(infhandle: ConstPtr, infcontext: ConstPtr, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), section.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetThreadLogToken(): ULong =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback(ownerwindow.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: ConstPtr): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx(ownerwindow.rawAddress.toString(), alternateprogresswindow.rawAddress.toString(), progressmessage.toInt(), reserved1.toInt(), reserved2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA(logfilename.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW(logfilename.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileA(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), sourcefile.rawAddress.toString(), sourcepathroot.rawAddress.toString(), destinationname.rawAddress.toString(), copystyle.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileExA(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr, filewasinuse: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), sourcefile.rawAddress.toString(), sourcepathroot.rawAddress.toString(), destinationname.rawAddress.toString(), copystyle.toInt(), 0L.toString(), context.rawAddress.toString(), filewasinuse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileExW(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr, filewasinuse: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), sourcefile.rawAddress.toString(), sourcepathroot.rawAddress.toString(), destinationname.rawAddress.toString(), copystyle.toInt(), 0L.toString(), context.rawAddress.toString(), filewasinuse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileW(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), sourcefile.rawAddress.toString(), sourcepathroot.rawAddress.toString(), destinationname.rawAddress.toString(), copystyle.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFilesFromInfSectionA(infhandle: ConstPtr, layoutinfhandle: ConstPtr, filequeue: ConstPtr, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA(infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), filequeue.rawAddress.toString(), sectionname.rawAddress.toString(), sourcerootpath.rawAddress.toString(), copyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFilesFromInfSectionW(infhandle: ConstPtr, layoutinfhandle: ConstPtr, filequeue: ConstPtr, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW(infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), filequeue.rawAddress.toString(), sectionname.rawAddress.toString(), sourcerootpath.rawAddress.toString(), copyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: ConstPtr, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: ConstPtr, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA(owner.rawAddress.toString(), infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt(), relativekeyroot.rawAddress.toString(), sourcerootpath.rawAddress.toString(), copyflags.toInt(), 0L.toString(), context.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: ConstPtr, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: ConstPtr, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW(owner.rawAddress.toString(), infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt(), relativekeyroot.rawAddress.toString(), sourcerootpath.rawAddress.toString(), copyflags.toInt(), 0L.toString(), context.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionA(infhandle: ConstPtr, sectionname: Pcstr, flags: SpsvcinstFlags): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionExA(infhandle: ConstPtr, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionExW(infhandle: ConstPtr, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionW(infhandle: ConstPtr, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA(cabinetfile.rawAddress.toString(), reserved.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW(cabinetfile.rawAddress.toString(), reserved.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA(messagestring.rawAddress.toString(), severity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW(messagestring.rawAddress.toString(), severity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogFileA(fileloghandle: ConstPtr, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), checksum.toInt(), disktagfile.rawAddress.toString(), diskdescription.rawAddress.toString(), otherinfo.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogFileW(fileloghandle: ConstPtr, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), checksum.toInt(), disktagfile.rawAddress.toString(), diskdescription.rawAddress.toString(), otherinfo.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: ConstPtr, errorline: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA(filename.rawAddress.toString(), infhandle.rawAddress.toString(), errorline.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: ConstPtr, errorline: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW(filename.rawAddress.toString(), infhandle.rawAddress.toString(), errorline.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenFileQueue(): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: MutPtr): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA(filename.rawAddress.toString(), infclass.rawAddress.toString(), infstyle.toInt(), errorline.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: MutPtr): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW(filename.rawAddress.toString(), infclass.rawAddress.toString(), infstyle.toInt(), errorline.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenLog(erase: Bool): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(erase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenMasterInf(): MutPtr =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) MutPtr((windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPrepareQueueForRestoreA(queuehandle: ConstPtr, backuppath: Pcstr, restoreflags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA(queuehandle.rawAddress.toString(), backuppath.rawAddress.toString(), restoreflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPrepareQueueForRestoreW(queuehandle: ConstPtr, backuppath: Pcwstr, restoreflags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW(queuehandle.rawAddress.toString(), backuppath.rawAddress.toString(), restoreflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), diskname.rawAddress.toString(), pathtosource.rawAddress.toString(), filesought.rawAddress.toString(), tagfile.rawAddress.toString(), diskpromptstyle.toInt(), pathbuffer.rawAddress.toString(), pathbuffersize.toInt(), pathrequiredsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), diskname.rawAddress.toString(), pathtosource.rawAddress.toString(), filesought.rawAddress.toString(), tagfile.rawAddress.toString(), diskpromptstyle.toInt(), pathbuffer.rawAddress.toString(), pathbuffersize.toInt(), pathrequiredsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptReboot(filequeue: ConstPtr, owner: Hwnd, scanonly: Bool): Int =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot(filequeue.rawAddress.toString(), owner.rawAddress.toString(), scanonly) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryDrivesInDiskSpaceListA(diskspace: ConstPtr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA(diskspace.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryDrivesInDiskSpaceListW(diskspace: ConstPtr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW(diskspace.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryFileLogA(fileloghandle: ConstPtr, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), targetfilename.rawAddress.toString(), desiredinfo, dataout.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryFileLogW(fileloghandle: ConstPtr, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), targetfilename.rawAddress.toString(), desiredinfo, dataout.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfFileInformationA(infinformation: ConstPtr, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA(infinformation.rawAddress.toString(), infindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfFileInformationW(infinformation: ConstPtr, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW(infinformation.rawAddress.toString(), infindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfOriginalFileInformationA(infinformation: ConstPtr, infindex: UInt, alternateplatforminfo: ConstPtr, originalfileinfo: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA(infinformation.rawAddress.toString(), infindex.toInt(), alternateplatforminfo.rawAddress.toString(), originalfileinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfOriginalFileInformationW(infinformation: ConstPtr, infindex: UInt, alternateplatforminfo: ConstPtr, originalfileinfo: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW(infinformation.rawAddress.toString(), infindex.toInt(), alternateplatforminfo.rawAddress.toString(), originalfileinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfVersionInformationA(infinformation: ConstPtr, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA(infinformation.rawAddress.toString(), infindex.toInt(), key.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfVersionInformationW(infinformation: ConstPtr, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW(infinformation.rawAddress.toString(), infindex.toInt(), key.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySourceListA(flags: UInt, list: MutPtr, count: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA(flags.toInt(), list.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySourceListW(flags: UInt, list: MutPtr, count: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW(flags.toInt(), list.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySpaceRequiredOnDriveA(diskspace: ConstPtr, drivespec: Pcstr, spacerequired: MutPtr, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA(diskspace.rawAddress.toString(), drivespec.rawAddress.toString(), spacerequired.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySpaceRequiredOnDriveW(diskspace: ConstPtr, drivespec: Pcwstr, spacerequired: MutPtr, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW(diskspace.rawAddress.toString(), drivespec.rawAddress.toString(), spacerequired.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyA(queuehandle: ConstPtr, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA(queuehandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), sourcepath.rawAddress.toString(), sourcefilename.rawAddress.toString(), sourcedescription.rawAddress.toString(), sourcetagfile.rawAddress.toString(), targetdirectory.rawAddress.toString(), targetfilename.rawAddress.toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyIndirectA(copyparams: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA(copyparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyIndirectW(copyparams: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW(copyparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopySectionA(queuehandle: ConstPtr, sourcerootpath: Pcstr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA(queuehandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopySectionW(queuehandle: ConstPtr, sourcerootpath: Pcwstr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW(queuehandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyW(queuehandle: ConstPtr, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW(queuehandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), sourcepath.rawAddress.toString(), sourcefilename.rawAddress.toString(), sourcedescription.rawAddress.toString(), sourcetagfile.rawAddress.toString(), targetdirectory.rawAddress.toString(), targetfilename.rawAddress.toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDefaultCopyA(queuehandle: ConstPtr, infhandle: ConstPtr, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDefaultCopyW(queuehandle: ConstPtr, infhandle: ConstPtr, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), copystyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteA(queuehandle: ConstPtr, pathpart1: Pcstr, pathpart2: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA(queuehandle.rawAddress.toString(), pathpart1.rawAddress.toString(), pathpart2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteSectionA(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteSectionW(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteW(queuehandle: ConstPtr, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW(queuehandle.rawAddress.toString(), pathpart1.rawAddress.toString(), pathpart2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameA(queuehandle: ConstPtr, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA(queuehandle.rawAddress.toString(), sourcepath.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetpath.rawAddress.toString(), targetfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameSectionA(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameSectionW(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameW(queuehandle: ConstPtr, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW(queuehandle.rawAddress.toString(), sourcepath.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetpath.rawAddress.toString(), targetfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFileLogEntryA(fileloghandle: ConstPtr, logsectionname: Pcstr, targetfilename: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), targetfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFileLogEntryW(fileloghandle: ConstPtr, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), targetfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromDiskSpaceListA(diskspace: ConstPtr, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA(diskspace.rawAddress.toString(), targetfilespec.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromDiskSpaceListW(diskspace: ConstPtr, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW(diskspace.rawAddress.toString(), targetfilespec.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA(flags.toInt(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW(flags.toInt(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcstr, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcwstr, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveSectionFromDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveSectionFromDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), sourcefile.rawAddress.toString(), targetfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), sourcefile.rawAddress.toString(), targetfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupScanFileQueueA(filequeue: ConstPtr, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: ConstPtr, result: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA(filequeue.rawAddress.toString(), flags.toInt(), window.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupScanFileQueueW(filequeue: ConstPtr, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: ConstPtr, result: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW(filequeue.rawAddress.toString(), flags.toInt(), window.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdA(infhandle: ConstPtr, id: UInt, directory: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA(infhandle.rawAddress.toString(), id.toInt(), directory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdExA(infhandle: ConstPtr, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA(infhandle.rawAddress.toString(), id.toInt(), directory.rawAddress.toString(), flags.toInt(), reserved1.toInt(), reserved2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdExW(infhandle: ConstPtr, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW(infhandle.rawAddress.toString(), id.toInt(), directory.rawAddress.toString(), flags.toInt(), reserved1.toInt(), reserved2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdW(infhandle: ConstPtr, id: UInt, directory: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW(infhandle.rawAddress.toString(), id.toInt(), directory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueAlternatePlatformA(queuehandle: ConstPtr, alternateplatforminfo: ConstPtr, alternatedefaultcatalogfile: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA(queuehandle.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), alternatedefaultcatalogfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueAlternatePlatformW(queuehandle: ConstPtr, alternateplatforminfo: ConstPtr, alternatedefaultcatalogfile: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW(queuehandle.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), alternatedefaultcatalogfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueFlags(filequeue: ConstPtr, flagmask: UInt, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags(filequeue.rawAddress.toString(), flagmask.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(noninteractiveflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetPlatformPathOverrideA(override: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA(override.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW(override.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetSourceListA(flags: UInt, sourcelist: ConstPtr, sourcecount: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA(flags.toInt(), sourcelist.rawAddress.toString(), sourcecount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetSourceListW(flags: UInt, sourcelist: ConstPtr, sourcecount: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW(flags.toInt(), sourcelist.rawAddress.toString(), sourcecount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetThreadLogToken(logtoken: ULong) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(logtoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupTermDefaultQueueCallback(context: ConstPtr) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupTerminateFileLog(fileloghandle: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog(fileloghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallNewlyCopiedInfs(filequeue: ConstPtr, flags: UInt, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs(filequeue.rawAddress.toString(), flags.toInt(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA(inffilename.rawAddress.toString(), flags.toInt(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: ConstPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW(inffilename.rawAddress.toString(), flags.toInt(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: ConstPtr, infsignerinfo: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA(infname.rawAddress.toString(), altplatforminfo.rawAddress.toString(), infsignerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: ConstPtr, infsignerinfo: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW(infname.rawAddress.toString(), altplatforminfo.rawAddress.toString(), infsignerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog(logtoken.toString(), category.toInt(), flags.toInt(), messagestr.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError(logtoken.toString(), category.toInt(), logflags.toInt(), error.toInt(), messagestr.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: ConstPtr, context: ConstPtr) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine(logtoken.toString(), flags.toInt(), infhandle.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA(hwndparent.rawAddress.toString(), hardwareid.rawAddress.toString(), fullinfpath.rawAddress.toString(), installflags.toInt(), brebootrequired.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW(hwndparent.rawAddress.toString(), hardwareid.rawAddress.toString(), fullinfpath.rawAddress.toString(), installflags.toInt(), brebootrequired.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
