package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(data: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(callee: Long, isconstructcall: Boolean, arguments: Long, argumentcount: UShort, callbackstate: Long): Long
}

public fun interface FnCallback2 {
    public operator fun invoke(callback: JsBackgroundWorkItemCallback, callbackstate: Long): Boolean
}

public fun interface FnCallback3 {
    public operator fun invoke(callbackstate: Long, allocationevent: JsMemoryEventType, allocationsize: ULong): Boolean
}

public fun JsAddRef(ref: Long, count: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsAddRef", longArrayOf(ref, count)).toUInt()
}

public fun JsBoolToBoolean(value: UByte, booleanvalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsBoolToBoolean", longArrayOf(value.toLong(), booleanvalue)).toUInt()
}

public fun JsBooleanToBool(value: Long, boolvalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsBooleanToBool", longArrayOf(value, boolvalue)).toUInt()
}

public fun JsCallFunction(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCallFunction", longArrayOf(function, arguments, argumentcount.toLong(), result)).toUInt()
}

public fun JsCollectGarbage(runtime: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCollectGarbage", longArrayOf(runtime)).toUInt()
}

public fun JsConstructObject(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsConstructObject", longArrayOf(function, arguments, argumentcount.toLong(), result)).toUInt()
}

public fun JsConvertValueToBoolean(value: Long, booleanvalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsConvertValueToBoolean", longArrayOf(value, booleanvalue)).toUInt()
}

public fun JsConvertValueToNumber(value: Long, numbervalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsConvertValueToNumber", longArrayOf(value, numbervalue)).toUInt()
}

public fun JsConvertValueToObject(value: Long, obj: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsConvertValueToObject", longArrayOf(value, obj)).toUInt()
}

public fun JsConvertValueToString(value: Long, stringvalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsConvertValueToString", longArrayOf(value, stringvalue)).toUInt()
}

public fun JsCreateArray(length: UInt, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateArray", longArrayOf(length.toLong(), result)).toUInt()
}

public fun JsCreateError(message: Long, error: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateError", longArrayOf(message, error)).toUInt()
}

public fun JsCreateExternalObject(data: Long, finalizecallback: JsFinalizeCallback, obj: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateExternalObject", longArrayOf(data, Win32DynamicFfi.objectSlot(finalizecallback), obj)).toUInt()
}

public fun JsCreateFunction(nativefunction: JsNativeFunction, callbackstate: Long, function: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateFunction", longArrayOf(Win32DynamicFfi.objectSlot(nativefunction), callbackstate, function)).toUInt()
}

public fun JsCreateObject(obj: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateObject", longArrayOf(obj)).toUInt()
}

public fun JsCreateRangeError(message: Long, error: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateRangeError", longArrayOf(message, error)).toUInt()
}

public fun JsCreateReferenceError(message: Long, error: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateReferenceError", longArrayOf(message, error)).toUInt()
}

public fun JsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateRuntime", longArrayOf(attributes.toLong(), runtimeversion.toLong(), Win32DynamicFfi.objectSlot(threadservice), runtime)).toUInt()
}

public fun JsCreateSyntaxError(message: Long, error: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateSyntaxError", longArrayOf(message, error)).toUInt()
}

public fun JsCreateTypeError(message: Long, error: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateTypeError", longArrayOf(message, error)).toUInt()
}

public fun JsCreateURIError(message: Long, error: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsCreateURIError", longArrayOf(message, error)).toUInt()
}

public fun JsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsDefineProperty", longArrayOf(obj, propertyid, propertydescriptor, result)).toUInt()
}

public fun JsDeleteIndexedProperty(obj: Long, index: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsDeleteIndexedProperty", longArrayOf(obj, index)).toUInt()
}

public fun JsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: UByte, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsDeleteProperty", longArrayOf(obj, propertyid, usestrictrules.toLong(), result)).toUInt()
}

public fun JsDisableRuntimeExecution(runtime: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsDisableRuntimeExecution", longArrayOf(runtime)).toUInt()
}

