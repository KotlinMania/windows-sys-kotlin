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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjAllocateAlignedBuffer(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjAllocateAlignedBuffer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (uint64_t)size) : NULL;
#else
    (void)namespacevirtualizationcontext;
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjClearNegativePathCache(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jlong totalentrynumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjClearNegativePathCache");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (void*)(uintptr_t)totalentrynumber) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)totalentrynumber;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjCompleteCommand(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jint commandid, jint completionresult, jlong extendedparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjCompleteCommand");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (int32_t)commandid, (int32_t)completionresult, (void*)(uintptr_t)extendedparameters) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)commandid;
    (void)completionresult;
    (void)extendedparameters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjDeleteFile(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jlong destinationfilename, jint updateflags, jlong failurereason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjDeleteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (void*)(uintptr_t)destinationfilename, (int32_t)updateflags, (void*)(uintptr_t)failurereason) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)updateflags;
    (void)failurereason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjDoesNameContainWildCards(JNIEnv* km_env, jclass km_clazz, jlong filename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjDoesNameContainWildCards");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename) : false;
#else
    (void)filename;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjFileNameCompare(JNIEnv* km_env, jclass km_clazz, jlong filename1, jlong filename2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFileNameCompare");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename1, (void*)(uintptr_t)filename2) : -1;
#else
    (void)filename1;
    (void)filename2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjFileNameMatch(JNIEnv* km_env, jclass km_clazz, jlong filenametocheck, jlong pattern) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFileNameMatch");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filenametocheck, (void*)(uintptr_t)pattern) : false;
#else
    (void)filenametocheck;
    (void)pattern;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjFillDirEntryBuffer(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong filebasicinfo, jlong direntrybufferhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFillDirEntryBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)filebasicinfo, (void*)(uintptr_t)direntrybufferhandle) : -1;
#else
    (void)filename;
    (void)filebasicinfo;
    (void)direntrybufferhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjFillDirEntryBuffer2(JNIEnv* km_env, jclass km_clazz, jlong direntrybufferhandle, jlong filename, jlong filebasicinfo, jlong extendedinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFillDirEntryBuffer2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)direntrybufferhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)filebasicinfo, (void*)(uintptr_t)extendedinfo) : -1;
#else
    (void)direntrybufferhandle;
    (void)filename;
    (void)filebasicinfo;
    (void)extendedinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjFreeAlignedBuffer(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjFreeAlignedBuffer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)buffer);
#else
    (void)buffer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjGetOnDiskFileState(JNIEnv* km_env, jclass km_clazz, jlong destinationfilename, jlong filestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjGetOnDiskFileState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationfilename, (void*)(uintptr_t)filestate) : -1;
#else
    (void)destinationfilename;
    (void)filestate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjGetVirtualizationInstanceInfo(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jlong virtualizationinstanceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjGetVirtualizationInstanceInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (void*)(uintptr_t)virtualizationinstanceinfo) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)virtualizationinstanceinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjMarkDirectoryAsPlaceholder(JNIEnv* km_env, jclass km_clazz, jlong rootpathname, jlong targetpathname, jlong versioninfo, jlong virtualizationinstanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjMarkDirectoryAsPlaceholder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpathname, (void*)(uintptr_t)targetpathname, (void*)(uintptr_t)versioninfo, (void*)(uintptr_t)virtualizationinstanceid) : -1;
#else
    (void)rootpathname;
    (void)targetpathname;
    (void)versioninfo;
    (void)virtualizationinstanceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjStartVirtualizing(JNIEnv* km_env, jclass km_clazz, jlong virtualizationrootpath, jlong callbacks, jlong instancecontext, jlong options, jlong namespacevirtualizationcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjStartVirtualizing");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)virtualizationrootpath, (void*)(uintptr_t)callbacks, (void*)(uintptr_t)instancecontext, (void*)(uintptr_t)options, (void*)(uintptr_t)namespacevirtualizationcontext) : -1;
#else
    (void)virtualizationrootpath;
    (void)callbacks;
    (void)instancecontext;
    (void)options;
    (void)namespacevirtualizationcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjStopVirtualizing(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjStopVirtualizing");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext);
#else
    (void)namespacevirtualizationcontext;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjUpdateFileIfNeeded(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jlong destinationfilename, jlong placeholderinfo, jint placeholderinfosize, jint updateflags, jlong failurereason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjUpdateFileIfNeeded");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (void*)(uintptr_t)destinationfilename, (void*)(uintptr_t)placeholderinfo, (uint32_t)placeholderinfosize, (int32_t)updateflags, (void*)(uintptr_t)failurereason) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    (void)updateflags;
    (void)failurereason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjWriteFileData(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jlong datastreamid, jlong buffer, jlong byteoffset, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjWriteFileData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (void*)(uintptr_t)datastreamid, (void*)(uintptr_t)buffer, (uint64_t)byteoffset, (uint32_t)length) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)datastreamid;
    (void)buffer;
    (void)byteoffset;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjWritePlaceholderInfo(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jlong destinationfilename, jlong placeholderinfo, jint placeholderinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjWritePlaceholderInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (void*)(uintptr_t)destinationfilename, (void*)(uintptr_t)placeholderinfo, (uint32_t)placeholderinfosize) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_projectedfilesystem_WindowsWin32StorageProjectedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1projectedfilesystem_1prjWritePlaceholderInfo2(JNIEnv* km_env, jclass km_clazz, jlong namespacevirtualizationcontext, jlong destinationfilename, jlong placeholderinfo, jint placeholderinfosize, jlong extendedinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrjWritePlaceholderInfo2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)namespacevirtualizationcontext, (void*)(uintptr_t)destinationfilename, (void*)(uintptr_t)placeholderinfo, (uint32_t)placeholderinfosize, (void*)(uintptr_t)extendedinfo) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    (void)extendedinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

