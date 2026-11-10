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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAcknowledgeEcp(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcknowledgeEcp");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAcquirePushLockExclusive(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockExclusive");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAcquirePushLockExclusiveEx(JNIEnv* km_env, jclass km_clazz, jlong pushlock, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockExclusiveEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pushlock, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAcquirePushLockShared(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockShared");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAcquirePushLockSharedEx(JNIEnv* km_env, jclass km_clazz, jlong pushlock, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockSharedEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pushlock, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAcquireResourceExclusive(JNIEnv* km_env, jclass km_clazz, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquireResourceExclusive");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)resource);
    } else {
        errno = ENOSYS;
    }
#else
    (void)resource;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAcquireResourceShared(JNIEnv* km_env, jclass km_clazz, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquireResourceShared");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)resource);
    } else {
        errno = ENOSYS;
    }
#else
    (void)resource;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAddOpenReparseEntry(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jlong openreparseentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAddOpenReparseEntry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (void*)(uintptr_t)openreparseentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAdjustDeviceStackSizeForIoRedirection(JNIEnv* km_env, jclass km_clazz, jlong sourceinstance, jlong targetinstance, jlong sourcedevicestacksizemodified) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAdjustDeviceStackSizeForIoRedirection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)sourceinstance, (int64_t)targetinstance, (void*)(uintptr_t)sourcedevicestacksizemodified);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)sourcedevicestacksizemodified;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateCallbackData(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong retnewcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateCallbackData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)retnewcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)retnewcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateCallbackDataEx(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint flags, jlong retnewcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateCallbackDataEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)flags, (void*)(uintptr_t)retnewcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)flags;
    (void)retnewcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateContext(JNIEnv* km_env, jclass km_clazz, jlong filter, jshort contexttype, jlong contextsize, jint pooltype, jlong returnedcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, uint64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (uint16_t)contexttype, (uint64_t)contextsize, (int32_t)pooltype, (void*)(uintptr_t)returnedcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)contexttype;
    (void)contextsize;
    (void)pooltype;
    (void)returnedcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateDeferredIoWorkItem(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateDeferredIoWorkItem");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecptype, jint sizeofcontext, jint flags, jlong cleanupcallback, jint pooltag, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecptype, (uint32_t)sizeofcontext, (uint32_t)flags, (void*)(uintptr_t)cleanupcallback, (uint32_t)pooltag, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)pooltag;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateExtraCreateParameterFromLookasideList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecptype, jint sizeofcontext, jint flags, jlong cleanupcallback, jlong lookasidelist, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateExtraCreateParameterFromLookasideList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecptype, (uint32_t)sizeofcontext, (uint32_t)flags, (void*)(uintptr_t)cleanupcallback, (void*)(uintptr_t)lookasidelist, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)lookasidelist;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jlong filter, jint flags, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateExtraCreateParameterList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (uint32_t)flags, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)flags;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateFileLock(JNIEnv* km_env, jclass km_clazz, jlong completelockcallbackdataroutine, jlong unlockroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateFileLock");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)completelockcallbackdataroutine, (void*)(uintptr_t)unlockroutine);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)completelockcallbackdataroutine;
    (void)unlockroutine;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocateGenericWorkItem(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateGenericWorkItem");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAllocatePoolAlignedWithTag(JNIEnv* km_env, jclass km_clazz, jlong instance, jint pooltype, jlong numberofbytes, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocatePoolAlignedWithTag");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (int32_t)pooltype, (uint64_t)numberofbytes, (uint32_t)tag);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)instance;
    (void)pooltype;
    (void)numberofbytes;
    (void)tag;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltApplyPriorityInfoThread(JNIEnv* km_env, jclass km_clazz, jlong inputpriorityinfo, jlong outputpriorityinfo, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltApplyPriorityInfoThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inputpriorityinfo, (void*)(uintptr_t)outputpriorityinfo, (int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAttachVolume(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong instancename, jlong retinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAttachVolume");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)instancename, (void*)(uintptr_t)retinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltAttachVolumeAtAltitude(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong altitude, jlong instancename, jlong retinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAttachVolumeAtAltitude");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)altitude, (void*)(uintptr_t)instancename, (void*)(uintptr_t)retinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)altitude;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltBuildDefaultSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jint desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltBuildDefaultSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)desiredaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCancelFileOpen(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancelFileOpen");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCancelIo(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancelIo");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCancellableWaitForMultipleObjects(JNIEnv* km_env, jclass km_clazz, jint count, jlong objectarray, jint waittype, jlong timeout, jlong waitblockarray, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancellableWaitForMultipleObjects");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)count, (void*)(uintptr_t)objectarray, (int32_t)waittype, (void*)(uintptr_t)timeout, (void*)(uintptr_t)waitblockarray, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCancellableWaitForSingleObject(JNIEnv* km_env, jclass km_clazz, jlong object, jlong timeout, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancellableWaitForSingleObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)timeout, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)timeout;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCbdqDisable(JNIEnv* km_env, jclass km_clazz, jlong cbdq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqDisable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)cbdq);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cbdq;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCbdqEnable(JNIEnv* km_env, jclass km_clazz, jlong cbdq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqEnable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)cbdq);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cbdq;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCbdqInitialize(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong cbdq, jlong cbdqinsertio, jlong cbdqremoveio, jlong cbdqpeeknextio, jlong cbdqacquire, jlong cbdqrelease, jlong cbdqcompletecanceledio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqInitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)cbdq, (void*)(uintptr_t)cbdqinsertio, (void*)(uintptr_t)cbdqremoveio, (void*)(uintptr_t)cbdqpeeknextio, (void*)(uintptr_t)cbdqacquire, (void*)(uintptr_t)cbdqrelease, (void*)(uintptr_t)cbdqcompletecanceledio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)cbdq;
    (void)cbdqinsertio;
    (void)cbdqremoveio;
    (void)cbdqpeeknextio;
    (void)cbdqacquire;
    (void)cbdqrelease;
    (void)cbdqcompletecanceledio;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCbdqInsertIo(JNIEnv* km_env, jclass km_clazz, jlong cbdq, jlong cbd, jlong context, jlong insertcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqInsertIo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cbdq, (void*)(uintptr_t)cbd, (void*)(uintptr_t)context, (void*)(uintptr_t)insertcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cbdq;
    (void)cbd;
    (void)context;
    (void)insertcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCbdqRemoveIo(JNIEnv* km_env, jclass km_clazz, jlong cbdq, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqRemoveIo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cbdq, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cbdq;
    (void)context;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCbdqRemoveNextIo(JNIEnv* km_env, jclass km_clazz, jlong cbdq, jlong peekcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqRemoveNextIo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cbdq, (void*)(uintptr_t)peekcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cbdq;
    (void)peekcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCheckAndGrowNameControl(JNIEnv* km_env, jclass km_clazz, jlong namectrl, jshort newsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckAndGrowNameControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)namectrl, (uint16_t)newsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)namectrl;
    (void)newsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCheckLockForReadAccess(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckLockForReadAccess");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCheckLockForWriteAccess(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckLockForWriteAccess");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCheckOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckOplock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCheckOplockEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint flags, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckOplockEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltClearCallbackDataDirty(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClearCallbackDataDirty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)data;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltClearCancelCompletion(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClearCancelCompletion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltClose(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCloseClientPort(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong clientport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseClientPort");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)clientport);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)clientport;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCloseCommunicationPort(JNIEnv* km_env, jclass km_clazz, jlong serverport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseCommunicationPort");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)serverport);
    } else {
        errno = ENOSYS;
    }
#else
    (void)serverport;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCloseSectionForDataScan(JNIEnv* km_env, jclass km_clazz, jlong sectioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseSectionForDataScan");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sectioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCommitComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCommitComplete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCommitFinalizeComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCommitFinalizeComplete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCompareInstanceAltitudes(JNIEnv* km_env, jclass km_clazz, jlong instance1, jlong instance2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompareInstanceAltitudes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance1, (int64_t)instance2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance1;
    (void)instance2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCompletePendedPostOperation(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompletePendedPostOperation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCompletePendedPreOperation(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jint callbackstatus, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompletePendedPreOperation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)callbackdata, (int32_t)callbackstatus, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    (void)callbackstatus;
    (void)context;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCopyOpenReparseList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCopyOpenReparseList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)data;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCreateCommunicationPort(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong serverport, jlong objectattributes, jlong serverportcookie, jlong connectnotifycallback, jlong disconnectnotifycallback, jlong messagenotifycallback, jint maxconnections) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateCommunicationPort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)serverport, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)serverportcookie, (void*)(uintptr_t)connectnotifycallback, (void*)(uintptr_t)disconnectnotifycallback, (void*)(uintptr_t)messagenotifycallback, (int32_t)maxconnections);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)serverport;
    (void)objectattributes;
    (void)serverportcookie;
    (void)connectnotifycallback;
    (void)disconnectnotifycallback;
    (void)messagenotifycallback;
    (void)maxconnections;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCreateFile(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jlong allocationsize, jint fileattributes, jint shareaccess, jint createdisposition, jint createoptions, jlong eabuffer, jint ealength, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)allocationsize, (uint32_t)fileattributes, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (void*)(uintptr_t)eabuffer, (uint32_t)ealength, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCreateFileEx(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jlong allocationsize, jint fileattributes, jint shareaccess, jint createdisposition, jint createoptions, jlong eabuffer, jint ealength, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)allocationsize, (uint32_t)fileattributes, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (void*)(uintptr_t)eabuffer, (uint32_t)ealength, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCreateFileEx2(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jlong allocationsize, jint fileattributes, jint shareaccess, jint createdisposition, jint createoptions, jlong eabuffer, jint ealength, jint flags, jlong drivercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFileEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)allocationsize, (uint32_t)fileattributes, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (void*)(uintptr_t)eabuffer, (uint32_t)ealength, (uint32_t)flags, (void*)(uintptr_t)drivercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    (void)flags;
    (void)drivercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCreateMailslotFile(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jint createoptions, jint mailslotquota, jint maximummessagesize, jlong readtimeout, jlong drivercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateMailslotFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (uint32_t)createoptions, (uint32_t)mailslotquota, (uint32_t)maximummessagesize, (void*)(uintptr_t)readtimeout, (void*)(uintptr_t)drivercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)createoptions;
    (void)mailslotquota;
    (void)maximummessagesize;
    (void)readtimeout;
    (void)drivercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCreateNamedPipeFile(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jint shareaccess, jint createdisposition, jint createoptions, jint namedpipetype, jint readmode, jint completionmode, jint maximuminstances, jint inboundquota, jint outboundquota, jlong defaulttimeout, jlong drivercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateNamedPipeFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (uint32_t)namedpipetype, (uint32_t)readmode, (uint32_t)completionmode, (uint32_t)maximuminstances, (uint32_t)inboundquota, (uint32_t)outboundquota, (void*)(uintptr_t)defaulttimeout, (void*)(uintptr_t)drivercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)filehandle;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)namedpipetype;
    (void)readmode;
    (void)completionmode;
    (void)maximuminstances;
    (void)inboundquota;
    (void)outboundquota;
    (void)defaulttimeout;
    (void)drivercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCreateSectionForDataScan(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong sectioncontext, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jint flags, jlong sectionhandle, jlong sectionobject, jlong sectionfilesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateSectionForDataScan");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)sectioncontext, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (uint32_t)flags, (void*)(uintptr_t)sectionhandle, (void*)(uintptr_t)sectionobject, (void*)(uintptr_t)sectionfilesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)sectioncontext;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)flags;
    (void)sectionhandle;
    (void)sectionobject;
    (void)sectionfilesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCreateSystemVolumeInformationFolder(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateSystemVolumeInformationFolder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCurrentBatchOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentBatchOplock");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCurrentOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentOplock");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltCurrentOplockH(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentOplockH");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDecodeParameters(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong mdladdresspointer, jlong buffer, jlong length, jlong desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDecodeParameters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)mdladdresspointer, (void*)(uintptr_t)buffer, (void*)(uintptr_t)length, (void*)(uintptr_t)desiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)mdladdresspointer;
    (void)buffer;
    (void)length;
    (void)desiredaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeleteContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeleteExtraCreateParameterLookasideList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong lookaside, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteExtraCreateParameterLookasideList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)lookaside, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeleteFileContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteFileContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeleteInstanceContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteInstanceContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeletePushLock(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeletePushLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeleteStreamContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteStreamContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeleteStreamHandleContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteStreamHandleContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeleteTransactionContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteTransactionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeleteVolumeContext(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteVolumeContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDetachVolume(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong instancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDetachVolume");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)instancename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDeviceIoControlFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint iocontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeviceIoControlFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)iocontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)iocontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltDoCompletionProcessingWhenSafe(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fltobjects, jlong completioncontext, jint flags, jlong safepostcallback, jlong retpostoperationstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDoCompletionProcessingWhenSafe");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)fltobjects, (void*)(uintptr_t)completioncontext, (uint32_t)flags, (void*)(uintptr_t)safepostcallback, (void*)(uintptr_t)retpostoperationstatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)data;
    (void)fltobjects;
    (void)completioncontext;
    (void)flags;
    (void)safepostcallback;
    (void)retpostoperationstatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnlistInTransaction(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext, jint notificationmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnlistInTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext, (uint32_t)notificationmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    (void)notificationmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateFilterInformation(JNIEnv* km_env, jclass km_clazz, jint arg_0_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateFilterInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)arg_0_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateFilters(JNIEnv* km_env, jclass km_clazz, jlong filterlist, jint filterlistsize, jlong numberfiltersreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateFilters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filterlist, (uint32_t)filterlistsize, (void*)(uintptr_t)numberfiltersreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filterlist;
    (void)filterlistsize;
    (void)numberfiltersreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateInstanceInformationByDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByDeviceObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateInstanceInformationByFilter(JNIEnv* km_env, jclass km_clazz, jlong filter, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateInstanceInformationByVolume(JNIEnv* km_env, jclass km_clazz, jlong volume, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByVolume");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateInstanceInformationByVolumeName(JNIEnv* km_env, jclass km_clazz, jlong volumename, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByVolumeName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)volumename, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volumename;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateInstances(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong filter, jlong instancelist, jint instancelistsize, jlong numberinstancesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstances");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (int64_t)filter, (void*)(uintptr_t)instancelist, (uint32_t)instancelistsize, (void*)(uintptr_t)numberinstancesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)filter;
    (void)instancelist;
    (void)instancelistsize;
    (void)numberinstancesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong filter, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateVolumeInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltEnumerateVolumes(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volumelist, jint volumelistsize, jlong numbervolumesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateVolumes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)volumelist, (uint32_t)volumelistsize, (void*)(uintptr_t)numbervolumesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volumelist;
    (void)volumelistsize;
    (void)numbervolumesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFastIoMdlRead(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlRead");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFastIoMdlReadComplete(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlReadComplete");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)mdlchain);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)mdlchain;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFastIoMdlWriteComplete(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong fileoffset, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlWriteComplete");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)mdlchain);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFastIoPrepareMdlWrite(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoPrepareMdlWrite");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFindExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist, jlong ecptype, jlong ecpcontext, jlong ecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFindExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)ecpcontext, (void*)(uintptr_t)ecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFlushBuffers(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFlushBuffers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFlushBuffers2(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint flushtype, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFlushBuffers2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)flushtype, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)flushtype;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreeCallbackData(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeCallbackData");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreeDeferredIoWorkItem(JNIEnv* km_env, jclass km_clazz, jlong fltworkitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeDeferredIoWorkItem");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)fltworkitem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fltworkitem;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreeExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeExtraCreateParameter");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreeExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeExtraCreateParameterList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecplist;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeFileLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filelock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreeGenericWorkItem(JNIEnv* km_env, jclass km_clazz, jlong fltworkitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeGenericWorkItem");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)fltworkitem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fltworkitem;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreeOpenReparseList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeOpenReparseList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecplist;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreePoolAlignedWithTag(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong buffer, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreePoolAlignedWithTag");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)instance, (void*)(uintptr_t)buffer, (uint32_t)tag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)instance;
    (void)buffer;
    (void)tag;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFreeSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeSecurityDescriptor");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
    }
