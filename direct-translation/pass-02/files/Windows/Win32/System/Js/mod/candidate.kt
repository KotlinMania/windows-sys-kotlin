// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsAddRef(r#ref : *const core::ffi::c_void, count : *mut u32) -> JsErrorCode);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsBoolToBoolean(value : u8, booleanvalue : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsBooleanToBool(value : *const core::ffi::c_void, boolvalue : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCallFunction(function : *const core::ffi::c_void, arguments : *const *const core::ffi::c_void, argumentcount : u16, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCollectGarbage(runtime : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsConstructObject(function : *const core::ffi::c_void, arguments : *const *const core::ffi::c_void, argumentcount : u16, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsConvertValueToBoolean(value : *const core::ffi::c_void, booleanvalue : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsConvertValueToNumber(value : *const core::ffi::c_void, numbervalue : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsConvertValueToObject(value : *const core::ffi::c_void, object : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsConvertValueToString(value : *const core::ffi::c_void, stringvalue : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateArray(length : u32, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateError(message : *const core::ffi::c_void, error : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateExternalObject(data : *const core::ffi::c_void, finalizecallback : JsFinalizeCallback, object : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateFunction(nativefunction : JsNativeFunction, callbackstate : *const core::ffi::c_void, function : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateObject(object : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateRangeError(message : *const core::ffi::c_void, error : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateReferenceError(message : *const core::ffi::c_void, error : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateRuntime(attributes : JsRuntimeAttributes, runtimeversion : JsRuntimeVersion, threadservice : JsThreadServiceCallback, runtime : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateSyntaxError(message : *const core::ffi::c_void, error : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateTypeError(message : *const core::ffi::c_void, error : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsCreateURIError(message : *const core::ffi::c_void, error : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsDefineProperty(object : *const core::ffi::c_void, propertyid : *const core::ffi::c_void, propertydescriptor : *const core::ffi::c_void, result : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsDeleteIndexedProperty(object : *const core::ffi::c_void, index : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsDeleteProperty(object : *const core::ffi::c_void, propertyid : *const core::ffi::c_void, usestrictrules : u8, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsDisableRuntimeExecution(runtime : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsDisposeRuntime(runtime : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsDoubleToNumber(doublevalue : f64, value : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsEnableRuntimeExecution(runtime : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsEquals(object1 : *const core::ffi::c_void, object2 : *const core::ffi::c_void, result : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetAndClearException(exception : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetCurrentContext(currentcontext : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetExtensionAllowed(object : *const core::ffi::c_void, value : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetExternalData(object : *const core::ffi::c_void, externaldata : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetFalseValue(falsevalue : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetGlobalObject(globalobject : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetIndexedProperty(object : *const core::ffi::c_void, index : *const core::ffi::c_void, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetNullValue(nullvalue : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetOwnPropertyDescriptor(object : *const core::ffi::c_void, propertyid : *const core::ffi::c_void, propertydescriptor : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetOwnPropertyNames(object : *const core::ffi::c_void, propertynames : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetProperty(object : *const core::ffi::c_void, propertyid : *const core::ffi::c_void, value : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetPropertyIdFromName(name : windows_sys::core::PCWSTR, propertyid : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetPropertyNameFromId(propertyid : *const core::ffi::c_void, name : *mut *mut u16) -> JsErrorCode);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetPrototype(object : *const core::ffi::c_void, prototypeobject : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetRuntime(context : *const core::ffi::c_void, runtime : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetRuntimeMemoryLimit(runtime : *const core::ffi::c_void, memorylimit : *mut usize) -> JsErrorCode);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetRuntimeMemoryUsage(runtime : *const core::ffi::c_void, memoryusage : *mut usize) -> JsErrorCode);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetStringLength(stringvalue : *const core::ffi::c_void, length : *mut i32) -> JsErrorCode);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetTrueValue(truevalue : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetUndefinedValue(undefinedvalue : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsGetValueType(value : *const core::ffi::c_void, r#type : *mut JsValueType) -> JsErrorCode);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsHasException(hasexception : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsHasExternalData(object : *const core::ffi::c_void, value : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsHasIndexedProperty(object : *const core::ffi::c_void, index : *const core::ffi::c_void, result : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsHasProperty(object : *const core::ffi::c_void, propertyid : *const core::ffi::c_void, hasproperty : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsIdle(nextidletick : *mut u32) -> JsErrorCode);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsIntToNumber(intvalue : i32, value : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsIsEnumeratingHeap(isenumeratingheap : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsIsRuntimeExecutionDisabled(runtime : *const core::ffi::c_void, isdisabled : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsNumberToDouble(value : *const core::ffi::c_void, doublevalue : *mut f64) -> JsErrorCode);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsParseScript(script : windows_sys::core::PCWSTR, sourcecontext : usize, sourceurl : windows_sys::core::PCWSTR, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsParseSerializedScript(script : windows_sys::core::PCWSTR, buffer : *const u8, sourcecontext : usize, sourceurl : windows_sys::core::PCWSTR, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsPointerToString(stringvalue : windows_sys::core::PCWSTR, stringlength : usize, value : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsPreventExtension(object : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsRelease(r#ref : *const core::ffi::c_void, count : *mut u32) -> JsErrorCode);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsRunScript(script : windows_sys::core::PCWSTR, sourcecontext : usize, sourceurl : windows_sys::core::PCWSTR, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsRunSerializedScript(script : windows_sys::core::PCWSTR, buffer : *const u8, sourcecontext : usize, sourceurl : windows_sys::core::PCWSTR, result : *mut *mut core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSerializeScript(script : windows_sys::core::PCWSTR, buffer : *mut u8, buffersize : *mut u32) -> JsErrorCode);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetCurrentContext(context : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetException(exception : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetExternalData(object : *const core::ffi::c_void, externaldata : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetIndexedProperty(object : *const core::ffi::c_void, index : *const core::ffi::c_void, value : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetProperty(object : *const core::ffi::c_void, propertyid : *const core::ffi::c_void, value : *const core::ffi::c_void, usestrictrules : u8) -> JsErrorCode);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetPrototype(object : *const core::ffi::c_void, prototypeobject : *const core::ffi::c_void) -> JsErrorCode);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetRuntimeBeforeCollectCallback(runtime : *const core::ffi::c_void, callbackstate : *const core::ffi::c_void, beforecollectcallback : JsBeforeCollectCallback) -> JsErrorCode);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetRuntimeMemoryAllocationCallback(runtime : *const core::ffi::c_void, callbackstate : *const core::ffi::c_void, allocationcallback : JsMemoryAllocationCallback) -> JsErrorCode);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsSetRuntimeMemoryLimit(runtime : *const core::ffi::c_void, memorylimit : usize) -> JsErrorCode);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsStopProfiling(reason : windows_sys::core::HRESULT) -> JsErrorCode);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsStrictEquals(object1 : *const core::ffi::c_void, object2 : *const core::ffi::c_void, result : *mut bool) -> JsErrorCode);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("chakra.dll" "system" fn JsStringToPointer(value : *const core::ffi::c_void, stringvalue : *mut *mut u16, stringlength : *mut usize) -> JsErrorCode);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("chakra.dll" "system" fn JsValueToVariant(object : *const core::ffi::c_void, variant : *mut super::Variant:: VARIANT) -> JsErrorCode);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("chakra.dll" "system" fn JsVariantToValue(variant : *const super::Variant:: VARIANT, value : *mut *mut core::ffi::c_void) -> JsErrorCode);

