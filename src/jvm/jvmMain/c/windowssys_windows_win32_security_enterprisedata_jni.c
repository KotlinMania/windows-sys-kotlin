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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity(JNIEnv* km_env, jclass km_clazz, jlong fileorfolderpath, jlong identity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("efswrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProtectFileToEnterpriseIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileorfolderpath, (void*)(uintptr_t)identity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileorfolderpath;
    (void)identity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(JNIEnv* km_env, jclass km_clazz, jlong threadnetworkcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpCloseThreadNetworkContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadnetworkcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadnetworkcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(JNIEnv* km_env, jclass km_clazz, jlong enterpriseid, jlong threadnetworkcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpCreateThreadNetworkContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enterpriseid, (void*)(uintptr_t)threadnetworkcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enterpriseid;
    (void)threadnetworkcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpDisablePermissiveModeFileEncryption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(JNIEnv* km_env, jclass km_clazz, jlong packageid, jlong isallowed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpDoesPolicyAllowAppExecution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageid, (void*)(uintptr_t)isallowed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packageid;
    (void)isallowed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(JNIEnv* km_env, jclass km_clazz, jlong enterpriseid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpEnablePermissiveModeFileEncryption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enterpriseid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enterpriseid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong numberofbytes, jlong enterpriseids, jlong enterpriseidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpGetEnterpriseIds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)numberofbytes, (void*)(uintptr_t)enterpriseids, (void*)(uintptr_t)enterpriseidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)numberofbytes;
    (void)enterpriseids;
    (void)enterpriseidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong policyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpGetEnterprisePolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)policyflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)policyflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(JNIEnv* km_env, jclass km_clazz, jint version, jint type, jlong pvdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpHostingInitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)version, (int32_t)type, (void*)(uintptr_t)pvdata, (uint32_t)cbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)version;
    (void)type;
    (void)pvdata;
    (void)cbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(JNIEnv* km_env, jclass km_clazz, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpHostingTerminate");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)type;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong istokenservice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpIsTokenService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)istokenservice);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)istokenservice;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong enterpriseid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpSetTokenEnterpriseId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)enterpriseid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)enterpriseid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_enterprisedata_WindowsWin32SecurityEnterprisedataJniBridge_windowssysWindowsWin32SecurityEnterprisedataUnprotectFile(JNIEnv* km_env, jclass km_clazz, jlong fileorfolderpath, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("efswrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnprotectFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileorfolderpath, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileorfolderpath;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

