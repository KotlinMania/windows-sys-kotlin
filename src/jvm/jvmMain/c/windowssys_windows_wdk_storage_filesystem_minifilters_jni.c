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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAcknowledgeEcp(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcknowledgeEcp");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext);
#else
    (void)filter;
    (void)ecpcontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAcquirePushLockExclusive(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockExclusive");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pushlock);
#else
    (void)pushlock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAcquirePushLockExclusiveEx(JNIEnv* km_env, jclass km_clazz, jlong pushlock, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockExclusiveEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pushlock, (uint32_t)flags);
#else
    (void)pushlock;
    (void)flags;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAcquirePushLockShared(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockShared");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pushlock);
#else
    (void)pushlock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAcquirePushLockSharedEx(JNIEnv* km_env, jclass km_clazz, jlong pushlock, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquirePushLockSharedEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pushlock, (uint32_t)flags);
#else
    (void)pushlock;
    (void)flags;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAcquireResourceExclusive(JNIEnv* km_env, jclass km_clazz, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquireResourceExclusive");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)resource);
#else
    (void)resource;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAcquireResourceShared(JNIEnv* km_env, jclass km_clazz, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAcquireResourceShared");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)resource);
#else
    (void)resource;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAddOpenReparseEntry(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jlong openreparseentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAddOpenReparseEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (void*)(uintptr_t)openreparseentry) : -1;
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAdjustDeviceStackSizeForIoRedirection(JNIEnv* km_env, jclass km_clazz, jlong sourceinstance, jlong targetinstance, jlong sourcedevicestacksizemodified) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAdjustDeviceStackSizeForIoRedirection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)sourceinstance, (int64_t)targetinstance, (void*)(uintptr_t)sourcedevicestacksizemodified) : -1;
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)sourcedevicestacksizemodified;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAllocateCallbackData(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong retnewcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateCallbackData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)retnewcallbackdata) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)retnewcallbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAllocateCallbackDataEx(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint flags, jlong retnewcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateCallbackDataEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)flags, (void*)(uintptr_t)retnewcallbackdata) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)flags;
    (void)retnewcallbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAllocateContext(JNIEnv* km_env, jclass km_clazz, jlong filter, jshort contexttype, jlong contextsize, jint pooltype, jlong returnedcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, uint64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (uint16_t)contexttype, (uint64_t)contextsize, (int32_t)pooltype, (void*)(uintptr_t)returnedcontext) : -1;
#else
    (void)filter;
    (void)contexttype;
    (void)contextsize;
    (void)pooltype;
    (void)returnedcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAllocateDeferredIoWorkItem(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateDeferredIoWorkItem");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAllocateExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jlong filter, jint flags, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateExtraCreateParameterList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (uint32_t)flags, (void*)(uintptr_t)ecplist) : -1;
#else
    (void)filter;
    (void)flags;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAllocateGenericWorkItem(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocateGenericWorkItem");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAllocatePoolAlignedWithTag(JNIEnv* km_env, jclass km_clazz, jlong instance, jint pooltype, jlong numberofbytes, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAllocatePoolAlignedWithTag");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (int32_t)pooltype, (uint64_t)numberofbytes, (uint32_t)tag) : NULL;
#else
    (void)instance;
    (void)pooltype;
    (void)numberofbytes;
    (void)tag;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltApplyPriorityInfoThread(JNIEnv* km_env, jclass km_clazz, jlong inputpriorityinfo, jlong outputpriorityinfo, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltApplyPriorityInfoThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inputpriorityinfo, (void*)(uintptr_t)outputpriorityinfo, (int64_t)thread) : -1;
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAttachVolume(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong instancename, jlong retinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAttachVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)instancename, (void*)(uintptr_t)retinstance) : -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltAttachVolumeAtAltitude(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong altitude, jlong instancename, jlong retinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltAttachVolumeAtAltitude");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)altitude, (void*)(uintptr_t)instancename, (void*)(uintptr_t)retinstance) : -1;
#else
    (void)filter;
    (void)volume;
    (void)altitude;
    (void)instancename;
    (void)retinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltBuildDefaultSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jint desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltBuildDefaultSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess) : -1;
