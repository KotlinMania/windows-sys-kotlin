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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addISNSServerA(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddISNSServerA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addISNSServerW(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddISNSServerW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addIScsiConnectionA(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid, jlong reserved, jint initiatorportnumber, jlong targetportal, jlong securityflags, jlong loginoptions, jint keysize, jlong key, jlong connectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiConnectionA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid, (void*)(uintptr_t)reserved, (uint32_t)initiatorportnumber, (void*)(uintptr_t)targetportal, (uint64_t)securityflags, (void*)(uintptr_t)loginoptions, (uint32_t)keysize, (void*)(uintptr_t)key, (void*)(uintptr_t)connectionid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    (void)reserved;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)connectionid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addIScsiConnectionW(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid, jlong reserved, jint initiatorportnumber, jlong targetportal, jlong securityflags, jlong loginoptions, jint keysize, jlong key, jlong connectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiConnectionW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid, (void*)(uintptr_t)reserved, (uint32_t)initiatorportnumber, (void*)(uintptr_t)targetportal, (uint64_t)securityflags, (void*)(uintptr_t)loginoptions, (uint32_t)keysize, (void*)(uintptr_t)key, (void*)(uintptr_t)connectionid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    (void)reserved;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)connectionid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addIScsiSendTargetPortalA(JNIEnv* km_env, jclass km_clazz, jlong initiatorinstance, jint initiatorportnumber, jlong loginoptions, jlong securityflags, jlong portal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiSendTargetPortalA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)loginoptions, (uint64_t)securityflags, (void*)(uintptr_t)portal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)loginoptions;
    (void)securityflags;
    (void)portal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addIScsiSendTargetPortalW(JNIEnv* km_env, jclass km_clazz, jlong initiatorinstance, jint initiatorportnumber, jlong loginoptions, jlong securityflags, jlong portal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiSendTargetPortalW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)loginoptions, (uint64_t)securityflags, (void*)(uintptr_t)portal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)loginoptions;
    (void)securityflags;
    (void)portal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addIScsiStaticTargetA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jlong targetalias, jint targetflags, jboolean persist, jlong mappings, jlong loginoptions, jlong portalgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiStaticTargetA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (void*)(uintptr_t)targetalias, (uint32_t)targetflags, (bool)persist, (void*)(uintptr_t)mappings, (void*)(uintptr_t)loginoptions, (void*)(uintptr_t)portalgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)targetname;
    (void)targetalias;
    (void)targetflags;
    (void)persist;
    (void)mappings;
    (void)loginoptions;
    (void)portalgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addIScsiStaticTargetW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jlong targetalias, jint targetflags, jboolean persist, jlong mappings, jlong loginoptions, jlong portalgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiStaticTargetW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (void*)(uintptr_t)targetalias, (uint32_t)targetflags, (bool)persist, (void*)(uintptr_t)mappings, (void*)(uintptr_t)loginoptions, (void*)(uintptr_t)portalgroup);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)targetname;
    (void)targetalias;
    (void)targetflags;
    (void)persist;
    (void)mappings;
    (void)loginoptions;
    (void)portalgroup;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addPersistentIScsiDeviceA(JNIEnv* km_env, jclass km_clazz, jlong devicepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPersistentIScsiDeviceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)devicepath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)devicepath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addPersistentIScsiDeviceW(JNIEnv* km_env, jclass km_clazz, jlong devicepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPersistentIScsiDeviceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)devicepath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)devicepath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addRadiusServerA(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddRadiusServerA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1addRadiusServerW(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddRadiusServerW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1clearPersistentIScsiDevices(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearPersistentIScsiDevices");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getDevicesForIScsiSessionA(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid, jlong devicecount, jlong devices) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDevicesForIScsiSessionA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid, (void*)(uintptr_t)devicecount, (void*)(uintptr_t)devices);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    (void)devicecount;
    (void)devices;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getDevicesForIScsiSessionW(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid, jlong devicecount, jlong devices) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDevicesForIScsiSessionW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid, (void*)(uintptr_t)devicecount, (void*)(uintptr_t)devices);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    (void)devicecount;
    (void)devices;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiIKEInfoA(JNIEnv* km_env, jclass km_clazz, jlong initiatorname, jint initiatorportnumber, jlong reserved, jlong authinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiIKEInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorname, (uint32_t)initiatorportnumber, (void*)(uintptr_t)reserved, (void*)(uintptr_t)authinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)reserved;
    (void)authinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiIKEInfoW(JNIEnv* km_env, jclass km_clazz, jlong initiatorname, jint initiatorportnumber, jlong reserved, jlong authinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiIKEInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorname, (uint32_t)initiatorportnumber, (void*)(uintptr_t)reserved, (void*)(uintptr_t)authinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)reserved;
    (void)authinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiInitiatorNodeNameA(JNIEnv* km_env, jclass km_clazz, jlong initiatornodename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiInitiatorNodeNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatornodename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatornodename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiInitiatorNodeNameW(JNIEnv* km_env, jclass km_clazz, jlong initiatornodename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiInitiatorNodeNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatornodename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatornodename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiSessionListA(JNIEnv* km_env, jclass km_clazz, jlong buffersize, jlong sessioncount, jlong sessioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiSessionListA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersize, (void*)(uintptr_t)sessioncount, (void*)(uintptr_t)sessioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersize;
    (void)sessioncount;
    (void)sessioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiSessionListEx(JNIEnv* km_env, jclass km_clazz, jlong buffersize, jlong sessioncountptr, jlong sessioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiSessionListEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersize, (void*)(uintptr_t)sessioncountptr, (void*)(uintptr_t)sessioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersize;
    (void)sessioncountptr;
    (void)sessioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiSessionListW(JNIEnv* km_env, jclass km_clazz, jlong buffersize, jlong sessioncount, jlong sessioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiSessionListW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersize, (void*)(uintptr_t)sessioncount, (void*)(uintptr_t)sessioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersize;
    (void)sessioncount;
    (void)sessioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiTargetInformationA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jlong discoverymechanism, jint infoclass, jlong buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiTargetInformationA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (void*)(uintptr_t)discoverymechanism, (int32_t)infoclass, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)targetname;
    (void)discoverymechanism;
    (void)infoclass;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiTargetInformationW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jlong discoverymechanism, jint infoclass, jlong buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiTargetInformationW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (void*)(uintptr_t)discoverymechanism, (int32_t)infoclass, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)targetname;
    (void)discoverymechanism;
    (void)infoclass;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1getIScsiVersionInformation(JNIEnv* km_env, jclass km_clazz, jlong versioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiVersionInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)versioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)versioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1loginIScsiTargetA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jboolean isinformationalsession, jlong initiatorinstance, jint initiatorportnumber, jlong targetportal, jlong securityflags, jlong mappings, jlong loginoptions, jint keysize, jlong key, jboolean ispersistent, jlong uniquesessionid, jlong uniqueconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, uint64_t, void*, void*, uint32_t, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoginIScsiTargetA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (bool)isinformationalsession, (void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)targetportal, (uint64_t)securityflags, (void*)(uintptr_t)mappings, (void*)(uintptr_t)loginoptions, (uint32_t)keysize, (void*)(uintptr_t)key, (bool)ispersistent, (void*)(uintptr_t)uniquesessionid, (void*)(uintptr_t)uniqueconnectionid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)targetname;
    (void)isinformationalsession;
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)mappings;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)ispersistent;
    (void)uniquesessionid;
    (void)uniqueconnectionid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1loginIScsiTargetW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jboolean isinformationalsession, jlong initiatorinstance, jint initiatorportnumber, jlong targetportal, jlong securityflags, jlong mappings, jlong loginoptions, jint keysize, jlong key, jboolean ispersistent, jlong uniquesessionid, jlong uniqueconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, uint64_t, void*, void*, uint32_t, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoginIScsiTargetW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (bool)isinformationalsession, (void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)targetportal, (uint64_t)securityflags, (void*)(uintptr_t)mappings, (void*)(uintptr_t)loginoptions, (uint32_t)keysize, (void*)(uintptr_t)key, (bool)ispersistent, (void*)(uintptr_t)uniquesessionid, (void*)(uintptr_t)uniqueconnectionid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)targetname;
    (void)isinformationalsession;
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)mappings;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)ispersistent;
    (void)uniquesessionid;
    (void)uniqueconnectionid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1logoutIScsiTarget(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogoutIScsiTarget");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1refreshISNSServerA(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshISNSServerA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1refreshISNSServerW(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshISNSServerW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1refreshIScsiSendTargetPortalA(JNIEnv* km_env, jclass km_clazz, jlong initiatorinstance, jint initiatorportnumber, jlong portal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshIScsiSendTargetPortalA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)portal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1refreshIScsiSendTargetPortalW(JNIEnv* km_env, jclass km_clazz, jlong initiatorinstance, jint initiatorportnumber, jlong portal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshIScsiSendTargetPortalW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)portal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeISNSServerA(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveISNSServerA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeISNSServerW(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveISNSServerW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeIScsiConnection(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid, jlong connectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiConnection");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid, (void*)(uintptr_t)connectionid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    (void)connectionid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeIScsiPersistentTargetA(JNIEnv* km_env, jclass km_clazz, jlong initiatorinstance, jint initiatorportnumber, jlong targetname, jlong portal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiPersistentTargetA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)targetname, (void*)(uintptr_t)portal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetname;
    (void)portal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeIScsiPersistentTargetW(JNIEnv* km_env, jclass km_clazz, jlong initiatorinstance, jint initiatorportnumber, jlong targetname, jlong portal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiPersistentTargetW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)targetname, (void*)(uintptr_t)portal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetname;
    (void)portal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeIScsiSendTargetPortalA(JNIEnv* km_env, jclass km_clazz, jlong initiatorinstance, jint initiatorportnumber, jlong portal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiSendTargetPortalA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)portal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeIScsiSendTargetPortalW(JNIEnv* km_env, jclass km_clazz, jlong initiatorinstance, jint initiatorportnumber, jlong portal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiSendTargetPortalW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorinstance, (uint32_t)initiatorportnumber, (void*)(uintptr_t)portal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeIScsiStaticTargetA(JNIEnv* km_env, jclass km_clazz, jlong targetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiStaticTargetA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)targetname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeIScsiStaticTargetW(JNIEnv* km_env, jclass km_clazz, jlong targetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiStaticTargetW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)targetname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removePersistentIScsiDeviceA(JNIEnv* km_env, jclass km_clazz, jlong devicepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePersistentIScsiDeviceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)devicepath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)devicepath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removePersistentIScsiDeviceW(JNIEnv* km_env, jclass km_clazz, jlong devicepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePersistentIScsiDeviceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)devicepath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)devicepath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeRadiusServerA(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveRadiusServerA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1removeRadiusServerW(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveRadiusServerW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportActiveIScsiTargetMappingsA(JNIEnv* km_env, jclass km_clazz, jlong buffersize, jlong mappingcount, jlong mappings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportActiveIScsiTargetMappingsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersize, (void*)(uintptr_t)mappingcount, (void*)(uintptr_t)mappings);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersize;
    (void)mappingcount;
    (void)mappings;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportActiveIScsiTargetMappingsW(JNIEnv* km_env, jclass km_clazz, jlong buffersize, jlong mappingcount, jlong mappings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportActiveIScsiTargetMappingsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersize, (void*)(uintptr_t)mappingcount, (void*)(uintptr_t)mappings);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersize;
    (void)mappingcount;
    (void)mappings;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportISNSServerListA(JNIEnv* km_env, jclass km_clazz, jlong buffersizeinchar, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportISNSServerListA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersizeinchar, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportISNSServerListW(JNIEnv* km_env, jclass km_clazz, jlong buffersizeinchar, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportISNSServerListW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersizeinchar, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiInitiatorListA(JNIEnv* km_env, jclass km_clazz, jlong buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiInitiatorListA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiInitiatorListW(JNIEnv* km_env, jclass km_clazz, jlong buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiInitiatorListW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiPersistentLoginsA(JNIEnv* km_env, jclass km_clazz, jlong count, jlong persistentlogininfo, jlong buffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiPersistentLoginsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)count, (void*)(uintptr_t)persistentlogininfo, (void*)(uintptr_t)buffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)count;
    (void)persistentlogininfo;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiPersistentLoginsW(JNIEnv* km_env, jclass km_clazz, jlong count, jlong persistentlogininfo, jlong buffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiPersistentLoginsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)count, (void*)(uintptr_t)persistentlogininfo, (void*)(uintptr_t)buffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)count;
    (void)persistentlogininfo;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiSendTargetPortalsA(JNIEnv* km_env, jclass km_clazz, jlong portalcount, jlong portalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)portalcount, (void*)(uintptr_t)portalinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)portalcount;
    (void)portalinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiSendTargetPortalsExA(JNIEnv* km_env, jclass km_clazz, jlong portalcount, jlong portalinfosize, jlong portalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)portalcount, (void*)(uintptr_t)portalinfosize, (void*)(uintptr_t)portalinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)portalcount;
    (void)portalinfosize;
    (void)portalinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiSendTargetPortalsExW(JNIEnv* km_env, jclass km_clazz, jlong portalcount, jlong portalinfosize, jlong portalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)portalcount, (void*)(uintptr_t)portalinfosize, (void*)(uintptr_t)portalinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)portalcount;
    (void)portalinfosize;
    (void)portalinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiSendTargetPortalsW(JNIEnv* km_env, jclass km_clazz, jlong portalcount, jlong portalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)portalcount, (void*)(uintptr_t)portalinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)portalcount;
    (void)portalinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiTargetPortalsA(JNIEnv* km_env, jclass km_clazz, jlong initiatorname, jlong targetname, jlong targetportaltag, jlong elementcount, jlong portals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiTargetPortalsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorname, (void*)(uintptr_t)targetname, (void*)(uintptr_t)targetportaltag, (void*)(uintptr_t)elementcount, (void*)(uintptr_t)portals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorname;
    (void)targetname;
    (void)targetportaltag;
    (void)elementcount;
    (void)portals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiTargetPortalsW(JNIEnv* km_env, jclass km_clazz, jlong initiatorname, jlong targetname, jlong targetportaltag, jlong elementcount, jlong portals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiTargetPortalsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorname, (void*)(uintptr_t)targetname, (void*)(uintptr_t)targetportaltag, (void*)(uintptr_t)elementcount, (void*)(uintptr_t)portals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorname;
    (void)targetname;
    (void)targetportaltag;
    (void)elementcount;
    (void)portals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiTargetsA(JNIEnv* km_env, jclass km_clazz, jboolean forceupdate, jlong buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiTargetsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)forceupdate, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)forceupdate;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportIScsiTargetsW(JNIEnv* km_env, jclass km_clazz, jboolean forceupdate, jlong buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiTargetsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)forceupdate, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)forceupdate;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportPersistentIScsiDevicesA(JNIEnv* km_env, jclass km_clazz, jlong buffersizeinchar, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportPersistentIScsiDevicesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersizeinchar, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportPersistentIScsiDevicesW(JNIEnv* km_env, jclass km_clazz, jlong buffersizeinchar, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportPersistentIScsiDevicesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersizeinchar, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportRadiusServerListA(JNIEnv* km_env, jclass km_clazz, jlong buffersizeinchar, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportRadiusServerListA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersizeinchar, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1reportRadiusServerListW(JNIEnv* km_env, jclass km_clazz, jlong buffersizeinchar, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportRadiusServerListW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffersizeinchar, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1sendScsiInquiry(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid, jlong lun, jbyte evpdcmddt, jbyte pagecode, jlong scsistatus, jlong responsesize, jlong responsebuffer, jlong sensesize, jlong sensebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint8_t, uint8_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendScsiInquiry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid, (uint64_t)lun, (uint8_t)evpdcmddt, (uint8_t)pagecode, (void*)(uintptr_t)scsistatus, (void*)(uintptr_t)responsesize, (void*)(uintptr_t)responsebuffer, (void*)(uintptr_t)sensesize, (void*)(uintptr_t)sensebuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    (void)lun;
    (void)evpdcmddt;
    (void)pagecode;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1sendScsiReadCapacity(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid, jlong lun, jlong scsistatus, jlong responsesize, jlong responsebuffer, jlong sensesize, jlong sensebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendScsiReadCapacity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid, (uint64_t)lun, (void*)(uintptr_t)scsistatus, (void*)(uintptr_t)responsesize, (void*)(uintptr_t)responsebuffer, (void*)(uintptr_t)sensesize, (void*)(uintptr_t)sensebuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    (void)lun;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1sendScsiReportLuns(JNIEnv* km_env, jclass km_clazz, jlong uniquesessionid, jlong scsistatus, jlong responsesize, jlong responsebuffer, jlong sensesize, jlong sensebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendScsiReportLuns");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uniquesessionid, (void*)(uintptr_t)scsistatus, (void*)(uintptr_t)responsesize, (void*)(uintptr_t)responsebuffer, (void*)(uintptr_t)sensesize, (void*)(uintptr_t)sensebuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uniquesessionid;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiGroupPresharedKey(JNIEnv* km_env, jclass km_clazz, jint keylength, jlong key, jboolean persist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiGroupPresharedKey");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)keylength, (void*)(uintptr_t)key, (bool)persist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)keylength;
    (void)key;
    (void)persist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiIKEInfoA(JNIEnv* km_env, jclass km_clazz, jlong initiatorname, jint initiatorportnumber, jlong authinfo, jboolean persist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiIKEInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorname, (uint32_t)initiatorportnumber, (void*)(uintptr_t)authinfo, (bool)persist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)authinfo;
    (void)persist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiIKEInfoW(JNIEnv* km_env, jclass km_clazz, jlong initiatorname, jint initiatorportnumber, jlong authinfo, jboolean persist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiIKEInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorname, (uint32_t)initiatorportnumber, (void*)(uintptr_t)authinfo, (bool)persist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)authinfo;
    (void)persist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiInitiatorCHAPSharedSecret(JNIEnv* km_env, jclass km_clazz, jint sharedsecretlength, jlong sharedsecret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiInitiatorCHAPSharedSecret");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)sharedsecretlength, (void*)(uintptr_t)sharedsecret);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sharedsecretlength;
    (void)sharedsecret;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiInitiatorNodeNameA(JNIEnv* km_env, jclass km_clazz, jlong initiatornodename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiInitiatorNodeNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatornodename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatornodename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiInitiatorNodeNameW(JNIEnv* km_env, jclass km_clazz, jlong initiatornodename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiInitiatorNodeNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatornodename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatornodename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiInitiatorRADIUSSharedSecret(JNIEnv* km_env, jclass km_clazz, jint sharedsecretlength, jlong sharedsecret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiInitiatorRADIUSSharedSecret");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)sharedsecretlength, (void*)(uintptr_t)sharedsecret);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sharedsecretlength;
    (void)sharedsecret;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiTunnelModeOuterAddressA(JNIEnv* km_env, jclass km_clazz, jlong initiatorname, jint initiatorportnumber, jlong destinationaddress, jlong outermodeaddress, jboolean persist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiTunnelModeOuterAddressA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorname, (uint32_t)initiatorportnumber, (void*)(uintptr_t)destinationaddress, (void*)(uintptr_t)outermodeaddress, (bool)persist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)destinationaddress;
    (void)outermodeaddress;
    (void)persist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setIScsiTunnelModeOuterAddressW(JNIEnv* km_env, jclass km_clazz, jlong initiatorname, jint initiatorportnumber, jlong destinationaddress, jlong outermodeaddress, jboolean persist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiTunnelModeOuterAddressW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initiatorname, (uint32_t)initiatorportnumber, (void*)(uintptr_t)destinationaddress, (void*)(uintptr_t)outermodeaddress, (bool)persist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)destinationaddress;
    (void)outermodeaddress;
    (void)persist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setupPersistentIScsiDevices(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPersistentIScsiDevices");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_iscsidisc_WindowsWin32StorageIscsidiscJniBridge_windowssys_1windows_1win32_1storage_1iscsidisc_1setupPersistentIScsiVolumes(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPersistentIScsiVolumes");
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

