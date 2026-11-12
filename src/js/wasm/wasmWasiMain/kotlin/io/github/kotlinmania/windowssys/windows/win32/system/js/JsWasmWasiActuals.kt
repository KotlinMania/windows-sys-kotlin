@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun jsAddRef(ref: ConstPtr, count: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsAddRef")

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsBoolToBoolean")

public actual fun jsBooleanToBool(value: ConstPtr, boolvalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsBooleanToBool")

public actual fun jsCallFunction(function: ConstPtr, arguments: ConstPtr, argumentcount: UShort, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCallFunction")

public actual fun jsCollectGarbage(runtime: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCollectGarbage")

public actual fun jsConstructObject(function: ConstPtr, arguments: ConstPtr, argumentcount: UShort, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConstructObject")

public actual fun jsConvertValueToBoolean(value: ConstPtr, booleanvalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConvertValueToBoolean")

public actual fun jsConvertValueToNumber(value: ConstPtr, numbervalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConvertValueToNumber")

public actual fun jsConvertValueToObject(value: ConstPtr, obj: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConvertValueToObject")

public actual fun jsConvertValueToString(value: ConstPtr, stringvalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConvertValueToString")

public actual fun jsCreateArray(length: UInt, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateArray")

public actual fun jsCreateError(message: ConstPtr, error: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateError")

public actual fun jsCreateExternalObject(data: ConstPtr, finalizecallback: JsFinalizeCallback, obj: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateExternalObject")

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: ConstPtr, function: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateFunction")

public actual fun jsCreateObject(obj: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateObject")

public actual fun jsCreateRangeError(message: ConstPtr, error: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateRangeError")

public actual fun jsCreateReferenceError(message: ConstPtr, error: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateReferenceError")

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateRuntime")

public actual fun jsCreateSyntaxError(message: ConstPtr, error: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateSyntaxError")

public actual fun jsCreateTypeError(message: ConstPtr, error: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateTypeError")

public actual fun jsCreateURIError(message: ConstPtr, error: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateURIError")

public actual fun jsDefineProperty(obj: ConstPtr, propertyid: ConstPtr, propertydescriptor: ConstPtr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDefineProperty")

public actual fun jsDeleteIndexedProperty(obj: ConstPtr, index: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDeleteIndexedProperty")

public actual fun jsDeleteProperty(obj: ConstPtr, propertyid: ConstPtr, usestrictrules: UByte, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDeleteProperty")

public actual fun jsDisableRuntimeExecution(runtime: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDisableRuntimeExecution")

public actual fun jsDisposeRuntime(runtime: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDisposeRuntime")

public actual fun jsDoubleToNumber(doublevalue: Double, value: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDoubleToNumber")

public actual fun jsEnableRuntimeExecution(runtime: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsEnableRuntimeExecution")

public actual fun jsEquals(object1: ConstPtr, object2: ConstPtr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsEquals")

public actual fun jsGetAndClearException(exception: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetAndClearException")

public actual fun jsGetCurrentContext(currentcontext: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetCurrentContext")

public actual fun jsGetExtensionAllowed(obj: ConstPtr, value: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetExtensionAllowed")

public actual fun jsGetExternalData(obj: ConstPtr, externaldata: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetExternalData")

public actual fun jsGetFalseValue(falsevalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetFalseValue")

public actual fun jsGetGlobalObject(globalobject: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetGlobalObject")

public actual fun jsGetIndexedProperty(obj: ConstPtr, index: ConstPtr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetIndexedProperty")

public actual fun jsGetNullValue(nullvalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetNullValue")

public actual fun jsGetOwnPropertyDescriptor(obj: ConstPtr, propertyid: ConstPtr, propertydescriptor: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor")

public actual fun jsGetOwnPropertyNames(obj: ConstPtr, propertynames: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetOwnPropertyNames")

public actual fun jsGetProperty(obj: ConstPtr, propertyid: ConstPtr, value: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetProperty")

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetPropertyIdFromName")

public actual fun jsGetPropertyNameFromId(propertyid: ConstPtr, name: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetPropertyNameFromId")

public actual fun jsGetPrototype(obj: ConstPtr, prototypeobject: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetPrototype")

public actual fun jsGetRuntime(context: ConstPtr, runtime: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetRuntime")

public actual fun jsGetRuntimeMemoryLimit(runtime: ConstPtr, memorylimit: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit")

public actual fun jsGetRuntimeMemoryUsage(runtime: ConstPtr, memoryusage: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage")

public actual fun jsGetStringLength(stringvalue: ConstPtr, length: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetStringLength")

public actual fun jsGetTrueValue(truevalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetTrueValue")

public actual fun jsGetUndefinedValue(undefinedvalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetUndefinedValue")

public actual fun jsGetValueType(value: ConstPtr, type: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetValueType")

public actual fun jsHasException(hasexception: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsHasException")

public actual fun jsHasExternalData(obj: ConstPtr, value: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsHasExternalData")

public actual fun jsHasIndexedProperty(obj: ConstPtr, index: ConstPtr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsHasIndexedProperty")

public actual fun jsHasProperty(obj: ConstPtr, propertyid: ConstPtr, hasproperty: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsHasProperty")

public actual fun jsIdle(nextidletick: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsIdle")

public actual fun jsIntToNumber(intvalue: Int, value: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsIntToNumber")

public actual fun jsIsEnumeratingHeap(isenumeratingheap: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsIsEnumeratingHeap")

public actual fun jsIsRuntimeExecutionDisabled(runtime: ConstPtr, isdisabled: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled")

public actual fun jsNumberToDouble(value: ConstPtr, doublevalue: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsNumberToDouble")

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsParseScript")

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: ConstPtr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsParseSerializedScript")

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsPointerToString")

public actual fun jsPreventExtension(obj: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsPreventExtension")

public actual fun jsRelease(ref: ConstPtr, count: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsRelease")

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsRunScript")

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: ConstPtr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsRunSerializedScript")

public actual fun jsSerializeScript(script: Pcwstr, buffer: MutPtr, buffersize: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSerializeScript")

public actual fun jsSetCurrentContext(context: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetCurrentContext")

public actual fun jsSetException(exception: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetException")

public actual fun jsSetExternalData(obj: ConstPtr, externaldata: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetExternalData")

public actual fun jsSetIndexedProperty(obj: ConstPtr, index: ConstPtr, value: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetIndexedProperty")

public actual fun jsSetProperty(obj: ConstPtr, propertyid: ConstPtr, value: ConstPtr, usestrictrules: UByte): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetProperty")

public actual fun jsSetPrototype(obj: ConstPtr, prototypeobject: ConstPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetPrototype")

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: ConstPtr, callbackstate: ConstPtr, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback")

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: ConstPtr, callbackstate: ConstPtr, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback")

public actual fun jsSetRuntimeMemoryLimit(runtime: ConstPtr, memorylimit: ULong): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemJsJsStopProfiling")
private external fun wasiWindowssysWindowsWin32SystemJsJsStopProfiling(reason: Int): Int

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    wasiWindowssysWindowsWin32SystemJsJsStopProfiling(reason).toUInt()

public actual fun jsStrictEquals(object1: ConstPtr, object2: ConstPtr, result: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsStrictEquals")

public actual fun jsStringToPointer(value: ConstPtr, stringvalue: MutPtr, stringlength: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsStringToPointer")

public actual fun jsValueToVariant(obj: ConstPtr, variant: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsValueToVariant")

public actual fun jsVariantToValue(variant: ConstPtr, value: MutPtr): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsVariantToValue")
