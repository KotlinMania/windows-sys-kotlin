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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsAddResourceToOperation(JNIEnv* km_env, jclass km_clazz, jlong operation, jint type, jlong uri, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsAddResourceToOperation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation, (int32_t)type, (void*)(uintptr_t)uri, (void*)(uintptr_t)handle) : -1;
#else
    (void)operation;
    (void)type;
    (void)uri;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsAttachLayerStorageFilter(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong layerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsAttachLayerStorageFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)layerdata) : -1;
#else
    (void)layerpath;
    (void)layerdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCancelOperation(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCancelOperation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation) : -1;
#else
    (void)operation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCloseComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseComputeSystem");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)computesystem);
#else
    (void)computesystem;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCloseOperation(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseOperation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)operation);
#else
    (void)operation;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCloseProcess(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseProcess");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)process);
#else
    (void)process;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCrashComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCrashComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCreateComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong id, jlong configuration, jlong operation, jlong securitydescriptor, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (void*)(uintptr_t)configuration, (void*)(uintptr_t)operation, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)computesystem) : -1;
#else
    (void)id;
    (void)configuration;
    (void)operation;
    (void)securitydescriptor;
    (void)computesystem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCreateComputeSystemInNamespace(JNIEnv* km_env, jclass km_clazz, jlong idnamespace, jlong id, jlong configuration, jlong operation, jlong options, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateComputeSystemInNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)idnamespace, (void*)(uintptr_t)id, (void*)(uintptr_t)configuration, (void*)(uintptr_t)operation, (void*)(uintptr_t)options, (void*)(uintptr_t)computesystem) : -1;
#else
    (void)idnamespace;
    (void)id;
    (void)configuration;
    (void)operation;
    (void)options;
    (void)computesystem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCreateEmptyGuestStateFile(JNIEnv* km_env, jclass km_clazz, jlong gueststatefilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateEmptyGuestStateFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)gueststatefilepath) : -1;
#else
    (void)gueststatefilepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCreateEmptyRuntimeStateFile(JNIEnv* km_env, jclass km_clazz, jlong runtimestatefilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateEmptyRuntimeStateFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)runtimestatefilepath) : -1;
#else
    (void)runtimestatefilepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCreateOperation(JNIEnv* km_env, jclass km_clazz, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateOperation");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)callback) : NULL;
#else
    (void)context;
    (void)callback;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCreateOperationWithNotifications(JNIEnv* km_env, jclass km_clazz, jint eventtypes, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateOperationWithNotifications");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)eventtypes, (void*)(uintptr_t)context, (void*)(uintptr_t)callback) : NULL;
#else
    (void)eventtypes;
    (void)context;
    (void)callback;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsCreateProcess(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong processparameters, jlong operation, jlong securitydescriptor, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)processparameters, (void*)(uintptr_t)operation, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)process) : -1;
#else
    (void)computesystem;
    (void)processparameters;
    (void)operation;
    (void)securitydescriptor;
    (void)process;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsDestroyLayer(JNIEnv* km_env, jclass km_clazz, jlong layerpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsDestroyLayer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)layerpath) : -1;
#else
    (void)layerpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsDetachLayerStorageFilter(JNIEnv* km_env, jclass km_clazz, jlong layerpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsDetachLayerStorageFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)layerpath) : -1;
#else
    (void)layerpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsEnumerateComputeSystems(JNIEnv* km_env, jclass km_clazz, jlong query, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsEnumerateComputeSystems");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)query, (void*)(uintptr_t)operation) : -1;
#else
    (void)query;
    (void)operation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsEnumerateComputeSystemsInNamespace(JNIEnv* km_env, jclass km_clazz, jlong idnamespace, jlong query, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsEnumerateComputeSystemsInNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)idnamespace, (void*)(uintptr_t)query, (void*)(uintptr_t)operation) : -1;
#else
    (void)idnamespace;
    (void)query;
    (void)operation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsExportLayer(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong exportfolderpath, jlong layerdata, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsExportLayer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)exportfolderpath, (void*)(uintptr_t)layerdata, (void*)(uintptr_t)options) : -1;
#else
    (void)layerpath;
    (void)exportfolderpath;
    (void)layerdata;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsExportLegacyWritableLayer(JNIEnv* km_env, jclass km_clazz, jlong writablelayermountpath, jlong writablelayerfolderpath, jlong exportfolderpath, jlong layerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsExportLegacyWritableLayer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)writablelayermountpath, (void*)(uintptr_t)writablelayerfolderpath, (void*)(uintptr_t)exportfolderpath, (void*)(uintptr_t)layerdata) : -1;
