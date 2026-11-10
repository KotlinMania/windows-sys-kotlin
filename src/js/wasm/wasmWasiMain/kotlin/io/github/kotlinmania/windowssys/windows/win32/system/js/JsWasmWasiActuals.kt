@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public actual fun jsAddRef(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsBooleanToBool(value: COpaquePointer?, boolvalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCallFunction(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCollectGarbage(runtime: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsConstructObject(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsConvertValueToBoolean(value: COpaquePointer?, booleanvalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsConvertValueToNumber(value: COpaquePointer?, numbervalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsConvertValueToObject(value: COpaquePointer?, obj: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsConvertValueToString(value: COpaquePointer?, stringvalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateArray(length: UInt, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateExternalObject(data: COpaquePointer?, finalizecallback: JsFinalizeCallback, obj: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: COpaquePointer?, function: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateObject(obj: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateRangeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateReferenceError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateSyntaxError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateTypeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsCreateURIError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsDefineProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsDeleteIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsDeleteProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, usestrictrules: UByte, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsDisableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsDisposeRuntime(runtime: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsDoubleToNumber(doublevalue: Double, value: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsEnableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetAndClearException(exception: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetCurrentContext(currentcontext: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetExtensionAllowed(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetFalseValue(falsevalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetGlobalObject(globalobject: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetNullValue(nullvalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetOwnPropertyDescriptor(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetOwnPropertyNames(obj: COpaquePointer?, propertynames: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetPropertyNameFromId(propertyid: COpaquePointer?, name: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetRuntime(context: COpaquePointer?, runtime: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetRuntimeMemoryUsage(runtime: COpaquePointer?, memoryusage: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetStringLength(stringvalue: COpaquePointer?, length: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetTrueValue(truevalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetUndefinedValue(undefinedvalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsGetValueType(value: COpaquePointer?, type: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsHasException(hasexception: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsHasExternalData(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsHasIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsHasProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, hasproperty: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsIdle(nextidletick: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsIntToNumber(intvalue: Int, value: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsIsEnumeratingHeap(isenumeratingheap: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsIsRuntimeExecutionDisabled(runtime: COpaquePointer?, isdisabled: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsNumberToDouble(value: COpaquePointer?, doublevalue: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsPreventExtension(obj: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsRelease(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSerializeScript(script: Pcwstr, buffer: COpaquePointer?, buffersize: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetCurrentContext(context: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetException(exception: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?, usestrictrules: UByte): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsSetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: ULong): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsStrictEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsStringToPointer(value: COpaquePointer?, stringvalue: COpaquePointer?, stringlength: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsValueToVariant(obj: COpaquePointer?, variant: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jsVariantToValue(variant: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
