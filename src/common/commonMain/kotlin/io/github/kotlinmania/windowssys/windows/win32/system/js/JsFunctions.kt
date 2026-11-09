package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun JsAddRef(ref: Long, count: Long): JsErrorCode

public expect fun JsBoolToBoolean(value: UByte, booleanvalue: Long): JsErrorCode

public expect fun JsBooleanToBool(value: Long, boolvalue: Long): JsErrorCode

public expect fun JsCallFunction(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode

public expect fun JsCollectGarbage(runtime: Long): JsErrorCode

public expect fun JsConstructObject(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode

public expect fun JsConvertValueToBoolean(value: Long, booleanvalue: Long): JsErrorCode

public expect fun JsConvertValueToNumber(value: Long, numbervalue: Long): JsErrorCode

public expect fun JsConvertValueToObject(value: Long, obj: Long): JsErrorCode

public expect fun JsConvertValueToString(value: Long, stringvalue: Long): JsErrorCode

public expect fun JsCreateArray(length: UInt, result: Long): JsErrorCode

public expect fun JsCreateError(message: Long, error: Long): JsErrorCode

public expect fun JsCreateExternalObject(data: Long, finalizecallback: JsFinalizeCallback, obj: Long): JsErrorCode

public expect fun JsCreateFunction(nativefunction: JsNativeFunction, callbackstate: Long, function: Long): JsErrorCode

public expect fun JsCreateObject(obj: Long): JsErrorCode

public expect fun JsCreateRangeError(message: Long, error: Long): JsErrorCode

public expect fun JsCreateReferenceError(message: Long, error: Long): JsErrorCode

public expect fun JsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: Long): JsErrorCode

public expect fun JsCreateSyntaxError(message: Long, error: Long): JsErrorCode

public expect fun JsCreateTypeError(message: Long, error: Long): JsErrorCode

public expect fun JsCreateURIError(message: Long, error: Long): JsErrorCode

public expect fun JsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): JsErrorCode

public expect fun JsDeleteIndexedProperty(obj: Long, index: Long): JsErrorCode

public expect fun JsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: UByte, result: Long): JsErrorCode

public expect fun JsDisableRuntimeExecution(runtime: Long): JsErrorCode

public expect fun JsDisposeRuntime(runtime: Long): JsErrorCode

public expect fun JsDoubleToNumber(doublevalue: Double, value: Long): JsErrorCode

public expect fun JsEnableRuntimeExecution(runtime: Long): JsErrorCode

public expect fun JsEquals(object1: Long, object2: Long, result: Long): JsErrorCode

public expect fun JsGetAndClearException(exception: Long): JsErrorCode

public expect fun JsGetCurrentContext(currentcontext: Long): JsErrorCode

public expect fun JsGetExtensionAllowed(obj: Long, value: Long): JsErrorCode

public expect fun JsGetExternalData(obj: Long, externaldata: Long): JsErrorCode

public expect fun JsGetFalseValue(falsevalue: Long): JsErrorCode

public expect fun JsGetGlobalObject(globalobject: Long): JsErrorCode

public expect fun JsGetIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode

public expect fun JsGetNullValue(nullvalue: Long): JsErrorCode

public expect fun JsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): JsErrorCode

public expect fun JsGetOwnPropertyNames(obj: Long, propertynames: Long): JsErrorCode

public expect fun JsGetProperty(obj: Long, propertyid: Long, value: Long): JsErrorCode

public expect fun JsGetPropertyIdFromName(name: PCWSTR, propertyid: Long): JsErrorCode

public expect fun JsGetPropertyNameFromId(propertyid: Long, name: Long): JsErrorCode

public expect fun JsGetPrototype(obj: Long, prototypeobject: Long): JsErrorCode

public expect fun JsGetRuntime(context: Long, runtime: Long): JsErrorCode

public expect fun JsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): JsErrorCode

public expect fun JsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): JsErrorCode

public expect fun JsGetStringLength(stringvalue: Long, length: Long): JsErrorCode

public expect fun JsGetTrueValue(truevalue: Long): JsErrorCode

public expect fun JsGetUndefinedValue(undefinedvalue: Long): JsErrorCode

public expect fun JsGetValueType(value: Long, type: Long): JsErrorCode

public expect fun JsHasException(hasexception: Long): JsErrorCode

public expect fun JsHasExternalData(obj: Long, value: Long): JsErrorCode

public expect fun JsHasIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode

public expect fun JsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): JsErrorCode

public expect fun JsIdle(nextidletick: Long): JsErrorCode

public expect fun JsIntToNumber(intvalue: Int, value: Long): JsErrorCode

public expect fun JsIsEnumeratingHeap(isenumeratingheap: Long): JsErrorCode

public expect fun JsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): JsErrorCode

public expect fun JsNumberToDouble(value: Long, doublevalue: Long): JsErrorCode

public expect fun JsParseScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode

public expect fun JsParseSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode

public expect fun JsPointerToString(stringvalue: PCWSTR, stringlength: ULong, value: Long): JsErrorCode

public expect fun JsPreventExtension(obj: Long): JsErrorCode

public expect fun JsRelease(ref: Long, count: Long): JsErrorCode

public expect fun JsRunScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode

public expect fun JsRunSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode

public expect fun JsSerializeScript(script: PCWSTR, buffer: Long, buffersize: Long): JsErrorCode

public expect fun JsSetCurrentContext(context: Long): JsErrorCode

public expect fun JsSetException(exception: Long): JsErrorCode

public expect fun JsSetExternalData(obj: Long, externaldata: Long): JsErrorCode

public expect fun JsSetIndexedProperty(obj: Long, index: Long, value: Long): JsErrorCode

public expect fun JsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: UByte): JsErrorCode

public expect fun JsSetPrototype(obj: Long, prototypeobject: Long): JsErrorCode

public expect fun JsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode

public expect fun JsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: JsMemoryAllocationCallback): JsErrorCode

public expect fun JsSetRuntimeMemoryLimit(runtime: Long, memorylimit: ULong): JsErrorCode

public expect fun JsStopProfiling(reason: HRESULT): JsErrorCode

public expect fun JsStrictEquals(object1: Long, object2: Long, result: Long): JsErrorCode

public expect fun JsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): JsErrorCode

public expect fun JsValueToVariant(obj: Long, variant: Long): JsErrorCode

public expect fun JsVariantToValue(variant: Long, value: Long): JsErrorCode
