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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_systeminformation_WindowsWdkSystemSysteminformationJniBridge_windowssys_1windows_1wdk_1system_1systeminformation_1ntQuerySystemInformation(JNIEnv* km_env, jclass km_clazz, jint systeminformationclass, jlong systeminformation, jint systeminformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySystemInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)systeminformationclass, (void*)(uintptr_t)systeminformation, (uint32_t)systeminformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)systeminformationclass;
    (void)systeminformation;
    (void)systeminformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_systeminformation_WindowsWdkSystemSysteminformationJniBridge_windowssys_1windows_1wdk_1system_1systeminformation_1ntQuerySystemTime(JNIEnv* km_env, jclass km_clazz, jlong systemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)systemtime) : -1;
#else
    (void)systemtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_systeminformation_WindowsWdkSystemSysteminformationJniBridge_windowssys_1windows_1wdk_1system_1systeminformation_1ntQueryTimerResolution(JNIEnv* km_env, jclass km_clazz, jlong maximumtime, jlong minimumtime, jlong currenttime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryTimerResolution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)maximumtime, (void*)(uintptr_t)minimumtime, (void*)(uintptr_t)currenttime) : -1;
#else
    (void)maximumtime;
    (void)minimumtime;
    (void)currenttime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_systeminformation_WindowsWdkSystemSysteminformationJniBridge_windowssys_1windows_1wdk_1system_1systeminformation_1zwQuerySystemInformation(JNIEnv* km_env, jclass km_clazz, jint systeminformationclass, jlong systeminformation, jint systeminformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQuerySystemInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)systeminformationclass, (void*)(uintptr_t)systeminformation, (uint32_t)systeminformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)systeminformationclass;
    (void)systeminformation;
    (void)systeminformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_systeminformation_WindowsWdkSystemSysteminformationJniBridge_windowssys_1windows_1wdk_1system_1systeminformation_1zwQuerySystemTime(JNIEnv* km_env, jclass km_clazz, jlong systemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQuerySystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)systemtime) : -1;
#else
    (void)systemtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_systeminformation_WindowsWdkSystemSysteminformationJniBridge_windowssys_1windows_1wdk_1system_1systeminformation_1zwQueryTimerResolution(JNIEnv* km_env, jclass km_clazz, jlong maximumtime, jlong minimumtime, jlong currenttime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryTimerResolution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)maximumtime, (void*)(uintptr_t)minimumtime, (void*)(uintptr_t)currenttime) : -1;
#else
    (void)maximumtime;
    (void)minimumtime;
    (void)currenttime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

