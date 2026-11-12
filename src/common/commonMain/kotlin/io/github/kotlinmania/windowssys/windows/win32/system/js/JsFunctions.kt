package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public expect fun jsAddRef(ref: ConstPtr<CVoid>, count: MutPtr<UInt>): JsErrorCode

public expect fun jsBoolToBoolean(value: UByte, booleanvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsBooleanToBool(value: ConstPtr<CVoid>, boolvalue: MutPtr<Boolean>): JsErrorCode

public expect fun jsCallFunction(function: ConstPtr<CVoid>, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCollectGarbage(runtime: ConstPtr<CVoid>): JsErrorCode

public expect fun jsConstructObject(function: ConstPtr<CVoid>, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsConvertValueToBoolean(value: ConstPtr<CVoid>, booleanvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsConvertValueToNumber(value: ConstPtr<CVoid>, numbervalue: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsConvertValueToObject(value: ConstPtr<CVoid>, obj: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsConvertValueToString(value: ConstPtr<CVoid>, stringvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateArray(length: UInt, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateExternalObject(data: ConstPtr<CVoid>, finalizecallback: JsFinalizeCallback, obj: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: ConstPtr<CVoid>, function: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateObject(obj: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateRangeError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateReferenceError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateSyntaxError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateTypeError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsCreateURIError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsDefineProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, propertydescriptor: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode

public expect fun jsDeleteIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>): JsErrorCode

public expect fun jsDeleteProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, usestrictrules: UByte, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsDisableRuntimeExecution(runtime: ConstPtr<CVoid>): JsErrorCode

public expect fun jsDisposeRuntime(runtime: ConstPtr<CVoid>): JsErrorCode

public expect fun jsDoubleToNumber(doublevalue: Double, value: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsEnableRuntimeExecution(runtime: ConstPtr<CVoid>): JsErrorCode

public expect fun jsEquals(object1: ConstPtr<CVoid>, object2: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode

public expect fun jsGetAndClearException(exception: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetCurrentContext(currentcontext: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetExtensionAllowed(obj: ConstPtr<CVoid>, value: MutPtr<Boolean>): JsErrorCode

public expect fun jsGetExternalData(obj: ConstPtr<CVoid>, externaldata: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetFalseValue(falsevalue: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetGlobalObject(globalobject: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetNullValue(nullvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetOwnPropertyDescriptor(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, propertydescriptor: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetOwnPropertyNames(obj: ConstPtr<CVoid>, propertynames: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetPropertyNameFromId(propertyid: ConstPtr<CVoid>, name: MutPtr<MutPtr<UShort>>): JsErrorCode

public expect fun jsGetPrototype(obj: ConstPtr<CVoid>, prototypeobject: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetRuntime(context: ConstPtr<CVoid>, runtime: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetRuntimeMemoryLimit(runtime: ConstPtr<CVoid>, memorylimit: MutPtr<ULong>): JsErrorCode

public expect fun jsGetRuntimeMemoryUsage(runtime: ConstPtr<CVoid>, memoryusage: MutPtr<ULong>): JsErrorCode

public expect fun jsGetStringLength(stringvalue: ConstPtr<CVoid>, length: MutPtr<Int>): JsErrorCode

public expect fun jsGetTrueValue(truevalue: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetUndefinedValue(undefinedvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsGetValueType(value: ConstPtr<CVoid>, type: MutPtr<JsValueType>): JsErrorCode

public expect fun jsHasException(hasexception: MutPtr<Boolean>): JsErrorCode

public expect fun jsHasExternalData(obj: ConstPtr<CVoid>, value: MutPtr<Boolean>): JsErrorCode

public expect fun jsHasIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode

public expect fun jsHasProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, hasproperty: MutPtr<Boolean>): JsErrorCode

public expect fun jsIdle(nextidletick: MutPtr<UInt>): JsErrorCode

public expect fun jsIntToNumber(intvalue: Int, value: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsIsEnumeratingHeap(isenumeratingheap: MutPtr<Boolean>): JsErrorCode

public expect fun jsIsRuntimeExecutionDisabled(runtime: ConstPtr<CVoid>, isdisabled: MutPtr<Boolean>): JsErrorCode

public expect fun jsNumberToDouble(value: ConstPtr<CVoid>, doublevalue: MutPtr<Double>): JsErrorCode

public expect fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsParseSerializedScript(script: Pcwstr, buffer: ConstPtr<UByte>, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsPreventExtension(obj: ConstPtr<CVoid>): JsErrorCode

public expect fun jsRelease(ref: ConstPtr<CVoid>, count: MutPtr<UInt>): JsErrorCode

public expect fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsRunSerializedScript(script: Pcwstr, buffer: ConstPtr<UByte>, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode

public expect fun jsSerializeScript(script: Pcwstr, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): JsErrorCode

public expect fun jsSetCurrentContext(context: ConstPtr<CVoid>): JsErrorCode

public expect fun jsSetException(exception: ConstPtr<CVoid>): JsErrorCode

public expect fun jsSetExternalData(obj: ConstPtr<CVoid>, externaldata: ConstPtr<CVoid>): JsErrorCode

public expect fun jsSetIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, value: ConstPtr<CVoid>): JsErrorCode

public expect fun jsSetProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, value: ConstPtr<CVoid>, usestrictrules: UByte): JsErrorCode

public expect fun jsSetPrototype(obj: ConstPtr<CVoid>, prototypeobject: ConstPtr<CVoid>): JsErrorCode

public expect fun jsSetRuntimeBeforeCollectCallback(runtime: ConstPtr<CVoid>, callbackstate: ConstPtr<CVoid>, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode

public expect fun jsSetRuntimeMemoryAllocationCallback(runtime: ConstPtr<CVoid>, callbackstate: ConstPtr<CVoid>, allocationcallback: JsMemoryAllocationCallback): JsErrorCode

public expect fun jsSetRuntimeMemoryLimit(runtime: ConstPtr<CVoid>, memorylimit: ULong): JsErrorCode

public expect fun jsStopProfiling(reason: Hresult): JsErrorCode

public expect fun jsStrictEquals(object1: ConstPtr<CVoid>, object2: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode

public expect fun jsStringToPointer(value: ConstPtr<CVoid>, stringvalue: MutPtr<MutPtr<UShort>>, stringlength: MutPtr<ULong>): JsErrorCode

public expect fun jsValueToVariant(obj: ConstPtr<CVoid>, variant: MutPtr<Variant.Variant>): JsErrorCode

public expect fun jsVariantToValue(variant: ConstPtr<Variant.Variant>, value: MutPtr<MutPtr<CVoid>>): JsErrorCode
