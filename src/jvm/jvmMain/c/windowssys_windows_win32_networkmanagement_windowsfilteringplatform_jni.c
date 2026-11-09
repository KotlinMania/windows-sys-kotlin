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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong callout, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutAdd0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)callout, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : 0;
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint id, jlong callout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)id, (void*)(uintptr_t)callout) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong callout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)callout) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSubscriptionsGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmCalloutUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutUnsubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong connection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)connection) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionSetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionSubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmConnectionUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionUnsubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmDynamicKeywordSubscribe0(JNIEnv* km_env, jclass km_clazz, jint flags, jlong callback, jlong context, jlong subscriptionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmDynamicKeywordSubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)subscriptionhandle) : 0;
#else
    (void)flags;
    (void)callback;
    (void)context;
    (void)subscriptionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmDynamicKeywordUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong subscriptionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmDynamicKeywordUnsubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subscriptionhandle) : 0;
#else
    (void)subscriptionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmEngineClose0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineClose0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle) : 0;
#else
    (void)enginehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmEngineGetOption0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetOption0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (int32_t)option, (void*)(uintptr_t)value) : 0;
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmEngineGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmEngineOpen0(JNIEnv* km_env, jclass km_clazz, jlong servername, jint authnservice, jlong authidentity, jlong session, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineOpen0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)authnservice, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)session, (void*)(uintptr_t)enginehandle) : 0;
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmEngineSetOption0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint option, jlong newvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetOption0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (int32_t)option, (void*)(uintptr_t)newvalue) : 0;
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmEngineSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong filter, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterAdd0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)filter, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : 0;
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)filter) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)filter) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSubscriptionsGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFilterUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterUnsubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmFreeMemory0(JNIEnv* km_env, jclass km_clazz, jlong p) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmGetAppIdFromFileName0(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong appid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmGetAppIdFromFileName0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)appid) : 0;
#else
    (void)filename;
    (void)appid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)sd) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelAdd1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelAdd2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelAdd3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags, jlong mainmodepolicy, jlong tunnelpolicy, jint numfilterconditions, jlong filterconditions, jlong keymodkey, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags, (void*)(uintptr_t)mainmodepolicy, (void*)(uintptr_t)tunnelpolicy, (uint32_t)numfilterconditions, (void*)(uintptr_t)filterconditions, (void*)(uintptr_t)keymodkey, (void*)(uintptr_t)sd) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmIPsecTunnelDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelDeleteByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmLayerCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmLayerDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmLayerEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmLayerGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jshort id, jlong layer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint16_t)id, (void*)(uintptr_t)layer) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmLayerGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong layer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)layer) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmLayerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmLayerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerSetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum4(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventEnum5(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventSubscribe1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventSubscribe2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventSubscribe3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventSubscribe4(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscriptionsGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventUnsubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventsGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsGetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmNetEventsSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsSetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong provider, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderAdd0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)provider, (void*)(uintptr_t)sd) : 0;
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextAdd1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextAdd2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextAdd3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong providercontext, jlong sd, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)sd, (void*)(uintptr_t)id) : 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextEnum3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetById2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetById3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)providercontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetByKey1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetByKey2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetByKey3(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong providercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)providercontext) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSubscriptionsGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderContextUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextUnsubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDeleteByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong provider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)provider) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSubscriptionsGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmProviderUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderUnsubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSessionCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSessionDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSessionEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerAdd0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong sublayer, jlong sd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerAdd0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)sublayer, (void*)(uintptr_t)sd) : 0;
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerDeleteByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDeleteByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerGetByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jlong sublayer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (void*)(uintptr_t)sublayer) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong key, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)key, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerSubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSubscriptionsGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSubLayerUnsubscribeChanges0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong changehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerUnsubscribeChanges0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSystemPortsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong sysports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)sysports) : 0;
#else
    (void)enginehandle;
    (void)sysports;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSystemPortsSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong reserved, jlong callback, jlong context, jlong sysportshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsSubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)reserved, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)sysportshandle) : 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)callback;
    (void)context;
    (void)sysportshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmSystemPortsUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong sysportshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsUnsubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)sysportshandle) : 0;
#else
    (void)enginehandle;
    (void)sysportshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmTransactionAbort0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionAbort0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle) : 0;
#else
    (void)enginehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmTransactionBegin0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionBegin0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)flags) : 0;
#else
    (void)enginehandle;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmTransactionCommit0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionCommit0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle) : 0;