#else
    (void)securitydescriptor;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltFsControlFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint fscontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFsControlFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)fscontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetActivityIdCallbackData(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetActivityIdCallbackData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetBottomInstance(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetBottomInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (void*)(uintptr_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetContexts(JNIEnv* km_env, jclass km_clazz, jlong fltobjects, jshort desiredcontexts, jlong contexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetContexts");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fltobjects, (uint16_t)desiredcontexts, (void*)(uintptr_t)contexts);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contexts;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetContextsEx(JNIEnv* km_env, jclass km_clazz, jlong fltobjects, jshort desiredcontexts, jlong contextssize, jlong contexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetContextsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fltobjects, (uint16_t)desiredcontexts, (uint64_t)contextssize, (void*)(uintptr_t)contexts);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contextssize;
    (void)contexts;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetDestinationFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong rootdirectory, jlong filename, jint filenamelength, jint nameoptions, jlong retfilenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDestinationFileNameInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)rootdirectory, (void*)(uintptr_t)filename, (uint32_t)filenamelength, (uint32_t)nameoptions, (void*)(uintptr_t)retfilenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)rootdirectory;
    (void)filename;
    (void)filenamelength;
    (void)nameoptions;
    (void)retfilenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDeviceObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)deviceobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetDiskDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong diskdeviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDiskDeviceObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (void*)(uintptr_t)diskdeviceobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)diskdeviceobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetEcpListFromCallbackData(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong callbackdata, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetEcpListFromCallbackData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetFileContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jint nameoptions, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileNameInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (uint32_t)nameoptions, (void*)(uintptr_t)filenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)nameoptions;
    (void)filenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetFileNameInformationUnsafe(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong instance, jint nameoptions, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileNameInformationUnsafe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (int64_t)instance, (uint32_t)nameoptions, (void*)(uintptr_t)filenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)instance;
    (void)nameoptions;
    (void)filenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetFileSystemType(JNIEnv* km_env, jclass km_clazz, jlong fltobject, jlong filesystemtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileSystemType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fltobject, (void*)(uintptr_t)filesystemtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobject;
    (void)filesystemtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetFilterFromInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong retfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterFromInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)retfilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)retfilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetFilterFromName(JNIEnv* km_env, jclass km_clazz, jlong filtername, jlong retfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filtername, (void*)(uintptr_t)retfilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filtername;
    (void)retfilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetFilterInformation(JNIEnv* km_env, jclass km_clazz, jlong filter, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetFsZeroingOffset(JNIEnv* km_env, jclass km_clazz, jlong data, jlong zeroingoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFsZeroingOffset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)zeroingoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)zeroingoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetInstanceContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetInstanceContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetInstanceInformation(JNIEnv* km_env, jclass km_clazz, jlong instance, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetInstanceInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetIoAttributionHandleFromCallbackData(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoAttributionHandleFromCallbackData");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)data;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetIoPriorityHint(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetIoPriorityHintFromCallbackData(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromCallbackData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetIoPriorityHintFromFileObject(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromFileObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetIoPriorityHintFromThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetIrpName(JNIEnv* km_env, jclass km_clazz, jbyte irpmajorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIrpName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)irpmajorcode);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)irpmajorcode;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetLowerInstance(JNIEnv* km_env, jclass km_clazz, jlong currentinstance, jlong lowerinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetLowerInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)currentinstance, (void*)(uintptr_t)lowerinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)currentinstance;
    (void)lowerinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetNewSystemBufferAddress(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetNewSystemBufferAddress");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetNextExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist, jlong currentecpcontext, jlong nextecptype, jlong nextecpcontext, jlong nextecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetNextExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist, (void*)(uintptr_t)currentecpcontext, (void*)(uintptr_t)nextecptype, (void*)(uintptr_t)nextecpcontext, (void*)(uintptr_t)nextecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetRequestorProcess(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcess");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetRequestorProcessId(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcessId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetRequestorProcessIdEx(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcessIdEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetRequestorSessionId(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorSessionId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)sessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetRoutineAddress(JNIEnv* km_env, jclass km_clazz, jlong fltmgrroutinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRoutineAddress");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fltmgrroutinename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fltmgrroutinename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetSectionContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetSectionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetStreamContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetStreamContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetStreamHandleContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetStreamHandleContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetSwappedBufferMdlAddress(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetSwappedBufferMdlAddress");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetTopInstance(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTopInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (void*)(uintptr_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetTransactionContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTransactionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetTunneledName(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong filenameinformation, jlong rettunneledfilenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTunneledName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)filenameinformation, (void*)(uintptr_t)rettunneledfilenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)filenameinformation;
    (void)rettunneledfilenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetUpperInstance(JNIEnv* km_env, jclass km_clazz, jlong currentinstance, jlong upperinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetUpperInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)currentinstance, (void*)(uintptr_t)upperinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)currentinstance;
    (void)upperinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeContext(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeFromDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong deviceobject, jlong retvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromDeviceObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)retvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)deviceobject;
    (void)retvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeFromFileObject(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong fileobject, jlong retvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromFileObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)retvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)fileobject;
    (void)retvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeFromInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong retvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)retvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)retvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeFromName(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volumename, jlong retvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)volumename, (void*)(uintptr_t)retvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volumename;
    (void)retvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeGuidName(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong volumeguidname, jlong buffersizeneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeGuidName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (void*)(uintptr_t)volumeguidname, (void*)(uintptr_t)buffersizeneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)volumeguidname;
    (void)buffersizeneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong volume, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeInstanceFromName(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong instancename, jlong retinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeInstanceFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)instancename, (void*)(uintptr_t)retinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeName(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong volumename, jlong buffersizeneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (void*)(uintptr_t)volumename, (void*)(uintptr_t)buffersizeneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)volumename;
    (void)buffersizeneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltGetVolumeProperties(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong volumeproperties, jint volumepropertieslength, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (void*)(uintptr_t)volumeproperties, (uint32_t)volumepropertieslength, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)volumeproperties;
    (void)volumepropertieslength;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltInitExtraCreateParameterLookasideList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong lookaside, jint flags, jlong size, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitExtraCreateParameterLookasideList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)lookaside, (uint32_t)flags, (uint64_t)size, (uint32_t)tag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltInitializeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializeFileLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filelock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltInitializeOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializeOplock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)oplock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltInitializePushLock(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializePushLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltInsertExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInsertExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecplist;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIs32bitProcess(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIs32bitProcess");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsCallbackDataDirty(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsCallbackDataDirty");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)data;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsDirectory(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong instance, jlong isdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsDirectory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (int64_t)instance, (void*)(uintptr_t)isdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)instance;
    (void)isdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsEcpAcknowledged(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsEcpAcknowledged");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsEcpFromUserMode(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsEcpFromUserMode");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsFltMgrVolumeDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsFltMgrVolumeDeviceObject");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)deviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsIoCanceled(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoCanceled");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsIoRedirectionAllowed(JNIEnv* km_env, jclass km_clazz, jlong sourceinstance, jlong targetinstance, jlong redirectionallowed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoRedirectionAllowed");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)sourceinstance, (int64_t)targetinstance, (void*)(uintptr_t)redirectionallowed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)redirectionallowed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsIoRedirectionAllowedForOperation(JNIEnv* km_env, jclass km_clazz, jlong data, jlong targetinstance, jlong redirectionallowedthisio, jlong redirectionallowedallio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoRedirectionAllowedForOperation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data, (int64_t)targetinstance, (void*)(uintptr_t)redirectionallowedthisio, (void*)(uintptr_t)redirectionallowedallio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)targetinstance;
    (void)redirectionallowedthisio;
    (void)redirectionallowedallio;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsOperationSynchronous(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsOperationSynchronous");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsVolumeSnapshot(JNIEnv* km_env, jclass km_clazz, jlong fltobject, jlong issnapshotvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsVolumeSnapshot");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fltobject, (void*)(uintptr_t)issnapshotvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobject;
    (void)issnapshotvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltIsVolumeWritable(JNIEnv* km_env, jclass km_clazz, jlong fltobject, jlong iswritable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsVolumeWritable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fltobject, (void*)(uintptr_t)iswritable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobject;
    (void)iswritable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltLoadFilter(JNIEnv* km_env, jclass km_clazz, jlong filtername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltLoadFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filtername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filtername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltLockUserBuffer(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltLockUserBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltObjectDereference(JNIEnv* km_env, jclass km_clazz, jlong fltobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltObjectDereference");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fltobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fltobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltObjectReference(JNIEnv* km_env, jclass km_clazz, jlong fltobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltObjectReference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fltobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOpenVolume(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong volumehandle, jlong volumefileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOpenVolume");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)volumehandle, (void*)(uintptr_t)volumefileobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)volumehandle;
    (void)volumefileobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOplockBreakH(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint flags, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakH");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOplockBreakToNone(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakToNone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOplockBreakToNoneEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint flags, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakToNoneEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOplockFsctrl(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint opencount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockFsctrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)opencount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOplockFsctrlEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint opencount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockFsctrlEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)opencount, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOplockIsFastIoPossible(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockIsFastIoPossible");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOplockIsSharedRequest(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockIsSharedRequest");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltOplockKeysEqual(JNIEnv* km_env, jclass km_clazz, jlong fo1, jlong fo2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockKeysEqual");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fo1, (void*)(uintptr_t)fo2);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fo1;
    (void)fo2;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltParseFileName(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong extension, jlong stream, jlong finalcomponent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltParseFileName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)extension, (void*)(uintptr_t)stream, (void*)(uintptr_t)finalcomponent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)extension;
    (void)stream;
    (void)finalcomponent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltParseFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltParseFileNameInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filenameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filenameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltPerformAsynchronousIo(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong callbackroutine, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPerformAsynchronousIo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltPerformSynchronousIo(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPerformSynchronousIo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltPrePrepareComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrePrepareComplete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltPrepareComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrepareComplete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltPrepareToReuseEcp(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrepareToReuseEcp");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltProcessFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong callbackdata, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltProcessFileLock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filelock;
    (void)callbackdata;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltPropagateActivityIdToThread(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong propagateid, jlong originalid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPropagateActivityIdToThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)propagateid, (void*)(uintptr_t)originalid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)propagateid;
    (void)originalid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltPropagateIrpExtension(JNIEnv* km_env, jclass km_clazz, jlong sourcedata, jlong targetdata, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPropagateIrpExtension");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcedata, (void*)(uintptr_t)targetdata, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcedata;
    (void)targetdata;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltPurgeFileNameInformationCache(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPurgeFileNameInformationCache");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueryDirectoryFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass, jboolean returnsingleentry, jlong filename, jboolean restartscan, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, bool, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryDirectoryFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (bool)returnsingleentry, (void*)(uintptr_t)filename, (bool)restartscan, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)returnsingleentry;
    (void)filename;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueryDirectoryFileEx(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass, jint queryflags, jlong filename, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryDirectoryFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (uint32_t)queryflags, (void*)(uintptr_t)filename, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)queryflags;
    (void)filename;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueryEaFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong returnedeadata, jint length, jboolean returnsingleentry, jlong ealist, jint ealistlength, jlong eaindex, jboolean restartscan, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryEaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)returnedeadata, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)ealist, (uint32_t)ealistlength, (void*)(uintptr_t)eaindex, (bool)restartscan, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)returnedeadata;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueryInformationByName(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong objectattributes, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jlong drivercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryInformationByName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (void*)(uintptr_t)drivercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)instance;
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)drivercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueryInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueryQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong sidlist, jint sidlistlength, jlong startsid, jboolean restartscan, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryQuotaInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)sidlist, (uint32_t)sidlistlength, (void*)(uintptr_t)startsid, (bool)restartscan, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQuerySecurityObject(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint securityinformation, jlong securitydescriptor, jint length, jlong lengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQuerySecurityObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor, (uint32_t)length, (void*)(uintptr_t)lengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueryVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong iosb, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryVolumeInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)iosb, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueryVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fsinformation, jint length, jint fsinformationclass, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryVolumeInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueueDeferredIoWorkItem(JNIEnv* km_env, jclass km_clazz, jlong fltworkitem, jlong data, jlong workerroutine, jint queuetype, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueueDeferredIoWorkItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)fltworkitem, (void*)(uintptr_t)data, (void*)(uintptr_t)workerroutine, (int32_t)queuetype, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltworkitem;
    (void)data;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltQueueGenericWorkItem(JNIEnv* km_env, jclass km_clazz, jlong fltworkitem, jlong fltobject, jlong workerroutine, jint queuetype, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueueGenericWorkItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)fltworkitem, (void*)(uintptr_t)fltobject, (void*)(uintptr_t)workerroutine, (int32_t)queuetype, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltworkitem;
    (void)fltobject;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReadFile(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong byteoffset, jint length, jlong buffer, jint flags, jlong bytesread, jlong callbackroutine, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReadFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)byteoffset, (uint32_t)length, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)bytesread;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReadFileEx(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong byteoffset, jint length, jlong buffer, jint flags, jlong bytesread, jlong callbackroutine, jlong callbackcontext, jlong key, jlong mdl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReadFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)byteoffset, (uint32_t)length, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)key, (void*)(uintptr_t)mdl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)bytesread;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)key;
    (void)mdl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReferenceContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReferenceContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReferenceFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReferenceFileNameInformation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filenameinformation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filenameinformation;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRegisterFilter(JNIEnv* km_env, jclass km_clazz, jlong driver, jlong registration, jlong retfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRegisterFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)driver, (void*)(uintptr_t)registration, (void*)(uintptr_t)retfilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driver;
    (void)registration;
    (void)retfilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRegisterForDataScan(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRegisterForDataScan");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReissueSynchronousIo(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReissueSynchronousIo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)initiatinginstance;
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReleaseContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReleaseContexts(JNIEnv* km_env, jclass km_clazz, jlong contexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContexts");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)contexts);
    } else {
        errno = ENOSYS;
    }
#else
    (void)contexts;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReleaseContextsEx(JNIEnv* km_env, jclass km_clazz, jlong contextssize, jlong contexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContextsEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint64_t)contextssize, (void*)(uintptr_t)contexts);
    } else {
        errno = ENOSYS;
    }