#else
    (void)securitydescriptor;
    (void)desiredaccess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCancelFileOpen(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancelFileOpen");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject);
#else
    (void)instance;
    (void)fileobject;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCancelIo(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancelIo");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCancellableWaitForMultipleObjects(JNIEnv* km_env, jclass km_clazz, jint count, jlong objectarray, jint waittype, jlong timeout, jlong waitblockarray, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancellableWaitForMultipleObjects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)count, (void*)(uintptr_t)objectarray, (int32_t)waittype, (void*)(uintptr_t)timeout, (void*)(uintptr_t)waitblockarray, (void*)(uintptr_t)callbackdata) : -1;
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCancellableWaitForSingleObject(JNIEnv* km_env, jclass km_clazz, jlong object, jlong timeout, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCancellableWaitForSingleObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)timeout, (void*)(uintptr_t)callbackdata) : -1;
#else
    (void)object;
    (void)timeout;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCbdqDisable(JNIEnv* km_env, jclass km_clazz, jlong cbdq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqDisable");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)cbdq);
#else
    (void)cbdq;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCbdqEnable(JNIEnv* km_env, jclass km_clazz, jlong cbdq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqEnable");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)cbdq);
#else
    (void)cbdq;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCbdqInitialize(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong cbdq, jlong cbdqinsertio, jlong cbdqremoveio, jlong cbdqpeeknextio, jlong cbdqacquire, jlong cbdqrelease, jlong cbdqcompletecanceledio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqInitialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)cbdq, (void*)(uintptr_t)cbdqinsertio, (void*)(uintptr_t)cbdqremoveio, (void*)(uintptr_t)cbdqpeeknextio, (void*)(uintptr_t)cbdqacquire, (void*)(uintptr_t)cbdqrelease, (void*)(uintptr_t)cbdqcompletecanceledio) : -1;
#else
    (void)instance;
    (void)cbdq;
    (void)cbdqinsertio;
    (void)cbdqremoveio;
    (void)cbdqpeeknextio;
    (void)cbdqacquire;
    (void)cbdqrelease;
    (void)cbdqcompletecanceledio;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCbdqInsertIo(JNIEnv* km_env, jclass km_clazz, jlong cbdq, jlong cbd, jlong context, jlong insertcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqInsertIo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cbdq, (void*)(uintptr_t)cbd, (void*)(uintptr_t)context, (void*)(uintptr_t)insertcontext) : -1;
#else
    (void)cbdq;
    (void)cbd;
    (void)context;
    (void)insertcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCbdqRemoveIo(JNIEnv* km_env, jclass km_clazz, jlong cbdq, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqRemoveIo");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cbdq, (void*)(uintptr_t)context) : NULL;
#else
    (void)cbdq;
    (void)context;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCbdqRemoveNextIo(JNIEnv* km_env, jclass km_clazz, jlong cbdq, jlong peekcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCbdqRemoveNextIo");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cbdq, (void*)(uintptr_t)peekcontext) : NULL;
#else
    (void)cbdq;
    (void)peekcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCheckAndGrowNameControl(JNIEnv* km_env, jclass km_clazz, jlong namectrl, jshort newsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckAndGrowNameControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namectrl, (uint16_t)newsize) : -1;
#else
    (void)namectrl;
    (void)newsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCheckLockForReadAccess(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckLockForReadAccess");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)callbackdata) : false;
#else
    (void)filelock;
    (void)callbackdata;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCheckLockForWriteAccess(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckLockForWriteAccess");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)callbackdata) : false;
#else
    (void)filelock;
    (void)callbackdata;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCheckOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckOplock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCheckOplockEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint flags, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCheckOplockEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltClearCallbackDataDirty(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClearCallbackDataDirty");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)data);
#else
    (void)data;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltClearCancelCompletion(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClearCancelCompletion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : -1;
#else
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltClose(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle) : -1;
#else
    (void)filehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCloseClientPort(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong clientport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseClientPort");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)clientport);
#else
    (void)filter;
    (void)clientport;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCloseCommunicationPort(JNIEnv* km_env, jclass km_clazz, jlong serverport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseCommunicationPort");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)serverport);
#else
    (void)serverport;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCloseSectionForDataScan(JNIEnv* km_env, jclass km_clazz, jlong sectioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCloseSectionForDataScan");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectioncontext) : -1;
#else
    (void)sectioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCommitComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCommitComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCommitFinalizeComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCommitFinalizeComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCompareInstanceAltitudes(JNIEnv* km_env, jclass km_clazz, jlong instance1, jlong instance2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompareInstanceAltitudes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance1, (int64_t)instance2) : -1;
#else
    (void)instance1;
    (void)instance2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCompletePendedPostOperation(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompletePendedPostOperation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)callbackdata);
#else
    (void)callbackdata;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCompletePendedPreOperation(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jint callbackstatus, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCompletePendedPreOperation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)callbackdata, (int32_t)callbackstatus, (void*)(uintptr_t)context);
#else
    (void)callbackdata;
    (void)callbackstatus;
    (void)context;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCopyOpenReparseList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCopyOpenReparseList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (void*)(uintptr_t)ecplist) : -1;
#else
    (void)filter;
    (void)data;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCreateCommunicationPort(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong serverport, jlong objectattributes, jlong serverportcookie, jlong connectnotifycallback, jlong disconnectnotifycallback, jlong messagenotifycallback, jint maxconnections) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateCommunicationPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)serverport, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)serverportcookie, (void*)(uintptr_t)connectnotifycallback, (void*)(uintptr_t)disconnectnotifycallback, (void*)(uintptr_t)messagenotifycallback, (int32_t)maxconnections) : -1;
#else
    (void)filter;
    (void)serverport;
    (void)objectattributes;
    (void)serverportcookie;
    (void)connectnotifycallback;
    (void)disconnectnotifycallback;
    (void)messagenotifycallback;
    (void)maxconnections;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCreateFile(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jlong allocationsize, jint fileattributes, jint shareaccess, jint createdisposition, jint createoptions, jlong eabuffer, jint ealength, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)allocationsize, (uint32_t)fileattributes, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (void*)(uintptr_t)eabuffer, (uint32_t)ealength, (uint32_t)flags) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCreateFileEx(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jlong allocationsize, jint fileattributes, jint shareaccess, jint createdisposition, jint createoptions, jlong eabuffer, jint ealength, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)allocationsize, (uint32_t)fileattributes, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (void*)(uintptr_t)eabuffer, (uint32_t)ealength, (uint32_t)flags) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCreateFileEx2(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jlong allocationsize, jint fileattributes, jint shareaccess, jint createdisposition, jint createoptions, jlong eabuffer, jint ealength, jint flags, jlong drivercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateFileEx2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)allocationsize, (uint32_t)fileattributes, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (void*)(uintptr_t)eabuffer, (uint32_t)ealength, (uint32_t)flags, (void*)(uintptr_t)drivercontext) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCreateMailslotFile(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jint createoptions, jint mailslotquota, jint maximummessagesize, jlong readtimeout, jlong drivercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateMailslotFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (uint32_t)createoptions, (uint32_t)mailslotquota, (uint32_t)maximummessagesize, (void*)(uintptr_t)readtimeout, (void*)(uintptr_t)drivercontext) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCreateNamedPipeFile(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong filehandle, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jint shareaccess, jint createdisposition, jint createoptions, jint namedpipetype, jint readmode, jint completionmode, jint maximuminstances, jint inboundquota, jint outboundquota, jlong defaulttimeout, jlong drivercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateNamedPipeFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (uint32_t)namedpipetype, (uint32_t)readmode, (uint32_t)completionmode, (uint32_t)maximuminstances, (uint32_t)inboundquota, (uint32_t)outboundquota, (void*)(uintptr_t)defaulttimeout, (void*)(uintptr_t)drivercontext) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCreateSectionForDataScan(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong sectioncontext, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jint flags, jlong sectionhandle, jlong sectionobject, jlong sectionfilesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateSectionForDataScan");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)sectioncontext, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (uint32_t)flags, (void*)(uintptr_t)sectionhandle, (void*)(uintptr_t)sectionobject, (void*)(uintptr_t)sectionfilesize) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCreateSystemVolumeInformationFolder(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCreateSystemVolumeInformationFolder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCurrentBatchOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentBatchOplock");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCurrentOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentOplock");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltCurrentOplockH(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltCurrentOplockH");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDecodeParameters(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong mdladdresspointer, jlong buffer, jlong length, jlong desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDecodeParameters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)mdladdresspointer, (void*)(uintptr_t)buffer, (void*)(uintptr_t)length, (void*)(uintptr_t)desiredaccess) : -1;
