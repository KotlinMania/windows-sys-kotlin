#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemJsJsAddRef(void* ref, void* count);
uint32_t windowssysWindowsWin32SystemJsJsBoolToBoolean(uint8_t value, void* booleanvalue);
uint32_t windowssysWindowsWin32SystemJsJsBooleanToBool(void* value, void* boolvalue);
uint32_t windowssysWindowsWin32SystemJsJsCallFunction(void* function, void* arguments, uint16_t argumentcount, void* result);
uint32_t windowssysWindowsWin32SystemJsJsCollectGarbage(void* runtime);
uint32_t windowssysWindowsWin32SystemJsJsConstructObject(void* function, void* arguments, uint16_t argumentcount, void* result);
uint32_t windowssysWindowsWin32SystemJsJsConvertValueToBoolean(void* value, void* booleanvalue);
uint32_t windowssysWindowsWin32SystemJsJsConvertValueToNumber(void* value, void* numbervalue);
uint32_t windowssysWindowsWin32SystemJsJsConvertValueToObject(void* value, void* object);
uint32_t windowssysWindowsWin32SystemJsJsConvertValueToString(void* value, void* stringvalue);
uint32_t windowssysWindowsWin32SystemJsJsCreateArray(uint32_t length, void* result);
uint32_t windowssysWindowsWin32SystemJsJsCreateError(void* message, void* error);
uint32_t windowssysWindowsWin32SystemJsJsCreateExternalObject(void* data, void* finalizecallback, void* object);
uint32_t windowssysWindowsWin32SystemJsJsCreateFunction(void* nativefunction, void* callbackstate, void* function);
uint32_t windowssysWindowsWin32SystemJsJsCreateObject(void* object);
uint32_t windowssysWindowsWin32SystemJsJsCreateRangeError(void* message, void* error);
uint32_t windowssysWindowsWin32SystemJsJsCreateReferenceError(void* message, void* error);
uint32_t windowssysWindowsWin32SystemJsJsCreateRuntime(int32_t attributes, int32_t runtimeversion, void* threadservice, void* runtime);
uint32_t windowssysWindowsWin32SystemJsJsCreateSyntaxError(void* message, void* error);
uint32_t windowssysWindowsWin32SystemJsJsCreateTypeError(void* message, void* error);
uint32_t windowssysWindowsWin32SystemJsJsCreateURIError(void* message, void* error);
uint32_t windowssysWindowsWin32SystemJsJsDefineProperty(void* object, void* propertyid, void* propertydescriptor, void* result);
uint32_t windowssysWindowsWin32SystemJsJsDeleteIndexedProperty(void* object, void* arg1Index);
uint32_t windowssysWindowsWin32SystemJsJsDeleteProperty(void* object, void* propertyid, uint8_t usestrictrules, void* result);
uint32_t windowssysWindowsWin32SystemJsJsDisableRuntimeExecution(void* runtime);
uint32_t windowssysWindowsWin32SystemJsJsDisposeRuntime(void* runtime);
uint32_t windowssysWindowsWin32SystemJsJsDoubleToNumber(double doublevalue, void* value);
uint32_t windowssysWindowsWin32SystemJsJsEnableRuntimeExecution(void* runtime);
uint32_t windowssysWindowsWin32SystemJsJsEquals(void* object1, void* object2, void* result);
uint32_t windowssysWindowsWin32SystemJsJsGetAndClearException(void* exception);
uint32_t windowssysWindowsWin32SystemJsJsGetCurrentContext(void* currentcontext);
uint32_t windowssysWindowsWin32SystemJsJsGetExtensionAllowed(void* object, void* value);
uint32_t windowssysWindowsWin32SystemJsJsGetExternalData(void* object, void* externaldata);
uint32_t windowssysWindowsWin32SystemJsJsGetFalseValue(void* falsevalue);
uint32_t windowssysWindowsWin32SystemJsJsGetGlobalObject(void* globalobject);
uint32_t windowssysWindowsWin32SystemJsJsGetIndexedProperty(void* object, void* arg1Index, void* result);
uint32_t windowssysWindowsWin32SystemJsJsGetNullValue(void* nullvalue);
uint32_t windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(void* object, void* propertyid, void* propertydescriptor);
uint32_t windowssysWindowsWin32SystemJsJsGetOwnPropertyNames(void* object, void* propertynames);
uint32_t windowssysWindowsWin32SystemJsJsGetProperty(void* object, void* propertyid, void* value);
uint32_t windowssysWindowsWin32SystemJsJsGetPropertyIdFromName(void* name, void* propertyid);
uint32_t windowssysWindowsWin32SystemJsJsGetPropertyNameFromId(void* propertyid, void* name);
uint32_t windowssysWindowsWin32SystemJsJsGetPrototype(void* object, void* prototypeobject);
uint32_t windowssysWindowsWin32SystemJsJsGetRuntime(void* context, void* runtime);
uint32_t windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(void* runtime, void* memorylimit);
uint32_t windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(void* runtime, void* memoryusage);
uint32_t windowssysWindowsWin32SystemJsJsGetStringLength(void* stringvalue, void* length);
uint32_t windowssysWindowsWin32SystemJsJsGetTrueValue(void* truevalue);
uint32_t windowssysWindowsWin32SystemJsJsGetUndefinedValue(void* undefinedvalue);
uint32_t windowssysWindowsWin32SystemJsJsGetValueType(void* value, void* type);
uint32_t windowssysWindowsWin32SystemJsJsHasException(void* hasexception);
uint32_t windowssysWindowsWin32SystemJsJsHasExternalData(void* object, void* value);
uint32_t windowssysWindowsWin32SystemJsJsHasIndexedProperty(void* object, void* arg1Index, void* result);
uint32_t windowssysWindowsWin32SystemJsJsHasProperty(void* object, void* propertyid, void* hasproperty);
uint32_t windowssysWindowsWin32SystemJsJsIdle(void* nextidletick);
uint32_t windowssysWindowsWin32SystemJsJsIntToNumber(int32_t intvalue, void* value);
uint32_t windowssysWindowsWin32SystemJsJsIsEnumeratingHeap(void* isenumeratingheap);
uint32_t windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(void* runtime, void* isdisabled);
uint32_t windowssysWindowsWin32SystemJsJsNumberToDouble(void* value, void* doublevalue);
uint32_t windowssysWindowsWin32SystemJsJsParseScript(void* script, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssysWindowsWin32SystemJsJsParseSerializedScript(void* script, void* buffer, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssysWindowsWin32SystemJsJsPointerToString(void* stringvalue, uint64_t stringlength, void* value);
uint32_t windowssysWindowsWin32SystemJsJsPreventExtension(void* object);
uint32_t windowssysWindowsWin32SystemJsJsRelease(void* ref, void* count);
uint32_t windowssysWindowsWin32SystemJsJsRunScript(void* script, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssysWindowsWin32SystemJsJsRunSerializedScript(void* script, void* buffer, uint64_t sourcecontext, void* sourceurl, void* result);
uint32_t windowssysWindowsWin32SystemJsJsSerializeScript(void* script, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemJsJsSetCurrentContext(void* context);
uint32_t windowssysWindowsWin32SystemJsJsSetException(void* exception);
uint32_t windowssysWindowsWin32SystemJsJsSetExternalData(void* object, void* externaldata);
uint32_t windowssysWindowsWin32SystemJsJsSetIndexedProperty(void* object, void* arg1Index, void* value);
uint32_t windowssysWindowsWin32SystemJsJsSetProperty(void* object, void* propertyid, void* value, uint8_t usestrictrules);
uint32_t windowssysWindowsWin32SystemJsJsSetPrototype(void* object, void* prototypeobject);
uint32_t windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(void* runtime, void* callbackstate, void* beforecollectcallback);
uint32_t windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(void* runtime, void* callbackstate, void* allocationcallback);
uint32_t windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(void* runtime, uint64_t memorylimit);
uint32_t windowssysWindowsWin32SystemJsJsStopProfiling(int32_t reason);
uint32_t windowssysWindowsWin32SystemJsJsStrictEquals(void* object1, void* object2, void* result);
uint32_t windowssysWindowsWin32SystemJsJsStringToPointer(void* value, void* stringvalue, void* stringlength);
uint32_t windowssysWindowsWin32SystemJsJsValueToVariant(void* object, void* variant);
uint32_t windowssysWindowsWin32SystemJsJsVariantToValue(void* variant, void* value);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JS_WINDOWS_WIN32_SYSTEM_JS_WRAPPER_H */
