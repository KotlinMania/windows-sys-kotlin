#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_js_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#else
#include <dlfcn.h>
#ifndef RTLD_DEFAULT
#define RTLD_DEFAULT ((void*)0)
#endif
#endif

uint32_t windowssys_windows_win32_system_js_jsAddRef(void* ref, void* count) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsAddRef");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ref, count);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ref;
    (void)count;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsBoolToBoolean(uint8_t value, void* booleanvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsBoolToBoolean");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, booleanvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)booleanvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsBooleanToBool(void* value, void* boolvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsBooleanToBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, boolvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)boolvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCallFunction(void* function, void* arguments, uint16_t argumentcount, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCallFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, arguments, argumentcount, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)function;
    (void)arguments;
    (void)argumentcount;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCollectGarbage(void* runtime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCollectGarbage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsConstructObject(void* function, void* arguments, uint16_t argumentcount, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConstructObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, arguments, argumentcount, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)function;
    (void)arguments;
    (void)argumentcount;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsConvertValueToBoolean(void* value, void* booleanvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConvertValueToBoolean");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, booleanvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)booleanvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsConvertValueToNumber(void* value, void* numbervalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConvertValueToNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, numbervalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)numbervalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsConvertValueToObject(void* value, void* object) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConvertValueToObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, object);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)object;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsConvertValueToString(void* value, void* stringvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConvertValueToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, stringvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)stringvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateArray(uint32_t length, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(length, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)length;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateError(void* message, void* error) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateExternalObject(void* data, void* finalizecallback, void* object) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateExternalObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, finalizecallback, object);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)data;
    (void)finalizecallback;
    (void)object;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateFunction(void* nativefunction, void* callbackstate, void* function) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nativefunction, callbackstate, function);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nativefunction;
    (void)callbackstate;
    (void)function;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateObject(void* object) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateRangeError(void* message, void* error) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateRangeError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateReferenceError(void* message, void* error) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateReferenceError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateRuntime(int32_t attributes, int32_t runtimeversion, void* threadservice, void* runtime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateRuntime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attributes, runtimeversion, threadservice, runtime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)attributes;
    (void)runtimeversion;
    (void)threadservice;
    (void)runtime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateSyntaxError(void* message, void* error) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateSyntaxError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateTypeError(void* message, void* error) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateTypeError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsCreateURIError(void* message, void* error) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateURIError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsDefineProperty(void* object, void* propertyid, void* propertydescriptor, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDefineProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, propertyid, propertydescriptor, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)propertyid;
    (void)propertydescriptor;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsDeleteIndexedProperty(void* object, void* arg_1_index) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDeleteIndexedProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, arg_1_index);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)arg_1_index;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsDeleteProperty(void* object, void* propertyid, uint8_t usestrictrules, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDeleteProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, propertyid, usestrictrules, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)propertyid;
    (void)usestrictrules;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsDisableRuntimeExecution(void* runtime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDisableRuntimeExecution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsDisposeRuntime(void* runtime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDisposeRuntime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsDoubleToNumber(double doublevalue, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDoubleToNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(doublevalue, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)doublevalue;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsEnableRuntimeExecution(void* runtime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsEnableRuntimeExecution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsEquals(void* object1, void* object2, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsEquals");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object1, object2, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object1;
    (void)object2;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetAndClearException(void* exception) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetAndClearException");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exception);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)exception;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetCurrentContext(void* currentcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetCurrentContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currentcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)currentcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetExtensionAllowed(void* object, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetExtensionAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetExternalData(void* object, void* externaldata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetExternalData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, externaldata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)externaldata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetFalseValue(void* falsevalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetFalseValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(falsevalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)falsevalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetGlobalObject(void* globalobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetGlobalObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(globalobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)globalobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetIndexedProperty(void* object, void* arg_1_index, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetIndexedProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, arg_1_index, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)arg_1_index;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetNullValue(void* nullvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetNullValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nullvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nullvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetOwnPropertyDescriptor(void* object, void* propertyid, void* propertydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetOwnPropertyDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, propertyid, propertydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)propertyid;
    (void)propertydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetOwnPropertyNames(void* object, void* propertynames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetOwnPropertyNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, propertynames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)propertynames;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetProperty(void* object, void* propertyid, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, propertyid, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)propertyid;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetPropertyIdFromName(void* name, void* propertyid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetPropertyIdFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, propertyid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)name;
    (void)propertyid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetPropertyNameFromId(void* propertyid, void* name) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetPropertyNameFromId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propertyid, name);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)propertyid;
    (void)name;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetPrototype(void* object, void* prototypeobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetPrototype");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, prototypeobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)prototypeobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetRuntime(void* context, void* runtime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetRuntime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, runtime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)context;
    (void)runtime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetRuntimeMemoryLimit(void* runtime, void* memorylimit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetRuntimeMemoryLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime, memorylimit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    (void)memorylimit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetRuntimeMemoryUsage(void* runtime, void* memoryusage) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetRuntimeMemoryUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime, memoryusage);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    (void)memoryusage;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetStringLength(void* stringvalue, void* length) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetStringLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringvalue, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)stringvalue;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetTrueValue(void* truevalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetTrueValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(truevalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)truevalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetUndefinedValue(void* undefinedvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetUndefinedValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(undefinedvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)undefinedvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsGetValueType(void* value, void* type) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetValueType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, type);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)type;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsHasException(void* hasexception) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsHasException");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hasexception);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hasexception;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsHasExternalData(void* object, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsHasExternalData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsHasIndexedProperty(void* object, void* arg_1_index, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsHasIndexedProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, arg_1_index, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)arg_1_index;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsHasProperty(void* object, void* propertyid, void* hasproperty) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsHasProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, propertyid, hasproperty);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)propertyid;
    (void)hasproperty;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsIdle(void* nextidletick) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsIdle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nextidletick);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nextidletick;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsIntToNumber(int32_t intvalue, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsIntToNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(intvalue, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)intvalue;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsIsEnumeratingHeap(void* isenumeratingheap) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsIsEnumeratingHeap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isenumeratingheap);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)isenumeratingheap;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsIsRuntimeExecutionDisabled(void* runtime, void* isdisabled) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsIsRuntimeExecutionDisabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime, isdisabled);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    (void)isdisabled;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsNumberToDouble(void* value, void* doublevalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsNumberToDouble");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, doublevalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)doublevalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsParseScript(void* script, uint64_t sourcecontext, void* sourceurl, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsParseScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script, sourcecontext, sourceurl, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)script;
    (void)sourcecontext;
    (void)sourceurl;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsParseSerializedScript(void* script, void* buffer, uint64_t sourcecontext, void* sourceurl, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsParseSerializedScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script, buffer, sourcecontext, sourceurl, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)script;
    (void)buffer;
    (void)sourcecontext;
    (void)sourceurl;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsPointerToString(void* stringvalue, uint64_t stringlength, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsPointerToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringvalue, stringlength, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)stringvalue;
    (void)stringlength;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsPreventExtension(void* object) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsPreventExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsRelease(void* ref, void* count) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ref, count);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ref;
    (void)count;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsRunScript(void* script, uint64_t sourcecontext, void* sourceurl, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsRunScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script, sourcecontext, sourceurl, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)script;
    (void)sourcecontext;
    (void)sourceurl;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsRunSerializedScript(void* script, void* buffer, uint64_t sourcecontext, void* sourceurl, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsRunSerializedScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script, buffer, sourcecontext, sourceurl, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)script;
    (void)buffer;
    (void)sourcecontext;
    (void)sourceurl;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSerializeScript(void* script, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSerializeScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)script;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetCurrentContext(void* context) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetCurrentContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)context;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetException(void* exception) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetException");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exception);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)exception;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetExternalData(void* object, void* externaldata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetExternalData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, externaldata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)externaldata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetIndexedProperty(void* object, void* arg_1_index, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetIndexedProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, arg_1_index, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)arg_1_index;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetProperty(void* object, void* propertyid, void* value, uint8_t usestrictrules) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, propertyid, value, usestrictrules);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)propertyid;
    (void)value;
    (void)usestrictrules;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetPrototype(void* object, void* prototypeobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetPrototype");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, prototypeobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)prototypeobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetRuntimeBeforeCollectCallback(void* runtime, void* callbackstate, void* beforecollectcallback) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetRuntimeBeforeCollectCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime, callbackstate, beforecollectcallback);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    (void)callbackstate;
    (void)beforecollectcallback;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetRuntimeMemoryAllocationCallback(void* runtime, void* callbackstate, void* allocationcallback) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetRuntimeMemoryAllocationCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime, callbackstate, allocationcallback);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    (void)callbackstate;
    (void)allocationcallback;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsSetRuntimeMemoryLimit(void* runtime, uint64_t memorylimit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetRuntimeMemoryLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtime, memorylimit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)runtime;
    (void)memorylimit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsStopProfiling(int32_t reason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsStopProfiling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsStrictEquals(void* object1, void* object2, void* result) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsStrictEquals");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object1, object2, result);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object1;
    (void)object2;
    (void)result;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsStringToPointer(void* value, void* stringvalue, void* stringlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsStringToPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value, stringvalue, stringlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    (void)stringvalue;
    (void)stringlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsValueToVariant(void* object, void* variant) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsValueToVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(object, variant);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)object;
    (void)variant;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_js_jsVariantToValue(void* variant, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsVariantToValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(variant, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)variant;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

