package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun jsAddRef(ref: ConstPtr, count: MutPtr): JsErrorCode

public expect fun jsBoolToBoolean(value: UByte, booleanvalue: MutPtr): JsErrorCode

public expect fun jsBooleanToBool(value: ConstPtr, boolvalue: MutPtr): JsErrorCode

public expect fun jsCallFunction(function: ConstPtr, arguments: ConstPtr, argumentcount: UShort, result: MutPtr): JsErrorCode

public expect fun jsCollectGarbage(runtime: ConstPtr): JsErrorCode

public expect fun jsConstructObject(function: ConstPtr, arguments: ConstPtr, argumentcount: UShort, result: MutPtr): JsErrorCode

public expect fun jsConvertValueToBoolean(value: ConstPtr, booleanvalue: MutPtr): JsErrorCode

public expect fun jsConvertValueToNumber(value: ConstPtr, numbervalue: MutPtr): JsErrorCode

public expect fun jsConvertValueToObject(value: ConstPtr, obj: MutPtr): JsErrorCode

public expect fun jsConvertValueToString(value: ConstPtr, stringvalue: MutPtr): JsErrorCode

public expect fun jsCreateArray(length: UInt, result: MutPtr): JsErrorCode

public expect fun jsCreateError(message: ConstPtr, error: MutPtr): JsErrorCode

public expect fun jsCreateExternalObject(data: ConstPtr, finalizecallback: JsFinalizeCallback, obj: MutPtr): JsErrorCode

public expect fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: ConstPtr, function: MutPtr): JsErrorCode

public expect fun jsCreateObject(obj: MutPtr): JsErrorCode

public expect fun jsCreateRangeError(message: ConstPtr, error: MutPtr): JsErrorCode

public expect fun jsCreateReferenceError(message: ConstPtr, error: MutPtr): JsErrorCode

public expect fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: MutPtr): JsErrorCode

public expect fun jsCreateSyntaxError(message: ConstPtr, error: MutPtr): JsErrorCode

public expect fun jsCreateTypeError(message: ConstPtr, error: MutPtr): JsErrorCode

public expect fun jsCreateURIError(message: ConstPtr, error: MutPtr): JsErrorCode

public expect fun jsDefineProperty(obj: ConstPtr, propertyid: ConstPtr, propertydescriptor: ConstPtr, result: MutPtr): JsErrorCode

public expect fun jsDeleteIndexedProperty(obj: ConstPtr, index: ConstPtr): JsErrorCode

public expect fun jsDeleteProperty(obj: ConstPtr, propertyid: ConstPtr, usestrictrules: UByte, result: MutPtr): JsErrorCode

public expect fun jsDisableRuntimeExecution(runtime: ConstPtr): JsErrorCode

public expect fun jsDisposeRuntime(runtime: ConstPtr): JsErrorCode

public expect fun jsDoubleToNumber(doublevalue: Double, value: MutPtr): JsErrorCode

public expect fun jsEnableRuntimeExecution(runtime: ConstPtr): JsErrorCode

public expect fun jsEquals(object1: ConstPtr, object2: ConstPtr, result: MutPtr): JsErrorCode

public expect fun jsGetAndClearException(exception: MutPtr): JsErrorCode

public expect fun jsGetCurrentContext(currentcontext: MutPtr): JsErrorCode

public expect fun jsGetExtensionAllowed(obj: ConstPtr, value: MutPtr): JsErrorCode

public expect fun jsGetExternalData(obj: ConstPtr, externaldata: MutPtr): JsErrorCode

public expect fun jsGetFalseValue(falsevalue: MutPtr): JsErrorCode

public expect fun jsGetGlobalObject(globalobject: MutPtr): JsErrorCode

public expect fun jsGetIndexedProperty(obj: ConstPtr, index: ConstPtr, result: MutPtr): JsErrorCode

public expect fun jsGetNullValue(nullvalue: MutPtr): JsErrorCode

public expect fun jsGetOwnPropertyDescriptor(obj: ConstPtr, propertyid: ConstPtr, propertydescriptor: MutPtr): JsErrorCode

public expect fun jsGetOwnPropertyNames(obj: ConstPtr, propertynames: MutPtr): JsErrorCode

public expect fun jsGetProperty(obj: ConstPtr, propertyid: ConstPtr, value: MutPtr): JsErrorCode

