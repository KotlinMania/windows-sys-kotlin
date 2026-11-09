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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1CoCreateActivity(JNIEnv* km_env, jclass km_clazz, jlong piunknown, jlong riid, jlong ppobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateActivity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)piunknown, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppobj) : -1;
#else
    (void)piunknown;
    (void)riid;
    (void)ppobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1CoEnterServiceDomain(JNIEnv* km_env, jclass km_clazz, jlong pconfigobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoEnterServiceDomain");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pconfigobject) : -1;
#else
    (void)pconfigobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1CoGetDefaultContext(JNIEnv* km_env, jclass km_clazz, jint apttype, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetDefaultContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)apttype, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)apttype;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1CoLeaveServiceDomain(JNIEnv* km_env, jclass km_clazz, jlong punkstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoLeaveServiceDomain");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)punkstatus);
#else
    (void)punkstatus;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1GetDispenserManager(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mtxdm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDispenserManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1GetManagedExtensions(JNIEnv* km_env, jclass km_clazz, jlong dwexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetManagedExtensions");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dwexts) : -1;
#else
    (void)dwexts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1MTSCreateActivity(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong ppobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MTSCreateActivity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)ppobj) : -1;
#else
    (void)riid;
    (void)ppobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1RecycleSurrogate(JNIEnv* km_env, jclass km_clazz, jint lreasoncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecycleSurrogate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)lreasoncode) : -1;
#else
    (void)lreasoncode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_componentservices_WindowsWin32SystemComponentservicesJniBridge_windowssys_1windows_1win32_1system_1componentservices_1SafeRef(JNIEnv* km_env, jclass km_clazz, jlong rid, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comsvcs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeRef");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rid, (void*)(uintptr_t)punk) : NULL;
#else
    (void)rid;
    (void)punk;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

