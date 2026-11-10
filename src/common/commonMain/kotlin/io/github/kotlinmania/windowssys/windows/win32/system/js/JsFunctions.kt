package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun jsAddRef(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode

public expect fun jsBoolToBoolean(value: UByte, booleanvalue: COpaquePointer?): JsErrorCode

public expect fun jsBooleanToBool(value: COpaquePointer?, boolvalue: COpaquePointer?): JsErrorCode

public expect fun jsCallFunction(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode

public expect fun jsCollectGarbage(runtime: COpaquePointer?): JsErrorCode

public expect fun jsConstructObject(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode

public expect fun jsConvertValueToBoolean(value: COpaquePointer?, booleanvalue: COpaquePointer?): JsErrorCode

public expect fun jsConvertValueToNumber(value: COpaquePointer?, numbervalue: COpaquePointer?): JsErrorCode

public expect fun jsConvertValueToObject(value: COpaquePointer?, obj: COpaquePointer?): JsErrorCode

public expect fun jsConvertValueToString(value: COpaquePointer?, stringvalue: COpaquePointer?): JsErrorCode

public expect fun jsCreateArray(length: UInt, result: COpaquePointer?): JsErrorCode

public expect fun jsCreateError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode

public expect fun jsCreateExternalObject(data: COpaquePointer?, finalizecallback: JsFinalizeCallback, obj: COpaquePointer?): JsErrorCode

public expect fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: COpaquePointer?, function: COpaquePointer?): JsErrorCode

public expect fun jsCreateObject(obj: COpaquePointer?): JsErrorCode

public expect fun jsCreateRangeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode

public expect fun jsCreateReferenceError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode

public expect fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: COpaquePointer?): JsErrorCode

public expect fun jsCreateSyntaxError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode

public expect fun jsCreateTypeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode

public expect fun jsCreateURIError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode

public expect fun jsDefineProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?, result: COpaquePointer?): JsErrorCode

public expect fun jsDeleteIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?): JsErrorCode

public expect fun jsDeleteProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, usestrictrules: UByte, result: COpaquePointer?): JsErrorCode

public expect fun jsDisableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode

public expect fun jsDisposeRuntime(runtime: COpaquePointer?): JsErrorCode

public expect fun jsDoubleToNumber(doublevalue: Double, value: COpaquePointer?): JsErrorCode

public expect fun jsEnableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode

public expect fun jsEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode

public expect fun jsGetAndClearException(exception: COpaquePointer?): JsErrorCode

public expect fun jsGetCurrentContext(currentcontext: COpaquePointer?): JsErrorCode

public expect fun jsGetExtensionAllowed(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode

public expect fun jsGetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode

public expect fun jsGetFalseValue(falsevalue: COpaquePointer?): JsErrorCode

public expect fun jsGetGlobalObject(globalobject: COpaquePointer?): JsErrorCode

public expect fun jsGetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode

public expect fun jsGetNullValue(nullvalue: COpaquePointer?): JsErrorCode

public expect fun jsGetOwnPropertyDescriptor(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?): JsErrorCode

public expect fun jsGetOwnPropertyNames(obj: COpaquePointer?, propertynames: COpaquePointer?): JsErrorCode

public expect fun jsGetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?): JsErrorCode

public expect fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: COpaquePointer?): JsErrorCode

public expect fun jsGetPropertyNameFromId(propertyid: COpaquePointer?, name: COpaquePointer?): JsErrorCode

public expect fun jsGetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode

public expect fun jsGetRuntime(context: COpaquePointer?, runtime: COpaquePointer?): JsErrorCode

public expect fun jsGetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: COpaquePointer?): JsErrorCode

public expect fun jsGetRuntimeMemoryUsage(runtime: COpaquePointer?, memoryusage: COpaquePointer?): JsErrorCode

public expect fun jsGetStringLength(stringvalue: COpaquePointer?, length: COpaquePointer?): JsErrorCode

public expect fun jsGetTrueValue(truevalue: COpaquePointer?): JsErrorCode

public expect fun jsGetUndefinedValue(undefinedvalue: COpaquePointer?): JsErrorCode

public expect fun jsGetValueType(value: COpaquePointer?, type: COpaquePointer?): JsErrorCode

public expect fun jsHasException(hasexception: COpaquePointer?): JsErrorCode

public expect fun jsHasExternalData(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode

public expect fun jsHasIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode

public expect fun jsHasProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, hasproperty: COpaquePointer?): JsErrorCode

public expect fun jsIdle(nextidletick: COpaquePointer?): JsErrorCode

public expect fun jsIntToNumber(intvalue: Int, value: COpaquePointer?): JsErrorCode

public expect fun jsIsEnumeratingHeap(isenumeratingheap: COpaquePointer?): JsErrorCode

public expect fun jsIsRuntimeExecutionDisabled(runtime: COpaquePointer?, isdisabled: COpaquePointer?): JsErrorCode

public expect fun jsNumberToDouble(value: COpaquePointer?, doublevalue: COpaquePointer?): JsErrorCode

public expect fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode

public expect fun jsParseSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode

public expect fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: COpaquePointer?): JsErrorCode

public expect fun jsPreventExtension(obj: COpaquePointer?): JsErrorCode

public expect fun jsRelease(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode

public expect fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode

public expect fun jsRunSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode

public expect fun jsSerializeScript(script: Pcwstr, buffer: COpaquePointer?, buffersize: COpaquePointer?): JsErrorCode

public expect fun jsSetCurrentContext(context: COpaquePointer?): JsErrorCode

public expect fun jsSetException(exception: COpaquePointer?): JsErrorCode

public expect fun jsSetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode

public expect fun jsSetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, value: COpaquePointer?): JsErrorCode

public expect fun jsSetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?, usestrictrules: UByte): JsErrorCode

public expect fun jsSetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode

public expect fun jsSetRuntimeBeforeCollectCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode

public expect fun jsSetRuntimeMemoryAllocationCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, allocationcallback: JsMemoryAllocationCallback): JsErrorCode

public expect fun jsSetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: ULong): JsErrorCode

public expect fun jsStopProfiling(reason: Hresult): JsErrorCode

public expect fun jsStrictEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode

public expect fun jsStringToPointer(value: COpaquePointer?, stringvalue: COpaquePointer?, stringlength: COpaquePointer?): JsErrorCode

public expect fun jsValueToVariant(obj: COpaquePointer?, variant: COpaquePointer?): JsErrorCode

public expect fun jsVariantToValue(variant: COpaquePointer?, value: COpaquePointer?): JsErrorCode
