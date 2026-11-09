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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1GetRegistryValueWithFallbackW(JNIEnv* km_env, jclass km_clazz, jlong hkeyprimary, jlong pwszprimarysubkey, jlong hkeyfallback, jlong pwszfallbacksubkey, jlong pwszvalue, jint dwflags, jlong pdwtype, jlong pvdata, jint cbdatain, jlong pcbdataout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-state-helpers-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegistryValueWithFallbackW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyprimary, (void*)(uintptr_t)pwszprimarysubkey, (void*)(uintptr_t)hkeyfallback, (void*)(uintptr_t)pwszfallbacksubkey, (void*)(uintptr_t)pwszvalue, (uint32_t)dwflags, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (uint32_t)cbdatain, (void*)(uintptr_t)pcbdataout) : 0;
#else
    (void)hkeyprimary;
    (void)pwszprimarysubkey;
    (void)hkeyfallback;
    (void)pwszfallbacksubkey;
    (void)pwszvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)cbdatain;
    (void)pcbdataout;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCloseKey(JNIEnv* km_env, jclass km_clazz, jlong hkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCloseKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey) : 0;
#else
    (void)hkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegConnectRegistryA(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong hkey, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)hkey, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegConnectRegistryExA(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong hkey, jint flags, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)hkey, (uint32_t)flags, (void*)(uintptr_t)phkresult) : -1;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)flags;
    (void)phkresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegConnectRegistryExW(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong hkey, jint flags, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)hkey, (uint32_t)flags, (void*)(uintptr_t)phkresult) : -1;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)flags;
    (void)phkresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegConnectRegistryW(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong hkey, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)hkey, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCopyTreeA(JNIEnv* km_env, jclass km_clazz, jlong hkeysrc, jlong lpsubkey, jlong hkeydest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCopyTreeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeysrc, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)hkeydest) : 0;
#else
    (void)hkeysrc;
    (void)lpsubkey;
    (void)hkeydest;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCopyTreeW(JNIEnv* km_env, jclass km_clazz, jlong hkeysrc, jlong lpsubkey, jlong hkeydest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCopyTreeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeysrc, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)hkeydest) : 0;
#else
    (void)hkeysrc;
    (void)lpsubkey;
    (void)hkeydest;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCreateKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCreateKeyExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint reserved, jlong lpclass, jint dwoptions, jint samdesired, jlong lpsecurityattributes, jlong phkresult, jlong lpdwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)reserved, (void*)(uintptr_t)lpclass, (uint32_t)dwoptions, (uint32_t)samdesired, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)lpdwdisposition) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCreateKeyExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint reserved, jlong lpclass, jint dwoptions, jint samdesired, jlong lpsecurityattributes, jlong phkresult, jlong lpdwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)reserved, (void*)(uintptr_t)lpclass, (uint32_t)dwoptions, (uint32_t)samdesired, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)lpdwdisposition) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCreateKeyTransactedA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint reserved, jlong lpclass, jint dwoptions, jint samdesired, jlong lpsecurityattributes, jlong phkresult, jlong lpdwdisposition, jlong htransaction, jlong pextendedparemeter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyTransactedA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)reserved, (void*)(uintptr_t)lpclass, (uint32_t)dwoptions, (uint32_t)samdesired, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)lpdwdisposition, (void*)(uintptr_t)htransaction, (void*)(uintptr_t)pextendedparemeter) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)htransaction;
    (void)pextendedparemeter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCreateKeyTransactedW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint reserved, jlong lpclass, jint dwoptions, jint samdesired, jlong lpsecurityattributes, jlong phkresult, jlong lpdwdisposition, jlong htransaction, jlong pextendedparemeter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyTransactedW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)reserved, (void*)(uintptr_t)lpclass, (uint32_t)dwoptions, (uint32_t)samdesired, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)lpdwdisposition, (void*)(uintptr_t)htransaction, (void*)(uintptr_t)pextendedparemeter) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)htransaction;
    (void)pextendedparemeter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegCreateKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteKeyExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint samdesired, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)samdesired, (uint32_t)reserved) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteKeyExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint samdesired, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)samdesired, (uint32_t)reserved) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteKeyTransactedA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint samdesired, jint reserved, jlong htransaction, jlong pextendedparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyTransactedA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)samdesired, (uint32_t)reserved, (void*)(uintptr_t)htransaction, (void*)(uintptr_t)pextendedparameter) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    (void)htransaction;
    (void)pextendedparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteKeyTransactedW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint samdesired, jint reserved, jlong htransaction, jlong pextendedparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyTransactedW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)samdesired, (uint32_t)reserved, (void*)(uintptr_t)htransaction, (void*)(uintptr_t)pextendedparameter) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    (void)htransaction;
    (void)pextendedparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteKeyValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpvaluename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpvaluename) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteKeyValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpvaluename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpvaluename) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteTreeA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteTreeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteTreeW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteTreeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpvaluename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpvaluename) : 0;
