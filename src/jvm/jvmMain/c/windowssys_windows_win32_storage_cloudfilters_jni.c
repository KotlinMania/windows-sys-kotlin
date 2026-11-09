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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfCloseHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filehandle);
#else
    (void)filehandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfConnectSyncRoot(JNIEnv* km_env, jclass km_clazz, jlong syncrootpath, jlong callbacktable, jlong callbackcontext, jint connectflags, jlong connectionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfConnectSyncRoot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)syncrootpath, (void*)(uintptr_t)callbacktable, (void*)(uintptr_t)callbackcontext, (int32_t)connectflags, (void*)(uintptr_t)connectionkey) : -1;
#else
    (void)syncrootpath;
    (void)callbacktable;
    (void)callbackcontext;
    (void)connectflags;
    (void)connectionkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfConvertToPlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong fileidentity, jint fileidentitylength, jint convertflags, jlong convertusn, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfConvertToPlaceholder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)fileidentity, (uint32_t)fileidentitylength, (int32_t)convertflags, (void*)(uintptr_t)convertusn, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)filehandle;
    (void)fileidentity;
    (void)fileidentitylength;
    (void)convertflags;
    (void)convertusn;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfCreatePlaceholders(JNIEnv* km_env, jclass km_clazz, jlong basedirectorypath, jlong placeholderarray, jint placeholdercount, jint createflags, jlong entriesprocessed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfCreatePlaceholders");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)basedirectorypath, (void*)(uintptr_t)placeholderarray, (uint32_t)placeholdercount, (int32_t)createflags, (void*)(uintptr_t)entriesprocessed) : -1;
#else
    (void)basedirectorypath;
    (void)placeholderarray;
    (void)placeholdercount;
    (void)createflags;
    (void)entriesprocessed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfDehydratePlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong startingoffset, jlong length, jint dehydrateflags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfDehydratePlaceholder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (int64_t)startingoffset, (int64_t)length, (int32_t)dehydrateflags, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)filehandle;
    (void)startingoffset;
    (void)length;
    (void)dehydrateflags;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfDisconnectSyncRoot(JNIEnv* km_env, jclass km_clazz, jlong connectionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfDisconnectSyncRoot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)connectionkey) : -1;
#else
    (void)connectionkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfExecute(JNIEnv* km_env, jclass km_clazz, jlong opinfo, jlong opparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfExecute");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)opinfo, (void*)(uintptr_t)opparams) : -1;
#else
    (void)opinfo;
    (void)opparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetCorrelationVector(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong correlationvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetCorrelationVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)correlationvector) : -1;
#else
    (void)filehandle;
    (void)correlationvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetPlaceholderInfo(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint infoclass, jlong infobuffer, jint infobufferlength, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)infoclass, (void*)(uintptr_t)infobuffer, (uint32_t)infobufferlength, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetPlaceholderRangeInfo(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint infoclass, jlong startingoffset, jlong length, jlong infobuffer, jint infobufferlength, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderRangeInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)infoclass, (int64_t)startingoffset, (int64_t)length, (void*)(uintptr_t)infobuffer, (uint32_t)infobufferlength, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)startingoffset;
    (void)length;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetPlaceholderRangeInfoForHydration(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jlong transferkey, jlong fileid, jint infoclass, jlong startingoffset, jlong rangelength, jlong infobuffer, jint infobuffersize, jlong infobufferwritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int32_t, int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderRangeInfoForHydration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)connectionkey, (int64_t)transferkey, (int64_t)fileid, (int32_t)infoclass, (int64_t)startingoffset, (int64_t)rangelength, (void*)(uintptr_t)infobuffer, (uint32_t)infobuffersize, (void*)(uintptr_t)infobufferwritten) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetPlaceholderStateFromAttributeTag(JNIEnv* km_env, jclass km_clazz, jint fileattributes, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromAttributeTag");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fileattributes, (uint32_t)reparsetag) : 0;
#else
    (void)fileattributes;
    (void)reparsetag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetPlaceholderStateFromFileInfo(JNIEnv* km_env, jclass km_clazz, jlong infobuffer, jint infoclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromFileInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)infobuffer, (int32_t)infoclass) : 0;
#else
    (void)infobuffer;
    (void)infoclass;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetPlaceholderStateFromFindData(JNIEnv* km_env, jclass km_clazz, jlong finddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromFindData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)finddata) : 0;
#else
    (void)finddata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetPlatformInfo(JNIEnv* km_env, jclass km_clazz, jlong platformversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetPlatformInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)platformversion) : -1;
#else
    (void)platformversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetSyncRootInfoByHandle(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint infoclass, jlong infobuffer, jint infobufferlength, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetSyncRootInfoByHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)infoclass, (void*)(uintptr_t)infobuffer, (uint32_t)infobufferlength, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetSyncRootInfoByPath(JNIEnv* km_env, jclass km_clazz, jlong filepath, jint infoclass, jlong infobuffer, jint infobufferlength, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetSyncRootInfoByPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filepath, (int32_t)infoclass, (void*)(uintptr_t)infobuffer, (uint32_t)infobufferlength, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)filepath;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetTransferKey(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong transferkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetTransferKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)transferkey) : -1;
