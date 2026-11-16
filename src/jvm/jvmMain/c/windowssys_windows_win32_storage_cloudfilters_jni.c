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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfCloseHandle");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filehandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(JNIEnv* km_env, jclass km_clazz, jlong syncrootpath, jlong callbacktable, jlong callbackcontext, jint connectflags, jlong connectionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfConnectSyncRoot");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)syncrootpath, (void*)(uintptr_t)callbacktable, (void*)(uintptr_t)callbackcontext, (int32_t)connectflags, (void*)(uintptr_t)connectionkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)syncrootpath;
    (void)callbacktable;
    (void)callbackcontext;
    (void)connectflags;
    (void)connectionkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong fileidentity, jint fileidentitylength, jint convertflags, jlong convertusn, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfConvertToPlaceholder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileidentity, (uint32_t)fileidentitylength, (int32_t)convertflags, (void*)(uintptr_t)convertusn, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)fileidentity;
    (void)fileidentitylength;
    (void)convertflags;
    (void)convertusn;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(JNIEnv* km_env, jclass km_clazz, jlong basedirectorypath, jlong placeholderarray, jint placeholdercount, jint createflags, jlong entriesprocessed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfCreatePlaceholders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)basedirectorypath, (void*)(uintptr_t)placeholderarray, (uint32_t)placeholdercount, (int32_t)createflags, (void*)(uintptr_t)entriesprocessed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)basedirectorypath;
    (void)placeholderarray;
    (void)placeholdercount;
    (void)createflags;
    (void)entriesprocessed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong startingoffset, jlong length, jint dehydrateflags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfDehydratePlaceholder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (int64_t)startingoffset, (int64_t)length, (int32_t)dehydrateflags, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)startingoffset;
    (void)length;
    (void)dehydrateflags;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(JNIEnv* km_env, jclass km_clazz, jlong connectionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfDisconnectSyncRoot");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)connectionkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfExecute(JNIEnv* km_env, jclass km_clazz, jlong opinfo, jlong opparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfExecute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)opinfo, (void*)(uintptr_t)opparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)opinfo;
    (void)opparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong correlationvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetCorrelationVector");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)correlationvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)correlationvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint infoclass, jlong infobuffer, jint infobufferlength, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)infoclass, (void*)(uintptr_t)infobuffer, (uint32_t)infobufferlength, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint infoclass, jlong startingoffset, jlong length, jlong infobuffer, jint infobufferlength, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderRangeInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)infoclass, (int64_t)startingoffset, (int64_t)length, (void*)(uintptr_t)infobuffer, (uint32_t)infobufferlength, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)infoclass;
    (void)startingoffset;
    (void)length;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jlong transferkey, jlong fileid, jint infoclass, jlong startingoffset, jlong rangelength, jlong infobuffer, jint infobuffersize, jlong infobufferwritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int32_t, int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderRangeInfoForHydration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)connectionkey, (int64_t)transferkey, (int64_t)fileid, (int32_t)infoclass, (int64_t)startingoffset, (int64_t)rangelength, (void*)(uintptr_t)infobuffer, (uint32_t)infobuffersize, (void*)(uintptr_t)infobufferwritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionkey;
    (void)transferkey;
    (void)fileid;
    (void)infoclass;
    (void)startingoffset;
    (void)rangelength;
    (void)infobuffer;
    (void)infobuffersize;
    (void)infobufferwritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(JNIEnv* km_env, jclass km_clazz, jint fileattributes, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromAttributeTag");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)fileattributes, (uint32_t)reparsetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)fileattributes;
    (void)reparsetag;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(JNIEnv* km_env, jclass km_clazz, jlong infobuffer, jint infoclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromFileInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infobuffer, (int32_t)infoclass);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)infobuffer;
    (void)infoclass;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(JNIEnv* km_env, jclass km_clazz, jlong finddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromFindData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)finddata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)finddata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(JNIEnv* km_env, jclass km_clazz, jlong platformversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlatformInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)platformversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)platformversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint infoclass, jlong infobuffer, jint infobufferlength, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetSyncRootInfoByHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)infoclass, (void*)(uintptr_t)infobuffer, (uint32_t)infobufferlength, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(JNIEnv* km_env, jclass km_clazz, jlong filepath, jint infoclass, jlong infobuffer, jint infobufferlength, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetSyncRootInfoByPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filepath, (int32_t)infoclass, (void*)(uintptr_t)infobuffer, (uint32_t)infobufferlength, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filepath;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong transferkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetTransferKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)transferkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)transferkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(JNIEnv* km_env, jclass km_clazz, jlong protectedhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetWin32HandleFromProtectedHandle");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protectedhandle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)protectedhandle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong startingoffset, jlong length, jint hydrateflags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfHydratePlaceholder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (int64_t)startingoffset, (int64_t)length, (int32_t)hydrateflags, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)startingoffset;
    (void)length;
    (void)hydrateflags;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(JNIEnv* km_env, jclass km_clazz, jlong filepath, jint flags, jlong protectedhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfOpenFileWithOplock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filepath, (int32_t)flags, (void*)(uintptr_t)protectedhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filepath;
    (void)flags;
    (void)protectedhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jlong providerstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfQuerySyncProviderStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)connectionkey, (void*)(uintptr_t)providerstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionkey;
    (void)providerstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(JNIEnv* km_env, jclass km_clazz, jlong protectedhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReferenceProtectedHandle");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protectedhandle);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)protectedhandle;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(JNIEnv* km_env, jclass km_clazz, jlong syncrootpath, jlong registration, jlong policies, jint registerflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfRegisterSyncRoot");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)syncrootpath, (void*)(uintptr_t)registration, (void*)(uintptr_t)policies, (int32_t)registerflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)syncrootpath;
    (void)registration;
    (void)policies;
    (void)registerflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(JNIEnv* km_env, jclass km_clazz, jlong protectedhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReleaseProtectedHandle");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)protectedhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)protectedhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong transferkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReleaseTransferKey");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)transferkey);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filehandle;
    (void)transferkey;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jlong transferkey, jlong providerprogresstotal, jlong providerprogresscompleted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportProviderProgress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)connectionkey, (int64_t)transferkey, (int64_t)providerprogresstotal, (int64_t)providerprogresscompleted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionkey;
    (void)transferkey;
    (void)providerprogresstotal;
    (void)providerprogresscompleted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jlong transferkey, jlong requestkey, jlong providerprogresstotal, jlong providerprogresscompleted, jint targetsessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportProviderProgress2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)connectionkey, (int64_t)transferkey, (int64_t)requestkey, (int64_t)providerprogresstotal, (int64_t)providerprogresscompleted, (uint32_t)targetsessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionkey;
    (void)transferkey;
    (void)requestkey;
    (void)providerprogresstotal;
    (void)providerprogresscompleted;
    (void)targetsessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(JNIEnv* km_env, jclass km_clazz, jlong syncrootpath, jlong syncstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportSyncStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)syncrootpath, (void*)(uintptr_t)syncstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)syncrootpath;
    (void)syncstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint revertflags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfRevertPlaceholder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)revertflags, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)revertflags;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong correlationvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetCorrelationVector");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)correlationvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)correlationvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint insyncstate, jint insyncflags, jlong insyncusn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetInSyncState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)insyncstate, (int32_t)insyncflags, (void*)(uintptr_t)insyncusn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)insyncstate;
    (void)insyncflags;
    (void)insyncusn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfSetPinState(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint pinstate, jint pinflags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetPinState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)pinstate, (int32_t)pinflags, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)pinstate;
    (void)pinflags;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(JNIEnv* km_env, jclass km_clazz, jlong syncrootpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUnregisterSyncRoot");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)syncrootpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)syncrootpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong fsmetadata, jlong fileidentity, jint fileidentitylength, jlong dehydraterangearray, jint dehydraterangecount, jint updateflags, jlong updateusn, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUpdatePlaceholder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)fsmetadata, (void*)(uintptr_t)fileidentity, (uint32_t)fileidentitylength, (void*)(uintptr_t)dehydraterangearray, (uint32_t)dehydraterangecount, (int32_t)updateflags, (void*)(uintptr_t)updateusn, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)fsmetadata;
    (void)fileidentity;
    (void)fileidentitylength;
    (void)dehydraterangearray;
    (void)dehydraterangecount;
    (void)updateflags;
    (void)updateusn;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jint providerstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUpdateSyncProviderStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)connectionkey, (uint32_t)providerstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionkey;
    (void)providerstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