#else
    (void)callbackdata;
    (void)mdladdresspointer;
    (void)buffer;
    (void)length;
    (void)desiredaccess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeleteContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)context);
#else
    (void)context;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeleteExtraCreateParameterLookasideList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong lookaside, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteExtraCreateParameterLookasideList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)lookaside, (uint32_t)flags);
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeleteFileContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteFileContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeleteInstanceContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteInstanceContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeletePushLock(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeletePushLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pushlock);
#else
    (void)pushlock;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeleteStreamContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteStreamContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeleteStreamHandleContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteStreamHandleContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeleteTransactionContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteTransactionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeleteVolumeContext(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeleteVolumeContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)filter;
    (void)volume;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDetachVolume(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong instancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDetachVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)instancename) : -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDeviceIoControlFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint iocontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDeviceIoControlFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)iocontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength, (void*)(uintptr_t)lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)iocontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltDoCompletionProcessingWhenSafe(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fltobjects, jlong completioncontext, jint flags, jlong safepostcallback, jlong retpostoperationstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltDoCompletionProcessingWhenSafe");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)fltobjects, (void*)(uintptr_t)completioncontext, (uint32_t)flags, (void*)(uintptr_t)safepostcallback, (void*)(uintptr_t)retpostoperationstatus) : false;
#else
    (void)data;
    (void)fltobjects;
    (void)completioncontext;
    (void)flags;
    (void)safepostcallback;
    (void)retpostoperationstatus;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnlistInTransaction(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext, jint notificationmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnlistInTransaction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext, (uint32_t)notificationmask) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    (void)notificationmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateFilterInformation(JNIEnv* km_env, jclass km_clazz, jint arg_0_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateFilterInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)arg_0_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)arg_0_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateFilters(JNIEnv* km_env, jclass km_clazz, jlong filterlist, jint filterlistsize, jlong numberfiltersreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateFilters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filterlist, (uint32_t)filterlistsize, (void*)(uintptr_t)numberfiltersreturned) : -1;
#else
    (void)filterlist;
    (void)filterlistsize;
    (void)numberfiltersreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateInstanceInformationByDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByDeviceObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)deviceobject;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateInstanceInformationByFilter(JNIEnv* km_env, jclass km_clazz, jlong filter, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)filter;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateInstanceInformationByVolume(JNIEnv* km_env, jclass km_clazz, jlong volume, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)volume;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateInstanceInformationByVolumeName(JNIEnv* km_env, jclass km_clazz, jlong volumename, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstanceInformationByVolumeName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumename, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)volumename;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateInstances(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong filter, jlong instancelist, jint instancelistsize, jlong numberinstancesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateInstances");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (int64_t)filter, (void*)(uintptr_t)instancelist, (uint32_t)instancelistsize, (void*)(uintptr_t)numberinstancesreturned) : -1;
#else
    (void)volume;
    (void)filter;
    (void)instancelist;
    (void)instancelistsize;
    (void)numberinstancesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong filter, jint arg_1_index, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateVolumeInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (uint32_t)arg_1_index, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)filter;
    (void)arg_1_index;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltEnumerateVolumes(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volumelist, jint volumelistsize, jlong numbervolumesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltEnumerateVolumes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)volumelist, (uint32_t)volumelistsize, (void*)(uintptr_t)numbervolumesreturned) : -1;
#else
    (void)filter;
    (void)volumelist;
    (void)volumelistsize;
    (void)numbervolumesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFastIoMdlRead(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlRead");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus) : false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFastIoMdlReadComplete(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlReadComplete");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)mdlchain) : false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)mdlchain;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFastIoMdlWriteComplete(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong fileoffset, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoMdlWriteComplete");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)mdlchain) : false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFastIoPrepareMdlWrite(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFastIoPrepareMdlWrite");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus) : false;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFindExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist, jlong ecptype, jlong ecpcontext, jlong ecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFindExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)ecpcontext, (void*)(uintptr_t)ecpcontextsize) : -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFlushBuffers(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFlushBuffers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject) : -1;
#else
    (void)instance;
    (void)fileobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFlushBuffers2(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint flushtype, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFlushBuffers2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)flushtype, (void*)(uintptr_t)callbackdata) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)flushtype;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreeCallbackData(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeCallbackData");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)callbackdata);
#else
    (void)callbackdata;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreeDeferredIoWorkItem(JNIEnv* km_env, jclass km_clazz, jlong fltworkitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeDeferredIoWorkItem");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)fltworkitem);
#else
    (void)fltworkitem;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreeExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeExtraCreateParameter");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext);
#else
    (void)filter;
    (void)ecpcontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreeExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeExtraCreateParameterList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist);
#else
    (void)filter;
    (void)ecplist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeFileLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filelock);
#else
    (void)filelock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreeGenericWorkItem(JNIEnv* km_env, jclass km_clazz, jlong fltworkitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeGenericWorkItem");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)fltworkitem);
#else
    (void)fltworkitem;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreeOpenReparseList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeOpenReparseList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist);