public fun JsDisposeRuntime(runtime: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsDisposeRuntime", longArrayOf(runtime)).toUInt()
}

public fun JsDoubleToNumber(doublevalue: Double, value: Long): JsErrorCode {
    return Win32DynamicFfi.invokeFp("chakra.dll", "JsDoubleToNumber", 2, false, longArrayOf(doublevalue.toRawBits(), value)).toLong().toUInt()
}

public fun JsEnableRuntimeExecution(runtime: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsEnableRuntimeExecution", longArrayOf(runtime)).toUInt()
}

public fun JsEquals(object1: Long, object2: Long, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsEquals", longArrayOf(object1, object2, result)).toUInt()
}

public fun JsGetAndClearException(exception: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetAndClearException", longArrayOf(exception)).toUInt()
}

public fun JsGetCurrentContext(currentcontext: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetCurrentContext", longArrayOf(currentcontext)).toUInt()
}

public fun JsGetExtensionAllowed(obj: Long, value: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetExtensionAllowed", longArrayOf(obj, value)).toUInt()
}

public fun JsGetExternalData(obj: Long, externaldata: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetExternalData", longArrayOf(obj, externaldata)).toUInt()
}

public fun JsGetFalseValue(falsevalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetFalseValue", longArrayOf(falsevalue)).toUInt()
}

public fun JsGetGlobalObject(globalobject: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetGlobalObject", longArrayOf(globalobject)).toUInt()
}

public fun JsGetIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetIndexedProperty", longArrayOf(obj, index, result)).toUInt()
}

public fun JsGetNullValue(nullvalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetNullValue", longArrayOf(nullvalue)).toUInt()
}

public fun JsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetOwnPropertyDescriptor", longArrayOf(obj, propertyid, propertydescriptor)).toUInt()
}

public fun JsGetOwnPropertyNames(obj: Long, propertynames: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetOwnPropertyNames", longArrayOf(obj, propertynames)).toUInt()
}

public fun JsGetProperty(obj: Long, propertyid: Long, value: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetProperty", longArrayOf(obj, propertyid, value)).toUInt()
}

public fun JsGetPropertyIdFromName(name: PCWSTR, propertyid: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetPropertyIdFromName", longArrayOf(name, propertyid)).toUInt()
}

public fun JsGetPropertyNameFromId(propertyid: Long, name: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetPropertyNameFromId", longArrayOf(propertyid, name)).toUInt()
}

public fun JsGetPrototype(obj: Long, prototypeobject: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetPrototype", longArrayOf(obj, prototypeobject)).toUInt()
}

public fun JsGetRuntime(context: Long, runtime: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetRuntime", longArrayOf(context, runtime)).toUInt()
}

public fun JsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetRuntimeMemoryLimit", longArrayOf(runtime, memorylimit)).toUInt()
}

public fun JsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetRuntimeMemoryUsage", longArrayOf(runtime, memoryusage)).toUInt()
}

public fun JsGetStringLength(stringvalue: Long, length: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetStringLength", longArrayOf(stringvalue, length)).toUInt()
}

public fun JsGetTrueValue(truevalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetTrueValue", longArrayOf(truevalue)).toUInt()
}

public fun JsGetUndefinedValue(undefinedvalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetUndefinedValue", longArrayOf(undefinedvalue)).toUInt()
}

public fun JsGetValueType(value: Long, type: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsGetValueType", longArrayOf(value, type)).toUInt()
}

public fun JsHasException(hasexception: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsHasException", longArrayOf(hasexception)).toUInt()
}

public fun JsHasExternalData(obj: Long, value: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsHasExternalData", longArrayOf(obj, value)).toUInt()
}

public fun JsHasIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsHasIndexedProperty", longArrayOf(obj, index, result)).toUInt()
}

public fun JsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsHasProperty", longArrayOf(obj, propertyid, hasproperty)).toUInt()
}

