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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_securitycenter_WindowsWin32SystemSecuritycenterJniBridge_windowssys_1windows_1win32_1system_1securitycenter_1WscGetAntiMalwareUri(JNIEnv* km_env, jclass km_clazz, jlong ppszuri) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscGetAntiMalwareUri");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppszuri) : -1;
#else
    (void)ppszuri;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_securitycenter_WindowsWin32SystemSecuritycenterJniBridge_windowssys_1windows_1win32_1system_1securitycenter_1WscGetSecurityProviderHealth(JNIEnv* km_env, jclass km_clazz, jint providers, jlong phealth) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscGetSecurityProviderHealth");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)providers, (void*)(uintptr_t)phealth) : -1;
#else
    (void)providers;
    (void)phealth;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_securitycenter_WindowsWin32SystemSecuritycenterJniBridge_windowssys_1windows_1win32_1system_1securitycenter_1WscQueryAntiMalwareUri(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscQueryAntiMalwareUri");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_securitycenter_WindowsWin32SystemSecuritycenterJniBridge_windowssys_1windows_1win32_1system_1securitycenter_1WscRegisterForUserNotifications(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscRegisterForUserNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_securitycenter_WindowsWin32SystemSecuritycenterJniBridge_windowssys_1windows_1win32_1system_1securitycenter_1WscUnRegisterChanges(JNIEnv* km_env, jclass km_clazz, jlong hregistrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscUnRegisterChanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hregistrationhandle) : -1;
#else
    (void)hregistrationhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

