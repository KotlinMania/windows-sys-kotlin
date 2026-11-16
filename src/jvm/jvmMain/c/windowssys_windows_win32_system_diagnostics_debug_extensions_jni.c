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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_extensions_WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(JNIEnv* km_env, jclass km_clazz, jlong debughost, jlong manager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgmodel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDataModelManager");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)debughost, (void*)(uintptr_t)manager);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)debughost;
    (void)manager;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_extensions_WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(JNIEnv* km_env, jclass km_clazz, jlong remoteoptions, jlong interfaceid, jlong arg2Interface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgeng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugConnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)remoteoptions, (void*)(uintptr_t)interfaceid, (void*)(uintptr_t)arg2Interface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)remoteoptions;
    (void)interfaceid;
    (void)arg2Interface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_extensions_WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(JNIEnv* km_env, jclass km_clazz, jlong remoteoptions, jlong interfaceid, jlong arg2Interface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgeng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugConnectWide");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)remoteoptions, (void*)(uintptr_t)interfaceid, (void*)(uintptr_t)arg2Interface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)remoteoptions;
    (void)interfaceid;
    (void)arg2Interface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_extensions_WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(JNIEnv* km_env, jclass km_clazz, jlong interfaceid, jlong arg1Interface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgeng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceid, (void*)(uintptr_t)arg1Interface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interfaceid;
    (void)arg1Interface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_debug_extensions_WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge_windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(JNIEnv* km_env, jclass km_clazz, jlong interfaceid, jint dbgengoptions, jlong arg2Interface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgeng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugCreateEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceid, (uint32_t)dbgengoptions, (void*)(uintptr_t)arg2Interface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interfaceid;
    (void)dbgengoptions;
    (void)arg2Interface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