#else
    (void)hkey;
    (void)lpvaluename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDeleteValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpvaluename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpvaluename) : 0;
#else
    (void)hkey;
    (void)lpvaluename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDisablePredefinedCache(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisablePredefinedCache");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDisablePredefinedCacheEx(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisablePredefinedCacheEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegDisableReflectionKey(JNIEnv* km_env, jclass km_clazz, jlong hbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisableReflectionKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbase) : 0;
#else
    (void)hbase;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegEnableReflectionKey(JNIEnv* km_env, jclass km_clazz, jlong hbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnableReflectionKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbase) : 0;
#else
    (void)hbase;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegEnumKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong lpname, jint cchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)lpname, (uint32_t)cchname) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)cchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegEnumKeyExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong lpname, jlong lpcchname, jlong lpreserved, jlong lpclass, jlong lpcchclass, jlong lpftlastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpcchname, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lpclass, (void*)(uintptr_t)lpcchclass, (void*)(uintptr_t)lpftlastwritetime) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)lpcchname;
    (void)lpreserved;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpftlastwritetime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegEnumKeyExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong lpname, jlong lpcchname, jlong lpreserved, jlong lpclass, jlong lpcchclass, jlong lpftlastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpcchname, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lpclass, (void*)(uintptr_t)lpcchclass, (void*)(uintptr_t)lpftlastwritetime) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)lpcchname;
    (void)lpreserved;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpftlastwritetime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegEnumKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong lpname, jint cchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)lpname, (uint32_t)cchname) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)cchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegEnumValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong lpvaluename, jlong lpcchvaluename, jlong lpreserved, jlong lptype, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)lpvaluename, (void*)(uintptr_t)lpcchvaluename, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpvaluename;
    (void)lpcchvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegEnumValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong lpvaluename, jlong lpcchvaluename, jlong lpreserved, jlong lptype, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)lpvaluename, (void*)(uintptr_t)lpcchvaluename, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpvaluename;
    (void)lpcchvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegFlushKey(JNIEnv* km_env, jclass km_clazz, jlong hkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegFlushKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey) : 0;
#else
    (void)hkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegGetKeySecurity(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint securityinformation, jlong psecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetKeySecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor) : 0;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegGetValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpvalue, jint dwflags, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpvalue, (uint32_t)dwflags, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegGetValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpvalue, jint dwflags, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpvalue, (uint32_t)dwflags, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegLoadAppKeyA(JNIEnv* km_env, jclass km_clazz, jlong lpfile, jlong phkresult, jint samdesired, jint dwoptions, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadAppKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfile, (void*)(uintptr_t)phkresult, (uint32_t)samdesired, (uint32_t)dwoptions, (uint32_t)reserved) : 0;
#else
    (void)lpfile;
    (void)phkresult;
    (void)samdesired;
    (void)dwoptions;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegLoadAppKeyW(JNIEnv* km_env, jclass km_clazz, jlong lpfile, jlong phkresult, jint samdesired, jint dwoptions, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadAppKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfile, (void*)(uintptr_t)phkresult, (uint32_t)samdesired, (uint32_t)dwoptions, (uint32_t)reserved) : 0;
