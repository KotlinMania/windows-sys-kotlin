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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_distributedtransactioncoordinator_WindowsWin32SystemDistributedtransactioncoordinatorJniBridge_windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(JNIEnv* km_env, jclass km_clazz, jlong iPszhost, jlong iPsztmname, jlong iRiid, jint iDwreserved1, jshort iWcbreserved2, jlong iPvreserved2, jlong oPpvobject) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)iPszhost, (void*)(uintptr_t)iPsztmname, (void*)(uintptr_t)iRiid, (uint32_t)iDwreserved1, (uint16_t)iWcbreserved2, (void*)(uintptr_t)iPvreserved2, (void*)(uintptr_t)oPpvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iPszhost;
    (void)iPsztmname;
    (void)iRiid;
    (void)iDwreserved1;
    (void)iWcbreserved2;
    (void)iPvreserved2;
    (void)oPpvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_distributedtransactioncoordinator_WindowsWin32SystemDistributedtransactioncoordinatorJniBridge_windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(JNIEnv* km_env, jclass km_clazz, jlong iPszhost, jlong iPsztmname, jlong iRiid, jint iDwreserved1, jshort iWcbreserved2, jlong iPvreserved2, jlong oPpvobject) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)iPszhost, (void*)(uintptr_t)iPsztmname, (void*)(uintptr_t)iRiid, (uint32_t)iDwreserved1, (uint16_t)iWcbreserved2, (void*)(uintptr_t)iPvreserved2, (void*)(uintptr_t)oPpvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iPszhost;
    (void)iPsztmname;
    (void)iRiid;
    (void)iDwreserved1;
    (void)iWcbreserved2;
    (void)iPvreserved2;
    (void)oPpvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_distributedtransactioncoordinator_WindowsWin32SystemDistributedtransactioncoordinatorJniBridge_windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(JNIEnv* km_env, jclass km_clazz, jlong iPszhost, jlong iPsztmname, jlong iRiid, jint iGrfoptions, jlong iPvconfigparams, jlong oPpvobject) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)iPszhost, (void*)(uintptr_t)iPsztmname, (void*)(uintptr_t)iRiid, (uint32_t)iGrfoptions, (void*)(uintptr_t)iPvconfigparams, (void*)(uintptr_t)oPpvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iPszhost;
    (void)iPsztmname;
    (void)iRiid;
    (void)iGrfoptions;
    (void)iPvconfigparams;
    (void)oPpvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_distributedtransactioncoordinator_WindowsWin32SystemDistributedtransactioncoordinatorJniBridge_windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(JNIEnv* km_env, jclass km_clazz, jlong iPwszhost, jlong iPwsztmname, jlong iRiid, jint iGrfoptions, jlong iPvconfigparams, jlong oPpvobject) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)iPwszhost, (void*)(uintptr_t)iPwsztmname, (void*)(uintptr_t)iRiid, (uint32_t)iGrfoptions, (void*)(uintptr_t)iPvconfigparams, (void*)(uintptr_t)oPpvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iPwszhost;
    (void)iPwsztmname;
    (void)iRiid;
    (void)iGrfoptions;
    (void)iPvconfigparams;
    (void)oPpvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

