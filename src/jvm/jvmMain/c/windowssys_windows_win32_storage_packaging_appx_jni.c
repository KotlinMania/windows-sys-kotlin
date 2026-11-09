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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1ActivatePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong context, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivatePackageVirtualizationContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)cookie) : -1;
#else
    (void)context;
    (void)cookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AddPackageDependency(JNIEnv* km_env, jclass km_clazz, jlong packagedependencyid, jint rank, jint options, jlong packagedependencycontext, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPackageDependency");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagedependencyid, (int32_t)rank, (int32_t)options, (void*)(uintptr_t)packagedependencycontext, (void*)(uintptr_t)packagefullname) : -1;
#else
    (void)packagedependencyid;
    (void)rank;
    (void)options;
    (void)packagedependencycontext;
    (void)packagefullname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AppPolicyGetClrCompat(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetClrCompat");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AppPolicyGetCreateFileAccess(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetCreateFileAccess");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AppPolicyGetLifecycleManagement(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetLifecycleManagement");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AppPolicyGetMediaFoundationCodecLoading(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetMediaFoundationCodecLoading");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AppPolicyGetProcessTerminationMethod(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetProcessTerminationMethod");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AppPolicyGetShowDeveloperDiagnostic(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetShowDeveloperDiagnostic");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AppPolicyGetThreadInitializationType(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetThreadInitializationType");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1AppPolicyGetWindowingModel(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetWindowingModel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy) : 0;
#else
    (void)processtoken;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1CheckIsMSIXPackage(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong ismsixpackage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckIsMSIXPackage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)ismsixpackage) : -1;
#else
    (void)packagefullname;
    (void)ismsixpackage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1ClosePackageInfo(JNIEnv* km_env, jclass km_clazz, jlong packageinforeference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClosePackageInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageinforeference) : 0;
#else
    (void)packageinforeference;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1CreatePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePackageVirtualizationContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)context) : -1;
#else
    (void)packagefamilyname;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1DeactivatePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeactivatePackageVirtualizationContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint64_t)cookie);
#else
    (void)cookie;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1DeletePackageDependency(JNIEnv* km_env, jclass km_clazz, jlong packagedependencyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePackageDependency");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagedependencyid) : -1;
#else
    (void)packagedependencyid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1DuplicatePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong sourcecontext, jlong destcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicatePackageVirtualizationContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcecontext, (void*)(uintptr_t)destcontext) : -1;
#else
    (void)sourcecontext;
    (void)destcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1FindPackagesByPackageFamily(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jint packagefilters, jlong count, jlong packagefullnames, jlong bufferlength, jlong buffer, jlong packageproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindPackagesByPackageFamily");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname, (uint32_t)packagefilters, (void*)(uintptr_t)count, (void*)(uintptr_t)packagefullnames, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)packageproperties) : 0;
#else
    (void)packagefamilyname;
    (void)packagefilters;
    (void)count;
    (void)packagefullnames;
    (void)bufferlength;
    (void)buffer;
    (void)packageproperties;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1FormatApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong packagerelativeapplicationid, jlong applicationusermodelidlength, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatApplicationUserModelId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)packagerelativeapplicationid, (void*)(uintptr_t)applicationusermodelidlength, (void*)(uintptr_t)applicationusermodelid) : 0;
#else
    (void)packagefamilyname;
    (void)packagerelativeapplicationid;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong applicationusermodelidlength, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationUserModelId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)applicationusermodelidlength, (void*)(uintptr_t)applicationusermodelid) : 0;
#else
    (void)hprocess;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetApplicationUserModelIdFromToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong applicationusermodelidlength, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationUserModelIdFromToken");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)applicationusermodelidlength, (void*)(uintptr_t)applicationusermodelid) : 0;
#else
    (void)token;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong applicationusermodelidlength, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentApplicationUserModelId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)applicationusermodelidlength, (void*)(uintptr_t)applicationusermodelid) : 0;
