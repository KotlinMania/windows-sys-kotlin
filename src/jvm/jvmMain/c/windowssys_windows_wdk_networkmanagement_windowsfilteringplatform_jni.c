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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateGet0");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateSubscribeChanges0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateUnsubscribeChanges0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)changehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong callout, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutAdd0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)callout, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint id, jlong callout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)id, (void*)(uintptr_t)callout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong callout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)callout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong connection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)connection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionSetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineClose0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetOption0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (int32_t)option, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(JNIEnv* km_env, jclass km_clazz, jlong servername, jint authnservice, jlong authidentity, jlong session, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineOpen0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)authnservice, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)session, (void*)(uintptr_t)enginehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint option, jlong newvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetOption0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (int32_t)option, (void*)(uintptr_t)newvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong filter, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterAdd0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)filter, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)filter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)filter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(JNIEnv* km_env, jclass km_clazz, jlong p) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFreeMemory0");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)p);
    } else {
        errno = ENOSYS;
    }
#else
    (void)p;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelDeleteByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jshort id, jlong layer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint16_t)id, (void*)(uintptr_t)layer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong layer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)layer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerSetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum5");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsGetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsSetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong provider, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderAdd0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)provider, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDeleteByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong provider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)provider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong sublayer, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerAdd0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)sublayer, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDeleteByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong sublayer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)sublayer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSetSecurityInfoByKey0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionAbort0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionBegin0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionCommit0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsGetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsSetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong idpstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetStatistics0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)idpstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)idpstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospSetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ipsecstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ipsecstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ipsecstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ipsecstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong inboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)inboundbundle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong inboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)inboundbundle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong outboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)outboundbundle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong outboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)outboundbundle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong outboundtraffic, jlong inboundfilterid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)outboundtraffic, (void*)(uintptr_t)inboundfilterid, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong outboundtraffic, jlong virtualiftunnelinfo, jlong inboundfilterid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)outboundtraffic, (void*)(uintptr_t)virtualiftunnelinfo, (void*)(uintptr_t)inboundfilterid, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDeleteById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextExpire0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sacontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sacontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sacontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sacontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jlong inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (void*)(uintptr_t)inboundspi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jlong inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (void*)(uintptr_t)inboundspi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jint inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSetSpi0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (uint32_t)inboundspi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong flags, jlong newvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextUpdate0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)flags, (void*)(uintptr_t)newvalues);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbGetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbSetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ikeextstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ikeextstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ikeextstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ikeextstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaCreateEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbGetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbSetSecurityInfo0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDeleteById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDestroyEnumHandle0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong salookupcontext, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)salookupcontext, (void*)(uintptr_t)sa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong salookupcontext, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)salookupcontext, (void*)(uintptr_t)sa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