#else
    (void)writablelayermountpath;
    (void)writablelayerfolderpath;
    (void)exportfolderpath;
    (void)layerdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsFormatWritableLayerVhd(JNIEnv* km_env, jclass km_clazz, jlong vhdhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsFormatWritableLayerVhd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vhdhandle) : -1;
#else
    (void)vhdhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetComputeSystemFromOperation(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetComputeSystemFromOperation");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation) : NULL;
#else
    (void)operation;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetComputeSystemProperties(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong propertyquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetComputeSystemProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)propertyquery) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)propertyquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetLayerVhdMountPath(JNIEnv* km_env, jclass km_clazz, jlong vhdhandle, jlong mountpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetLayerVhdMountPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vhdhandle, (void*)(uintptr_t)mountpath) : -1;
#else
    (void)vhdhandle;
    (void)mountpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetOperationContext(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation) : NULL;
#else
    (void)operation;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetOperationId(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationId");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation) : 0;
#else
    (void)operation;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetOperationResult(JNIEnv* km_env, jclass km_clazz, jlong operation, jlong resultdocument) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationResult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation, (void*)(uintptr_t)resultdocument) : -1;
#else
    (void)operation;
    (void)resultdocument;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetOperationResultAndProcessInfo(JNIEnv* km_env, jclass km_clazz, jlong operation, jlong processinformation, jlong resultdocument) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationResultAndProcessInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation, (void*)(uintptr_t)processinformation, (void*)(uintptr_t)resultdocument) : -1;
#else
    (void)operation;
    (void)processinformation;
    (void)resultdocument;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetOperationType(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation) : -1;
#else
    (void)operation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetProcessFromOperation(JNIEnv* km_env, jclass km_clazz, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessFromOperation");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation) : NULL;
#else
    (void)operation;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetProcessInfo(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation) : -1;
#else
    (void)process;
    (void)operation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetProcessProperties(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation, jlong propertyquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation, (void*)(uintptr_t)propertyquery) : -1;
#else
    (void)process;
    (void)operation;
    (void)propertyquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetProcessorCompatibilityFromSavedState(JNIEnv* km_env, jclass km_clazz, jlong runtimefilename, jlong processorfeaturesstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessorCompatibilityFromSavedState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)runtimefilename, (void*)(uintptr_t)processorfeaturesstring) : -1;
#else
    (void)runtimefilename;
    (void)processorfeaturesstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGetServiceProperties(JNIEnv* km_env, jclass km_clazz, jlong propertyquery, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetServiceProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propertyquery, (void*)(uintptr_t)result) : -1;
#else
    (void)propertyquery;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGrantVmAccess(JNIEnv* km_env, jclass km_clazz, jlong vmid, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGrantVmAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmid, (void*)(uintptr_t)filepath) : -1;
#else
    (void)vmid;
    (void)filepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsGrantVmGroupAccess(JNIEnv* km_env, jclass km_clazz, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGrantVmGroupAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filepath) : -1;
#else
    (void)filepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsImportLayer(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong sourcefolderpath, jlong layerdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsImportLayer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)sourcefolderpath, (void*)(uintptr_t)layerdata) : -1;
#else
    (void)layerpath;
    (void)sourcefolderpath;
    (void)layerdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsInitializeLegacyWritableLayer(JNIEnv* km_env, jclass km_clazz, jlong writablelayermountpath, jlong writablelayerfolderpath, jlong layerdata, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsInitializeLegacyWritableLayer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)writablelayermountpath, (void*)(uintptr_t)writablelayerfolderpath, (void*)(uintptr_t)layerdata, (void*)(uintptr_t)options) : -1;
#else
    (void)writablelayermountpath;
    (void)writablelayerfolderpath;
    (void)layerdata;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsInitializeWritableLayer(JNIEnv* km_env, jclass km_clazz, jlong writablelayerpath, jlong layerdata, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsInitializeWritableLayer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)writablelayerpath, (void*)(uintptr_t)layerdata, (void*)(uintptr_t)options) : -1;
#else
    (void)writablelayerpath;
    (void)layerdata;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsModifyComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong configuration, jlong identity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)configuration, (void*)(uintptr_t)identity) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)configuration;
    (void)identity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsModifyProcess(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation, jlong settings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation, (void*)(uintptr_t)settings) : -1;
#else
    (void)process;
    (void)operation;
    (void)settings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsModifyServiceSettings(JNIEnv* km_env, jclass km_clazz, jlong settings, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyServiceSettings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)settings, (void*)(uintptr_t)result) : -1;
#else
    (void)settings;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsOpenComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong id, jint requestedaccess, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id, (uint32_t)requestedaccess, (void*)(uintptr_t)computesystem) : -1;