#else
    (void)filter;
    (void)ecplist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreePoolAlignedWithTag(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong buffer, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreePoolAlignedWithTag");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)instance, (void*)(uintptr_t)buffer, (uint32_t)tag);
#else
    (void)instance;
    (void)buffer;
    (void)tag;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFreeSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFreeSecurityDescriptor");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)securitydescriptor);
#else
    (void)securitydescriptor;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltFsControlFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint fscontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltFsControlFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)fscontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength, (void*)(uintptr_t)lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetActivityIdCallbackData(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetActivityIdCallbackData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)guid) : -1;
#else
    (void)callbackdata;
    (void)guid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetBottomInstance(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetBottomInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (void*)(uintptr_t)instance) : -1;
#else
    (void)volume;
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetContexts(JNIEnv* km_env, jclass km_clazz, jlong fltobjects, jshort desiredcontexts, jlong contexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetContexts");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fltobjects, (uint16_t)desiredcontexts, (void*)(uintptr_t)contexts);
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contexts;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetContextsEx(JNIEnv* km_env, jclass km_clazz, jlong fltobjects, jshort desiredcontexts, jlong contextssize, jlong contexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetContextsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fltobjects, (uint16_t)desiredcontexts, (uint64_t)contextssize, (void*)(uintptr_t)contexts) : -1;
#else
    (void)fltobjects;
    (void)desiredcontexts;
    (void)contextssize;
    (void)contexts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetDestinationFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong rootdirectory, jlong filename, jint filenamelength, jint nameoptions, jlong retfilenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDestinationFileNameInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)rootdirectory, (void*)(uintptr_t)filename, (uint32_t)filenamelength, (uint32_t)nameoptions, (void*)(uintptr_t)retfilenameinformation) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)rootdirectory;
    (void)filename;
    (void)filenamelength;
    (void)nameoptions;
    (void)retfilenameinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDeviceObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (void*)(uintptr_t)deviceobject) : -1;
#else
    (void)volume;
    (void)deviceobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetDiskDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong diskdeviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetDiskDeviceObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (void*)(uintptr_t)diskdeviceobject) : -1;
#else
    (void)volume;
    (void)diskdeviceobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetEcpListFromCallbackData(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong callbackdata, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetEcpListFromCallbackData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)ecplist) : -1;
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetFileContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)context) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jint nameoptions, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileNameInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (uint32_t)nameoptions, (void*)(uintptr_t)filenameinformation) : -1;
#else
    (void)callbackdata;
    (void)nameoptions;
    (void)filenameinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetFileNameInformationUnsafe(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong instance, jint nameoptions, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileNameInformationUnsafe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (int64_t)instance, (uint32_t)nameoptions, (void*)(uintptr_t)filenameinformation) : -1;
#else
    (void)fileobject;
    (void)instance;
    (void)nameoptions;
    (void)filenameinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetFileSystemType(JNIEnv* km_env, jclass km_clazz, jlong fltobject, jlong filesystemtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFileSystemType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fltobject, (void*)(uintptr_t)filesystemtype) : -1;
#else
    (void)fltobject;
    (void)filesystemtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetFilterFromInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong retfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterFromInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)retfilter) : -1;
#else
    (void)instance;
    (void)retfilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetFilterFromName(JNIEnv* km_env, jclass km_clazz, jlong filtername, jlong retfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterFromName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filtername, (void*)(uintptr_t)retfilter) : -1;
#else
    (void)filtername;
    (void)retfilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetFilterInformation(JNIEnv* km_env, jclass km_clazz, jlong filter, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFilterInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)filter;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetFsZeroingOffset(JNIEnv* km_env, jclass km_clazz, jlong data, jlong zeroingoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetFsZeroingOffset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)zeroingoffset) : -1;
#else
    (void)data;
    (void)zeroingoffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetInstanceContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetInstanceContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)context) : -1;
#else
    (void)instance;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetInstanceInformation(JNIEnv* km_env, jclass km_clazz, jlong instance, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetInstanceInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)instance;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetIoAttributionHandleFromCallbackData(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoAttributionHandleFromCallbackData");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data) : NULL;
#else
    (void)data;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetIoPriorityHint(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data) : -1;
#else
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetIoPriorityHintFromCallbackData(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromCallbackData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data) : -1;
#else
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetIoPriorityHintFromFileObject(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromFileObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : -1;
#else
    (void)fileobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetIoPriorityHintFromThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIoPriorityHintFromThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread) : -1;
#else
    (void)thread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetIrpName(JNIEnv* km_env, jclass km_clazz, jbyte irpmajorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetIrpName");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint8_t)irpmajorcode) : NULL;
#else
    (void)irpmajorcode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetLowerInstance(JNIEnv* km_env, jclass km_clazz, jlong currentinstance, jlong lowerinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetLowerInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)currentinstance, (void*)(uintptr_t)lowerinstance) : -1;
#else
    (void)currentinstance;
    (void)lowerinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetNewSystemBufferAddress(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetNewSystemBufferAddress");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : NULL;
#else
    (void)callbackdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetNextExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist, jlong currentecpcontext, jlong nextecptype, jlong nextecpcontext, jlong nextecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetNextExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist, (void*)(uintptr_t)currentecpcontext, (void*)(uintptr_t)nextecptype, (void*)(uintptr_t)nextecpcontext, (void*)(uintptr_t)nextecpcontextsize) : -1;
#else
    (void)filter;
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetRequestorProcess(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcess");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : -1;
#else
    (void)callbackdata;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetRequestorProcessId(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcessId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : 0;
#else
    (void)callbackdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetRequestorProcessIdEx(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorProcessIdEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : NULL;
#else
    (void)callbackdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetRequestorSessionId(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRequestorSessionId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)sessionid) : -1;
#else
    (void)callbackdata;
    (void)sessionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetRoutineAddress(JNIEnv* km_env, jclass km_clazz, jlong fltmgrroutinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetRoutineAddress");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fltmgrroutinename) : NULL;
#else
    (void)fltmgrroutinename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetSectionContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetSectionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)context) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetStreamContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetStreamContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)context) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetStreamHandleContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetStreamHandleContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)context) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetSwappedBufferMdlAddress(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetSwappedBufferMdlAddress");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : NULL;
#else
    (void)callbackdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetTopInstance(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTopInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (void*)(uintptr_t)instance) : -1;
#else
    (void)volume;
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetTransactionContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTransactionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)context) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetTunneledName(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong filenameinformation, jlong rettunneledfilenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetTunneledName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)filenameinformation, (void*)(uintptr_t)rettunneledfilenameinformation) : -1;
#else
    (void)callbackdata;
    (void)filenameinformation;
    (void)rettunneledfilenameinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetUpperInstance(JNIEnv* km_env, jclass km_clazz, jlong currentinstance, jlong upperinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetUpperInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)currentinstance, (void*)(uintptr_t)upperinstance) : -1;
