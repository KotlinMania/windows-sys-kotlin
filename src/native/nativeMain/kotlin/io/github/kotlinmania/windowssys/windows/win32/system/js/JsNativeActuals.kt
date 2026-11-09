@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun JsAddRef(ref: Long, count: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsAddRef(ref.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun JsBoolToBoolean(value: UByte, booleanvalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsBoolToBoolean(value, booleanvalue.toCPointer<ByteVar>())

public actual fun JsBooleanToBool(value: Long, boolvalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsBooleanToBool(value.toCPointer<ByteVar>(), boolvalue.toCPointer<ByteVar>())

public actual fun JsCallFunction(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCallFunction(function.toCPointer<ByteVar>(), arguments.toCPointer<ByteVar>(), argumentcount, result.toCPointer<ByteVar>())

public actual fun JsCollectGarbage(runtime: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCollectGarbage(runtime.toCPointer<ByteVar>())

public actual fun JsConstructObject(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsConstructObject(function.toCPointer<ByteVar>(), arguments.toCPointer<ByteVar>(), argumentcount, result.toCPointer<ByteVar>())

public actual fun JsConvertValueToBoolean(value: Long, booleanvalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsConvertValueToBoolean(value.toCPointer<ByteVar>(), booleanvalue.toCPointer<ByteVar>())

public actual fun JsConvertValueToNumber(value: Long, numbervalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsConvertValueToNumber(value.toCPointer<ByteVar>(), numbervalue.toCPointer<ByteVar>())

public actual fun JsConvertValueToObject(value: Long, obj: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsConvertValueToObject(value.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>())

public actual fun JsConvertValueToString(value: Long, stringvalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsConvertValueToString(value.toCPointer<ByteVar>(), stringvalue.toCPointer<ByteVar>())

public actual fun JsCreateArray(length: UInt, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateArray(length, result.toCPointer<ByteVar>())

public actual fun JsCreateError(message: Long, error: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateError(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun JsCreateExternalObject(data: Long, finalizecallback: JsFinalizeCallback, obj: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateExternalObject(data.toCPointer<ByteVar>(), finalizecallback.toLong().toCPointer<ByteVar>(), obj.toCPointer<ByteVar>())

public actual fun JsCreateFunction(nativefunction: JsNativeFunction, callbackstate: Long, function: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateFunction(nativefunction.toLong().toCPointer<ByteVar>(), callbackstate.toCPointer<ByteVar>(), function.toCPointer<ByteVar>())

public actual fun JsCreateObject(obj: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateObject(obj.toCPointer<ByteVar>())

public actual fun JsCreateRangeError(message: Long, error: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateRangeError(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun JsCreateReferenceError(message: Long, error: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateReferenceError(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun JsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateRuntime(attributes, runtimeversion, threadservice.toLong().toCPointer<ByteVar>(), runtime.toCPointer<ByteVar>())

public actual fun JsCreateSyntaxError(message: Long, error: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateSyntaxError(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun JsCreateTypeError(message: Long, error: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateTypeError(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun JsCreateURIError(message: Long, error: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsCreateURIError(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun JsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsDefineProperty(obj.toCPointer<ByteVar>(), propertyid.toCPointer<ByteVar>(), propertydescriptor.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsDeleteIndexedProperty(obj: Long, index: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsDeleteIndexedProperty(obj.toCPointer<ByteVar>(), index.toCPointer<ByteVar>())

public actual fun JsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: UByte, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsDeleteProperty(obj.toCPointer<ByteVar>(), propertyid.toCPointer<ByteVar>(), usestrictrules, result.toCPointer<ByteVar>())

public actual fun JsDisableRuntimeExecution(runtime: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsDisableRuntimeExecution(runtime.toCPointer<ByteVar>())

public actual fun JsDisposeRuntime(runtime: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsDisposeRuntime(runtime.toCPointer<ByteVar>())

public actual fun JsDoubleToNumber(doublevalue: Double, value: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsDoubleToNumber(doublevalue, value.toCPointer<ByteVar>())

public actual fun JsEnableRuntimeExecution(runtime: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsEnableRuntimeExecution(runtime.toCPointer<ByteVar>())

public actual fun JsEquals(object1: Long, object2: Long, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsEquals(object1.toCPointer<ByteVar>(), object2.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsGetAndClearException(exception: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetAndClearException(exception.toCPointer<ByteVar>())

public actual fun JsGetCurrentContext(currentcontext: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetCurrentContext(currentcontext.toCPointer<ByteVar>())

public actual fun JsGetExtensionAllowed(obj: Long, value: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetExtensionAllowed(obj.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun JsGetExternalData(obj: Long, externaldata: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetExternalData(obj.toCPointer<ByteVar>(), externaldata.toCPointer<ByteVar>())

public actual fun JsGetFalseValue(falsevalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetFalseValue(falsevalue.toCPointer<ByteVar>())

public actual fun JsGetGlobalObject(globalobject: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetGlobalObject(globalobject.toCPointer<ByteVar>())

public actual fun JsGetIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetIndexedProperty(obj.toCPointer<ByteVar>(), index.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsGetNullValue(nullvalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetNullValue(nullvalue.toCPointer<ByteVar>())

public actual fun JsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetOwnPropertyDescriptor(obj.toCPointer<ByteVar>(), propertyid.toCPointer<ByteVar>(), propertydescriptor.toCPointer<ByteVar>())

public actual fun JsGetOwnPropertyNames(obj: Long, propertynames: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetOwnPropertyNames(obj.toCPointer<ByteVar>(), propertynames.toCPointer<ByteVar>())

public actual fun JsGetProperty(obj: Long, propertyid: Long, value: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetProperty(obj.toCPointer<ByteVar>(), propertyid.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun JsGetPropertyIdFromName(name: PCWSTR, propertyid: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetPropertyIdFromName(name.toCPointer<ByteVar>(), propertyid.toCPointer<ByteVar>())

public actual fun JsGetPropertyNameFromId(propertyid: Long, name: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetPropertyNameFromId(propertyid.toCPointer<ByteVar>(), name.toCPointer<ByteVar>())

public actual fun JsGetPrototype(obj: Long, prototypeobject: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetPrototype(obj.toCPointer<ByteVar>(), prototypeobject.toCPointer<ByteVar>())

public actual fun JsGetRuntime(context: Long, runtime: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetRuntime(context.toCPointer<ByteVar>(), runtime.toCPointer<ByteVar>())

public actual fun JsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetRuntimeMemoryLimit(runtime.toCPointer<ByteVar>(), memorylimit.toCPointer<ByteVar>())

public actual fun JsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetRuntimeMemoryUsage(runtime.toCPointer<ByteVar>(), memoryusage.toCPointer<ByteVar>())

public actual fun JsGetStringLength(stringvalue: Long, length: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetStringLength(stringvalue.toCPointer<ByteVar>(), length.toCPointer<ByteVar>())

public actual fun JsGetTrueValue(truevalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetTrueValue(truevalue.toCPointer<ByteVar>())

public actual fun JsGetUndefinedValue(undefinedvalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetUndefinedValue(undefinedvalue.toCPointer<ByteVar>())

public actual fun JsGetValueType(value: Long, type: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsGetValueType(value.toCPointer<ByteVar>(), type.toCPointer<ByteVar>())

public actual fun JsHasException(hasexception: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsHasException(hasexception.toCPointer<ByteVar>())

public actual fun JsHasExternalData(obj: Long, value: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsHasExternalData(obj.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun JsHasIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsHasIndexedProperty(obj.toCPointer<ByteVar>(), index.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsHasProperty(obj.toCPointer<ByteVar>(), propertyid.toCPointer<ByteVar>(), hasproperty.toCPointer<ByteVar>())

public actual fun JsIdle(nextidletick: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsIdle(nextidletick.toCPointer<ByteVar>())

public actual fun JsIntToNumber(intvalue: Int, value: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsIntToNumber(intvalue, value.toCPointer<ByteVar>())

public actual fun JsIsEnumeratingHeap(isenumeratingheap: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsIsEnumeratingHeap(isenumeratingheap.toCPointer<ByteVar>())

public actual fun JsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsIsRuntimeExecutionDisabled(runtime.toCPointer<ByteVar>(), isdisabled.toCPointer<ByteVar>())

public actual fun JsNumberToDouble(value: Long, doublevalue: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsNumberToDouble(value.toCPointer<ByteVar>(), doublevalue.toCPointer<ByteVar>())

public actual fun JsParseScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsParseScript(script.toCPointer<ByteVar>(), sourcecontext, sourceurl.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsParseSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsParseSerializedScript(script.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), sourcecontext, sourceurl.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsPointerToString(stringvalue: PCWSTR, stringlength: ULong, value: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsPointerToString(stringvalue.toCPointer<ByteVar>(), stringlength, value.toCPointer<ByteVar>())

public actual fun JsPreventExtension(obj: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsPreventExtension(obj.toCPointer<ByteVar>())

public actual fun JsRelease(ref: Long, count: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsRelease(ref.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun JsRunScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsRunScript(script.toCPointer<ByteVar>(), sourcecontext, sourceurl.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsRunSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsRunSerializedScript(script.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), sourcecontext, sourceurl.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsSerializeScript(script: PCWSTR, buffer: Long, buffersize: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSerializeScript(script.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun JsSetCurrentContext(context: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetCurrentContext(context.toCPointer<ByteVar>())

public actual fun JsSetException(exception: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetException(exception.toCPointer<ByteVar>())

public actual fun JsSetExternalData(obj: Long, externaldata: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetExternalData(obj.toCPointer<ByteVar>(), externaldata.toCPointer<ByteVar>())

public actual fun JsSetIndexedProperty(obj: Long, index: Long, value: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetIndexedProperty(obj.toCPointer<ByteVar>(), index.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun JsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: UByte): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetProperty(obj.toCPointer<ByteVar>(), propertyid.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), usestrictrules)

public actual fun JsSetPrototype(obj: Long, prototypeobject: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetPrototype(obj.toCPointer<ByteVar>(), prototypeobject.toCPointer<ByteVar>())

public actual fun JsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetRuntimeBeforeCollectCallback(runtime.toCPointer<ByteVar>(), callbackstate.toCPointer<ByteVar>(), beforecollectcallback.toLong().toCPointer<ByteVar>())

public actual fun JsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetRuntimeMemoryAllocationCallback(runtime.toCPointer<ByteVar>(), callbackstate.toCPointer<ByteVar>(), allocationcallback.toLong().toCPointer<ByteVar>())

public actual fun JsSetRuntimeMemoryLimit(runtime: Long, memorylimit: ULong): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsSetRuntimeMemoryLimit(runtime.toCPointer<ByteVar>(), memorylimit)

public actual fun JsStopProfiling(reason: HRESULT): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsStopProfiling(reason)

public actual fun JsStrictEquals(object1: Long, object2: Long, result: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsStrictEquals(object1.toCPointer<ByteVar>(), object2.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun JsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsStringToPointer(value.toCPointer<ByteVar>(), stringvalue.toCPointer<ByteVar>(), stringlength.toCPointer<ByteVar>())

public actual fun JsValueToVariant(obj: Long, variant: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsValueToVariant(obj.toCPointer<ByteVar>(), variant.toCPointer<ByteVar>())

public actual fun JsVariantToValue(variant: Long, value: Long): JsErrorCode =
    io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssys_windows_win32_system_js_JsVariantToValue(variant.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())
