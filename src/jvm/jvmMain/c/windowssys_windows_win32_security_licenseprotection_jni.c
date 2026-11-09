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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_licenseprotection_WindowsWin32SecurityLicenseprotectionJniBridge_windowssys_1windows_1win32_1security_1licenseprotection_1RegisterLicenseKeyWithExpiration(JNIEnv* km_env, jclass km_clazz, jlong licensekey, jint validityindays, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("licenseprotection.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterLicenseKeyWithExpiration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)licensekey, (uint32_t)validityindays, (void*)(uintptr_t)status) : -1;
#else
    (void)licensekey;
    (void)validityindays;
    (void)status;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_licenseprotection_WindowsWin32SecurityLicenseprotectionJniBridge_windowssys_1windows_1win32_1security_1licenseprotection_1ValidateLicenseKeyProtection(JNIEnv* km_env, jclass km_clazz, jlong licensekey, jlong notvalidbefore, jlong notvalidafter, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("licenseprotection.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateLicenseKeyProtection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)licensekey, (void*)(uintptr_t)notvalidbefore, (void*)(uintptr_t)notvalidafter, (void*)(uintptr_t)status) : -1;
#else
    (void)licensekey;
    (void)notvalidbefore;
    (void)notvalidafter;
    (void)status;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

