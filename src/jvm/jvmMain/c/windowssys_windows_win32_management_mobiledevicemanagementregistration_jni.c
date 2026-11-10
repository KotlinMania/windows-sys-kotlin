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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1applyLocalManagementSyncML(JNIEnv* km_env, jclass km_clazz, jlong syncmlrequest, jlong syncmlresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyLocalManagementSyncML");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)syncmlrequest, (void*)(uintptr_t)syncmlresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)syncmlrequest;
    (void)syncmlresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1discoverManagementService(JNIEnv* km_env, jclass km_clazz, jlong pszupn, jlong ppmgmtinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiscoverManagementService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszupn, (void*)(uintptr_t)ppmgmtinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszupn;
    (void)ppmgmtinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1discoverManagementServiceEx(JNIEnv* km_env, jclass km_clazz, jlong pszupn, jlong pszdiscoveryservicecandidate, jlong ppmgmtinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiscoverManagementServiceEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszupn, (void*)(uintptr_t)pszdiscoveryservicecandidate, (void*)(uintptr_t)ppmgmtinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszupn;
    (void)pszdiscoveryservicecandidate;
    (void)ppmgmtinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1getDeviceManagementConfigInfo(JNIEnv* km_env, jclass km_clazz, jlong providerid, jlong configstringbufferlength, jlong configstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceManagementConfigInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerid, (void*)(uintptr_t)configstringbufferlength, (void*)(uintptr_t)configstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)providerid;
    (void)configstringbufferlength;
    (void)configstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1getDeviceRegistrationInfo(JNIEnv* km_env, jclass km_clazz, jint deviceinformationclass, jlong ppdeviceregistrationinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceRegistrationInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)deviceinformationclass, (void*)(uintptr_t)ppdeviceregistrationinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinformationclass;
    (void)ppdeviceregistrationinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1getManagementAppHyperlink(JNIEnv* km_env, jclass km_clazz, jint cchhyperlink, jlong pszhyperlink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetManagementAppHyperlink");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cchhyperlink, (void*)(uintptr_t)pszhyperlink);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cchhyperlink;
    (void)pszhyperlink;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1isDeviceRegisteredWithManagement(JNIEnv* km_env, jclass km_clazz, jlong pfisdeviceregisteredwithmanagement, jint cchupn, jlong pszupn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDeviceRegisteredWithManagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfisdeviceregisteredwithmanagement, (uint32_t)cchupn, (void*)(uintptr_t)pszupn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfisdeviceregisteredwithmanagement;
    (void)cchupn;
    (void)pszupn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1isManagementRegistrationAllowed(JNIEnv* km_env, jclass km_clazz, jlong pfismanagementregistrationallowed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsManagementRegistrationAllowed");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfismanagementregistrationallowed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfismanagementregistrationallowed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1isMdmUxWithoutAadAllowed(JNIEnv* km_env, jclass km_clazz, jlong isenrollmentallowed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsMdmUxWithoutAadAllowed");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)isenrollmentallowed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)isenrollmentallowed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1registerDeviceWithLocalManagement(JNIEnv* km_env, jclass km_clazz, jlong alreadyregistered) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithLocalManagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)alreadyregistered);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)alreadyregistered;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1registerDeviceWithManagement(JNIEnv* km_env, jclass km_clazz, jlong pszupn, jlong ppszmdmserviceuri, jlong ppzsaccesstoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithManagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszupn, (void*)(uintptr_t)ppszmdmserviceuri, (void*)(uintptr_t)ppzsaccesstoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszupn;
    (void)ppszmdmserviceuri;
    (void)ppzsaccesstoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1registerDeviceWithManagementUsingAADCredentials(JNIEnv* km_env, jclass km_clazz, jlong usertoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADCredentials");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)usertoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)usertoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1registerDeviceWithManagementUsingAADDeviceCredentials(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADDeviceCredentials");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1registerDeviceWithManagementUsingAADDeviceCredentials2(JNIEnv* km_env, jclass km_clazz, jlong mdmapplicationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADDeviceCredentials2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mdmapplicationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mdmapplicationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1setDeviceManagementConfigInfo(JNIEnv* km_env, jclass km_clazz, jlong providerid, jlong configstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDeviceManagementConfigInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerid, (void*)(uintptr_t)configstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)providerid;
    (void)configstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1setManagedExternally(JNIEnv* km_env, jclass km_clazz, jint ismanagedexternally) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetManagedExternally");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)ismanagedexternally);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ismanagedexternally;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1unregisterDeviceWithLocalManagement(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterDeviceWithLocalManagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_management_mobiledevicemanagementregistration_WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge_windowssys_1windows_1win32_1management_1mobiledevicemanagementregistration_1unregisterDeviceWithManagement(JNIEnv* km_env, jclass km_clazz, jlong enrollmentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterDeviceWithManagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enrollmentid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enrollmentid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

