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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1ProtectFileToEnterpriseIdentity(JNIEnv* km_env, jclass km_clazz, jlong fileorfolderpath, jlong identity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("efswrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProtectFileToEnterpriseIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileorfolderpath, (void*)(uintptr_t)identity) : -1;
#else
    (void)fileorfolderpath;
    (void)identity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpCloseThreadNetworkContext(JNIEnv* km_env, jclass km_clazz, jlong threadnetworkcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpCloseThreadNetworkContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadnetworkcontext) : -1;
#else
    (void)threadnetworkcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpCreateThreadNetworkContext(JNIEnv* km_env, jclass km_clazz, jlong enterpriseid, jlong threadnetworkcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpCreateThreadNetworkContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enterpriseid, (void*)(uintptr_t)threadnetworkcontext) : -1;
#else
    (void)enterpriseid;
    (void)threadnetworkcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpDisablePermissiveModeFileEncryption(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpDisablePermissiveModeFileEncryption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpDoesPolicyAllowAppExecution(JNIEnv* km_env, jclass km_clazz, jlong packageid, jlong isallowed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpDoesPolicyAllowAppExecution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageid, (void*)(uintptr_t)isallowed) : -1;
#else
    (void)packageid;
    (void)isallowed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpEnablePermissiveModeFileEncryption(JNIEnv* km_env, jclass km_clazz, jlong enterpriseid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpEnablePermissiveModeFileEncryption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enterpriseid) : -1;
#else
    (void)enterpriseid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpGetEnterpriseIds(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong numberofbytes, jlong enterpriseids, jlong enterpriseidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpGetEnterpriseIds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)numberofbytes, (void*)(uintptr_t)enterpriseids, (void*)(uintptr_t)enterpriseidcount) : -1;
#else
    (void)tokenhandle;
    (void)numberofbytes;
    (void)enterpriseids;
    (void)enterpriseidcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpGetEnterprisePolicy(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong policyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpGetEnterprisePolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)policyflags) : -1;
#else
    (void)tokenhandle;
    (void)policyflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpHostingInitialize(JNIEnv* km_env, jclass km_clazz, jint version, jint type, jlong pvdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpHostingInitialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)version, (int32_t)type, (void*)(uintptr_t)pvdata, (uint32_t)cbdata) : -1;
#else
    (void)version;
    (void)type;
    (void)pvdata;
    (void)cbdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpHostingTerminate(JNIEnv* km_env, jclass km_clazz, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpHostingTerminate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)type);
#else
    (void)type;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpIsTokenService(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong istokenservice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpIsTokenService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)istokenservice) : -1;
#else
    (void)tokenhandle;
    (void)istokenservice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1SrpSetTokenEnterpriseId(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong enterpriseid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpSetTokenEnterpriseId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)enterpriseid) : -1;
#else
    (void)tokenhandle;
    (void)enterpriseid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssys_1windows_1win32_1security_1enterprisedata_1UnprotectFile(JNIEnv* km_env, jclass km_clazz, jlong fileorfolderpath, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("efswrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnprotectFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileorfolderpath, (void*)(uintptr_t)options) : -1;
#else
    (void)fileorfolderpath;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

