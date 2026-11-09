@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32SystemJsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun JsAddRef(ref: Long, count: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsAddRef(ref.toString(), count.toString()) as Int).toUInt() else 0u

public actual fun JsBoolToBoolean(value: UByte, booleanvalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsBoolToBoolean(value.toInt(), booleanvalue.toString()) as Int).toUInt() else 0u

public actual fun JsBooleanToBool(value: Long, boolvalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsBooleanToBool(value.toString(), boolvalue.toString()) as Int).toUInt() else 0u

public actual fun JsCallFunction(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCallFunction(function.toString(), arguments.toString(), argumentcount.toInt(), result.toString()) as Int).toUInt() else 0u

public actual fun JsCollectGarbage(runtime: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCollectGarbage(runtime.toString()) as Int).toUInt() else 0u

public actual fun JsConstructObject(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsConstructObject(function.toString(), arguments.toString(), argumentcount.toInt(), result.toString()) as Int).toUInt() else 0u

public actual fun JsConvertValueToBoolean(value: Long, booleanvalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsConvertValueToBoolean(value.toString(), booleanvalue.toString()) as Int).toUInt() else 0u

public actual fun JsConvertValueToNumber(value: Long, numbervalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsConvertValueToNumber(value.toString(), numbervalue.toString()) as Int).toUInt() else 0u

public actual fun JsConvertValueToObject(value: Long, obj: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsConvertValueToObject(value.toString(), obj.toString()) as Int).toUInt() else 0u

public actual fun JsConvertValueToString(value: Long, stringvalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsConvertValueToString(value.toString(), stringvalue.toString()) as Int).toUInt() else 0u

public actual fun JsCreateArray(length: UInt, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateArray(length.toInt(), result.toString()) as Int).toUInt() else 0u

public actual fun JsCreateError(message: Long, error: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateError(message.toString(), error.toString()) as Int).toUInt() else 0u

public actual fun JsCreateExternalObject(data: Long, finalizecallback: JsFinalizeCallback, obj: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateExternalObject(data.toString(), finalizecallback.toLong().toString(), obj.toString()) as Int).toUInt() else 0u

public actual fun JsCreateFunction(nativefunction: JsNativeFunction, callbackstate: Long, function: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateFunction(nativefunction.toLong().toString(), callbackstate.toString(), function.toString()) as Int).toUInt() else 0u

public actual fun JsCreateObject(obj: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateObject(obj.toString()) as Int).toUInt() else 0u

public actual fun JsCreateRangeError(message: Long, error: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateRangeError(message.toString(), error.toString()) as Int).toUInt() else 0u

public actual fun JsCreateReferenceError(message: Long, error: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateReferenceError(message.toString(), error.toString()) as Int).toUInt() else 0u

public actual fun JsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateRuntime(attributes, runtimeversion, threadservice.toLong().toString(), runtime.toString()) as Int).toUInt() else 0u

public actual fun JsCreateSyntaxError(message: Long, error: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateSyntaxError(message.toString(), error.toString()) as Int).toUInt() else 0u

public actual fun JsCreateTypeError(message: Long, error: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateTypeError(message.toString(), error.toString()) as Int).toUInt() else 0u

public actual fun JsCreateURIError(message: Long, error: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsCreateURIError(message.toString(), error.toString()) as Int).toUInt() else 0u

public actual fun JsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsDefineProperty(obj.toString(), propertyid.toString(), propertydescriptor.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsDeleteIndexedProperty(obj: Long, index: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsDeleteIndexedProperty(obj.toString(), index.toString()) as Int).toUInt() else 0u

public actual fun JsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: UByte, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsDeleteProperty(obj.toString(), propertyid.toString(), usestrictrules.toInt(), result.toString()) as Int).toUInt() else 0u

public actual fun JsDisableRuntimeExecution(runtime: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsDisableRuntimeExecution(runtime.toString()) as Int).toUInt() else 0u

