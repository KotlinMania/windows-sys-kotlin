@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun JsAddRef(ref: Long, count: Long): JsErrorCode =
    0u

public actual fun JsBoolToBoolean(value: UByte, booleanvalue: Long): JsErrorCode =
    0u

public actual fun JsBooleanToBool(value: Long, boolvalue: Long): JsErrorCode =
    0u

public actual fun JsCallFunction(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode =
    0u

public actual fun JsCollectGarbage(runtime: Long): JsErrorCode =
    0u

public actual fun JsConstructObject(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode =
    0u

public actual fun JsConvertValueToBoolean(value: Long, booleanvalue: Long): JsErrorCode =
    0u

public actual fun JsConvertValueToNumber(value: Long, numbervalue: Long): JsErrorCode =
    0u

public actual fun JsConvertValueToObject(value: Long, obj: Long): JsErrorCode =
    0u

public actual fun JsConvertValueToString(value: Long, stringvalue: Long): JsErrorCode =
    0u

public actual fun JsCreateArray(length: UInt, result: Long): JsErrorCode =
    0u

public actual fun JsCreateError(message: Long, error: Long): JsErrorCode =
    0u

public actual fun JsCreateExternalObject(data: Long, finalizecallback: JsFinalizeCallback, obj: Long): JsErrorCode =
    0u

public actual fun JsCreateFunction(nativefunction: JsNativeFunction, callbackstate: Long, function: Long): JsErrorCode =
    0u

public actual fun JsCreateObject(obj: Long): JsErrorCode =
    0u

public actual fun JsCreateRangeError(message: Long, error: Long): JsErrorCode =
    0u

public actual fun JsCreateReferenceError(message: Long, error: Long): JsErrorCode =
    0u

public actual fun JsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: Long): JsErrorCode =
    0u

public actual fun JsCreateSyntaxError(message: Long, error: Long): JsErrorCode =
    0u

public actual fun JsCreateTypeError(message: Long, error: Long): JsErrorCode =
    0u

public actual fun JsCreateURIError(message: Long, error: Long): JsErrorCode =
    0u

public actual fun JsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): JsErrorCode =
    0u

public actual fun JsDeleteIndexedProperty(obj: Long, index: Long): JsErrorCode =
    0u

public actual fun JsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: UByte, result: Long): JsErrorCode =
    0u

public actual fun JsDisableRuntimeExecution(runtime: Long): JsErrorCode =
    0u

public actual fun JsDisposeRuntime(runtime: Long): JsErrorCode =
    0u

public actual fun JsDoubleToNumber(doublevalue: Double, value: Long): JsErrorCode =
    0u

public actual fun JsEnableRuntimeExecution(runtime: Long): JsErrorCode =
    0u

public actual fun JsEquals(object1: Long, object2: Long, result: Long): JsErrorCode =
    0u

public actual fun JsGetAndClearException(exception: Long): JsErrorCode =
    0u

public actual fun JsGetCurrentContext(currentcontext: Long): JsErrorCode =
    0u

public actual fun JsGetExtensionAllowed(obj: Long, value: Long): JsErrorCode =
    0u

public actual fun JsGetExternalData(obj: Long, externaldata: Long): JsErrorCode =
    0u

public actual fun JsGetFalseValue(falsevalue: Long): JsErrorCode =
    0u

public actual fun JsGetGlobalObject(globalobject: Long): JsErrorCode =
    0u

public actual fun JsGetIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode =
    0u

public actual fun JsGetNullValue(nullvalue: Long): JsErrorCode =
    0u

public actual fun JsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): JsErrorCode =
    0u

public actual fun JsGetOwnPropertyNames(obj: Long, propertynames: Long): JsErrorCode =
    0u

public actual fun JsGetProperty(obj: Long, propertyid: Long, value: Long): JsErrorCode =
    0u

public actual fun JsGetPropertyIdFromName(name: PCWSTR, propertyid: Long): JsErrorCode =
    0u

public actual fun JsGetPropertyNameFromId(propertyid: Long, name: Long): JsErrorCode =
    0u

public actual fun JsGetPrototype(obj: Long, prototypeobject: Long): JsErrorCode =
    0u

public actual fun JsGetRuntime(context: Long, runtime: Long): JsErrorCode =
    0u

public actual fun JsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): JsErrorCode =
    0u

public actual fun JsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): JsErrorCode =
    0u

public actual fun JsGetStringLength(stringvalue: Long, length: Long): JsErrorCode =
    0u

public actual fun JsGetTrueValue(truevalue: Long): JsErrorCode =
    0u

public actual fun JsGetUndefinedValue(undefinedvalue: Long): JsErrorCode =
    0u

public actual fun JsGetValueType(value: Long, type: Long): JsErrorCode =
    0u

public actual fun JsHasException(hasexception: Long): JsErrorCode =
    0u

public actual fun JsHasExternalData(obj: Long, value: Long): JsErrorCode =
    0u

public actual fun JsHasIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode =
    0u

public actual fun JsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): JsErrorCode =
    0u

public actual fun JsIdle(nextidletick: Long): JsErrorCode =
    0u

public actual fun JsIntToNumber(intvalue: Int, value: Long): JsErrorCode =
    0u

public actual fun JsIsEnumeratingHeap(isenumeratingheap: Long): JsErrorCode =
    0u

public actual fun JsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): JsErrorCode =
    0u

public actual fun JsNumberToDouble(value: Long, doublevalue: Long): JsErrorCode =
    0u

public actual fun JsParseScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    0u

public actual fun JsParseSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    0u

public actual fun JsPointerToString(stringvalue: PCWSTR, stringlength: ULong, value: Long): JsErrorCode =
    0u

public actual fun JsPreventExtension(obj: Long): JsErrorCode =
    0u

public actual fun JsRelease(ref: Long, count: Long): JsErrorCode =
    0u

public actual fun JsRunScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    0u

public actual fun JsRunSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    0u

public actual fun JsSerializeScript(script: PCWSTR, buffer: Long, buffersize: Long): JsErrorCode =
    0u

public actual fun JsSetCurrentContext(context: Long): JsErrorCode =
    0u

public actual fun JsSetException(exception: Long): JsErrorCode =
    0u

public actual fun JsSetExternalData(obj: Long, externaldata: Long): JsErrorCode =
    0u

public actual fun JsSetIndexedProperty(obj: Long, index: Long, value: Long): JsErrorCode =
    0u

public actual fun JsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: UByte): JsErrorCode =
    0u

public actual fun JsSetPrototype(obj: Long, prototypeobject: Long): JsErrorCode =
    0u

public actual fun JsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    0u

public actual fun JsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    0u

public actual fun JsSetRuntimeMemoryLimit(runtime: Long, memorylimit: ULong): JsErrorCode =
    0u

public actual fun JsStopProfiling(reason: HRESULT): JsErrorCode =
    0u

public actual fun JsStrictEquals(object1: Long, object2: Long, result: Long): JsErrorCode =
    0u

public actual fun JsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): JsErrorCode =
    0u

public actual fun JsValueToVariant(obj: Long, variant: Long): JsErrorCode =
    0u

public actual fun JsVariantToValue(variant: Long, value: Long): JsErrorCode =
    0u
