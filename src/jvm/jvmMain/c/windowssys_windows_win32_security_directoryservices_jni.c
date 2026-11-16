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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_directoryservices_WindowsWin32SecurityDirectoryservicesJniBridge_windowssysWindowsWin32SecurityDirectoryservicesDSCreateSecurityPage(JNIEnv* km_env, jclass km_clazz, jlong pwszobjectpath, jlong pwszobjectclass, jint dwflags, jlong phpage, jlong pfnreadsd, jlong pfnwritesd, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dssec.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSCreateSecurityPage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszobjectpath, (void*)(uintptr_t)pwszobjectclass, (uint32_t)dwflags, (void*)(uintptr_t)phpage, (void*)(uintptr_t)pfnreadsd, (void*)(uintptr_t)pfnwritesd, (int64_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszobjectpath;
    (void)pwszobjectclass;
    (void)dwflags;
    (void)phpage;
    (void)pfnreadsd;
    (void)pfnwritesd;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_directoryservices_WindowsWin32SecurityDirectoryservicesJniBridge_windowssysWindowsWin32SecurityDirectoryservicesDSEditSecurity(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong pwszobjectpath, jlong pwszobjectclass, jint dwflags, jlong pwszcaption, jlong pfnreadsd, jlong pfnwritesd, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dssec.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSEditSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)pwszobjectpath, (void*)(uintptr_t)pwszobjectclass, (uint32_t)dwflags, (void*)(uintptr_t)pwszcaption, (void*)(uintptr_t)pfnreadsd, (void*)(uintptr_t)pfnwritesd, (int64_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndowner;
    (void)pwszobjectpath;
    (void)pwszobjectclass;
    (void)dwflags;
    (void)pwszcaption;
    (void)pfnreadsd;
    (void)pfnwritesd;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

