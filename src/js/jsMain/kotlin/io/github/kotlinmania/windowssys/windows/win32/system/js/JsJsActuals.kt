@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val _windowsWin32SystemJsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun jsAddRef(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsAddRef((ref?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsBoolToBoolean(value.toInt(), (booleanvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsBooleanToBool(value: COpaquePointer?, boolvalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsBooleanToBool((value?.value ?: 0L).toString(), (boolvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCallFunction(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCallFunction((function?.value ?: 0L).toString(), (arguments?.value ?: 0L).toString(), argumentcount.toInt(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCollectGarbage(runtime: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCollectGarbage((runtime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConstructObject(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsConstructObject((function?.value ?: 0L).toString(), (arguments?.value ?: 0L).toString(), argumentcount.toInt(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToBoolean(value: COpaquePointer?, booleanvalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsConvertValueToBoolean((value?.value ?: 0L).toString(), (booleanvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToNumber(value: COpaquePointer?, numbervalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsConvertValueToNumber((value?.value ?: 0L).toString(), (numbervalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToObject(value: COpaquePointer?, obj: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsConvertValueToObject((value?.value ?: 0L).toString(), (obj?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToString(value: COpaquePointer?, stringvalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsConvertValueToString((value?.value ?: 0L).toString(), (stringvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateArray(length: UInt, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateArray(length.toInt(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateError((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateExternalObject(data: COpaquePointer?, finalizecallback: JsFinalizeCallback, obj: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateExternalObject((data?.value ?: 0L).toString(), 0L.toString(), (obj?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: COpaquePointer?, function: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateFunction(0L.toString(), (callbackstate?.value ?: 0L).toString(), (function?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateObject(obj: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateObject((obj?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateRangeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateRangeError((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateReferenceError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateReferenceError((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateRuntime(attributes, runtimeversion, 0L.toString(), (runtime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateSyntaxError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateSyntaxError((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateTypeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateTypeError((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateURIError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsCreateURIError((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDefineProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsDefineProperty((obj?.value ?: 0L).toString(), (propertyid?.value ?: 0L).toString(), (propertydescriptor?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDeleteIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsDeleteIndexedProperty((obj?.value ?: 0L).toString(), (index?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDeleteProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, usestrictrules: UByte, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsDeleteProperty((obj?.value ?: 0L).toString(), (propertyid?.value ?: 0L).toString(), usestrictrules.toInt(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDisableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsDisableRuntimeExecution((runtime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDisposeRuntime(runtime: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsDisposeRuntime((runtime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDoubleToNumber(doublevalue: Double, value: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsDoubleToNumber(doublevalue, (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsEnableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsEnableRuntimeExecution((runtime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsEquals((object1?.value ?: 0L).toString(), (object2?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetAndClearException(exception: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetAndClearException((exception?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetCurrentContext(currentcontext: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetCurrentContext((currentcontext?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetExtensionAllowed(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetExtensionAllowed((obj?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetExternalData((obj?.value ?: 0L).toString(), (externaldata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetFalseValue(falsevalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetFalseValue((falsevalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetGlobalObject(globalobject: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetGlobalObject((globalobject?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetIndexedProperty((obj?.value ?: 0L).toString(), (index?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetNullValue(nullvalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetNullValue((nullvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetOwnPropertyDescriptor(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetOwnPropertyDescriptor((obj?.value ?: 0L).toString(), (propertyid?.value ?: 0L).toString(), (propertydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetOwnPropertyNames(obj: COpaquePointer?, propertynames: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetOwnPropertyNames((obj?.value ?: 0L).toString(), (propertynames?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetProperty((obj?.value ?: 0L).toString(), (propertyid?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetPropertyIdFromName((name?.value ?: 0L).toString(), (propertyid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPropertyNameFromId(propertyid: COpaquePointer?, name: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetPropertyNameFromId((propertyid?.value ?: 0L).toString(), (name?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetPrototype((obj?.value ?: 0L).toString(), (prototypeobject?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntime(context: COpaquePointer?, runtime: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetRuntime((context?.value ?: 0L).toString(), (runtime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetRuntimeMemoryLimit((runtime?.value ?: 0L).toString(), (memorylimit?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntimeMemoryUsage(runtime: COpaquePointer?, memoryusage: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetRuntimeMemoryUsage((runtime?.value ?: 0L).toString(), (memoryusage?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetStringLength(stringvalue: COpaquePointer?, length: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetStringLength((stringvalue?.value ?: 0L).toString(), (length?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetTrueValue(truevalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetTrueValue((truevalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetUndefinedValue(undefinedvalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetUndefinedValue((undefinedvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetValueType(value: COpaquePointer?, type: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsGetValueType((value?.value ?: 0L).toString(), (type?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasException(hasexception: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsHasException((hasexception?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasExternalData(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsHasExternalData((obj?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsHasIndexedProperty((obj?.value ?: 0L).toString(), (index?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, hasproperty: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsHasProperty((obj?.value ?: 0L).toString(), (propertyid?.value ?: 0L).toString(), (hasproperty?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIdle(nextidletick: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsIdle((nextidletick?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIntToNumber(intvalue: Int, value: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsIntToNumber(intvalue, (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIsEnumeratingHeap(isenumeratingheap: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsIsEnumeratingHeap((isenumeratingheap?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIsRuntimeExecutionDisabled(runtime: COpaquePointer?, isdisabled: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsIsRuntimeExecutionDisabled((runtime?.value ?: 0L).toString(), (isdisabled?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsNumberToDouble(value: COpaquePointer?, doublevalue: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsNumberToDouble((value?.value ?: 0L).toString(), (doublevalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsParseScript((script?.value ?: 0L).toString(), sourcecontext.toString(), (sourceurl?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsParseSerializedScript((script?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), sourcecontext.toString(), (sourceurl?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsPointerToString((stringvalue?.value ?: 0L).toString(), stringlength.toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsPreventExtension(obj: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsPreventExtension((obj?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRelease(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsRelease((ref?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsRunScript((script?.value ?: 0L).toString(), sourcecontext.toString(), (sourceurl?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsRunSerializedScript((script?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), sourcecontext.toString(), (sourceurl?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSerializeScript(script: Pcwstr, buffer: COpaquePointer?, buffersize: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSerializeScript((script?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetCurrentContext(context: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetCurrentContext((context?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetException(exception: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetException((exception?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetExternalData((obj?.value ?: 0L).toString(), (externaldata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetIndexedProperty((obj?.value ?: 0L).toString(), (index?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?, usestrictrules: UByte): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetProperty((obj?.value ?: 0L).toString(), (propertyid?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), usestrictrules.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetPrototype((obj?.value ?: 0L).toString(), (prototypeobject?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetRuntimeBeforeCollectCallback((runtime?.value ?: 0L).toString(), (callbackstate?.value ?: 0L).toString(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetRuntimeMemoryAllocationCallback((runtime?.value ?: 0L).toString(), (callbackstate?.value ?: 0L).toString(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: ULong): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsSetRuntimeMemoryLimit((runtime?.value ?: 0L).toString(), memorylimit.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsStopProfiling(reason) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStrictEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsStrictEquals((object1?.value ?: 0L).toString(), (object2?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStringToPointer(value: COpaquePointer?, stringvalue: COpaquePointer?, stringlength: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsStringToPointer((value?.value ?: 0L).toString(), (stringvalue?.value ?: 0L).toString(), (stringlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsValueToVariant(obj: COpaquePointer?, variant: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsValueToVariant((obj?.value ?: 0L).toString(), (variant?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsVariantToValue(variant: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_jsVariantToValue((variant?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