public actual fun JsDisposeRuntime(runtime: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsDisposeRuntime(runtime.toString()) as Int).toUInt() else 0u

public actual fun JsDoubleToNumber(doublevalue: Double, value: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsDoubleToNumber(doublevalue, value.toString()) as Int).toUInt() else 0u

public actual fun JsEnableRuntimeExecution(runtime: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsEnableRuntimeExecution(runtime.toString()) as Int).toUInt() else 0u

public actual fun JsEquals(object1: Long, object2: Long, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsEquals(object1.toString(), object2.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsGetAndClearException(exception: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetAndClearException(exception.toString()) as Int).toUInt() else 0u

public actual fun JsGetCurrentContext(currentcontext: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetCurrentContext(currentcontext.toString()) as Int).toUInt() else 0u

public actual fun JsGetExtensionAllowed(obj: Long, value: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetExtensionAllowed(obj.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun JsGetExternalData(obj: Long, externaldata: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetExternalData(obj.toString(), externaldata.toString()) as Int).toUInt() else 0u

public actual fun JsGetFalseValue(falsevalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetFalseValue(falsevalue.toString()) as Int).toUInt() else 0u

public actual fun JsGetGlobalObject(globalobject: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetGlobalObject(globalobject.toString()) as Int).toUInt() else 0u

public actual fun JsGetIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetIndexedProperty(obj.toString(), index.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsGetNullValue(nullvalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetNullValue(nullvalue.toString()) as Int).toUInt() else 0u

public actual fun JsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetOwnPropertyDescriptor(obj.toString(), propertyid.toString(), propertydescriptor.toString()) as Int).toUInt() else 0u

public actual fun JsGetOwnPropertyNames(obj: Long, propertynames: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetOwnPropertyNames(obj.toString(), propertynames.toString()) as Int).toUInt() else 0u

public actual fun JsGetProperty(obj: Long, propertyid: Long, value: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetProperty(obj.toString(), propertyid.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun JsGetPropertyIdFromName(name: PCWSTR, propertyid: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetPropertyIdFromName(name.toString(), propertyid.toString()) as Int).toUInt() else 0u

public actual fun JsGetPropertyNameFromId(propertyid: Long, name: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetPropertyNameFromId(propertyid.toString(), name.toString()) as Int).toUInt() else 0u

public actual fun JsGetPrototype(obj: Long, prototypeobject: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetPrototype(obj.toString(), prototypeobject.toString()) as Int).toUInt() else 0u

public actual fun JsGetRuntime(context: Long, runtime: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetRuntime(context.toString(), runtime.toString()) as Int).toUInt() else 0u

public actual fun JsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetRuntimeMemoryLimit(runtime.toString(), memorylimit.toString()) as Int).toUInt() else 0u

public actual fun JsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetRuntimeMemoryUsage(runtime.toString(), memoryusage.toString()) as Int).toUInt() else 0u

public actual fun JsGetStringLength(stringvalue: Long, length: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetStringLength(stringvalue.toString(), length.toString()) as Int).toUInt() else 0u

public actual fun JsGetTrueValue(truevalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetTrueValue(truevalue.toString()) as Int).toUInt() else 0u

public actual fun JsGetUndefinedValue(undefinedvalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetUndefinedValue(undefinedvalue.toString()) as Int).toUInt() else 0u

public actual fun JsGetValueType(value: Long, type: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsGetValueType(value.toString(), type.toString()) as Int).toUInt() else 0u

public actual fun JsHasException(hasexception: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsHasException(hasexception.toString()) as Int).toUInt() else 0u

public actual fun JsHasExternalData(obj: Long, value: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsHasExternalData(obj.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun JsHasIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsHasIndexedProperty(obj.toString(), index.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsHasProperty(obj.toString(), propertyid.toString(), hasproperty.toString()) as Int).toUInt() else 0u

public actual fun JsIdle(nextidletick: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsIdle(nextidletick.toString()) as Int).toUInt() else 0u

public actual fun JsIntToNumber(intvalue: Int, value: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsIntToNumber(intvalue, value.toString()) as Int).toUInt() else 0u

public actual fun JsIsEnumeratingHeap(isenumeratingheap: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsIsEnumeratingHeap(isenumeratingheap.toString()) as Int).toUInt() else 0u

public actual fun JsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsIsRuntimeExecutionDisabled(runtime.toString(), isdisabled.toString()) as Int).toUInt() else 0u

public actual fun JsNumberToDouble(value: Long, doublevalue: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsNumberToDouble(value.toString(), doublevalue.toString()) as Int).toUInt() else 0u

public actual fun JsParseScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsParseScript(script.toString(), sourcecontext.toString(), sourceurl.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsParseSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsParseSerializedScript(script.toString(), buffer.toString(), sourcecontext.toString(), sourceurl.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsPointerToString(stringvalue: PCWSTR, stringlength: ULong, value: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsPointerToString(stringvalue.toString(), stringlength.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun JsPreventExtension(obj: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsPreventExtension(obj.toString()) as Int).toUInt() else 0u

public actual fun JsRelease(ref: Long, count: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsRelease(ref.toString(), count.toString()) as Int).toUInt() else 0u

public actual fun JsRunScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsRunScript(script.toString(), sourcecontext.toString(), sourceurl.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsRunSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsRunSerializedScript(script.toString(), buffer.toString(), sourcecontext.toString(), sourceurl.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsSerializeScript(script: PCWSTR, buffer: Long, buffersize: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSerializeScript(script.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun JsSetCurrentContext(context: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetCurrentContext(context.toString()) as Int).toUInt() else 0u

public actual fun JsSetException(exception: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetException(exception.toString()) as Int).toUInt() else 0u

public actual fun JsSetExternalData(obj: Long, externaldata: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetExternalData(obj.toString(), externaldata.toString()) as Int).toUInt() else 0u

public actual fun JsSetIndexedProperty(obj: Long, index: Long, value: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetIndexedProperty(obj.toString(), index.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun JsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: UByte): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetProperty(obj.toString(), propertyid.toString(), value.toString(), usestrictrules.toInt()) as Int).toUInt() else 0u

public actual fun JsSetPrototype(obj: Long, prototypeobject: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetPrototype(obj.toString(), prototypeobject.toString()) as Int).toUInt() else 0u

public actual fun JsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetRuntimeBeforeCollectCallback(runtime.toString(), callbackstate.toString(), beforecollectcallback.toLong().toString()) as Int).toUInt() else 0u

public actual fun JsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetRuntimeMemoryAllocationCallback(runtime.toString(), callbackstate.toString(), allocationcallback.toLong().toString()) as Int).toUInt() else 0u

public actual fun JsSetRuntimeMemoryLimit(runtime: Long, memorylimit: ULong): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsSetRuntimeMemoryLimit(runtime.toString(), memorylimit.toString()) as Int).toUInt() else 0u

public actual fun JsStopProfiling(reason: HRESULT): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsStopProfiling(reason) as Int).toUInt() else 0u

public actual fun JsStrictEquals(object1: Long, object2: Long, result: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsStrictEquals(object1.toString(), object2.toString(), result.toString()) as Int).toUInt() else 0u

public actual fun JsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsStringToPointer(value.toString(), stringvalue.toString(), stringlength.toString()) as Int).toUInt() else 0u

public actual fun JsValueToVariant(obj: Long, variant: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsValueToVariant(obj.toString(), variant.toString()) as Int).toUInt() else 0u

public actual fun JsVariantToValue(variant: Long, value: Long): JsErrorCode =
    if (_windowsWin32SystemJsNapiAddon != null) (_windowsWin32SystemJsNapiAddon.windowssys_windows_win32_system_js_JsVariantToValue(variant.toString(), value.toString()) as Int).toUInt() else 0u