#else
    (void)currentinstance;
    (void)upperinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeContext(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)context) : -1;
#else
    (void)filter;
    (void)volume;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeFromDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong deviceobject, jlong retvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromDeviceObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)retvolume) : -1;
#else
    (void)filter;
    (void)deviceobject;
    (void)retvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeFromFileObject(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong fileobject, jlong retvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromFileObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)retvolume) : -1;
#else
    (void)filter;
    (void)fileobject;
    (void)retvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeFromInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong retvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)retvolume) : -1;
#else
    (void)instance;
    (void)retvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeFromName(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volumename, jlong retvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeFromName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)volumename, (void*)(uintptr_t)retvolume) : -1;
#else
    (void)filter;
    (void)volumename;
    (void)retvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeGuidName(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong volumeguidname, jlong buffersizeneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeGuidName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (void*)(uintptr_t)volumeguidname, (void*)(uintptr_t)buffersizeneeded) : -1;
#else
    (void)volume;
    (void)volumeguidname;
    (void)buffersizeneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong volume, jint informationclass, jlong buffer, jint buffersize, jlong bytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (int32_t)informationclass, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesreturned) : -1;
#else
    (void)volume;
    (void)informationclass;
    (void)buffer;
    (void)buffersize;
    (void)bytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeInstanceFromName(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong volume, jlong instancename, jlong retinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeInstanceFromName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)volume, (void*)(uintptr_t)instancename, (void*)(uintptr_t)retinstance) : -1;
#else
    (void)filter;
    (void)volume;
    (void)instancename;
    (void)retinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeName(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong volumename, jlong buffersizeneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (void*)(uintptr_t)volumename, (void*)(uintptr_t)buffersizeneeded) : -1;
#else
    (void)volume;
    (void)volumename;
    (void)buffersizeneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltGetVolumeProperties(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong volumeproperties, jint volumepropertieslength, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltGetVolumeProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (void*)(uintptr_t)volumeproperties, (uint32_t)volumepropertieslength, (void*)(uintptr_t)lengthreturned) : -1;
#else
    (void)volume;
    (void)volumeproperties;
    (void)volumepropertieslength;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltInitExtraCreateParameterLookasideList(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong lookaside, jint flags, jlong size, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitExtraCreateParameterLookasideList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)lookaside, (uint32_t)flags, (uint64_t)size, (uint32_t)tag);
#else
    (void)filter;
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltInitializeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializeFileLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filelock);
#else
    (void)filelock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltInitializeOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializeOplock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)oplock);
#else
    (void)oplock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltInitializePushLock(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInitializePushLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pushlock);
#else
    (void)pushlock;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltInsertExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltInsertExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecpcontext) : -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIs32bitProcess(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIs32bitProcess");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsCallbackDataDirty(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsCallbackDataDirty");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data) : false;
#else
    (void)data;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsDirectory(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong instance, jlong isdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsDirectory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (int64_t)instance, (void*)(uintptr_t)isdirectory) : -1;
#else
    (void)fileobject;
    (void)instance;
    (void)isdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsEcpAcknowledged(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsEcpAcknowledged");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext) : false;
#else
    (void)filter;
    (void)ecpcontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsEcpFromUserMode(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsEcpFromUserMode");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext) : false;
#else
    (void)filter;
    (void)ecpcontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsFltMgrVolumeDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsFltMgrVolumeDeviceObject");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject) : false;
#else
    (void)deviceobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsIoCanceled(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoCanceled");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsIoRedirectionAllowed(JNIEnv* km_env, jclass km_clazz, jlong sourceinstance, jlong targetinstance, jlong redirectionallowed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoRedirectionAllowed");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)sourceinstance, (int64_t)targetinstance, (void*)(uintptr_t)redirectionallowed) : -1;
#else
    (void)sourceinstance;
    (void)targetinstance;
    (void)redirectionallowed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsIoRedirectionAllowedForOperation(JNIEnv* km_env, jclass km_clazz, jlong data, jlong targetinstance, jlong redirectionallowedthisio, jlong redirectionallowedallio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsIoRedirectionAllowedForOperation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data, (int64_t)targetinstance, (void*)(uintptr_t)redirectionallowedthisio, (void*)(uintptr_t)redirectionallowedallio) : -1;
