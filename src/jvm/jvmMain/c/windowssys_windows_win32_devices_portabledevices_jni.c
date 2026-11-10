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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_portabledevices_WindowsWin32DevicesPortabledevicesJniBridge_windowssys_1windows_1win32_1devices_1portabledevices_1dMProcessConfigXMLFiltered(JNIEnv* km_env, jclass km_clazz, jlong pszxmlin, jlong rgszallowedcspnodes, jint dwnumallowedcspnodes, jlong pbstrxmlout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dmprocessxmlfiltered.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMProcessConfigXMLFiltered");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszxmlin, (void*)(uintptr_t)rgszallowedcspnodes, (uint32_t)dwnumallowedcspnodes, (void*)(uintptr_t)pbstrxmlout) : -1;
#else
    (void)pszxmlin;
    (void)rgszallowedcspnodes;
    (void)dwnumallowedcspnodes;
    (void)pbstrxmlout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