public fun JsIdle(nextidletick: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsIdle", longArrayOf(nextidletick)).toUInt()
}

public fun JsIntToNumber(intvalue: Int, value: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsIntToNumber", longArrayOf(intvalue.toLong(), value)).toUInt()
}

public fun JsIsEnumeratingHeap(isenumeratingheap: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsIsEnumeratingHeap", longArrayOf(isenumeratingheap)).toUInt()
}

public fun JsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsIsRuntimeExecutionDisabled", longArrayOf(runtime, isdisabled)).toUInt()
}

public fun JsNumberToDouble(value: Long, doublevalue: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsNumberToDouble", longArrayOf(value, doublevalue)).toUInt()
}

public fun JsParseScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsParseScript", longArrayOf(script, sourcecontext.toLong(), sourceurl, result)).toUInt()
}

public fun JsParseSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsParseSerializedScript", longArrayOf(script, buffer, sourcecontext.toLong(), sourceurl, result)).toUInt()
}

public fun JsPointerToString(stringvalue: PCWSTR, stringlength: ULong, value: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsPointerToString", longArrayOf(stringvalue, stringlength.toLong(), value)).toUInt()
}

public fun JsPreventExtension(obj: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsPreventExtension", longArrayOf(obj)).toUInt()
}

public fun JsRelease(ref: Long, count: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsRelease", longArrayOf(ref, count)).toUInt()
}

public fun JsRunScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsRunScript", longArrayOf(script, sourcecontext.toLong(), sourceurl, result)).toUInt()
}

public fun JsRunSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsRunSerializedScript", longArrayOf(script, buffer, sourcecontext.toLong(), sourceurl, result)).toUInt()
}

public fun JsSerializeScript(script: PCWSTR, buffer: Long, buffersize: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSerializeScript", longArrayOf(script, buffer, buffersize)).toUInt()
}

public fun JsSetCurrentContext(context: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetCurrentContext", longArrayOf(context)).toUInt()
}

public fun JsSetException(exception: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetException", longArrayOf(exception)).toUInt()
}

public fun JsSetExternalData(obj: Long, externaldata: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetExternalData", longArrayOf(obj, externaldata)).toUInt()
}

public fun JsSetIndexedProperty(obj: Long, index: Long, value: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetIndexedProperty", longArrayOf(obj, index, value)).toUInt()
}

public fun JsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: UByte): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetProperty", longArrayOf(obj, propertyid, value, usestrictrules.toLong())).toUInt()
}

public fun JsSetPrototype(obj: Long, prototypeobject: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetPrototype", longArrayOf(obj, prototypeobject)).toUInt()
}

public fun JsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetRuntimeBeforeCollectCallback", longArrayOf(runtime, callbackstate, Win32DynamicFfi.objectSlot(beforecollectcallback))).toUInt()
}

public fun JsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: JsMemoryAllocationCallback): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetRuntimeMemoryAllocationCallback", longArrayOf(runtime, callbackstate, Win32DynamicFfi.objectSlot(allocationcallback))).toUInt()
}

public fun JsSetRuntimeMemoryLimit(runtime: Long, memorylimit: ULong): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsSetRuntimeMemoryLimit", longArrayOf(runtime, memorylimit.toLong())).toUInt()
}

public fun JsStopProfiling(reason: HRESULT): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsStopProfiling", longArrayOf(reason.toLong())).toUInt()
}

public fun JsStrictEquals(object1: Long, object2: Long, result: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsStrictEquals", longArrayOf(object1, object2, result)).toUInt()
}

public fun JsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsStringToPointer", longArrayOf(value, stringvalue, stringlength)).toUInt()
}

public fun JsValueToVariant(obj: Long, variant: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsValueToVariant", longArrayOf(obj, variant)).toUInt()
}

public fun JsVariantToValue(variant: Long, value: Long): JsErrorCode {
    return Win32DynamicFfi.invoke("chakra.dll", "JsVariantToValue", longArrayOf(variant, value)).toUInt()
}
