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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davAddConnection(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jlong remotename, jlong username, jlong password, jlong clientcert, jint certsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavAddConnection");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connectionhandle, (void*)(uintptr_t)remotename, (void*)(uintptr_t)username, (void*)(uintptr_t)password, (void*)(uintptr_t)clientcert, (uint32_t)certsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connectionhandle;
    (void)remotename;
    (void)username;
    (void)password;
    (void)clientcert;
    (void)certsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davCancelConnectionsToServer(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint fforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavCancelConnectionsToServer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname, (int32_t)fforce);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpname;
    (void)fforce;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davDeleteConnection(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavDeleteConnection");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connectionhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connectionhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davFlushFile(JNIEnv* km_env, jclass km_clazz, jlong hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavFlushFile");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hfile;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davGetExtendedError(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong exterror, jlong exterrorstring, jlong cchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavGetExtendedError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)exterror, (void*)(uintptr_t)exterrorstring, (void*)(uintptr_t)cchsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hfile;
    (void)exterror;
    (void)exterrorstring;
    (void)cchsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davGetHTTPFromUNCPath(JNIEnv* km_env, jclass km_clazz, jlong uncpath, jlong url, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavGetHTTPFromUNCPath");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncpath, (void*)(uintptr_t)url, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncpath;
    (void)url;
    (void)lpsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davGetTheLockOwnerOfTheFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong lockownername, jlong lockownernamelengthinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavGetTheLockOwnerOfTheFile");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)lockownername, (void*)(uintptr_t)lockownernamelengthinbytes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)filename;
    (void)lockownername;
    (void)lockownernamelengthinbytes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davGetUNCFromHTTPPath(JNIEnv* km_env, jclass km_clazz, jlong url, jlong uncpath, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavGetUNCFromHTTPPath");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)url, (void*)(uintptr_t)uncpath, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)url;
    (void)uncpath;
    (void)lpsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davInvalidateCache(JNIEnv* km_env, jclass km_clazz, jlong urlname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavInvalidateCache");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)urlname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)urlname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davRegisterAuthCallback(JNIEnv* km_env, jclass km_clazz, jlong callback, jint version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavRegisterAuthCallback");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (uint32_t)version);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)callback;
    (void)version;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_webdav_WindowsWin32NetworkmanagementWebdavJniBridge_windowssys_1windows_1win32_1networkmanagement_1webdav_1davUnregisterAuthCallback(JNIEnv* km_env, jclass km_clazz, jint hcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavUnregisterAuthCallback");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)hcallback);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hcallback;
    errno = ENOSYS;
#endif
}