public expect fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: MutPtr): JsErrorCode

public expect fun jsGetPropertyNameFromId(propertyid: ConstPtr, name: MutPtr): JsErrorCode

public expect fun jsGetPrototype(obj: ConstPtr, prototypeobject: MutPtr): JsErrorCode

public expect fun jsGetRuntime(context: ConstPtr, runtime: MutPtr): JsErrorCode

public expect fun jsGetRuntimeMemoryLimit(runtime: ConstPtr, memorylimit: MutPtr): JsErrorCode

public expect fun jsGetRuntimeMemoryUsage(runtime: ConstPtr, memoryusage: MutPtr): JsErrorCode

public expect fun jsGetStringLength(stringvalue: ConstPtr, length: MutPtr): JsErrorCode

public expect fun jsGetTrueValue(truevalue: MutPtr): JsErrorCode

public expect fun jsGetUndefinedValue(undefinedvalue: MutPtr): JsErrorCode

public expect fun jsGetValueType(value: ConstPtr, type: MutPtr): JsErrorCode

public expect fun jsHasException(hasexception: MutPtr): JsErrorCode

public expect fun jsHasExternalData(obj: ConstPtr, value: MutPtr): JsErrorCode

public expect fun jsHasIndexedProperty(obj: ConstPtr, index: ConstPtr, result: MutPtr): JsErrorCode

public expect fun jsHasProperty(obj: ConstPtr, propertyid: ConstPtr, hasproperty: MutPtr): JsErrorCode

public expect fun jsIdle(nextidletick: MutPtr): JsErrorCode

public expect fun jsIntToNumber(intvalue: Int, value: MutPtr): JsErrorCode

public expect fun jsIsEnumeratingHeap(isenumeratingheap: MutPtr): JsErrorCode

public expect fun jsIsRuntimeExecutionDisabled(runtime: ConstPtr, isdisabled: MutPtr): JsErrorCode

public expect fun jsNumberToDouble(value: ConstPtr, doublevalue: MutPtr): JsErrorCode

public expect fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode

public expect fun jsParseSerializedScript(script: Pcwstr, buffer: ConstPtr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode

public expect fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: MutPtr): JsErrorCode

public expect fun jsPreventExtension(obj: ConstPtr): JsErrorCode

public expect fun jsRelease(ref: ConstPtr, count: MutPtr): JsErrorCode

public expect fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode

public expect fun jsRunSerializedScript(script: Pcwstr, buffer: ConstPtr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode

public expect fun jsSerializeScript(script: Pcwstr, buffer: MutPtr, buffersize: MutPtr): JsErrorCode

public expect fun jsSetCurrentContext(context: ConstPtr): JsErrorCode

public expect fun jsSetException(exception: ConstPtr): JsErrorCode

public expect fun jsSetExternalData(obj: ConstPtr, externaldata: ConstPtr): JsErrorCode

public expect fun jsSetIndexedProperty(obj: ConstPtr, index: ConstPtr, value: ConstPtr): JsErrorCode

public expect fun jsSetProperty(obj: ConstPtr, propertyid: ConstPtr, value: ConstPtr, usestrictrules: UByte): JsErrorCode

public expect fun jsSetPrototype(obj: ConstPtr, prototypeobject: ConstPtr): JsErrorCode

public expect fun jsSetRuntimeBeforeCollectCallback(runtime: ConstPtr, callbackstate: ConstPtr, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode

public expect fun jsSetRuntimeMemoryAllocationCallback(runtime: ConstPtr, callbackstate: ConstPtr, allocationcallback: JsMemoryAllocationCallback): JsErrorCode

public expect fun jsSetRuntimeMemoryLimit(runtime: ConstPtr, memorylimit: ULong): JsErrorCode

public expect fun jsStopProfiling(reason: Hresult): JsErrorCode

public expect fun jsStrictEquals(object1: ConstPtr, object2: ConstPtr, result: MutPtr): JsErrorCode

public expect fun jsStringToPointer(value: ConstPtr, stringvalue: MutPtr, stringlength: MutPtr): JsErrorCode

public expect fun jsValueToVariant(obj: ConstPtr, variant: MutPtr): JsErrorCode

public expect fun jsVariantToValue(variant: ConstPtr, value: MutPtr): JsErrorCode
