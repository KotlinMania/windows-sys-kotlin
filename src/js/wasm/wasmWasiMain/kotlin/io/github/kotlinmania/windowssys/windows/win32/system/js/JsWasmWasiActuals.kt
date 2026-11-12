@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun jsAddRef(ref: ConstPtr<CVoid>, count: MutPtr<UInt>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsAddRef")

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsBoolToBoolean")

public actual fun jsBooleanToBool(value: ConstPtr<CVoid>, boolvalue: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsBooleanToBool")

public actual fun jsCallFunction(function: ConstPtr<CVoid>, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCallFunction")

public actual fun jsCollectGarbage(runtime: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCollectGarbage")

public actual fun jsConstructObject(function: ConstPtr<CVoid>, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConstructObject")

public actual fun jsConvertValueToBoolean(value: ConstPtr<CVoid>, booleanvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConvertValueToBoolean")

public actual fun jsConvertValueToNumber(value: ConstPtr<CVoid>, numbervalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConvertValueToNumber")

public actual fun jsConvertValueToObject(value: ConstPtr<CVoid>, obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConvertValueToObject")

public actual fun jsConvertValueToString(value: ConstPtr<CVoid>, stringvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsConvertValueToString")

public actual fun jsCreateArray(length: UInt, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateArray")

public actual fun jsCreateError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateError")

public actual fun jsCreateExternalObject(data: ConstPtr<CVoid>, finalizecallback: JsFinalizeCallback, obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateExternalObject")

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: ConstPtr<CVoid>, function: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateFunction")

public actual fun jsCreateObject(obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateObject")

public actual fun jsCreateRangeError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateRangeError")

public actual fun jsCreateReferenceError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateReferenceError")

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateRuntime")

public actual fun jsCreateSyntaxError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateSyntaxError")

public actual fun jsCreateTypeError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateTypeError")

public actual fun jsCreateURIError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsCreateURIError")

public actual fun jsDefineProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, propertydescriptor: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDefineProperty")

public actual fun jsDeleteIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDeleteIndexedProperty")

public actual fun jsDeleteProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, usestrictrules: UByte, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDeleteProperty")

public actual fun jsDisableRuntimeExecution(runtime: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDisableRuntimeExecution")

public actual fun jsDisposeRuntime(runtime: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDisposeRuntime")

public actual fun jsDoubleToNumber(doublevalue: Double, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsDoubleToNumber")

public actual fun jsEnableRuntimeExecution(runtime: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsEnableRuntimeExecution")

public actual fun jsEquals(object1: ConstPtr<CVoid>, object2: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsEquals")

public actual fun jsGetAndClearException(exception: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetAndClearException")

public actual fun jsGetCurrentContext(currentcontext: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetCurrentContext")

public actual fun jsGetExtensionAllowed(obj: ConstPtr<CVoid>, value: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetExtensionAllowed")

public actual fun jsGetExternalData(obj: ConstPtr<CVoid>, externaldata: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetExternalData")

public actual fun jsGetFalseValue(falsevalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetFalseValue")

public actual fun jsGetGlobalObject(globalobject: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetGlobalObject")

public actual fun jsGetIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetIndexedProperty")

public actual fun jsGetNullValue(nullvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetNullValue")

public actual fun jsGetOwnPropertyDescriptor(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, propertydescriptor: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor")

public actual fun jsGetOwnPropertyNames(obj: ConstPtr<CVoid>, propertynames: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetOwnPropertyNames")

public actual fun jsGetProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetProperty")

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetPropertyIdFromName")

public actual fun jsGetPropertyNameFromId(propertyid: ConstPtr<CVoid>, name: MutPtr<MutPtr<UShort>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetPropertyNameFromId")

public actual fun jsGetPrototype(obj: ConstPtr<CVoid>, prototypeobject: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetPrototype")

public actual fun jsGetRuntime(context: ConstPtr<CVoid>, runtime: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetRuntime")

public actual fun jsGetRuntimeMemoryLimit(runtime: ConstPtr<CVoid>, memorylimit: MutPtr<ULong>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit")

public actual fun jsGetRuntimeMemoryUsage(runtime: ConstPtr<CVoid>, memoryusage: MutPtr<ULong>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage")

public actual fun jsGetStringLength(stringvalue: ConstPtr<CVoid>, length: MutPtr<Int>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetStringLength")

public actual fun jsGetTrueValue(truevalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetTrueValue")

public actual fun jsGetUndefinedValue(undefinedvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetUndefinedValue")

public actual fun jsGetValueType(value: ConstPtr<CVoid>, type: MutPtr<JsValueType>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsGetValueType")

public actual fun jsHasException(hasexception: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsHasException")

public actual fun jsHasExternalData(obj: ConstPtr<CVoid>, value: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsHasExternalData")

public actual fun jsHasIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsHasIndexedProperty")

public actual fun jsHasProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, hasproperty: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsHasProperty")

public actual fun jsIdle(nextidletick: MutPtr<UInt>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsIdle")

public actual fun jsIntToNumber(intvalue: Int, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsIntToNumber")

public actual fun jsIsEnumeratingHeap(isenumeratingheap: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsIsEnumeratingHeap")

public actual fun jsIsRuntimeExecutionDisabled(runtime: ConstPtr<CVoid>, isdisabled: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled")

public actual fun jsNumberToDouble(value: ConstPtr<CVoid>, doublevalue: MutPtr<Double>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsNumberToDouble")

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsParseScript")

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: ConstPtr<UByte>, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsParseSerializedScript")

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsPointerToString")

public actual fun jsPreventExtension(obj: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsPreventExtension")

public actual fun jsRelease(ref: ConstPtr<CVoid>, count: MutPtr<UInt>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsRelease")

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsRunScript")

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: ConstPtr<UByte>, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsRunSerializedScript")

public actual fun jsSerializeScript(script: Pcwstr, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSerializeScript")

public actual fun jsSetCurrentContext(context: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetCurrentContext")

public actual fun jsSetException(exception: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetException")

public actual fun jsSetExternalData(obj: ConstPtr<CVoid>, externaldata: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetExternalData")

public actual fun jsSetIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, value: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetIndexedProperty")

public actual fun jsSetProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, value: ConstPtr<CVoid>, usestrictrules: UByte): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetProperty")

public actual fun jsSetPrototype(obj: ConstPtr<CVoid>, prototypeobject: ConstPtr<CVoid>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetPrototype")

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: ConstPtr<CVoid>, callbackstate: ConstPtr<CVoid>, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback")

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: ConstPtr<CVoid>, callbackstate: ConstPtr<CVoid>, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback")

public actual fun jsSetRuntimeMemoryLimit(runtime: ConstPtr<CVoid>, memorylimit: ULong): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemJsJsStopProfiling")
private external fun wasiWindowssysWindowsWin32SystemJsJsStopProfiling(reason: Int): Int

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    wasiWindowssysWindowsWin32SystemJsJsStopProfiling(reason).toUInt()

public actual fun jsStrictEquals(object1: ConstPtr<CVoid>, object2: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsStrictEquals")

public actual fun jsStringToPointer(value: ConstPtr<CVoid>, stringvalue: MutPtr<MutPtr<UShort>>, stringlength: MutPtr<ULong>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsStringToPointer")

public actual fun jsValueToVariant(obj: ConstPtr<CVoid>, variant: MutPtr<Variant.Variant>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsValueToVariant")

public actual fun jsVariantToValue(variant: ConstPtr<Variant.Variant>, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemJsJsVariantToValue")
