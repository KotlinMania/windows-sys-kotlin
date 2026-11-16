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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netshell_WindowsWin32NetworkmanagementNetshellJniBridge_windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong pwcarg, jint dwnumarg, jlong penumtable, jlong pdwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MatchEnumTag");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)pwcarg, (uint32_t)dwnumarg, (void*)(uintptr_t)penumtable, (void*)(uintptr_t)pdwvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmodule;
    (void)pwcarg;
    (void)dwnumarg;
    (void)penumtable;
    (void)pdwvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netshell_WindowsWin32NetworkmanagementNetshellJniBridge_windowssysWindowsWin32NetworkmanagementNetshellMatchToken(JNIEnv* km_env, jclass km_clazz, jlong pwszusertoken, jlong pwszcmdtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MatchToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszusertoken, (void*)(uintptr_t)pwszcmdtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszusertoken;
    (void)pwszcmdtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netshell_WindowsWin32NetworkmanagementNetshellJniBridge_windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong ppwcarguments, jint dwcurrentindex, jint dwargcount, jlong ptttags, jint dwtagcount, jint dwminargs, jint dwmaxargs, jlong pdwtagtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PreprocessCommand");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)ppwcarguments, (uint32_t)dwcurrentindex, (uint32_t)dwargcount, (void*)(uintptr_t)ptttags, (uint32_t)dwtagcount, (uint32_t)dwminargs, (uint32_t)dwmaxargs, (void*)(uintptr_t)pdwtagtype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmodule;
    (void)ppwcarguments;
    (void)dwcurrentindex;
    (void)dwargcount;
    (void)ptttags;
    (void)dwtagcount;
    (void)dwminargs;
    (void)dwmaxargs;
    (void)pdwtagtype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netshell_WindowsWin32NetworkmanagementNetshellJniBridge_windowssysWindowsWin32NetworkmanagementNetshellPrintError(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jint dwerrid, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintError");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwerrid); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwerrid, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwerrid, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwerrid, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwerrid, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)hmodule;
    (void)dwerrid;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netshell_WindowsWin32NetworkmanagementNetshellJniBridge_windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(JNIEnv* km_env, jclass km_clazz, jlong pwszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintMessage");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)pwszformat); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)pwszformat, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)pwszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)pwszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)pwszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netshell_WindowsWin32NetworkmanagementNetshellJniBridge_windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jint dwmsgid, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintMessageFromModule");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwmsgid); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwmsgid, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwmsgid, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwmsgid, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwmsgid, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)hmodule;
    (void)dwmsgid;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netshell_WindowsWin32NetworkmanagementNetshellJniBridge_windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(JNIEnv* km_env, jclass km_clazz, jlong pchildcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterContext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchildcontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pchildcontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netshell_WindowsWin32NetworkmanagementNetshellJniBridge_windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(JNIEnv* km_env, jclass km_clazz, jlong pguidparentcontext, jlong pfnregistersubcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netsh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterHelper");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pguidparentcontext, (void*)(uintptr_t)pfnregistersubcontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pguidparentcontext;
    (void)pfnregistersubcontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

