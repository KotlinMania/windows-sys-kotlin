@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityApplockerNapiAddon(): Boolean

private val windowsWin32SecurityApplockerNapiAvailable: Boolean = initWindowsWin32SecurityApplockerNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferCloseLevel(p0)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferCloseLevel(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferCreateLevel(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferCreateLevel(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(p0: String, p1: Boolean): Int

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferCloseLevel(hlevelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: MutPtr, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: MutPtr): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(levelhandle.rawAddress.toString(), inaccesstoken.rawAddress.toString(), outaccesstoken.rawAddress.toString(), dwflags.toInt(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: MutPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferCreateLevel(dwscopeid.toInt(), dwlevelid.toInt(), openflags.toInt(), plevelhandle.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: MutPtr, dwinbuffersize: UInt, lpdwoutbuffersize: MutPtr): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(levelhandle.rawAddress.toString(), dwinfotype, lpquerybuffer.rawAddress.toString(), dwinbuffersize.toInt(), lpdwoutbuffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: MutPtr, infobufferretsize: MutPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer.rawAddress.toString(), infobufferretsize.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: ConstPtr, plevelhandle: MutPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(dwnumproperties.toInt(), pcodeproperties.rawAddress.toString(), plevelhandle.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: ConstPtr): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(hlevel.rawAddress.toString(), sztargetpath.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: ConstPtr, dwinbuffersize: UInt): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(levelhandle.rawAddress.toString(), dwinfotype, lpquerybuffer.rawAddress.toString(), dwinbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: ConstPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    if (windowsWin32SecurityApplockerNapiAvailable) wasmWindowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(szfullpathname.rawAddress.toString(), bfromshellexecute) else throw UnsupportedOperationException("Native FFI addon is not available")
