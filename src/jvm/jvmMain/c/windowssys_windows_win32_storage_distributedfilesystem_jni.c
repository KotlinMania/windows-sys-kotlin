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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jlong comment, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (void*)(uintptr_t)comment, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)comment;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong rootshare, jlong ftdfsname, jlong comment, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddFtRoot");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (void*)(uintptr_t)ftdfsname, (void*)(uintptr_t)comment, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)comment;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(JNIEnv* km_env, jclass km_clazz, jlong pdfspath, jlong ptargetpath, jint majorversion, jlong pcomment, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddRootTarget");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdfspath, (void*)(uintptr_t)ptargetpath, (uint32_t)majorversion, (void*)(uintptr_t)pcomment, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdfspath;
    (void)ptargetpath;
    (void)majorversion;
    (void)pcomment;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong rootshare, jlong comment, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddStdRoot");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (void*)(uintptr_t)comment, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)rootshare;
    (void)comment;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(JNIEnv* km_env, jclass km_clazz, jlong dfsname, jint level, jint prefmaxlen, jlong buffer, jlong entriesread, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsname, (uint32_t)level, (uint32_t)prefmaxlen, (void*)(uintptr_t)buffer, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsname;
    (void)level;
    (void)prefmaxlen;
    (void)buffer;
    (void)entriesread;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jint level, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (uint32_t)level, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(JNIEnv* km_env, jclass km_clazz, jlong domainname, jint securityinformation, jlong ppsecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetFtContainerSecurity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)domainname, (uint32_t)securityinformation, (void*)(uintptr_t)ppsecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)domainname;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jint level, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (uint32_t)level, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jint securityinformation, jlong ppsecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetSecurity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsentrypath, (uint32_t)securityinformation, (void*)(uintptr_t)ppsecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsentrypath;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(JNIEnv* km_env, jclass km_clazz, jlong machinename, jint securityinformation, jlong ppsecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetStdContainerSecurity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)machinename, (uint32_t)securityinformation, (void*)(uintptr_t)ppsecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)machinename;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(JNIEnv* km_env, jclass km_clazz, jint origin, jlong pname, jlong ppversioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetSupportedNamespaceVersion");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)origin, (void*)(uintptr_t)pname, (void*)(uintptr_t)ppversioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)origin;
    (void)pname;
    (void)ppversioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(JNIEnv* km_env, jclass km_clazz, jlong olddfsentrypath, jlong newdfsentrypath, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsMove");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)olddfsentrypath, (void*)(uintptr_t)newdfsentrypath, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)olddfsentrypath;
    (void)newdfsentrypath;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemove");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong rootshare, jlong ftdfsname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveFtRoot");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (void*)(uintptr_t)ftdfsname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(JNIEnv* km_env, jclass km_clazz, jlong domainname, jlong servername, jlong rootshare, jlong ftdfsname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveFtRootForced");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)domainname, (void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (void*)(uintptr_t)ftdfsname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)domainname;
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(JNIEnv* km_env, jclass km_clazz, jlong pdfspath, jlong ptargetpath, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveRootTarget");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdfspath, (void*)(uintptr_t)ptargetpath, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdfspath;
    (void)ptargetpath;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong rootshare, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveStdRoot");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)rootshare;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jint level, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (uint32_t)level, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(JNIEnv* km_env, jclass km_clazz, jlong domainname, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetFtContainerSecurity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)domainname, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)domainname;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jint level, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (uint32_t)level, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetSecurity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dfsentrypath, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dfsentrypath;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(JNIEnv* km_env, jclass km_clazz, jlong machinename, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetStdContainerSecurity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)machinename, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)machinename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