#else
    (void)data;
    (void)targetinstance;
    (void)redirectionallowedthisio;
    (void)redirectionallowedallio;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsOperationSynchronous(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsOperationSynchronous");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsVolumeSnapshot(JNIEnv* km_env, jclass km_clazz, jlong fltobject, jlong issnapshotvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsVolumeSnapshot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fltobject, (void*)(uintptr_t)issnapshotvolume) : -1;
#else
    (void)fltobject;
    (void)issnapshotvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltIsVolumeWritable(JNIEnv* km_env, jclass km_clazz, jlong fltobject, jlong iswritable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltIsVolumeWritable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fltobject, (void*)(uintptr_t)iswritable) : -1;
#else
    (void)fltobject;
    (void)iswritable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltLoadFilter(JNIEnv* km_env, jclass km_clazz, jlong filtername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltLoadFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filtername) : -1;
#else
    (void)filtername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltLockUserBuffer(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltLockUserBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : -1;
#else
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltObjectDereference(JNIEnv* km_env, jclass km_clazz, jlong fltobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltObjectDereference");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fltobject);
#else
    (void)fltobject;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltObjectReference(JNIEnv* km_env, jclass km_clazz, jlong fltobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltObjectReference");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fltobject) : -1;
#else
    (void)fltobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOpenVolume(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong volumehandle, jlong volumefileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOpenVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)volumehandle, (void*)(uintptr_t)volumefileobject) : -1;
#else
    (void)instance;
    (void)volumehandle;
    (void)volumefileobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOplockBreakH(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint flags, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakH");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOplockBreakToNone(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakToNone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOplockBreakToNoneEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint flags, jlong context, jlong waitcompletionroutine, jlong prepostcallbackdataroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockBreakToNoneEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)waitcompletionroutine, (void*)(uintptr_t)prepostcallbackdataroutine) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)flags;
    (void)context;
    (void)waitcompletionroutine;
    (void)prepostcallbackdataroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOplockFsctrl(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint opencount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockFsctrl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)opencount) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOplockFsctrlEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong callbackdata, jint opencount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockFsctrlEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)callbackdata, (uint32_t)opencount, (uint32_t)flags) : -1;
#else
    (void)oplock;
    (void)callbackdata;
    (void)opencount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOplockIsFastIoPossible(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockIsFastIoPossible");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOplockIsSharedRequest(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockIsSharedRequest");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata) : false;
#else
    (void)callbackdata;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltOplockKeysEqual(JNIEnv* km_env, jclass km_clazz, jlong fo1, jlong fo2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltOplockKeysEqual");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fo1, (void*)(uintptr_t)fo2) : false;
#else
    (void)fo1;
    (void)fo2;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltParseFileName(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong extension, jlong stream, jlong finalcomponent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltParseFileName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)extension, (void*)(uintptr_t)stream, (void*)(uintptr_t)finalcomponent) : -1;
#else
    (void)filename;
    (void)extension;
    (void)stream;
    (void)finalcomponent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltParseFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltParseFileNameInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filenameinformation) : -1;
#else
    (void)filenameinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltPerformAsynchronousIo(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong callbackroutine, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPerformAsynchronousIo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext) : -1;
#else
    (void)callbackdata;
    (void)callbackroutine;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltPerformSynchronousIo(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPerformSynchronousIo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)callbackdata);
#else
    (void)callbackdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltPrePrepareComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrePrepareComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltPrepareComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrepareComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltPrepareToReuseEcp(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPrepareToReuseEcp");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecpcontext);
#else
    (void)filter;
    (void)ecpcontext;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltProcessFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong callbackdata, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltProcessFileLock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)context) : -1;
#else
    (void)filelock;
    (void)callbackdata;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltPropagateActivityIdToThread(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong propagateid, jlong originalid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPropagateActivityIdToThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)propagateid, (void*)(uintptr_t)originalid) : -1;
#else
    (void)callbackdata;
    (void)propagateid;
    (void)originalid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltPropagateIrpExtension(JNIEnv* km_env, jclass km_clazz, jlong sourcedata, jlong targetdata, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPropagateIrpExtension");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcedata, (void*)(uintptr_t)targetdata, (uint32_t)flags) : -1;
#else
    (void)sourcedata;
    (void)targetdata;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltPurgeFileNameInformationCache(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltPurgeFileNameInformationCache");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject) : -1;
#else
    (void)instance;
    (void)fileobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueryDirectoryFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass, jboolean returnsingleentry, jlong filename, jboolean restartscan, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, bool, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryDirectoryFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (bool)returnsingleentry, (void*)(uintptr_t)filename, (bool)restartscan, (void*)(uintptr_t)lengthreturned) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueryDirectoryFileEx(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass, jint queryflags, jlong filename, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryDirectoryFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (uint32_t)queryflags, (void*)(uintptr_t)filename, (void*)(uintptr_t)lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)queryflags;
    (void)filename;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueryEaFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong returnedeadata, jint length, jboolean returnsingleentry, jlong ealist, jint ealistlength, jlong eaindex, jboolean restartscan, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryEaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)returnedeadata, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)ealist, (uint32_t)ealistlength, (void*)(uintptr_t)eaindex, (bool)restartscan, (void*)(uintptr_t)lengthreturned) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueryInformationByName(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong instance, jlong objectattributes, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jlong drivercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryInformationByName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (int64_t)instance, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (void*)(uintptr_t)drivercontext) : -1;
#else
    (void)filter;
    (void)instance;
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)drivercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueryInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (void*)(uintptr_t)lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueryQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong sidlist, jint sidlistlength, jlong startsid, jboolean restartscan, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryQuotaInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)sidlist, (uint32_t)sidlistlength, (void*)(uintptr_t)startsid, (bool)restartscan, (void*)(uintptr_t)lengthreturned) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQuerySecurityObject(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint securityinformation, jlong securitydescriptor, jint length, jlong lengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQuerySecurityObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor, (uint32_t)length, (void*)(uintptr_t)lengthneeded) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueryVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong iosb, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryVolumeInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)iosb, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass) : -1;
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueryVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fsinformation, jint length, jint fsinformationclass, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueryVolumeInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass, (void*)(uintptr_t)lengthreturned) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueueDeferredIoWorkItem(JNIEnv* km_env, jclass km_clazz, jlong fltworkitem, jlong data, jlong workerroutine, jint queuetype, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueueDeferredIoWorkItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)fltworkitem, (void*)(uintptr_t)data, (void*)(uintptr_t)workerroutine, (int32_t)queuetype, (void*)(uintptr_t)context) : -1;
#else
    (void)fltworkitem;
    (void)data;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltQueueGenericWorkItem(JNIEnv* km_env, jclass km_clazz, jlong fltworkitem, jlong fltobject, jlong workerroutine, jint queuetype, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltQueueGenericWorkItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)fltworkitem, (void*)(uintptr_t)fltobject, (void*)(uintptr_t)workerroutine, (int32_t)queuetype, (void*)(uintptr_t)context) : -1;
