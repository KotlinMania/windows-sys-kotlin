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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevCloseObjectQuery(JNIEnv* km_env, jclass km_clazz, jlong hdevquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCloseObjectQuery");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdevquery);
#else
    (void)hdevquery;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevCreateObjectQuery(JNIEnv* km_env, jclass km_clazz, jint objecttype, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cfilterexpressioncount, jlong pfilter, jlong pcallback, jlong pcontext, jlong phdevquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQuery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cfilterexpressioncount, (void*)(uintptr_t)pfilter, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)phdevquery) : -1;
#else
    (void)objecttype;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevCreateObjectQueryEx(JNIEnv* km_env, jclass km_clazz, jint objecttype, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cfilterexpressioncount, jlong pfilter, jint cextendedparametercount, jlong pextendedparameters, jlong pcallback, jlong pcontext, jlong phdevquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cfilterexpressioncount, (void*)(uintptr_t)pfilter, (uint32_t)cextendedparametercount, (void*)(uintptr_t)pextendedparameters, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)phdevquery) : -1;
#else
    (void)objecttype;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevCreateObjectQueryFromId(JNIEnv* km_env, jclass km_clazz, jint objecttype, jlong pszobjectid, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cfilterexpressioncount, jlong pfilter, jlong pcallback, jlong pcontext, jlong phdevquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryFromId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (void*)(uintptr_t)pszobjectid, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cfilterexpressioncount, (void*)(uintptr_t)pfilter, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)phdevquery) : -1;
#else
    (void)objecttype;
    (void)pszobjectid;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevCreateObjectQueryFromIdEx(JNIEnv* km_env, jclass km_clazz, jint objecttype, jlong pszobjectid, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cfilterexpressioncount, jlong pfilter, jint cextendedparametercount, jlong pextendedparameters, jlong pcallback, jlong pcontext, jlong phdevquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryFromIdEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (void*)(uintptr_t)pszobjectid, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cfilterexpressioncount, (void*)(uintptr_t)pfilter, (uint32_t)cextendedparametercount, (void*)(uintptr_t)pextendedparameters, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)phdevquery) : -1;
#else
    (void)objecttype;
    (void)pszobjectid;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevCreateObjectQueryFromIds(JNIEnv* km_env, jclass km_clazz, jint objecttype, jlong pszzobjectids, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cfilterexpressioncount, jlong pfilter, jlong pcallback, jlong pcontext, jlong phdevquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryFromIds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (void*)(uintptr_t)pszzobjectids, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cfilterexpressioncount, (void*)(uintptr_t)pfilter, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)phdevquery) : -1;
#else
    (void)objecttype;
    (void)pszzobjectids;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevCreateObjectQueryFromIdsEx(JNIEnv* km_env, jclass km_clazz, jint objecttype, jlong pszzobjectids, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cfilterexpressioncount, jlong pfilter, jint cextendedparametercount, jlong pextendedparameters, jlong pcallback, jlong pcontext, jlong phdevquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevCreateObjectQueryFromIdsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (void*)(uintptr_t)pszzobjectids, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cfilterexpressioncount, (void*)(uintptr_t)pfilter, (uint32_t)cextendedparametercount, (void*)(uintptr_t)pextendedparameters, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)phdevquery) : -1;
#else
    (void)objecttype;
    (void)pszzobjectids;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcallback;
    (void)pcontext;
    (void)phdevquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevFindProperty(JNIEnv* km_env, jclass km_clazz, jlong pkey, jint store, jlong pszlocalename, jint cproperties, jlong pproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevFindProperty");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pkey, (int32_t)store, (void*)(uintptr_t)pszlocalename, (uint32_t)cproperties, (void*)(uintptr_t)pproperties) : NULL;
#else
    (void)pkey;
    (void)store;
    (void)pszlocalename;
    (void)cproperties;
    (void)pproperties;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevFreeObjectProperties(JNIEnv* km_env, jclass km_clazz, jint cpropertycount, jlong pproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevFreeObjectProperties");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)cpropertycount, (void*)(uintptr_t)pproperties);
#else
    (void)cpropertycount;
    (void)pproperties;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevFreeObjects(JNIEnv* km_env, jclass km_clazz, jint cobjectcount, jlong pobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevFreeObjects");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)cobjectcount, (void*)(uintptr_t)pobjects);
#else
    (void)cobjectcount;
    (void)pobjects;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevGetObjectProperties(JNIEnv* km_env, jclass km_clazz, jint objecttype, jlong pszobjectid, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jlong pcpropertycount, jlong ppproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevGetObjectProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (void*)(uintptr_t)pszobjectid, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (void*)(uintptr_t)pcpropertycount, (void*)(uintptr_t)ppproperties) : -1;
#else
    (void)objecttype;
    (void)pszobjectid;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)pcpropertycount;
    (void)ppproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevGetObjectPropertiesEx(JNIEnv* km_env, jclass km_clazz, jint objecttype, jlong pszobjectid, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cextendedparametercount, jlong pextendedparameters, jlong pcpropertycount, jlong ppproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevGetObjectPropertiesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (void*)(uintptr_t)pszobjectid, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cextendedparametercount, (void*)(uintptr_t)pextendedparameters, (void*)(uintptr_t)pcpropertycount, (void*)(uintptr_t)ppproperties) : -1;
#else
    (void)objecttype;
    (void)pszobjectid;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcpropertycount;
    (void)ppproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevGetObjects(JNIEnv* km_env, jclass km_clazz, jint objecttype, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cfilterexpressioncount, jlong pfilter, jlong pcobjectcount, jlong ppobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevGetObjects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cfilterexpressioncount, (void*)(uintptr_t)pfilter, (void*)(uintptr_t)pcobjectcount, (void*)(uintptr_t)ppobjects) : -1;
#else
    (void)objecttype;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)pcobjectcount;
    (void)ppobjects;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_devicequery_WindowsWin32DevicesDevicequeryJniBridge_windowssys_1windows_1win32_1devices_1devicequery_1DevGetObjectsEx(JNIEnv* km_env, jclass km_clazz, jint objecttype, jint queryflags, jint crequestedproperties, jlong prequestedproperties, jint cfilterexpressioncount, jlong pfilter, jint cextendedparametercount, jlong pextendedparameters, jlong pcobjectcount, jlong ppobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-devices-query-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevGetObjectsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)objecttype, (uint32_t)queryflags, (uint32_t)crequestedproperties, (void*)(uintptr_t)prequestedproperties, (uint32_t)cfilterexpressioncount, (void*)(uintptr_t)pfilter, (uint32_t)cextendedparametercount, (void*)(uintptr_t)pextendedparameters, (void*)(uintptr_t)pcobjectcount, (void*)(uintptr_t)ppobjects) : -1;
#else
    (void)objecttype;
    (void)queryflags;
    (void)crequestedproperties;
    (void)prequestedproperties;
    (void)cfilterexpressioncount;
    (void)pfilter;
    (void)cextendedparametercount;
    (void)pextendedparameters;
    (void)pcobjectcount;
    (void)ppobjects;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

