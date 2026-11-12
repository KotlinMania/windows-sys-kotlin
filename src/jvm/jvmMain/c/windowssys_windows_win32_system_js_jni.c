#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsAddRef(JNIEnv* km_env, jclass km_clazz, jlong ref, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsAddRef");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ref, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ref;
    (void)count;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsBoolToBoolean(JNIEnv* km_env, jclass km_clazz, jbyte value, jlong booleanvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsBoolToBoolean");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)value, (void*)(uintptr_t)booleanvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)booleanvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsBooleanToBool(JNIEnv* km_env, jclass km_clazz, jlong value, jlong boolvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsBooleanToBool");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)boolvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)boolvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCallFunction(JNIEnv* km_env, jclass km_clazz, jlong function, jlong arguments, jshort argumentcount, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCallFunction");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)function, (void*)(uintptr_t)arguments, (uint16_t)argumentcount, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)function;
    (void)arguments;
    (void)argumentcount;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCollectGarbage(JNIEnv* km_env, jclass km_clazz, jlong runtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCollectGarbage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsConstructObject(JNIEnv* km_env, jclass km_clazz, jlong function, jlong arguments, jshort argumentcount, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConstructObject");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)function, (void*)(uintptr_t)arguments, (uint16_t)argumentcount, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)function;
    (void)arguments;
    (void)argumentcount;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsConvertValueToBoolean(JNIEnv* km_env, jclass km_clazz, jlong value, jlong booleanvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConvertValueToBoolean");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)booleanvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)booleanvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsConvertValueToNumber(JNIEnv* km_env, jclass km_clazz, jlong value, jlong numbervalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConvertValueToNumber");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)numbervalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)numbervalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsConvertValueToObject(JNIEnv* km_env, jclass km_clazz, jlong value, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConvertValueToObject");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)object);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)object;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsConvertValueToString(JNIEnv* km_env, jclass km_clazz, jlong value, jlong stringvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsConvertValueToString");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)stringvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)stringvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateArray(JNIEnv* km_env, jclass km_clazz, jint length, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateArray");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)length, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)length;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateError(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateExternalObject(JNIEnv* km_env, jclass km_clazz, jlong data, jlong finalizecallback, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateExternalObject");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)finalizecallback, (void*)(uintptr_t)object);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)finalizecallback;
    (void)object;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateFunction(JNIEnv* km_env, jclass km_clazz, jlong nativefunction, jlong callbackstate, jlong function) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateFunction");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nativefunction, (void*)(uintptr_t)callbackstate, (void*)(uintptr_t)function);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nativefunction;
    (void)callbackstate;
    (void)function;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateObject(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateObject");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateRangeError(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateRangeError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateReferenceError(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateReferenceError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateRuntime(JNIEnv* km_env, jclass km_clazz, jint attributes, jint runtimeversion, jlong threadservice, jlong runtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateRuntime");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)attributes, (int32_t)runtimeversion, (void*)(uintptr_t)threadservice, (void*)(uintptr_t)runtime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)attributes;
    (void)runtimeversion;
    (void)threadservice;
    (void)runtime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateSyntaxError(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateSyntaxError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateTypeError(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateTypeError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsCreateURIError(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsCreateURIError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsDefineProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong propertyid, jlong propertydescriptor, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDefineProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)propertyid, (void*)(uintptr_t)propertydescriptor, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)propertyid;
    (void)propertydescriptor;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsDeleteIndexedProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong arg1Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDeleteIndexedProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)arg1Index);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)arg1Index;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsDeleteProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong propertyid, jbyte usestrictrules, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDeleteProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)propertyid, (uint8_t)usestrictrules, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)propertyid;
    (void)usestrictrules;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsDisableRuntimeExecution(JNIEnv* km_env, jclass km_clazz, jlong runtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDisableRuntimeExecution");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsDisposeRuntime(JNIEnv* km_env, jclass km_clazz, jlong runtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDisposeRuntime");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsDoubleToNumber(JNIEnv* km_env, jclass km_clazz, jdouble doublevalue, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsDoubleToNumber");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)doublevalue, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)doublevalue;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsEnableRuntimeExecution(JNIEnv* km_env, jclass km_clazz, jlong runtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsEnableRuntimeExecution");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsEquals(JNIEnv* km_env, jclass km_clazz, jlong object1, jlong object2, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsEquals");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object1, (void*)(uintptr_t)object2, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object1;
    (void)object2;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetAndClearException(JNIEnv* km_env, jclass km_clazz, jlong exception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetAndClearException");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exception);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)exception;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetCurrentContext(JNIEnv* km_env, jclass km_clazz, jlong currentcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetCurrentContext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)currentcontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)currentcontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetExtensionAllowed(JNIEnv* km_env, jclass km_clazz, jlong object, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetExtensionAllowed");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetExternalData(JNIEnv* km_env, jclass km_clazz, jlong object, jlong externaldata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetExternalData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)externaldata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)externaldata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetFalseValue(JNIEnv* km_env, jclass km_clazz, jlong falsevalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetFalseValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)falsevalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)falsevalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetGlobalObject(JNIEnv* km_env, jclass km_clazz, jlong globalobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetGlobalObject");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)globalobject);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)globalobject;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetIndexedProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong arg1Index, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetIndexedProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)arg1Index, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)arg1Index;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetNullValue(JNIEnv* km_env, jclass km_clazz, jlong nullvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetNullValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nullvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nullvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetOwnPropertyDescriptor(JNIEnv* km_env, jclass km_clazz, jlong object, jlong propertyid, jlong propertydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetOwnPropertyDescriptor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)propertyid, (void*)(uintptr_t)propertydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)propertyid;
    (void)propertydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetOwnPropertyNames(JNIEnv* km_env, jclass km_clazz, jlong object, jlong propertynames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetOwnPropertyNames");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)propertynames);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)propertynames;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong propertyid, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)propertyid, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)propertyid;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetPropertyIdFromName(JNIEnv* km_env, jclass km_clazz, jlong name, jlong propertyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetPropertyIdFromName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)propertyid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)name;
    (void)propertyid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetPropertyNameFromId(JNIEnv* km_env, jclass km_clazz, jlong propertyid, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetPropertyNameFromId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propertyid, (void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)propertyid;
    (void)name;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetPrototype(JNIEnv* km_env, jclass km_clazz, jlong object, jlong prototypeobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetPrototype");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)prototypeobject);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)prototypeobject;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetRuntime(JNIEnv* km_env, jclass km_clazz, jlong context, jlong runtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetRuntime");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)runtime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)context;
    (void)runtime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetRuntimeMemoryLimit(JNIEnv* km_env, jclass km_clazz, jlong runtime, jlong memorylimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetRuntimeMemoryLimit");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime, (void*)(uintptr_t)memorylimit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    (void)memorylimit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetRuntimeMemoryUsage(JNIEnv* km_env, jclass km_clazz, jlong runtime, jlong memoryusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetRuntimeMemoryUsage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime, (void*)(uintptr_t)memoryusage);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    (void)memoryusage;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetStringLength(JNIEnv* km_env, jclass km_clazz, jlong stringvalue, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetStringLength");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringvalue, (void*)(uintptr_t)length);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)stringvalue;
    (void)length;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetTrueValue(JNIEnv* km_env, jclass km_clazz, jlong truevalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetTrueValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)truevalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)truevalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetUndefinedValue(JNIEnv* km_env, jclass km_clazz, jlong undefinedvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetUndefinedValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)undefinedvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)undefinedvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsGetValueType(JNIEnv* km_env, jclass km_clazz, jlong value, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsGetValueType");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)type);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)type;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsHasException(JNIEnv* km_env, jclass km_clazz, jlong hasexception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsHasException");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hasexception);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hasexception;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsHasExternalData(JNIEnv* km_env, jclass km_clazz, jlong object, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsHasExternalData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsHasIndexedProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong arg1Index, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsHasIndexedProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)arg1Index, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)arg1Index;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsHasProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong propertyid, jlong hasproperty) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsHasProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)propertyid, (void*)(uintptr_t)hasproperty);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)propertyid;
    (void)hasproperty;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsIdle(JNIEnv* km_env, jclass km_clazz, jlong nextidletick) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsIdle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nextidletick);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nextidletick;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsIntToNumber(JNIEnv* km_env, jclass km_clazz, jint intvalue, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsIntToNumber");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)intvalue, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)intvalue;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsIsEnumeratingHeap(JNIEnv* km_env, jclass km_clazz, jlong isenumeratingheap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsIsEnumeratingHeap");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)isenumeratingheap);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)isenumeratingheap;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsIsRuntimeExecutionDisabled(JNIEnv* km_env, jclass km_clazz, jlong runtime, jlong isdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsIsRuntimeExecutionDisabled");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime, (void*)(uintptr_t)isdisabled);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    (void)isdisabled;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsNumberToDouble(JNIEnv* km_env, jclass km_clazz, jlong value, jlong doublevalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsNumberToDouble");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)doublevalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)doublevalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsParseScript(JNIEnv* km_env, jclass km_clazz, jlong script, jlong sourcecontext, jlong sourceurl, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsParseScript");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)script, (uint64_t)sourcecontext, (void*)(uintptr_t)sourceurl, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)script;
    (void)sourcecontext;
    (void)sourceurl;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsParseSerializedScript(JNIEnv* km_env, jclass km_clazz, jlong script, jlong buffer, jlong sourcecontext, jlong sourceurl, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsParseSerializedScript");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)script, (void*)(uintptr_t)buffer, (uint64_t)sourcecontext, (void*)(uintptr_t)sourceurl, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)script;
    (void)buffer;
    (void)sourcecontext;
    (void)sourceurl;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsPointerToString(JNIEnv* km_env, jclass km_clazz, jlong stringvalue, jlong stringlength, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsPointerToString");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringvalue, (uint64_t)stringlength, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)stringvalue;
    (void)stringlength;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsPreventExtension(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsPreventExtension");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsRelease(JNIEnv* km_env, jclass km_clazz, jlong ref, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsRelease");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ref, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ref;
    (void)count;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsRunScript(JNIEnv* km_env, jclass km_clazz, jlong script, jlong sourcecontext, jlong sourceurl, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsRunScript");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)script, (uint64_t)sourcecontext, (void*)(uintptr_t)sourceurl, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)script;
    (void)sourcecontext;
    (void)sourceurl;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsRunSerializedScript(JNIEnv* km_env, jclass km_clazz, jlong script, jlong buffer, jlong sourcecontext, jlong sourceurl, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsRunSerializedScript");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)script, (void*)(uintptr_t)buffer, (uint64_t)sourcecontext, (void*)(uintptr_t)sourceurl, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)script;
    (void)buffer;
    (void)sourcecontext;
    (void)sourceurl;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSerializeScript(JNIEnv* km_env, jclass km_clazz, jlong script, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSerializeScript");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)script, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)script;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetCurrentContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetCurrentContext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)context;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetException(JNIEnv* km_env, jclass km_clazz, jlong exception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetException");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)exception);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)exception;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetExternalData(JNIEnv* km_env, jclass km_clazz, jlong object, jlong externaldata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetExternalData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)externaldata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)externaldata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetIndexedProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong arg1Index, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetIndexedProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)arg1Index, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)arg1Index;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetProperty(JNIEnv* km_env, jclass km_clazz, jlong object, jlong propertyid, jlong value, jbyte usestrictrules) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)propertyid, (void*)(uintptr_t)value, (uint8_t)usestrictrules);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)propertyid;
    (void)value;
    (void)usestrictrules;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetPrototype(JNIEnv* km_env, jclass km_clazz, jlong object, jlong prototypeobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetPrototype");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)prototypeobject);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)prototypeobject;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetRuntimeBeforeCollectCallback(JNIEnv* km_env, jclass km_clazz, jlong runtime, jlong callbackstate, jlong beforecollectcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetRuntimeBeforeCollectCallback");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime, (void*)(uintptr_t)callbackstate, (void*)(uintptr_t)beforecollectcallback);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    (void)callbackstate;
    (void)beforecollectcallback;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetRuntimeMemoryAllocationCallback(JNIEnv* km_env, jclass km_clazz, jlong runtime, jlong callbackstate, jlong allocationcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetRuntimeMemoryAllocationCallback");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime, (void*)(uintptr_t)callbackstate, (void*)(uintptr_t)allocationcallback);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    (void)callbackstate;
    (void)allocationcallback;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsSetRuntimeMemoryLimit(JNIEnv* km_env, jclass km_clazz, jlong runtime, jlong memorylimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsSetRuntimeMemoryLimit");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtime, (uint64_t)memorylimit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)runtime;
    (void)memorylimit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsStopProfiling(JNIEnv* km_env, jclass km_clazz, jint reason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsStopProfiling");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)reason);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reason;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsStrictEquals(JNIEnv* km_env, jclass km_clazz, jlong object1, jlong object2, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsStrictEquals");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object1, (void*)(uintptr_t)object2, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object1;
    (void)object2;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsStringToPointer(JNIEnv* km_env, jclass km_clazz, jlong value, jlong stringvalue, jlong stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsStringToPointer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)stringvalue, (void*)(uintptr_t)stringlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)value;
    (void)stringvalue;
    (void)stringlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsValueToVariant(JNIEnv* km_env, jclass km_clazz, jlong object, jlong variant) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsValueToVariant");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)variant);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)object;
    (void)variant;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_js_WindowsWin32SystemJsJniBridge_windowssysWindowsWin32SystemJsJsVariantToValue(JNIEnv* km_env, jclass km_clazz, jlong variant, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("chakra.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JsVariantToValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)variant, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)variant;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