#else
    (void)id;
    (void)requestedaccess;
    (void)computesystem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsOpenComputeSystemInNamespace(JNIEnv* km_env, jclass km_clazz, jlong idnamespace, jlong id, jint requestedaccess, jlong computesystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenComputeSystemInNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)idnamespace, (void*)(uintptr_t)id, (uint32_t)requestedaccess, (void*)(uintptr_t)computesystem) : -1;
#else
    (void)idnamespace;
    (void)id;
    (void)requestedaccess;
    (void)computesystem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsOpenProcess(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint processid, jint requestedaccess, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (uint32_t)processid, (uint32_t)requestedaccess, (void*)(uintptr_t)process) : -1;
#else
    (void)computesystem;
    (void)processid;
    (void)requestedaccess;
    (void)process;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsPauseComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsPauseComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsResumeComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsResumeComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsRevokeVmAccess(JNIEnv* km_env, jclass km_clazz, jlong vmid, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsRevokeVmAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmid, (void*)(uintptr_t)filepath) : -1;
#else
    (void)vmid;
    (void)filepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsRevokeVmGroupAccess(JNIEnv* km_env, jclass km_clazz, jlong filepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsRevokeVmGroupAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filepath) : -1;
#else
    (void)filepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSaveComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSaveComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSetComputeSystemCallback(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint callbackoptions, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetComputeSystemCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (int32_t)callbackoptions, (void*)(uintptr_t)context, (void*)(uintptr_t)callback) : -1;
#else
    (void)computesystem;
    (void)callbackoptions;
    (void)context;
    (void)callback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSetOperationCallback(JNIEnv* km_env, jclass km_clazz, jlong operation, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetOperationCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation, (void*)(uintptr_t)context, (void*)(uintptr_t)callback) : -1;
#else
    (void)operation;
    (void)context;
    (void)callback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSetOperationContext(JNIEnv* km_env, jclass km_clazz, jlong operation, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetOperationContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation, (void*)(uintptr_t)context) : -1;
#else
    (void)operation;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSetProcessCallback(JNIEnv* km_env, jclass km_clazz, jlong process, jint callbackoptions, jlong context, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetProcessCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (int32_t)callbackoptions, (void*)(uintptr_t)context, (void*)(uintptr_t)callback) : -1;
#else
    (void)process;
    (void)callbackoptions;
    (void)context;
    (void)callback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSetupBaseOSLayer(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong vhdhandle, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetupBaseOSLayer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)vhdhandle, (void*)(uintptr_t)options) : -1;
#else
    (void)layerpath;
    (void)vhdhandle;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSetupBaseOSVolume(JNIEnv* km_env, jclass km_clazz, jlong layerpath, jlong volumepath, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetupBaseOSVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)layerpath, (void*)(uintptr_t)volumepath, (void*)(uintptr_t)options) : -1;
#else
    (void)layerpath;
    (void)volumepath;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsShutDownComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsShutDownComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSignalProcess(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSignalProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)process;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsStartComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsStartComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsSubmitWerReport(JNIEnv* km_env, jclass km_clazz, jlong settings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSubmitWerReport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)settings) : -1;
#else
    (void)settings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsTerminateComputeSystem(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsTerminateComputeSystem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsTerminateProcess(JNIEnv* km_env, jclass km_clazz, jlong process, jlong operation, jlong options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsTerminateProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)operation, (void*)(uintptr_t)options) : -1;
#else
    (void)process;
    (void)operation;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsWaitForComputeSystemExit(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint timeoutms, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForComputeSystemExit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (uint32_t)timeoutms, (void*)(uintptr_t)result) : -1;
#else
    (void)computesystem;
    (void)timeoutms;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsWaitForOperationResult(JNIEnv* km_env, jclass km_clazz, jlong operation, jint timeoutms, jlong resultdocument) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForOperationResult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation, (uint32_t)timeoutms, (void*)(uintptr_t)resultdocument) : -1;
#else
    (void)operation;
    (void)timeoutms;
    (void)resultdocument;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsWaitForOperationResultAndProcessInfo(JNIEnv* km_env, jclass km_clazz, jlong operation, jint timeoutms, jlong processinformation, jlong resultdocument) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForOperationResultAndProcessInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)operation, (uint32_t)timeoutms, (void*)(uintptr_t)processinformation, (void*)(uintptr_t)resultdocument) : -1;
#else
    (void)operation;
    (void)timeoutms;
    (void)processinformation;
    (void)resultdocument;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hostcomputesystem_WindowsWin32SystemHostcomputesystemJniBridge_windowssys_1windows_1win32_1system_1hostcomputesystem_1hcsWaitForProcessExit(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint timeoutms, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForProcessExit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (uint32_t)timeoutms, (void*)(uintptr_t)result) : -1;
#else
    (void)computesystem;
    (void)timeoutms;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

