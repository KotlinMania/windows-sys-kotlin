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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmBfeStateGet0(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateGet0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmBfeStateSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateSubscribeChanges0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle) : -1;
#else
    (void)deviceobject;
    (void)callback;
    (void)context;
    (void)changehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmBfeStateUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateUnsubscribeChanges0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)changehandle) : -1;
#else
    (void)changehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong callout, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutAdd0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)callout, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : -1;
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint id, jlong callout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)id, (void*)(uintptr_t)callout) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong callout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)callout) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong connection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)connection) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionSetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmEngineClose0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineClose0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle) : -1;
#else
    (void)enginehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmEngineGetOption0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetOption0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (int32_t)option, (void*)(uintptr_t)value) : -1;
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmEngineGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmEngineOpen0(JNIEnv* km_env, jclass km_clazz, jlong servername, jint authnservice, jlong authidentity, jlong session, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineOpen0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)authnservice, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)session, (void*)(uintptr_t)enginehandle) : -1;
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmEngineSetOption0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint option, jlong newvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetOption0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (int32_t)option, (void*)(uintptr_t)newvalue) : -1;
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmEngineSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong filter, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterAdd0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)filter, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : -1;
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)filter) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)filter) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFilterSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmFreeMemory0(JNIEnv* km_env, jclass km_clazz, jlong p) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFreeMemory0");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)p);
#else
    (void)p;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)sd) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)sd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelAdd1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelAdd2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelAdd3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelDeleteByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmLayerCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmLayerDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmLayerEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmLayerGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jshort id, jlong layer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint16_t)id, (void*)(uintptr_t)layer) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmLayerGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong layer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)layer) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmLayerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmLayerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerSetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum4(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum4");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum5(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum5");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventsGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsGetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventsSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsSetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong provider, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderAdd0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)provider, (void*)(uintptr_t)sd) : -1;
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextAdd1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextAdd2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextAdd3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextEnum3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetById2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetById3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetByKey1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetByKey2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetByKey3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDeleteByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong provider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)provider) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmProviderSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSessionCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSessionDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSessionEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong sublayer, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerAdd0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)sublayer, (void*)(uintptr_t)sd) : -1;
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDeleteByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong sublayer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)sublayer) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSetSecurityInfoByKey0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmTransactionAbort0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionAbort0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle) : -1;
#else
    (void)enginehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmTransactionBegin0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionBegin0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags) : -1;
#else
    (void)enginehandle;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmTransactionCommit0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionCommit0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle) : -1;
#else
    (void)enginehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmvSwitchEventsGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsGetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1FwpmvSwitchEventsSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsSetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecDospGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecDospGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong idpstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetStatistics0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)idpstatistics) : -1;
#else
    (void)enginehandle;
    (void)idpstatistics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecDospSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospSetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecDospStateCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecDospStateDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecDospStateEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ipsecstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ipsecstatistics) : -1;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecGetStatistics1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ipsecstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ipsecstatistics) : -1;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextAddInbound0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong inboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)inboundbundle) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextAddInbound1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong inboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)inboundbundle) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextAddOutbound0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong outboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)outboundbundle) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextAddOutbound1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong outboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)outboundbundle) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextCreate0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong outboundtraffic, jlong inboundfilterid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)outboundtraffic, (void*)(uintptr_t)inboundfilterid, (void*)(uintptr_t)id) : -1;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextCreate1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong outboundtraffic, jlong virtualiftunnelinfo, jlong inboundfilterid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)outboundtraffic, (void*)(uintptr_t)virtualiftunnelinfo, (void*)(uintptr_t)inboundfilterid, (void*)(uintptr_t)id) : -1;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDeleteById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextExpire0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextExpire0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sacontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sacontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sacontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sacontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextGetSpi0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jlong inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (void*)(uintptr_t)inboundspi) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextGetSpi1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jlong inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (void*)(uintptr_t)inboundspi) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextSetSpi0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jint inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSetSpi0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (uint32_t)inboundspi) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextUpdate0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong flags, jlong newvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextUpdate0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)flags, (void*)(uintptr_t)newvalues) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaDbGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbGetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaDbSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbSetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IPsecSaEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ikeextstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ikeextstatistics) : -1;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextGetStatistics1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ikeextstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ikeextstatistics) : -1;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaCreateEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaDbGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbGetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaDbSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbSetSecurityInfo0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDeleteById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDestroyEnumHandle0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sa) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong salookupcontext, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)salookupcontext, (void*)(uintptr_t)sa) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1wdk_1networkmanagement_1windowsfilteringplatform_1IkeextSaGetById2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong salookupcontext, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)salookupcontext, (void*)(uintptr_t)sa) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

