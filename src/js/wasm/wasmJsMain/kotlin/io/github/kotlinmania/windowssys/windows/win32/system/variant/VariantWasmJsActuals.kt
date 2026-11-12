@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemVariantNapiAddon(): Boolean

private val windowsWin32SystemVariantNapiAvailable: Boolean = initWindowsWin32SystemVariantNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantClearVariantArray(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantClearVariantArray(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromBuffer(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromFileTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromFileTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromInt16Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromInt16Array(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromInt32Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromInt32Array(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromInt64Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromInt64Array(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromResource(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromResource(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromStringArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromStringArray(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantSystemTimeToVariantTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantSystemTimeToVariantTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantChangeType(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantChangeType(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantChangeTypeEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantChangeTypeEx(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantClear(p0)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantClear(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantCompare(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantCompare(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantCopy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantCopy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantCopyInd(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantCopyInd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetBooleanElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetBooleanElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetDoubleElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetDoubleElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetElementCount(p0)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetElementCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetInt16Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetInt16Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetInt32Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetInt32Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetInt64Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetInt64Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetStringElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetStringElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetUInt16Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetUInt16Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetUInt32Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetUInt32Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantGetUInt64Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantGetUInt64Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantInit(p0)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantInit(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(p0: Double, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantTimeToSystemTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantTimeToSystemTime(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToBoolean(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToBoolean(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToBooleanArray(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToBooleanArray(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToBuffer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToDosDateTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToDosDateTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToDouble(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToDouble(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToDoubleArray(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToDoubleArray(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(p0: String, p1: Double): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToFileTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToFileTime(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToGUID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToGUID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt16(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt16(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt16Array(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt16Array(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt16WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt16WithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt32(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt32Array(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt32Array(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt32WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt32WithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt64Array(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt64Array(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToInt64WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToInt64WithDefault(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToString(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToStringAlloc(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToStringAlloc(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToStringArray(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToStringArray(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToStringWithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToStringWithDefault(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt16(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt16(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt16Array(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt16Array(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt32(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt32Array(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt32Array(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt64Array(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt64Array(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(p0: String, p1: String): String

public actual fun clearVariantArray(pvars: MutPtr<Variant>, cvars: UInt) {
    if (windowsWin32SystemVariantNapiAvailable) {
        wasmWindowssysWindowsWin32SystemVariantClearVariantArray(pvars.rawAddress.toString(), cvars.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: MutPtr<Double>): Int =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(wdosdate.toInt(), wdostime.toInt(), pvtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromBooleanArray(prgf: ConstPtr<Bool>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(prgf.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromBuffer(pv: ConstPtr<CVoid>, cb: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromBuffer(pv.rawAddress.toString(), cb.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromDoubleArray(prgn: ConstPtr<Double>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromFileTime(pft: ConstPtr<Filetime>, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromFileTime(pft.rawAddress.toString(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromFileTimeArray(prgft: ConstPtr<Filetime>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(prgft.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromGUIDAsString(guid: ConstPtr<Guid>, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(guid.rawAddress.toString(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt16Array(prgn: ConstPtr<Short>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromInt16Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt32Array(prgn: ConstPtr<Int>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromInt32Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt64Array(prgn: ConstPtr<Long>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromInt64Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromResource(hinst.rawAddress.toString(), id.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromStringArray(prgsz: ConstPtr<Pcwstr>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromStringArray(prgsz.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt16Array(prgn: ConstPtr<UShort>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt32Array(prgn: ConstPtr<UInt>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt64Array(prgn: ConstPtr<ULong>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromVariantArrayElem(varin: ConstPtr<Variant>, ielem: UInt, pvar: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(varin.rawAddress.toString(), ielem.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToVariantTime(lpsystemtime: ConstPtr<Systemtime>, pvtime: MutPtr<Double>): Int =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantSystemTimeToVariantTime(lpsystemtime.rawAddress.toString(), pvtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Variant>) {
    if (windowsWin32SystemVariantNapiAvailable) {
        wasmWindowssysWindowsWin32SystemVariantVariantUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Variant>) {
    if (windowsWin32SystemVariantNapiAvailable) {
        wasmWindowssysWindowsWin32SystemVariantVariantUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Variant>): MutPtr<UByte> =
    if (windowsWin32SystemVariantNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemVariantVariantUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Variant>): MutPtr<UByte> =
    if (windowsWin32SystemVariantNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemVariantVariantUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Variant>): UInt =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Variant>): UInt =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Variant>): MutPtr<UByte> =
    if (windowsWin32SystemVariantNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemVariantVariantUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Variant>): MutPtr<UByte> =
    if (windowsWin32SystemVariantNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemVariantVariantUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantChangeType(pvargdest: MutPtr<Variant>, pvarsrc: ConstPtr<Variant>, wflags: VarChangeFlags, vt: Varenum): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantChangeType(pvargdest.rawAddress.toString(), pvarsrc.rawAddress.toString(), wflags.toInt(), vt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantChangeTypeEx(pvargdest: MutPtr<Variant>, pvarsrc: ConstPtr<Variant>, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantChangeTypeEx(pvargdest.rawAddress.toString(), pvarsrc.rawAddress.toString(), lcid.toInt(), wflags.toInt(), vt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantClear(pvarg: MutPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantClear(pvarg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCompare(var1: ConstPtr<Variant>, var2: ConstPtr<Variant>): Int =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantCompare(var1.rawAddress.toString(), var2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCopy(pvargdest: MutPtr<Variant>, pvargsrc: ConstPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantCopy(pvargdest.rawAddress.toString(), pvargsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCopyInd(pvardest: MutPtr<Variant>, pvargsrc: ConstPtr<Variant>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantCopyInd(pvardest.rawAddress.toString(), pvargsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetBooleanElem(variable: ConstPtr<Variant>, ielem: UInt, pfval: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetBooleanElem(variable.rawAddress.toString(), ielem.toInt(), pfval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetDoubleElem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Double>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetDoubleElem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetElementCount(varin: ConstPtr<Variant>): UInt =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetElementCount(varin.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt16Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Short>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetInt16Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt32Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Int>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetInt32Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt64Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Long>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetInt64Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetStringElem(variable: ConstPtr<Variant>, ielem: UInt, ppszval: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetStringElem(variable.rawAddress.toString(), ielem.toInt(), ppszval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt16Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetUInt16Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt32Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetUInt32Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt64Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantGetUInt64Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantInit(pvarg: MutPtr<Variant>) {
    if (windowsWin32SystemVariantNapiAvailable) {
        wasmWindowssysWindowsWin32SystemVariantVariantInit(pvarg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: MutPtr<UShort>, pwdostime: MutPtr<UShort>): Int =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(vtime, pwdosdate.rawAddress.toString(), pwdostime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: MutPtr<Systemtime>): Int =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantTimeToSystemTime(vtime, lpsystemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBoolean(varin: ConstPtr<Variant>, pfret: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToBoolean(varin.rawAddress.toString(), pfret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanArray(variable: ConstPtr<Variant>, prgf: MutPtr<Bool>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToBooleanArray(variable.rawAddress.toString(), prgf.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanArrayAlloc(variable: ConstPtr<Variant>, pprgf: MutPtr<MutPtr<Bool>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(variable.rawAddress.toString(), pprgf.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanWithDefault(varin: ConstPtr<Variant>, fdefault: Bool): Bool =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(varin.rawAddress.toString(), fdefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBuffer(varin: ConstPtr<Variant>, pv: MutPtr<CVoid>, cb: UInt): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToBuffer(varin.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDosDateTime(varin: ConstPtr<Variant>, pwdate: MutPtr<UShort>, pwtime: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToDosDateTime(varin.rawAddress.toString(), pwdate.rawAddress.toString(), pwtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDouble(varin: ConstPtr<Variant>, pdblret: MutPtr<Double>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToDouble(varin.rawAddress.toString(), pdblret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleArray(variable: ConstPtr<Variant>, prgn: MutPtr<Double>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToDoubleArray(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Double>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleWithDefault(varin: ConstPtr<Variant>, dbldefault: Double): Double =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(varin.rawAddress.toString(), dbldefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToFileTime(varin: ConstPtr<Variant>, stfout: PstimeFlags, pftout: MutPtr<Filetime>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToFileTime(varin.rawAddress.toString(), stfout, pftout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToGUID(varin: ConstPtr<Variant>, pguid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToGUID(varin.rawAddress.toString(), pguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16(varin: ConstPtr<Variant>, piret: MutPtr<Short>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt16(varin.rawAddress.toString(), piret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16Array(variable: ConstPtr<Variant>, prgn: MutPtr<Short>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt16Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Short>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16WithDefault(varin: ConstPtr<Variant>, idefault: Short): Short =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt16WithDefault(varin.rawAddress.toString(), idefault.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32(varin: ConstPtr<Variant>, plret: MutPtr<Int>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt32(varin.rawAddress.toString(), plret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32Array(variable: ConstPtr<Variant>, prgn: MutPtr<Int>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt32Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Int>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32WithDefault(varin: ConstPtr<Variant>, ldefault: Int): Int =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt32WithDefault(varin.rawAddress.toString(), ldefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64(varin: ConstPtr<Variant>, pllret: MutPtr<Long>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt64(varin.rawAddress.toString(), pllret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64Array(variable: ConstPtr<Variant>, prgn: MutPtr<Long>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt64Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Long>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64WithDefault(varin: ConstPtr<Variant>, lldefault: Long): Long =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToInt64WithDefault(varin.rawAddress.toString(), lldefault.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToString(varin: ConstPtr<Variant>, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToString(varin.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringAlloc(varin: ConstPtr<Variant>, ppszbuf: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToStringAlloc(varin.rawAddress.toString(), ppszbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringArray(variable: ConstPtr<Variant>, prgsz: MutPtr<Pwstr>, crgsz: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToStringArray(variable.rawAddress.toString(), prgsz.rawAddress.toString(), crgsz.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringArrayAlloc(variable: ConstPtr<Variant>, pprgsz: MutPtr<MutPtr<Pwstr>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(variable.rawAddress.toString(), pprgsz.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringWithDefault(varin: ConstPtr<Variant>, pszdefault: Pcwstr): Pcwstr =
    if (windowsWin32SystemVariantNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemVariantVariantToStringWithDefault(varin.rawAddress.toString(), pszdefault.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16(varin: ConstPtr<Variant>, puiret: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt16(varin.rawAddress.toString(), puiret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16Array(variable: ConstPtr<Variant>, prgn: MutPtr<UShort>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt16Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<UShort>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16WithDefault(varin: ConstPtr<Variant>, uidefault: UShort): UShort =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(varin.rawAddress.toString(), uidefault.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32(varin: ConstPtr<Variant>, pulret: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt32(varin.rawAddress.toString(), pulret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32Array(variable: ConstPtr<Variant>, prgn: MutPtr<UInt>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt32Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<UInt>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32WithDefault(varin: ConstPtr<Variant>, uldefault: UInt): UInt =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(varin.rawAddress.toString(), uldefault.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64(varin: ConstPtr<Variant>, pullret: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt64(varin.rawAddress.toString(), pullret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64Array(variable: ConstPtr<Variant>, prgn: MutPtr<ULong>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt64Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<ULong>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64WithDefault(varin: ConstPtr<Variant>, ulldefault: ULong): ULong =
    if (windowsWin32SystemVariantNapiAvailable) wasmWindowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(varin.rawAddress.toString(), ulldefault.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