#else
    (void)fltworkitem;
    (void)fltobject;
    (void)workerroutine;
    (void)queuetype;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReadFile(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong byteoffset, jint length, jlong buffer, jint flags, jlong bytesread, jlong callbackroutine, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReadFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)byteoffset, (uint32_t)length, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReadFileEx(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong byteoffset, jint length, jlong buffer, jint flags, jlong bytesread, jlong callbackroutine, jlong callbackcontext, jlong key, jlong mdl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReadFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)byteoffset, (uint32_t)length, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)key, (void*)(uintptr_t)mdl) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReferenceContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReferenceContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)context);
#else
    (void)context;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReferenceFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReferenceFileNameInformation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filenameinformation);
#else
    (void)filenameinformation;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRegisterFilter(JNIEnv* km_env, jclass km_clazz, jlong driver, jlong registration, jlong retfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRegisterFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)driver, (void*)(uintptr_t)registration, (void*)(uintptr_t)retfilter) : -1;
#else
    (void)driver;
    (void)registration;
    (void)retfilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRegisterForDataScan(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRegisterForDataScan");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReissueSynchronousIo(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReissueSynchronousIo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)callbackdata);
#else
    (void)initiatinginstance;
    (void)callbackdata;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReleaseContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)context);
#else
    (void)context;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReleaseContexts(JNIEnv* km_env, jclass km_clazz, jlong contexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContexts");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)contexts);
#else
    (void)contexts;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReleaseContextsEx(JNIEnv* km_env, jclass km_clazz, jlong contextssize, jlong contexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseContextsEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint64_t)contextssize, (void*)(uintptr_t)contexts);
#else
    (void)contextssize;
    (void)contexts;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReleaseFileNameInformation(JNIEnv* km_env, jclass km_clazz, jlong filenameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseFileNameInformation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filenameinformation);
#else
    (void)filenameinformation;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReleasePushLock(JNIEnv* km_env, jclass km_clazz, jlong pushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleasePushLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pushlock);
#else
    (void)pushlock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReleasePushLockEx(JNIEnv* km_env, jclass km_clazz, jlong pushlock, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleasePushLockEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pushlock, (uint32_t)flags);
#else
    (void)pushlock;
    (void)flags;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReleaseResource(JNIEnv* km_env, jclass km_clazz, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReleaseResource");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)resource);
#else
    (void)resource;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRemoveExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong ecplist, jlong ecptype, jlong ecpcontext, jlong ecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRemoveExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)ecpcontext, (void*)(uintptr_t)ecpcontextsize) : -1;
#else
    (void)filter;
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRemoveOpenReparseEntry(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jlong openreparseentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRemoveOpenReparseEntry");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (void*)(uintptr_t)openreparseentry);
#else
    (void)filter;
    (void)data;
    (void)openreparseentry;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRequestFileInfoOnCreateCompletion(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jint infoclassflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRequestFileInfoOnCreateCompletion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (uint32_t)infoclassflags) : -1;
#else
    (void)filter;
    (void)data;
    (void)infoclassflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRequestOperationStatusCallback(JNIEnv* km_env, jclass km_clazz, jlong data, jlong callbackroutine, jlong requestercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRequestOperationStatusCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)requestercontext) : -1;
#else
    (void)data;
    (void)callbackroutine;
    (void)requestercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRetainSwappedBufferMdlAddress(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetainSwappedBufferMdlAddress");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)callbackdata);
#else
    (void)callbackdata;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRetrieveFileInfoOnCreateCompletion(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jint infoclass, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveFileInfoOnCreateCompletion");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (uint32_t)infoclass, (void*)(uintptr_t)size) : NULL;
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRetrieveFileInfoOnCreateCompletionEx(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong data, jint infoclass, jlong retinfosize, jlong retinfobuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveFileInfoOnCreateCompletionEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)data, (uint32_t)infoclass, (void*)(uintptr_t)retinfosize, (void*)(uintptr_t)retinfobuffer) : -1;
#else
    (void)filter;
    (void)data;
    (void)infoclass;
    (void)retinfosize;
    (void)retinfobuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRetrieveIoPriorityInfo(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fileobject, jlong thread, jlong priorityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRetrieveIoPriorityInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data, (void*)(uintptr_t)fileobject, (int64_t)thread, (void*)(uintptr_t)priorityinfo) : -1;
#else
    (void)data;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltReuseCallbackData(JNIEnv* km_env, jclass km_clazz, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltReuseCallbackData");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)callbackdata);
#else
    (void)callbackdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRollbackComplete(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRollbackComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltRollbackEnlistment(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jlong transactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltRollbackEnlistment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (void*)(uintptr_t)transactioncontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)transactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSendMessage(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong clientport, jlong senderbuffer, jint senderbufferlength, jlong replybuffer, jlong replylength, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSendMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)clientport, (void*)(uintptr_t)senderbuffer, (uint32_t)senderbufferlength, (void*)(uintptr_t)replybuffer, (void*)(uintptr_t)replylength, (void*)(uintptr_t)timeout) : -1;
#else
    (void)filter;
    (void)clientport;
    (void)senderbuffer;
    (void)senderbufferlength;
    (void)replybuffer;
    (void)replylength;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetActivityIdCallbackData(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetActivityIdCallbackData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)guid) : -1;
#else
    (void)callbackdata;
    (void)guid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetCallbackDataDirty(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetCallbackDataDirty");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)data);
#else
    (void)data;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetCancelCompletion(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong canceledcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetCancelCompletion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)canceledcallback) : -1;
#else
    (void)callbackdata;
    (void)canceledcallback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetEaFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong eabuffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetEaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)eabuffer, (uint32_t)length) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetEcpListIntoCallbackData(JNIEnv* km_env, jclass km_clazz, jlong filter, jlong callbackdata, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetEcpListIntoCallbackData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)ecplist) : -1;
