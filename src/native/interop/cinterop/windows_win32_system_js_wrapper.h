#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_js_jsAddRef(void* ref, void* count);
uint32_t windowssys_windows_win32_system_js_jsBoolToBoolean(uint8_t value, void* booleanvalue);
uint32_t windowssys_windows_win32_system_js_jsBooleanToBool(void* value, void* boolvalue);
uint32_t windowssys_windows_win32_system_js_jsCallFunction(void* function, void* arguments, uint16_t argumentcount, void* result);
uint32_t windowssys_windows_win32_system_js_jsCollectGarbage(void* runtime);
uint32_t windowssys_windows_win32_system_js_jsConstructObject(void* function, void* arguments, uint16_t argumentcount, void* result);
uint32_t windowssys_windows_win32_system_js_jsConvertValueToBoolean(void* value, void* booleanvalue);
uint32_t windowssys_windows_win32_system_js_jsConvertValueToNumber(void* value, void* numbervalue);
uint32_t windowssys_windows_win32_system_js_jsConvertValueToObject(void* value, void* object);
uint32_t windowssys_windows_win32_system_js_jsConvertValueToString(void* value, void* stringvalue);
uint32_t windowssys_windows_win32_system_js_jsCreateArray(uint32_t length, void* result);
uint32_t windowssys_windows_win32_system_js_jsCreateError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_jsCreateExternalObject(void* data, void* finalizecallback, void* object);
uint32_t windowssys_windows_win32_system_js_jsCreateFunction(void* nativefunction, void* callbackstate, void* function);
uint32_t windowssys_windows_win32_system_js_jsCreateObject(void* object);
uint32_t windowssys_windows_win32_system_js_jsCreateRangeError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_jsCreateReferenceError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_jsCreateRuntime(int32_t attributes, int32_t runtimeversion, void* threadservice, void* runtime);
uint32_t windowssys_windows_win32_system_js_jsCreateSyntaxError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_jsCreateTypeError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_jsCreateURIError(void* message, void* error);
uint32_t windowssys_windows_win32_system_js_jsDefineProperty(void* object, void* propertyid, void* propertydescriptor, void* result);
uint32_t windowssys_windows_win32_system_js_jsDeleteIndexedProperty(void* object, void* arg_1_index);
uint32_t windowssys_windows_win32_system_js_jsDeleteProperty(void* object, void* propertyid, uint8_t usestrictrules, void* result);
uint32_t windowssys_windows_win32_system_js_jsDisableRuntimeExecution(void* runtime);
uint32_t windowssys_windows_win32_system_js_jsDisposeRuntime(void* runtime);
uint32_t windowssys_windows_win32_system_js_jsDoubleToNumber(double doublevalue, void* value);
uint32_t windowssys_windows_win32_system_js_jsEnableRuntimeExecution(void* runtime);
uint32_t windowssys_windows_win32_system_js_jsEquals(void* object1, void* object2, void* result);
uint32_t windowssys_windows_win32_system_js_jsGetAndClearException(void* exception);
uint32_t windowssys_windows_win32_system_js_jsGetCurrentContext(void* currentcontext);
uint32_t windowssys_windows_win32_system_js_jsGetExtensionAllowed(void* object, void* value);
uint32_t windowssys_windows_win32_system_js_jsGetExternalData(void* object, void* externaldata);
uint32_t windowssys_windows_win32_system_js_jsGetFalseValue(void* falsevalue);
uint32_t windowssys_windows_win32_system_js_jsGetGlobalObject(void* globalobject);
uint32_t windowssys_windows_win32_system_js_jsGetIndexedProperty(void* object, void* arg_1_index, void* result);
uint32_t windowssys_windows_win32_system_js_jsGetNullValue(void* nullvalue);
uint32_t windowssys_windows_win32_system_js_jsGetOwnPropertyDescriptor(void* object, void* propertyid, void* propertydescriptor);
uint32_t windowssys_windows_win32_system_js_jsGetOwnPropertyNames(void* object, void* propertynames);
uint32_t windowssys_windows_win32_system_js_jsGetProperty(void* object, void* propertyid, void* value);
uint32_t windowssys_windows_win32_system_js_jsGetPropertyIdFromName(void* name, void* propertyid);
uint32_t windowssys_windows_win32_system_js_jsGetPropertyNameFromId(void* propertyid, void* name);
uint32_t windowssys_windows_win32_system_js_jsGetPrototype(void* object, void* prototypeobject);
uint32_t windowssys_windows_win32_system_js_jsGetRuntime(void* context, void* runtime);
uint32_t windowssys_windows_win32_system_js_jsGetRuntimeMemoryLimit(void* runtime, void* memorylimit);
uint32_t windowssys_windows_win32_system_js_jsGetRuntimeMemoryUsage(void* runtime, void* memoryusage);
uint32_t windowssys_windows_win32_system_js_jsGetStringLength(void* stringvalue, void* length);
uint32_t windowssys_windows_win32_system_js_jsGetTrueValue(void* truevalue);
uint32_t windowssys_windows_win32_system_js_jsGetUndefinedValue(void* undefinedvalue);
uint32_t windowssys_windows_win32_system_js_jsGetValueType(void* value, void* type);
uint32_t windowssys_windows_win32_system_js_jsHasException(void* hasexception);
uint32_t windowssys_windows_win32_system_js_jsHasExternalData(void* object, void* value);
uint32_t windowssys_windows_win32_system_js_jsHasIndexedProperty(void* object, void* arg_1_index, void* result);
uint32_t windowssys_windows_win32_system_js_jsHasProperty(void* object, void* propertyid, void* hasproperty);
uint32_t windowssys_windows_win32_system_js_jsIdle(void* nextidletick);
uint32_t windowssys_windows_win32_system_js_jsIntToNumber(int32_t intvalue, void* value);
uint32_t windowssys_windows_win32_system_js_jsIsEnumeratingHeap(void* isenumeratingheap);
uint32_t windowssys_windows_win32_system_js_jsIsRuntimeExecutionDisabled(void* runtime, void* isdisabled);
uint32_t windowssys_windows_win32_system_js_jsNumberToDouble(void* value, void* doublevalue);
uint32_t windowssys_windows_win32_system_js_jsParseScript(void* script, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssys_windows_win32_system_js_jsParseSerializedScript(void* script, void* buffer, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssys_windows_win32_system_js_jsPointerToString(void* stringvalue, uint64_t stringlength, void* value);
uint32_t windowssys_windows_win32_system_js_jsPreventExtension(void* object);
uint32_t windowssys_windows_win32_system_js_jsRelease(void* ref, void* count);
uint32_t windowssys_windows_win32_system_js_jsRunScript(void* script, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssys_windows_win32_system_js_jsRunSerializedScript(void* script, void* buffer, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssys_windows_win32_system_js_jsSerializeScript(void* script, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_js_jsSetCurrentContext(void* context);
uint32_t windowssys_windows_win32_system_js_jsSetException(void* exception);
uint32_t windowssys_windows_win32_system_js_jsSetExternalData(void* object, void* externaldata);
uint32_t windowssys_windows_win32_system_js_jsSetIndexedProperty(void* object, void* arg_1_index, void* value);
uint32_t windowssys_windows_win32_system_js_jsSetProperty(void* object, void* propertyid, void* value, uint8_t usestrictrules);
uint32_t windowssys_windows_win32_system_js_jsSetPrototype(void* object, void* prototypeobject);
uint32_t windowssys_windows_win32_system_js_jsSetRuntimeBeforeCollectCallback(void* runtime, void* callbackstate, void* beforecollectcallback);
uint32_t windowssys_windows_win32_system_js_jsSetRuntimeMemoryAllocationCallback(void* runtime, void* callbackstate, void* allocationcallback);
uint32_t windowssys_windows_win32_system_js_jsSetRuntimeMemoryLimit(void* runtime, uint64_t memorylimit);
uint32_t windowssys_windows_win32_system_js_jsStopProfiling(int32_t reason);
uint32_t windowssys_windows_win32_system_js_jsStrictEquals(void* object1, void* object2, void* result);
uint32_t windowssys_windows_win32_system_js_jsStringToPointer(void* value, void* stringvalue, void* stringlength);
uint32_t windowssys_windows_win32_system_js_jsValueToVariant(void* object, void* variant);
uint32_t windowssys_windows_win32_system_js_jsVariantToValue(void* variant, void* value);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H */
