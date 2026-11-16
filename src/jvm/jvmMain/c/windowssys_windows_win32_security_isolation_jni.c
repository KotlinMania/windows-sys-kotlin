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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(JNIEnv* km_env, jclass km_clazz, jlong pszappcontainername, jlong pszdisplayname, jlong pszdescription, jlong pcapabilities, jint dwcapabilitycount, jlong ppsidappcontainersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAppContainerProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszappcontainername, (void*)(uintptr_t)pszdisplayname, (void*)(uintptr_t)pszdescription, (void*)(uintptr_t)pcapabilities, (uint32_t)dwcapabilitycount, (void*)(uintptr_t)ppsidappcontainersid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszappcontainername;
    (void)pszdisplayname;
    (void)pszdescription;
    (void)pcapabilities;
    (void)dwcapabilitycount;
    (void)ppsidappcontainersid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(JNIEnv* km_env, jclass km_clazz, jlong pszappcontainername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAppContainerProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszappcontainername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszappcontainername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(JNIEnv* km_env, jclass km_clazz, jlong pszappcontainername, jlong ppsidappcontainersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeriveAppContainerSidFromAppContainerName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszappcontainername, (void*)(uintptr_t)ppsidappcontainersid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszappcontainername;
    (void)ppsidappcontainersid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(JNIEnv* km_env, jclass km_clazz, jlong psidappcontainersid, jlong pszrestrictedappcontainername, jlong ppsidrestrictedappcontainersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psidappcontainersid, (void*)(uintptr_t)pszrestrictedappcontainername, (void*)(uintptr_t)ppsidrestrictedappcontainersid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psidappcontainersid;
    (void)pszrestrictedappcontainername;
    (void)ppsidrestrictedappcontainersid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(JNIEnv* km_env, jclass km_clazz, jlong pszappcontainersid, jlong ppszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerFolderPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszappcontainersid, (void*)(uintptr_t)ppszpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszappcontainersid;
    (void)ppszpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(JNIEnv* km_env, jclass km_clazz, jlong token, jlong appcontainersid, jint objectpathlength, jlong objectpath, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerNamedObjectPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)appcontainersid, (uint32_t)objectpathlength, (void*)(uintptr_t)objectpath, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    (void)appcontainersid;
    (void)objectpathlength;
    (void)objectpath;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(JNIEnv* km_env, jclass km_clazz, jint desiredaccess, jlong phappcontainerkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerRegistryLocation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)desiredaccess, (void*)(uintptr_t)phappcontainerkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)desiredaccess;
    (void)phappcontainerkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(JNIEnv* km_env, jclass km_clazz, jlong iscrossisolatedenvironmentclipboardcontent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("isolatedwindowsenvironmentutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCrossIsolatedEnvironmentClipboardContent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iscrossisolatedenvironmentclipboardcontent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iscrossisolatedenvironmentclipboardcontent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(JNIEnv* km_env, jclass km_clazz, jlong isprocessinisolatedcontainer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-isolatedcontainer-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessInIsolatedContainer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)isprocessinisolatedcontainer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)isprocessinisolatedcontainer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(JNIEnv* km_env, jclass km_clazz, jlong isprocessinisolatedwindowsenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("isolatedwindowsenvironmentutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessInIsolatedWindowsEnvironment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)isprocessinisolatedwindowsenvironment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)isprocessinisolatedwindowsenvironment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_isolation_WindowsWin32SecurityIsolationJniBridge_windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(JNIEnv* km_env, jclass km_clazz, jlong reserved, jlong isprocessinwdagcontainer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-isolatedcontainer-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessInWDAGContainer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reserved, (void*)(uintptr_t)isprocessinwdagcontainer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reserved;
    (void)isprocessinwdagcontainer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