public const val `JS_SOURCE_CONTEXT_NONE`: ULong = 18446744073709551615uL;
public const val `JsArray`: `JsValueType` = 8;
// UNSUPPORTED Rust 86:1: generic scalar type unsupported
// pub type JsBackgroundWorkItemCallback = Option<unsafe extern "system" fn(callbackstate: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 87:1: generic scalar type unsupported
// pub type JsBeforeCollectCallback = Option<unsafe extern "system" fn(callbackstate: *const core::ffi::c_void)>;

public const val `JsBoolean`: `JsValueType` = 4;
public const val `JsError`: `JsValueType` = 7;
public const val `JsErrorAlreadyDebuggingContext`: `JsErrorCode` = 65552u;
public const val `JsErrorAlreadyProfilingContext`: `JsErrorCode` = 65553u;
public const val `JsErrorArgumentNotObject`: `JsErrorCode` = 65548u;
public const val `JsErrorBadSerializedScript`: `JsErrorCode` = 65544u;
public const val `JsErrorCannotDisableExecution`: `JsErrorCode` = 65546u;
public const val `JsErrorCannotSerializeDebugScript`: `JsErrorCode` = 65551u;
public const val `JsErrorCategoryEngine`: `JsErrorCode` = 131072u;
public const val `JsErrorCategoryFatal`: `JsErrorCode` = 262144u;
public const val `JsErrorCategoryScript`: `JsErrorCode` = 196608u;
public const val `JsErrorCategoryUsage`: `JsErrorCode` = 65536u;
public typealias `JsErrorCode` = UInt;
public const val `JsErrorFatal`: `JsErrorCode` = 262145u;
public const val `JsErrorHeapEnumInProgress`: `JsErrorCode` = 65547u;
public const val `JsErrorIdleNotEnabled`: `JsErrorCode` = 65554u;
public const val `JsErrorInDisabledState`: `JsErrorCode` = 65545u;
public const val `JsErrorInExceptionState`: `JsErrorCode` = 65540u;
public const val `JsErrorInProfileCallback`: `JsErrorCode` = 65549u;
public const val `JsErrorInThreadServiceCallback`: `JsErrorCode` = 65550u;
public const val `JsErrorInvalidArgument`: `JsErrorCode` = 65537u;
public const val `JsErrorNoCurrentContext`: `JsErrorCode` = 65539u;
public const val `JsErrorNotImplemented`: `JsErrorCode` = 65541u;
public const val `JsErrorNullArgument`: `JsErrorCode` = 65538u;
public const val `JsErrorOutOfMemory`: `JsErrorCode` = 131073u;
public const val `JsErrorRuntimeInUse`: `JsErrorCode` = 65543u;
public const val `JsErrorScriptCompile`: `JsErrorCode` = 196610u;
public const val `JsErrorScriptEvalDisabled`: `JsErrorCode` = 196612u;
public const val `JsErrorScriptException`: `JsErrorCode` = 196609u;
public const val `JsErrorScriptTerminated`: `JsErrorCode` = 196611u;
public const val `JsErrorWrongThread`: `JsErrorCode` = 65542u;
// UNSUPPORTED Rust 119:1: generic scalar type unsupported
// pub type JsFinalizeCallback = Option<unsafe extern "system" fn(data: *const core::ffi::c_void)>;