#else
    (void)contextssize;
    (void)contexts;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReleaseFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseFileNameInformation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filenameinformation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filenameinformation;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReleasePushLock(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleasePushLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReleasePushLockEx(JNIEnv* km_env, jclass km_clazz, jlong pushlock, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleasePushLockEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pushlock, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pushlock;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReleaseResource(JNIEnv* km_env, jclass km_clazz, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseResource");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)resource);
    } else {
        errno = ENOSYS;
    }
#else
    (void)resource;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRemoveExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist, jlong ecptype, jlong ecpcontext, jlong ecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRemoveExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)ecpcontext, (void*)(uintptr_t)ecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRemoveOpenReparseEntry(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jlong openreparseentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRemoveOpenReparseEntry");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (void*)(uintptr_t)openreparseentry);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRequestFileInfoOnCreateCompletion(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jint infoclassflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRequestFileInfoOnCreateCompletion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (uint32_t)infoclassflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)data;
    (void)infoclassflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRequestOperationStatusCallback(JNIEnv* km_env, jclass km_clazz, jlong data, jlong callbackroutine, jlong requestercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRequestOperationStatusCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)requestercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)callbackroutine;
    (void)requestercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRetainSwappedBufferMdlAddress(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetainSwappedBufferMdlAddress");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRetrieveFileInfoOnCreateCompletion(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jint infoclass, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveFileInfoOnCreateCompletion");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (uint32_t)infoclass, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRetrieveFileInfoOnCreateCompletionEx(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jint infoclass, jlong retinfosize, jlong retinfobuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveFileInfoOnCreateCompletionEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (uint32_t)infoclass, (void*)(uintptr_t)retinfosize, (void*)(uintptr_t)retinfobuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)retinfosize;
    (void)retinfobuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRetrieveIoPriorityInfo(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fileobject, jlong thread, jlong priorityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveIoPriorityInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)fileobject, (int64_t)thread, (void*)(uintptr_t)priorityinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltReuseCallbackData(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReuseCallbackData");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)callbackdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRollbackComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRollbackComplete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltRollbackEnlistment(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRollbackEnlistment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSendMessage(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong clientport, jlong senderbuffer, jint senderbufferlength, jlong replybuffer, jlong replylength, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSendMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)clientport, (void*)(uintptr_t)senderbuffer, (uint32_t)senderbufferlength, (void*)(uintptr_t)replybuffer, (void*)(uintptr_t)replylength, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)clientport;
    (void)senderbuffer;
    (void)senderbufferlength;
    (void)replybuffer;
    (void)replylength;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetActivityIdCallbackData(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetActivityIdCallbackData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetCallbackDataDirty(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetCallbackDataDirty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)data;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetCancelCompletion(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong canceledcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetCancelCompletion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)canceledcallback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)canceledcallback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetEaFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong eabuffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetEaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)eabuffer, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetEcpListIntoCallbackData(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong callbackdata, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetEcpListIntoCallbackData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetFileContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFileContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetFsZeroingOffset(JNIEnv* km_env, jclass km_clazz, jlong data, jint zeroingoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFsZeroingOffset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data, (uint32_t)zeroingoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)zeroingoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetFsZeroingOffsetRequired(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFsZeroingOffsetRequired");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetInstanceContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetInstanceContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetIoPriorityHintIntoCallbackData(JNIEnv* km_env, jclass km_clazz, jlong data, jint priorityhint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoCallbackData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)data, (int32_t)priorityhint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)priorityhint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetIoPriorityHintIntoFileObject(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint priorityhint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoFileObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (int32_t)priorityhint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)priorityhint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetIoPriorityHintIntoThread(JNIEnv* km_env, jclass km_clazz, jlong thread, jint priorityhint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread, (int32_t)priorityhint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)priorityhint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetQuotaInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)buffer, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetSecurityObject(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint securityinformation, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetSecurityObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetStreamContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetStreamContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetStreamHandleContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetStreamHandleContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetTransactionContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetTransactionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)transaction;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetVolumeContext(JNIEnv* km_env, jclass km_clazz, jlong volume, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetVolumeContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)volume, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volume;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSetVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong iosb, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetVolumeInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)instance, (void*)(uintptr_t)iosb, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltStartFiltering(JNIEnv* km_env, jclass km_clazz, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltStartFiltering");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)filter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSupportsFileContexts(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsFileContexts");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSupportsFileContextsEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsFileContextsEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (int64_t)instance);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)instance;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSupportsStreamContexts(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsStreamContexts");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltSupportsStreamHandleContexts(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsStreamHandleContexts");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltTagFile(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jint filetag, jlong guid, jlong databuffer, jshort databufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltTagFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (uint32_t)filetag, (void*)(uintptr_t)guid, (void*)(uintptr_t)databuffer, (uint16_t)databufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    (void)databuffer;
    (void)databufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltTagFileEx(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jint filetag, jlong guid, jlong databuffer, jshort databufferlength, jint existingfiletag, jlong existingguid, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint16_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltTagFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (uint32_t)filetag, (void*)(uintptr_t)guid, (void*)(uintptr_t)databuffer, (uint16_t)databufferlength, (uint32_t)existingfiletag, (void*)(uintptr_t)existingguid, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    (void)databuffer;
    (void)databufferlength;
    (void)existingfiletag;
    (void)existingguid;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltUninitializeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUninitializeFileLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filelock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltUninitializeOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUninitializeOplock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)oplock;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltUnloadFilter(JNIEnv* km_env, jclass km_clazz, jlong filtername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUnloadFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filtername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filtername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltUnregisterFilter(JNIEnv* km_env, jclass km_clazz, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUnregisterFilter");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)filter);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filter;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltUntagFile(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jint filetag, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUntagFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (uint32_t)filetag, (void*)(uintptr_t)guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltVetoBypassIo(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong fltobjects, jint operationstatus, jlong failurereason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltVetoBypassIo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)fltobjects, (int32_t)operationstatus, (void*)(uintptr_t)failurereason);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackdata;
    (void)fltobjects;
    (void)operationstatus;
    (void)failurereason;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltWriteFile(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong byteoffset, jint length, jlong buffer, jint flags, jlong byteswritten, jlong callbackroutine, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltWriteFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)byteoffset, (uint32_t)length, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)byteswritten, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)byteswritten;
    (void)callbackroutine;
    (void)callbackcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltWriteFileEx(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong byteoffset, jint length, jlong buffer, jint flags, jlong byteswritten, jlong callbackroutine, jlong callbackcontext, jlong key, jlong mdl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltWriteFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)byteoffset, (uint32_t)length, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)byteswritten, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)key, (void*)(uintptr_t)mdl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)byteoffset;
    (void)length;
    (void)buffer;
    (void)flags;
    (void)byteswritten;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)key;
    (void)mdl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1fltpTraceRedirectedFileIo(JNIEnv* km_env, jclass km_clazz, jlong originatingfileobject, jlong childcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltpTraceRedirectedFileIo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)originatingfileobject, (void*)(uintptr_t)childcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)originatingfileobject;
    (void)childcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

