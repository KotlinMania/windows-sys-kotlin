@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesAlljoynNapiAddon(): Boolean

private val _windowsWin32DevicesAlljoynNapiAvailable: Boolean = _initWindowsWin32DevicesAlljoynNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_allJoynCreateBus(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_allJoynCreateBus(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_allJoynEventSelect(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_allJoynEventSelect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_allJoynSendToBus(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_allJoynSendToBus(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_qccStatusText(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_qccStatusText(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged(p0: String, p1: String, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged(p0: String, p1: String, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynGetversion()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynGetversion(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInit()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInit(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptiontranslationcallback(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptiontranslationcallback(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageEql(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageEql(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate(): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble(p0: String, p1: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverGet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverGet(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynRouterinit()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynRouterinit(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynShutdown()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynShutdown(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess()")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly(p0)")
private external fun _wasm_windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly(p0: Int)

public actual fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection((serverbushandle?.value ?: 0L).toString(), (abortevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynCloseBusHandle(bushandle: Handle): Bool =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle((bushandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynConnectToBus(connectionspec: Pcwstr): Handle =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus((connectionspec?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_allJoynCreateBus(outbuffersize.toInt(), inbuffersize.toInt(), (lpsecurityattributes?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: COpaquePointer?): Bool =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents((connectedbushandle?.value ?: 0L).toString(), (eventtoreset?.value ?: 0L).toString(), (eventtypes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_allJoynEventSelect((connectedbushandle?.value ?: 0L).toString(), (eventhandle?.value ?: 0L).toString(), eventtypes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: COpaquePointer?, bytestoread: UInt, bytestransferred: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus((connectedbushandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bytestoread.toInt(), (bytestransferred?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynSendToBus(connectedbushandle: Handle, buffer: COpaquePointer?, bytestowrite: UInt, bytestransferred: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_allJoynSendToBus((connectedbushandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bytestowrite.toInt(), (bytestransferred?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qccStatusText(status: QStatus): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_qccStatusText(status).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate((defaultlanguage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull(arg.toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg(data.toString(), arg.toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml(data.toString(), (aboutdataxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataDestroy(data: AlljoynAboutdata) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy(data.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata(data.toString(), msgarg.toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion(data.toString(), (ajsoftwareversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata(data.toString(), msgarg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: COpaquePointer?, num: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid(data.toString(), (appid?.value ?: 0L).toString(), (num?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: COpaquePointer?, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname(data.toString(), (appname?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture(data.toString(), (dateofmanufacture?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage(data.toString(), (defaultlanguage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: COpaquePointer?, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription(data.toString(), (description?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid(data.toString(), (deviceid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: COpaquePointer?, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename(data.toString(), (devicename?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: COpaquePointer?, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield(data.toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: COpaquePointer?, numFields: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields(data.toString(), (fields?.value ?: 0L).toString(), numFields.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature(data.toString(), (fieldname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion(data.toString(), (hardwareversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: COpaquePointer?, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer(data.toString(), (manufacturer?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber(data.toString(), (modelnumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion(data.toString(), (softwareversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: COpaquePointer?, num: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages(data.toString(), (languagetags?.value ?: 0L).toString(), num.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl(data.toString(), (supporturl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced(data.toString(), (fieldname?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized(data.toString(), (fieldname?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired(data.toString(), (fieldname?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid(data.toString(), (language?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: COpaquePointer?, num: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid(data.toString(), (appid?.value ?: 0L).toString(), num.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring(data.toString(), (appid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname(data.toString(), (appname?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture(data.toString(), (dateofmanufacture?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage(data.toString(), (defaultlanguage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription(data.toString(), (description?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid(data.toString(), (deviceid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename(data.toString(), (devicename?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield(data.toString(), (name?.value ?: 0L).toString(), value.toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion(data.toString(), (hardwareversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer(data.toString(), (manufacturer?.value ?: 0L).toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber(data.toString(), (modelnumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion(data.toString(), (softwareversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage(data.toString(), (language?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl(data.toString(), (supporturl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdatalistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAboutdatalistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonClear(icon: AlljoynAbouticon) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonCreate(): AlljoynAbouticon =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonDestroy(icon: AlljoynAbouticon) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: COpaquePointer?, size: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent(icon.toString(), (data?.value ?: 0L).toString(), (size?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: COpaquePointer?, url: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl(icon.toString(), (type?.value ?: 0L).toString(), (url?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: COpaquePointer?, csize: ULong, ownsdata: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent(icon.toString(), (type?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), csize.toString(), ownsdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg(icon.toString(), arg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl(icon.toString(), (type?.value ?: 0L).toString(), (url?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate(bus.toString(), icon.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate(bus.toString(), (busname?.value ?: 0L).toString(), sessionid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon(proxy.toString(), icon.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion(proxy.toString(), (version?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutlistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynAboutlistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate((callback?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce(obj.toString(), sessionport.toInt(), aboutdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener(obj.toString(), sessionport.toInt(), aboutlistener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate(bus.toString(), isannounced) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjDestroy(obj: AlljoynAboutobj) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy(obj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce(obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear(description.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull(arg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg(description.toString(), arg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy(description.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: COpaquePointer?, numpaths: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths(description.toString(), (interfacename?.value ?: 0L).toString(), (paths?.value ?: 0L).toString(), numpaths.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: COpaquePointer?, numinterfaces: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces(description.toString(), (path?.value ?: 0L).toString(), (interfaces?.value ?: 0L).toString(), numinterfaces.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg(description.toString(), msgarg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: COpaquePointer?, numpaths: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths(description.toString(), (paths?.value ?: 0L).toString(), numpaths.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface(description.toString(), (interfacename?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath(description.toString(), (path?.value ?: 0L).toString(), (interfacename?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath(description.toString(), (path?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate(bus.toString(), (busname?.value ?: 0L).toString(), sessionid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata(proxy.toString(), (language?.value ?: 0L).toString(), data.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription(proxy.toString(), objectdesc.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion(proxy.toString(), (version?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynApplicationstatelistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynApplicationstatelistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAuthlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAuthlistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: COpaquePointer?, accept: Int, credentials: AlljoynCredentials): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse(listener.toString(), (authcontext?.value ?: 0L).toString(), accept, credentials.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: COpaquePointer?, sharedsecretsize: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret(listener.toString(), (sharedsecret?.value ?: 0L).toString(), sharedsecretsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: COpaquePointer?, accept: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse(listener.toString(), (authcontext?.value ?: 0L).toString(), accept) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerasyncCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAuthlistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination(autopinger.toString(), (group?.value ?: 0L).toString(), (destination?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup(autopinger.toString(), (group?.value ?: 0L).toString(), listener.toString(), pinginterval.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerPause(autopinger: AlljoynAutopinger) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination(autopinger.toString(), (group?.value ?: 0L).toString(), (destination?.value ?: 0L).toString(), removeall) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup(autopinger.toString(), (group?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerResume(autopinger: AlljoynAutopinger) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval(autopinger.toString(), (group?.value ?: 0L).toString(), pinginterval.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry(bus.toString(), (authmechanism?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), (password?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch(bus.toString(), (rule?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename(bus.toString(), (name?.value ?: 0L).toString(), transports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: COpaquePointer?, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport(bus.toString(), (sessionport?.value ?: 0L).toString(), opts.toString(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename(bus.toString(), (name?.value ?: 0L).toString(), transports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname(bus.toString(), (nameprefix?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport(bus.toString(), (nameprefix?.value ?: 0L).toString(), transports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface(bus.toString(), (implementsinterface?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: COpaquePointer?, numberinterfaces: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces(bus.toString(), (implementsinterfaces?.value ?: 0L).toString(), numberinterfaces.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys(bus.toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect(bus.toString(), (connectspec?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate((applicationname?.value ?: 0L).toString(), allowremotemessages).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency((applicationname?.value ?: 0L).toString(), allowremotemessages, concurrency.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface(bus.toString(), (name?.value ?: 0L).toString(), (iface?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: COpaquePointer?, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure(bus.toString(), (name?.value ?: 0L).toString(), (iface?.value ?: 0L).toString(), secpolicy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml(bus.toString(), (xml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore((applicationname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface(bus.toString(), iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect(bus.toString(), (unused?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity(bus.toString(), (authmechanisms?.value ?: 0L).toString(), listener.toString(), (keystorefilename?.value ?: 0L).toString(), isshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus.toString(), (authmechanisms?.value ?: 0L).toString(), authlistener.toString(), (keystorefilename?.value ?: 0L).toString(), isshared, permissionconfigurationlistener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname(bus.toString(), (nameprefix?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport(bus.toString(), (nameprefix?.value ?: 0L).toString(), transports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency(bus.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec(bus.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring(bus.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface(bus.toString(), (name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: COpaquePointer?, numifaces: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces(bus.toString(), (ifaces?.value ?: 0L).toString(), numifaces.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration(bus.toString(), (guid?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid(bus.toString(), (name?.value ?: 0L).toString(), (guid?.value ?: 0L).toString(), (guidsz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGettimestamp(): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename(bus.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: COpaquePointer?, opts: AlljoynSessionopts): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession(bus.toString(), (sessionhost?.value ?: 0L).toString(), sessionport.toInt(), listener.toString(), (sessionid?.value ?: 0L).toString(), opts.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync(bus.toString(), (sessionhost?.value ?: 0L).toString(), sessionport.toInt(), listener.toString(), opts.toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession(bus.toString(), sessionid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner(bus.toString(), (name?.value ?: 0L).toString(), (hasowner?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing(bus.toString(), (name?.value ?: 0L).toString(), timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener(bus.toString(), aboutlistener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener(bus.toString(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener(bus.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject(bus.toString(), obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure(bus.toString(), obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener(bus.toString(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename(bus.toString(), (name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch(bus.toString(), (rule?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember(bus.toString(), sessionid.toInt(), (membername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname(bus.toString(), (requestedname?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection(bus.toString(), (name?.value ?: 0L).toString(), forceauth) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync(bus.toString(), (name?.value ?: 0L).toString(), forceauth) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug(bus.toString(), (module?.value ?: 0L).toString(), level.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration(bus.toString(), (guid?.value ?: 0L).toString(), timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout(bus.toString(), sessionid.toInt(), (linktimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync(bus.toString(), sessionid.toInt(), linktimeout.toInt(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener(bus.toString(), sessionid.toInt(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport(bus.toString(), sessionport.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener(bus.toString(), aboutlistener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener(bus.toString(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener(bus.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject(bus.toString(), obj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface(bus.toString(), (implementsinterface?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: COpaquePointer?, numberinterfaces: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces(bus.toString(), (implementsinterfaces?.value ?: 0L).toString(), numberinterfaces.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBuslistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynBuslistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface(bus.toString(), iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced(bus.toString(), iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: COpaquePointer?, numentries: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers(bus.toString(), (entries?.value ?: 0L).toString(), numentries.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage(bus.toString(), msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial(bus.toString(), serialnumber.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: COpaquePointer?, contextIn: COpaquePointer?): AlljoynBusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate((path?.value ?: 0L).toString(), isplaceholder, (callbacksIn?.value ?: 0L).toString(), (contextIn?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectDestroy(bus: AlljoynBusobject) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: COpaquePointer?, numprops: ULong, id: UInt) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged(bus.toString(), (ifcname?.value ?: 0L).toString(), (propnames?.value ?: 0L).toString(), numprops.toString(), id.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged(bus.toString(), (ifcname?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), value.toString(), id.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: COpaquePointer?, numinterfaces: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames(bus.toString(), (interfaces?.value ?: 0L).toString(), numinterfaces.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname(bus.toString(), (buffer?.value ?: 0L).toString(), buffersz.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath(bus.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs(bus.toString(), msg.toString(), args.toString(), numargs.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr(bus.toString(), msg.toString(), (error?.value ?: 0L).toString(), (errormessage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus(bus.toString(), msg.toString(), status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag(bus.toString(), iface.toString(), isannounced) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsClear(cred: AlljoynCredentials) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear(cred.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsCreate(): AlljoynCredentials =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsDestroy(cred: AlljoynCredentials) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy(cred.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain(cred.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration(cred.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry(cred.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword(cred.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey(cred.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername(cred.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset(cred.toString(), creds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain(cred.toString(), (certchain?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration(cred.toString(), expiration.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry(cred.toString(), (logonentry?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword(cred.toString(), (pwd?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey(cred.toString(), (pk?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername(cred.toString(), (username?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynGetbuildinfo(): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynGetnumericversion(): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynGetversion(): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynGetversion().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInit(): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate(iface.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation(iface.toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation(iface.toString(), (member?.value ?: 0L).toString(), (argname?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember(iface.toString(), type, (name?.value ?: 0L).toString(), (inputsig?.value ?: 0L).toString(), (outsig?.value ?: 0L).toString(), (argnames?.value ?: 0L).toString(), annotation.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation(iface.toString(), (member?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod(iface.toString(), (name?.value ?: 0L).toString(), (inputsig?.value ?: 0L).toString(), (outsig?.value ?: 0L).toString(), (argnames?.value ?: 0L).toString(), annotation.toInt(), (accessperms?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty(iface.toString(), (name?.value ?: 0L).toString(), (signature?.value ?: 0L).toString(), access.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation(iface.toString(), (property?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal(iface.toString(), (name?.value ?: 0L).toString(), (sig?.value ?: 0L).toString(), (argnames?.value ?: 0L).toString(), annotation.toInt(), (accessperms?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql(one.toString(), other.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation(iface.toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (valueSize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex(iface.toString(), index.toString(), (name?.value ?: 0L).toString(), (nameSize?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (valueSize?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount(iface.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage(iface.toString(), (member?.value ?: 0L).toString(), (arg?.value ?: 0L).toString(), (description?.value ?: 0L).toString(), maxlanguagelength.toString(), (languagetag?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage(iface.toString(), (description?.value ?: 0L).toString(), maxlanguagelength.toString(), (languagetag?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: COpaquePointer?, size: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages(iface.toString(), (languages?.value ?: 0L).toString(), size.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2(iface.toString(), (languages?.value ?: 0L).toString(), languagessize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember(iface.toString(), (name?.value ?: 0L).toString(), (member?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation(iface.toString(), (member?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (valueSize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation(iface.toString(), (member?.value ?: 0L).toString(), (argname?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (valueSize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface.toString(), (member?.value ?: 0L).toString(), (description?.value ?: 0L).toString(), maxlanguagelength.toString(), (languagetag?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: COpaquePointer?, nummembers: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers(iface.toString(), (members?.value ?: 0L).toString(), nummembers.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod(iface.toString(), (name?.value ?: 0L).toString(), (member?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname(iface.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: COpaquePointer?, numprops: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties(iface.toString(), (props?.value ?: 0L).toString(), numprops.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty(iface.toString(), (name?.value ?: 0L).toString(), (property?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation(iface.toString(), (property?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (strSize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface.toString(), (property?.value ?: 0L).toString(), (description?.value ?: 0L).toString(), maxlanguagelength.toString(), (languagetag?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy(iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal(iface.toString(), (name?.value ?: 0L).toString(), (member?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription(iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember(iface.toString(), (name?.value ?: 0L).toString(), (insig?.value ?: 0L).toString(), (outsig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties(iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty(iface.toString(), (name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect(iface.toString(), (str?.value ?: 0L).toString(), buf.toString(), indent.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure(iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberEql(one: AlljoynInterfacedescriptionMember, other: AlljoynInterfacedescriptionMember): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotation(member: AlljoynInterfacedescriptionMember, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotationatindex(member: AlljoynInterfacedescriptionMember, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotationscount(member: AlljoynInterfacedescriptionMember): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotation(member: AlljoynInterfacedescriptionMember, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotationatindex(member: AlljoynInterfacedescriptionMember, argname: Pcstr, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotationscount(member: AlljoynInterfacedescriptionMember, argname: Pcstr): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyEql(one: AlljoynInterfacedescriptionProperty, other: AlljoynInterfacedescriptionProperty): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotation(property: AlljoynInterfacedescriptionProperty, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotationatindex(property: AlljoynInterfacedescriptionProperty, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotationscount(property: AlljoynInterfacedescriptionProperty): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetargdescription(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, description: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription(iface.toString(), (member?.value ?: 0L).toString(), (argname?.value ?: 0L).toString(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage(iface.toString(), (member?.value ?: 0L).toString(), (arg?.value ?: 0L).toString(), (description?.value ?: 0L).toString(), (languagetag?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription(iface.toString(), (description?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage(iface.toString(), (description?.value ?: 0L).toString(), (languagetag?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage(iface.toString(), (language?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription(iface.toString(), (member?.value ?: 0L).toString(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface.toString(), (member?.value ?: 0L).toString(), (description?.value ?: 0L).toString(), (languagetag?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription(iface.toString(), (name?.value ?: 0L).toString(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface.toString(), (name?.value ?: 0L).toString(), (description?.value ?: 0L).toString(), (languagetag?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynKeystorelistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys(listener.toString(), keystore.toString(), (sink?.value ?: 0L).toString(), (sinkSz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys(listener.toString(), keystore.toString(), (source?.value ?: 0L).toString(), (password?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynKeystorelistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription(msg.toString(), (str?.value ?: 0L).toString(), buf.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageDestroy(msg: AlljoynMessage) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy(msg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageEql(one.toString(), other.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg(msg.toString(), argn.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: COpaquePointer?, args: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs(msg.toString(), (numargs?.value ?: 0L).toString(), (args?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism(msg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination(msg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: COpaquePointer?): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname(msg.toString(), (errormessage?.value ?: 0L).toString(), (errormessageSize?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetflags(msg: AlljoynMessage): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags(msg.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface(msg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername(msg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath(msg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname(msg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender(msg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature(msg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: COpaquePointer?): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired(msg.toString(), (tillexpirems?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIssessionless(msg: AlljoynMessage): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs(msg.toString(), (signature?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageSetendianess(endian: Byte) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess(endian.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring(msg.toString(), (str?.value ?: 0L).toString(), buf.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate(size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement(arg.toString(), index.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet(args.toString(), numargs.toString(), (signature?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: COpaquePointer?, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet(args.toString(), (numargs?.value ?: 0L).toString(), (signature?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: COpaquePointer?, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset(args.toString(), argoffset.toString(), (numargs?.value ?: 0L).toString(), (signature?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature(values.toString(), numvalues.toString(), (str?.value ?: 0L).toString(), buf.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring(args.toString(), numargs.toString(), (str?.value ?: 0L).toString(), buf.toString(), indent.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargClear(arg: AlljoynMsgarg) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone(destination.toString(), source.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy(source.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargCreate(): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet((signature?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargDestroy(arg: AlljoynMsgarg) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual(lhv.toString(), rhv.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet(arg.toString(), (signature?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement(arg.toString(), index.toString(), (element?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature(arg.toString(), index.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements(arg.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool(arg.toString(), (b?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: COpaquePointer?, ab: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray(arg.toString(), (length?.value ?: 0L).toString(), (ab?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble(arg.toString(), (d?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: COpaquePointer?, ad: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray(arg.toString(), (length?.value ?: 0L).toString(), (ad?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16(arg.toString(), (n?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: COpaquePointer?, an: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array(arg.toString(), (length?.value ?: 0L).toString(), (an?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32(arg.toString(), (i?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: COpaquePointer?, ai: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array(arg.toString(), (length?.value ?: 0L).toString(), (ai?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64(arg.toString(), (x?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: COpaquePointer?, ax: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array(arg.toString(), (length?.value ?: 0L).toString(), (ax?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath(arg.toString(), (o?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature(arg.toString(), (g?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString(arg.toString(), (s?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16(arg.toString(), (q?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: COpaquePointer?, aq: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array(arg.toString(), (length?.value ?: 0L).toString(), (aq?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32(arg.toString(), (u?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: COpaquePointer?, au: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array(arg.toString(), (length?.value ?: 0L).toString(), (au?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64(arg.toString(), (t?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: COpaquePointer?, at: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array(arg.toString(), (length?.value ?: 0L).toString(), (at?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8(arg.toString(), (y?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: COpaquePointer?, ay: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array(arg.toString(), (length?.value ?: 0L).toString(), (ay?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant(arg.toString(), v.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: COpaquePointer?, av: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray(arg.toString(), (signature?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), (av?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement(arg.toString(), (elemsig?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey(arg.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember(arg.toString(), index.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers(arg.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype(arg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue(arg.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature(arg.toString(), (signature?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet(arg.toString(), (signature?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize(arg.toString(), (signature?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool(arg.toString(), b) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray(arg.toString(), length.toString(), (ab?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble(arg.toString(), d) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray(arg.toString(), length.toString(), (ad?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16(arg.toString(), n.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array(arg.toString(), length.toString(), (an?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32(arg.toString(), i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array(arg.toString(), length.toString(), (ai?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64(arg.toString(), x.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array(arg.toString(), length.toString(), (ax?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath(arg.toString(), (o?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray(arg.toString(), length.toString(), (ao?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature(arg.toString(), (g?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray(arg.toString(), length.toString(), (ag?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString(arg.toString(), (s?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray(arg.toString(), length.toString(), (asTarget?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16(arg.toString(), q.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array(arg.toString(), length.toString(), (aq?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32(arg.toString(), u.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array(arg.toString(), length.toString(), (au?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64(arg.toString(), t.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array(arg.toString(), length.toString(), (at?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8(arg.toString(), y.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array(arg.toString(), length.toString(), (ay?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry(arg.toString(), key.toString(), value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct(arg.toString(), structMembers.toString(), numMembers.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature(arg.toString(), (str?.value ?: 0L).toString(), buf.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargStabilize(arg: AlljoynMsgarg) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring(arg.toString(), (str?.value ?: 0L).toString(), buf.toString(), indent.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: COpaquePointer?, nummandatoryinterfaces: ULong): AlljoynObserver =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate(bus.toString(), (mandatoryinterfaces?.value ?: 0L).toString(), nummandatoryinterfaces.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverDestroy(observer: AlljoynObserver) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy(observer.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverGet(observer.toString(), (uniquebusname?.value ?: 0L).toString(), (objectpath?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst(observer.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext(observer.toString(), proxyref.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener(observer.toString(), listener.toString(), triggeronexisting)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners(observer.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener(observer.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverlistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynObserverlistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate((callback?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials((authmechanism?.value ?: 0L).toString(), (password?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfigurationlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynPermissionconfigurationlistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy((certificatechain?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup((certificateid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup((certificateidarray?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim(configurator.toString(), (cakey?.value ?: 0L).toString(), (identitycertificatechain?.value ?: 0L).toString(), (groupid?.value ?: 0L).toString(), groupsize.toString(), (groupauthority?.value ?: 0L).toString(), (manifestsxmls?.value ?: 0L).toString(), manifestscount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement(configurator.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate(configurator.toString(), (state?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities(configurator.toString(), (claimcapabilities?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator.toString(), (additionalinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy(configurator.toString(), (policyxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity(configurator.toString(), (identitycertificatechain?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid(configurator.toString(), (certificateid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests(configurator.toString(), (manifestarray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate(configurator.toString(), (manifesttemplatexml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries(configurator.toString(), (certificateids?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy(configurator.toString(), (policyxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey(configurator.toString(), (publickey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: COpaquePointer?, manifestscount: ULong, append: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests(configurator.toString(), (manifestsxmls?.value ?: 0L).toString(), manifestscount.toString(), append) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership(configurator.toString(), (membershipcertificatechain?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup((manifestarray?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy((manifesttemplatexml?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy((policyxml?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy((publickey?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: COpaquePointer?, seriallen: ULong, issuerpublickey: COpaquePointer?, issueraki: COpaquePointer?, issuerakilen: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership(configurator.toString(), (serial?.value ?: 0L).toString(), seriallen.toString(), (issuerpublickey?.value ?: 0L).toString(), (issueraki?.value ?: 0L).toString(), issuerakilen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset(configurator.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy(configurator.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate(configurator.toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities(configurator.toString(), claimcapabilities.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator.toString(), additionalinfo.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator.toString(), (manifesttemplatexml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement(configurator.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity(configurator.toString(), (identitycertificatechain?.value ?: 0L).toString(), (manifestsxmls?.value ?: 0L).toString(), manifestscount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy(configurator.toString(), (policyxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPinglistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynPinglistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate((callback?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild(proxyobj.toString(), child.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface(proxyobj.toString(), iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName(proxyobj.toString(), (name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy(source.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate(bus.toString(), (service?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), sessionid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure(bus.toString(), (service?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), sessionid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy(proxyobj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching(proxyobj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties(proxyobj.toString(), (iface?.value ?: 0L).toString(), values.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync(proxyobj.toString(), (iface?.value ?: 0L).toString(), 0L.toString(), timeout.toInt(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild(proxyobj.toString(), (path?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: COpaquePointer?, numchildren: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren(proxyobj.toString(), (children?.value ?: 0L).toString(), numchildren.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface(proxyobj.toString(), (iface?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: COpaquePointer?, numifaces: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces(proxyobj.toString(), (ifaces?.value ?: 0L).toString(), numifaces.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath(proxyobj.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty(proxyobj.toString(), (iface?.value ?: 0L).toString(), (property?.value ?: 0L).toString(), value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync(proxyobj.toString(), (iface?.value ?: 0L).toString(), (property?.value ?: 0L).toString(), 0L.toString(), timeout.toInt(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename(proxyobj.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid(proxyobj.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename(proxyobj.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface(proxyobj.toString(), (iface?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject(proxyobj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj.toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure(proxyobj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid(proxyobj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall(proxyobj.toString(), (ifacename?.value ?: 0L).toString(), (methodname?.value ?: 0L).toString(), args.toString(), numargs.toString(), replymsg.toString(), timeout.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply(proxyobj.toString(), (ifacename?.value ?: 0L).toString(), (methodname?.value ?: 0L).toString(), args.toString(), numargs.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: COpaquePointer?, timeout: UInt, flags: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync(proxyobj.toString(), (ifacename?.value ?: 0L).toString(), (methodname?.value ?: 0L).toString(), 0L.toString(), args.toString(), numargs.toString(), (context?.value ?: 0L).toString(), timeout.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: COpaquePointer?, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml(proxyobj.toString(), (xml?.value ?: 0L).toString(), (identifier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate(proxy.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref(ref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet(ref.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref(ref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: COpaquePointer?, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj.toString(), (iface?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), numproperties.toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild(proxyobj.toString(), (path?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection(proxyobj.toString(), forceauth) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync(proxyobj.toString(), forceauth) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty(proxyobj.toString(), (iface?.value ?: 0L).toString(), (property?.value ?: 0L).toString(), value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync(proxyobj.toString(), (iface?.value ?: 0L).toString(), (property?.value ?: 0L).toString(), value.toString(), 0L.toString(), timeout.toInt(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj.toString(), (iface?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRouterinit(): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynRouterinit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRouterinitwithconfig(configxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig((configxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRoutershutdown(): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim(proxy.toString(), (cakey?.value ?: 0L).toString(), (identitycertificatechain?.value ?: 0L).toString(), (groupid?.value ?: 0L).toString(), groupsize.toString(), (groupauthority?.value ?: 0L).toString(), (manifestsxmls?.value ?: 0L).toString(), manifestscount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, digest: COpaquePointer?, digestsize: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest((unsignedmanifestxml?.value ?: 0L).toString(), (identitycertificatepem?.value ?: 0L).toString(), (digest?.value ?: 0L).toString(), (digestsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: COpaquePointer?, sessionid: UInt): AlljoynSecurityapplicationproxy =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate(bus.toString(), (appbusname?.value ?: 0L).toString(), sessionid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyDigestDestroy(digest: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy((digest?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy((eccpublickey?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement(proxy.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate(proxy.toString(), (applicationstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities(proxy.toString(), (capabilities?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy.toString(), (additionalinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy(proxy.toString(), (policyxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey(proxy.toString(), (eccpublickey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate(proxy.toString(), (manifesttemplatexml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy(proxy.toString(), (policyxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership(proxy.toString(), (membershipcertificatechain?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy((signedmanifestxml?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy((manifesttemplatexml?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: COpaquePointer?) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy((policyxml?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset(proxy.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy(proxy.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signature: COpaquePointer?, signaturesize: ULong, signedmanifestxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature((unsignedmanifestxml?.value ?: 0L).toString(), (identitycertificatepem?.value ?: 0L).toString(), (signature?.value ?: 0L).toString(), signaturesize.toString(), (signedmanifestxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signingprivatekeypem: COpaquePointer?, signedmanifestxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest((unsignedmanifestxml?.value ?: 0L).toString(), (identitycertificatepem?.value ?: 0L).toString(), (signingprivatekeypem?.value ?: 0L).toString(), (signedmanifestxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement(proxy.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity(proxy.toString(), (identitycertificatechain?.value ?: 0L).toString(), (manifestsxmls?.value ?: 0L).toString(), manifestscount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy(proxy.toString(), (policyxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionlistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp(one.toString(), other.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate(traffic.toInt(), ismultipoint, proximity.toInt(), transports.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy(opts.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint(opts.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity(opts.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic(opts.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports(opts.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible(one.toString(), other.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint(opts.toString(), ismultipoint)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity(opts.toString(), proximity.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic(opts.toString(), traffic.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports(opts.toString(), transports.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionportlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionportlistener =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate((callbacks?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynShutdown(): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynUnityDeferredCallbacksProcess(): Int =
    if (_windowsWin32DevicesAlljoynNapiAvailable) _wasm_windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int) {
    if (_windowsWin32DevicesAlljoynNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
