@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemJsNapiAddon(): Boolean

private val windowsWin32SystemJsNapiAvailable: Boolean = initWindowsWin32SystemJsNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsAddRef(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsAddRef(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsBoolToBoolean(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsBoolToBoolean(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsBooleanToBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsBooleanToBool(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCallFunction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCallFunction(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCollectGarbage(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCollectGarbage(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsConstructObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJsJsConstructObject(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsConvertValueToBoolean(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsConvertValueToBoolean(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsConvertValueToNumber(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsConvertValueToNumber(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsConvertValueToObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsConvertValueToObject(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsConvertValueToString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsConvertValueToString(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateArray(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateArray(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateError(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateError(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateExternalObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateExternalObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateFunction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateFunction(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateObject(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateObject(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateRangeError(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateRangeError(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateReferenceError(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateReferenceError(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateRuntime(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateRuntime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateSyntaxError(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateSyntaxError(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateTypeError(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateTypeError(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsCreateURIError(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsCreateURIError(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsDefineProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJsJsDefineProperty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsDeleteIndexedProperty(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsDeleteIndexedProperty(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsDeleteProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJsJsDeleteProperty(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsDisableRuntimeExecution(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsDisableRuntimeExecution(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsDisposeRuntime(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsDisposeRuntime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsDoubleToNumber(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsDoubleToNumber(p0: Double, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsEnableRuntimeExecution(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsEnableRuntimeExecution(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsEquals(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsEquals(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetAndClearException(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetAndClearException(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetCurrentContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetCurrentContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetExtensionAllowed(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetExtensionAllowed(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetExternalData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetExternalData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetFalseValue(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetFalseValue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetGlobalObject(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetGlobalObject(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetIndexedProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetIndexedProperty(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetNullValue(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetNullValue(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetOwnPropertyNames(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetOwnPropertyNames(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetProperty(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetPropertyIdFromName(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetPropertyIdFromName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetPropertyNameFromId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetPropertyNameFromId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetPrototype(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetPrototype(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetRuntime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetRuntime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetStringLength(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetStringLength(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetTrueValue(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetTrueValue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetUndefinedValue(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetUndefinedValue(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsGetValueType(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsGetValueType(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsHasException(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsHasException(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsHasExternalData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsHasExternalData(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsHasIndexedProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsHasIndexedProperty(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsHasProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsHasProperty(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsIdle(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsIdle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsIntToNumber(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsIntToNumber(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsIsEnumeratingHeap(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsIsEnumeratingHeap(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsNumberToDouble(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsNumberToDouble(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsParseScript(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJsJsParseScript(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsParseSerializedScript(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemJsJsParseSerializedScript(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsPointerToString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsPointerToString(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsPreventExtension(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsPreventExtension(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsRelease(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsRelease(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsRunScript(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJsJsRunScript(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsRunSerializedScript(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemJsJsRunSerializedScript(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSerializeScript(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSerializeScript(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetCurrentContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetCurrentContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetException(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetException(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetExternalData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetExternalData(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetIndexedProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetIndexedProperty(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetProperty(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetPrototype(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetPrototype(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsStopProfiling(p0)")
private external fun wasmWindowssysWindowsWin32SystemJsJsStopProfiling(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsStrictEquals(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsStrictEquals(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsStringToPointer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJsJsStringToPointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsValueToVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsValueToVariant(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJsJsVariantToValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJsJsVariantToValue(p0: String, p1: String): Int

public actual fun jsAddRef(ref: ConstPtr<CVoid>, count: MutPtr<UInt>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsAddRef(ref.rawAddress.toString(), count.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsBoolToBoolean(value.toInt(), booleanvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsBooleanToBool(value: ConstPtr<CVoid>, boolvalue: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsBooleanToBool(value.rawAddress.toString(), boolvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCallFunction(function: ConstPtr<CVoid>, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCallFunction(function.rawAddress.toString(), arguments.rawAddress.toString(), argumentcount.toInt(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCollectGarbage(runtime: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCollectGarbage(runtime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConstructObject(function: ConstPtr<CVoid>, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsConstructObject(function.rawAddress.toString(), arguments.rawAddress.toString(), argumentcount.toInt(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToBoolean(value: ConstPtr<CVoid>, booleanvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsConvertValueToBoolean(value.rawAddress.toString(), booleanvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToNumber(value: ConstPtr<CVoid>, numbervalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsConvertValueToNumber(value.rawAddress.toString(), numbervalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToObject(value: ConstPtr<CVoid>, obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsConvertValueToObject(value.rawAddress.toString(), obj.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToString(value: ConstPtr<CVoid>, stringvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsConvertValueToString(value.rawAddress.toString(), stringvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateArray(length: UInt, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateArray(length.toInt(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateError(message.rawAddress.toString(), error.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateExternalObject(data: ConstPtr<CVoid>, finalizecallback: JsFinalizeCallback, obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateExternalObject(data.rawAddress.toString(), 0L.toString(), obj.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: ConstPtr<CVoid>, function: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateFunction(0L.toString(), callbackstate.rawAddress.toString(), function.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateObject(obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateObject(obj.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateRangeError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateRangeError(message.rawAddress.toString(), error.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateReferenceError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateReferenceError(message.rawAddress.toString(), error.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateRuntime(attributes, runtimeversion, 0L.toString(), runtime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateSyntaxError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateSyntaxError(message.rawAddress.toString(), error.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateTypeError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateTypeError(message.rawAddress.toString(), error.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateURIError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsCreateURIError(message.rawAddress.toString(), error.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDefineProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, propertydescriptor: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsDefineProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), propertydescriptor.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDeleteIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsDeleteIndexedProperty(obj.rawAddress.toString(), index.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDeleteProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, usestrictrules: UByte, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsDeleteProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), usestrictrules.toInt(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDisableRuntimeExecution(runtime: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsDisableRuntimeExecution(runtime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDisposeRuntime(runtime: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsDisposeRuntime(runtime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDoubleToNumber(doublevalue: Double, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsDoubleToNumber(doublevalue, value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsEnableRuntimeExecution(runtime: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsEnableRuntimeExecution(runtime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsEquals(object1: ConstPtr<CVoid>, object2: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsEquals(object1.rawAddress.toString(), object2.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetAndClearException(exception: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetAndClearException(exception.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetCurrentContext(currentcontext: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetCurrentContext(currentcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetExtensionAllowed(obj: ConstPtr<CVoid>, value: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetExtensionAllowed(obj.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetExternalData(obj: ConstPtr<CVoid>, externaldata: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetExternalData(obj.rawAddress.toString(), externaldata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetFalseValue(falsevalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetFalseValue(falsevalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetGlobalObject(globalobject: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetGlobalObject(globalobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetIndexedProperty(obj.rawAddress.toString(), index.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetNullValue(nullvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetNullValue(nullvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetOwnPropertyDescriptor(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, propertydescriptor: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(obj.rawAddress.toString(), propertyid.rawAddress.toString(), propertydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetOwnPropertyNames(obj: ConstPtr<CVoid>, propertynames: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetOwnPropertyNames(obj.rawAddress.toString(), propertynames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetPropertyIdFromName(name.rawAddress.toString(), propertyid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPropertyNameFromId(propertyid: ConstPtr<CVoid>, name: MutPtr<MutPtr<UShort>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetPropertyNameFromId(propertyid.rawAddress.toString(), name.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPrototype(obj: ConstPtr<CVoid>, prototypeobject: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetPrototype(obj.rawAddress.toString(), prototypeobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntime(context: ConstPtr<CVoid>, runtime: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetRuntime(context.rawAddress.toString(), runtime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntimeMemoryLimit(runtime: ConstPtr<CVoid>, memorylimit: MutPtr<ULong>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(runtime.rawAddress.toString(), memorylimit.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntimeMemoryUsage(runtime: ConstPtr<CVoid>, memoryusage: MutPtr<ULong>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(runtime.rawAddress.toString(), memoryusage.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetStringLength(stringvalue: ConstPtr<CVoid>, length: MutPtr<Int>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetStringLength(stringvalue.rawAddress.toString(), length.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetTrueValue(truevalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetTrueValue(truevalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetUndefinedValue(undefinedvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetUndefinedValue(undefinedvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetValueType(value: ConstPtr<CVoid>, type: MutPtr<JsValueType>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsGetValueType(value.rawAddress.toString(), type.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasException(hasexception: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsHasException(hasexception.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasExternalData(obj: ConstPtr<CVoid>, value: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsHasExternalData(obj.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsHasIndexedProperty(obj.rawAddress.toString(), index.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, hasproperty: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsHasProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), hasproperty.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIdle(nextidletick: MutPtr<UInt>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsIdle(nextidletick.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIntToNumber(intvalue: Int, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsIntToNumber(intvalue, value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIsEnumeratingHeap(isenumeratingheap: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsIsEnumeratingHeap(isenumeratingheap.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIsRuntimeExecutionDisabled(runtime: ConstPtr<CVoid>, isdisabled: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(runtime.rawAddress.toString(), isdisabled.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsNumberToDouble(value: ConstPtr<CVoid>, doublevalue: MutPtr<Double>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsNumberToDouble(value.rawAddress.toString(), doublevalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsParseScript(script.rawAddress.toString(), sourcecontext.toString(), sourceurl.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: ConstPtr<UByte>, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsParseSerializedScript(script.rawAddress.toString(), buffer.rawAddress.toString(), sourcecontext.toString(), sourceurl.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsPointerToString(stringvalue.rawAddress.toString(), stringlength.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsPreventExtension(obj: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsPreventExtension(obj.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRelease(ref: ConstPtr<CVoid>, count: MutPtr<UInt>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsRelease(ref.rawAddress.toString(), count.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsRunScript(script.rawAddress.toString(), sourcecontext.toString(), sourceurl.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: ConstPtr<UByte>, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsRunSerializedScript(script.rawAddress.toString(), buffer.rawAddress.toString(), sourcecontext.toString(), sourceurl.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSerializeScript(script: Pcwstr, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSerializeScript(script.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetCurrentContext(context: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetCurrentContext(context.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetException(exception: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetException(exception.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetExternalData(obj: ConstPtr<CVoid>, externaldata: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetExternalData(obj.rawAddress.toString(), externaldata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, value: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetIndexedProperty(obj.rawAddress.toString(), index.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, value: ConstPtr<CVoid>, usestrictrules: UByte): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), value.rawAddress.toString(), usestrictrules.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetPrototype(obj: ConstPtr<CVoid>, prototypeobject: ConstPtr<CVoid>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetPrototype(obj.rawAddress.toString(), prototypeobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: ConstPtr<CVoid>, callbackstate: ConstPtr<CVoid>, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(runtime.rawAddress.toString(), callbackstate.rawAddress.toString(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: ConstPtr<CVoid>, callbackstate: ConstPtr<CVoid>, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(runtime.rawAddress.toString(), callbackstate.rawAddress.toString(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeMemoryLimit(runtime: ConstPtr<CVoid>, memorylimit: ULong): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(runtime.rawAddress.toString(), memorylimit.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsStopProfiling(reason).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStrictEquals(object1: ConstPtr<CVoid>, object2: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsStrictEquals(object1.rawAddress.toString(), object2.rawAddress.toString(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStringToPointer(value: ConstPtr<CVoid>, stringvalue: MutPtr<MutPtr<UShort>>, stringlength: MutPtr<ULong>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsStringToPointer(value.rawAddress.toString(), stringvalue.rawAddress.toString(), stringlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsValueToVariant(obj: ConstPtr<CVoid>, variant: MutPtr<Variant.Variant>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsValueToVariant(obj.rawAddress.toString(), variant.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsVariantToValue(variant: ConstPtr<Variant.Variant>, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    if (windowsWin32SystemJsNapiAvailable) wasmWindowssysWindowsWin32SystemJsJsVariantToValue(variant.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