#else
    (void)filehandle;
    (void)transferkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfGetWin32HandleFromProtectedHandle(JNIEnv* km_env, jclass km_clazz, jlong protectedhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfGetWin32HandleFromProtectedHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protectedhandle) : NULL;
#else
    (void)protectedhandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfHydratePlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong startingoffset, jlong length, jint hydrateflags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfHydratePlaceholder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (int64_t)startingoffset, (int64_t)length, (int32_t)hydrateflags, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)filehandle;
    (void)startingoffset;
    (void)length;
    (void)hydrateflags;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfOpenFileWithOplock(JNIEnv* km_env, jclass km_clazz, jlong filepath, jint flags, jlong protectedhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfOpenFileWithOplock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filepath, (int32_t)flags, (void*)(uintptr_t)protectedhandle) : -1;
#else
    (void)filepath;
    (void)flags;
    (void)protectedhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfQuerySyncProviderStatus(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jlong providerstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfQuerySyncProviderStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)connectionkey, (void*)(uintptr_t)providerstatus) : -1;
#else
    (void)connectionkey;
    (void)providerstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfReferenceProtectedHandle(JNIEnv* km_env, jclass km_clazz, jlong protectedhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReferenceProtectedHandle");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protectedhandle) : false;
#else
    (void)protectedhandle;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfRegisterSyncRoot(JNIEnv* km_env, jclass km_clazz, jlong syncrootpath, jlong registration, jlong policies, jint registerflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfRegisterSyncRoot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)syncrootpath, (void*)(uintptr_t)registration, (void*)(uintptr_t)policies, (int32_t)registerflags) : -1;
#else
    (void)syncrootpath;
    (void)registration;
    (void)policies;
    (void)registerflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfReleaseProtectedHandle(JNIEnv* km_env, jclass km_clazz, jlong protectedhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReleaseProtectedHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)protectedhandle);
#else
    (void)protectedhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfReleaseTransferKey(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong transferkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReleaseTransferKey");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)transferkey);
#else
    (void)filehandle;
    (void)transferkey;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfReportProviderProgress(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jlong transferkey, jlong providerprogresstotal, jlong providerprogresscompleted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportProviderProgress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)connectionkey, (int64_t)transferkey, (int64_t)providerprogresstotal, (int64_t)providerprogresscompleted) : -1;
#else
    (void)connectionkey;
    (void)transferkey;
    (void)providerprogresstotal;
    (void)providerprogresscompleted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfReportProviderProgress2(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jlong transferkey, jlong requestkey, jlong providerprogresstotal, jlong providerprogresscompleted, jint targetsessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportProviderProgress2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)connectionkey, (int64_t)transferkey, (int64_t)requestkey, (int64_t)providerprogresstotal, (int64_t)providerprogresscompleted, (uint32_t)targetsessionid) : -1;
#else
    (void)connectionkey;
    (void)transferkey;
    (void)requestkey;
    (void)providerprogresstotal;
    (void)providerprogresscompleted;
    (void)targetsessionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfReportSyncStatus(JNIEnv* km_env, jclass km_clazz, jlong syncrootpath, jlong syncstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfReportSyncStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)syncrootpath, (void*)(uintptr_t)syncstatus) : -1;
#else
    (void)syncrootpath;
    (void)syncstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfRevertPlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint revertflags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfRevertPlaceholder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)revertflags, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)filehandle;
    (void)revertflags;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfSetCorrelationVector(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong correlationvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetCorrelationVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)correlationvector) : -1;
#else
    (void)filehandle;
    (void)correlationvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfSetInSyncState(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint insyncstate, jint insyncflags, jlong insyncusn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetInSyncState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)insyncstate, (int32_t)insyncflags, (void*)(uintptr_t)insyncusn) : -1;
#else
    (void)filehandle;
    (void)insyncstate;
    (void)insyncflags;
    (void)insyncusn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfSetPinState(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint pinstate, jint pinflags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfSetPinState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (int32_t)pinstate, (int32_t)pinflags, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)filehandle;
    (void)pinstate;
    (void)pinflags;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfUnregisterSyncRoot(JNIEnv* km_env, jclass km_clazz, jlong syncrootpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUnregisterSyncRoot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)syncrootpath) : -1;
#else
    (void)syncrootpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfUpdatePlaceholder(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong fsmetadata, jlong fileidentity, jint fileidentitylength, jlong dehydraterangearray, jint dehydraterangecount, jint updateflags, jlong updateusn, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUpdatePlaceholder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)fsmetadata, (void*)(uintptr_t)fileidentity, (uint32_t)fileidentitylength, (void*)(uintptr_t)dehydraterangearray, (uint32_t)dehydraterangecount, (int32_t)updateflags, (void*)(uintptr_t)updateusn, (void*)(uintptr_t)overlapped) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cloudfilters_WindowsWin32StorageCloudfiltersJniBridge_windowssys_1windows_1win32_1storage_1cloudfilters_1CfUpdateSyncProviderStatus(JNIEnv* km_env, jclass km_clazz, jlong connectionkey, jint providerstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CfUpdateSyncProviderStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)connectionkey, (uint32_t)providerstatus) : -1;
#else
    (void)connectionkey;
    (void)providerstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

