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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCloseEndpoint(JNIEnv* km_env, jclass km_clazz, jlong endpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseEndpoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)endpoint) : -1;
#else
    (void)endpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCloseGuestNetworkService(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseGuestNetworkService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guestnetworkservice) : -1;
#else
    (void)guestnetworkservice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCloseLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong loadbalancer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseLoadBalancer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loadbalancer) : -1;
#else
    (void)loadbalancer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCloseNamespace(JNIEnv* km_env, jclass km_clazz, jlong arg_0_namespace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_namespace) : -1;
#else
    (void)arg_0_namespace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCloseNetwork(JNIEnv* km_env, jclass km_clazz, jlong network) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseNetwork");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)network) : -1;
#else
    (void)network;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCreateEndpoint(JNIEnv* km_env, jclass km_clazz, jlong network, jlong id, jlong settings, jlong endpoint, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateEndpoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)network, (void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)network;
    (void)id;
    (void)settings;
    (void)endpoint;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCreateGuestNetworkService(JNIEnv* km_env, jclass km_clazz, jlong id, jlong settings, jlong guestnetworkservice, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateGuestNetworkService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)guestnetworkservice, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)settings;
    (void)guestnetworkservice;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCreateLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong id, jlong settings, jlong loadbalancer, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateLoadBalancer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)settings;
    (void)loadbalancer;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCreateNamespace(JNIEnv* km_env, jclass km_clazz, jlong id, jlong settings, jlong arg_2_namespace, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)arg_2_namespace, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)settings;
    (void)arg_2_namespace;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnCreateNetwork(JNIEnv* km_env, jclass km_clazz, jlong id, jlong settings, jlong network, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateNetwork");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)settings, (void*)(uintptr_t)network, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)settings;
    (void)network;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnDeleteEndpoint(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteEndpoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnDeleteGuestNetworkService(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteGuestNetworkService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnDeleteLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteLoadBalancer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnDeleteNamespace(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnDeleteNetwork(JNIEnv* km_env, jclass km_clazz, jlong id, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteNetwork");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnEnumerateEndpoints(JNIEnv* km_env, jclass km_clazz, jlong query, jlong endpoints, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateEndpoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)endpoints, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)query;
    (void)endpoints;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnEnumerateGuestNetworkPortReservations(JNIEnv* km_env, jclass km_clazz, jlong returncount, jlong portentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateGuestNetworkPortReservations");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)returncount, (void*)(uintptr_t)portentries) : -1;
#else
    (void)returncount;
    (void)portentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnEnumerateLoadBalancers(JNIEnv* km_env, jclass km_clazz, jlong query, jlong loadbalancer, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateLoadBalancers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)query;
    (void)loadbalancer;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnEnumerateNamespaces(JNIEnv* km_env, jclass km_clazz, jlong query, jlong namespaces, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateNamespaces");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)namespaces, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)query;
    (void)namespaces;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnEnumerateNetworks(JNIEnv* km_env, jclass km_clazz, jlong query, jlong networks, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateNetworks");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)networks, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)query;
    (void)networks;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnFreeGuestNetworkPortReservations(JNIEnv* km_env, jclass km_clazz, jlong portentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnFreeGuestNetworkPortReservations");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)portentries);
#else
    (void)portentries;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnModifyEndpoint(JNIEnv* km_env, jclass km_clazz, jlong endpoint, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyEndpoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)endpoint, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)endpoint;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnModifyGuestNetworkService(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyGuestNetworkService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guestnetworkservice, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)guestnetworkservice;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnModifyLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong loadbalancer, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyLoadBalancer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)loadbalancer;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnModifyNamespace(JNIEnv* km_env, jclass km_clazz, jlong arg_0_namespace, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_namespace, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)arg_0_namespace;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnModifyNetwork(JNIEnv* km_env, jclass km_clazz, jlong network, jlong settings, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyNetwork");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)network, (void*)(uintptr_t)settings, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)network;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnOpenEndpoint(JNIEnv* km_env, jclass km_clazz, jlong id, jlong endpoint, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenEndpoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)endpoint;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnOpenLoadBalancer(JNIEnv* km_env, jclass km_clazz, jlong id, jlong loadbalancer, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenLoadBalancer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)loadbalancer;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnOpenNamespace(JNIEnv* km_env, jclass km_clazz, jlong id, jlong arg_1_namespace, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)arg_1_namespace, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)arg_1_namespace;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnOpenNetwork(JNIEnv* km_env, jclass km_clazz, jlong id, jlong network, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenNetwork");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)network, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)id;
    (void)network;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnQueryEndpointAddresses(JNIEnv* km_env, jclass km_clazz, jlong endpoint, jlong query, jlong addresses, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointAddresses");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)endpoint, (void*)(uintptr_t)query, (void*)(uintptr_t)addresses, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)endpoint;
    (void)query;
    (void)addresses;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnQueryEndpointProperties(JNIEnv* km_env, jclass km_clazz, jlong endpoint, jlong query, jlong properties, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)endpoint, (void*)(uintptr_t)query, (void*)(uintptr_t)properties, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)endpoint;
    (void)query;
    (void)properties;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnQueryEndpointStats(JNIEnv* km_env, jclass km_clazz, jlong endpoint, jlong query, jlong stats, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointStats");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)endpoint, (void*)(uintptr_t)query, (void*)(uintptr_t)stats, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)endpoint;
    (void)query;
    (void)stats;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnQueryLoadBalancerProperties(JNIEnv* km_env, jclass km_clazz, jlong loadbalancer, jlong query, jlong properties, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryLoadBalancerProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loadbalancer, (void*)(uintptr_t)query, (void*)(uintptr_t)properties, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)loadbalancer;
    (void)query;
    (void)properties;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnQueryNamespaceProperties(JNIEnv* km_env, jclass km_clazz, jlong arg_0_namespace, jlong query, jlong properties, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryNamespaceProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_namespace, (void*)(uintptr_t)query, (void*)(uintptr_t)properties, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)arg_0_namespace;
    (void)query;
    (void)properties;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnQueryNetworkProperties(JNIEnv* km_env, jclass km_clazz, jlong network, jlong query, jlong properties, jlong errorrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryNetworkProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)network, (void*)(uintptr_t)query, (void*)(uintptr_t)properties, (void*)(uintptr_t)errorrecord) : -1;
#else
    (void)network;
    (void)query;
    (void)properties;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnRegisterGuestNetworkServiceCallback(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice, jlong callback, jlong context, jlong callbackhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnRegisterGuestNetworkServiceCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guestnetworkservice, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)callbackhandle) : -1;
#else
    (void)guestnetworkservice;
    (void)callback;
    (void)context;
    (void)callbackhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnRegisterServiceCallback(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context, jlong callbackhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnRegisterServiceCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)callbackhandle) : -1;
#else
    (void)callback;
    (void)context;
    (void)callbackhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnReleaseGuestNetworkServicePortReservationHandle(JNIEnv* km_env, jclass km_clazz, jlong portreservationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReleaseGuestNetworkServicePortReservationHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)portreservationhandle) : -1;
#else
    (void)portreservationhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnReserveGuestNetworkServicePort(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice, jint protocol, jint access, jshort port, jlong portreservationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReserveGuestNetworkServicePort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guestnetworkservice, (int32_t)protocol, (int32_t)access, (uint16_t)port, (void*)(uintptr_t)portreservationhandle) : -1;
#else
    (void)guestnetworkservice;
    (void)protocol;
    (void)access;
    (void)port;
    (void)portreservationhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnReserveGuestNetworkServicePortRange(JNIEnv* km_env, jclass km_clazz, jlong guestnetworkservice, jshort portcount, jlong portrangereservation, jlong portreservationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReserveGuestNetworkServicePortRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guestnetworkservice, (uint16_t)portcount, (void*)(uintptr_t)portrangereservation, (void*)(uintptr_t)portreservationhandle) : -1;
#else
    (void)guestnetworkservice;
    (void)portcount;
    (void)portrangereservation;
    (void)portreservationhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnUnregisterGuestNetworkServiceCallback(JNIEnv* km_env, jclass km_clazz, jlong callbackhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnUnregisterGuestNetworkServiceCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackhandle) : -1;
#else
    (void)callbackhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputenetwork_WindowsWin32SystemHostcomputenetworkJniBridge_windowssys_1windows_1win32_1system_1hostcomputenetwork_1hcnUnregisterServiceCallback(JNIEnv* km_env, jclass km_clazz, jlong callbackhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnUnregisterServiceCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackhandle) : -1;
#else
    (void)callbackhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

