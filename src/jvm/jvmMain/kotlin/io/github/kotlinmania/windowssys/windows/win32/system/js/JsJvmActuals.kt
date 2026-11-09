@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32SystemJsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsAddRef(ref: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsBoolToBoolean(value: Byte, booleanvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsBooleanToBool(value: Long, boolvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCallFunction(function: Long, arguments: Long, argumentcount: Short, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCollectGarbage(runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsConstructObject(function: Long, arguments: Long, argumentcount: Short, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsConvertValueToBoolean(value: Long, booleanvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsConvertValueToNumber(value: Long, numbervalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsConvertValueToObject(value: Long, obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsConvertValueToString(value: Long, stringvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateArray(length: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateExternalObject(data: Long, finalizecallback: Long, obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateFunction(nativefunction: Long, callbackstate: Long, function: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateObject(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateRangeError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateReferenceError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateRuntime(attributes: Int, runtimeversion: Int, threadservice: Long, runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateSyntaxError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateTypeError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsCreateURIError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsDeleteIndexedProperty(obj: Long, index: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: Byte, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsDisableRuntimeExecution(runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsDisposeRuntime(runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsDoubleToNumber(doublevalue: Double, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsEnableRuntimeExecution(runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsEquals(object1: Long, object2: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetAndClearException(exception: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetCurrentContext(currentcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetExtensionAllowed(obj: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetExternalData(obj: Long, externaldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetFalseValue(falsevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetGlobalObject(globalobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetIndexedProperty(obj: Long, index: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetNullValue(nullvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetOwnPropertyNames(obj: Long, propertynames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetProperty(obj: Long, propertyid: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetPropertyIdFromName(name: Long, propertyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetPropertyNameFromId(propertyid: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetPrototype(obj: Long, prototypeobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetRuntime(context: Long, runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetStringLength(stringvalue: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetTrueValue(truevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetUndefinedValue(undefinedvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsGetValueType(value: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsHasException(hasexception: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsHasExternalData(obj: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsHasIndexedProperty(obj: Long, index: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsIdle(nextidletick: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsIntToNumber(intvalue: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsIsEnumeratingHeap(isenumeratingheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsNumberToDouble(value: Long, doublevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsParseScript(script: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsParseSerializedScript(script: Long, buffer: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsPointerToString(stringvalue: Long, stringlength: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsPreventExtension(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsRelease(ref: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsRunScript(script: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsRunSerializedScript(script: Long, buffer: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSerializeScript(script: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetCurrentContext(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetException(exception: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetExternalData(obj: Long, externaldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetIndexedProperty(obj: Long, index: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetPrototype(obj: Long, prototypeobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsSetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsStopProfiling(reason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsStrictEquals(object1: Long, object2: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsValueToVariant(obj: Long, variant: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_JsVariantToValue(variant: Long, value: Long): Int
}

public actual fun JsAddRef(ref: Long, count: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsAddRef(ref, count).toUInt()

public actual fun JsBoolToBoolean(value: UByte, booleanvalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsBoolToBoolean(value.toByte(), booleanvalue).toUInt()

public actual fun JsBooleanToBool(value: Long, boolvalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsBooleanToBool(value, boolvalue).toUInt()

public actual fun JsCallFunction(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCallFunction(function, arguments, argumentcount.toShort(), result).toUInt()

public actual fun JsCollectGarbage(runtime: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCollectGarbage(runtime).toUInt()

public actual fun JsConstructObject(function: Long, arguments: Long, argumentcount: UShort, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsConstructObject(function, arguments, argumentcount.toShort(), result).toUInt()

public actual fun JsConvertValueToBoolean(value: Long, booleanvalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsConvertValueToBoolean(value, booleanvalue).toUInt()

public actual fun JsConvertValueToNumber(value: Long, numbervalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsConvertValueToNumber(value, numbervalue).toUInt()

public actual fun JsConvertValueToObject(value: Long, obj: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsConvertValueToObject(value, obj).toUInt()

public actual fun JsConvertValueToString(value: Long, stringvalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsConvertValueToString(value, stringvalue).toUInt()

public actual fun JsCreateArray(length: UInt, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateArray(length.toInt(), result).toUInt()

public actual fun JsCreateError(message: Long, error: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateError(message, error).toUInt()

public actual fun JsCreateExternalObject(data: Long, finalizecallback: JsFinalizeCallback, obj: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateExternalObject(data, finalizecallback.toLong(), obj).toUInt()

public actual fun JsCreateFunction(nativefunction: JsNativeFunction, callbackstate: Long, function: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateFunction(nativefunction.toLong(), callbackstate, function).toUInt()

public actual fun JsCreateObject(obj: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateObject(obj).toUInt()

public actual fun JsCreateRangeError(message: Long, error: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateRangeError(message, error).toUInt()

public actual fun JsCreateReferenceError(message: Long, error: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateReferenceError(message, error).toUInt()

public actual fun JsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateRuntime(attributes, runtimeversion, threadservice.toLong(), runtime).toUInt()

public actual fun JsCreateSyntaxError(message: Long, error: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateSyntaxError(message, error).toUInt()

public actual fun JsCreateTypeError(message: Long, error: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateTypeError(message, error).toUInt()

public actual fun JsCreateURIError(message: Long, error: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsCreateURIError(message, error).toUInt()

public actual fun JsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsDefineProperty(obj, propertyid, propertydescriptor, result).toUInt()

public actual fun JsDeleteIndexedProperty(obj: Long, index: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsDeleteIndexedProperty(obj, index).toUInt()

public actual fun JsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: UByte, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsDeleteProperty(obj, propertyid, usestrictrules.toByte(), result).toUInt()

public actual fun JsDisableRuntimeExecution(runtime: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsDisableRuntimeExecution(runtime).toUInt()

public actual fun JsDisposeRuntime(runtime: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsDisposeRuntime(runtime).toUInt()

public actual fun JsDoubleToNumber(doublevalue: Double, value: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsDoubleToNumber(doublevalue, value).toUInt()

public actual fun JsEnableRuntimeExecution(runtime: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsEnableRuntimeExecution(runtime).toUInt()

public actual fun JsEquals(object1: Long, object2: Long, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsEquals(object1, object2, result).toUInt()

public actual fun JsGetAndClearException(exception: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetAndClearException(exception).toUInt()

public actual fun JsGetCurrentContext(currentcontext: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetCurrentContext(currentcontext).toUInt()

public actual fun JsGetExtensionAllowed(obj: Long, value: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetExtensionAllowed(obj, value).toUInt()

public actual fun JsGetExternalData(obj: Long, externaldata: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetExternalData(obj, externaldata).toUInt()

public actual fun JsGetFalseValue(falsevalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetFalseValue(falsevalue).toUInt()

public actual fun JsGetGlobalObject(globalobject: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetGlobalObject(globalobject).toUInt()

public actual fun JsGetIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetIndexedProperty(obj, index, result).toUInt()

public actual fun JsGetNullValue(nullvalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetNullValue(nullvalue).toUInt()

public actual fun JsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetOwnPropertyDescriptor(obj, propertyid, propertydescriptor).toUInt()

public actual fun JsGetOwnPropertyNames(obj: Long, propertynames: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetOwnPropertyNames(obj, propertynames).toUInt()

public actual fun JsGetProperty(obj: Long, propertyid: Long, value: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetProperty(obj, propertyid, value).toUInt()

public actual fun JsGetPropertyIdFromName(name: PCWSTR, propertyid: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetPropertyIdFromName(name, propertyid).toUInt()

public actual fun JsGetPropertyNameFromId(propertyid: Long, name: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetPropertyNameFromId(propertyid, name).toUInt()

public actual fun JsGetPrototype(obj: Long, prototypeobject: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetPrototype(obj, prototypeobject).toUInt()

public actual fun JsGetRuntime(context: Long, runtime: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetRuntime(context, runtime).toUInt()

public actual fun JsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetRuntimeMemoryLimit(runtime, memorylimit).toUInt()

public actual fun JsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetRuntimeMemoryUsage(runtime, memoryusage).toUInt()

public actual fun JsGetStringLength(stringvalue: Long, length: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetStringLength(stringvalue, length).toUInt()

public actual fun JsGetTrueValue(truevalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetTrueValue(truevalue).toUInt()

public actual fun JsGetUndefinedValue(undefinedvalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetUndefinedValue(undefinedvalue).toUInt()

public actual fun JsGetValueType(value: Long, type: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsGetValueType(value, type).toUInt()

public actual fun JsHasException(hasexception: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsHasException(hasexception).toUInt()

public actual fun JsHasExternalData(obj: Long, value: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsHasExternalData(obj, value).toUInt()

public actual fun JsHasIndexedProperty(obj: Long, index: Long, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsHasIndexedProperty(obj, index, result).toUInt()

public actual fun JsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsHasProperty(obj, propertyid, hasproperty).toUInt()

public actual fun JsIdle(nextidletick: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsIdle(nextidletick).toUInt()

public actual fun JsIntToNumber(intvalue: Int, value: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsIntToNumber(intvalue, value).toUInt()

public actual fun JsIsEnumeratingHeap(isenumeratingheap: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsIsEnumeratingHeap(isenumeratingheap).toUInt()

public actual fun JsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsIsRuntimeExecutionDisabled(runtime, isdisabled).toUInt()

public actual fun JsNumberToDouble(value: Long, doublevalue: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsNumberToDouble(value, doublevalue).toUInt()

public actual fun JsParseScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsParseScript(script, sourcecontext.toLong(), sourceurl, result).toUInt()

public actual fun JsParseSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsParseSerializedScript(script, buffer, sourcecontext.toLong(), sourceurl, result).toUInt()

public actual fun JsPointerToString(stringvalue: PCWSTR, stringlength: ULong, value: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsPointerToString(stringvalue, stringlength.toLong(), value).toUInt()

public actual fun JsPreventExtension(obj: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsPreventExtension(obj).toUInt()

public actual fun JsRelease(ref: Long, count: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsRelease(ref, count).toUInt()

public actual fun JsRunScript(script: PCWSTR, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsRunScript(script, sourcecontext.toLong(), sourceurl, result).toUInt()

public actual fun JsRunSerializedScript(script: PCWSTR, buffer: Long, sourcecontext: ULong, sourceurl: PCWSTR, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsRunSerializedScript(script, buffer, sourcecontext.toLong(), sourceurl, result).toUInt()

public actual fun JsSerializeScript(script: PCWSTR, buffer: Long, buffersize: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSerializeScript(script, buffer, buffersize).toUInt()

public actual fun JsSetCurrentContext(context: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetCurrentContext(context).toUInt()

public actual fun JsSetException(exception: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetException(exception).toUInt()

public actual fun JsSetExternalData(obj: Long, externaldata: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetExternalData(obj, externaldata).toUInt()

public actual fun JsSetIndexedProperty(obj: Long, index: Long, value: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetIndexedProperty(obj, index, value).toUInt()

public actual fun JsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: UByte): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetProperty(obj, propertyid, value, usestrictrules.toByte()).toUInt()

public actual fun JsSetPrototype(obj: Long, prototypeobject: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetPrototype(obj, prototypeobject).toUInt()

public actual fun JsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetRuntimeBeforeCollectCallback(runtime, callbackstate, beforecollectcallback.toLong()).toUInt()

public actual fun JsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetRuntimeMemoryAllocationCallback(runtime, callbackstate, allocationcallback.toLong()).toUInt()

public actual fun JsSetRuntimeMemoryLimit(runtime: Long, memorylimit: ULong): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsSetRuntimeMemoryLimit(runtime, memorylimit.toLong()).toUInt()

public actual fun JsStopProfiling(reason: HRESULT): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsStopProfiling(reason).toUInt()

public actual fun JsStrictEquals(object1: Long, object2: Long, result: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsStrictEquals(object1, object2, result).toUInt()

public actual fun JsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsStringToPointer(value, stringvalue, stringlength).toUInt()

public actual fun JsValueToVariant(obj: Long, variant: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsValueToVariant(obj, variant).toUInt()

public actual fun JsVariantToValue(variant: Long, value: Long): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_JsVariantToValue(variant, value).toUInt()