public const val `JsFunction`: `JsValueType` = 6;
public const val `JsMemoryAllocate`: `JsMemoryEventType` = 0;
// UNSUPPORTED Rust 122:1: generic scalar type unsupported
// pub type JsMemoryAllocationCallback = Option<unsafe extern "system" fn(callbackstate: *const core::ffi::c_void, allocationevent: JsMemoryEventType, allocationsize: usize) -> bool>;

public typealias `JsMemoryEventType` = Int;
public const val `JsMemoryFailure`: `JsMemoryEventType` = 2;
public const val `JsMemoryFree`: `JsMemoryEventType` = 1;
// UNSUPPORTED Rust 126:1: generic scalar type unsupported
// pub type JsNativeFunction = Option<unsafe extern "system" fn(callee: *const core::ffi::c_void, isconstructcall: bool, arguments: *const *const core::ffi::c_void, argumentcount: u16, callbackstate: *const core::ffi::c_void) -> *mut core::ffi::c_void>;

public const val `JsNoError`: `JsErrorCode` = 0u;
public const val `JsNull`: `JsValueType` = 1;
public const val `JsNumber`: `JsValueType` = 2;
public const val `JsObject`: `JsValueType` = 5;
public const val `JsRuntimeAttributeAllowScriptInterrupt`: `JsRuntimeAttributes` = 2;
public const val `JsRuntimeAttributeDisableBackgroundWork`: `JsRuntimeAttributes` = 1;
public const val `JsRuntimeAttributeDisableEval`: `JsRuntimeAttributes` = 16;
public const val `JsRuntimeAttributeDisableNativeCodeGeneration`: `JsRuntimeAttributes` = 8;
public const val `JsRuntimeAttributeEnableIdleProcessing`: `JsRuntimeAttributes` = 4;
public const val `JsRuntimeAttributeNone`: `JsRuntimeAttributes` = 0;
public typealias `JsRuntimeAttributes` = Int;
public typealias `JsRuntimeVersion` = Int;
public const val `JsRuntimeVersion10`: `JsRuntimeVersion` = 0;
public const val `JsRuntimeVersion11`: `JsRuntimeVersion` = 1;
public const val `JsRuntimeVersionEdge`: `JsRuntimeVersion` = -1;
public const val `JsString`: `JsValueType` = 3;
// UNSUPPORTED Rust 143:1: generic scalar type unsupported
// pub type JsThreadServiceCallback = Option<unsafe extern "system" fn(callback: JsBackgroundWorkItemCallback, callbackstate: *const core::ffi::c_void) -> bool>;

public const val `JsUndefined`: `JsValueType` = 0;
public typealias `JsValueType` = Int;