#else
    (void)enginehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmvSwitchEventSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong subscriptionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventSubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)subscriptionhandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)subscriptionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmvSwitchEventUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscriptionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventUnsubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscriptionhandle) : 0;
#else
    (void)enginehandle;
    (void)subscriptionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmvSwitchEventsGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsGetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1FwpmvSwitchEventsSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsSetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecDospGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecDospGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong idpstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetStatistics0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)idpstatistics) : 0;
#else
    (void)enginehandle;
    (void)idpstatistics;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecDospSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospSetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecDospStateCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecDospStateDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecDospStateEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ipsecstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ipsecstatistics) : 0;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecGetStatistics1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ipsecstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ipsecstatistics) : 0;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecKeyManagerAddAndRegister0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong keymanager, jlong keymanagercallbacks, jlong keymgmthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerAddAndRegister0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)keymanager, (void*)(uintptr_t)keymanagercallbacks, (void*)(uintptr_t)keymgmthandle) : 0;
#else
    (void)enginehandle;
    (void)keymanager;
    (void)keymanagercallbacks;
    (void)keymgmthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecKeyManagerGetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong reserved, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerGetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)reserved, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecKeyManagerSetSecurityInfoByKey0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong reserved, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerSetSecurityInfoByKey0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)reserved, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecKeyManagerUnregisterAndDelete0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong keymgmthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerUnregisterAndDelete0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)keymgmthandle) : 0;
#else
    (void)enginehandle;
    (void)keymgmthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecKeyManagersGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagersGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextAddInbound0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong inboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)inboundbundle) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextAddInbound1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong inboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)inboundbundle) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextAddOutbound0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong outboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)outboundbundle) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextAddOutbound1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong outboundbundle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)outboundbundle) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextCreate0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong outboundtraffic, jlong inboundfilterid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)outboundtraffic, (void*)(uintptr_t)inboundfilterid, (void*)(uintptr_t)id) : 0;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextCreate1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong outboundtraffic, jlong virtualiftunnelinfo, jlong inboundfilterid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)outboundtraffic, (void*)(uintptr_t)virtualiftunnelinfo, (void*)(uintptr_t)inboundfilterid, (void*)(uintptr_t)id) : 0;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDeleteById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextExpire0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextExpire0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sacontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sacontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sacontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sacontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextGetSpi0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jlong inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (void*)(uintptr_t)inboundspi) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextGetSpi1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jlong inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (void*)(uintptr_t)inboundspi) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextSetSpi0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong getspi, jint inboundspi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSetSpi0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)getspi, (uint32_t)inboundspi) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextSubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong subscription, jlong callback, jlong context, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextSubscriptionsGet0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSubscriptionsGet0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextUnsubscribe0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong eventshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextUnsubscribe0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)eventshandle) : 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaContextUpdate0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong flags, jlong newvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextUpdate0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)flags, (void*)(uintptr_t)newvalues) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaDbGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbGetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaDbSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbSetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IPsecSaEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextGetStatistics0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ikeextstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ikeextstatistics) : 0;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextGetStatistics1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong ikeextstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)ikeextstatistics) : 0;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaCreateEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumtemplate, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaCreateEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumtemplate, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaDbGetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbGetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl, (void*)(uintptr_t)securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaDbSetSecurityInfo0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jint securityinfo, jlong sidowner, jlong sidgroup, jlong dacl, jlong sacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbSetSecurityInfo0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint32_t)securityinfo, (void*)(uintptr_t)sidowner, (void*)(uintptr_t)sidgroup, (void*)(uintptr_t)dacl, (void*)(uintptr_t)sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaDeleteById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDeleteById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaDestroyEnumHandle0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDestroyEnumHandle0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaEnum0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaEnum1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaEnum2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong enumhandle, jint numentriesrequested, jlong entries, jlong numentriesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (void*)(uintptr_t)enumhandle, (uint32_t)numentriesrequested, (void*)(uintptr_t)entries, (void*)(uintptr_t)numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaGetById0(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById0");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)sa) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaGetById1(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong salookupcontext, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById1");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)salookupcontext, (void*)(uintptr_t)sa) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfilteringplatform_WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfilteringplatform_1IkeextSaGetById2(JNIEnv* km_env, jclass km_clazz, jlong enginehandle, jlong id, jlong salookupcontext, jlong sa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enginehandle, (uint64_t)id, (void*)(uintptr_t)salookupcontext, (void*)(uintptr_t)sa) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

