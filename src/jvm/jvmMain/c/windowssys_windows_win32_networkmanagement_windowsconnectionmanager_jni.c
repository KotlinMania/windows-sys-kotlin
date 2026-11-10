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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1freeInterfaceContextTable(JNIEnv* km_env, jclass km_clazz, jlong interfacecontexttable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeInterfaceContextTable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)interfacecontexttable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)interfacecontexttable;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1getInterfaceContextTableForHostName(JNIEnv* km_env, jclass km_clazz, jlong hostname, jlong proxyname, jint flags, jlong connectionprofilefilterrawdata, jint connectionprofilefilterrawdatasize, jlong interfacecontexttable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceContextTableForHostName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (void*)(uintptr_t)proxyname, (uint32_t)flags, (void*)(uintptr_t)connectionprofilefilterrawdata, (uint32_t)connectionprofilefilterrawdatasize, (void*)(uintptr_t)interfacecontexttable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hostname;
    (void)proxyname;
    (void)flags;
    (void)connectionprofilefilterrawdata;
    (void)connectionprofilefilterrawdatasize;
    (void)interfacecontexttable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1onDemandGetRoutingHint(JNIEnv* km_env, jclass km_clazz, jlong destinationhostname, jlong interfaceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnDemandGetRoutingHint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationhostname, (void*)(uintptr_t)interfaceindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationhostname;
    (void)interfaceindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1onDemandRegisterNotification(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong callbackcontext, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnDemandRegisterNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)callbackcontext;
    (void)registrationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1onDemandUnRegisterNotification(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnDemandUnRegisterNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)registrationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1wcmFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong pmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmFreeMemory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pmemory);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pmemory;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1wcmGetProfileList(JNIEnv* km_env, jclass km_clazz, jlong preserved, jlong ppprofilelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmGetProfileList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)preserved, (void*)(uintptr_t)ppprofilelist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)preserved;
    (void)ppprofilelist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1wcmQueryProperty(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jlong strprofilename, jint property, jlong preserved, jlong pdwdatasize, jlong ppdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmQueryProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (void*)(uintptr_t)strprofilename, (int32_t)property, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pdwdatasize, (void*)(uintptr_t)ppdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)strprofilename;
    (void)property;
    (void)preserved;
    (void)pdwdatasize;
    (void)ppdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1wcmSetProfileList(JNIEnv* km_env, jclass km_clazz, jlong pprofilelist, jint dwposition, jint fignoreunknownprofiles, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmSetProfileList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pprofilelist, (uint32_t)dwposition, (int32_t)fignoreunknownprofiles, (void*)(uintptr_t)preserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pprofilelist;
    (void)dwposition;
    (void)fignoreunknownprofiles;
    (void)preserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsconnectionmanager_1wcmSetProperty(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jlong strprofilename, jint property, jlong preserved, jint dwdatasize, jlong pbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmSetProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (void*)(uintptr_t)strprofilename, (int32_t)property, (void*)(uintptr_t)preserved, (uint32_t)dwdatasize, (void*)(uintptr_t)pbdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)strprofilename;
    (void)property;
    (void)preserved;
    (void)dwdatasize;
    (void)pbdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

