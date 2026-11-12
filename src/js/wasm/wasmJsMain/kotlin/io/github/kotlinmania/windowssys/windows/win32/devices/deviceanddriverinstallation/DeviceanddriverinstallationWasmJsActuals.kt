@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.Priority
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderaV2
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderwV2
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesDeviceanddriverinstallationNapiAddon(): Boolean

private val windowsWin32DevicesDeviceanddriverinstallationNapiAvailable: Boolean = initWindowsWin32DevicesDeviceanddriverinstallationNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion()")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc()")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList()")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog()")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode()")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken()")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue()")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf()")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine(p0: String, p1: Int, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

public actual fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(dwtimeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddEmptyLogConf(plclogconf: MutPtr<ULong>, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf(plclogconf.rawAddress.toString(), dndevinst.toInt(), priority, ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddEmptyLogConfEx(plclogconf: MutPtr<ULong>, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx(plclogconf.rawAddress.toString(), dndevinst.toInt(), priority, ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda(dndevinst.toInt(), pszid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw(dndevinst.toInt(), pszid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA(dndevinst.toInt(), pszid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW(dndevinst.toInt(), pszid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddResDes(prdresdes: MutPtr<ULong>, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes(prdresdes.rawAddress.toString(), lclogconf.toString(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmAddResDesEx(prdresdes: MutPtr<ULong>, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx(prdresdes.rawAddress.toString(), lclogconf.toString(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmConnectMachineA(uncservername: Pcstr, phmachine: MutPtr<Long>): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA(uncservername.rawAddress.toString(), phmachine.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmConnectMachineW(uncservername: Pcwstr, phmachine: MutPtr<Long>): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW(uncservername.rawAddress.toString(), phmachine.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), dnparent.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), dnparent.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeExA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), dnparent.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateDevNodeExW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), dnparent.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCreateRangeList(prlh: MutPtr<ULong>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList(prlh.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteClassKey(classguid: ConstPtr<Guid>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey(classguid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteClassKeyEx(classguid: ConstPtr<Guid>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx(classguid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA(pszdeviceinterface.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW(pszdeviceinterface.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA(pszdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW(pszdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, pbconflictdetected: MutPtr<Bool>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict(dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), pbconflictdetected.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, pbconflictdetected: MutPtr<Bool>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx(dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), pbconflictdetected.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDisconnectMachine(hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(rlhold.toString(), rlhnew.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateClasses(ulclassindex: UInt, classguid: MutPtr<Guid>, ulflags: CmEnumerateFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses(ulclassindex.toInt(), classguid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: MutPtr<Guid>, ulflags: CmEnumerateFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx(ulclassindex.toInt(), classguid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA(ulenumindex.toInt(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW(ulenumindex.toInt(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA(ulenumindex.toInt(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW(ulenumindex.toInt(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFindRange(pullstart: MutPtr<ULong>, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange(pullstart.rawAddress.toString(), ullstart.toString(), ullength.toInt(), ullalignment.toString(), ullend.toString(), rlh.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFirstRange(rlh: ULong, pullstart: MutPtr<ULong>, pullend: MutPtr<ULong>, preelement: MutPtr<ULong>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange(rlh.toString(), pullstart.rawAddress.toString(), pullend.rawAddress.toString(), preelement.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(lclogconftobefreed.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(lclogconftobefreed.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeLogConfHandle(lclogconf: ULong): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(lclogconf.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(rlh.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes(prdresdes.rawAddress.toString(), rdresdes.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx(prdresdes.rawAddress.toString(), rdresdes.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResDesHandle(rdresdes: ULong): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(rdresdes.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(clconflictlist.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetChild(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetChildEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameA(classguid: ConstPtr<Guid>, pszkeyname: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA(classguid.rawAddress.toString(), pszkeyname.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameW(classguid: ConstPtr<Guid>, pszkeyname: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW(classguid.rawAddress.toString(), pszkeyname.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameExA(classguid: ConstPtr<Guid>, pszkeyname: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA(classguid.rawAddress.toString(), pszkeyname.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassKeyNameExW(classguid: ConstPtr<Guid>, pszkeyname: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW(classguid.rawAddress.toString(), pszkeyname.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameA(classguid: ConstPtr<Guid>, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA(classguid.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameW(classguid: ConstPtr<Guid>, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW(classguid.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameExA(classguid: ConstPtr<Guid>, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA(classguid.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassNameExW(classguid: ConstPtr<Guid>, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW(classguid.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyKeys(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys(classguid.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassPropertyKeysEx(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx(classguid.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassRegistryPropertyA(classguid: ConstPtr<Guid>, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA(classguid.rawAddress.toString(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetClassRegistryPropertyW(classguid: ConstPtr<Guid>, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW(classguid.rawAddress.toString(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDepth(puldepth: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth(puldepth.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDepthEx(puldepth: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx(puldepth.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA(dndevinst.toInt(), pszcustompropertyname.rawAddress.toString(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW(dndevinst.toInt(), pszcustompropertyname.rawAddress.toString(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA(dndevinst.toInt(), pszcustompropertyname.rawAddress.toString(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW(dndevinst.toInt(), pszcustompropertyname.rawAddress.toString(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW(dndevinst.toInt(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW(dndevinst.toInt(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys(dndevinst.toInt(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx(dndevinst.toInt(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress.toString(), buffer.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeStatus(pulstatus: MutPtr<CmDevnodeStatusFlags>, pulproblemnumber: MutPtr<CmProb>, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus(pulstatus.rawAddress.toString(), pulproblemnumber.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDevNodeStatusEx(pulstatus: MutPtr<CmDevnodeStatusFlags>, pulproblemnumber: MutPtr<CmProb>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx(pulstatus.rawAddress.toString(), pulproblemnumber.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda(dndevinst.toInt(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw(dndevinst.toInt(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA(dndevinst.toInt(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW(dndevinst.toInt(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA(pszfilter.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW(pszfilter.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA(pszfilter.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW(pszfilter.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeA(pullen: MutPtr<UInt>, pszfilter: Pcstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA(pullen.rawAddress.toString(), pszfilter.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeW(pullen: MutPtr<UInt>, pszfilter: Pcwstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW(pullen.rawAddress.toString(), pszfilter.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeExA(pullen: MutPtr<UInt>, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA(pullen.rawAddress.toString(), pszfilter.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdListSizeExW(pullen: MutPtr<UInt>, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW(pullen.rawAddress.toString(), pszfilter.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdSize(pullen: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize(pullen.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceIdSizeEx(pullen: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx(pullen.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA(pszdeviceinterface.rawAddress.toString(), aliasinterfaceguid.rawAddress.toString(), pszaliasdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW(pszdeviceinterface.rawAddress.toString(), aliasinterfaceguid.rawAddress.toString(), pszaliasdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA(pszdeviceinterface.rawAddress.toString(), aliasinterfaceguid.rawAddress.toString(), pszaliasdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW(pszdeviceinterface.rawAddress.toString(), aliasinterfaceguid.rawAddress.toString(), pszaliasdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListA(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA(interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListW(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW(interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListExA(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA(interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListExW(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW(interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeA(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA(pullen.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeW(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW(pullen.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeExA(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA(pullen.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfaceListSizeExW(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW(pullen.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW(pszdeviceinterface.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW(pszdeviceinterface.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW(pszdeviceinterface.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetFirstLogConf(plclogconf: MutPtr<ULong>, dndevinst: UInt, ulflags: CmLogConf): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf(plclogconf.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetFirstLogConfEx(plclogconf: MutPtr<ULong>, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx(plclogconf.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetGlobalState(pulstate: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState(pulstate.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetGlobalStateEx(pulstate: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx(pulstate.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA(pdeviceid.rawAddress.toString(), ulhardwareprofile.toInt(), pulvalue.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW(pdeviceid.rawAddress.toString(), ulhardwareprofile.toInt(), pulvalue.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA(pdeviceid.rawAddress.toString(), ulhardwareprofile.toInt(), pulvalue.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW(pdeviceid.rawAddress.toString(), ulhardwareprofile.toInt(), pulvalue.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoA>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA(ulindex.toInt(), phwprofileinfo.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoW>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW(ulindex.toInt(), phwprofileinfo.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoA>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA(ulindex.toInt(), phwprofileinfo.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoW>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW(ulindex.toInt(), phwprofileinfo.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetLogConfPriority(lclogconf: ULong, ppriority: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority(lclogconf.toString(), ppriority.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx(lclogconf.toString(), ppriority.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextLogConf(plclogconf: MutPtr<ULong>, lclogconf: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf(plclogconf.rawAddress.toString(), lclogconf.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextLogConfEx(plclogconf: MutPtr<ULong>, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx(plclogconf.rawAddress.toString(), lclogconf.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr<CmRestype>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes(prdresdes.rawAddress.toString(), rdresdes.toString(), forresource.toInt(), presourceid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetNextResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr<CmRestype>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx(prdresdes.rawAddress.toString(), rdresdes.toString(), forresource.toInt(), presourceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetParent(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetParentEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesData(rdresdes: ULong, buffer: MutPtr<CVoid>, bufferlen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData(rdresdes.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataEx(rdresdes: ULong, buffer: MutPtr<CVoid>, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx(rdresdes.toString(), buffer.rawAddress.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataSize(pulsize: MutPtr<UInt>, rdresdes: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize(pulsize.rawAddress.toString(), rdresdes.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResDesDataSizeEx(pulsize: MutPtr<UInt>, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx(pulsize.rawAddress.toString(), rdresdes.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: MutPtr<UInt>): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount(clconflictlist.toString(), pulcount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr<ConflictDetailsA>): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA(clconflictlist.toString(), ulindex.toInt(), pconflictdetails.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr<ConflictDetailsW>): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW(clconflictlist.toString(), ulindex.toInt(), pconflictdetails.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetSibling(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetSiblingEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx(pdndevinst.rawAddress.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetVersion(): UShort =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetVersionEx(hmachine: Long): UShort =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(hmachine.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(rlhold1.toString(), rlhold2.toString(), rlhnew.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(rlhold.toString(), rlhnew.toString(), ullmaxvalue.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsDockStationPresent(pbpresent: MutPtr<Bool>): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent(pbpresent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsDockStationPresentEx(pbpresent: MutPtr<Bool>, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx(pbpresent.rawAddress.toString(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsVersionAvailable(wversion: UShort): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(wversion.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(wversion.toInt(), hmachine.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeExA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmLocateDevNodeExW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW(pdndevinst.rawAddress.toString(), pdeviceid.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(cmreturncode.toInt(), defaulterr.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(rlhold1.toString(), rlhold2.toString(), rlhnew.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmModifyResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes(prdresdes.rawAddress.toString(), rdresdes.toString(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmModifyResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx(prdresdes.rawAddress.toString(), rdresdes.toString(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmNextRange(preelement: MutPtr<ULong>, pullstart: MutPtr<ULong>, pullend: MutPtr<ULong>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange(preelement.rawAddress.toString(), pullstart.rawAddress.toString(), pullend.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyA(classguid: ConstPtr<Guid>, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA(classguid.rawAddress.toString(), pszclassname.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkclass.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyW(classguid: ConstPtr<Guid>, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW(classguid.rawAddress.toString(), pszclassname.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkclass.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyExA(classguid: ConstPtr<Guid>, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA(classguid.rawAddress.toString(), pszclassname.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkclass.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenClassKeyExW(classguid: ConstPtr<Guid>, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW(classguid.rawAddress.toString(), pszclassname.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkclass.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr<Hkey>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA(pszdeviceinterface.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW(pszdeviceinterface.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA(pszdeviceinterface.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW(pszdeviceinterface.rawAddress.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA(dnancestor.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW(dnancestor.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA(dnancestor.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW(dnancestor.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeData(pdata: MutPtr<CVoid>, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData(pdata.rawAddress.toString(), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeDataEx(pdata: MutPtr<CVoid>, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx(pdata.rawAddress.toString(), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeSize(pulsize: MutPtr<UInt>, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize(pulsize.rawAddress.toString(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryArbitratorFreeSizeEx(pulsize: MutPtr<UInt>, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx(pulsize.rawAddress.toString(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(dnancestor.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmQueryResourceConflictList(pclconflictlist: MutPtr<ULong>, dndevinst: UInt, resourceid: CmRestype, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList(pclconflictlist.rawAddress.toString(), dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA(dndevinst.toInt(), interfaceclassguid.rawAddress.toString(), pszreference.rawAddress.toString(), pszdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW(dndevinst.toInt(), interfaceclassguid.rawAddress.toString(), pszreference.rawAddress.toString(), pszdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA(dndevinst.toInt(), interfaceclassguid.rawAddress.toString(), pszreference.rawAddress.toString(), pszdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW(dndevinst.toInt(), interfaceclassguid.rawAddress.toString(), pszreference.rawAddress.toString(), pszdeviceinterface.rawAddress.toString(), pullength.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterNotification(pfilter: ConstPtr<CmNotifyFilter>, pcontext: ConstPtr<CVoid>, pcallback: PcmNotifyCallback, pnotifycontext: MutPtr<Hcmnotification>): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification(pfilter.rawAddress.toString(), pcontext.rawAddress.toString(), 0L.toString(), pnotifycontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(dnancestor.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA(dndevinst.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW(dndevinst.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA(dndevinst.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW(dndevinst.toInt(), pvetotype.rawAddress.toString(), pszvetoname.rawAddress.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestEjectPc(): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRequestEjectPcEx(hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRunDetection(ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassRegistryPropertyA(classguid: ConstPtr<Guid>, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA(classguid.rawAddress.toString(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetClassRegistryPropertyW(classguid: ConstPtr<Guid>, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW(classguid.rawAddress.toString(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW(dndevinst.toInt(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW(dndevinst.toInt(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW(pszdeviceinterface.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW(pszdeviceinterface.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(ulhardwareprofile.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(ulhardwareprofile.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA(pdeviceid.rawAddress.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW(pdeviceid.rawAddress.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA(pdeviceid.rawAddress.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW(pdeviceid.rawAddress.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA(pszdeviceinterface.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW(pszdeviceinterface.rawAddress.toString(), ulflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA(pszdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW(pszdeviceinterface.rawAddress.toString(), ulflags.toInt(), hmachine.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification(notifycontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, flags: DiinstalldeviceFlags, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice(hwndparent.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA(hwndparent.rawAddress.toString(), infpath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW(hwndparent.rawAddress.toString(), infpath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, flags: UInt, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice(hwndparent.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver(hwndparent.rawAddress.toString(), filepath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, flags: UInt, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice(hwndparent.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA(hwndparent.rawAddress.toString(), infpath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW(hwndparent.rawAddress.toString(), infpath.rawAddress.toString(), flags.toInt(), needreboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA(window.rawAddress.toString(), modulehandle.rawAddress.toString(), commandline.rawAddress.toString(), showcommand)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW(window.rawAddress.toString(), modulehandle.rawAddress.toString(), commandline.rawAddress.toString(), showcommand)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupAddInstallSectionToDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddInstallSectionToDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddSectionToDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddSectionToDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToDiskSpaceListA(diskspace: ConstPtr<CVoid>, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA(diskspace.rawAddress.toString(), targetfilespec.rawAddress.toString(), filesize.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToDiskSpaceListW(diskspace: ConstPtr<CVoid>, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW(diskspace.rawAddress.toString(), targetfilespec.rawAddress.toString(), filesize.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA(flags.toInt(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW(flags.toInt(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAdjustDiskSpaceListA(diskspace: ConstPtr<CVoid>, driveroot: Pcstr, amount: Long, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA(diskspace.rawAddress.toString(), driveroot.rawAddress.toString(), amount.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupAdjustDiskSpaceListW(diskspace: ConstPtr<CVoid>, driveroot: Pcwstr, amount: Long, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW(diskspace.rawAddress.toString(), driveroot.rawAddress.toString(), amount.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), sourcefile.rawAddress.toString(), targetfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), sourcefile.rawAddress.toString(), targetfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCancelTemporarySourceList(): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCloseFileQueue(queuehandle: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue(queuehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCloseInfFile(infhandle: ConstPtr<CVoid>) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile(infhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupCloseLog() {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupCommitFileQueueA(owner: Hwnd, queuehandle: ConstPtr<CVoid>, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA(owner.rawAddress.toString(), queuehandle.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCommitFileQueueW(owner: Hwnd, queuehandle: ConstPtr<CVoid>, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW(owner.rawAddress.toString(), queuehandle.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupConfigureWmiFromInfSectionA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupConfigureWmiFromInfSectionW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), diskname.rawAddress.toString(), pathtosource.rawAddress.toString(), sourcefile.rawAddress.toString(), targetpathfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt(), pathbuffer.rawAddress.toString(), pathbuffersize.toInt(), pathrequiredsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), diskname.rawAddress.toString(), pathtosource.rawAddress.toString(), sourcefile.rawAddress.toString(), targetpathfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt(), pathbuffer.rawAddress.toString(), pathbuffersize.toInt(), pathrequiredsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: MutPtr<UInt>, destinationinffilenamecomponent: MutPtr<Pstr>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA(sourceinffilename.rawAddress.toString(), oemsourcemedialocation.rawAddress.toString(), oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename.rawAddress.toString(), destinationinffilenamesize.toInt(), requiredsize.rawAddress.toString(), destinationinffilenamecomponent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: MutPtr<UInt>, destinationinffilenamecomponent: MutPtr<Pwstr>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW(sourceinffilename.rawAddress.toString(), oemsourcemedialocation.rawAddress.toString(), oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename.rawAddress.toString(), destinationinffilenamesize.toInt(), requiredsize.rawAddress.toString(), destinationinffilenamecomponent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCreateDiskSpaceListA(reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA(reserved1.rawAddress.toString(), reserved2.toInt(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupCreateDiskSpaceListW(reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW(reserved1.rawAddress.toString(), reserved2.toInt(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: ConstPtr<FileCompressionType>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA(sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), compressiontype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: ConstPtr<FileCompressionType>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW(sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), compressiontype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDefaultQueueCallbackA(context: ConstPtr<CVoid>, notification: UInt, param1: ULong, param2: ULong): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA(context.rawAddress.toString(), notification.toInt(), param1.toString(), param2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDefaultQueueCallbackW(context: ConstPtr<CVoid>, notification: UInt, param1: ULong, param2: ULong): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW(context.rawAddress.toString(), notification.toInt(), param1.toString(), param2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), file.rawAddress.toString(), win32errorcode.toInt(), style.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), file.rawAddress.toString(), win32errorcode.toInt(), style.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDestroyDiskSpaceList(diskspace: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList(diskspace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoList(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList(flags.toInt(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA(flags.toInt(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW(flags.toInt(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, drivertype: SetupDiDriverType): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), drivertype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller(installfunction.toInt(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(deviceinfoset.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA(classname.rawAddress.toString(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA(classname.rawAddress.toString(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW(classname.rawAddress.toString(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW(classname.rawAddress.toString(), classguidlist.rawAddress.toString(), classguidlistsize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidA(classguid: ConstPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA(classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidExA(classguid: ConstPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA(classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidExW(classguid: ConstPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW(classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiClassNameFromGuidW(classguid: ConstPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW(classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcstr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle.rawAddress.toString(), infsectionname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle.rawAddress.toString(), infsectionname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: ConstPtr<Guid>, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA(deviceinfoset.toString(), devicename.rawAddress.toString(), classguid.rawAddress.toString(), devicedescription.rawAddress.toString(), hwndparent.rawAddress.toString(), creationflags.toInt(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoList(classguid: ConstPtr<Guid>, hwndparent: Hwnd): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList(classguid.rawAddress.toString(), hwndparent.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoListExA(classguid: ConstPtr<Guid>, hwndparent: Hwnd, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA(classguid.rawAddress.toString(), hwndparent.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoListExW(classguid: ConstPtr<Guid>, hwndparent: Hwnd, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW(classguid.rawAddress.toString(), hwndparent.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: ConstPtr<Guid>, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW(deviceinfoset.toString(), devicename.rawAddress.toString(), classguid.rawAddress.toString(), devicedescription.rawAddress.toString(), hwndparent.rawAddress.toString(), creationflags.toInt(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), referencestring.rawAddress.toString(), creationflags.toInt(), deviceinterfacedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcstr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), reserved.toInt(), samdesired.toInt(), infhandle.rawAddress.toString(), infsectionname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), reserved.toInt(), samdesired.toInt(), infhandle.rawAddress.toString(), infsectionname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), referencestring.rawAddress.toString(), creationflags.toInt(), deviceinterfacedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyClassImageList(classimagelistdata: ConstPtr<SpClassimagelistData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList(classimagelistdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(deviceinfoset.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), drivertype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo(deviceinfoset.toString(), memberindex.toInt(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, memberindex: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), memberindex.toInt(), deviceinterfacedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), drivertype.toInt(), memberindex.toInt(), driverinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), drivertype.toInt(), memberindex.toInt(), driverinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualModelsSectionA(context: ConstPtr<Infcontext>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA(context.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualModelsSectionW(context: ConstPtr<Infcontext>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW(context.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallA(infhandle: ConstPtr<CVoid>, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pstr>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA(infhandle.rawAddress.toString(), infsectionname.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), extension.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallExA(infhandle: ConstPtr<CVoid>, infsectionname: Pcstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pstr>, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA(infhandle.rawAddress.toString(), infsectionname.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), extension.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallExW(infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pwstr>, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW(infhandle.rawAddress.toString(), infsectionname.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), extension.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetActualSectionToInstallW(infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pwstr>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW(infhandle.rawAddress.toString(), infsectionname.rawAddress.toString(), infsectionwithext.rawAddress.toString(), infsectionwithextsize.toInt(), requiredsize.rawAddress.toString(), extension.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassBitmapIndex(classguid: ConstPtr<Guid>, miniiconindex: MutPtr<Int>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex(classguid.rawAddress.toString(), miniiconindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionA(classguid: ConstPtr<Guid>, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA(classguid.rawAddress.toString(), classdescription.rawAddress.toString(), classdescriptionsize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionExA(classguid: ConstPtr<Guid>, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA(classguid.rawAddress.toString(), classdescription.rawAddress.toString(), classdescriptionsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionExW(classguid: ConstPtr<Guid>, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW(classguid.rawAddress.toString(), classdescription.rawAddress.toString(), classdescriptionsize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDescriptionW(classguid: ConstPtr<Guid>, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW(classguid.rawAddress.toString(), classdescription.rawAddress.toString(), classdescriptionsize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertysheetheader: ConstPtr<PropsheetheaderaV2>, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr<UInt>, propertysheettype: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertysheetheader.rawAddress.toString(), propertysheetheaderpagelistsize.toInt(), requiredsize.rawAddress.toString(), propertysheettype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertysheetheader: ConstPtr<PropsheetheaderwV2>, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr<UInt>, propertysheettype: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertysheetheader.rawAddress.toString(), propertysheetheaderpagelistsize.toInt(), requiredsize.rawAddress.toString(), propertysheettype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsA(classguid: ConstPtr<Guid>, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA(classguid.rawAddress.toString(), enumerator.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsExA(classguid: ConstPtr<Guid>, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA(classguid.rawAddress.toString(), enumerator.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt(), deviceinfoset.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsExW(classguid: ConstPtr<Guid>, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW(classguid.rawAddress.toString(), enumerator.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt(), deviceinfoset.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassDevsW(classguid: ConstPtr<Guid>, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW(classguid.rawAddress.toString(), enumerator.rawAddress.toString(), hwndparent.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageIndex(classimagelistdata: ConstPtr<SpClassimagelistData>, classguid: ConstPtr<Guid>, imageindex: MutPtr<Int>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex(classimagelistdata.rawAddress.toString(), classguid.rawAddress.toString(), imageindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageList(classimagelistdata: MutPtr<SpClassimagelistData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList(classimagelistdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageListExA(classimagelistdata: MutPtr<SpClassimagelistData>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA(classimagelistdata.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassImageListExW(classimagelistdata: MutPtr<SpClassimagelistData>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW(classimagelistdata.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: MutPtr<SpClassinstallHeader>, classinstallparamssize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), classinstallparams.rawAddress.toString(), classinstallparamssize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: MutPtr<SpClassinstallHeader>, classinstallparamssize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), classinstallparams.rawAddress.toString(), classinstallparamssize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyKeys(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys(classguid.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.toInt(), requiredpropertykeycount.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyKeysExW(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW(classguid.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.toInt(), requiredpropertykeycount.rawAddress.toString(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassRegistryPropertyA(classguid: ConstPtr<Guid>, property: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA(classguid.rawAddress.toString(), property.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetClassRegistryPropertyW(classguid: ConstPtr<Guid>, property: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW(classguid.rawAddress.toString(), property.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), custompropertyname.rawAddress.toString(), flags.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), custompropertyname.rawAddress.toString(), flags.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: MutPtr<Guid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass(deviceinfoset.toString(), classguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr<SpDevinfoListDetailDataA>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA(deviceinfoset.toString(), deviceinfosetdetaildata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr<SpDevinfoListDetailDataW>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW(deviceinfoset.toString(), deviceinfosetdetaildata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: MutPtr<SpDevinstallParamsA>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: MutPtr<SpDevinstallParamsW>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstanceid.rawAddress.toString(), deviceinstanceidsize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstanceid.rawAddress.toString(), deviceinstanceidsize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, aliasinterfaceclassguid: ConstPtr<Guid>, aliasdeviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), aliasinterfaceclassguid.rawAddress.toString(), aliasdeviceinterfacedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, deviceinterfacedetaildata: MutPtr<SpDeviceInterfaceDetailDataA>, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr<UInt>, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), deviceinterfacedetaildata.rawAddress.toString(), deviceinterfacedetaildatasize.toInt(), requiredsize.rawAddress.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, deviceinterfacedetaildata: MutPtr<SpDeviceInterfaceDetailDataW>, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr<UInt>, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), deviceinterfacedetaildata.rawAddress.toString(), deviceinterfacedetaildatasize.toInt(), requiredsize.rawAddress.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.toInt(), requiredpropertykeycount.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertykeyarray.rawAddress.toString(), propertykeycount.toInt(), requiredpropertykeycount.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), property.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), property.toInt(), propertyregdatatype.rawAddress.toString(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinfodetaildata: MutPtr<SpDrvinfoDetailDataA>, driverinfodetaildatasize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinfodetaildata.rawAddress.toString(), driverinfodetaildatasize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinfodetaildata: MutPtr<SpDrvinfoDetailDataW>, driverinfodetaildatasize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinfodetaildata.rawAddress.toString(), driverinfodetaildatasize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinstallparams: MutPtr<SpDrvinstallParams>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinstallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinstallparams: MutPtr<SpDrvinstallParams>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinstallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA(hwprofile.toInt(), friendlyname.rawAddress.toString(), friendlynamesize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA(hwprofile.toInt(), friendlyname.rawAddress.toString(), friendlynamesize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW(hwprofile.toInt(), friendlyname.rawAddress.toString(), friendlynamesize.toInt(), requiredsize.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW(hwprofile.toInt(), friendlyname.rawAddress.toString(), friendlynamesize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileList(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList(hwprofilelist.rawAddress.toString(), hwprofilelistsize.toInt(), requiredsize.rawAddress.toString(), currentlyactiveindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileListExA(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA(hwprofilelist.rawAddress.toString(), hwprofilelistsize.toInt(), requiredsize.rawAddress.toString(), currentlyactiveindex.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetHwProfileListExW(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW(hwprofilelist.rawAddress.toString(), hwprofilelistsize.toInt(), requiredsize.rawAddress.toString(), currentlyactiveindex.rawAddress.toString(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetINFClassA(infname: Pcstr, classguid: MutPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA(infname.rawAddress.toString(), classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetINFClassW(infname: Pcwstr, classguid: MutPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW(infname.rawAddress.toString(), classguid.rawAddress.toString(), classname.rawAddress.toString(), classnamesize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, installwizarddata: ConstPtr<SpInstallwizardData>, pagetype: UInt, flags: UInt): Hpropsheetpage =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), installwizarddata.rawAddress.toString(), pagetype.toInt(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA(hwndparent.rawAddress.toString(), inffilename.rawAddress.toString(), flags.toInt(), filequeue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr<CVoid>, interfaceclassguid: ConstPtr<Guid>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA(hwndparent.rawAddress.toString(), inffilename.rawAddress.toString(), flags.toInt(), filequeue.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr<CVoid>, interfaceclassguid: ConstPtr<Guid>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW(hwndparent.rawAddress.toString(), inffilename.rawAddress.toString(), flags.toInt(), filequeue.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW(hwndparent.rawAddress.toString(), inffilename.rawAddress.toString(), flags.toInt(), filequeue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiLoadClassIcon(classguid: ConstPtr<Guid>, largeicon: MutPtr<Hicon>, miniiconindex: MutPtr<Int>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon(classguid.rawAddress.toString(), largeicon.rawAddress.toString(), miniiconindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: MutPtr<Hicon>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), cxicon.toInt(), cyicon.toInt(), flags.toInt(), hicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKey(classguid: ConstPtr<Guid>, samdesired: UInt): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey(classguid.rawAddress.toString(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKeyExA(classguid: ConstPtr<Guid>, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA(classguid.rawAddress.toString(), samdesired.toInt(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenClassRegKeyExW(classguid: ConstPtr<Guid>, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW(classguid.rawAddress.toString(), samdesired.toInt(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA(deviceinfoset.toString(), deviceinstanceid.rawAddress.toString(), hwndparent.rawAddress.toString(), openflags.toInt(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW(deviceinfoset.toString(), deviceinstanceid.rawAddress.toString(), hwndparent.rawAddress.toString(), openflags.toInt(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA(deviceinfoset.toString(), devicepath.rawAddress.toString(), openflags.toInt(), deviceinterfacedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt): Hkey =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), reserved.toInt(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW(deviceinfoset.toString(), devicepath.rawAddress.toString(), openflags.toInt(), deviceinterfacedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: ConstPtr<CVoid>, dupdeviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), flags.toInt(), 0L.toString(), comparecontext.rawAddress.toString(), dupdeviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv(hwndparent.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: ConstPtr<SpClassinstallHeader>, classinstallparamssize: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), classinstallparams.rawAddress.toString(), classinstallparamssize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: ConstPtr<SpClassinstallHeader>, classinstallparamssize: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), classinstallparams.rawAddress.toString(), classinstallparamssize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), flags.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW(classguid.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassRegistryPropertyA(classguid: ConstPtr<Guid>, property: UInt, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA(classguid.rawAddress.toString(), property.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetClassRegistryPropertyW(classguid: ConstPtr<Guid>, property: UInt, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW(classguid.rawAddress.toString(), property.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), machinename.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: ConstPtr<SpDevinstallParamsA>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: ConstPtr<SpDevinstallParamsW>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), deviceinstallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>, flags: UInt, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), flags.toInt(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW(deviceinfoset.toString(), deviceinterfacedata.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), propertykey.rawAddress.toString(), propertytype.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), property.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), property.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinstallparams: ConstPtr<SpDrvinstallParams>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinstallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinstallparams: ConstPtr<SpDrvinstallParams>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString(), driverinstallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW(deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), driverinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice(deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDuplicateDiskSpaceListA(diskspace: ConstPtr<CVoid>, reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA(diskspace.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupDuplicateDiskSpaceListW(diskspace: ConstPtr<CVoid>, reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW(diskspace.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupEnumInfSectionsA(infhandle: ConstPtr<CVoid>, index: UInt, buffer: Pstr, size: UInt, sizeneeded: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA(infhandle.rawAddress.toString(), index.toInt(), buffer.rawAddress.toString(), size.toInt(), sizeneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupEnumInfSectionsW(infhandle: ConstPtr<CVoid>, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW(infhandle.rawAddress.toString(), index.toInt(), buffer.rawAddress.toString(), size.toInt(), sizeneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindFirstLineA(infhandle: ConstPtr<CVoid>, section: Pcstr, key: Pcstr, context: MutPtr<Infcontext>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA(infhandle.rawAddress.toString(), section.rawAddress.toString(), key.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindFirstLineW(infhandle: ConstPtr<CVoid>, section: Pcwstr, key: Pcwstr, context: MutPtr<Infcontext>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW(infhandle.rawAddress.toString(), section.rawAddress.toString(), key.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextLine(contextin: ConstPtr<Infcontext>, contextout: MutPtr<Infcontext>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine(contextin.rawAddress.toString(), contextout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextMatchLineA(contextin: ConstPtr<Infcontext>, key: Pcstr, contextout: MutPtr<Infcontext>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA(contextin.rawAddress.toString(), key.rawAddress.toString(), contextout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFindNextMatchLineW(contextin: ConstPtr<Infcontext>, key: Pcwstr, contextout: MutPtr<Infcontext>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW(contextin.rawAddress.toString(), key.rawAddress.toString(), contextout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFreeSourceListA(list: MutPtr<MutPtr<Pcstr>>, count: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA(list.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupFreeSourceListW(list: MutPtr<MutPtr<Pcwstr>>, count: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW(list.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBackupInformationA(queuehandle: ConstPtr<CVoid>, backupparams: MutPtr<SpBackupQueueParamsV2A>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA(queuehandle.rawAddress.toString(), backupparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBackupInformationW(queuehandle: ConstPtr<CVoid>, backupparams: MutPtr<SpBackupQueueParamsV2W>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW(queuehandle.rawAddress.toString(), backupparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetBinaryField(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: MutPtr<UByte>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFieldCount(context: ConstPtr<Infcontext>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount(context.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: MutPtr<Pstr>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA(sourcefilename.rawAddress.toString(), actualsourcefilename.rawAddress.toString(), sourcefilesize.rawAddress.toString(), targetfilesize.rawAddress.toString(), compressiontype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr<UInt>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA(sourcefilename.rawAddress.toString(), actualsourcefilenamebuffer.rawAddress.toString(), actualsourcefilenamebufferlen.toInt(), requiredbufferlen.rawAddress.toString(), sourcefilesize.rawAddress.toString(), targetfilesize.rawAddress.toString(), compressiontype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr<UInt>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW(sourcefilename.rawAddress.toString(), actualsourcefilenamebuffer.rawAddress.toString(), actualsourcefilenamebufferlen.toInt(), requiredbufferlen.rawAddress.toString(), sourcefilesize.rawAddress.toString(), targetfilesize.rawAddress.toString(), compressiontype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: MutPtr<Pwstr>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW(sourcefilename.rawAddress.toString(), actualsourcefilename.rawAddress.toString(), sourcefilesize.rawAddress.toString(), targetfilesize.rawAddress.toString(), compressiontype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileQueueCount(filequeue: ConstPtr<CVoid>, subqueuefileop: UInt, numoperations: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount(filequeue.rawAddress.toString(), subqueuefileop.toInt(), numoperations.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetFileQueueFlags(filequeue: ConstPtr<CVoid>, flags: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags(filequeue.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA(filename.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), localename.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW(filename.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), localename.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA(directorypath.rawAddress.toString(), infstyle.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW(directorypath.rawAddress.toString(), infstyle.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfInformationA(infspec: ConstPtr<CVoid>, searchcontrol: UInt, returnbuffer: MutPtr<SpInfInformation>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA(infspec.rawAddress.toString(), searchcontrol.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfInformationW(infspec: ConstPtr<CVoid>, searchcontrol: UInt, returnbuffer: MutPtr<SpInfInformation>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW(infspec.rawAddress.toString(), searchcontrol.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA(driverstorelocation.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW(driverstorelocation.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetIntField(context: ConstPtr<Infcontext>, fieldindex: UInt, integervalue: MutPtr<Int>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField(context.rawAddress.toString(), fieldindex.toInt(), integervalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineByIndexA(infhandle: ConstPtr<CVoid>, section: Pcstr, index: UInt, context: MutPtr<Infcontext>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA(infhandle.rawAddress.toString(), section.rawAddress.toString(), index.toInt(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineByIndexW(infhandle: ConstPtr<CVoid>, section: Pcwstr, index: UInt, context: MutPtr<Infcontext>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW(infhandle.rawAddress.toString(), section.rawAddress.toString(), index.toInt(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineCountA(infhandle: ConstPtr<CVoid>, section: Pcstr): Int =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA(infhandle.rawAddress.toString(), section.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineCountW(infhandle: ConstPtr<CVoid>, section: Pcwstr): Int =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW(infhandle.rawAddress.toString(), section.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineTextA(context: ConstPtr<Infcontext>, infhandle: ConstPtr<CVoid>, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA(context.rawAddress.toString(), infhandle.rawAddress.toString(), section.rawAddress.toString(), key.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetLineTextW(context: ConstPtr<Infcontext>, infhandle: ConstPtr<CVoid>, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW(context.rawAddress.toString(), infhandle.rawAddress.toString(), section.rawAddress.toString(), key.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetMultiSzFieldA(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetMultiSzFieldW(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetNonInteractiveMode(): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileLocationA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcstr, sourceid: MutPtr<UInt>, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), filename.rawAddress.toString(), sourceid.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileLocationW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcwstr, sourceid: MutPtr<UInt>, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), filename.rawAddress.toString(), sourceid.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileSizeA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcstr, section: Pcstr, filesize: MutPtr<UInt>, roundingfactor: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), filename.rawAddress.toString(), section.rawAddress.toString(), filesize.rawAddress.toString(), roundingfactor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceFileSizeW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcwstr, section: Pcwstr, filesize: MutPtr<UInt>, roundingfactor: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), filename.rawAddress.toString(), section.rawAddress.toString(), filesize.rawAddress.toString(), roundingfactor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceInfoA(infhandle: ConstPtr<CVoid>, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA(infhandle.rawAddress.toString(), sourceid.toInt(), infodesired.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetSourceInfoW(infhandle: ConstPtr<CVoid>, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW(infhandle.rawAddress.toString(), sourceid.toInt(), infodesired.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetStringFieldA(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetStringFieldW(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW(context.rawAddress.toString(), fieldindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetTargetPathA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), section.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetTargetPathW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), section.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupGetThreadLogToken(): ULong =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback(ownerwindow.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx(ownerwindow.rawAddress.toString(), alternateprogresswindow.rawAddress.toString(), progressmessage.toInt(), reserved1.toInt(), reserved2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA(logfilename.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW(logfilename.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), sourcefile.rawAddress.toString(), sourcepathroot.rawAddress.toString(), destinationname.rawAddress.toString(), copystyle.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileExA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr<CVoid>, filewasinuse: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), sourcefile.rawAddress.toString(), sourcepathroot.rawAddress.toString(), destinationname.rawAddress.toString(), copystyle.toInt(), 0L.toString(), context.rawAddress.toString(), filewasinuse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileExW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr<CVoid>, filewasinuse: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), sourcefile.rawAddress.toString(), sourcepathroot.rawAddress.toString(), destinationname.rawAddress.toString(), copystyle.toInt(), 0L.toString(), context.rawAddress.toString(), filewasinuse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFileW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW(infhandle.rawAddress.toString(), infcontext.rawAddress.toString(), sourcefile.rawAddress.toString(), sourcepathroot.rawAddress.toString(), destinationname.rawAddress.toString(), copystyle.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFilesFromInfSectionA(infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, filequeue: ConstPtr<CVoid>, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA(infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), filequeue.rawAddress.toString(), sectionname.rawAddress.toString(), sourcerootpath.rawAddress.toString(), copyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFilesFromInfSectionW(infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, filequeue: ConstPtr<CVoid>, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW(infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), filequeue.rawAddress.toString(), sectionname.rawAddress.toString(), sourcerootpath.rawAddress.toString(), copyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA(owner.rawAddress.toString(), infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt(), relativekeyroot.rawAddress.toString(), sourcerootpath.rawAddress.toString(), copyflags.toInt(), 0L.toString(), context.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW(owner.rawAddress.toString(), infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt(), relativekeyroot.rawAddress.toString(), sourcerootpath.rawAddress.toString(), copyflags.toInt(), 0L.toString(), context.rawAddress.toString(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: SpsvcinstFlags): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionExA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionExW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt(), deviceinfoset.toString(), deviceinfodata.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupInstallServicesFromInfSectionW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW(infhandle.rawAddress.toString(), sectionname.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA(cabinetfile.rawAddress.toString(), reserved.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW(cabinetfile.rawAddress.toString(), reserved.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA(messagestring.rawAddress.toString(), severity.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW(messagestring.rawAddress.toString(), severity.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogFileA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), checksum.toInt(), disktagfile.rawAddress.toString(), diskdescription.rawAddress.toString(), otherinfo.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupLogFileW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), checksum.toInt(), disktagfile.rawAddress.toString(), diskdescription.rawAddress.toString(), otherinfo.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: ConstPtr<CVoid>, errorline: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA(filename.rawAddress.toString(), infhandle.rawAddress.toString(), errorline.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: ConstPtr<CVoid>, errorline: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW(filename.rawAddress.toString(), infhandle.rawAddress.toString(), errorline.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenFileQueue(): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA(filename.rawAddress.toString(), infclass.rawAddress.toString(), infstyle.toInt(), errorline.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW(filename.rawAddress.toString(), infclass.rawAddress.toString(), infstyle.toInt(), errorline.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenLog(erase: Bool): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(erase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupOpenMasterInf(): MutPtr<CVoid> =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPrepareQueueForRestoreA(queuehandle: ConstPtr<CVoid>, backuppath: Pcstr, restoreflags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA(queuehandle.rawAddress.toString(), backuppath.rawAddress.toString(), restoreflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPrepareQueueForRestoreW(queuehandle: ConstPtr<CVoid>, backuppath: Pcwstr, restoreflags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW(queuehandle.rawAddress.toString(), backuppath.rawAddress.toString(), restoreflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), diskname.rawAddress.toString(), pathtosource.rawAddress.toString(), filesought.rawAddress.toString(), tagfile.rawAddress.toString(), diskpromptstyle.toInt(), pathbuffer.rawAddress.toString(), pathbuffersize.toInt(), pathrequiredsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), diskname.rawAddress.toString(), pathtosource.rawAddress.toString(), filesought.rawAddress.toString(), tagfile.rawAddress.toString(), diskpromptstyle.toInt(), pathbuffer.rawAddress.toString(), pathbuffersize.toInt(), pathrequiredsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPromptReboot(filequeue: ConstPtr<CVoid>, owner: Hwnd, scanonly: Bool): Int =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot(filequeue.rawAddress.toString(), owner.rawAddress.toString(), scanonly) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryDrivesInDiskSpaceListA(diskspace: ConstPtr<CVoid>, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA(diskspace.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryDrivesInDiskSpaceListW(diskspace: ConstPtr<CVoid>, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW(diskspace.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryFileLogA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), targetfilename.rawAddress.toString(), desiredinfo, dataout.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryFileLogW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), targetfilename.rawAddress.toString(), desiredinfo, dataout.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfFileInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA(infinformation.rawAddress.toString(), infindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfFileInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW(infinformation.rawAddress.toString(), infindex.toInt(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfOriginalFileInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, originalfileinfo: MutPtr<SpOriginalFileInfoA>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA(infinformation.rawAddress.toString(), infindex.toInt(), alternateplatforminfo.rawAddress.toString(), originalfileinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfOriginalFileInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, originalfileinfo: MutPtr<SpOriginalFileInfoW>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW(infinformation.rawAddress.toString(), infindex.toInt(), alternateplatforminfo.rawAddress.toString(), originalfileinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfVersionInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA(infinformation.rawAddress.toString(), infindex.toInt(), key.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueryInfVersionInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW(infinformation.rawAddress.toString(), infindex.toInt(), key.rawAddress.toString(), returnbuffer.rawAddress.toString(), returnbuffersize.toInt(), requiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySourceListA(flags: UInt, list: MutPtr<MutPtr<Pcstr>>, count: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA(flags.toInt(), list.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySourceListW(flags: UInt, list: MutPtr<MutPtr<Pcwstr>>, count: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW(flags.toInt(), list.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySpaceRequiredOnDriveA(diskspace: ConstPtr<CVoid>, drivespec: Pcstr, spacerequired: MutPtr<Long>, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA(diskspace.rawAddress.toString(), drivespec.rawAddress.toString(), spacerequired.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQuerySpaceRequiredOnDriveW(diskspace: ConstPtr<CVoid>, drivespec: Pcwstr, spacerequired: MutPtr<Long>, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW(diskspace.rawAddress.toString(), drivespec.rawAddress.toString(), spacerequired.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyA(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA(queuehandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), sourcepath.rawAddress.toString(), sourcefilename.rawAddress.toString(), sourcedescription.rawAddress.toString(), sourcetagfile.rawAddress.toString(), targetdirectory.rawAddress.toString(), targetfilename.rawAddress.toString(), copystyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyIndirectA(copyparams: ConstPtr<SpFileCopyParamsA>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA(copyparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyIndirectW(copyparams: ConstPtr<SpFileCopyParamsW>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW(copyparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopySectionA(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA(queuehandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString(), copystyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopySectionW(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW(queuehandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString(), copystyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueCopyW(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW(queuehandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), sourcepath.rawAddress.toString(), sourcefilename.rawAddress.toString(), sourcedescription.rawAddress.toString(), sourcetagfile.rawAddress.toString(), targetdirectory.rawAddress.toString(), targetfilename.rawAddress.toString(), copystyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDefaultCopyA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), copystyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDefaultCopyW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), sourcerootpath.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetfilename.rawAddress.toString(), copystyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteA(queuehandle: ConstPtr<CVoid>, pathpart1: Pcstr, pathpart2: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA(queuehandle.rawAddress.toString(), pathpart1.rawAddress.toString(), pathpart2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteSectionA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteSectionW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueDeleteW(queuehandle: ConstPtr<CVoid>, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW(queuehandle.rawAddress.toString(), pathpart1.rawAddress.toString(), pathpart2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameA(queuehandle: ConstPtr<CVoid>, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA(queuehandle.rawAddress.toString(), sourcepath.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetpath.rawAddress.toString(), targetfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameSectionA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameSectionW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW(queuehandle.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), section.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupQueueRenameW(queuehandle: ConstPtr<CVoid>, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW(queuehandle.rawAddress.toString(), sourcepath.rawAddress.toString(), sourcefilename.rawAddress.toString(), targetpath.rawAddress.toString(), targetfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFileLogEntryA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, targetfilename: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), targetfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFileLogEntryW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW(fileloghandle.rawAddress.toString(), logsectionname.rawAddress.toString(), targetfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA(diskspace.rawAddress.toString(), targetfilespec.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW(diskspace.rawAddress.toString(), targetfilespec.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA(flags.toInt(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW(flags.toInt(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), layoutinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveSectionFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRemoveSectionFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW(diskspace.rawAddress.toString(), infhandle.rawAddress.toString(), listinfhandle.rawAddress.toString(), sectionname.rawAddress.toString(), operation.toInt(), reserved1.rawAddress.toString(), reserved2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), sourcefile.rawAddress.toString(), targetfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW(hwndparent.rawAddress.toString(), dialogtitle.rawAddress.toString(), sourcefile.rawAddress.toString(), targetfile.rawAddress.toString(), win32errorcode.toInt(), style.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupScanFileQueueA(filequeue: ConstPtr<CVoid>, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: ConstPtr<CVoid>, result: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA(filequeue.rawAddress.toString(), flags.toInt(), window.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupScanFileQueueW(filequeue: ConstPtr<CVoid>, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: ConstPtr<CVoid>, result: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW(filequeue.rawAddress.toString(), flags.toInt(), window.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdA(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA(infhandle.rawAddress.toString(), id.toInt(), directory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdExA(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA(infhandle.rawAddress.toString(), id.toInt(), directory.rawAddress.toString(), flags.toInt(), reserved1.toInt(), reserved2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdExW(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW(infhandle.rawAddress.toString(), id.toInt(), directory.rawAddress.toString(), flags.toInt(), reserved1.toInt(), reserved2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetDirectoryIdW(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW(infhandle.rawAddress.toString(), id.toInt(), directory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueAlternatePlatformA(queuehandle: ConstPtr<CVoid>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, alternatedefaultcatalogfile: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA(queuehandle.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), alternatedefaultcatalogfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueAlternatePlatformW(queuehandle: ConstPtr<CVoid>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, alternatedefaultcatalogfile: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW(queuehandle.rawAddress.toString(), alternateplatforminfo.rawAddress.toString(), alternatedefaultcatalogfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetFileQueueFlags(filequeue: ConstPtr<CVoid>, flagmask: UInt, flags: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags(filequeue.rawAddress.toString(), flagmask.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(noninteractiveflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetPlatformPathOverrideA(override: Pcstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA(override.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW(override.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetSourceListA(flags: UInt, sourcelist: ConstPtr<Pcstr>, sourcecount: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA(flags.toInt(), sourcelist.rawAddress.toString(), sourcecount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetSourceListW(flags: UInt, sourcelist: ConstPtr<Pcwstr>, sourcecount: UInt): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW(flags.toInt(), sourcelist.rawAddress.toString(), sourcecount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupSetThreadLogToken(logtoken: ULong) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(logtoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupTermDefaultQueueCallback(context: ConstPtr<CVoid>) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupTerminateFileLog(fileloghandle: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog(fileloghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallNewlyCopiedInfs(filequeue: ConstPtr<CVoid>, flags: UInt, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs(filequeue.rawAddress.toString(), flags.toInt(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA(inffilename.rawAddress.toString(), flags.toInt(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW(inffilename.rawAddress.toString(), flags.toInt(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsignerinfo: MutPtr<SpInfSignerInfoV2A>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA(infname.rawAddress.toString(), altplatforminfo.rawAddress.toString(), infsignerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsignerinfo: MutPtr<SpInfSignerInfoV2W>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW(infname.rawAddress.toString(), altplatforminfo.rawAddress.toString(), infsignerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog(logtoken.toString(), category.toInt(), flags.toInt(), messagestr.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError(logtoken.toString(), category.toInt(), logflags.toInt(), error.toInt(), messagestr.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: ConstPtr<CVoid>, context: ConstPtr<Infcontext>) {
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine(logtoken.toString(), flags.toInt(), infhandle.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA(hwndparent.rawAddress.toString(), hardwareid.rawAddress.toString(), fullinfpath.rawAddress.toString(), installflags.toInt(), brebootrequired.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr<Bool>): Bool =
    if (windowsWin32DevicesDeviceanddriverinstallationNapiAvailable) wasmWindowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW(hwndparent.rawAddress.toString(), hardwareid.rawAddress.toString(), fullinfpath.rawAddress.toString(), installflags.toInt(), brebootrequired.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
