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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwDeviceClose(JNIEnv* km_env, jclass km_clazz, jlong hswdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceClose");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hswdevice);
#else
    (void)hswdevice;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwDeviceCreate(JNIEnv* km_env, jclass km_clazz, jlong pszenumeratorname, jlong pszparentdeviceinstance, jlong pcreateinfo, jint cpropertycount, jlong pproperties, jlong pcallback, jlong pcontext, jlong phswdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszenumeratorname, (void*)(uintptr_t)pszparentdeviceinstance, (void*)(uintptr_t)pcreateinfo, (uint32_t)cpropertycount, (void*)(uintptr_t)pproperties, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)phswdevice) : -1;
#else
    (void)pszenumeratorname;
    (void)pszparentdeviceinstance;
    (void)pcreateinfo;
    (void)cpropertycount;
    (void)pproperties;
    (void)pcallback;
    (void)pcontext;
    (void)phswdevice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwDeviceGetLifetime(JNIEnv* km_env, jclass km_clazz, jlong hswdevice, jlong plifetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceGetLifetime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hswdevice, (void*)(uintptr_t)plifetime) : -1;
#else
    (void)hswdevice;
    (void)plifetime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwDeviceInterfacePropertySet(JNIEnv* km_env, jclass km_clazz, jlong hswdevice, jlong pszdeviceinterfaceid, jint cpropertycount, jlong pproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceInterfacePropertySet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hswdevice, (void*)(uintptr_t)pszdeviceinterfaceid, (uint32_t)cpropertycount, (void*)(uintptr_t)pproperties) : -1;
#else
    (void)hswdevice;
    (void)pszdeviceinterfaceid;
    (void)cpropertycount;
    (void)pproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwDeviceInterfaceRegister(JNIEnv* km_env, jclass km_clazz, jlong hswdevice, jlong pinterfaceclassguid, jlong pszreferencestring, jint cpropertycount, jlong pproperties, jint fenabled, jlong ppszdeviceinterfaceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceInterfaceRegister");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hswdevice, (void*)(uintptr_t)pinterfaceclassguid, (void*)(uintptr_t)pszreferencestring, (uint32_t)cpropertycount, (void*)(uintptr_t)pproperties, (int32_t)fenabled, (void*)(uintptr_t)ppszdeviceinterfaceid) : -1;
#else
    (void)hswdevice;
    (void)pinterfaceclassguid;
    (void)pszreferencestring;
    (void)cpropertycount;
    (void)pproperties;
    (void)fenabled;
    (void)ppszdeviceinterfaceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwDeviceInterfaceSetState(JNIEnv* km_env, jclass km_clazz, jlong hswdevice, jlong pszdeviceinterfaceid, jint fenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceInterfaceSetState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hswdevice, (void*)(uintptr_t)pszdeviceinterfaceid, (int32_t)fenabled) : -1;
#else
    (void)hswdevice;
    (void)pszdeviceinterfaceid;
    (void)fenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwDevicePropertySet(JNIEnv* km_env, jclass km_clazz, jlong hswdevice, jint cpropertycount, jlong pproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDevicePropertySet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hswdevice, (uint32_t)cpropertycount, (void*)(uintptr_t)pproperties) : -1;
#else
    (void)hswdevice;
    (void)cpropertycount;
    (void)pproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwDeviceSetLifetime(JNIEnv* km_env, jclass km_clazz, jlong hswdevice, jint lifetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceSetLifetime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hswdevice, (int32_t)lifetime) : -1;
#else
    (void)hswdevice;
    (void)lifetime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_enumeration_pnp_WindowsWin32DevicesEnumerationPnpJniBridge_windowssys_1windows_1win32_1devices_1enumeration_1pnp_1SwMemFree(JNIEnv* km_env, jclass km_clazz, jlong pmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwMemFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pmem);
#else
    (void)pmem;
#endif
}

