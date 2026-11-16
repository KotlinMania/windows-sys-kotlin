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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong context, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivatePackageVirtualizationContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)cookie);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)cookie;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAddPackageDependency(JNIEnv* km_env, jclass km_clazz, jlong packagedependencyid, jint rank, jint options, jlong packagedependencycontext, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPackageDependency");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagedependencyid, (int32_t)rank, (int32_t)options, (void*)(uintptr_t)packagedependencycontext, (void*)(uintptr_t)packagefullname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packagedependencyid;
    (void)rank;
    (void)options;
    (void)packagedependencycontext;
    (void)packagefullname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetClrCompat");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetCreateFileAccess");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetLifecycleManagement");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetMediaFoundationCodecLoading");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetProcessTerminationMethod");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetShowDeveloperDiagnostic");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetThreadInitializationType");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(JNIEnv* km_env, jclass km_clazz, jlong processtoken, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetWindowingModel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processtoken, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong ismsixpackage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckIsMSIXPackage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)ismsixpackage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packagefullname;
    (void)ismsixpackage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxClosePackageInfo(JNIEnv* km_env, jclass km_clazz, jlong packageinforeference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClosePackageInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageinforeference);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packageinforeference;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePackageVirtualizationContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packagefamilyname;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeactivatePackageVirtualizationContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint64_t)cookie);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cookie;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(JNIEnv* km_env, jclass km_clazz, jlong packagedependencyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePackageDependency");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagedependencyid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packagedependencyid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong sourcecontext, jlong destcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicatePackageVirtualizationContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcecontext, (void*)(uintptr_t)destcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcecontext;
    (void)destcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jint packagefilters, jlong count, jlong packagefullnames, jlong bufferlength, jlong buffer, jlong packageproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindPackagesByPackageFamily");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefamilyname, (uint32_t)packagefilters, (void*)(uintptr_t)count, (void*)(uintptr_t)packagefullnames, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)packageproperties);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefamilyname;
    (void)packagefilters;
    (void)count;
    (void)packagefullnames;
    (void)bufferlength;
    (void)buffer;
    (void)packageproperties;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong packagerelativeapplicationid, jlong applicationusermodelidlength, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatApplicationUserModelId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)packagerelativeapplicationid, (void*)(uintptr_t)applicationusermodelidlength, (void*)(uintptr_t)applicationusermodelid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefamilyname;
    (void)packagerelativeapplicationid;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong applicationusermodelidlength, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationUserModelId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)applicationusermodelidlength, (void*)(uintptr_t)applicationusermodelid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong applicationusermodelidlength, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationUserModelIdFromToken");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)applicationusermodelidlength, (void*)(uintptr_t)applicationusermodelid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)token;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong applicationusermodelidlength, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentApplicationUserModelId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)applicationusermodelidlength, (void*)(uintptr_t)applicationusermodelid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(JNIEnv* km_env, jclass km_clazz, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageFamilyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullnamelength, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageFullName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullnamelength, (void*)(uintptr_t)packagefullname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullnamelength;
    (void)packagefullname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(JNIEnv* km_env, jclass km_clazz, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(JNIEnv* km_env, jclass km_clazz, jint flags, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(JNIEnv* km_env, jclass km_clazz, jint flags, jint packagepathtype, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (int32_t)packagepathtype, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)packagepathtype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(JNIEnv* km_env, jclass km_clazz, jint flags, jint packageinfotype, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (int32_t)packageinfotype, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)packageinfotype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(JNIEnv* km_env, jclass km_clazz, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackagePath");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pathlength, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(JNIEnv* km_env, jclass km_clazz, jint packagepathtype, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackagePath2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)packagepathtype, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageVirtualizationContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(JNIEnv* km_env, jclass km_clazz, jlong packagedependencycontext, jlong packagedependencyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIdForPackageDependencyContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagedependencycontext, (void*)(uintptr_t)packagedependencyid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packagedependencycontext;
    (void)packagedependencyid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(JNIEnv* km_env, jclass km_clazz, jlong packageinforeference, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageApplicationIds");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageinforeference, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packageinforeference;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFamilyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFamilyNameFromToken");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)token;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageFullName(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong packagefullnamelength, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFullName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)packagefullnamelength, (void*)(uintptr_t)packagefullname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)packagefullnamelength;
    (void)packagefullname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong packagefullnamelength, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFullNameFromToken");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)packagefullnamelength, (void*)(uintptr_t)packagefullname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)token;
    (void)packagefullnamelength;
    (void)packagefullname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageGraphRevisionId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageId(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageInfo(JNIEnv* km_env, jclass km_clazz, jlong packageinforeference, jint flags, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageinforeference, (uint32_t)flags, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packageinforeference;
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(JNIEnv* km_env, jclass km_clazz, jlong packageinforeference, jint flags, jint packagepathtype, jlong bufferlength, jlong buffer, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageInfo2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageinforeference, (uint32_t)flags, (int32_t)packagepathtype, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packageinforeference;
    (void)flags;
    (void)packagepathtype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackagePath(JNIEnv* km_env, jclass km_clazz, jlong packageid, jint reserved, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePath");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageid, (uint32_t)reserved, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packageid;
    (void)reserved;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePathByFullName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jint packagepathtype, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePathByFullName2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (int32_t)packagepathtype, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong count, jlong packagefullnames, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagesByPackageFamily");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)count, (void*)(uintptr_t)packagefullnames, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefamilyname;
    (void)count;
    (void)packagefullnames;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong count, jlong processes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessesInVirtualizationContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)count, (void*)(uintptr_t)processes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packagefamilyname;
    (void)count;
    (void)processes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(JNIEnv* km_env, jclass km_clazz, jlong packagedependencyid, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetResolvedPackageFullNameForPackageDependency");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagedependencyid, (void*)(uintptr_t)packagefullname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packagedependencyid;
    (void)packagefullname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong origin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackageOrigin");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)origin);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    (void)origin;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackagePathByFullName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jint packagepathtype, jlong pathlength, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackagePathByFullName2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (int32_t)packagepathtype, (void*)(uintptr_t)pathlength, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jint reserved, jlong packageinforeference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPackageInfoByFullName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (uint32_t)reserved, (void*)(uintptr_t)packageinforeference);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    (void)reserved;
    (void)packageinforeference;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(JNIEnv* km_env, jclass km_clazz, jlong usersid, jlong packagefullname, jint reserved, jlong packageinforeference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPackageInfoByFullNameForUser");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)usersid, (void*)(uintptr_t)packagefullname, (uint32_t)reserved, (void*)(uintptr_t)packageinforeference);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)usersid;
    (void)packagefullname;
    (void)reserved;
    (void)packageinforeference;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFamilyNameFromFullName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(JNIEnv* km_env, jclass km_clazz, jlong packageid, jlong packagefamilynamelength, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFamilyNameFromId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageid, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packageid;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(JNIEnv* km_env, jclass km_clazz, jlong packageid, jlong packagefullnamelength, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFullNameFromId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageid, (void*)(uintptr_t)packagefullnamelength, (void*)(uintptr_t)packagefullname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packageid;
    (void)packagefullnamelength;
    (void)packagefullname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname, jint flags, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageIdFromFullName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname, (uint32_t)flags, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong packagenamelength, jlong packagename, jlong packagepublisheridlength, jlong packagepublisherid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageNameAndPublisherIdFromFamilyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)packagenamelength, (void*)(uintptr_t)packagename, (void*)(uintptr_t)packagepublisheridlength, (void*)(uintptr_t)packagepublisherid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefamilyname;
    (void)packagenamelength;
    (void)packagename;
    (void)packagepublisheridlength;
    (void)packagepublisherid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong applicationusermodelid, jlong packagefamilynamelength, jlong packagefamilyname, jlong packagerelativeapplicationidlength, jlong packagerelativeapplicationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseApplicationUserModelId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)applicationusermodelid, (void*)(uintptr_t)packagefamilynamelength, (void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)packagerelativeapplicationidlength, (void*)(uintptr_t)packagerelativeapplicationid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)applicationusermodelid;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    (void)packagerelativeapplicationidlength;
    (void)packagerelativeapplicationid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleasePackageVirtualizationContext");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(JNIEnv* km_env, jclass km_clazz, jlong packagedependencycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePackageDependency");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagedependencycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)packagedependencycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(JNIEnv* km_env, jclass km_clazz, jlong applicationusermodelid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyApplicationUserModelId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)applicationusermodelid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)applicationusermodelid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageFamilyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefamilyname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefamilyname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(JNIEnv* km_env, jclass km_clazz, jlong packagefullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageFullName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagefullname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagefullname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxVerifyPackageId(JNIEnv* km_env, jclass km_clazz, jlong packageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packageid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packageid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_packaging_appx_WindowsWin32StoragePackagingAppxJniBridge_windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(JNIEnv* km_env, jclass km_clazz, jlong packagerelativeapplicationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageRelativeApplicationId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)packagerelativeapplicationid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)packagerelativeapplicationid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

