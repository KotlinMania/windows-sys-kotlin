@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesAlljoynNapiAddon(): Boolean

private val windowsWin32DevicesAlljoynNapiAvailable: Boolean = initWindowsWin32DevicesAlljoynNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAllJoynCreateBus(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAllJoynEventSelect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAllJoynSendToBus(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynQccStatusText(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynQccStatusText(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged(p0: String, p1: String, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged(p0: String, p1: String, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynGetversion()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynGetversion(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInit()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInit(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate(): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(p0: String, p1: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGet(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynRouterinit(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynShutdown()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynShutdown(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess()")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(p0)")
private external fun wasmWindowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(p0: Int)

public actual fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection(serverbushandle.rawAddress.toString(), abortevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynCloseBusHandle(bushandle: Handle): Bool =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle(bushandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynConnectToBus(connectionspec: Pcwstr): Handle =
    if (windowsWin32DevicesAlljoynNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus(connectionspec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    if (windowsWin32DevicesAlljoynNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesAlljoynAllJoynCreateBus(outbuffersize.toInt(), inbuffersize.toInt(), lpsecurityattributes.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents(connectedbushandle.rawAddress.toString(), eventtoreset.rawAddress.toString(), eventtypes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAllJoynEventSelect(connectedbushandle.rawAddress.toString(), eventhandle.rawAddress.toString(), eventtypes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: MutPtr<CVoid>, bytestoread: UInt, bytestransferred: MutPtr<UInt>, reserved: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus(connectedbushandle.rawAddress.toString(), buffer.rawAddress.toString(), bytestoread.toInt(), bytestransferred.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynSendToBus(connectedbushandle: Handle, buffer: ConstPtr<CVoid>, bytestowrite: UInt, bytestransferred: MutPtr<UInt>, reserved: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAllJoynSendToBus(connectedbushandle.rawAddress.toString(), buffer.rawAddress.toString(), bytestowrite.toInt(), bytestransferred.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qccStatusText(status: QStatus): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynQccStatusText(status).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate(defaultlanguage.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull(arg.toString(), language.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg(data.toString(), arg.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml(data.toString(), aboutdataxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataDestroy(data: AlljoynAboutdata) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(data.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata(data.toString(), msgarg.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion(data.toString(), ajsoftwareversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(data.toString(), msgarg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: MutPtr<MutPtr<UByte>>, num: MutPtr<ULong>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid(data.toString(), appid.rawAddress.toString(), num.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname(data.toString(), appname.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture(data.toString(), dateofmanufacture.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage(data.toString(), defaultlanguage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription(data.toString(), description.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid(data.toString(), deviceid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename(data.toString(), devicename.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: MutPtr<AlljoynMsgarg>, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield(data.toString(), name.rawAddress.toString(), value.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: ConstPtr<ConstPtr<Byte>>, numFields: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields(data.toString(), fields.rawAddress.toString(), numFields.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature(data.toString(), fieldname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion(data.toString(), hardwareversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer(data.toString(), manufacturer.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber(data.toString(), modelnumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion(data.toString(), softwareversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: ConstPtr<ConstPtr<Byte>>, num: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages(data.toString(), languagetags.rawAddress.toString(), num.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl(data.toString(), supporturl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced(data.toString(), fieldname.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized(data.toString(), fieldname.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired(data.toString(), fieldname.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid(data.toString(), language.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: ConstPtr<UByte>, num: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid(data.toString(), appid.rawAddress.toString(), num.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring(data.toString(), appid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname(data.toString(), appname.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture(data.toString(), dateofmanufacture.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage(data.toString(), defaultlanguage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription(data.toString(), description.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid(data.toString(), deviceid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename(data.toString(), devicename.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield(data.toString(), name.rawAddress.toString(), value.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion(data.toString(), hardwareversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer(data.toString(), manufacturer.rawAddress.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber(data.toString(), modelnumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion(data.toString(), softwareversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage(data.toString(), language.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl(data.toString(), supporturl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdatalistenerCreate(callbacks: ConstPtr<AlljoynAboutdatalistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynAboutdatalistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonClear(icon: AlljoynAbouticon) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonCreate(): AlljoynAbouticon =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonDestroy(icon: AlljoynAbouticon) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: ConstPtr<ConstPtr<UByte>>, size: MutPtr<ULong>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent(icon.toString(), data.rawAddress.toString(), size.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: ConstPtr<ConstPtr<Byte>>, url: ConstPtr<ConstPtr<Byte>>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl(icon.toString(), type.rawAddress.toString(), url.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: MutPtr<UByte>, csize: ULong, ownsdata: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent(icon.toString(), type.rawAddress.toString(), data.rawAddress.toString(), csize.toString(), ownsdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(icon.toString(), arg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl(icon.toString(), type.rawAddress.toString(), url.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(bus.toString(), icon.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate(bus.toString(), busname.rawAddress.toString(), sessionid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(proxy.toString(), icon.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion(proxy.toString(), version.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutlistenerCreate(callback: ConstPtr<AlljoynAboutlistenerCallback>, context: ConstPtr<CVoid>): AlljoynAboutlistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate(callback.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(obj.toString(), sessionport.toInt(), aboutdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(obj.toString(), sessionport.toInt(), aboutlistener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(bus.toString(), isannounced).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjDestroy(obj: AlljoynAboutobj) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(obj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(description.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(arg.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(description.toString(), arg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(description.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: ConstPtr<ConstPtr<Byte>>, numpaths: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths(description.toString(), interfacename.rawAddress.toString(), paths.rawAddress.toString(), numpaths.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: ConstPtr<ConstPtr<Byte>>, numinterfaces: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces(description.toString(), path.rawAddress.toString(), interfaces.rawAddress.toString(), numinterfaces.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(description.toString(), msgarg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: ConstPtr<ConstPtr<Byte>>, numpaths: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths(description.toString(), paths.rawAddress.toString(), numpaths.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface(description.toString(), interfacename.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath(description.toString(), path.rawAddress.toString(), interfacename.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath(description.toString(), path.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate(bus.toString(), busname.rawAddress.toString(), sessionid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata(proxy.toString(), language.rawAddress.toString(), data.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(proxy.toString(), objectdesc.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion(proxy.toString(), version.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynApplicationstatelistenerCreate(callbacks: ConstPtr<AlljoynApplicationstatelistenerCallbacks>, context: MutPtr<CVoid>): AlljoynApplicationstatelistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAuthlistenerCreate(callbacks: ConstPtr<AlljoynAuthlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynAuthlistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr<CVoid>, accept: Int, credentials: AlljoynCredentials): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse(listener.toString(), authcontext.rawAddress.toString(), accept, credentials.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: ConstPtr<UByte>, sharedsecretsize: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret(listener.toString(), sharedsecret.rawAddress.toString(), sharedsecretsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr<CVoid>, accept: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse(listener.toString(), authcontext.rawAddress.toString(), accept) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerasyncCreate(callbacks: ConstPtr<AlljoynAuthlistenerasyncCallbacks>, context: ConstPtr<CVoid>): AlljoynAuthlistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination(autopinger.toString(), group.rawAddress.toString(), destination.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup(autopinger.toString(), group.rawAddress.toString(), listener.toString(), pinginterval.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerPause(autopinger: AlljoynAutopinger) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination(autopinger.toString(), group.rawAddress.toString(), destination.rawAddress.toString(), removeall) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup(autopinger.toString(), group.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerResume(autopinger: AlljoynAutopinger) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval(autopinger.toString(), group.rawAddress.toString(), pinginterval.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry(bus.toString(), authmechanism.rawAddress.toString(), username.rawAddress.toString(), password.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch(bus.toString(), rule.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename(bus.toString(), name.rawAddress.toString(), transports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: MutPtr<UShort>, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport(bus.toString(), sessionport.rawAddress.toString(), opts.toString(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename(bus.toString(), name.rawAddress.toString(), transports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname(bus.toString(), nameprefix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport(bus.toString(), nameprefix.rawAddress.toString(), transports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface(bus.toString(), implementsinterface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr<ConstPtr<Byte>>, numberinterfaces: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces(bus.toString(), implementsinterfaces.rawAddress.toString(), numberinterfaces.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys(bus.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect(bus.toString(), connectspec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate(applicationname.rawAddress.toString(), allowremotemessages).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency(applicationname.rawAddress.toString(), allowremotemessages, concurrency.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr<AlljoynInterfacedescription>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface(bus.toString(), name.rawAddress.toString(), iface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr<AlljoynInterfacedescription>, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure(bus.toString(), name.rawAddress.toString(), iface.rawAddress.toString(), secpolicy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml(bus.toString(), xml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore(applicationname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(bus.toString(), iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect(bus.toString(), unused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity(bus.toString(), authmechanisms.rawAddress.toString(), listener.toString(), keystorefilename.rawAddress.toString(), isshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus.toString(), authmechanisms.rawAddress.toString(), authlistener.toString(), keystorefilename.rawAddress.toString(), isshared, permissionconfigurationlistener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname(bus.toString(), nameprefix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport(bus.toString(), nameprefix.rawAddress.toString(), transports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(bus.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec(bus.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring(bus.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface(bus.toString(), name.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: ConstPtr<AlljoynInterfacedescription>, numifaces: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces(bus.toString(), ifaces.rawAddress.toString(), numifaces.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: MutPtr<UInt>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration(bus.toString(), guid.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: MutPtr<ULong>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid(bus.toString(), name.rawAddress.toString(), guid.rawAddress.toString(), guidsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGettimestamp(): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename(bus.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: MutPtr<UInt>, opts: AlljoynSessionopts): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession(bus.toString(), sessionhost.rawAddress.toString(), sessionport.toInt(), listener.toString(), sessionid.rawAddress.toString(), opts.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: MutPtr<CVoid>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync(bus.toString(), sessionhost.rawAddress.toString(), sessionport.toInt(), listener.toString(), opts.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(bus.toString(), sessionid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: MutPtr<Int>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner(bus.toString(), name.rawAddress.toString(), hasowner.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing(bus.toString(), name.rawAddress.toString(), timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(bus.toString(), aboutlistener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(bus.toString(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(bus.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(bus.toString(), obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(bus.toString(), obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(bus.toString(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename(bus.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch(bus.toString(), rule.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember(bus.toString(), sessionid.toInt(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname(bus.toString(), requestedname.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection(bus.toString(), name.rawAddress.toString(), forceauth) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync(bus.toString(), name.rawAddress.toString(), forceauth) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug(bus.toString(), module.rawAddress.toString(), level.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration(bus.toString(), guid.rawAddress.toString(), timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: MutPtr<UInt>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout(bus.toString(), sessionid.toInt(), linktimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: MutPtr<CVoid>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync(bus.toString(), sessionid.toInt(), linktimeout.toInt(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(bus.toString(), sessionid.toInt(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(bus.toString(), sessionport.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(bus.toString(), aboutlistener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(bus.toString(), listener.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(bus.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(bus.toString(), obj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface(bus.toString(), implementsinterface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr<ConstPtr<Byte>>, numberinterfaces: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces(bus.toString(), implementsinterfaces.rawAddress.toString(), numberinterfaces.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBuslistenerCreate(callbacks: ConstPtr<AlljoynBuslistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynBuslistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(bus.toString(), iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(bus.toString(), iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: ConstPtr<AlljoynBusobjectMethodentry>, numentries: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers(bus.toString(), entries.rawAddress.toString(), numentries.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(bus.toString(), msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(bus.toString(), serialnumber.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: ConstPtr<AlljoynBusobjectCallbacks>, contextIn: ConstPtr<CVoid>): AlljoynBusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate(path.rawAddress.toString(), isplaceholder, callbacksIn.rawAddress.toString(), contextIn.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectDestroy(bus: AlljoynBusobject) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: ConstPtr<ConstPtr<Byte>>, numprops: ULong, id: UInt) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged(bus.toString(), ifcname.rawAddress.toString(), propnames.rawAddress.toString(), numprops.toString(), id.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged(bus.toString(), ifcname.rawAddress.toString(), propname.rawAddress.toString(), value.toString(), id.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: ConstPtr<ConstPtr<Byte>>, numinterfaces: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames(bus.toString(), interfaces.rawAddress.toString(), numinterfaces.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname(bus.toString(), buffer.rawAddress.toString(), buffersz.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath(bus.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(bus.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(bus.toString(), msg.toString(), args.toString(), numargs.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr(bus.toString(), msg.toString(), error.rawAddress.toString(), errormessage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(bus.toString(), msg.toString(), status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(bus.toString(), iface.toString(), isannounced) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsClear(cred: AlljoynCredentials) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(cred.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsCreate(): AlljoynCredentials =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsDestroy(cred: AlljoynCredentials) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(cred.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain(cred.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(cred.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry(cred.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword(cred.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey(cred.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername(cred.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(cred.toString(), creds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain(cred.toString(), certchain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(cred.toString(), expiration.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry(cred.toString(), logonentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword(cred.toString(), pwd.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey(cred.toString(), pk.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername(cred.toString(), username.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynGetbuildinfo(): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynGetnumericversion(): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynGetversion(): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynGetversion().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInit(): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(iface.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation(iface.toString(), name.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation(iface.toString(), member.rawAddress.toString(), argname.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember(iface.toString(), type, name.rawAddress.toString(), inputsig.rawAddress.toString(), outsig.rawAddress.toString(), argnames.rawAddress.toString(), annotation.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation(iface.toString(), member.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod(iface.toString(), name.rawAddress.toString(), inputsig.rawAddress.toString(), outsig.rawAddress.toString(), argnames.rawAddress.toString(), annotation.toInt(), accessperms.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty(iface.toString(), name.rawAddress.toString(), signature.rawAddress.toString(), access.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation(iface.toString(), property.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal(iface.toString(), name.rawAddress.toString(), sig.rawAddress.toString(), argnames.rawAddress.toString(), annotation.toInt(), accessperms.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(one.toString(), other.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation(iface.toString(), name.rawAddress.toString(), value.rawAddress.toString(), valueSize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex(iface.toString(), index.toString(), name.rawAddress.toString(), nameSize.rawAddress.toString(), value.rawAddress.toString(), valueSize.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(iface.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage(iface.toString(), member.rawAddress.toString(), arg.rawAddress.toString(), description.rawAddress.toString(), maxlanguagelength.toString(), languagetag.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage(iface.toString(), description.rawAddress.toString(), maxlanguagelength.toString(), languagetag.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: ConstPtr<ConstPtr<Byte>>, size: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages(iface.toString(), languages.rawAddress.toString(), size.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2(iface.toString(), languages.rawAddress.toString(), languagessize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr =
    if (windowsWin32DevicesAlljoynNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember(iface.toString(), name.rawAddress.toString(), member.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation(iface.toString(), member.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), valueSize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation(iface.toString(), member.rawAddress.toString(), argname.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), valueSize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface.toString(), member.rawAddress.toString(), description.rawAddress.toString(), maxlanguagelength.toString(), languagetag.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: MutPtr<AlljoynInterfacedescriptionMember>, nummembers: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers(iface.toString(), members.rawAddress.toString(), nummembers.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod(iface.toString(), name.rawAddress.toString(), member.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname(iface.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: MutPtr<AlljoynInterfacedescriptionProperty>, numprops: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties(iface.toString(), props.rawAddress.toString(), numprops.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: MutPtr<AlljoynInterfacedescriptionProperty>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty(iface.toString(), name.rawAddress.toString(), property.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: MutPtr<ULong>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation(iface.toString(), property.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), strSize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface.toString(), property.rawAddress.toString(), description.rawAddress.toString(), maxlanguagelength.toString(), languagetag.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal(iface.toString(), name.rawAddress.toString(), member.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember(iface.toString(), name.rawAddress.toString(), insig.rawAddress.toString(), outsig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty(iface.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect(iface.toString(), str.rawAddress.toString(), buf.toString(), indent.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberEql(one: AlljoynInterfacedescriptionMember, other: AlljoynInterfacedescriptionMember): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotation(member: AlljoynInterfacedescriptionMember, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotationatindex(member: AlljoynInterfacedescriptionMember, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotationscount(member: AlljoynInterfacedescriptionMember): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotation(member: AlljoynInterfacedescriptionMember, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotationatindex(member: AlljoynInterfacedescriptionMember, argname: Pcstr, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotationscount(member: AlljoynInterfacedescriptionMember, argname: Pcstr): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyEql(one: AlljoynInterfacedescriptionProperty, other: AlljoynInterfacedescriptionProperty): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotation(property: AlljoynInterfacedescriptionProperty, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotationatindex(property: AlljoynInterfacedescriptionProperty, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotationscount(property: AlljoynInterfacedescriptionProperty): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetargdescription(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, description: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription(iface.toString(), member.rawAddress.toString(), argname.rawAddress.toString(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage(iface.toString(), member.rawAddress.toString(), arg.rawAddress.toString(), description.rawAddress.toString(), languagetag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription(iface.toString(), description.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage(iface.toString(), description.rawAddress.toString(), languagetag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage(iface.toString(), language.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback(iface.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription(iface.toString(), member.rawAddress.toString(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface.toString(), member.rawAddress.toString(), description.rawAddress.toString(), languagetag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription(iface.toString(), name.rawAddress.toString(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface.toString(), name.rawAddress.toString(), description.rawAddress.toString(), languagetag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerCreate(callbacks: ConstPtr<AlljoynKeystorelistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynKeystorelistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: MutPtr<ULong>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys(listener.toString(), keystore.toString(), sink.rawAddress.toString(), sinkSz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys(listener.toString(), keystore.toString(), source.rawAddress.toString(), password.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: ConstPtr<AlljoynKeystorelistenerWithSynchronizationCallbacks>, context: MutPtr<CVoid>): AlljoynKeystorelistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(bus.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription(msg.toString(), str.rawAddress.toString(), buf.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageDestroy(msg: AlljoynMessage) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(msg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(one.toString(), other.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(msg.toString(), argn.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: MutPtr<ULong>, args: MutPtr<AlljoynMsgarg>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs(msg.toString(), numargs.rawAddress.toString(), args.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism(msg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination(msg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: MutPtr<ULong>): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname(msg.toString(), errormessage.rawAddress.toString(), errormessageSize.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetflags(msg: AlljoynMessage): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(msg.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface(msg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername(msg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath(msg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname(msg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender(msg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature(msg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(msg.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: MutPtr<UInt>): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired(msg.toString(), tillexpirems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIssessionless(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(msg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs(msg.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageSetendianess(endian: Byte) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(endian.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring(msg.toString(), str.rawAddress.toString(), buf.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(arg.toString(), index.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet(args.toString(), numargs.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: MutPtr<ULong>, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet(args.toString(), numargs.rawAddress.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: MutPtr<ULong>, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset(args.toString(), argoffset.toString(), numargs.rawAddress.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature(values.toString(), numvalues.toString(), str.rawAddress.toString(), buf.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring(args.toString(), numargs.toString(), str.rawAddress.toString(), buf.toString(), indent.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargClear(arg: AlljoynMsgarg) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(destination.toString(), source.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(source.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargCreate(): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet(signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargDestroy(arg: AlljoynMsgarg) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(lhv.toString(), rhv.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet(arg.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: MutPtr<AlljoynMsgarg>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement(arg.toString(), index.toString(), element.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature(arg.toString(), index.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(arg.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: MutPtr<Int>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool(arg.toString(), b.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: MutPtr<ULong>, ab: MutPtr<Int>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray(arg.toString(), length.rawAddress.toString(), ab.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: MutPtr<Double>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble(arg.toString(), d.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: MutPtr<ULong>, ad: MutPtr<Double>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray(arg.toString(), length.rawAddress.toString(), ad.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: MutPtr<Short>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16(arg.toString(), n.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, an: MutPtr<Short>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array(arg.toString(), length.rawAddress.toString(), an.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: MutPtr<Int>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32(arg.toString(), i.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ai: MutPtr<Int>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array(arg.toString(), length.rawAddress.toString(), ai.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: MutPtr<Long>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64(arg.toString(), x.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ax: MutPtr<Long>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array(arg.toString(), length.rawAddress.toString(), ax.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath(arg.toString(), o.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature(arg.toString(), g.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString(arg.toString(), s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16(arg.toString(), q.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, aq: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array(arg.toString(), length.rawAddress.toString(), aq.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: MutPtr<UInt>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32(arg.toString(), u.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, au: MutPtr<UInt>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array(arg.toString(), length.rawAddress.toString(), au.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: MutPtr<ULong>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64(arg.toString(), t.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, at: MutPtr<ULong>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array(arg.toString(), length.rawAddress.toString(), at.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: MutPtr<UByte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8(arg.toString(), y.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ay: MutPtr<UByte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array(arg.toString(), length.rawAddress.toString(), ay.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(arg.toString(), v.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: MutPtr<ULong>, av: MutPtr<AlljoynMsgarg>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray(arg.toString(), signature.rawAddress.toString(), length.rawAddress.toString(), av.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement(arg.toString(), elemsig.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(arg.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(arg.toString(), index.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(arg.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(arg.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(arg.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature(arg.toString(), signature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet(arg.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize(arg.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(arg.toString(), b) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: MutPtr<Int>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray(arg.toString(), length.toString(), ab.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(arg.toString(), d) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: MutPtr<Double>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray(arg.toString(), length.toString(), ad.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(arg.toString(), n.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: MutPtr<Short>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array(arg.toString(), length.toString(), an.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(arg.toString(), i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: MutPtr<Int>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array(arg.toString(), length.toString(), ai.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(arg.toString(), x.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: MutPtr<Long>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array(arg.toString(), length.toString(), ax.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath(arg.toString(), o.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: ConstPtr<ConstPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray(arg.toString(), length.toString(), ao.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature(arg.toString(), g.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: ConstPtr<ConstPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray(arg.toString(), length.toString(), ag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString(arg.toString(), s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: ConstPtr<ConstPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray(arg.toString(), length.toString(), asTarget.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(arg.toString(), q.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array(arg.toString(), length.toString(), aq.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(arg.toString(), u.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: MutPtr<UInt>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array(arg.toString(), length.toString(), au.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(arg.toString(), t.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: MutPtr<ULong>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array(arg.toString(), length.toString(), at.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(arg.toString(), y.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: MutPtr<UByte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array(arg.toString(), length.toString(), ay.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(arg.toString(), key.toString(), value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(arg.toString(), structMembers.toString(), numMembers.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature(arg.toString(), str.rawAddress.toString(), buf.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargStabilize(arg: AlljoynMsgarg) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring(arg.toString(), str.rawAddress.toString(), buf.toString(), indent.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: ConstPtr<ConstPtr<Byte>>, nummandatoryinterfaces: ULong): AlljoynObserver =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate(bus.toString(), mandatoryinterfaces.rawAddress.toString(), nummandatoryinterfaces.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverDestroy(observer: AlljoynObserver) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(observer.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGet(observer.toString(), uniquebusname.rawAddress.toString(), objectpath.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(observer.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(observer.toString(), proxyref.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(observer.toString(), listener.toString(), triggeronexisting)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(observer.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(observer.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverlistenerCreate(callback: ConstPtr<AlljoynObserverlistenerCallback>, context: ConstPtr<CVoid>): AlljoynObserverlistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate(callback.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials(authmechanism.rawAddress.toString(), password.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfigurationlistenerCreate(callbacks: ConstPtr<AlljoynPermissionconfigurationlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynPermissionconfigurationlistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: MutPtr<Byte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy(certificatechain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: MutPtr<AlljoynCertificateid>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup(certificateid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: MutPtr<AlljoynCertificateidarray>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: MutPtr<Byte>, identitycertificatechain: MutPtr<Byte>, groupid: ConstPtr<UByte>, groupsize: ULong, groupauthority: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim(configurator.toString(), cakey.rawAddress.toString(), identitycertificatechain.rawAddress.toString(), groupid.rawAddress.toString(), groupsize.toString(), groupauthority.rawAddress.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(configurator.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: MutPtr<AlljoynApplicationstate>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate(configurator.toString(), state.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities(configurator.toString(), claimcapabilities.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator.toString(), additionalinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy(configurator.toString(), policyxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity(configurator.toString(), identitycertificatechain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: MutPtr<AlljoynCertificateid>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid(configurator.toString(), certificateid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: MutPtr<AlljoynManifestarray>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests(configurator.toString(), manifestarray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate(configurator.toString(), manifesttemplatexml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: MutPtr<AlljoynCertificateidarray>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries(configurator.toString(), certificateids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy(configurator.toString(), policyxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey(configurator.toString(), publickey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong, append: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests(configurator.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString(), append) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: MutPtr<Byte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership(configurator.toString(), membershipcertificatechain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: MutPtr<AlljoynManifestarray>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup(manifestarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: MutPtr<Byte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: MutPtr<Byte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy(policyxml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: MutPtr<Byte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy(publickey.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: ConstPtr<UByte>, seriallen: ULong, issuerpublickey: MutPtr<Byte>, issueraki: ConstPtr<UByte>, issuerakilen: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership(configurator.toString(), serial.rawAddress.toString(), seriallen.toString(), issuerpublickey.rawAddress.toString(), issueraki.rawAddress.toString(), issuerakilen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(configurator.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(configurator.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(configurator.toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(configurator.toString(), claimcapabilities.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator.toString(), additionalinfo.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr<Byte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator.toString(), manifesttemplatexml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(configurator.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity(configurator.toString(), identitycertificatechain.rawAddress.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<Byte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy(configurator.toString(), policyxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPinglistenerCreate(callback: ConstPtr<AlljoynPinglistenerCallback>, context: ConstPtr<CVoid>): AlljoynPinglistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate(callback.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(proxyobj.toString(), child.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(proxyobj.toString(), iface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName(proxyobj.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(source.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate(bus.toString(), service.rawAddress.toString(), path.rawAddress.toString(), sessionid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure(bus.toString(), service.rawAddress.toString(), path.rawAddress.toString(), sessionid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(proxyobj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(proxyobj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties(proxyobj.toString(), iface.rawAddress.toString(), values.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync(proxyobj.toString(), iface.rawAddress.toString(), 0L.toString(), timeout.toInt(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild(proxyobj.toString(), path.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: MutPtr<AlljoynProxybusobject>, numchildren: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren(proxyobj.toString(), children.rawAddress.toString(), numchildren.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface(proxyobj.toString(), iface.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: ConstPtr<AlljoynInterfacedescription>, numifaces: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces(proxyobj.toString(), ifaces.rawAddress.toString(), numifaces.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath(proxyobj.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty(proxyobj.toString(), iface.rawAddress.toString(), property.rawAddress.toString(), value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync(proxyobj.toString(), iface.rawAddress.toString(), property.rawAddress.toString(), 0L.toString(), timeout.toInt(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename(proxyobj.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(proxyobj.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename(proxyobj.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface(proxyobj.toString(), iface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(proxyobj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: MutPtr<CVoid>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync(proxyobj.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(proxyobj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(proxyobj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall(proxyobj.toString(), ifacename.rawAddress.toString(), methodname.rawAddress.toString(), args.toString(), numargs.toString(), replymsg.toString(), timeout.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply(proxyobj.toString(), ifacename.rawAddress.toString(), methodname.rawAddress.toString(), args.toString(), numargs.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr<CVoid>, timeout: UInt, flags: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync(proxyobj.toString(), ifacename.rawAddress.toString(), methodname.rawAddress.toString(), 0L.toString(), args.toString(), numargs.toString(), context.rawAddress.toString(), timeout.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr<CVoid>, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml(proxyobj.toString(), xml.rawAddress.toString(), identifier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(proxy.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(ref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(ref.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(ref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: ConstPtr<ConstPtr<Byte>>, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: MutPtr<CVoid>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj.toString(), iface.rawAddress.toString(), properties.rawAddress.toString(), numproperties.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild(proxyobj.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(proxyobj.toString(), forceauth) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(proxyobj.toString(), forceauth) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty(proxyobj.toString(), iface.rawAddress.toString(), property.rawAddress.toString(), value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync(proxyobj.toString(), iface.rawAddress.toString(), property.rawAddress.toString(), value.toString(), 0L.toString(), timeout.toInt(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj.toString(), iface.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRouterinit(): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynRouterinit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRouterinitwithconfig(configxml: MutPtr<Byte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig(configxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRoutershutdown(): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: MutPtr<Byte>, identitycertificatechain: MutPtr<Byte>, groupid: ConstPtr<UByte>, groupsize: ULong, groupauthority: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim(proxy.toString(), cakey.rawAddress.toString(), identitycertificatechain.rawAddress.toString(), groupid.rawAddress.toString(), groupsize.toString(), groupauthority.rawAddress.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, digest: MutPtr<MutPtr<UByte>>, digestsize: MutPtr<ULong>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml.rawAddress.toString(), identitycertificatepem.rawAddress.toString(), digest.rawAddress.toString(), digestsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: MutPtr<Byte>, sessionid: UInt): AlljoynSecurityapplicationproxy =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate(bus.toString(), appbusname.rawAddress.toString(), sessionid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyDigestDestroy(digest: MutPtr<UByte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy(digest.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: MutPtr<Byte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(proxy.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: MutPtr<AlljoynApplicationstate>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate(proxy.toString(), applicationstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities(proxy.toString(), capabilities.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: MutPtr<UShort>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy.toString(), additionalinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy(proxy.toString(), policyxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey(proxy.toString(), eccpublickey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate(proxy.toString(), manifesttemplatexml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy(proxy.toString(), policyxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: MutPtr<Byte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership(proxy.toString(), membershipcertificatechain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: MutPtr<Byte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: MutPtr<Byte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: MutPtr<Byte>) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy(policyxml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(proxy.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(proxy.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, signature: ConstPtr<UByte>, signaturesize: ULong, signedmanifestxml: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml.rawAddress.toString(), identitycertificatepem.rawAddress.toString(), signature.rawAddress.toString(), signaturesize.toString(), signedmanifestxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, signingprivatekeypem: MutPtr<Byte>, signedmanifestxml: MutPtr<MutPtr<Byte>>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml.rawAddress.toString(), identitycertificatepem.rawAddress.toString(), signingprivatekeypem.rawAddress.toString(), signedmanifestxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(proxy.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity(proxy.toString(), identitycertificatechain.rawAddress.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<Byte>): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy(proxy.toString(), policyxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionlistenerCreate(callbacks: ConstPtr<AlljoynSessionlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynSessionlistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(one.toString(), other.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(traffic.toInt(), ismultipoint, proximity.toInt(), transports.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(opts.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(opts.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(opts.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(opts.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(opts.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(one.toString(), other.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(opts.toString(), ismultipoint)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(opts.toString(), proximity.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(opts.toString(), traffic.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(opts.toString(), transports.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionportlistenerCreate(callbacks: ConstPtr<AlljoynSessionportlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynSessionportlistener =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynShutdown(): QStatus =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynUnityDeferredCallbacksProcess(): Int =
    if (windowsWin32DevicesAlljoynNapiAvailable) wasmWindowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int) {
    if (windowsWin32DevicesAlljoynNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
