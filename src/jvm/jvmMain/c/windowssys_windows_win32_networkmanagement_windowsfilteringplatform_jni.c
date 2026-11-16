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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong callout, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutAdd0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)callout, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint id, jlong callout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)id, (void*)(uintptr_t)callout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong callout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)callout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSubscriptionsGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutUnsubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong connection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)connection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionSetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionSubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionUnsubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordSubscribe0(JNIEnv* km_env, jclass km_clazz, jint flags, jlong callback, jlong context, jlong subscriptionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmDynamicKeywordSubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)subscriptionhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)callback;
    (void)context;
    (void)subscriptionhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong subscriptionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmDynamicKeywordUnsubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subscriptionhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)subscriptionhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineClose0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineClose0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetOption0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (int32_t)option, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(JNIEnv* km_env, jclass km_clazz, jlong servername, jint authnservice, jlong authidentity, jlong session, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineOpen0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)authnservice, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)session, (void*)(uintptr_t)enginehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint option, jlong newvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetOption0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (int32_t)option, (void*)(uintptr_t)newvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong filter, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterAdd0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)filter, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)filter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)filter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSubscriptionsGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterUnsubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(JNIEnv* km_env, jclass km_clazz, jlong p) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmGetAppIdFromFileName0(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong appid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmGetAppIdFromFileName0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)appid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)filename;
    (void)appid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd3");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelDeleteByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jshort id, jlong layer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint16_t)id, (void*)(uintptr_t)layer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong layer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)layer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerSetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum3");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe3");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe4(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscriptionsGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventUnsubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsGetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsSetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong provider, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderAdd0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)provider, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd3");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum3");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById3");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey3");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSubscriptionsGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextUnsubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDeleteByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong provider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)provider);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSubscriptionsGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderUnsubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong sublayer, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerAdd0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)sublayer, (void*)(uintptr_t)sd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDeleteByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong sublayer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)sublayer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSubscriptionsGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerUnsubscribeChanges0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong sysports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)sysports);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)sysports;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong reserved, jlong callback, jlong context, jlong sysportshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsSubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)reserved, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)sysportshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)reserved;
    (void)callback;
    (void)context;
    (void)sysportshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong sysportshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsUnsubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)sysportshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)sysportshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionAbort0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionBegin0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionCommit0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong subscriptionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventSubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)subscriptionhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)subscriptionhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscriptionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventUnsubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscriptionhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscriptionhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsGetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsSetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong idpstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetStatistics0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)idpstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)idpstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospSetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ipsecstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ipsecstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ipsecstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ipsecstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerAddAndRegister0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong keymanager, jlong keymanagercallbacks, jlong keymgmthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerAddAndRegister0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)keymanager, (void*)(uintptr_t)keymanagercallbacks, (void*)(uintptr_t)keymgmthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)keymanager;
    (void)keymanagercallbacks;
    (void)keymgmthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong reserved, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerGetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)reserved, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)reserved;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong reserved, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerSetSecurityInfoByKey0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)reserved, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)reserved;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerUnregisterAndDelete0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong keymgmthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerUnregisterAndDelete0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)keymgmthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)keymgmthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagersGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagersGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong inboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)inboundbundle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong inboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)inboundbundle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong outboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)outboundbundle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong outboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)outboundbundle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong outboundtraffic, jlong inboundfilterid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)outboundtraffic, (void*)(uintptr_t)inboundfilterid, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong outboundtraffic, jlong virtualiftunnelinfo, jlong inboundfilterid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)outboundtraffic, (void*)(uintptr_t)virtualiftunnelinfo, (void*)(uintptr_t)inboundfilterid, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDeleteById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextExpire0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sacontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sacontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sacontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sacontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jlong inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (void*)(uintptr_t)inboundspi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jlong inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (void*)(uintptr_t)inboundspi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jint inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSetSpi0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (uint32_t)inboundspi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSubscriptionsGet0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextUnsubscribe0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)eventshandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)eventshandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong flags, jlong newvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextUpdate0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)flags, (void*)(uintptr_t)newvalues);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbGetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbSetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ikeextstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ikeextstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ikeextstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ikeextstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaCreateEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbGetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbSetSecurityInfo0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDeleteById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDestroyEnumHandle0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById0");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sa);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong salookupcontext, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById1");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)salookupcontext, (void*)(uintptr_t)sa);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong salookupcontext, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)salookupcontext, (void*)(uintptr_t)sa);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

