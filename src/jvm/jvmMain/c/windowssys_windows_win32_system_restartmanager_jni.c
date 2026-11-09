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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmAddFilter(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle, jlong strmodulename, jlong pprocess, jlong strserviceshortname, jint filteraction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmAddFilter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle, (void*)(uintptr_t)strmodulename, (void*)(uintptr_t)pprocess, (void*)(uintptr_t)strserviceshortname, (int32_t)filteraction) : 0;
#else
    (void)dwsessionhandle;
    (void)strmodulename;
    (void)pprocess;
    (void)strserviceshortname;
    (void)filteraction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmCancelCurrentTask(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmCancelCurrentTask");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle) : 0;
#else
    (void)dwsessionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmEndSession(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmEndSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle) : 0;
#else
    (void)dwsessionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmGetFilterList(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle, jlong pbfilterbuf, jint cbfilterbuf, jlong cbfilterbufneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmGetFilterList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle, (void*)(uintptr_t)pbfilterbuf, (uint32_t)cbfilterbuf, (void*)(uintptr_t)cbfilterbufneeded) : 0;
#else
    (void)dwsessionhandle;
    (void)pbfilterbuf;
    (void)cbfilterbuf;
    (void)cbfilterbufneeded;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmGetList(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle, jlong pnprocinfoneeded, jlong pnprocinfo, jlong rgaffectedapps, jlong lpdwrebootreasons) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmGetList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle, (void*)(uintptr_t)pnprocinfoneeded, (void*)(uintptr_t)pnprocinfo, (void*)(uintptr_t)rgaffectedapps, (void*)(uintptr_t)lpdwrebootreasons) : 0;
#else
    (void)dwsessionhandle;
    (void)pnprocinfoneeded;
    (void)pnprocinfo;
    (void)rgaffectedapps;
    (void)lpdwrebootreasons;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmJoinSession(JNIEnv* km_env, jclass km_clazz, jlong psessionhandle, jlong strsessionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmJoinSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psessionhandle, (void*)(uintptr_t)strsessionkey) : 0;
#else
    (void)psessionhandle;
    (void)strsessionkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmRegisterResources(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle, jint nfiles, jlong rgsfilenames, jint napplications, jlong rgapplications, jint nservices, jlong rgsservicenames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmRegisterResources");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle, (uint32_t)nfiles, (void*)(uintptr_t)rgsfilenames, (uint32_t)napplications, (void*)(uintptr_t)rgapplications, (uint32_t)nservices, (void*)(uintptr_t)rgsservicenames) : 0;
#else
    (void)dwsessionhandle;
    (void)nfiles;
    (void)rgsfilenames;
    (void)napplications;
    (void)rgapplications;
    (void)nservices;
    (void)rgsservicenames;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmRemoveFilter(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle, jlong strmodulename, jlong pprocess, jlong strserviceshortname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmRemoveFilter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle, (void*)(uintptr_t)strmodulename, (void*)(uintptr_t)pprocess, (void*)(uintptr_t)strserviceshortname) : 0;
#else
    (void)dwsessionhandle;
    (void)strmodulename;
    (void)pprocess;
    (void)strserviceshortname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmRestart(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle, jint dwrestartflags, jlong fnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmRestart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle, (uint32_t)dwrestartflags, (void*)(uintptr_t)fnstatus) : 0;
#else
    (void)dwsessionhandle;
    (void)dwrestartflags;
    (void)fnstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmShutdown(JNIEnv* km_env, jclass km_clazz, jint dwsessionhandle, jint lactionflags, jlong fnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmShutdown");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsessionhandle, (uint32_t)lactionflags, (void*)(uintptr_t)fnstatus) : 0;
#else
    (void)dwsessionhandle;
    (void)lactionflags;
    (void)fnstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_restartmanager_WindowsWin32SystemRestartmanagerJniBridge_windowssys_1windows_1win32_1system_1restartmanager_1RmStartSession(JNIEnv* km_env, jclass km_clazz, jlong psessionhandle, jint dwsessionflags, jlong strsessionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmStartSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psessionhandle, (uint32_t)dwsessionflags, (void*)(uintptr_t)strsessionkey) : 0;
#else
    (void)psessionhandle;
    (void)dwsessionflags;
    (void)strsessionkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