#else
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackageFamilyName(JNIEnv* km_env, jclass km_clazz, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageFamilyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname) : 0;
#else
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackageFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullnamelength, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageFullName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullnamelength, (void*)(uintptr_t)packagefullname) : 0;
#else
    (void)packagefullnamelength;
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackageId(JNIEnv* km_env, jclass km_clazz, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer) : 0;
#else
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackageInfo(JNIEnv* km_env, jclass km_clazz, jint flags, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count) : 0;
#else
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackageInfo2(JNIEnv* km_env, jclass km_clazz, jint flags, jint packagepathtype, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (int32_t)packagepathtype, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count) : 0;
#else
    (void)flags;
    (void)packagepathtype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackageInfo3(JNIEnv* km_env, jclass km_clazz, jint flags, jint packageinfotype, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (int32_t)packageinfotype, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count) : -1;
#else
    (void)flags;
    (void)packageinfotype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackagePath(JNIEnv* km_env, jclass km_clazz, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackagePath");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pathlength, (void*)(uintptr_t)path) : 0;
#else
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackagePath2(JNIEnv* km_env, jclass km_clazz, jint packagepathtype, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackagePath2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)packagepathtype, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path) : 0;
#else
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetCurrentPackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageVirtualizationContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetIdForPackageDependencyContext(JNIEnv* km_env, jclass km_clazz, jlong packagedependencycontext, jlong packagedependencyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIdForPackageDependencyContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagedependencycontext, (void*)(uintptr_t)packagedependencyid) : -1;
#else
    (void)packagedependencycontext;
    (void)packagedependencyid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageApplicationIds(JNIEnv* km_env, jclass km_clazz, jlong packageinforeference, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageApplicationIds");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageinforeference, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count) : 0;
#else
    (void)packageinforeference;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageFamilyName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFamilyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname) : 0;
#else
    (void)hprocess;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageFamilyNameFromToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFamilyNameFromToken");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname) : 0;
#else
    (void)token;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageFullName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong packagefullnamelength, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFullName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)packagefullnamelength, (void*)(uintptr_t)packagefullname) : 0;
#else
    (void)hprocess;
    (void)packagefullnamelength;
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageFullNameFromToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong packagefullnamelength, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFullNameFromToken");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)packagefullnamelength, (void*)(uintptr_t)packagefullname) : 0;
#else
    (void)token;
    (void)packagefullnamelength;
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageGraphRevisionId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageGraphRevisionId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageId(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer) : 0;
#else
    (void)hprocess;
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageInfo(JNIEnv* km_env, jclass km_clazz, jlong packageinforeference, jint flags, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageinforeference, (uint32_t)flags, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count) : 0;
#else
    (void)packageinforeference;
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackageInfo2(JNIEnv* km_env, jclass km_clazz, jlong packageinforeference, jint flags, jint packagepathtype, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageInfo2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageinforeference, (uint32_t)flags, (int32_t)packagepathtype, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count) : 0;
#else
    (void)packageinforeference;
    (void)flags;
    (void)packagepathtype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackagePath(JNIEnv* km_env, jclass km_clazz, jlong packageid, jint reserved, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePath");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageid, (uint32_t)reserved, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path) : 0;
#else
    (void)packageid;
    (void)reserved;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackagePathByFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePathByFullName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path) : 0;
#else
    (void)packagefullname;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackagePathByFullName2(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jint packagepathtype, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePathByFullName2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (int32_t)packagepathtype, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path) : 0;
