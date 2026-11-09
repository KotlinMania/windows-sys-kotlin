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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORCloseHive(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORCloseHive");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORCloseKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORCloseKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)keyhandle) : 0;
#else
    (void)keyhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORCreateHive(JNIEnv* km_env, jclass km_clazz, jlong horkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORCreateHive");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)horkey) : 0;
#else
    (void)horkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORCreateKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong lpsubkey, jlong lpclass, jint dwoptions, jlong psecuritydescriptor, jlong phkresult, jlong pdwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORCreateKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpclass, (uint32_t)dwoptions, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)pdwdisposition) : 0;
#else
    (void)keyhandle;
    (void)lpsubkey;
    (void)lpclass;
    (void)dwoptions;
    (void)psecuritydescriptor;
    (void)phkresult;
    (void)pdwdisposition;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORDeleteKey(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORDeleteKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)lpsubkey) : 0;
#else
    (void)handle;
    (void)lpsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORDeleteValue(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpvaluename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORDeleteValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)lpvaluename) : 0;
#else
    (void)handle;
    (void)lpvaluename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1OREnumKey(JNIEnv* km_env, jclass km_clazz, jlong handle, jint dwindex, jlong lpname, jlong lpcname, jlong lpclass, jlong lpcclass, jlong lpftlastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OREnumKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)dwindex, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpcname, (void*)(uintptr_t)lpclass, (void*)(uintptr_t)lpcclass, (void*)(uintptr_t)lpftlastwritetime) : 0;
#else
    (void)handle;
    (void)dwindex;
    (void)lpname;
    (void)lpcname;
    (void)lpclass;
    (void)lpcclass;
    (void)lpftlastwritetime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1OREnumValue(JNIEnv* km_env, jclass km_clazz, jlong handle, jint dwindex, jlong lpvaluename, jlong lpcvaluename, jlong lptype, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OREnumValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)dwindex, (void*)(uintptr_t)lpvaluename, (void*)(uintptr_t)lpcvaluename, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : 0;
#else
    (void)handle;
    (void)dwindex;
    (void)lpvaluename;
    (void)lpcvaluename;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORGetKeySecurity(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong psecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORGetKeySecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor) : 0;
#else
    (void)handle;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORGetValue(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpsubkey, jlong lpvalue, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORGetValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpvalue, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)handle;
    (void)lpsubkey;
    (void)lpvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORGetVersion(JNIEnv* km_env, jclass km_clazz, jlong pdwmajorversion, jlong pdwminorversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORGetVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwmajorversion, (void*)(uintptr_t)pdwminorversion) : 0;
#else
    (void)pdwmajorversion;
    (void)pdwminorversion;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORGetVirtualFlags(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORGetVirtualFlags");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pdwflags) : 0;
#else
    (void)handle;
    (void)pdwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORMergeHives(JNIEnv* km_env, jclass km_clazz, jlong hivehandles, jint hivecount, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORMergeHives");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hivehandles, (uint32_t)hivecount, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)hivehandles;
    (void)hivecount;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1OROpenHive(JNIEnv* km_env, jclass km_clazz, jlong filepath, jlong horkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OROpenHive");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filepath, (void*)(uintptr_t)horkey) : 0;
#else
    (void)filepath;
    (void)horkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1OROpenHiveByHandle(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong horkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OROpenHiveByHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)horkey) : 0;
#else
    (void)filehandle;
    (void)horkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1OROpenKey(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpsubkey, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OROpenKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)handle;
    (void)lpsubkey;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORQueryInfoKey(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpclass, jlong lpcclass, jlong lpcsubkeys, jlong lpcmaxsubkeylen, jlong lpcmaxclasslen, jlong lpcvalues, jlong lpcmaxvaluenamelen, jlong lpcmaxvaluelen, jlong lpcbsecuritydescriptor, jlong lpftlastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORQueryInfoKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)lpclass, (void*)(uintptr_t)lpcclass, (void*)(uintptr_t)lpcsubkeys, (void*)(uintptr_t)lpcmaxsubkeylen, (void*)(uintptr_t)lpcmaxclasslen, (void*)(uintptr_t)lpcvalues, (void*)(uintptr_t)lpcmaxvaluenamelen, (void*)(uintptr_t)lpcmaxvaluelen, (void*)(uintptr_t)lpcbsecuritydescriptor, (void*)(uintptr_t)lpftlastwritetime) : 0;
#else
    (void)handle;
    (void)lpclass;
    (void)lpcclass;
    (void)lpcsubkeys;
    (void)lpcmaxsubkeylen;
    (void)lpcmaxclasslen;
    (void)lpcvalues;
    (void)lpcmaxvaluenamelen;
    (void)lpcmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORRenameKey(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpnewname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORRenameKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)lpnewname) : 0;
#else
    (void)handle;
    (void)lpnewname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORSaveHive(JNIEnv* km_env, jclass km_clazz, jlong horkey, jlong hivepath, jint osmajorversion, jint osminorversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORSaveHive");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)horkey, (void*)(uintptr_t)hivepath, (uint32_t)osmajorversion, (uint32_t)osminorversion) : 0;
#else
    (void)horkey;
    (void)hivepath;
    (void)osmajorversion;
    (void)osminorversion;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORSetKeySecurity(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORSetKeySecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : 0;
#else
    (void)handle;
    (void)securityinformation;
    (void)psecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORSetValue(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpvaluename, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORSetValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)lpvaluename, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : 0;
#else
    (void)handle;
    (void)lpvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORSetVirtualFlags(JNIEnv* km_env, jclass km_clazz, jlong handle, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORSetVirtualFlags");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)dwflags) : 0;
#else
    (void)handle;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORShutdown");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_offlineregistry_WindowsWdkSystemOfflineregistryJniBridge_windowssys_1windows_1wdk_1system_1offlineregistry_1ORStart(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORStart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

