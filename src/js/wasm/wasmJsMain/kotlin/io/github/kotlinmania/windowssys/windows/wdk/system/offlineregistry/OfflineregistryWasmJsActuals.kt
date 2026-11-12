@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkSystemOfflineregistryNapiAddon(): Boolean

private val windowsWdkSystemOfflineregistryNapiAvailable: Boolean = initWindowsWdkSystemOfflineregistryNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORCloseHive(p0)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORCloseHive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORCloseKey(p0)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORCloseKey(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORCreateHive(p0)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORCreateHive(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORCreateKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORCreateKey(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORDeleteKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORDeleteKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORDeleteValue(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORDeleteValue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryOREnumKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryOREnumKey(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryOREnumValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryOREnumValue(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORGetKeySecurity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORGetKeySecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORGetValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORGetValue(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORGetVersion(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORGetVersion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORMergeHives(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORMergeHives(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryOROpenHive(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryOROpenHive(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryOROpenKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryOROpenKey(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORQueryInfoKey(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORQueryInfoKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORRenameKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORRenameKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORSaveHive(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORSaveHive(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORSetKeySecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORSetKeySecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORSetValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORSetValue(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORShutdown()")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORShutdown(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemOfflineregistryORStart()")
private external fun wasmWindowssysWindowsWdkSystemOfflineregistryORStart(): Int

public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORCloseHive(handle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORCloseKey(keyhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCreateHive(horkey: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORCreateHive(horkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: MutPtr, pdwdisposition: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORCreateKey(keyhandle.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpclass.rawAddress.toString(), dwoptions.toInt(), psecuritydescriptor.rawAddress.toString(), phkresult.rawAddress.toString(), pdwdisposition.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORDeleteKey(handle.rawAddress.toString(), lpsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORDeleteValue(handle.rawAddress.toString(), lpvaluename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: MutPtr, lpclass: Pwstr, lpcclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryOREnumKey(handle.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), lpcname.rawAddress.toString(), lpclass.rawAddress.toString(), lpcclass.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: MutPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryOREnumValue(handle.rawAddress.toString(), dwindex.toInt(), lpvaluename.rawAddress.toString(), lpcvaluename.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORGetKeySecurity(handle.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORGetValue(handle.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetVersion(pdwmajorversion: MutPtr, pdwminorversion: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORGetVersion(pdwmajorversion.rawAddress.toString(), pdwminorversion.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags(handle.rawAddress.toString(), pdwflags.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRMergeHives(hivehandles: ConstPtr, hivecount: UInt, phkresult: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORMergeHives(hivehandles.rawAddress.toString(), hivecount.toInt(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenHive(filepath: Pcwstr, horkey: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryOROpenHive(filepath.rawAddress.toString(), horkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle(filehandle.rawAddress.toString(), horkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryOROpenKey(handle.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: MutPtr, lpcsubkeys: MutPtr, lpcmaxsubkeylen: MutPtr, lpcmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcmaxvaluenamelen: MutPtr, lpcmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORQueryInfoKey(handle.rawAddress.toString(), lpclass.rawAddress.toString(), lpcclass.rawAddress.toString(), lpcsubkeys.rawAddress.toString(), lpcmaxsubkeylen.rawAddress.toString(), lpcmaxclasslen.rawAddress.toString(), lpcvalues.rawAddress.toString(), lpcmaxvaluenamelen.rawAddress.toString(), lpcmaxvaluelen.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORRenameKey(handle.rawAddress.toString(), lpnewname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORSaveHive(horkey.rawAddress.toString(), hivepath.rawAddress.toString(), osmajorversion.toInt(), osminorversion.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORSetKeySecurity(handle.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORSetValue(handle.rawAddress.toString(), lpvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags(handle.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRShutdown(): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORShutdown().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRStart(): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAvailable) wasmWindowssysWindowsWdkSystemOfflineregistryORStart().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
