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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_distributedtransactioncoordinator_WindowsWin32SystemDistributedtransactioncoordinatorJniBridge_windowssys_1windows_1win32_1system_1distributedtransactioncoordinator_1dtcGetTransactionManager(JNIEnv* km_env, jclass km_clazz, jlong i_pszhost, jlong i_psztmname, jlong i_riid, jint i_dwreserved1, jshort i_wcbreserved2, jlong i_pvreserved2, jlong o_ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xolehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DtcGetTransactionManager");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)i_pszhost, (void*)(uintptr_t)i_psztmname, (void*)(uintptr_t)i_riid, (uint32_t)i_dwreserved1, (uint16_t)i_wcbreserved2, (void*)(uintptr_t)i_pvreserved2, (void*)(uintptr_t)o_ppvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i_pszhost;
    (void)i_psztmname;
    (void)i_riid;
    (void)i_dwreserved1;
    (void)i_wcbreserved2;
    (void)i_pvreserved2;
    (void)o_ppvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_distributedtransactioncoordinator_WindowsWin32SystemDistributedtransactioncoordinatorJniBridge_windowssys_1windows_1win32_1system_1distributedtransactioncoordinator_1dtcGetTransactionManagerC(JNIEnv* km_env, jclass km_clazz, jlong i_pszhost, jlong i_psztmname, jlong i_riid, jint i_dwreserved1, jshort i_wcbreserved2, jlong i_pvreserved2, jlong o_ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xolehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DtcGetTransactionManagerC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)i_pszhost, (void*)(uintptr_t)i_psztmname, (void*)(uintptr_t)i_riid, (uint32_t)i_dwreserved1, (uint16_t)i_wcbreserved2, (void*)(uintptr_t)i_pvreserved2, (void*)(uintptr_t)o_ppvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i_pszhost;
    (void)i_psztmname;
    (void)i_riid;
    (void)i_dwreserved1;
    (void)i_wcbreserved2;
    (void)i_pvreserved2;
    (void)o_ppvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_distributedtransactioncoordinator_WindowsWin32SystemDistributedtransactioncoordinatorJniBridge_windowssys_1windows_1win32_1system_1distributedtransactioncoordinator_1dtcGetTransactionManagerExA(JNIEnv* km_env, jclass km_clazz, jlong i_pszhost, jlong i_psztmname, jlong i_riid, jint i_grfoptions, jlong i_pvconfigparams, jlong o_ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xolehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DtcGetTransactionManagerExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)i_pszhost, (void*)(uintptr_t)i_psztmname, (void*)(uintptr_t)i_riid, (uint32_t)i_grfoptions, (void*)(uintptr_t)i_pvconfigparams, (void*)(uintptr_t)o_ppvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i_pszhost;
    (void)i_psztmname;
    (void)i_riid;
    (void)i_grfoptions;
    (void)i_pvconfigparams;
    (void)o_ppvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_distributedtransactioncoordinator_WindowsWin32SystemDistributedtransactioncoordinatorJniBridge_windowssys_1windows_1win32_1system_1distributedtransactioncoordinator_1dtcGetTransactionManagerExW(JNIEnv* km_env, jclass km_clazz, jlong i_pwszhost, jlong i_pwsztmname, jlong i_riid, jint i_grfoptions, jlong i_pvconfigparams, jlong o_ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xolehlp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DtcGetTransactionManagerExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)i_pwszhost, (void*)(uintptr_t)i_pwsztmname, (void*)(uintptr_t)i_riid, (uint32_t)i_grfoptions, (void*)(uintptr_t)i_pvconfigparams, (void*)(uintptr_t)o_ppvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i_pwszhost;
    (void)i_pwsztmname;
    (void)i_riid;
    (void)i_grfoptions;
    (void)i_pvconfigparams;
    (void)o_ppvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

