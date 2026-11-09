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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_memory_WindowsWdkSystemMemoryJniBridge_windowssys_1windows_1wdk_1system_1memory_1NtMapViewOfSection(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jlong processhandle, jlong baseaddress, jlong zerobits, jlong commitsize, jlong sectionoffset, jlong viewsize, jint inheritdisposition, jint allocationtype, jint win32protect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint64_t, void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtMapViewOfSection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionhandle, (void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (uint64_t)zerobits, (uint64_t)commitsize, (void*)(uintptr_t)sectionoffset, (void*)(uintptr_t)viewsize, (int32_t)inheritdisposition, (uint32_t)allocationtype, (uint32_t)win32protect) : -1;
#else
    (void)sectionhandle;
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)commitsize;
    (void)sectionoffset;
    (void)viewsize;
    (void)inheritdisposition;
    (void)allocationtype;
    (void)win32protect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_memory_WindowsWdkSystemMemoryJniBridge_windowssys_1windows_1wdk_1system_1memory_1NtOpenSection(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenSection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_memory_WindowsWdkSystemMemoryJniBridge_windowssys_1windows_1wdk_1system_1memory_1NtUnmapViewOfSection(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtUnmapViewOfSection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_memory_WindowsWdkSystemMemoryJniBridge_windowssys_1windows_1wdk_1system_1memory_1ZwMapViewOfSection(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jlong processhandle, jlong baseaddress, jlong zerobits, jlong commitsize, jlong sectionoffset, jlong viewsize, jint inheritdisposition, jint allocationtype, jint win32protect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint64_t, void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwMapViewOfSection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionhandle, (void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (uint64_t)zerobits, (uint64_t)commitsize, (void*)(uintptr_t)sectionoffset, (void*)(uintptr_t)viewsize, (int32_t)inheritdisposition, (uint32_t)allocationtype, (uint32_t)win32protect) : -1;
#else
    (void)sectionhandle;
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)commitsize;
    (void)sectionoffset;
    (void)viewsize;
    (void)inheritdisposition;
    (void)allocationtype;
    (void)win32protect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_memory_WindowsWdkSystemMemoryJniBridge_windowssys_1windows_1wdk_1system_1memory_1ZwOpenSection(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenSection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_memory_WindowsWdkSystemMemoryJniBridge_windowssys_1windows_1wdk_1system_1memory_1ZwUnmapViewOfSection(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwUnmapViewOfSection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

