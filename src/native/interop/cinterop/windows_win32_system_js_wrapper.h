#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_js_JsAddRef(void* ref, void* count);
uint32_t windowssys_windows_win32_system_js_JsBoolToBoolean(uint8_t value, void* booleanvalue);
uint32_t windowssys_windows_win32_system_js_JsBooleanToBool(void* value, void* boolvalue);
uint32_t windowssys_windows_win32_system_js_JsCallFunction(void* function, void* arguments, uint16_t argumentcount, void* result);
uint32_t windowssys_windows_win32_system_js_JsCollectGarbage(void* runtime);
uint32_t windowssys_windows_win32_system_js_JsConstructObject(void* function, void* arguments, uint16_t argumentcount, void* result);
uint32_t windowssys_windows_win32_system_js_JsConvertValueToBoolean(void* value, void* booleanvalue);
uint32_t windowssys_windows_win32_system_js_JsConvertValueToNumber(void* value, void* numbervalue);
uint32_t windowssys_windows_win32_system_js_JsConvertValueToObject(void* value, void* object);
uint32_t windowssys_windows_win32_system_js_JsConvertValueToString(void* value, void* stringvalue);
uint32_t windowssys_windows_win32_system_js_JsCreateArray(uint32_t length, void* result);
uint32_t windowssys_windows_win32_system_js_JsCreateError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_JsCreateExternalObject(void* data, void* finalizecallback, void* object);
uint32_t windowssys_windows_win32_system_js_JsCreateFunction(void* nativefunction, void* callbackstate, void* function);
uint32_t windowssys_windows_win32_system_js_JsCreateObject(void* object);
uint32_t windowssys_windows_win32_system_js_JsCreateRangeError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_JsCreateReferenceError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_JsCreateRuntime(int32_t attributes, int32_t runtimeversion, void* threadservice, void* runtime);
uint32_t windowssys_windows_win32_system_js_JsCreateSyntaxError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_JsCreateTypeError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_JsCreateURIError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_JsDefineProperty(void* object, void* propertyid, void* propertydescriptor, void* result);
uint32_t windowssys_windows_win32_system_js_JsDeleteIndexedProperty(void* object, void* arg_1_index);
uint32_t windowssys_windows_win32_system_js_JsDeleteProperty(void* object, void* propertyid, uint8_t usestrictrules, void* result);
uint32_t windowssys_windows_win32_system_js_JsDisableRuntimeExecution(void* runtime);
uint32_t windowssys_windows_win32_system_js_JsDisposeRuntime(void* runtime);
uint32_t windowssys_windows_win32_system_js_JsDoubleToNumber(double doublevalue, void* value);
uint32_t windowssys_windows_win32_system_js_JsEnableRuntimeExecution(void* runtime);
uint32_t windowssys_windows_win32_system_js_JsEquals(void* object1, void* object2, void* result);
uint32_t windowssys_windows_win32_system_js_JsGetAndClearException(void* exception);
uint32_t windowssys_windows_win32_system_js_JsGetCurrentContext(void* currentcontext);
uint32_t windowssys_windows_win32_system_js_JsGetExtensionAllowed(void* object, void* value);
uint32_t windowssys_windows_win32_system_js_JsGetExternalData(void* object, void* externaldata);
uint32_t windowssys_windows_win32_system_js_JsGetFalseValue(void* falsevalue);
uint32_t windowssys_windows_win32_system_js_JsGetGlobalObject(void* globalobject);
uint32_t windowssys_windows_win32_system_js_JsGetIndexedProperty(void* object, void* arg_1_index, void* result);
uint32_t windowssys_windows_win32_system_js_JsGetNullValue(void* nullvalue);
uint32_t windowssys_windows_win32_system_js_JsGetOwnPropertyDescriptor(void* object, void* propertyid, void* propertydescriptor);
uint32_t windowssys_windows_win32_system_js_JsGetOwnPropertyNames(void* object, void* propertynames);
uint32_t windowssys_windows_win32_system_js_JsGetProperty(void* object, void* propertyid, void* value);
uint32_t windowssys_windows_win32_system_js_JsGetPropertyIdFromName(void* name, void* propertyid);
uint32_t windowssys_windows_win32_system_js_JsGetPropertyNameFromId(void* propertyid, void* name);
uint32_t windowssys_windows_win32_system_js_JsGetPrototype(void* object, void* prototypeobject);
uint32_t windowssys_windows_win32_system_js_JsGetRuntime(void* context, void* runtime);
uint32_t windowssys_windows_win32_system_js_JsGetRuntimeMemoryLimit(void* runtime, void* memorylimit);
uint32_t windowssys_windows_win32_system_js_JsGetRuntimeMemoryUsage(void* runtime, void* memoryusage);
uint32_t windowssys_windows_win32_system_js_JsGetStringLength(void* stringvalue, void* length);
uint32_t windowssys_windows_win32_system_js_JsGetTrueValue(void* truevalue);
uint32_t windowssys_windows_win32_system_js_JsGetUndefinedValue(void* undefinedvalue);
uint32_t windowssys_windows_win32_system_js_JsGetValueType(void* value, void* type);
uint32_t windowssys_windows_win32_system_js_JsHasException(void* hasexception);
uint32_t windowssys_windows_win32_system_js_JsHasExternalData(void* object, void* value);
uint32_t windowssys_windows_win32_system_js_JsHasIndexedProperty(void* object, void* arg_1_index, void* result);
uint32_t windowssys_windows_win32_system_js_JsHasProperty(void* object, void* propertyid, void* hasproperty);
uint32_t windowssys_windows_win32_system_js_JsIdle(void* nextidletick);
uint32_t windowssys_windows_win32_system_js_JsIntToNumber(int32_t intvalue, void* value);
uint32_t windowssys_windows_win32_system_js_JsIsEnumeratingHeap(void* isenumeratingheap);
uint32_t windowssys_windows_win32_system_js_JsIsRuntimeExecutionDisabled(void* runtime, void* isdisabled);
uint32_t windowssys_windows_win32_system_js_JsNumberToDouble(void* value, void* doublevalue);
uint32_t windowssys_windows_win32_system_js_JsParseScript(void* script, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssys_windows_win32_system_js_JsParseSerializedScript(void* script, void* buffer, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssys_windows_win32_system_js_JsPointerToString(void* stringvalue, uint64_t stringlength, void* value);
uint32_t windowssys_windows_win32_system_js_JsPreventExtension(void* object);
uint32_t windowssys_windows_win32_system_js_JsRelease(void* ref, void* count);
uint32_t windowssys_windows_win32_system_js_JsRunScript(void* script, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssys_windows_win32_system_js_JsRunSerializedScript(void* script, void* buffer, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssys_windows_win32_system_js_JsSerializeScript(void* script, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_js_JsSetCurrentContext(void* context);
uint32_t windowssys_windows_win32_system_js_JsSetException(void* exception);
uint32_t windowssys_windows_win32_system_js_JsSetExternalData(void* object, void* externaldata);
uint32_t windowssys_windows_win32_system_js_JsSetIndexedProperty(void* object, void* arg_1_index, void* value);
uint32_t windowssys_windows_win32_system_js_JsSetProperty(void* object, void* propertyid, void* value, uint8_t usestrictrules);
uint32_t windowssys_windows_win32_system_js_JsSetPrototype(void* object, void* prototypeobject);
uint32_t windowssys_windows_win32_system_js_JsSetRuntimeBeforeCollectCallback(void* runtime, void* callbackstate, void* beforecollectcallback);
uint32_t windowssys_windows_win32_system_js_JsSetRuntimeMemoryAllocationCallback(void* runtime, void* callbackstate, void* allocationcallback);
uint32_t windowssys_windows_win32_system_js_JsSetRuntimeMemoryLimit(void* runtime, uint64_t memorylimit);
uint32_t windowssys_windows_win32_system_js_JsStopProfiling(int32_t reason);
uint32_t windowssys_windows_win32_system_js_JsStrictEquals(void* object1, void* object2, void* result);
uint32_t windowssys_windows_win32_system_js_JsStringToPointer(void* value, void* stringvalue, void* stringlength);
uint32_t windowssys_windows_win32_system_js_JsValueToVariant(void* object, void* variant);
uint32_t windowssys_windows_win32_system_js_JsVariantToValue(void* variant, void* value);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H */
