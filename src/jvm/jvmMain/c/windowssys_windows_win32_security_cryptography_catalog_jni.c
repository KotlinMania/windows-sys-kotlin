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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext(JNIEnv* km_env, jclass km_clazz, jlong phcatadmin, jlong pgsubsystem, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminAcquireContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcatadmin, (void*)(uintptr_t)pgsubsystem, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcatadmin;
    (void)pgsubsystem;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2(JNIEnv* km_env, jclass km_clazz, jlong phcatadmin, jlong pgsubsystem, jlong pwszhashalgorithm, jlong pstronghashpolicy, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminAcquireContext2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcatadmin, (void*)(uintptr_t)pgsubsystem, (void*)(uintptr_t)pwszhashalgorithm, (void*)(uintptr_t)pstronghashpolicy, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcatadmin;
    (void)pgsubsystem;
    (void)pwszhashalgorithm;
    (void)pstronghashpolicy;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog(JNIEnv* km_env, jclass km_clazz, jlong hcatadmin, jlong pwszcatalogfile, jlong pwszselectbasename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminAddCatalog");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcatadmin, (void*)(uintptr_t)pwszcatalogfile, (void*)(uintptr_t)pwszselectbasename, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)pwszselectbasename;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong pcbhash, jlong pbhash, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminCalcHashFromFileHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)pcbhash, (void*)(uintptr_t)pbhash, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)pcbhash;
    (void)pbhash;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2(JNIEnv* km_env, jclass km_clazz, jlong hcatadmin, jlong hfile, jlong pcbhash, jlong pbhash, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminCalcHashFromFileHandle2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcatadmin, (void*)(uintptr_t)hfile, (void*)(uintptr_t)pcbhash, (void*)(uintptr_t)pbhash, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatadmin;
    (void)hfile;
    (void)pcbhash;
    (void)pbhash;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash(JNIEnv* km_env, jclass km_clazz, jlong hcatadmin, jlong pbhash, jint cbhash, jint dwflags, jlong phprevcatinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminEnumCatalogFromHash");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcatadmin, (void*)(uintptr_t)pbhash, (uint32_t)cbhash, (uint32_t)dwflags, (void*)(uintptr_t)phprevcatinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatadmin;
    (void)pbhash;
    (void)cbhash;
    (void)dwflags;
    (void)phprevcatinfo;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint fresume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminPauseServiceForBackup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (int32_t)fresume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)fresume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(JNIEnv* km_env, jclass km_clazz, jlong hcatadmin, jlong hcatinfo, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminReleaseCatalogContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcatadmin, (int64_t)hcatinfo, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatadmin;
    (void)hcatinfo;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(JNIEnv* km_env, jclass km_clazz, jlong hcatadmin, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminReleaseContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcatadmin, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatadmin;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog(JNIEnv* km_env, jclass km_clazz, jlong hcatadmin, jlong pwszcatalogfile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminRemoveCatalog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcatadmin, (void*)(uintptr_t)pwszcatalogfile, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath(JNIEnv* km_env, jclass km_clazz, jlong hcatadmin, jlong pwszcatalogfile, jlong pscatinfo, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAdminResolveCatalogPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcatadmin, (void*)(uintptr_t)pwszcatalogfile, (void*)(uintptr_t)pscatinfo, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatadmin;
    (void)pwszcatalogfile;
    (void)pscatinfo;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pwszreferencetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATAllocSortedMemberInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pwszreferencetag);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose(JNIEnv* km_env, jclass km_clazz, jlong pcdf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcdf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcdf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes(JNIEnv* km_env, jclass km_clazz, jlong pcdf, jlong pmember, jlong pprevattr, jlong pfnparseerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumAttributes");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcdf, (void*)(uintptr_t)pmember, (void*)(uintptr_t)pprevattr, (void*)(uintptr_t)pfnparseerror);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcdf;
    (void)pmember;
    (void)pprevattr;
    (void)pfnparseerror;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag(JNIEnv* km_env, jclass km_clazz, jlong pcdf, jlong pwszmembertag, jlong pmember, jlong pprevattr, jlong pfnparseerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumAttributesWithCDFTag");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcdf, (void*)(uintptr_t)pwszmembertag, (void*)(uintptr_t)pmember, (void*)(uintptr_t)pprevattr, (void*)(uintptr_t)pfnparseerror);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcdf;
    (void)pwszmembertag;
    (void)pmember;
    (void)pprevattr;
    (void)pfnparseerror;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes(JNIEnv* km_env, jclass km_clazz, jlong pcdf, jlong pprevattr, jlong pfnparseerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumCatAttributes");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcdf, (void*)(uintptr_t)pprevattr, (void*)(uintptr_t)pfnparseerror);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcdf;
    (void)pprevattr;
    (void)pfnparseerror;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers(JNIEnv* km_env, jclass km_clazz, jlong pcdf, jlong pprevmember, jlong pfnparseerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumMembers");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcdf, (void*)(uintptr_t)pprevmember, (void*)(uintptr_t)pfnparseerror);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcdf;
    (void)pprevmember;
    (void)pfnparseerror;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx(JNIEnv* km_env, jclass km_clazz, jlong pcdf, jlong pwszprevcdftag, jlong pfnparseerror, jlong ppmember, jint fcontinueonerror, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFEnumMembersByCDFTagEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcdf, (void*)(uintptr_t)pwszprevcdftag, (void*)(uintptr_t)pfnparseerror, (void*)(uintptr_t)ppmember, (int32_t)fcontinueonerror, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcdf;
    (void)pwszprevcdftag;
    (void)pfnparseerror;
    (void)ppmember;
    (void)fcontinueonerror;
    (void)pvreserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen(JNIEnv* km_env, jclass km_clazz, jlong pwszfilepath, jlong pfnparseerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCDFOpen");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszfilepath, (void*)(uintptr_t)pfnparseerror);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pwszfilepath;
    (void)pfnparseerror;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext(JNIEnv* km_env, jclass km_clazz, jlong hcatinfo, jlong pscatinfo, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATCatalogInfoFromContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcatinfo, (void*)(uintptr_t)pscatinfo, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatinfo;
    (void)pscatinfo;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose(JNIEnv* km_env, jclass km_clazz, jlong hcatalog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatalog;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pcatmember, jlong pprevattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATEnumerateAttr");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pcatmember, (void*)(uintptr_t)pprevattr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pprevattr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pprevattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATEnumerateCatAttr");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pprevattr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pprevattr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pprevmember) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATEnumerateMember");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pprevmember);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pprevmember;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pcatmember) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATFreeSortedMemberInfo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pcatmember);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hcatalog;
    (void)pcatmember;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pcatmember, jlong pwszreferencetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATGetAttrInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pcatmember, (void*)(uintptr_t)pwszreferencetag);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pwszreferencetag;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pwszreferencetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATGetCatAttrInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pwszreferencetag);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pwszreferencetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATGetMemberInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pwszreferencetag);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore(JNIEnv* km_env, jclass km_clazz, jlong pcatstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATHandleFromStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcatstore);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcatstore;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen(JNIEnv* km_env, jclass km_clazz, jlong pwszfilename, jint fdwopenflags, jlong hprov, jint dwpublicversion, jint dwencodingtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATOpen");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszfilename, (uint32_t)fdwopenflags, (uint64_t)hprov, (uint32_t)dwpublicversion, (uint32_t)dwencodingtype);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pwszfilename;
    (void)fdwopenflags;
    (void)hprov;
    (void)dwpublicversion;
    (void)dwencodingtype;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore(JNIEnv* km_env, jclass km_clazz, jlong hcatalog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATPersistStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcatalog;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pcatmember, jlong pwszreferencetag, jint dwattrtypeandaction, jint cbdata, jlong pbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATPutAttrInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pcatmember, (void*)(uintptr_t)pwszreferencetag, (uint32_t)dwattrtypeandaction, (uint32_t)cbdata, (void*)(uintptr_t)pbdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pcatmember;
    (void)pwszreferencetag;
    (void)dwattrtypeandaction;
    (void)cbdata;
    (void)pbdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pwszreferencetag, jint dwattrtypeandaction, jint cbdata, jlong pbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATPutCatAttrInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pwszreferencetag, (uint32_t)dwattrtypeandaction, (uint32_t)cbdata, (void*)(uintptr_t)pbdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pwszreferencetag;
    (void)dwattrtypeandaction;
    (void)cbdata;
    (void)pbdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo(JNIEnv* km_env, jclass km_clazz, jlong hcatalog, jlong pwszfilename, jlong pwszreferencetag, jlong pgsubjecttype, jint dwcertversion, jint cbsipindirectdata, jlong pbsipindirectdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATPutMemberInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog, (void*)(uintptr_t)pwszfilename, (void*)(uintptr_t)pwszreferencetag, (void*)(uintptr_t)pgsubjecttype, (uint32_t)dwcertversion, (uint32_t)cbsipindirectdata, (void*)(uintptr_t)pbsipindirectdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    (void)pwszfilename;
    (void)pwszreferencetag;
    (void)pgsubjecttype;
    (void)dwcertversion;
    (void)cbsipindirectdata;
    (void)pbsipindirectdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle(JNIEnv* km_env, jclass km_clazz, jlong hcatalog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCATStoreFromHandle");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcatalog);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcatalog;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_catalog_WindowsWin32SecurityCryptographyCatalogJniBridge_windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong pwszfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCatalogFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)pwszfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)pwszfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

