@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32SystemJsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun jsAddRef(ref: ConstPtr, count: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsAddRef(ref.rawAddress.toString(), count.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsBoolToBoolean(value.toInt(), booleanvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsBooleanToBool(value: ConstPtr, boolvalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsBooleanToBool(value.rawAddress.toString(), boolvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCallFunction(function: ConstPtr, arguments: ConstPtr, argumentcount: UShort, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCallFunction(function.rawAddress.toString(), arguments.rawAddress.toString(), argumentcount.toInt(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCollectGarbage(runtime: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCollectGarbage(runtime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConstructObject(function: ConstPtr, arguments: ConstPtr, argumentcount: UShort, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsConstructObject(function.rawAddress.toString(), arguments.rawAddress.toString(), argumentcount.toInt(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToBoolean(value: ConstPtr, booleanvalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsConvertValueToBoolean(value.rawAddress.toString(), booleanvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToNumber(value: ConstPtr, numbervalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsConvertValueToNumber(value.rawAddress.toString(), numbervalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToObject(value: ConstPtr, obj: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsConvertValueToObject(value.rawAddress.toString(), obj.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsConvertValueToString(value: ConstPtr, stringvalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsConvertValueToString(value.rawAddress.toString(), stringvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateArray(length: UInt, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateArray(length.toInt(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateError(message: ConstPtr, error: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateError(message.rawAddress.toString(), error.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateExternalObject(data: ConstPtr, finalizecallback: JsFinalizeCallback, obj: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateExternalObject(data.rawAddress.toString(), 0L.toString(), obj.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: ConstPtr, function: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateFunction(0L.toString(), callbackstate.rawAddress.toString(), function.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateObject(obj: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateObject(obj.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateRangeError(message: ConstPtr, error: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateRangeError(message.rawAddress.toString(), error.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateReferenceError(message: ConstPtr, error: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateReferenceError(message.rawAddress.toString(), error.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateRuntime(attributes, runtimeversion, 0L.toString(), runtime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateSyntaxError(message: ConstPtr, error: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateSyntaxError(message.rawAddress.toString(), error.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateTypeError(message: ConstPtr, error: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateTypeError(message.rawAddress.toString(), error.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsCreateURIError(message: ConstPtr, error: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsCreateURIError(message.rawAddress.toString(), error.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDefineProperty(obj: ConstPtr, propertyid: ConstPtr, propertydescriptor: ConstPtr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsDefineProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), propertydescriptor.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDeleteIndexedProperty(obj: ConstPtr, index: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsDeleteIndexedProperty(obj.rawAddress.toString(), index.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDeleteProperty(obj: ConstPtr, propertyid: ConstPtr, usestrictrules: UByte, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsDeleteProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), usestrictrules.toInt(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDisableRuntimeExecution(runtime: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsDisableRuntimeExecution(runtime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDisposeRuntime(runtime: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsDisposeRuntime(runtime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsDoubleToNumber(doublevalue: Double, value: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsDoubleToNumber(doublevalue, value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsEnableRuntimeExecution(runtime: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsEnableRuntimeExecution(runtime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsEquals(object1: ConstPtr, object2: ConstPtr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsEquals(object1.rawAddress.toString(), object2.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetAndClearException(exception: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetAndClearException(exception.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetCurrentContext(currentcontext: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetCurrentContext(currentcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetExtensionAllowed(obj: ConstPtr, value: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetExtensionAllowed(obj.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetExternalData(obj: ConstPtr, externaldata: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetExternalData(obj.rawAddress.toString(), externaldata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetFalseValue(falsevalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetFalseValue(falsevalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetGlobalObject(globalobject: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetGlobalObject(globalobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetIndexedProperty(obj: ConstPtr, index: ConstPtr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetIndexedProperty(obj.rawAddress.toString(), index.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetNullValue(nullvalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetNullValue(nullvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetOwnPropertyDescriptor(obj: ConstPtr, propertyid: ConstPtr, propertydescriptor: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(obj.rawAddress.toString(), propertyid.rawAddress.toString(), propertydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetOwnPropertyNames(obj: ConstPtr, propertynames: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetOwnPropertyNames(obj.rawAddress.toString(), propertynames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetProperty(obj: ConstPtr, propertyid: ConstPtr, value: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetPropertyIdFromName(name.rawAddress.toString(), propertyid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPropertyNameFromId(propertyid: ConstPtr, name: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetPropertyNameFromId(propertyid.rawAddress.toString(), name.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetPrototype(obj: ConstPtr, prototypeobject: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetPrototype(obj.rawAddress.toString(), prototypeobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntime(context: ConstPtr, runtime: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetRuntime(context.rawAddress.toString(), runtime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntimeMemoryLimit(runtime: ConstPtr, memorylimit: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(runtime.rawAddress.toString(), memorylimit.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetRuntimeMemoryUsage(runtime: ConstPtr, memoryusage: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(runtime.rawAddress.toString(), memoryusage.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetStringLength(stringvalue: ConstPtr, length: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetStringLength(stringvalue.rawAddress.toString(), length.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetTrueValue(truevalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetTrueValue(truevalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetUndefinedValue(undefinedvalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetUndefinedValue(undefinedvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsGetValueType(value: ConstPtr, type: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsGetValueType(value.rawAddress.toString(), type.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasException(hasexception: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsHasException(hasexception.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasExternalData(obj: ConstPtr, value: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsHasExternalData(obj.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasIndexedProperty(obj: ConstPtr, index: ConstPtr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsHasIndexedProperty(obj.rawAddress.toString(), index.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsHasProperty(obj: ConstPtr, propertyid: ConstPtr, hasproperty: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsHasProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), hasproperty.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIdle(nextidletick: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsIdle(nextidletick.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIntToNumber(intvalue: Int, value: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsIntToNumber(intvalue, value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIsEnumeratingHeap(isenumeratingheap: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsIsEnumeratingHeap(isenumeratingheap.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsIsRuntimeExecutionDisabled(runtime: ConstPtr, isdisabled: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(runtime.rawAddress.toString(), isdisabled.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsNumberToDouble(value: ConstPtr, doublevalue: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsNumberToDouble(value.rawAddress.toString(), doublevalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsParseScript(script.rawAddress.toString(), sourcecontext.toString(), sourceurl.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: ConstPtr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsParseSerializedScript(script.rawAddress.toString(), buffer.rawAddress.toString(), sourcecontext.toString(), sourceurl.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsPointerToString(stringvalue.rawAddress.toString(), stringlength.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsPreventExtension(obj: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsPreventExtension(obj.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRelease(ref: ConstPtr, count: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsRelease(ref.rawAddress.toString(), count.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsRunScript(script.rawAddress.toString(), sourcecontext.toString(), sourceurl.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: ConstPtr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsRunSerializedScript(script.rawAddress.toString(), buffer.rawAddress.toString(), sourcecontext.toString(), sourceurl.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSerializeScript(script: Pcwstr, buffer: MutPtr, buffersize: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSerializeScript(script.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetCurrentContext(context: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetCurrentContext(context.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetException(exception: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetException(exception.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetExternalData(obj: ConstPtr, externaldata: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetExternalData(obj.rawAddress.toString(), externaldata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetIndexedProperty(obj: ConstPtr, index: ConstPtr, value: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetIndexedProperty(obj.rawAddress.toString(), index.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetProperty(obj: ConstPtr, propertyid: ConstPtr, value: ConstPtr, usestrictrules: UByte): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetProperty(obj.rawAddress.toString(), propertyid.rawAddress.toString(), value.rawAddress.toString(), usestrictrules.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetPrototype(obj: ConstPtr, prototypeobject: ConstPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetPrototype(obj.rawAddress.toString(), prototypeobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: ConstPtr, callbackstate: ConstPtr, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(runtime.rawAddress.toString(), callbackstate.rawAddress.toString(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: ConstPtr, callbackstate: ConstPtr, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(runtime.rawAddress.toString(), callbackstate.rawAddress.toString(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsSetRuntimeMemoryLimit(runtime: ConstPtr, memorylimit: ULong): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(runtime.rawAddress.toString(), memorylimit.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsStopProfiling(reason) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStrictEquals(object1: ConstPtr, object2: ConstPtr, result: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsStrictEquals(object1.rawAddress.toString(), object2.rawAddress.toString(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsStringToPointer(value: ConstPtr, stringvalue: MutPtr, stringlength: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsStringToPointer(value.rawAddress.toString(), stringvalue.rawAddress.toString(), stringlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsValueToVariant(obj: ConstPtr, variant: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsValueToVariant(obj.rawAddress.toString(), variant.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jsVariantToValue(variant: ConstPtr, value: MutPtr): JsErrorCode =
    if (windowsWin32SystemJsNapiAddon != null) (windowsWin32SystemJsNapiAddon.windowssysWindowsWin32SystemJsJsVariantToValue(variant.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
