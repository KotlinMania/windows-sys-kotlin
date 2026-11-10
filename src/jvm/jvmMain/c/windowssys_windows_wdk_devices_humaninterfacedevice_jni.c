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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_devices_humaninterfacedevice_WindowsWdkDevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1wdk_1devices_1humaninterfacedevice_1vhfAsyncOperationComplete(JNIEnv* km_env, jclass km_clazz, jlong vhfoperationhandle, jint completionstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfAsyncOperationComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vhfoperationhandle, (int32_t)completionstatus) : -1;
#else
    (void)vhfoperationhandle;
    (void)completionstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_devices_humaninterfacedevice_WindowsWdkDevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1wdk_1devices_1humaninterfacedevice_1vhfCreate(JNIEnv* km_env, jclass km_clazz, jlong vhfconfig, jlong vhfhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vhfconfig, (void*)(uintptr_t)vhfhandle) : -1;
#else
    (void)vhfconfig;
    (void)vhfhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_devices_humaninterfacedevice_WindowsWdkDevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1wdk_1devices_1humaninterfacedevice_1vhfDelete(JNIEnv* km_env, jclass km_clazz, jlong vhfhandle, jboolean wait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfDelete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)vhfhandle, (bool)wait);
#else
    (void)vhfhandle;
    (void)wait;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_devices_humaninterfacedevice_WindowsWdkDevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1wdk_1devices_1humaninterfacedevice_1vhfReadReportSubmit(JNIEnv* km_env, jclass km_clazz, jlong vhfhandle, jlong hidtransferpacket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfReadReportSubmit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vhfhandle, (void*)(uintptr_t)hidtransferpacket) : -1;
#else
    (void)vhfhandle;
    (void)hidtransferpacket;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_devices_humaninterfacedevice_WindowsWdkDevicesHumaninterfacedeviceJniBridge_windowssys_1windows_1wdk_1devices_1humaninterfacedevice_1vhfStart(JNIEnv* km_env, jclass km_clazz, jlong vhfhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfStart");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vhfhandle) : -1;
#else
    (void)vhfhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

