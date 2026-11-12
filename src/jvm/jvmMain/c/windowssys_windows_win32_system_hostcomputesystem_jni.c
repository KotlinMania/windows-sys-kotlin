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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(JNIEnv* km_env, jclass km_clazz, jlong operation, jint type, jlong uri, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsAddResourceToOperation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation, (int32_t)type, (void*)(uintptr_t)uri, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    (void)type;
    (void)uri;
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong layerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsAttachLayerStorageFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)layerdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)layerpath;
    (void)layerdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCancelOperation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseComputeSystem");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)computesystem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)computesystem;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseOperation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)operation;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseProcess");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)process);
    } else {
        errno = ENOSYS;
    }
#else
    (void)process;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCrashComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong id, jlong configuration, jlong operation, jlong securitydescriptor, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)configuration, (void*)(uintptr_t)operation, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)computesystem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)configuration;
    (void)operation;
    (void)securitydescriptor;
    (void)computesystem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(JNIEnv* km_env, jclass km_clazz, jlong idnamespace, jlong id, jlong configuration, jlong operation, jlong options, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateComputeSystemInNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)idnamespace, (void*)(uintptr_t)id, (void*)(uintptr_t)configuration, (void*)(uintptr_t)operation, (void*)(uintptr_t)options, (void*)(uintptr_t)computesystem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idnamespace;
    (void)id;
    (void)configuration;
    (void)operation;
    (void)options;
    (void)computesystem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(JNIEnv* km_env, jclass km_clazz, jlong gueststatefilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateEmptyGuestStateFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)gueststatefilepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)gueststatefilepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(JNIEnv* km_env, jclass km_clazz, jlong runtimestatefilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateEmptyRuntimeStateFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtimestatefilepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)runtimestatefilepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(JNIEnv* km_env, jclass km_clazz, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateOperation");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)context;
    (void)callback;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(JNIEnv* km_env, jclass km_clazz, jint eventtypes, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateOperationWithNotifications");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)eventtypes, (void*)(uintptr_t)context, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)eventtypes;
    (void)context;
    (void)callback;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong processparameters, jlong operation, jlong securitydescriptor, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)processparameters, (void*)(uintptr_t)operation, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)process);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)processparameters;
    (void)operation;
    (void)securitydescriptor;
    (void)process;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(JNIEnv* km_env, jclass km_clazz, jlong layerpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsDestroyLayer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)layerpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)layerpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(JNIEnv* km_env, jclass km_clazz, jlong layerpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsDetachLayerStorageFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)layerpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)layerpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(JNIEnv* km_env, jclass km_clazz, jlong query, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsEnumerateComputeSystems");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)query;
    (void)operation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(JNIEnv* km_env, jclass km_clazz, jlong idnamespace, jlong query, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsEnumerateComputeSystemsInNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)idnamespace, (void*)(uintptr_t)query, (void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idnamespace;
    (void)query;
    (void)operation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong exportfolderpath, jlong layerdata, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsExportLayer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)exportfolderpath, (void*)(uintptr_t)layerdata, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)layerpath;
    (void)exportfolderpath;
    (void)layerdata;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(JNIEnv* km_env, jclass km_clazz, jlong writablelayermountpath, jlong writablelayerfolderpath, jlong exportfolderpath, jlong layerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsExportLegacyWritableLayer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writablelayermountpath, (void*)(uintptr_t)writablelayerfolderpath, (void*)(uintptr_t)exportfolderpath, (void*)(uintptr_t)layerdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writablelayermountpath;
    (void)writablelayerfolderpath;
    (void)exportfolderpath;
    (void)layerdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(JNIEnv* km_env, jclass km_clazz, jlong vhdhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsFormatWritableLayerVhd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vhdhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vhdhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetComputeSystemFromOperation");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)operation;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong propertyquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetComputeSystemProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)propertyquery);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)propertyquery;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(JNIEnv* km_env, jclass km_clazz, jlong vhdhandle, jlong mountpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetLayerVhdMountPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vhdhandle, (void*)(uintptr_t)mountpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vhdhandle;
    (void)mountpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)operation;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationId");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)operation;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(JNIEnv* km_env, jclass km_clazz, jlong operation, jlong resultdocument) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation, (void*)(uintptr_t)resultdocument);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    (void)resultdocument;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(JNIEnv* km_env, jclass km_clazz, jlong operation, jlong processinformation, jlong resultdocument) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationResultAndProcessInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation, (void*)(uintptr_t)processinformation, (void*)(uintptr_t)resultdocument);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    (void)processinformation;
    (void)resultdocument;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessFromOperation");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)operation;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)operation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation, jlong propertyquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation, (void*)(uintptr_t)propertyquery);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)operation;
    (void)propertyquery;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(JNIEnv* km_env, jclass km_clazz, jlong runtimefilename, jlong processorfeaturesstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessorCompatibilityFromSavedState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)runtimefilename, (void*)(uintptr_t)processorfeaturesstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)runtimefilename;
    (void)processorfeaturesstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(JNIEnv* km_env, jclass km_clazz, jlong propertyquery, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetServiceProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propertyquery, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propertyquery;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(JNIEnv* km_env, jclass km_clazz, jlong vmid, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGrantVmAccess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmid, (void*)(uintptr_t)filepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmid;
    (void)filepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(JNIEnv* km_env, jclass km_clazz, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGrantVmGroupAccess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong sourcefolderpath, jlong layerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsImportLayer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)sourcefolderpath, (void*)(uintptr_t)layerdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)layerpath;
    (void)sourcefolderpath;
    (void)layerdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(JNIEnv* km_env, jclass km_clazz, jlong writablelayermountpath, jlong writablelayerfolderpath, jlong layerdata, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsInitializeLegacyWritableLayer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writablelayermountpath, (void*)(uintptr_t)writablelayerfolderpath, (void*)(uintptr_t)layerdata, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writablelayermountpath;
    (void)writablelayerfolderpath;
    (void)layerdata;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(JNIEnv* km_env, jclass km_clazz, jlong writablelayerpath, jlong layerdata, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsInitializeWritableLayer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writablelayerpath, (void*)(uintptr_t)layerdata, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writablelayerpath;
    (void)layerdata;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong configuration, jlong identity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)configuration, (void*)(uintptr_t)identity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)configuration;
    (void)identity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation, jlong settings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation, (void*)(uintptr_t)settings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)operation;
    (void)settings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(JNIEnv* km_env, jclass km_clazz, jlong settings, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyServiceSettings");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)settings, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)settings;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong id, jint requestedaccess, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id, (uint32_t)requestedaccess, (void*)(uintptr_t)computesystem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    (void)requestedaccess;
    (void)computesystem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(JNIEnv* km_env, jclass km_clazz, jlong idnamespace, jlong id, jint requestedaccess, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenComputeSystemInNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)idnamespace, (void*)(uintptr_t)id, (uint32_t)requestedaccess, (void*)(uintptr_t)computesystem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idnamespace;
    (void)id;
    (void)requestedaccess;
    (void)computesystem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint processid, jint requestedaccess, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (uint32_t)processid, (uint32_t)requestedaccess, (void*)(uintptr_t)process);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)processid;
    (void)requestedaccess;
    (void)process;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsPauseComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsResumeComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(JNIEnv* km_env, jclass km_clazz, jlong vmid, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsRevokeVmAccess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmid, (void*)(uintptr_t)filepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmid;
    (void)filepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(JNIEnv* km_env, jclass km_clazz, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsRevokeVmGroupAccess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSaveComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint callbackoptions, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetComputeSystemCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (int32_t)callbackoptions, (void*)(uintptr_t)context, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)callbackoptions;
    (void)context;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(JNIEnv* km_env, jclass km_clazz, jlong operation, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetOperationCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation, (void*)(uintptr_t)context, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    (void)context;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(JNIEnv* km_env, jclass km_clazz, jlong operation, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetOperationContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(JNIEnv* km_env, jclass km_clazz, jlong process, jint callbackoptions, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetProcessCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (int32_t)callbackoptions, (void*)(uintptr_t)context, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)callbackoptions;
    (void)context;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong vhdhandle, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetupBaseOSLayer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)vhdhandle, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)layerpath;
    (void)vhdhandle;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong volumepath, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetupBaseOSVolume");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)volumepath, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)layerpath;
    (void)volumepath;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsShutDownComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSignalProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsStartComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(JNIEnv* km_env, jclass km_clazz, jlong settings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSubmitWerReport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)settings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)settings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsTerminateComputeSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsTerminateProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation, (void*)(uintptr_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint timeoutms, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForComputeSystemExit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (uint32_t)timeoutms, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)timeoutms;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(JNIEnv* km_env, jclass km_clazz, jlong operation, jint timeoutms, jlong resultdocument) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForOperationResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation, (uint32_t)timeoutms, (void*)(uintptr_t)resultdocument);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    (void)timeoutms;
    (void)resultdocument;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(JNIEnv* km_env, jclass km_clazz, jlong operation, jint timeoutms, jlong processinformation, jlong resultdocument) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForOperationResultAndProcessInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)operation, (uint32_t)timeoutms, (void*)(uintptr_t)processinformation, (void*)(uintptr_t)resultdocument);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)operation;
    (void)timeoutms;
    (void)processinformation;
    (void)resultdocument;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint timeoutms, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForProcessExit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (uint32_t)timeoutms, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)timeoutms;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

