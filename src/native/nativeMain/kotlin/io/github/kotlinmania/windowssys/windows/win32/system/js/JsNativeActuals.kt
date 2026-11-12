@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsAddRef
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsBoolToBoolean
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsBooleanToBool
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCallFunction
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCollectGarbage
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsConstructObject
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsConvertValueToBoolean
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsConvertValueToNumber
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsConvertValueToObject
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsConvertValueToString
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateArray
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateError
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateExternalObject
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateFunction
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateObject
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateRangeError
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateReferenceError
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateRuntime
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateSyntaxError
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateTypeError
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsCreateURIError
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsDefineProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsDeleteIndexedProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsDeleteProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsDisableRuntimeExecution
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsDisposeRuntime
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsDoubleToNumber
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsEnableRuntimeExecution
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsEquals
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetAndClearException
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetCurrentContext
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetExtensionAllowed
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetExternalData
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetFalseValue
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetGlobalObject
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetIndexedProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetNullValue
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetOwnPropertyNames
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetPropertyIdFromName
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetPropertyNameFromId
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetPrototype
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetRuntime
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetStringLength
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetTrueValue
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetUndefinedValue
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsGetValueType
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsHasException
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsHasExternalData
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsHasIndexedProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsHasProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsIdle
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsIntToNumber
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsIsEnumeratingHeap
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsNumberToDouble
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsParseScript
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsParseSerializedScript
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsPointerToString
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsPreventExtension
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsRelease
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsRunScript
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsRunSerializedScript
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSerializeScript
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetCurrentContext
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetException
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetExternalData
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetIndexedProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetProperty
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetPrototype
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsStopProfiling
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsStrictEquals
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsStringToPointer
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsValueToVariant
import io.github.kotlinmania.windowssys.windows.win32.system.js.cinterop.windowssysWindowsWin32SystemJsJsVariantToValue
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun jsAddRef(ref: ConstPtr, count: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsAddRef(ref.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsBoolToBoolean(value, booleanvalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsBooleanToBool(value: ConstPtr, boolvalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsBooleanToBool(value.rawAddress.toCPointer<ByteVar>(), boolvalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsCallFunction(function: ConstPtr, arguments: ConstPtr, argumentcount: UShort, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCallFunction(function.rawAddress.toCPointer<ByteVar>(), arguments.rawAddress.toCPointer<ByteVar>(), argumentcount, result.rawAddress.toCPointer<ByteVar>())

public actual fun jsCollectGarbage(runtime: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCollectGarbage(runtime.rawAddress.toCPointer<ByteVar>())

public actual fun jsConstructObject(function: ConstPtr, arguments: ConstPtr, argumentcount: UShort, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsConstructObject(function.rawAddress.toCPointer<ByteVar>(), arguments.rawAddress.toCPointer<ByteVar>(), argumentcount, result.rawAddress.toCPointer<ByteVar>())

public actual fun jsConvertValueToBoolean(value: ConstPtr, booleanvalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsConvertValueToBoolean(value.rawAddress.toCPointer<ByteVar>(), booleanvalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsConvertValueToNumber(value: ConstPtr, numbervalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsConvertValueToNumber(value.rawAddress.toCPointer<ByteVar>(), numbervalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsConvertValueToObject(value: ConstPtr, obj: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsConvertValueToObject(value.rawAddress.toCPointer<ByteVar>(), obj.rawAddress.toCPointer<ByteVar>())

public actual fun jsConvertValueToString(value: ConstPtr, stringvalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsConvertValueToString(value.rawAddress.toCPointer<ByteVar>(), stringvalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateArray(length: UInt, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateArray(length, result.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateError(message: ConstPtr, error: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateError(message.rawAddress.toCPointer<ByteVar>(), error.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateExternalObject(data: ConstPtr, finalizecallback: JsFinalizeCallback, obj: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateExternalObject(data.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), obj.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: ConstPtr, function: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateFunction(0L.toCPointer<ByteVar>(), callbackstate.rawAddress.toCPointer<ByteVar>(), function.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateObject(obj: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateObject(obj.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateRangeError(message: ConstPtr, error: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateRangeError(message.rawAddress.toCPointer<ByteVar>(), error.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateReferenceError(message: ConstPtr, error: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateReferenceError(message.rawAddress.toCPointer<ByteVar>(), error.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateRuntime(attributes, runtimeversion, 0L.toCPointer<ByteVar>(), runtime.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateSyntaxError(message: ConstPtr, error: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateSyntaxError(message.rawAddress.toCPointer<ByteVar>(), error.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateTypeError(message: ConstPtr, error: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateTypeError(message.rawAddress.toCPointer<ByteVar>(), error.rawAddress.toCPointer<ByteVar>())

public actual fun jsCreateURIError(message: ConstPtr, error: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsCreateURIError(message.rawAddress.toCPointer<ByteVar>(), error.rawAddress.toCPointer<ByteVar>())

public actual fun jsDefineProperty(obj: ConstPtr, propertyid: ConstPtr, propertydescriptor: ConstPtr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsDefineProperty(obj.rawAddress.toCPointer<ByteVar>(), propertyid.rawAddress.toCPointer<ByteVar>(), propertydescriptor.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsDeleteIndexedProperty(obj: ConstPtr, index: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsDeleteIndexedProperty(obj.rawAddress.toCPointer<ByteVar>(), index.rawAddress.toCPointer<ByteVar>())

public actual fun jsDeleteProperty(obj: ConstPtr, propertyid: ConstPtr, usestrictrules: UByte, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsDeleteProperty(obj.rawAddress.toCPointer<ByteVar>(), propertyid.rawAddress.toCPointer<ByteVar>(), usestrictrules, result.rawAddress.toCPointer<ByteVar>())

public actual fun jsDisableRuntimeExecution(runtime: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsDisableRuntimeExecution(runtime.rawAddress.toCPointer<ByteVar>())

public actual fun jsDisposeRuntime(runtime: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsDisposeRuntime(runtime.rawAddress.toCPointer<ByteVar>())

public actual fun jsDoubleToNumber(doublevalue: Double, value: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsDoubleToNumber(doublevalue, value.rawAddress.toCPointer<ByteVar>())

public actual fun jsEnableRuntimeExecution(runtime: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsEnableRuntimeExecution(runtime.rawAddress.toCPointer<ByteVar>())

public actual fun jsEquals(object1: ConstPtr, object2: ConstPtr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsEquals(object1.rawAddress.toCPointer<ByteVar>(), object2.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetAndClearException(exception: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetAndClearException(exception.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetCurrentContext(currentcontext: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetCurrentContext(currentcontext.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetExtensionAllowed(obj: ConstPtr, value: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetExtensionAllowed(obj.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetExternalData(obj: ConstPtr, externaldata: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetExternalData(obj.rawAddress.toCPointer<ByteVar>(), externaldata.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetFalseValue(falsevalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetFalseValue(falsevalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetGlobalObject(globalobject: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetGlobalObject(globalobject.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetIndexedProperty(obj: ConstPtr, index: ConstPtr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetIndexedProperty(obj.rawAddress.toCPointer<ByteVar>(), index.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetNullValue(nullvalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetNullValue(nullvalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetOwnPropertyDescriptor(obj: ConstPtr, propertyid: ConstPtr, propertydescriptor: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(obj.rawAddress.toCPointer<ByteVar>(), propertyid.rawAddress.toCPointer<ByteVar>(), propertydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetOwnPropertyNames(obj: ConstPtr, propertynames: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetOwnPropertyNames(obj.rawAddress.toCPointer<ByteVar>(), propertynames.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetProperty(obj: ConstPtr, propertyid: ConstPtr, value: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetProperty(obj.rawAddress.toCPointer<ByteVar>(), propertyid.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetPropertyIdFromName(name.rawAddress.toCPointer<ByteVar>(), propertyid.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetPropertyNameFromId(propertyid: ConstPtr, name: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetPropertyNameFromId(propertyid.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetPrototype(obj: ConstPtr, prototypeobject: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetPrototype(obj.rawAddress.toCPointer<ByteVar>(), prototypeobject.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetRuntime(context: ConstPtr, runtime: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetRuntime(context.rawAddress.toCPointer<ByteVar>(), runtime.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetRuntimeMemoryLimit(runtime: ConstPtr, memorylimit: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(runtime.rawAddress.toCPointer<ByteVar>(), memorylimit.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetRuntimeMemoryUsage(runtime: ConstPtr, memoryusage: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(runtime.rawAddress.toCPointer<ByteVar>(), memoryusage.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetStringLength(stringvalue: ConstPtr, length: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetStringLength(stringvalue.rawAddress.toCPointer<ByteVar>(), length.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetTrueValue(truevalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetTrueValue(truevalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetUndefinedValue(undefinedvalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetUndefinedValue(undefinedvalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsGetValueType(value: ConstPtr, type: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsGetValueType(value.rawAddress.toCPointer<ByteVar>(), type.rawAddress.toCPointer<ByteVar>())

public actual fun jsHasException(hasexception: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsHasException(hasexception.rawAddress.toCPointer<ByteVar>())

public actual fun jsHasExternalData(obj: ConstPtr, value: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsHasExternalData(obj.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun jsHasIndexedProperty(obj: ConstPtr, index: ConstPtr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsHasIndexedProperty(obj.rawAddress.toCPointer<ByteVar>(), index.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsHasProperty(obj: ConstPtr, propertyid: ConstPtr, hasproperty: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsHasProperty(obj.rawAddress.toCPointer<ByteVar>(), propertyid.rawAddress.toCPointer<ByteVar>(), hasproperty.rawAddress.toCPointer<ByteVar>())

public actual fun jsIdle(nextidletick: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsIdle(nextidletick.rawAddress.toCPointer<ByteVar>())

public actual fun jsIntToNumber(intvalue: Int, value: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsIntToNumber(intvalue, value.rawAddress.toCPointer<ByteVar>())

public actual fun jsIsEnumeratingHeap(isenumeratingheap: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsIsEnumeratingHeap(isenumeratingheap.rawAddress.toCPointer<ByteVar>())

public actual fun jsIsRuntimeExecutionDisabled(runtime: ConstPtr, isdisabled: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(runtime.rawAddress.toCPointer<ByteVar>(), isdisabled.rawAddress.toCPointer<ByteVar>())

public actual fun jsNumberToDouble(value: ConstPtr, doublevalue: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsNumberToDouble(value.rawAddress.toCPointer<ByteVar>(), doublevalue.rawAddress.toCPointer<ByteVar>())

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsParseScript(script.rawAddress.toCPointer<ByteVar>(), sourcecontext, sourceurl.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: ConstPtr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsParseSerializedScript(script.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), sourcecontext, sourceurl.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsPointerToString(stringvalue.rawAddress.toCPointer<ByteVar>(), stringlength, value.rawAddress.toCPointer<ByteVar>())

public actual fun jsPreventExtension(obj: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsPreventExtension(obj.rawAddress.toCPointer<ByteVar>())

public actual fun jsRelease(ref: ConstPtr, count: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsRelease(ref.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsRunScript(script.rawAddress.toCPointer<ByteVar>(), sourcecontext, sourceurl.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: ConstPtr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsRunSerializedScript(script.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), sourcecontext, sourceurl.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsSerializeScript(script: Pcwstr, buffer: MutPtr, buffersize: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSerializeScript(script.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun jsSetCurrentContext(context: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetCurrentContext(context.rawAddress.toCPointer<ByteVar>())

public actual fun jsSetException(exception: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetException(exception.rawAddress.toCPointer<ByteVar>())

public actual fun jsSetExternalData(obj: ConstPtr, externaldata: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetExternalData(obj.rawAddress.toCPointer<ByteVar>(), externaldata.rawAddress.toCPointer<ByteVar>())

public actual fun jsSetIndexedProperty(obj: ConstPtr, index: ConstPtr, value: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetIndexedProperty(obj.rawAddress.toCPointer<ByteVar>(), index.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun jsSetProperty(obj: ConstPtr, propertyid: ConstPtr, value: ConstPtr, usestrictrules: UByte): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetProperty(obj.rawAddress.toCPointer<ByteVar>(), propertyid.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), usestrictrules)

public actual fun jsSetPrototype(obj: ConstPtr, prototypeobject: ConstPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetPrototype(obj.rawAddress.toCPointer<ByteVar>(), prototypeobject.rawAddress.toCPointer<ByteVar>())

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: ConstPtr, callbackstate: ConstPtr, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(runtime.rawAddress.toCPointer<ByteVar>(), callbackstate.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: ConstPtr, callbackstate: ConstPtr, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(runtime.rawAddress.toCPointer<ByteVar>(), callbackstate.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jsSetRuntimeMemoryLimit(runtime: ConstPtr, memorylimit: ULong): JsErrorCode =
    windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(runtime.rawAddress.toCPointer<ByteVar>(), memorylimit)

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    windowssysWindowsWin32SystemJsJsStopProfiling(reason)

public actual fun jsStrictEquals(object1: ConstPtr, object2: ConstPtr, result: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsStrictEquals(object1.rawAddress.toCPointer<ByteVar>(), object2.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun jsStringToPointer(value: ConstPtr, stringvalue: MutPtr, stringlength: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsStringToPointer(value.rawAddress.toCPointer<ByteVar>(), stringvalue.rawAddress.toCPointer<ByteVar>(), stringlength.rawAddress.toCPointer<ByteVar>())

public actual fun jsValueToVariant(obj: ConstPtr, variant: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsValueToVariant(obj.rawAddress.toCPointer<ByteVar>(), variant.rawAddress.toCPointer<ByteVar>())

public actual fun jsVariantToValue(variant: ConstPtr, value: MutPtr): JsErrorCode =
    windowssysWindowsWin32SystemJsJsVariantToValue(variant.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())
