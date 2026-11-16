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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdAddVirtualDiskParent(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong parentpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddVirtualDiskParent");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)parentpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)parentpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdApplySnapshotVhdSet(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong parameters, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplySnapshotVhdSet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)parameters, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdAttachVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong securitydescriptor, jint flags, jint providerspecificflags, jlong parameters, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AttachVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)securitydescriptor, (int32_t)flags, (uint32_t)providerspecificflags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)securitydescriptor;
    (void)flags;
    (void)providerspecificflags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BreakMirrorVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdCompactVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jint flags, jlong parameters, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompactVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (int32_t)flags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompleteForkVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdCreateVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualstoragetype, jlong path, jint virtualdiskaccessmask, jlong securitydescriptor, jint flags, jint providerspecificflags, jlong parameters, jlong overlapped, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualstoragetype, (void*)(uintptr_t)path, (int32_t)virtualdiskaccessmask, (void*)(uintptr_t)securitydescriptor, (int32_t)flags, (uint32_t)providerspecificflags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualstoragetype;
    (void)path;
    (void)virtualdiskaccessmask;
    (void)securitydescriptor;
    (void)flags;
    (void)providerspecificflags;
    (void)parameters;
    (void)overlapped;
    (void)handle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong parameters, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSnapshotVhdSet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)parameters, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteVirtualDiskMetadata");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)item);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)item;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdDetachVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jint flags, jint providerspecificflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetachVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (int32_t)flags, (uint32_t)providerspecificflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)providerspecificflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong numberofitems, jlong items) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateVirtualDiskMetadata");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)numberofitems, (void*)(uintptr_t)items);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)numberofitems;
    (void)items;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdExpandVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jint flags, jlong parameters, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (int32_t)flags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdForkVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jint flags, jlong parameters, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForkVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (int32_t)flags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(JNIEnv* km_env, jclass km_clazz, jlong pathsbuffersizeinbytes, jlong pathsbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAllAttachedVirtualDiskPhysicalPaths");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pathsbuffersizeinbytes, (void*)(uintptr_t)pathsbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pathsbuffersizeinbytes;
    (void)pathsbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdGetStorageDependencyInformation(JNIEnv* km_env, jclass km_clazz, jlong objecthandle, jint flags, jint storagedependencyinfosize, jlong storagedependencyinfo, jlong sizeused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStorageDependencyInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objecthandle, (int32_t)flags, (uint32_t)storagedependencyinfosize, (void*)(uintptr_t)storagedependencyinfo, (void*)(uintptr_t)sizeused);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)objecthandle;
    (void)flags;
    (void)storagedependencyinfosize;
    (void)storagedependencyinfo;
    (void)sizeused;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdGetVirtualDiskInformation(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong virtualdiskinfosize, jlong virtualdiskinfo, jlong sizeused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVirtualDiskInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)virtualdiskinfosize, (void*)(uintptr_t)virtualdiskinfo, (void*)(uintptr_t)sizeused);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)virtualdiskinfosize;
    (void)virtualdiskinfo;
    (void)sizeused;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong item, jlong metadatasize, jlong metadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVirtualDiskMetadata");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)item, (void*)(uintptr_t)metadatasize, (void*)(uintptr_t)metadata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)item;
    (void)metadatasize;
    (void)metadata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong overlapped, jlong progress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVirtualDiskOperationProgress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)progress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)overlapped;
    (void)progress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong diskpathsizeinbytes, jlong diskpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVirtualDiskPhysicalPath");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)diskpathsizeinbytes, (void*)(uintptr_t)diskpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)diskpathsizeinbytes;
    (void)diskpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdMergeVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jint flags, jlong parameters, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MergeVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (int32_t)flags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdMirrorVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jint flags, jlong parameters, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MirrorVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (int32_t)flags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdModifyVhdSet(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong parameters, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyVhdSet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)parameters, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdOpenVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualstoragetype, jlong path, jint virtualdiskaccessmask, jint flags, jlong parameters, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualstoragetype, (void*)(uintptr_t)path, (int32_t)virtualdiskaccessmask, (int32_t)flags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualstoragetype;
    (void)path;
    (void)virtualdiskaccessmask;
    (void)flags;
    (void)parameters;
    (void)handle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong changetrackingid, jlong byteoffset, jlong bytelength, jint flags, jlong ranges, jlong rangecount, jlong processedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryChangesVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)changetrackingid, (uint64_t)byteoffset, (uint64_t)bytelength, (int32_t)flags, (void*)(uintptr_t)ranges, (void*)(uintptr_t)rangecount, (void*)(uintptr_t)processedlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)changetrackingid;
    (void)byteoffset;
    (void)bytelength;
    (void)flags;
    (void)ranges;
    (void)rangecount;
    (void)processedlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong parameters, jint flags, jlong response) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RawSCSIVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)parameters, (int32_t)flags, (void*)(uintptr_t)response);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    (void)response;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdResizeVirtualDisk(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jint flags, jlong parameters, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResizeVirtualDisk");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (int32_t)flags, (void*)(uintptr_t)parameters, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdSetVirtualDiskInformation(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong virtualdiskinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVirtualDiskInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)virtualdiskinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)virtualdiskinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong item, jint metadatasize, jlong metadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVirtualDiskMetadata");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)item, (uint32_t)metadatasize, (void*)(uintptr_t)metadata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)item;
    (void)metadatasize;
    (void)metadata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_vhd_WindowsWin32StorageVhdJniBridge_windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(JNIEnv* km_env, jclass km_clazz, jlong virtualdiskhandle, jlong parameters, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TakeSnapshotVhdSet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualdiskhandle, (void*)(uintptr_t)parameters, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

