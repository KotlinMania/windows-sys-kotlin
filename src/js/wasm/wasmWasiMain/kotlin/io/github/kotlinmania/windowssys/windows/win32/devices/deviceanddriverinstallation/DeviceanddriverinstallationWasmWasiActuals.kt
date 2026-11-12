@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(dwtimeout: Int): Int

public actual fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(dwtimeout.toInt()).toUInt()

public actual fun cmAddEmptyLogConf(plclogconf: MutPtr, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf")

public actual fun cmAddEmptyLogConfEx(plclogconf: MutPtr, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx")

public actual fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda")

public actual fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw")

public actual fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA")

public actual fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

public actual fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmAddResDes(prdresdes: MutPtr, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes")

public actual fun cmAddResDesEx(prdresdes: MutPtr, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx")

public actual fun cmConnectMachineA(uncservername: Pcstr, phmachine: MutPtr): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA")

public actual fun cmConnectMachineW(uncservername: Pcwstr, phmachine: MutPtr): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW")

public actual fun cmCreateDevNodeA(pdndevinst: MutPtr, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA")

public actual fun cmCreateDevNodeW(pdndevinst: MutPtr, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW")

public actual fun cmCreateDevNodeExA(pdndevinst: MutPtr, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA")

public actual fun cmCreateDevNodeExW(pdndevinst: MutPtr, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW")

public actual fun cmCreateRangeList(prlh: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList")

public actual fun cmDeleteClassKey(classguid: ConstPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey")

public actual fun cmDeleteClassKeyEx(classguid: ConstPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(dndevnode: Int, ulhardwareprofile: Int, ulflags: Int): Int

public actual fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(dndevnode: Int, ulhardwareprofile: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA")

public actual fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW")

public actual fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA")

public actual fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

public actual fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, pbconflictdetected: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict")

public actual fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, pbconflictdetected: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(dndevinst: Int, ulflags: Int): Int

public actual fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(hmachine: Long): Int

public actual fun cmDisconnectMachine(hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(hmachine).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(rlhold: Long, rlhnew: Long, ulflags: Int): Int

public actual fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(rlhold.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(dndevinst: Int, ulflags: Int): Int

public actual fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmEnumerateClasses(ulclassindex: UInt, classguid: MutPtr, ulflags: CmEnumerateFlags): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses")

public actual fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: MutPtr, ulflags: CmEnumerateFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx")

public actual fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA")

public actual fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW")

public actual fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA")

public actual fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW")

public actual fun cmFindRange(pullstart: MutPtr, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange")

public actual fun cmFirstRange(rlh: ULong, pullstart: MutPtr, pullend: MutPtr, preelement: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(lclogconftobefreed: Long, ulflags: Int): Int

public actual fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(lclogconftobefreed.toLong(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(lclogconftobefreed: Long, ulflags: Int, hmachine: Long): Int

public actual fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(lclogconftobefreed.toLong(), ulflags.toInt(), hmachine).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(lclogconf: Long): Int

public actual fun cmFreeLogConfHandle(lclogconf: ULong): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(lclogconf.toLong()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(rlh: Long, ulflags: Int): Int

public actual fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFreeResDes(prdresdes: MutPtr, rdresdes: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes")

public actual fun cmFreeResDesEx(prdresdes: MutPtr, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(rdresdes: Long): Int

public actual fun cmFreeResDesHandle(rdresdes: ULong): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(rdresdes.toLong()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(clconflictlist: Long): Int

public actual fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(clconflictlist.toLong()).toUInt()

public actual fun cmGetChild(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild")

public actual fun cmGetChildEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx")

public actual fun cmGetClassKeyNameA(classguid: ConstPtr, pszkeyname: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA")

public actual fun cmGetClassKeyNameW(classguid: ConstPtr, pszkeyname: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW")

public actual fun cmGetClassKeyNameExA(classguid: ConstPtr, pszkeyname: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA")

public actual fun cmGetClassKeyNameExW(classguid: ConstPtr, pszkeyname: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW")

public actual fun cmGetClassNameA(classguid: ConstPtr, buffer: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA")

public actual fun cmGetClassNameW(classguid: ConstPtr, buffer: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW")

public actual fun cmGetClassNameExA(classguid: ConstPtr, buffer: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA")

public actual fun cmGetClassNameExW(classguid: ConstPtr, buffer: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW")

public actual fun cmGetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW")

public actual fun cmGetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW")

public actual fun cmGetClassPropertyKeys(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys")

public actual fun cmGetClassPropertyKeysEx(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx")

public actual fun cmGetClassRegistryPropertyA(classguid: ConstPtr, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA")

public actual fun cmGetClassRegistryPropertyW(classguid: ConstPtr, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW")

public actual fun cmGetDepth(puldepth: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth")

public actual fun cmGetDepthEx(puldepth: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx")

public actual fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA")

public actual fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW")

public actual fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA")

public actual fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW")

public actual fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW")

public actual fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW")

public actual fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys")

public actual fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx")

public actual fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA")

public actual fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW")

public actual fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA")

public actual fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW")

public actual fun cmGetDevNodeStatus(pulstatus: MutPtr, pulproblemnumber: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus")

public actual fun cmGetDevNodeStatusEx(pulstatus: MutPtr, pulproblemnumber: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx")

public actual fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda")

public actual fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw")

public actual fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA")

public actual fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW")

public actual fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA")

public actual fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW")

public actual fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA")

public actual fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW")

public actual fun cmGetDeviceIdListSizeA(pullen: MutPtr, pszfilter: Pcstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA")

public actual fun cmGetDeviceIdListSizeW(pullen: MutPtr, pszfilter: Pcwstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW")

public actual fun cmGetDeviceIdListSizeExA(pullen: MutPtr, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA")

public actual fun cmGetDeviceIdListSizeExW(pullen: MutPtr, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW")

public actual fun cmGetDeviceIdSize(pullen: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize")

public actual fun cmGetDeviceIdSizeEx(pullen: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx")

public actual fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA")

public actual fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW")

public actual fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA")

public actual fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW")

public actual fun cmGetDeviceInterfaceListA(interfaceclassguid: ConstPtr, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA")

public actual fun cmGetDeviceInterfaceListW(interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW")

public actual fun cmGetDeviceInterfaceListExA(interfaceclassguid: ConstPtr, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA")

public actual fun cmGetDeviceInterfaceListExW(interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW")

public actual fun cmGetDeviceInterfaceListSizeA(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA")

public actual fun cmGetDeviceInterfaceListSizeW(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW")

public actual fun cmGetDeviceInterfaceListSizeExA(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA")

public actual fun cmGetDeviceInterfaceListSizeExW(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW")

public actual fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW")

public actual fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW")

public actual fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW")

public actual fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW")

public actual fun cmGetFirstLogConf(plclogconf: MutPtr, dndevinst: UInt, ulflags: CmLogConf): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf")

public actual fun cmGetFirstLogConfEx(plclogconf: MutPtr, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx")

public actual fun cmGetGlobalState(pulstate: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState")

public actual fun cmGetGlobalStateEx(pulstate: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx")

public actual fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA")

public actual fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW")

public actual fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA")

public actual fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW")

public actual fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA")

public actual fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW")

public actual fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA")

public actual fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW")

public actual fun cmGetLogConfPriority(lclogconf: ULong, ppriority: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority")

public actual fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx")

public actual fun cmGetNextLogConf(plclogconf: MutPtr, lclogconf: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf")

public actual fun cmGetNextLogConfEx(plclogconf: MutPtr, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx")

public actual fun cmGetNextResDes(prdresdes: MutPtr, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes")

public actual fun cmGetNextResDesEx(prdresdes: MutPtr, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx")

public actual fun cmGetParent(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent")

public actual fun cmGetParentEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx")

public actual fun cmGetResDesData(rdresdes: ULong, buffer: MutPtr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData")

public actual fun cmGetResDesDataEx(rdresdes: ULong, buffer: MutPtr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx")

public actual fun cmGetResDesDataSize(pulsize: MutPtr, rdresdes: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize")

public actual fun cmGetResDesDataSizeEx(pulsize: MutPtr, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx")

public actual fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: MutPtr): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount")

public actual fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA")

public actual fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW")

public actual fun cmGetSibling(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling")

public actual fun cmGetSiblingEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion(): Int

public actual fun cmGetVersion(): UShort =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion().toUShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(hmachine: Long): Int

public actual fun cmGetVersionEx(hmachine: Long): UShort =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(hmachine).toUShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(rlhold1: Long, rlhold2: Long, rlhnew: Long, ulflags: Int): Int

public actual fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(rlhold: Long, rlhnew: Long, ullmaxvalue: Long, ulflags: Int): Int

public actual fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(rlhold.toLong(), rlhnew.toLong(), ullmaxvalue.toLong(), ulflags.toInt()).toUInt()

public actual fun cmIsDockStationPresent(pbpresent: MutPtr): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent")

public actual fun cmIsDockStationPresentEx(pbpresent: MutPtr, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(wversion: Int): Int

public actual fun cmIsVersionAvailable(wversion: UShort): Bool =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(wversion.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(wversion: Int, hmachine: Long): Int

public actual fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(wversion.toInt(), hmachine)

public actual fun cmLocateDevNodeA(pdndevinst: MutPtr, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA")

public actual fun cmLocateDevNodeW(pdndevinst: MutPtr, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW")

public actual fun cmLocateDevNodeExA(pdndevinst: MutPtr, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA")

public actual fun cmLocateDevNodeExW(pdndevinst: MutPtr, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(cmreturncode: Int, defaulterr: Int): Int

public actual fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(cmreturncode.toInt(), defaulterr.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(rlhold1: Long, rlhold2: Long, rlhnew: Long, ulflags: Int): Int

public actual fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun cmModifyResDes(prdresdes: MutPtr, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes")

public actual fun cmModifyResDesEx(prdresdes: MutPtr, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(dnfromdevinst: Int, dntodevinst: Int, ulflags: Int): Int

public actual fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(dnfromdevinst: Int, dntodevinst: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmNextRange(preelement: MutPtr, pullstart: MutPtr, pullend: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange")

public actual fun cmOpenClassKeyA(classguid: ConstPtr, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA")

public actual fun cmOpenClassKeyW(classguid: ConstPtr, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW")

public actual fun cmOpenClassKeyExA(classguid: ConstPtr, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA")

public actual fun cmOpenClassKeyExW(classguid: ConstPtr, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW")

public actual fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey")

public actual fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx")

public actual fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA")

public actual fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW")

public actual fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA")

public actual fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW")

public actual fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA")

public actual fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW")

public actual fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA")

public actual fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW")

public actual fun cmQueryArbitratorFreeData(pdata: MutPtr, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData")

public actual fun cmQueryArbitratorFreeDataEx(pdata: MutPtr, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx")

public actual fun cmQueryArbitratorFreeSize(pulsize: MutPtr, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize")

public actual fun cmQueryArbitratorFreeSizeEx(pulsize: MutPtr, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(dnancestor: Int, ulflags: Int): Int

public actual fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(dnancestor.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(dnancestor: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryResourceConflictList(pclconflictlist: MutPtr, dndevinst: UInt, resourceid: CmRestype, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(dndevinst: Int, ulflags: Int): Int

public actual fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(dndevinst: Int, ulflags: Int): Int

public actual fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(dndevinst.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA")

public actual fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW")

public actual fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA")

public actual fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW")

public actual fun cmRegisterNotification(pfilter: ConstPtr, pcontext: ConstPtr, pcallback: PcmNotifyCallback, pnotifycontext: MutPtr): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(dnancestor: Int, ulflags: Int): Int

public actual fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(dnancestor.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(dnancestor: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA")

public actual fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW")

public actual fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA")

public actual fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc(): Int

public actual fun cmRequestEjectPc(): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(hmachine: Long): Int

public actual fun cmRequestEjectPcEx(hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(hmachine).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(ulflags: Int): Int

public actual fun cmRunDetection(ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(ulflags: Int, hmachine: Long): Int

public actual fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW")

public actual fun cmSetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW")

public actual fun cmSetClassRegistryPropertyA(classguid: ConstPtr, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA")

public actual fun cmSetClassRegistryPropertyW(classguid: ConstPtr, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(dndevinst: Int, ulproblem: Int, ulflags: Int): Int

public actual fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(dndevinst: Int, ulproblem: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW")

public actual fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW")

public actual fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA")

public actual fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW")

public actual fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA")

public actual fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW")

public actual fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW")

public actual fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(ulhardwareprofile: Int, ulflags: Int): Int

public actual fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(ulhardwareprofile.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(ulhardwareprofile: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(ulhardwareprofile.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA")

public actual fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW")

public actual fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA")

public actual fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(dndevinst: Int, ulflags: Int): Int

public actual fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

public actual fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(dndevinst: Int, ulflags: Int): Int

public actual fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

public actual fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA")

public actual fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW")

public actual fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA")

public actual fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW")

public actual fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification")

public actual fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, flags: DiinstalldeviceFlags, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice")

public actual fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA")

public actual fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW")

public actual fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver")

public actual fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, flags: UInt, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice")

public actual fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver")

public actual fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, flags: UInt, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice")

public actual fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA")

public actual fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW")

public actual fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA")

public actual fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW")

public actual fun setupAddInstallSectionToDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcstr, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA")

public actual fun setupAddInstallSectionToDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcwstr, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW")

public actual fun setupAddSectionToDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA")

public actual fun setupAddSectionToDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW")

public actual fun setupAddToDiskSpaceListA(diskspace: ConstPtr, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA")

public actual fun setupAddToDiskSpaceListW(diskspace: ConstPtr, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW")

public actual fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA")

public actual fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW")

public actual fun setupAdjustDiskSpaceListA(diskspace: ConstPtr, driveroot: Pcstr, amount: Long, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA")

public actual fun setupAdjustDiskSpaceListW(diskspace: ConstPtr, driveroot: Pcwstr, amount: Long, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW")

public actual fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA")

public actual fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList(): Int

public actual fun setupCancelTemporarySourceList(): Bool =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList()

public actual fun setupCloseFileQueue(queuehandle: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue")

public actual fun setupCloseInfFile(infhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog(): Unit

public actual fun setupCloseLog(): Unit =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog()

public actual fun setupCommitFileQueueA(owner: Hwnd, queuehandle: ConstPtr, msghandler: PspFileCallbackA, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA")

public actual fun setupCommitFileQueueW(owner: Hwnd, queuehandle: ConstPtr, msghandler: PspFileCallbackW, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW")

public actual fun setupConfigureWmiFromInfSectionA(infhandle: ConstPtr, sectionname: Pcstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA")

public actual fun setupConfigureWmiFromInfSectionW(infhandle: ConstPtr, sectionname: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW")

public actual fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA")

public actual fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW")

public actual fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: MutPtr, destinationinffilenamecomponent: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA")

public actual fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: MutPtr, destinationinffilenamecomponent: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW")

public actual fun setupCreateDiskSpaceListA(reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA")

public actual fun setupCreateDiskSpaceListW(reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW")

public actual fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA")

public actual fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW")

public actual fun setupDefaultQueueCallbackA(context: ConstPtr, notification: UInt, param1: ULong, param2: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA")

public actual fun setupDefaultQueueCallbackW(context: ConstPtr, notification: UInt, param1: ULong, param2: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW")

public actual fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA")

public actual fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW")

public actual fun setupDestroyDiskSpaceList(diskspace: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList")

public actual fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk")

public actual fun setupDiBuildClassInfoList(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList")

public actual fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA")

public actual fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW")

public actual fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, drivertype: SetupDiDriverType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList")

public actual fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(deviceinfoset: Long): Int

public actual fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(deviceinfoset)

public actual fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState")

public actual fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA")

public actual fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA")

public actual fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW")

public actual fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW")

public actual fun setupDiClassNameFromGuidA(classguid: ConstPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA")

public actual fun setupDiClassNameFromGuidExA(classguid: ConstPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA")

public actual fun setupDiClassNameFromGuidExW(classguid: ConstPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW")

public actual fun setupDiClassNameFromGuidW(classguid: ConstPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW")

public actual fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr, infsectionname: Pcstr): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA")

public actual fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr, infsectionname: Pcwstr): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW")

public actual fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: ConstPtr, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA")

public actual fun setupDiCreateDeviceInfoList(classguid: ConstPtr, hwndparent: Hwnd): Hdevinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList")

public actual fun setupDiCreateDeviceInfoListExA(classguid: ConstPtr, hwndparent: Hwnd, machinename: Pcstr, reserved: ConstPtr): Hdevinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA")

public actual fun setupDiCreateDeviceInfoListExW(classguid: ConstPtr, hwndparent: Hwnd, machinename: Pcwstr, reserved: ConstPtr): Hdevinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW")

public actual fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: ConstPtr, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW")

public actual fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA")

public actual fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt, infhandle: ConstPtr, infsectionname: Pcstr): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA")

public actual fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt, infhandle: ConstPtr, infsectionname: Pcwstr): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW")

public actual fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW")

public actual fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey")

public actual fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo")

public actual fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData")

public actual fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey")

public actual fun setupDiDestroyClassImageList(classimagelistdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(deviceinfoset: Long): Int

public actual fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(deviceinfoset)

public actual fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList")

public actual fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDrawMiniIcon")

public actual fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo")

public actual fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, memberindex: UInt, deviceinterfacedata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces")

public actual fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA")

public actual fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW")

public actual fun setupDiGetActualModelsSectionA(context: ConstPtr, alternateplatforminfo: ConstPtr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA")

public actual fun setupDiGetActualModelsSectionW(context: ConstPtr, alternateplatforminfo: ConstPtr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW")

public actual fun setupDiGetActualSectionToInstallA(infhandle: ConstPtr, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA")

public actual fun setupDiGetActualSectionToInstallExA(infhandle: ConstPtr, infsectionname: Pcstr, alternateplatforminfo: ConstPtr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA")

public actual fun setupDiGetActualSectionToInstallExW(infhandle: ConstPtr, infsectionname: Pcwstr, alternateplatforminfo: ConstPtr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW")

public actual fun setupDiGetActualSectionToInstallW(infhandle: ConstPtr, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW")

public actual fun setupDiGetClassBitmapIndex(classguid: ConstPtr, miniiconindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex")

public actual fun setupDiGetClassDescriptionA(classguid: ConstPtr, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA")

public actual fun setupDiGetClassDescriptionExA(classguid: ConstPtr, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA")

public actual fun setupDiGetClassDescriptionExW(classguid: ConstPtr, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW")

public actual fun setupDiGetClassDescriptionW(classguid: ConstPtr, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW")

public actual fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertysheetheader: ConstPtr, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr, propertysheettype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA")

public actual fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertysheetheader: ConstPtr, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr, propertysheettype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW")

public actual fun setupDiGetClassDevsA(classguid: ConstPtr, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA")

public actual fun setupDiGetClassDevsExA(classguid: ConstPtr, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: ConstPtr): Hdevinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA")

public actual fun setupDiGetClassDevsExW(classguid: ConstPtr, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: ConstPtr): Hdevinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW")

public actual fun setupDiGetClassDevsW(classguid: ConstPtr, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW")

public actual fun setupDiGetClassImageIndex(classimagelistdata: ConstPtr, classguid: ConstPtr, imageindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex")

public actual fun setupDiGetClassImageList(classimagelistdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList")

public actual fun setupDiGetClassImageListExA(classimagelistdata: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA")

public actual fun setupDiGetClassImageListExW(classimagelistdata: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW")

public actual fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: MutPtr, classinstallparamssize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA")

public actual fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: MutPtr, classinstallparamssize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW")

public actual fun setupDiGetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW")

public actual fun setupDiGetClassPropertyKeys(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys")

public actual fun setupDiGetClassPropertyKeysExW(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW")

public actual fun setupDiGetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW")

public actual fun setupDiGetClassRegistryPropertyA(classguid: ConstPtr, property: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA")

public actual fun setupDiGetClassRegistryPropertyW(classguid: ConstPtr, property: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW")

public actual fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA")

public actual fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW")

public actual fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass")

public actual fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA")

public actual fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW")

public actual fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA")

public actual fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW")

public actual fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA")

public actual fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW")

public actual fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, aliasinterfaceclassguid: ConstPtr, aliasdeviceinterfacedata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias")

public actual fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, deviceinterfacedetaildata: MutPtr, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA")

public actual fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, deviceinterfacedetaildata: MutPtr, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW")

public actual fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys")

public actual fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW")

public actual fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys")

public actual fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW")

public actual fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA")

public actual fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW")

public actual fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinfodetaildata: MutPtr, driverinfodetaildatasize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA")

public actual fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinfodetaildata: MutPtr, driverinfodetaildatasize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW")

public actual fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA")

public actual fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW")

public actual fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA")

public actual fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA")

public actual fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW")

public actual fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW")

public actual fun setupDiGetHwProfileList(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList")

public actual fun setupDiGetHwProfileListExA(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA")

public actual fun setupDiGetHwProfileListExW(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW")

public actual fun setupDiGetINFClassA(infname: Pcstr, classguid: MutPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA")

public actual fun setupDiGetINFClassW(infname: Pcwstr, classguid: MutPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW")

public actual fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice")

public actual fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA")

public actual fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW")

public actual fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, installwizarddata: ConstPtr, pagetype: UInt, flags: UInt): Hpropsheetpage =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage")

public actual fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA")

public actual fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr, interfaceclassguid: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA")

public actual fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr, interfaceclassguid: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW")

public actual fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW")

public actual fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice")

public actual fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces")

public actual fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles")

public actual fun setupDiLoadClassIcon(classguid: ConstPtr, largeicon: MutPtr, miniiconindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon")

public actual fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon")

public actual fun setupDiOpenClassRegKey(classguid: ConstPtr, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey")

public actual fun setupDiOpenClassRegKeyExA(classguid: ConstPtr, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: ConstPtr): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA")

public actual fun setupDiOpenClassRegKeyExW(classguid: ConstPtr, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW")

public actual fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey")

public actual fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA")

public actual fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW")

public actual fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA")

public actual fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey")

public actual fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW")

public actual fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers")

public actual fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: ConstPtr, dupdeviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo")

public actual fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice")

public actual fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface")

public actual fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices")

public actual fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv")

public actual fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice")

public actual fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv")

public actual fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: ConstPtr, classinstallparamssize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA")

public actual fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: ConstPtr, classinstallparamssize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW")

public actual fun setupDiSetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW")

public actual fun setupDiSetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW")

public actual fun setupDiSetClassRegistryPropertyA(classguid: ConstPtr, property: UInt, propertybuffer: ConstPtr, propertybuffersize: UInt, machinename: Pcstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA")

public actual fun setupDiSetClassRegistryPropertyW(classguid: ConstPtr, property: UInt, propertybuffer: ConstPtr, propertybuffersize: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW")

public actual fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA")

public actual fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW")

public actual fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr, flags: UInt, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault")

public actual fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW")

public actual fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW")

public actual fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, property: SetupDiRegistryProperty, propertybuffer: ConstPtr, propertybuffersize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA")

public actual fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, property: SetupDiRegistryProperty, propertybuffer: ConstPtr, propertybuffersize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW")

public actual fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA")

public actual fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW")

public actual fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice")

public actual fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, driverinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA")

public actual fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, driverinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW")

public actual fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice")

public actual fun setupDuplicateDiskSpaceListA(diskspace: ConstPtr, reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA")

public actual fun setupDuplicateDiskSpaceListW(diskspace: ConstPtr, reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW")

public actual fun setupEnumInfSectionsA(infhandle: ConstPtr, index: UInt, buffer: Pstr, size: UInt, sizeneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA")

public actual fun setupEnumInfSectionsW(infhandle: ConstPtr, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW")

public actual fun setupFindFirstLineA(infhandle: ConstPtr, section: Pcstr, key: Pcstr, context: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA")

public actual fun setupFindFirstLineW(infhandle: ConstPtr, section: Pcwstr, key: Pcwstr, context: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW")

public actual fun setupFindNextLine(contextin: ConstPtr, contextout: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine")

public actual fun setupFindNextMatchLineA(contextin: ConstPtr, key: Pcstr, contextout: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA")

public actual fun setupFindNextMatchLineW(contextin: ConstPtr, key: Pcwstr, contextout: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW")

public actual fun setupFreeSourceListA(list: MutPtr, count: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA")

public actual fun setupFreeSourceListW(list: MutPtr, count: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW")

public actual fun setupGetBackupInformationA(queuehandle: ConstPtr, backupparams: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA")

public actual fun setupGetBackupInformationW(queuehandle: ConstPtr, backupparams: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW")

public actual fun setupGetBinaryField(context: ConstPtr, fieldindex: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField")

public actual fun setupGetFieldCount(context: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount")

public actual fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA")

public actual fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA")

public actual fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW")

public actual fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW")

public actual fun setupGetFileQueueCount(filequeue: ConstPtr, subqueuefileop: UInt, numoperations: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount")

public actual fun setupGetFileQueueFlags(filequeue: ConstPtr, flags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags")

public actual fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: ConstPtr, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA")

public actual fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: ConstPtr, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW")

public actual fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA")

public actual fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW")

public actual fun setupGetInfInformationA(infspec: ConstPtr, searchcontrol: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA")

public actual fun setupGetInfInformationW(infspec: ConstPtr, searchcontrol: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW")

public actual fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA")

public actual fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW")

public actual fun setupGetIntField(context: ConstPtr, fieldindex: UInt, integervalue: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField")

public actual fun setupGetLineByIndexA(infhandle: ConstPtr, section: Pcstr, index: UInt, context: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA")

public actual fun setupGetLineByIndexW(infhandle: ConstPtr, section: Pcwstr, index: UInt, context: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW")

public actual fun setupGetLineCountA(infhandle: ConstPtr, section: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA")

public actual fun setupGetLineCountW(infhandle: ConstPtr, section: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW")

public actual fun setupGetLineTextA(context: ConstPtr, infhandle: ConstPtr, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA")

public actual fun setupGetLineTextW(context: ConstPtr, infhandle: ConstPtr, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW")

public actual fun setupGetMultiSzFieldA(context: ConstPtr, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA")

public actual fun setupGetMultiSzFieldW(context: ConstPtr, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode(): Int

public actual fun setupGetNonInteractiveMode(): Bool =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode()

public actual fun setupGetSourceFileLocationA(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcstr, sourceid: MutPtr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA")

public actual fun setupGetSourceFileLocationW(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcwstr, sourceid: MutPtr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW")

public actual fun setupGetSourceFileSizeA(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcstr, section: Pcstr, filesize: MutPtr, roundingfactor: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA")

public actual fun setupGetSourceFileSizeW(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcwstr, section: Pcwstr, filesize: MutPtr, roundingfactor: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW")

public actual fun setupGetSourceInfoA(infhandle: ConstPtr, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA")

public actual fun setupGetSourceInfoW(infhandle: ConstPtr, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW")

public actual fun setupGetStringFieldA(context: ConstPtr, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA")

public actual fun setupGetStringFieldW(context: ConstPtr, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW")

public actual fun setupGetTargetPathA(infhandle: ConstPtr, infcontext: ConstPtr, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA")

public actual fun setupGetTargetPathW(infhandle: ConstPtr, infcontext: ConstPtr, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken(): Long

public actual fun setupGetThreadLogToken(): ULong =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken().toULong()

public actual fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback")

public actual fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx")

public actual fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA")

public actual fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW")

public actual fun setupInstallFileA(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA")

public actual fun setupInstallFileExA(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr, filewasinuse: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA")

public actual fun setupInstallFileExW(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr, filewasinuse: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW")

public actual fun setupInstallFileW(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW")

public actual fun setupInstallFilesFromInfSectionA(infhandle: ConstPtr, layoutinfhandle: ConstPtr, filequeue: ConstPtr, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA")

public actual fun setupInstallFilesFromInfSectionW(infhandle: ConstPtr, layoutinfhandle: ConstPtr, filequeue: ConstPtr, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW")

public actual fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: ConstPtr, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: ConstPtr, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA")

public actual fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: ConstPtr, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: ConstPtr, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW")

public actual fun setupInstallServicesFromInfSectionA(infhandle: ConstPtr, sectionname: Pcstr, flags: SpsvcinstFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA")

public actual fun setupInstallServicesFromInfSectionExA(infhandle: ConstPtr, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA")

public actual fun setupInstallServicesFromInfSectionExW(infhandle: ConstPtr, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW")

public actual fun setupInstallServicesFromInfSectionW(infhandle: ConstPtr, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW")

public actual fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA")

public actual fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW")

public actual fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA")

public actual fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW")

public actual fun setupLogFileA(fileloghandle: ConstPtr, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA")

public actual fun setupLogFileW(fileloghandle: ConstPtr, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW")

public actual fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: ConstPtr, errorline: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA")

public actual fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: ConstPtr, errorline: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW")

public actual fun setupOpenFileQueue(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue")

public actual fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA")

public actual fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(erase: Int): Int

public actual fun setupOpenLog(erase: Bool): Bool =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(erase)

public actual fun setupOpenMasterInf(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf")

public actual fun setupPrepareQueueForRestoreA(queuehandle: ConstPtr, backuppath: Pcstr, restoreflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA")

public actual fun setupPrepareQueueForRestoreW(queuehandle: ConstPtr, backuppath: Pcwstr, restoreflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW")

public actual fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA")

public actual fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW")

public actual fun setupPromptReboot(filequeue: ConstPtr, owner: Hwnd, scanonly: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot")

public actual fun setupQueryDrivesInDiskSpaceListA(diskspace: ConstPtr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA")

public actual fun setupQueryDrivesInDiskSpaceListW(diskspace: ConstPtr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW")

public actual fun setupQueryFileLogA(fileloghandle: ConstPtr, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA")

public actual fun setupQueryFileLogW(fileloghandle: ConstPtr, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW")

public actual fun setupQueryInfFileInformationA(infinformation: ConstPtr, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA")

public actual fun setupQueryInfFileInformationW(infinformation: ConstPtr, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW")

public actual fun setupQueryInfOriginalFileInformationA(infinformation: ConstPtr, infindex: UInt, alternateplatforminfo: ConstPtr, originalfileinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA")

public actual fun setupQueryInfOriginalFileInformationW(infinformation: ConstPtr, infindex: UInt, alternateplatforminfo: ConstPtr, originalfileinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW")

public actual fun setupQueryInfVersionInformationA(infinformation: ConstPtr, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA")

public actual fun setupQueryInfVersionInformationW(infinformation: ConstPtr, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW")

public actual fun setupQuerySourceListA(flags: UInt, list: MutPtr, count: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA")

public actual fun setupQuerySourceListW(flags: UInt, list: MutPtr, count: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW")

public actual fun setupQuerySpaceRequiredOnDriveA(diskspace: ConstPtr, drivespec: Pcstr, spacerequired: MutPtr, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA")

public actual fun setupQuerySpaceRequiredOnDriveW(diskspace: ConstPtr, drivespec: Pcwstr, spacerequired: MutPtr, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW")

public actual fun setupQueueCopyA(queuehandle: ConstPtr, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA")

public actual fun setupQueueCopyIndirectA(copyparams: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA")

public actual fun setupQueueCopyIndirectW(copyparams: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW")

public actual fun setupQueueCopySectionA(queuehandle: ConstPtr, sourcerootpath: Pcstr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA")

public actual fun setupQueueCopySectionW(queuehandle: ConstPtr, sourcerootpath: Pcwstr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW")

public actual fun setupQueueCopyW(queuehandle: ConstPtr, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW")

public actual fun setupQueueDefaultCopyA(queuehandle: ConstPtr, infhandle: ConstPtr, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA")

public actual fun setupQueueDefaultCopyW(queuehandle: ConstPtr, infhandle: ConstPtr, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW")

public actual fun setupQueueDeleteA(queuehandle: ConstPtr, pathpart1: Pcstr, pathpart2: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA")

public actual fun setupQueueDeleteSectionA(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA")

public actual fun setupQueueDeleteSectionW(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW")

public actual fun setupQueueDeleteW(queuehandle: ConstPtr, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW")

public actual fun setupQueueRenameA(queuehandle: ConstPtr, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA")

public actual fun setupQueueRenameSectionA(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA")

public actual fun setupQueueRenameSectionW(queuehandle: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, section: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW")

public actual fun setupQueueRenameW(queuehandle: ConstPtr, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW")

public actual fun setupRemoveFileLogEntryA(fileloghandle: ConstPtr, logsectionname: Pcstr, targetfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA")

public actual fun setupRemoveFileLogEntryW(fileloghandle: ConstPtr, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW")

public actual fun setupRemoveFromDiskSpaceListA(diskspace: ConstPtr, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA")

public actual fun setupRemoveFromDiskSpaceListW(diskspace: ConstPtr, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW")

public actual fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA")

public actual fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW")

public actual fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcstr, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA")

public actual fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcwstr, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW")

public actual fun setupRemoveSectionFromDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA")

public actual fun setupRemoveSectionFromDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW")

public actual fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA")

public actual fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW")

public actual fun setupScanFileQueueA(filequeue: ConstPtr, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: ConstPtr, result: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA")

public actual fun setupScanFileQueueW(filequeue: ConstPtr, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: ConstPtr, result: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW")

public actual fun setupSetDirectoryIdA(infhandle: ConstPtr, id: UInt, directory: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA")

public actual fun setupSetDirectoryIdExA(infhandle: ConstPtr, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA")

public actual fun setupSetDirectoryIdExW(infhandle: ConstPtr, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW")

public actual fun setupSetDirectoryIdW(infhandle: ConstPtr, id: UInt, directory: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW")

public actual fun setupSetFileQueueAlternatePlatformA(queuehandle: ConstPtr, alternateplatforminfo: ConstPtr, alternatedefaultcatalogfile: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA")

public actual fun setupSetFileQueueAlternatePlatformW(queuehandle: ConstPtr, alternateplatforminfo: ConstPtr, alternatedefaultcatalogfile: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW")

public actual fun setupSetFileQueueFlags(filequeue: ConstPtr, flagmask: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(noninteractiveflag: Int): Int

public actual fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(noninteractiveflag)

public actual fun setupSetPlatformPathOverrideA(override: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA")

public actual fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW")

public actual fun setupSetSourceListA(flags: UInt, sourcelist: ConstPtr, sourcecount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA")

public actual fun setupSetSourceListW(flags: UInt, sourcelist: ConstPtr, sourcecount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken")
private external fun wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(logtoken: Long): Unit

public actual fun setupSetThreadLogToken(logtoken: ULong): Unit =
    wasiWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(logtoken.toLong())

public actual fun setupTermDefaultQueueCallback(context: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback")

public actual fun setupTerminateFileLog(fileloghandle: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog")

public actual fun setupUninstallNewlyCopiedInfs(filequeue: ConstPtr, flags: UInt, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs")

public actual fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA")

public actual fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW")

public actual fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: ConstPtr, infsignerinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA")

public actual fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: ConstPtr, infsignerinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW")

public actual fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog")

public actual fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError")

public actual fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: ConstPtr, context: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine")

public actual fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA")

public actual fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW")