#else
    (void)filter;
    (void)callbackdata;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetFileContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFileContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetFsZeroingOffset(JNIEnv* km_env, jclass km_clazz, jlong data, jint zeroingoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFsZeroingOffset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data, (uint32_t)zeroingoffset) : -1;
#else
    (void)data;
    (void)zeroingoffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetFsZeroingOffsetRequired(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetFsZeroingOffsetRequired");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data) : -1;
#else
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetInstanceContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetInstanceContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetIoPriorityHintIntoCallbackData(JNIEnv* km_env, jclass km_clazz, jlong data, jint priorityhint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoCallbackData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data, (int32_t)priorityhint) : -1;
#else
    (void)data;
    (void)priorityhint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetIoPriorityHintIntoFileObject(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint priorityhint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoFileObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (int32_t)priorityhint) : -1;
#else
    (void)fileobject;
    (void)priorityhint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetIoPriorityHintIntoThread(JNIEnv* km_env, jclass km_clazz, jlong thread, jint priorityhint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetIoPriorityHintIntoThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread, (int32_t)priorityhint) : -1;
#else
    (void)thread;
    (void)priorityhint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetQuotaInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)buffer, (uint32_t)length) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetSecurityObject(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint securityinformation, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetSecurityObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)securityinformation;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetStreamContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetStreamContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetStreamHandleContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong fileobject, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetStreamHandleContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)fileobject, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)fileobject;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetTransactionContext(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong transaction, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetTransactionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)transaction, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)instance;
    (void)transaction;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetVolumeContext(JNIEnv* km_env, jclass km_clazz, jlong volume, jint operation, jlong newcontext, jlong oldcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetVolumeContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)volume, (int32_t)operation, (void*)(uintptr_t)newcontext, (void*)(uintptr_t)oldcontext) : -1;
#else
    (void)volume;
    (void)operation;
    (void)newcontext;
    (void)oldcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSetVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong iosb, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSetVolumeInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)instance, (void*)(uintptr_t)iosb, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass) : -1;
#else
    (void)instance;
    (void)iosb;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltStartFiltering(JNIEnv* km_env, jclass km_clazz, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltStartFiltering");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filter) : -1;
#else
    (void)filter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSupportsFileContexts(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsFileContexts");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : false;
#else
    (void)fileobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSupportsFileContextsEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsFileContextsEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (int64_t)instance) : false;
#else
    (void)fileobject;
    (void)instance;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSupportsStreamContexts(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsStreamContexts");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : false;
#else
    (void)fileobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltSupportsStreamHandleContexts(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltSupportsStreamHandleContexts");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : false;
#else
    (void)fileobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltTagFile(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jint filetag, jlong guid, jlong databuffer, jshort databufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltTagFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (uint32_t)filetag, (void*)(uintptr_t)guid, (void*)(uintptr_t)databuffer, (uint16_t)databufferlength) : -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    (void)databuffer;
    (void)databufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltTagFileEx(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jint filetag, jlong guid, jlong databuffer, jshort databufferlength, jint existingfiletag, jlong existingguid, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint16_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltTagFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (uint32_t)filetag, (void*)(uintptr_t)guid, (void*)(uintptr_t)databuffer, (uint16_t)databufferlength, (uint32_t)existingfiletag, (void*)(uintptr_t)existingguid, (uint32_t)flags) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltUninitializeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUninitializeFileLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filelock);
#else
    (void)filelock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltUninitializeOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUninitializeOplock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)oplock);
#else
    (void)oplock;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltUnloadFilter(JNIEnv* km_env, jclass km_clazz, jlong filtername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUnloadFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filtername) : -1;
#else
    (void)filtername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltUnregisterFilter(JNIEnv* km_env, jclass km_clazz, jlong filter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUnregisterFilter");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)filter);
#else
    (void)filter;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltUntagFile(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jint filetag, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltUntagFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (uint32_t)filetag, (void*)(uintptr_t)guid) : -1;
#else
    (void)initiatinginstance;
    (void)fileobject;
    (void)filetag;
    (void)guid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltVetoBypassIo(JNIEnv* km_env, jclass km_clazz, jlong callbackdata, jlong fltobjects, jint operationstatus, jlong failurereason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltVetoBypassIo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackdata, (void*)(uintptr_t)fltobjects, (int32_t)operationstatus, (void*)(uintptr_t)failurereason) : -1;
#else
    (void)callbackdata;
    (void)fltobjects;
    (void)operationstatus;
    (void)failurereason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltWriteFile(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong byteoffset, jint length, jlong buffer, jint flags, jlong byteswritten, jlong callbackroutine, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltWriteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)byteoffset, (uint32_t)length, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)byteswritten, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltWriteFileEx(JNIEnv* km_env, jclass km_clazz, jlong initiatinginstance, jlong fileobject, jlong byteoffset, jint length, jlong buffer, jint flags, jlong byteswritten, jlong callbackroutine, jlong callbackcontext, jlong key, jlong mdl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltWriteFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)initiatinginstance, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)byteoffset, (uint32_t)length, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)byteswritten, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)key, (void*)(uintptr_t)mdl) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_minifilters_WindowsWdkStorageFilesystemMinifiltersJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1minifilters_1FltpTraceRedirectedFileIo(JNIEnv* km_env, jclass km_clazz, jlong originatingfileobject, jlong childcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltmgr.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FltpTraceRedirectedFileIo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)originatingfileobject, (void*)(uintptr_t)childcallbackdata) : -1;
#else
    (void)originatingfileobject;
    (void)childcallbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