#else
    (void)lpfile;
    (void)phkresult;
    (void)samdesired;
    (void)dwoptions;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegLoadKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpfile) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegLoadKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpfile) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegLoadMUIStringA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszvalue, jlong pszoutbuf, jint cboutbuf, jlong pcbdata, jint flags, jlong pszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadMUIStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pszoutbuf, (uint32_t)cboutbuf, (void*)(uintptr_t)pcbdata, (uint32_t)flags, (void*)(uintptr_t)pszdirectory) : 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pszoutbuf;
    (void)cboutbuf;
    (void)pcbdata;
    (void)flags;
    (void)pszdirectory;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegLoadMUIStringW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszvalue, jlong pszoutbuf, jint cboutbuf, jlong pcbdata, jint flags, jlong pszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadMUIStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pszoutbuf, (uint32_t)cboutbuf, (void*)(uintptr_t)pcbdata, (uint32_t)flags, (void*)(uintptr_t)pszdirectory) : 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pszoutbuf;
    (void)cboutbuf;
    (void)pcbdata;
    (void)flags;
    (void)pszdirectory;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegNotifyChangeKeyValue(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint bwatchsubtree, jint dwnotifyfilter, jlong hevent, jint fasynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegNotifyChangeKeyValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (int32_t)bwatchsubtree, (uint32_t)dwnotifyfilter, (void*)(uintptr_t)hevent, (int32_t)fasynchronous) : 0;
#else
    (void)hkey;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    (void)hevent;
    (void)fasynchronous;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOpenCurrentUser(JNIEnv* km_env, jclass km_clazz, jint samdesired, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenCurrentUser");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)samdesired, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)samdesired;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOpenKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOpenKeyExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint uloptions, jint samdesired, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)uloptions, (uint32_t)samdesired, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOpenKeyExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint uloptions, jint samdesired, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)uloptions, (uint32_t)samdesired, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOpenKeyTransactedA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint uloptions, jint samdesired, jlong phkresult, jlong htransaction, jlong pextendedparemeter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyTransactedA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)uloptions, (uint32_t)samdesired, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)htransaction, (void*)(uintptr_t)pextendedparemeter) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    (void)htransaction;
    (void)pextendedparemeter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOpenKeyTransactedW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint uloptions, jint samdesired, jlong phkresult, jlong htransaction, jlong pextendedparemeter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyTransactedW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)uloptions, (uint32_t)samdesired, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)htransaction, (void*)(uintptr_t)pextendedparemeter) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    (void)htransaction;
    (void)pextendedparemeter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOpenKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOpenUserClassesRoot(JNIEnv* km_env, jclass km_clazz, jlong htoken, jint dwoptions, jint samdesired, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenUserClassesRoot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (uint32_t)dwoptions, (uint32_t)samdesired, (void*)(uintptr_t)phkresult) : 0;
#else
    (void)htoken;
    (void)dwoptions;
    (void)samdesired;
    (void)phkresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegOverridePredefKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong hnewhkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOverridePredefKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)hnewhkey) : 0;
#else
    (void)hkey;
    (void)hnewhkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryInfoKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpclass, jlong lpcchclass, jlong lpreserved, jlong lpcsubkeys, jlong lpcbmaxsubkeylen, jlong lpcbmaxclasslen, jlong lpcvalues, jlong lpcbmaxvaluenamelen, jlong lpcbmaxvaluelen, jlong lpcbsecuritydescriptor, jlong lpftlastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryInfoKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpclass, (void*)(uintptr_t)lpcchclass, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lpcsubkeys, (void*)(uintptr_t)lpcbmaxsubkeylen, (void*)(uintptr_t)lpcbmaxclasslen, (void*)(uintptr_t)lpcvalues, (void*)(uintptr_t)lpcbmaxvaluenamelen, (void*)(uintptr_t)lpcbmaxvaluelen, (void*)(uintptr_t)lpcbsecuritydescriptor, (void*)(uintptr_t)lpftlastwritetime) : 0;
