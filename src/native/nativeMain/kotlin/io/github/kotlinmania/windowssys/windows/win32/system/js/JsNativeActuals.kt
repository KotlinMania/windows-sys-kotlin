@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun jsAddRef(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsAddRef(ref?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsBoolToBoolean(value, booleanvalue?.value?.toCPointer<ByteVar>())

public actual fun jsBooleanToBool(value: COpaquePointer?, boolvalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsBooleanToBool(value?.value?.toCPointer<ByteVar>(), boolvalue?.value?.toCPointer<ByteVar>())

public actual fun jsCallFunction(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCallFunction(function?.value?.toCPointer<ByteVar>(), arguments?.value?.toCPointer<ByteVar>(), argumentcount, result?.value?.toCPointer<ByteVar>())

public actual fun jsCollectGarbage(runtime: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCollectGarbage(runtime?.value?.toCPointer<ByteVar>())

public actual fun jsConstructObject(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsConstructObject(function?.value?.toCPointer<ByteVar>(), arguments?.value?.toCPointer<ByteVar>(), argumentcount, result?.value?.toCPointer<ByteVar>())

public actual fun jsConvertValueToBoolean(value: COpaquePointer?, booleanvalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsConvertValueToBoolean(value?.value?.toCPointer<ByteVar>(), booleanvalue?.value?.toCPointer<ByteVar>())

public actual fun jsConvertValueToNumber(value: COpaquePointer?, numbervalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsConvertValueToNumber(value?.value?.toCPointer<ByteVar>(), numbervalue?.value?.toCPointer<ByteVar>())

public actual fun jsConvertValueToObject(value: COpaquePointer?, obj: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsConvertValueToObject(value?.value?.toCPointer<ByteVar>(), obj?.value?.toCPointer<ByteVar>())

public actual fun jsConvertValueToString(value: COpaquePointer?, stringvalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsConvertValueToString(value?.value?.toCPointer<ByteVar>(), stringvalue?.value?.toCPointer<ByteVar>())

public actual fun jsCreateArray(length: UInt, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateArray(length, result?.value?.toCPointer<ByteVar>())

public actual fun jsCreateError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateError(message?.value?.toCPointer<ByteVar>(), error?.value?.toCPointer<ByteVar>())

public actual fun jsCreateExternalObject(data: COpaquePointer?, finalizecallback: JsFinalizeCallback, obj: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateExternalObject(data?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), obj?.value?.toCPointer<ByteVar>())

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: COpaquePointer?, function: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateFunction(0L.toCPointer<ByteVar>(), callbackstate?.value?.toCPointer<ByteVar>(), function?.value?.toCPointer<ByteVar>())

public actual fun jsCreateObject(obj: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateObject(obj?.value?.toCPointer<ByteVar>())

public actual fun jsCreateRangeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateRangeError(message?.value?.toCPointer<ByteVar>(), error?.value?.toCPointer<ByteVar>())

public actual fun jsCreateReferenceError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateReferenceError(message?.value?.toCPointer<ByteVar>(), error?.value?.toCPointer<ByteVar>())

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateRuntime(attributes, runtimeversion, 0L.toCPointer<ByteVar>(), runtime?.value?.toCPointer<ByteVar>())

public actual fun jsCreateSyntaxError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateSyntaxError(message?.value?.toCPointer<ByteVar>(), error?.value?.toCPointer<ByteVar>())

public actual fun jsCreateTypeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateTypeError(message?.value?.toCPointer<ByteVar>(), error?.value?.toCPointer<ByteVar>())

public actual fun jsCreateURIError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsCreateURIError(message?.value?.toCPointer<ByteVar>(), error?.value?.toCPointer<ByteVar>())

public actual fun jsDefineProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsDefineProperty(obj?.value?.toCPointer<ByteVar>(), propertyid?.value?.toCPointer<ByteVar>(), propertydescriptor?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsDeleteIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsDeleteIndexedProperty(obj?.value?.toCPointer<ByteVar>(), index?.value?.toCPointer<ByteVar>())

public actual fun jsDeleteProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, usestrictrules: UByte, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsDeleteProperty(obj?.value?.toCPointer<ByteVar>(), propertyid?.value?.toCPointer<ByteVar>(), usestrictrules, result?.value?.toCPointer<ByteVar>())

public actual fun jsDisableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsDisableRuntimeExecution(runtime?.value?.toCPointer<ByteVar>())

public actual fun jsDisposeRuntime(runtime: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsDisposeRuntime(runtime?.value?.toCPointer<ByteVar>())

public actual fun jsDoubleToNumber(doublevalue: Double, value: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsDoubleToNumber(doublevalue, value?.value?.toCPointer<ByteVar>())

public actual fun jsEnableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsEnableRuntimeExecution(runtime?.value?.toCPointer<ByteVar>())

public actual fun jsEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsEquals(object1?.value?.toCPointer<ByteVar>(), object2?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsGetAndClearException(exception: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetAndClearException(exception?.value?.toCPointer<ByteVar>())

public actual fun jsGetCurrentContext(currentcontext: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetCurrentContext(currentcontext?.value?.toCPointer<ByteVar>())

public actual fun jsGetExtensionAllowed(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetExtensionAllowed(obj?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun jsGetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetExternalData(obj?.value?.toCPointer<ByteVar>(), externaldata?.value?.toCPointer<ByteVar>())

public actual fun jsGetFalseValue(falsevalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetFalseValue(falsevalue?.value?.toCPointer<ByteVar>())

public actual fun jsGetGlobalObject(globalobject: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetGlobalObject(globalobject?.value?.toCPointer<ByteVar>())

public actual fun jsGetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetIndexedProperty(obj?.value?.toCPointer<ByteVar>(), index?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsGetNullValue(nullvalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetNullValue(nullvalue?.value?.toCPointer<ByteVar>())

public actual fun jsGetOwnPropertyDescriptor(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetOwnPropertyDescriptor(obj?.value?.toCPointer<ByteVar>(), propertyid?.value?.toCPointer<ByteVar>(), propertydescriptor?.value?.toCPointer<ByteVar>())

public actual fun jsGetOwnPropertyNames(obj: COpaquePointer?, propertynames: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetOwnPropertyNames(obj?.value?.toCPointer<ByteVar>(), propertynames?.value?.toCPointer<ByteVar>())

public actual fun jsGetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetProperty(obj?.value?.toCPointer<ByteVar>(), propertyid?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetPropertyIdFromName(name?.value?.toCPointer<ByteVar>(), propertyid?.value?.toCPointer<ByteVar>())

public actual fun jsGetPropertyNameFromId(propertyid: COpaquePointer?, name: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetPropertyNameFromId(propertyid?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())

public actual fun jsGetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetPrototype(obj?.value?.toCPointer<ByteVar>(), prototypeobject?.value?.toCPointer<ByteVar>())

public actual fun jsGetRuntime(context: COpaquePointer?, runtime: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetRuntime(context?.value?.toCPointer<ByteVar>(), runtime?.value?.toCPointer<ByteVar>())

public actual fun jsGetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetRuntimeMemoryLimit(runtime?.value?.toCPointer<ByteVar>(), memorylimit?.value?.toCPointer<ByteVar>())

public actual fun jsGetRuntimeMemoryUsage(runtime: COpaquePointer?, memoryusage: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetRuntimeMemoryUsage(runtime?.value?.toCPointer<ByteVar>(), memoryusage?.value?.toCPointer<ByteVar>())

public actual fun jsGetStringLength(stringvalue: COpaquePointer?, length: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetStringLength(stringvalue?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>())

public actual fun jsGetTrueValue(truevalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetTrueValue(truevalue?.value?.toCPointer<ByteVar>())

public actual fun jsGetUndefinedValue(undefinedvalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetUndefinedValue(undefinedvalue?.value?.toCPointer<ByteVar>())

public actual fun jsGetValueType(value: COpaquePointer?, type: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsGetValueType(value?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>())

public actual fun jsHasException(hasexception: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsHasException(hasexception?.value?.toCPointer<ByteVar>())

public actual fun jsHasExternalData(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsHasExternalData(obj?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun jsHasIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsHasIndexedProperty(obj?.value?.toCPointer<ByteVar>(), index?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsHasProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, hasproperty: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsHasProperty(obj?.value?.toCPointer<ByteVar>(), propertyid?.value?.toCPointer<ByteVar>(), hasproperty?.value?.toCPointer<ByteVar>())

public actual fun jsIdle(nextidletick: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsIdle(nextidletick?.value?.toCPointer<ByteVar>())

public actual fun jsIntToNumber(intvalue: Int, value: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsIntToNumber(intvalue, value?.value?.toCPointer<ByteVar>())

public actual fun jsIsEnumeratingHeap(isenumeratingheap: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsIsEnumeratingHeap(isenumeratingheap?.value?.toCPointer<ByteVar>())

public actual fun jsIsRuntimeExecutionDisabled(runtime: COpaquePointer?, isdisabled: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsIsRuntimeExecutionDisabled(runtime?.value?.toCPointer<ByteVar>(), isdisabled?.value?.toCPointer<ByteVar>())

public actual fun jsNumberToDouble(value: COpaquePointer?, doublevalue: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsNumberToDouble(value?.value?.toCPointer<ByteVar>(), doublevalue?.value?.toCPointer<ByteVar>())

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsParseScript(script?.value?.toCPointer<ByteVar>(), sourcecontext, sourceurl?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsParseSerializedScript(script?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), sourcecontext, sourceurl?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsPointerToString(stringvalue?.value?.toCPointer<ByteVar>(), stringlength, value?.value?.toCPointer<ByteVar>())

public actual fun jsPreventExtension(obj: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsPreventExtension(obj?.value?.toCPointer<ByteVar>())

public actual fun jsRelease(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsRelease(ref?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsRunScript(script?.value?.toCPointer<ByteVar>(), sourcecontext, sourceurl?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsRunSerializedScript(script?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), sourcecontext, sourceurl?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsSerializeScript(script: Pcwstr, buffer: COpaquePointer?, buffersize: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSerializeScript(script?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun jsSetCurrentContext(context: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetCurrentContext(context?.value?.toCPointer<ByteVar>())

public actual fun jsSetException(exception: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetException(exception?.value?.toCPointer<ByteVar>())

public actual fun jsSetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetExternalData(obj?.value?.toCPointer<ByteVar>(), externaldata?.value?.toCPointer<ByteVar>())

public actual fun jsSetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetIndexedProperty(obj?.value?.toCPointer<ByteVar>(), index?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun jsSetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?, usestrictrules: UByte): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetProperty(obj?.value?.toCPointer<ByteVar>(), propertyid?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), usestrictrules)

public actual fun jsSetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetPrototype(obj?.value?.toCPointer<ByteVar>(), prototypeobject?.value?.toCPointer<ByteVar>())

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetRuntimeBeforeCollectCallback(runtime?.value?.toCPointer<ByteVar>(), callbackstate?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetRuntimeMemoryAllocationCallback(runtime?.value?.toCPointer<ByteVar>(), callbackstate?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jsSetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: ULong): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsSetRuntimeMemoryLimit(runtime?.value?.toCPointer<ByteVar>(), memorylimit)

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsStopProfiling(reason)

public actual fun jsStrictEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsStrictEquals(object1?.value?.toCPointer<ByteVar>(), object2?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun jsStringToPointer(value: COpaquePointer?, stringvalue: COpaquePointer?, stringlength: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsStringToPointer(value?.value?.toCPointer<ByteVar>(), stringvalue?.value?.toCPointer<ByteVar>(), stringlength?.value?.toCPointer<ByteVar>())

public actual fun jsValueToVariant(obj: COpaquePointer?, variant: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsValueToVariant(obj?.value?.toCPointer<ByteVar>(), variant?.value?.toCPointer<ByteVar>())

public actual fun jsVariantToValue(variant: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_jsVariantToValue(variant?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())
