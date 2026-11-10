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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_multicast_WindowsWin32NetworkmanagementMulticastJniBridge_windowssys_1windows_1win32_1networkmanagement_1multicast_1mcastApiCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastApiCleanup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_multicast_WindowsWin32NetworkmanagementMulticastJniBridge_windowssys_1windows_1win32_1networkmanagement_1multicast_1mcastApiStartup(JNIEnv* km_env, jclass km_clazz, jlong version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastApiStartup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)version);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)version;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_multicast_WindowsWin32NetworkmanagementMulticastJniBridge_windowssys_1windows_1win32_1networkmanagement_1multicast_1mcastEnumerateScopes(JNIEnv* km_env, jclass km_clazz, jshort addrfamily, jint requery, jlong pscopelist, jlong pscopelen, jlong pscopecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastEnumerateScopes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)addrfamily, (int32_t)requery, (void*)(uintptr_t)pscopelist, (void*)(uintptr_t)pscopelen, (void*)(uintptr_t)pscopecount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)addrfamily;
    (void)requery;
    (void)pscopelist;
    (void)pscopelen;
    (void)pscopecount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_multicast_WindowsWin32NetworkmanagementMulticastJniBridge_windowssys_1windows_1win32_1networkmanagement_1multicast_1mcastGenUID(JNIEnv* km_env, jclass km_clazz, jlong prequestid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastGenUID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prequestid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prequestid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_multicast_WindowsWin32NetworkmanagementMulticastJniBridge_windowssys_1windows_1win32_1networkmanagement_1multicast_1mcastReleaseAddress(JNIEnv* km_env, jclass km_clazz, jshort addrfamily, jlong prequestid, jlong preleaserequest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastReleaseAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)addrfamily, (void*)(uintptr_t)prequestid, (void*)(uintptr_t)preleaserequest);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)addrfamily;
    (void)prequestid;
    (void)preleaserequest;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_multicast_WindowsWin32NetworkmanagementMulticastJniBridge_windowssys_1windows_1win32_1networkmanagement_1multicast_1mcastRenewAddress(JNIEnv* km_env, jclass km_clazz, jshort addrfamily, jlong prequestid, jlong prenewrequest, jlong prenewresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastRenewAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)addrfamily, (void*)(uintptr_t)prequestid, (void*)(uintptr_t)prenewrequest, (void*)(uintptr_t)prenewresponse);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)addrfamily;
    (void)prequestid;
    (void)prenewrequest;
    (void)prenewresponse;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_multicast_WindowsWin32NetworkmanagementMulticastJniBridge_windowssys_1windows_1win32_1networkmanagement_1multicast_1mcastRequestAddress(JNIEnv* km_env, jclass km_clazz, jshort addrfamily, jlong prequestid, jlong pscopectx, jlong paddrrequest, jlong paddrresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastRequestAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)addrfamily, (void*)(uintptr_t)prequestid, (void*)(uintptr_t)pscopectx, (void*)(uintptr_t)paddrrequest, (void*)(uintptr_t)paddrresponse);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)addrfamily;
    (void)prequestid;
    (void)pscopectx;
    (void)paddrrequest;
    (void)paddrresponse;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