#else
    (void)hkey;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpreserved;
    (void)lpcsubkeys;
    (void)lpcbmaxsubkeylen;
    (void)lpcbmaxclasslen;
    (void)lpcvalues;
    (void)lpcbmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryInfoKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpclass, jlong lpcchclass, jlong lpreserved, jlong lpcsubkeys, jlong lpcbmaxsubkeylen, jlong lpcbmaxclasslen, jlong lpcvalues, jlong lpcbmaxvaluenamelen, jlong lpcbmaxvaluelen, jlong lpcbsecuritydescriptor, jlong lpftlastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryInfoKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpclass, (void*)(uintptr_t)lpcchclass, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lpcsubkeys, (void*)(uintptr_t)lpcbmaxsubkeylen, (void*)(uintptr_t)lpcbmaxclasslen, (void*)(uintptr_t)lpcvalues, (void*)(uintptr_t)lpcbmaxvaluenamelen, (void*)(uintptr_t)lpcbmaxvaluelen, (void*)(uintptr_t)lpcbsecuritydescriptor, (void*)(uintptr_t)lpftlastwritetime) : 0;
#else
    (void)hkey;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpreserved;
    (void)lpcsubkeys;
    (void)lpcbmaxsubkeylen;
    (void)lpcbmaxclasslen;
    (void)lpcvalues;
    (void)lpcbmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryMultipleValuesA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong val_list, jint num_vals, jlong lpvaluebuf, jlong ldwtotsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryMultipleValuesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)val_list, (uint32_t)num_vals, (void*)(uintptr_t)lpvaluebuf, (void*)(uintptr_t)ldwtotsize) : 0;
#else
    (void)hkey;
    (void)val_list;
    (void)num_vals;
    (void)lpvaluebuf;
    (void)ldwtotsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryMultipleValuesW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong val_list, jint num_vals, jlong lpvaluebuf, jlong ldwtotsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryMultipleValuesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)val_list, (uint32_t)num_vals, (void*)(uintptr_t)lpvaluebuf, (void*)(uintptr_t)ldwtotsize) : 0;
#else
    (void)hkey;
    (void)val_list;
    (void)num_vals;
    (void)lpvaluebuf;
    (void)ldwtotsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryReflectionKey(JNIEnv* km_env, jclass km_clazz, jlong hbase, jlong bisreflectiondisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryReflectionKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbase, (void*)(uintptr_t)bisreflectiondisabled) : 0;
#else
    (void)hbase;
    (void)bisreflectiondisabled;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryValueExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpvaluename, jlong lpreserved, jlong lptype, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpvaluename, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryValueExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpvaluename, jlong lpreserved, jlong lptype, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpvaluename, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegQueryValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegRenameKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkeyname, jlong lpnewkeyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRenameKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkeyname, (void*)(uintptr_t)lpnewkeyname) : 0;
#else
    (void)hkey;
    (void)lpsubkeyname;
    (void)lpnewkeyname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegReplaceKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpnewfile, jlong lpoldfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegReplaceKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpnewfile, (void*)(uintptr_t)lpoldfile) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpnewfile;
    (void)lpoldfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegReplaceKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpnewfile, jlong lpoldfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegReplaceKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpnewfile, (void*)(uintptr_t)lpoldfile) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpnewfile;
    (void)lpoldfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegRestoreKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpfile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpfile, (uint32_t)dwflags) : 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegRestoreKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpfile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpfile, (uint32_t)dwflags) : 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSaveKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpfile, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpfile, (void*)(uintptr_t)lpsecurityattributes) : 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSaveKeyExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpfile, jlong lpsecurityattributes, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpfile, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)flags) : 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSaveKeyExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpfile, jlong lpsecurityattributes, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpfile, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)flags) : 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSaveKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpfile, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpfile, (void*)(uintptr_t)lpsecurityattributes) : 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSetKeySecurity(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeySecurity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : 0;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSetKeyValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpvaluename, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeyValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpvaluename, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSetKeyValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpvaluename, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeyValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpvaluename, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSetValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSetValueExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpvaluename, jint reserved, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpvaluename, (uint32_t)reserved, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)reserved;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSetValueExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpvaluename, jint reserved, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpvaluename, (uint32_t)reserved, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)reserved;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegSetValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegUnLoadKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegUnLoadKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_registry_WindowsWin32SystemRegistryJniBridge_windowssys_1windows_1win32_1system_1registry_1RegUnLoadKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegUnLoadKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey) : 0;
#else
    (void)hkey;
    (void)lpsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

