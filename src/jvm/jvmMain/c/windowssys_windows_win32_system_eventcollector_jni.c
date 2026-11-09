#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcClose(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)object) : -1;
#else
    (void)object;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcDeleteSubscription(JNIEnv* km_env, jclass km_clazz, jlong subscriptionname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcDeleteSubscription");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subscriptionname, (uint32_t)flags) : -1;
#else
    (void)subscriptionname;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcEnumNextSubscription(JNIEnv* km_env, jclass km_clazz, jlong subscriptionenum, jint subscriptionnamebuffersize, jlong subscriptionnamebuffer, jlong subscriptionnamebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcEnumNextSubscription");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)subscriptionenum, (uint32_t)subscriptionnamebuffersize, (void*)(uintptr_t)subscriptionnamebuffer, (void*)(uintptr_t)subscriptionnamebufferused) : -1;
#else
    (void)subscriptionenum;
    (void)subscriptionnamebuffersize;
    (void)subscriptionnamebuffer;
    (void)subscriptionnamebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcGetObjectArrayProperty(JNIEnv* km_env, jclass km_clazz, jlong objectarray, jint propertyid, jint arrayindex, jint flags, jint propertyvaluebuffersize, jlong propertyvaluebuffer, jlong propertyvaluebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcGetObjectArrayProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)objectarray, (int32_t)propertyid, (uint32_t)arrayindex, (uint32_t)flags, (uint32_t)propertyvaluebuffersize, (void*)(uintptr_t)propertyvaluebuffer, (void*)(uintptr_t)propertyvaluebufferused) : -1;
#else
    (void)objectarray;
    (void)propertyid;
    (void)arrayindex;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcGetObjectArraySize(JNIEnv* km_env, jclass km_clazz, jlong objectarray, jlong objectarraysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcGetObjectArraySize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)objectarray, (void*)(uintptr_t)objectarraysize) : -1;
#else
    (void)objectarray;
    (void)objectarraysize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcGetSubscriptionProperty(JNIEnv* km_env, jclass km_clazz, jlong subscription, jint propertyid, jint flags, jint propertyvaluebuffersize, jlong propertyvaluebuffer, jlong propertyvaluebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcGetSubscriptionProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)subscription, (int32_t)propertyid, (uint32_t)flags, (uint32_t)propertyvaluebuffersize, (void*)(uintptr_t)propertyvaluebuffer, (void*)(uintptr_t)propertyvaluebufferused) : -1;
#else
    (void)subscription;
    (void)propertyid;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcGetSubscriptionRunTimeStatus(JNIEnv* km_env, jclass km_clazz, jlong subscriptionname, jint statusinfoid, jlong eventsourcename, jint flags, jint statusvaluebuffersize, jlong statusvaluebuffer, jlong statusvaluebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcGetSubscriptionRunTimeStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subscriptionname, (int32_t)statusinfoid, (void*)(uintptr_t)eventsourcename, (uint32_t)flags, (uint32_t)statusvaluebuffersize, (void*)(uintptr_t)statusvaluebuffer, (void*)(uintptr_t)statusvaluebufferused) : -1;
#else
    (void)subscriptionname;
    (void)statusinfoid;
    (void)eventsourcename;
    (void)flags;
    (void)statusvaluebuffersize;
    (void)statusvaluebuffer;
    (void)statusvaluebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcInsertObjectArrayElement(JNIEnv* km_env, jclass km_clazz, jlong objectarray, jint arrayindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcInsertObjectArrayElement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)objectarray, (uint32_t)arrayindex) : -1;
#else
    (void)objectarray;
    (void)arrayindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcOpenSubscription(JNIEnv* km_env, jclass km_clazz, jlong subscriptionname, jint accessmask, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcOpenSubscription");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subscriptionname, (uint32_t)accessmask, (uint32_t)flags) : -1;
#else
    (void)subscriptionname;
    (void)accessmask;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcOpenSubscriptionEnum(JNIEnv* km_env, jclass km_clazz, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcOpenSubscriptionEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags) : -1;
#else
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcRemoveObjectArrayElement(JNIEnv* km_env, jclass km_clazz, jlong objectarray, jint arrayindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcRemoveObjectArrayElement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)objectarray, (uint32_t)arrayindex) : -1;
#else
    (void)objectarray;
    (void)arrayindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcRetrySubscription(JNIEnv* km_env, jclass km_clazz, jlong subscriptionname, jlong eventsourcename, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcRetrySubscription");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subscriptionname, (void*)(uintptr_t)eventsourcename, (uint32_t)flags) : -1;
#else
    (void)subscriptionname;
    (void)eventsourcename;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcSaveSubscription(JNIEnv* km_env, jclass km_clazz, jlong subscription, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcSaveSubscription");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)subscription, (uint32_t)flags) : -1;
#else
    (void)subscription;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcSetObjectArrayProperty(JNIEnv* km_env, jclass km_clazz, jlong objectarray, jint propertyid, jint arrayindex, jint flags, jlong propertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcSetObjectArrayProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)objectarray, (int32_t)propertyid, (uint32_t)arrayindex, (uint32_t)flags, (void*)(uintptr_t)propertyvalue) : -1;
#else
    (void)objectarray;
    (void)propertyid;
    (void)arrayindex;
    (void)flags;
    (void)propertyvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventcollector_WindowsWin32SystemEventcollectorJniBridge_windowssys_1windows_1win32_1system_1eventcollector_1EcSetSubscriptionProperty(JNIEnv* km_env, jclass km_clazz, jlong subscription, jint propertyid, jint flags, jlong propertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EcSetSubscriptionProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)subscription, (int32_t)propertyid, (uint32_t)flags, (void*)(uintptr_t)propertyvalue) : -1;
#else
    (void)subscription;
    (void)propertyid;
    (void)flags;
    (void)propertyvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