#else
    (void)packagefullname;
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetPackagesByPackageFamily(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong count, jlong packagefullnames, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagesByPackageFamily");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)count, (void*)(uintptr_t)packagefullnames, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer) : 0;
#else
    (void)packagefamilyname;
    (void)count;
    (void)packagefullnames;
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetProcessesInVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong count, jlong processes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessesInVirtualizationContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)count, (void*)(uintptr_t)processes) : -1;
#else
    (void)packagefamilyname;
    (void)count;
    (void)processes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetResolvedPackageFullNameForPackageDependency(JNIEnv* km_env, jclass km_clazz, jlong packagedependencyid, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetResolvedPackageFullNameForPackageDependency");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagedependencyid, (void*)(uintptr_t)packagefullname) : -1;
#else
    (void)packagedependencyid;
    (void)packagefullname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetStagedPackageOrigin(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong origin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackageOrigin");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)origin) : 0;
#else
    (void)packagefullname;
    (void)origin;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetStagedPackagePathByFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackagePathByFullName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path) : 0;
#else
    (void)packagefullname;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1GetStagedPackagePathByFullName2(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jint packagepathtype, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackagePathByFullName2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (int32_t)packagepathtype, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path) : 0;
#else
    (void)packagefullname;
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1OpenPackageInfoByFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jint reserved, jlong packageinforeference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPackageInfoByFullName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (uint32_t)reserved, (void*)(uintptr_t)packageinforeference) : 0;
#else
    (void)packagefullname;
    (void)reserved;
    (void)packageinforeference;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1OpenPackageInfoByFullNameForUser(JNIEnv* km_env, jclass km_clazz, jlong usersid, jlong packagefullname, jint reserved, jlong packageinforeference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPackageInfoByFullNameForUser");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)usersid, (void*)(uintptr_t)packagefullname, (uint32_t)reserved, (void*)(uintptr_t)packageinforeference) : 0;
#else
    (void)usersid;
    (void)packagefullname;
    (void)reserved;
    (void)packageinforeference;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1PackageFamilyNameFromFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFamilyNameFromFullName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname) : 0;
#else
    (void)packagefullname;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1PackageFamilyNameFromId(JNIEnv* km_env, jclass km_clazz, jlong packageid, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFamilyNameFromId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageid, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname) : 0;
#else
    (void)packageid;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1PackageFullNameFromId(JNIEnv* km_env, jclass km_clazz, jlong packageid, jlong packagefullnamelength, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFullNameFromId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageid, (void*)(uintptr_t)packagefullnamelength, (void*)(uintptr_t)packagefullname) : 0;
#else
    (void)packageid;
    (void)packagefullnamelength;
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1PackageIdFromFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jint flags, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageIdFromFullName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname, (uint32_t)flags, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer) : 0;
#else
    (void)packagefullname;
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1PackageNameAndPublisherIdFromFamilyName(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong packagenamelength, jlong packagename, jlong packagepublisheridlength, jlong packagepublisherid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageNameAndPublisherIdFromFamilyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)packagenamelength, (void*)(uintptr_t)packagename, (void*)(uintptr_t)packagepublisheridlength, (void*)(uintptr_t)packagepublisherid) : 0;
#else
    (void)packagefamilyname;
    (void)packagenamelength;
    (void)packagename;
    (void)packagepublisheridlength;
    (void)packagepublisherid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1ParseApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong applicationusermodelid, jlong packagefamilynamelength, jlong packagefamilyname, jlong packagerelativeapplicationidlength, jlong packagerelativeapplicationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseApplicationUserModelId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)applicationusermodelid, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)packagerelativeapplicationidlength, (void*)(uintptr_t)packagerelativeapplicationid) : 0;
#else
    (void)applicationusermodelid;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    (void)packagerelativeapplicationidlength;
    (void)packagerelativeapplicationid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1ReleasePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleasePackageVirtualizationContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)context);
#else
    (void)context;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1RemovePackageDependency(JNIEnv* km_env, jclass km_clazz, jlong packagedependencycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePackageDependency");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagedependencycontext) : -1;
#else
    (void)packagedependencycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1VerifyApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyApplicationUserModelId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)applicationusermodelid) : 0;
#else
    (void)applicationusermodelid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1VerifyPackageFamilyName(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageFamilyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname) : 0;
#else
    (void)packagefamilyname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1VerifyPackageFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageFullName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefullname) : 0;
#else
    (void)packagefullname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1VerifyPackageId(JNIEnv* km_env, jclass km_clazz, jlong packageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packageid) : 0;
#else
    (void)packageid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssys_1windows_1win32_1storage_1packaging_1appx_1VerifyPackageRelativeApplicationId(JNIEnv* km_env, jclass km_clazz, jlong packagerelativeapplicationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageRelativeApplicationId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagerelativeapplicationid) : 0;
#else
    (void)packagerelativeapplicationid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

