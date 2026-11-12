@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

private object WindowsWin32SystemJsJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemJsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsAddRef(ref: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsBoolToBoolean(value: Byte, booleanvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsBooleanToBool(value: Long, boolvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCallFunction(function: Long, arguments: Long, argumentcount: Short, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCollectGarbage(runtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsConstructObject(function: Long, arguments: Long, argumentcount: Short, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsConvertValueToBoolean(value: Long, booleanvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsConvertValueToNumber(value: Long, numbervalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsConvertValueToObject(value: Long, obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsConvertValueToString(value: Long, stringvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateArray(length: Int, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateExternalObject(data: Long, finalizecallback: Long, obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateFunction(nativefunction: Long, callbackstate: Long, function: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateObject(obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateRangeError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateReferenceError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateRuntime(attributes: Int, runtimeversion: Int, threadservice: Long, runtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateSyntaxError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateTypeError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsCreateURIError(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsDefineProperty(obj: Long, propertyid: Long, propertydescriptor: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsDeleteIndexedProperty(obj: Long, index: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsDeleteProperty(obj: Long, propertyid: Long, usestrictrules: Byte, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsDisableRuntimeExecution(runtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsDisposeRuntime(runtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsDoubleToNumber(doublevalue: Double, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsEnableRuntimeExecution(runtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsEquals(object1: Long, object2: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetAndClearException(exception: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetCurrentContext(currentcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetExtensionAllowed(obj: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetExternalData(obj: Long, externaldata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetFalseValue(falsevalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetGlobalObject(globalobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetIndexedProperty(obj: Long, index: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetNullValue(nullvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(obj: Long, propertyid: Long, propertydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetOwnPropertyNames(obj: Long, propertynames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetProperty(obj: Long, propertyid: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetPropertyIdFromName(name: Long, propertyid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetPropertyNameFromId(propertyid: Long, name: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetPrototype(obj: Long, prototypeobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetRuntime(context: Long, runtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(runtime: Long, memoryusage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetStringLength(stringvalue: Long, length: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetTrueValue(truevalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetUndefinedValue(undefinedvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsGetValueType(value: Long, type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsHasException(hasexception: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsHasExternalData(obj: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsHasIndexedProperty(obj: Long, index: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsHasProperty(obj: Long, propertyid: Long, hasproperty: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsIdle(nextidletick: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsIntToNumber(intvalue: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsIsEnumeratingHeap(isenumeratingheap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(runtime: Long, isdisabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsNumberToDouble(value: Long, doublevalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsParseScript(script: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsParseSerializedScript(script: Long, buffer: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsPointerToString(stringvalue: Long, stringlength: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsPreventExtension(obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsRelease(ref: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsRunScript(script: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsRunSerializedScript(script: Long, buffer: Long, sourcecontext: Long, sourceurl: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSerializeScript(script: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetCurrentContext(context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetException(exception: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetExternalData(obj: Long, externaldata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetIndexedProperty(obj: Long, index: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetProperty(obj: Long, propertyid: Long, value: Long, usestrictrules: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetPrototype(obj: Long, prototypeobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(runtime: Long, callbackstate: Long, beforecollectcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(runtime: Long, callbackstate: Long, allocationcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(runtime: Long, memorylimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsStopProfiling(reason: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsStrictEquals(object1: Long, object2: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsStringToPointer(value: Long, stringvalue: Long, stringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsValueToVariant(obj: Long, variant: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJsJsVariantToValue(variant: Long, value: Long): Int
}

public actual fun jsAddRef(ref: ConstPtr<CVoid>, count: MutPtr<UInt>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsAddRef(ref.rawAddress, count.rawAddress).toUInt()

public actual fun jsBoolToBoolean(value: UByte, booleanvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsBoolToBoolean(value.toByte(), booleanvalue.rawAddress).toUInt()

public actual fun jsBooleanToBool(value: ConstPtr<CVoid>, boolvalue: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsBooleanToBool(value.rawAddress, boolvalue.rawAddress).toUInt()

public actual fun jsCallFunction(function: ConstPtr<CVoid>, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCallFunction(function.rawAddress, arguments.rawAddress, argumentcount.toShort(), result.rawAddress).toUInt()

public actual fun jsCollectGarbage(runtime: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCollectGarbage(runtime.rawAddress).toUInt()

public actual fun jsConstructObject(function: ConstPtr<CVoid>, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsConstructObject(function.rawAddress, arguments.rawAddress, argumentcount.toShort(), result.rawAddress).toUInt()

public actual fun jsConvertValueToBoolean(value: ConstPtr<CVoid>, booleanvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsConvertValueToBoolean(value.rawAddress, booleanvalue.rawAddress).toUInt()

public actual fun jsConvertValueToNumber(value: ConstPtr<CVoid>, numbervalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsConvertValueToNumber(value.rawAddress, numbervalue.rawAddress).toUInt()

public actual fun jsConvertValueToObject(value: ConstPtr<CVoid>, obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsConvertValueToObject(value.rawAddress, obj.rawAddress).toUInt()

public actual fun jsConvertValueToString(value: ConstPtr<CVoid>, stringvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsConvertValueToString(value.rawAddress, stringvalue.rawAddress).toUInt()

public actual fun jsCreateArray(length: UInt, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateArray(length.toInt(), result.rawAddress).toUInt()

public actual fun jsCreateError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateError(message.rawAddress, error.rawAddress).toUInt()

public actual fun jsCreateExternalObject(data: ConstPtr<CVoid>, finalizecallback: JsFinalizeCallback, obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateExternalObject(data.rawAddress, 0L, obj.rawAddress).toUInt()

public actual fun jsCreateFunction(nativefunction: JsNativeFunction, callbackstate: ConstPtr<CVoid>, function: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateFunction(0L, callbackstate.rawAddress, function.rawAddress).toUInt()

public actual fun jsCreateObject(obj: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateObject(obj.rawAddress).toUInt()

public actual fun jsCreateRangeError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateRangeError(message.rawAddress, error.rawAddress).toUInt()

public actual fun jsCreateReferenceError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateReferenceError(message.rawAddress, error.rawAddress).toUInt()

public actual fun jsCreateRuntime(attributes: JsRuntimeAttributes, runtimeversion: JsRuntimeVersion, threadservice: JsThreadServiceCallback, runtime: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateRuntime(attributes, runtimeversion, 0L, runtime.rawAddress).toUInt()

public actual fun jsCreateSyntaxError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateSyntaxError(message.rawAddress, error.rawAddress).toUInt()

public actual fun jsCreateTypeError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateTypeError(message.rawAddress, error.rawAddress).toUInt()

public actual fun jsCreateURIError(message: ConstPtr<CVoid>, error: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsCreateURIError(message.rawAddress, error.rawAddress).toUInt()

public actual fun jsDefineProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, propertydescriptor: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsDefineProperty(obj.rawAddress, propertyid.rawAddress, propertydescriptor.rawAddress, result.rawAddress).toUInt()

public actual fun jsDeleteIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsDeleteIndexedProperty(obj.rawAddress, index.rawAddress).toUInt()

public actual fun jsDeleteProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, usestrictrules: UByte, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsDeleteProperty(obj.rawAddress, propertyid.rawAddress, usestrictrules.toByte(), result.rawAddress).toUInt()

public actual fun jsDisableRuntimeExecution(runtime: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsDisableRuntimeExecution(runtime.rawAddress).toUInt()

public actual fun jsDisposeRuntime(runtime: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsDisposeRuntime(runtime.rawAddress).toUInt()

public actual fun jsDoubleToNumber(doublevalue: Double, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsDoubleToNumber(doublevalue, value.rawAddress).toUInt()

public actual fun jsEnableRuntimeExecution(runtime: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsEnableRuntimeExecution(runtime.rawAddress).toUInt()

public actual fun jsEquals(object1: ConstPtr<CVoid>, object2: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsEquals(object1.rawAddress, object2.rawAddress, result.rawAddress).toUInt()

public actual fun jsGetAndClearException(exception: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetAndClearException(exception.rawAddress).toUInt()

public actual fun jsGetCurrentContext(currentcontext: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetCurrentContext(currentcontext.rawAddress).toUInt()

public actual fun jsGetExtensionAllowed(obj: ConstPtr<CVoid>, value: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetExtensionAllowed(obj.rawAddress, value.rawAddress).toUInt()

public actual fun jsGetExternalData(obj: ConstPtr<CVoid>, externaldata: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetExternalData(obj.rawAddress, externaldata.rawAddress).toUInt()

public actual fun jsGetFalseValue(falsevalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetFalseValue(falsevalue.rawAddress).toUInt()

public actual fun jsGetGlobalObject(globalobject: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetGlobalObject(globalobject.rawAddress).toUInt()

public actual fun jsGetIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetIndexedProperty(obj.rawAddress, index.rawAddress, result.rawAddress).toUInt()

public actual fun jsGetNullValue(nullvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetNullValue(nullvalue.rawAddress).toUInt()

public actual fun jsGetOwnPropertyDescriptor(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, propertydescriptor: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(obj.rawAddress, propertyid.rawAddress, propertydescriptor.rawAddress).toUInt()

public actual fun jsGetOwnPropertyNames(obj: ConstPtr<CVoid>, propertynames: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetOwnPropertyNames(obj.rawAddress, propertynames.rawAddress).toUInt()

public actual fun jsGetProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetProperty(obj.rawAddress, propertyid.rawAddress, value.rawAddress).toUInt()

public actual fun jsGetPropertyIdFromName(name: Pcwstr, propertyid: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetPropertyIdFromName(name.rawAddress, propertyid.rawAddress).toUInt()

public actual fun jsGetPropertyNameFromId(propertyid: ConstPtr<CVoid>, name: MutPtr<MutPtr<UShort>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetPropertyNameFromId(propertyid.rawAddress, name.rawAddress).toUInt()

public actual fun jsGetPrototype(obj: ConstPtr<CVoid>, prototypeobject: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetPrototype(obj.rawAddress, prototypeobject.rawAddress).toUInt()

public actual fun jsGetRuntime(context: ConstPtr<CVoid>, runtime: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetRuntime(context.rawAddress, runtime.rawAddress).toUInt()

public actual fun jsGetRuntimeMemoryLimit(runtime: ConstPtr<CVoid>, memorylimit: MutPtr<ULong>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(runtime.rawAddress, memorylimit.rawAddress).toUInt()

public actual fun jsGetRuntimeMemoryUsage(runtime: ConstPtr<CVoid>, memoryusage: MutPtr<ULong>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(runtime.rawAddress, memoryusage.rawAddress).toUInt()

public actual fun jsGetStringLength(stringvalue: ConstPtr<CVoid>, length: MutPtr<Int>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetStringLength(stringvalue.rawAddress, length.rawAddress).toUInt()

public actual fun jsGetTrueValue(truevalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetTrueValue(truevalue.rawAddress).toUInt()

public actual fun jsGetUndefinedValue(undefinedvalue: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetUndefinedValue(undefinedvalue.rawAddress).toUInt()

public actual fun jsGetValueType(value: ConstPtr<CVoid>, type: MutPtr<JsValueType>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsGetValueType(value.rawAddress, type.rawAddress).toUInt()

public actual fun jsHasException(hasexception: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsHasException(hasexception.rawAddress).toUInt()

public actual fun jsHasExternalData(obj: ConstPtr<CVoid>, value: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsHasExternalData(obj.rawAddress, value.rawAddress).toUInt()

public actual fun jsHasIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsHasIndexedProperty(obj.rawAddress, index.rawAddress, result.rawAddress).toUInt()

public actual fun jsHasProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, hasproperty: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsHasProperty(obj.rawAddress, propertyid.rawAddress, hasproperty.rawAddress).toUInt()

public actual fun jsIdle(nextidletick: MutPtr<UInt>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsIdle(nextidletick.rawAddress).toUInt()

public actual fun jsIntToNumber(intvalue: Int, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsIntToNumber(intvalue, value.rawAddress).toUInt()

public actual fun jsIsEnumeratingHeap(isenumeratingheap: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsIsEnumeratingHeap(isenumeratingheap.rawAddress).toUInt()

public actual fun jsIsRuntimeExecutionDisabled(runtime: ConstPtr<CVoid>, isdisabled: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(runtime.rawAddress, isdisabled.rawAddress).toUInt()

public actual fun jsNumberToDouble(value: ConstPtr<CVoid>, doublevalue: MutPtr<Double>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsNumberToDouble(value.rawAddress, doublevalue.rawAddress).toUInt()

public actual fun jsParseScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsParseScript(script.rawAddress, sourcecontext.toLong(), sourceurl.rawAddress, result.rawAddress).toUInt()

public actual fun jsParseSerializedScript(script: Pcwstr, buffer: ConstPtr<UByte>, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsParseSerializedScript(script.rawAddress, buffer.rawAddress, sourcecontext.toLong(), sourceurl.rawAddress, result.rawAddress).toUInt()

public actual fun jsPointerToString(stringvalue: Pcwstr, stringlength: ULong, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsPointerToString(stringvalue.rawAddress, stringlength.toLong(), value.rawAddress).toUInt()

public actual fun jsPreventExtension(obj: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsPreventExtension(obj.rawAddress).toUInt()

public actual fun jsRelease(ref: ConstPtr<CVoid>, count: MutPtr<UInt>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsRelease(ref.rawAddress, count.rawAddress).toUInt()

public actual fun jsRunScript(script: Pcwstr, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsRunScript(script.rawAddress, sourcecontext.toLong(), sourceurl.rawAddress, result.rawAddress).toUInt()

public actual fun jsRunSerializedScript(script: Pcwstr, buffer: ConstPtr<UByte>, sourcecontext: ULong, sourceurl: Pcwstr, result: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsRunSerializedScript(script.rawAddress, buffer.rawAddress, sourcecontext.toLong(), sourceurl.rawAddress, result.rawAddress).toUInt()

public actual fun jsSerializeScript(script: Pcwstr, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSerializeScript(script.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun jsSetCurrentContext(context: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetCurrentContext(context.rawAddress).toUInt()

public actual fun jsSetException(exception: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetException(exception.rawAddress).toUInt()

public actual fun jsSetExternalData(obj: ConstPtr<CVoid>, externaldata: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetExternalData(obj.rawAddress, externaldata.rawAddress).toUInt()

public actual fun jsSetIndexedProperty(obj: ConstPtr<CVoid>, index: ConstPtr<CVoid>, value: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetIndexedProperty(obj.rawAddress, index.rawAddress, value.rawAddress).toUInt()

public actual fun jsSetProperty(obj: ConstPtr<CVoid>, propertyid: ConstPtr<CVoid>, value: ConstPtr<CVoid>, usestrictrules: UByte): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetProperty(obj.rawAddress, propertyid.rawAddress, value.rawAddress, usestrictrules.toByte()).toUInt()

public actual fun jsSetPrototype(obj: ConstPtr<CVoid>, prototypeobject: ConstPtr<CVoid>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetPrototype(obj.rawAddress, prototypeobject.rawAddress).toUInt()

public actual fun jsSetRuntimeBeforeCollectCallback(runtime: ConstPtr<CVoid>, callbackstate: ConstPtr<CVoid>, beforecollectcallback: JsBeforeCollectCallback): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(runtime.rawAddress, callbackstate.rawAddress, 0L).toUInt()

public actual fun jsSetRuntimeMemoryAllocationCallback(runtime: ConstPtr<CVoid>, callbackstate: ConstPtr<CVoid>, allocationcallback: JsMemoryAllocationCallback): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(runtime.rawAddress, callbackstate.rawAddress, 0L).toUInt()

public actual fun jsSetRuntimeMemoryLimit(runtime: ConstPtr<CVoid>, memorylimit: ULong): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(runtime.rawAddress, memorylimit.toLong()).toUInt()

public actual fun jsStopProfiling(reason: Hresult): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsStopProfiling(reason).toUInt()

public actual fun jsStrictEquals(object1: ConstPtr<CVoid>, object2: ConstPtr<CVoid>, result: MutPtr<Boolean>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsStrictEquals(object1.rawAddress, object2.rawAddress, result.rawAddress).toUInt()

public actual fun jsStringToPointer(value: ConstPtr<CVoid>, stringvalue: MutPtr<MutPtr<UShort>>, stringlength: MutPtr<ULong>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsStringToPointer(value.rawAddress, stringvalue.rawAddress, stringlength.rawAddress).toUInt()

public actual fun jsValueToVariant(obj: ConstPtr<CVoid>, variant: MutPtr<Variant.Variant>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsValueToVariant(obj.rawAddress, variant.rawAddress).toUInt()

public actual fun jsVariantToValue(variant: ConstPtr<Variant.Variant>, value: MutPtr<MutPtr<CVoid>>): JsErrorCode =
    WindowsWin32SystemJsJniBridge.windowssysWindowsWin32SystemJsJsVariantToValue(variant.rawAddress, value.rawAddress).toUInt()
