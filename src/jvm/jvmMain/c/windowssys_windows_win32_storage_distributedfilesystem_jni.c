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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsAdd(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jlong comment, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (void*)(uintptr_t)comment, (uint32_t)flags) : 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)comment;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsAddFtRoot(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong rootshare, jlong ftdfsname, jlong comment, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddFtRoot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (void*)(uintptr_t)ftdfsname, (void*)(uintptr_t)comment, (uint32_t)flags) : 0;
#else
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)comment;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsAddRootTarget(JNIEnv* km_env, jclass km_clazz, jlong pdfspath, jlong ptargetpath, jint majorversion, jlong pcomment, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddRootTarget");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdfspath, (void*)(uintptr_t)ptargetpath, (uint32_t)majorversion, (void*)(uintptr_t)pcomment, (uint32_t)flags) : 0;
#else
    (void)pdfspath;
    (void)ptargetpath;
    (void)majorversion;
    (void)pcomment;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsAddStdRoot(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong rootshare, jlong comment, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsAddStdRoot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (void*)(uintptr_t)comment, (uint32_t)flags) : 0;
#else
    (void)servername;
    (void)rootshare;
    (void)comment;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsEnum(JNIEnv* km_env, jclass km_clazz, jlong dfsname, jint level, jint prefmaxlen, jlong buffer, jlong entriesread, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsname, (uint32_t)level, (uint32_t)prefmaxlen, (void*)(uintptr_t)buffer, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)dfsname;
    (void)level;
    (void)prefmaxlen;
    (void)buffer;
    (void)entriesread;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsGetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jint level, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (uint32_t)level, (void*)(uintptr_t)buffer) : 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsGetFtContainerSecurity(JNIEnv* km_env, jclass km_clazz, jlong domainname, jint securityinformation, jlong ppsecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetFtContainerSecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domainname, (uint32_t)securityinformation, (void*)(uintptr_t)ppsecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor) : 0;
#else
    (void)domainname;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsGetInfo(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jint level, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (uint32_t)level, (void*)(uintptr_t)buffer) : 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsGetSecurity(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jint securityinformation, jlong ppsecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetSecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsentrypath, (uint32_t)securityinformation, (void*)(uintptr_t)ppsecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor) : 0;
#else
    (void)dfsentrypath;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsGetStdContainerSecurity(JNIEnv* km_env, jclass km_clazz, jlong machinename, jint securityinformation, jlong ppsecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetStdContainerSecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)machinename, (uint32_t)securityinformation, (void*)(uintptr_t)ppsecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor) : 0;
#else
    (void)machinename;
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsGetSupportedNamespaceVersion(JNIEnv* km_env, jclass km_clazz, jint origin, jlong pname, jlong ppversioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsGetSupportedNamespaceVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)origin, (void*)(uintptr_t)pname, (void*)(uintptr_t)ppversioninfo) : 0;
#else
    (void)origin;
    (void)pname;
    (void)ppversioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsMove(JNIEnv* km_env, jclass km_clazz, jlong olddfsentrypath, jlong newdfsentrypath, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsMove");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)olddfsentrypath, (void*)(uintptr_t)newdfsentrypath, (uint32_t)flags) : 0;
#else
    (void)olddfsentrypath;
    (void)newdfsentrypath;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsRemove(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemove");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename) : 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsRemoveFtRoot(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong rootshare, jlong ftdfsname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveFtRoot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (void*)(uintptr_t)ftdfsname, (uint32_t)flags) : 0;
#else
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsRemoveFtRootForced(JNIEnv* km_env, jclass km_clazz, jlong domainname, jlong servername, jlong rootshare, jlong ftdfsname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveFtRootForced");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domainname, (void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (void*)(uintptr_t)ftdfsname, (uint32_t)flags) : 0;
#else
    (void)domainname;
    (void)servername;
    (void)rootshare;
    (void)ftdfsname;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsRemoveRootTarget(JNIEnv* km_env, jclass km_clazz, jlong pdfspath, jlong ptargetpath, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveRootTarget");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdfspath, (void*)(uintptr_t)ptargetpath, (uint32_t)flags) : 0;
#else
    (void)pdfspath;
    (void)ptargetpath;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsRemoveStdRoot(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong rootshare, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsRemoveStdRoot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)rootshare, (uint32_t)flags) : 0;
#else
    (void)servername;
    (void)rootshare;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsSetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jint level, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (uint32_t)level, (void*)(uintptr_t)buffer) : 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsSetFtContainerSecurity(JNIEnv* km_env, jclass km_clazz, jlong domainname, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetFtContainerSecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domainname, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : 0;
#else
    (void)domainname;
    (void)securityinformation;
    (void)psecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsSetInfo(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jlong servername, jlong sharename, jint level, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsentrypath, (void*)(uintptr_t)servername, (void*)(uintptr_t)sharename, (uint32_t)level, (void*)(uintptr_t)buffer) : 0;
#else
    (void)dfsentrypath;
    (void)servername;
    (void)sharename;
    (void)level;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsSetSecurity(JNIEnv* km_env, jclass km_clazz, jlong dfsentrypath, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetSecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dfsentrypath, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : 0;
#else
    (void)dfsentrypath;
    (void)securityinformation;
    (void)psecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_distributedfilesystem_WindowsWin32StorageDistributedfilesystemJniBridge_windowssys_1windows_1win32_1storage_1distributedfilesystem_1netDfsSetStdContainerSecurity(JNIEnv* km_env, jclass km_clazz, jlong machinename, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetDfsSetStdContainerSecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)machinename, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : 0;
#else
    (void)machinename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

