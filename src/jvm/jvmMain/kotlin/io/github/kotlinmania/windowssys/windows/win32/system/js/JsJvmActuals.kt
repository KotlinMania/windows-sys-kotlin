@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemJsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsAddRef(ref: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsBoolToBoolean(value: Byte, booleanvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsBooleanToBool(value: Long, boolvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCallFunction(function: Long, arguments: Long, argumentcount: Short, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCollectGarbage(runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsConstructObject(function: Long, arguments: Long, argumentcount: Short, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsConvertValueToBoolean(value: Long, booleanvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsConvertValueToNumber(value: Long, numbervalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsConvertValueToObject(value: Long, obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsConvertValueToString(value: Long, stringvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateArray(length: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateExternalObject(data: Long, finalizecallback: Long, obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateFunction(nativefunction: Long, callbackstate: Long, function: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateObject(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateRangeError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateReferenceError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateRuntime(attributes: Int, runtimeversion: Int, threadservice: Long, runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateSyntaxError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateTypeError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsCreateURIError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsDeleteIndexedProperty(obj: Long, index: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: Byte, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsDisableRuntimeExecution(runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsDisposeRuntime(runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsDoubleToNumber(doublevalue: Double, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsEnableRuntimeExecution(runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsEquals(object1: Long, object2: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetAndClearException(exception: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetCurrentContext(currentcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetExtensionAllowed(obj: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetExternalData(obj: Long, externaldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetFalseValue(falsevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetGlobalObject(globalobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetIndexedProperty(obj: Long, index: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetNullValue(nullvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetOwnPropertyNames(obj: Long, propertynames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetProperty(obj: Long, propertyid: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetPropertyIdFromName(name: Long, propertyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetPropertyNameFromId(propertyid: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetPrototype(obj: Long, prototypeobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetRuntime(context: Long, runtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetStringLength(stringvalue: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetTrueValue(truevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetUndefinedValue(undefinedvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsGetValueType(value: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsHasException(hasexception: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsHasExternalData(obj: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsHasIndexedProperty(obj: Long, index: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsIdle(nextidletick: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsIntToNumber(intvalue: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsIsEnumeratingHeap(isenumeratingheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsNumberToDouble(value: Long, doublevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsParseScript(script: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsParseSerializedScript(script: Long, buffer: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsPointerToString(stringvalue: Long, stringlength: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsPreventExtension(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsRelease(ref: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsRunScript(script: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsRunSerializedScript(script: Long, buffer: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSerializeScript(script: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetCurrentContext(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetException(exception: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetExternalData(obj: Long, externaldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetIndexedProperty(obj: Long, index: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetPrototype(obj: Long, prototypeobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsSetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsStopProfiling(reason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsStrictEquals(object1: Long, object2: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsValueToVariant(obj: Long, variant: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_js_jsVariantToValue(variant: Long, value: Long): Int
}

public actual fun jsAddRef(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsAddRef((ref?.value ?: 0L), (count?.value ?: 0L)).toUInt()

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsBoolToBoolean(value.toByte(), (booleanvalue?.value ?: 0L)).toUInt()

public actual fun jsBooleanToBool(value: COpaquePointer?, boolvalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsBooleanToBool((value?.value ?: 0L), (boolvalue?.value ?: 0L)).toUInt()

public actual fun jsCallFunction(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCallFunction((function?.value ?: 0L), (arguments?.value ?: 0L), argumentcount.toShort(), (result?.value ?: 0L)).toUInt()

public actual fun jsCollectGarbage(runtime: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCollectGarbage((runtime?.value ?: 0L)).toUInt()

public actual fun jsConstructObject(function: COpaquePointer?, arguments: COpaquePointer?, argumentcount: UShort, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsConstructObject((function?.value ?: 0L), (arguments?.value ?: 0L), argumentcount.toShort(), (result?.value ?: 0L)).toUInt()

public actual fun jsConvertValueToBoolean(value: COpaquePointer?, booleanvalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsConvertValueToBoolean((value?.value ?: 0L), (booleanvalue?.value ?: 0L)).toUInt()

public actual fun jsConvertValueToNumber(value: COpaquePointer?, numbervalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsConvertValueToNumber((value?.value ?: 0L), (numbervalue?.value ?: 0L)).toUInt()

public actual fun jsConvertValueToObject(value: COpaquePointer?, obj: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsConvertValueToObject((value?.value ?: 0L), (obj?.value ?: 0L)).toUInt()

public actual fun jsConvertValueToString(value: COpaquePointer?, stringvalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsConvertValueToString((value?.value ?: 0L), (stringvalue?.value ?: 0L)).toUInt()

public actual fun jsCreateArray(length: UInt, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateArray(length.toInt(), (result?.value ?: 0L)).toUInt()

public actual fun jsCreateError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateError((message?.value ?: 0L), (error?.value ?: 0L)).toUInt()

public actual fun jsCreateExternalObject(data: COpaquePointer?, finalizecallback: JsFinalizeCallback, obj: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateExternalObject((data?.value ?: 0L), 0L, (obj?.value ?: 0L)).toUInt()

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: COpaquePointer?, function: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateFunction(0L, (callbackstate?.value ?: 0L), (function?.value ?: 0L)).toUInt()

public actual fun jsCreateObject(obj: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateObject((obj?.value ?: 0L)).toUInt()

public actual fun jsCreateRangeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateRangeError((message?.value ?: 0L), (error?.value ?: 0L)).toUInt()

public actual fun jsCreateReferenceError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateReferenceError((message?.value ?: 0L), (error?.value ?: 0L)).toUInt()

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateRuntime(attributes, runtimeversion, 0L, (runtime?.value ?: 0L)).toUInt()

public actual fun jsCreateSyntaxError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateSyntaxError((message?.value ?: 0L), (error?.value ?: 0L)).toUInt()

public actual fun jsCreateTypeError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateTypeError((message?.value ?: 0L), (error?.value ?: 0L)).toUInt()

public actual fun jsCreateURIError(message: COpaquePointer?, error: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsCreateURIError((message?.value ?: 0L), (error?.value ?: 0L)).toUInt()

public actual fun jsDefineProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsDefineProperty((obj?.value ?: 0L), (propertyid?.value ?: 0L), (propertydescriptor?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsDeleteIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsDeleteIndexedProperty((obj?.value ?: 0L), (index?.value ?: 0L)).toUInt()

public actual fun jsDeleteProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, usestrictrules: UByte, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsDeleteProperty((obj?.value ?: 0L), (propertyid?.value ?: 0L), usestrictrules.toByte(), (result?.value ?: 0L)).toUInt()

public actual fun jsDisableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsDisableRuntimeExecution((runtime?.value ?: 0L)).toUInt()

public actual fun jsDisposeRuntime(runtime: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsDisposeRuntime((runtime?.value ?: 0L)).toUInt()

public actual fun jsDoubleToNumber(doublevalue: Double, value: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsDoubleToNumber(doublevalue, (value?.value ?: 0L)).toUInt()

public actual fun jsEnableRuntimeExecution(runtime: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsEnableRuntimeExecution((runtime?.value ?: 0L)).toUInt()

public actual fun jsEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsEquals((object1?.value ?: 0L), (object2?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsGetAndClearException(exception: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetAndClearException((exception?.value ?: 0L)).toUInt()

public actual fun jsGetCurrentContext(currentcontext: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetCurrentContext((currentcontext?.value ?: 0L)).toUInt()

public actual fun jsGetExtensionAllowed(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetExtensionAllowed((obj?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun jsGetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetExternalData((obj?.value ?: 0L), (externaldata?.value ?: 0L)).toUInt()

public actual fun jsGetFalseValue(falsevalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetFalseValue((falsevalue?.value ?: 0L)).toUInt()

public actual fun jsGetGlobalObject(globalobject: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetGlobalObject((globalobject?.value ?: 0L)).toUInt()

public actual fun jsGetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetIndexedProperty((obj?.value ?: 0L), (index?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsGetNullValue(nullvalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetNullValue((nullvalue?.value ?: 0L)).toUInt()

public actual fun jsGetOwnPropertyDescriptor(obj: COpaquePointer?, propertyid: COpaquePointer?, propertydescriptor: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetOwnPropertyDescriptor((obj?.value ?: 0L), (propertyid?.value ?: 0L), (propertydescriptor?.value ?: 0L)).toUInt()

public actual fun jsGetOwnPropertyNames(obj: COpaquePointer?, propertynames: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetOwnPropertyNames((obj?.value ?: 0L), (propertynames?.value ?: 0L)).toUInt()

public actual fun jsGetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetProperty((obj?.value ?: 0L), (propertyid?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetPropertyIdFromName((name?.value ?: 0L), (propertyid?.value ?: 0L)).toUInt()

public actual fun jsGetPropertyNameFromId(propertyid: COpaquePointer?, name: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetPropertyNameFromId((propertyid?.value ?: 0L), (name?.value ?: 0L)).toUInt()

public actual fun jsGetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetPrototype((obj?.value ?: 0L), (prototypeobject?.value ?: 0L)).toUInt()

public actual fun jsGetRuntime(context: COpaquePointer?, runtime: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetRuntime((context?.value ?: 0L), (runtime?.value ?: 0L)).toUInt()

public actual fun jsGetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetRuntimeMemoryLimit((runtime?.value ?: 0L), (memorylimit?.value ?: 0L)).toUInt()

public actual fun jsGetRuntimeMemoryUsage(runtime: COpaquePointer?, memoryusage: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetRuntimeMemoryUsage((runtime?.value ?: 0L), (memoryusage?.value ?: 0L)).toUInt()

public actual fun jsGetStringLength(stringvalue: COpaquePointer?, length: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetStringLength((stringvalue?.value ?: 0L), (length?.value ?: 0L)).toUInt()

public actual fun jsGetTrueValue(truevalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetTrueValue((truevalue?.value ?: 0L)).toUInt()

public actual fun jsGetUndefinedValue(undefinedvalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetUndefinedValue((undefinedvalue?.value ?: 0L)).toUInt()

public actual fun jsGetValueType(value: COpaquePointer?, type: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsGetValueType((value?.value ?: 0L), (type?.value ?: 0L)).toUInt()

public actual fun jsHasException(hasexception: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsHasException((hasexception?.value ?: 0L)).toUInt()

public actual fun jsHasExternalData(obj: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsHasExternalData((obj?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun jsHasIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsHasIndexedProperty((obj?.value ?: 0L), (index?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsHasProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, hasproperty: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsHasProperty((obj?.value ?: 0L), (propertyid?.value ?: 0L), (hasproperty?.value ?: 0L)).toUInt()

public actual fun jsIdle(nextidletick: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsIdle((nextidletick?.value ?: 0L)).toUInt()

public actual fun jsIntToNumber(intvalue: Int, value: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsIntToNumber(intvalue, (value?.value ?: 0L)).toUInt()

public actual fun jsIsEnumeratingHeap(isenumeratingheap: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsIsEnumeratingHeap((isenumeratingheap?.value ?: 0L)).toUInt()

public actual fun jsIsRuntimeExecutionDisabled(runtime: COpaquePointer?, isdisabled: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsIsRuntimeExecutionDisabled((runtime?.value ?: 0L), (isdisabled?.value ?: 0L)).toUInt()

public actual fun jsNumberToDouble(value: COpaquePointer?, doublevalue: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsNumberToDouble((value?.value ?: 0L), (doublevalue?.value ?: 0L)).toUInt()

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsParseScript((script?.value ?: 0L), sourcecontext.toLong(), (sourceurl?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsParseSerializedScript((script?.value ?: 0L), (buffer?.value ?: 0L), sourcecontext.toLong(), (sourceurl?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsPointerToString((stringvalue?.value ?: 0L), stringlength.toLong(), (value?.value ?: 0L)).toUInt()

public actual fun jsPreventExtension(obj: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsPreventExtension((obj?.value ?: 0L)).toUInt()

public actual fun jsRelease(ref: COpaquePointer?, count: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsRelease((ref?.value ?: 0L), (count?.value ?: 0L)).toUInt()

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsRunScript((script?.value ?: 0L), sourcecontext.toLong(), (sourceurl?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: COpaquePointer?, sourcecontext: ULong, sourceurl: Pcwstr, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsRunSerializedScript((script?.value ?: 0L), (buffer?.value ?: 0L), sourcecontext.toLong(), (sourceurl?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsSerializeScript(script: Pcwstr, buffer: COpaquePointer?, buffersize: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSerializeScript((script?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun jsSetCurrentContext(context: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetCurrentContext((context?.value ?: 0L)).toUInt()

public actual fun jsSetException(exception: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetException((exception?.value ?: 0L)).toUInt()

public actual fun jsSetExternalData(obj: COpaquePointer?, externaldata: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetExternalData((obj?.value ?: 0L), (externaldata?.value ?: 0L)).toUInt()

public actual fun jsSetIndexedProperty(obj: COpaquePointer?, index: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetIndexedProperty((obj?.value ?: 0L), (index?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun jsSetProperty(obj: COpaquePointer?, propertyid: COpaquePointer?, value: COpaquePointer?, usestrictrules: UByte): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetProperty((obj?.value ?: 0L), (propertyid?.value ?: 0L), (value?.value ?: 0L), usestrictrules.toByte()).toUInt()

public actual fun jsSetPrototype(obj: COpaquePointer?, prototypeobject: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetPrototype((obj?.value ?: 0L), (prototypeobject?.value ?: 0L)).toUInt()

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetRuntimeBeforeCollectCallback((runtime?.value ?: 0L), (callbackstate?.value ?: 0L), 0L).toUInt()

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: COpaquePointer?, callbackstate: COpaquePointer?, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetRuntimeMemoryAllocationCallback((runtime?.value ?: 0L), (callbackstate?.value ?: 0L), 0L).toUInt()

public actual fun jsSetRuntimeMemoryLimit(runtime: COpaquePointer?, memorylimit: ULong): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsSetRuntimeMemoryLimit((runtime?.value ?: 0L), memorylimit.toLong()).toUInt()

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsStopProfiling(reason).toUInt()

public actual fun jsStrictEquals(object1: COpaquePointer?, object2: COpaquePointer?, result: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsStrictEquals((object1?.value ?: 0L), (object2?.value ?: 0L), (result?.value ?: 0L)).toUInt()

public actual fun jsStringToPointer(value: COpaquePointer?, stringvalue: COpaquePointer?, stringlength: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsStringToPointer((value?.value ?: 0L), (stringvalue?.value ?: 0L), (stringlength?.value ?: 0L)).toUInt()

public actual fun jsValueToVariant(obj: COpaquePointer?, variant: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsValueToVariant((obj?.value ?: 0L), (variant?.value ?: 0L)).toUInt()

public actual fun jsVariantToValue(variant: COpaquePointer?, value: COpaquePointer?): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssys_windows_win32_system_js_jsVariantToValue((variant?.value ?: 0L), (value?.value ?: 0L)).toUInt()
