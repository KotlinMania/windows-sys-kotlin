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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(JNIEnv* km_env, jclass km_clazz, jlong endpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseEndpoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)endpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)endpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseGuestNetworkService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guestnetworkservice);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guestnetworkservice;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong loadbalancer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseLoadBalancer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loadbalancer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loadbalancer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(JNIEnv* km_env, jclass km_clazz, jlong arg0Namespace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Namespace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Namespace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(JNIEnv* km_env, jclass km_clazz, jlong network) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseNetwork");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)network);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)network;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(JNIEnv* km_env, jclass km_clazz, jlong network, jlong id, jlong settings, jlong endpoint, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateEndpoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)network, (void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)network;
    (void)id;
    (void)settings;
    (void)endpoint;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(JNIEnv* km_env, jclass km_clazz, jlong id, jlong settings, jlong guestnetworkservice, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateGuestNetworkService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)guestnetworkservice, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)settings;
    (void)guestnetworkservice;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong id, jlong settings, jlong loadbalancer, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateLoadBalancer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)settings;
    (void)loadbalancer;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(JNIEnv* km_env, jclass km_clazz, jlong id, jlong settings, jlong arg2Namespace, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)arg2Namespace, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)settings;
    (void)arg2Namespace;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(JNIEnv* km_env, jclass km_clazz, jlong id, jlong settings, jlong network, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateNetwork");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)network, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)settings;
    (void)network;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteEndpoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteGuestNetworkService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteLoadBalancer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteNetwork");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(JNIEnv* km_env, jclass km_clazz, jlong query, jlong endpoints, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateEndpoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)endpoints, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)query;
    (void)endpoints;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(JNIEnv* km_env, jclass km_clazz, jlong returncount, jlong portentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateGuestNetworkPortReservations");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)returncount, (void*)(uintptr_t)portentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)returncount;
    (void)portentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(JNIEnv* km_env, jclass km_clazz, jlong query, jlong loadbalancer, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateLoadBalancers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)query;
    (void)loadbalancer;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(JNIEnv* km_env, jclass km_clazz, jlong query, jlong namespaces, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateNamespaces");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)namespaces, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)query;
    (void)namespaces;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(JNIEnv* km_env, jclass km_clazz, jlong query, jlong networks, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateNetworks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)networks, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)query;
    (void)networks;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(JNIEnv* km_env, jclass km_clazz, jlong portentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnFreeGuestNetworkPortReservations");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)portentries);
    } else {
        errno = ENOSYS;
    }
#else
    (void)portentries;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(JNIEnv* km_env, jclass km_clazz, jlong endpoint, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyEndpoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)endpoint, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)endpoint;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyGuestNetworkService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guestnetworkservice, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guestnetworkservice;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong loadbalancer, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyLoadBalancer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loadbalancer;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(JNIEnv* km_env, jclass km_clazz, jlong arg0Namespace, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Namespace, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Namespace;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(JNIEnv* km_env, jclass km_clazz, jlong network, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyNetwork");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)network, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)network;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(JNIEnv* km_env, jclass km_clazz, jlong id, jlong endpoint, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenEndpoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)endpoint;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong id, jlong loadbalancer, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenLoadBalancer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)loadbalancer;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(JNIEnv* km_env, jclass km_clazz, jlong id, jlong arg1Namespace, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)arg1Namespace, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)arg1Namespace;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(JNIEnv* km_env, jclass km_clazz, jlong id, jlong network, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenNetwork");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)network, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)network;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(JNIEnv* km_env, jclass km_clazz, jlong endpoint, jlong query, jlong addresses, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointAddresses");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)endpoint, (void*)(uintptr_t)query, (void*)(uintptr_t)addresses, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)endpoint;
    (void)query;
    (void)addresses;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(JNIEnv* km_env, jclass km_clazz, jlong endpoint, jlong query, jlong properties, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)endpoint, (void*)(uintptr_t)query, (void*)(uintptr_t)properties, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)endpoint;
    (void)query;
    (void)properties;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(JNIEnv* km_env, jclass km_clazz, jlong endpoint, jlong query, jlong stats, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointStats");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)endpoint, (void*)(uintptr_t)query, (void*)(uintptr_t)stats, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)endpoint;
    (void)query;
    (void)stats;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(JNIEnv* km_env, jclass km_clazz, jlong loadbalancer, jlong query, jlong properties, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryLoadBalancerProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)query, (void*)(uintptr_t)properties, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loadbalancer;
    (void)query;
    (void)properties;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(JNIEnv* km_env, jclass km_clazz, jlong arg0Namespace, jlong query, jlong properties, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryNamespaceProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Namespace, (void*)(uintptr_t)query, (void*)(uintptr_t)properties, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Namespace;
    (void)query;
    (void)properties;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(JNIEnv* km_env, jclass km_clazz, jlong network, jlong query, jlong properties, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryNetworkProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)network, (void*)(uintptr_t)query, (void*)(uintptr_t)properties, (void*)(uintptr_t)errorrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)network;
    (void)query;
    (void)properties;
    (void)errorrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice, jlong callback, jlong context, jlong callbackhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnRegisterGuestNetworkServiceCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guestnetworkservice, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)callbackhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guestnetworkservice;
    (void)callback;
    (void)context;
    (void)callbackhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context, jlong callbackhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnRegisterServiceCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)callbackhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    (void)callbackhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(JNIEnv* km_env, jclass km_clazz, jlong portreservationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReleaseGuestNetworkServicePortReservationHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)portreservationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)portreservationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice, jint protocol, jint access, jshort port, jlong portreservationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReserveGuestNetworkServicePort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guestnetworkservice, (int32_t)protocol, (int32_t)access, (uint16_t)port, (void*)(uintptr_t)portreservationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guestnetworkservice;
    (void)protocol;
    (void)access;
    (void)port;
    (void)portreservationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice, jshort portcount, jlong portrangereservation, jlong portreservationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReserveGuestNetworkServicePortRange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guestnetworkservice, (uint16_t)portcount, (void*)(uintptr_t)portrangereservation, (void*)(uintptr_t)portreservationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guestnetworkservice;
    (void)portcount;
    (void)portrangereservation;
    (void)portreservationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(JNIEnv* km_env, jclass km_clazz, jlong callbackhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnUnregisterGuestNetworkServiceCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(JNIEnv* km_env, jclass km_clazz, jlong callbackhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnUnregisterServiceCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

