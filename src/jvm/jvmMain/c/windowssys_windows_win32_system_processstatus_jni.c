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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1EmptyWorkingSet(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EmptyWorkingSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1EnumDeviceDrivers(JNIEnv* km_env, jclass km_clazz, jlong lpimagebase, jint cb, jlong lpcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDeviceDrivers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpimagebase, (uint32_t)cb, (void*)(uintptr_t)lpcbneeded) : -1;
#else
    (void)lpimagebase;
    (void)cb;
    (void)lpcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1EnumPageFilesA(JNIEnv* km_env, jclass km_clazz, jlong pcallbackroutine, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPageFilesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcallbackroutine, (void*)(uintptr_t)pcontext) : -1;
#else
    (void)pcallbackroutine;
    (void)pcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1EnumPageFilesW(JNIEnv* km_env, jclass km_clazz, jlong pcallbackroutine, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPageFilesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcallbackroutine, (void*)(uintptr_t)pcontext) : -1;
#else
    (void)pcallbackroutine;
    (void)pcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1EnumProcessModules(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lphmodule, jint cb, jlong lpcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProcessModules");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lphmodule, (uint32_t)cb, (void*)(uintptr_t)lpcbneeded) : -1;
#else
    (void)hprocess;
    (void)lphmodule;
    (void)cb;
    (void)lpcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1EnumProcessModulesEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lphmodule, jint cb, jlong lpcbneeded, jint dwfilterflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProcessModulesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lphmodule, (uint32_t)cb, (void*)(uintptr_t)lpcbneeded, (uint32_t)dwfilterflag) : -1;
#else
    (void)hprocess;
    (void)lphmodule;
    (void)cb;
    (void)lpcbneeded;
    (void)dwfilterflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1EnumProcesses(JNIEnv* km_env, jclass km_clazz, jlong lpidprocess, jint cb, jlong lpcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProcesses");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpidprocess, (uint32_t)cb, (void*)(uintptr_t)lpcbneeded) : -1;
#else
    (void)lpidprocess;
    (void)cb;
    (void)lpcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetDeviceDriverBaseNameA(JNIEnv* km_env, jclass km_clazz, jlong imagebase, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceDriverBaseNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagebase, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetDeviceDriverBaseNameW(JNIEnv* km_env, jclass km_clazz, jlong imagebase, jlong lpbasename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceDriverBaseNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagebase, (void*)(uintptr_t)lpbasename, (uint32_t)nsize) : 0;
#else
    (void)imagebase;
    (void)lpbasename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetDeviceDriverFileNameA(JNIEnv* km_env, jclass km_clazz, jlong imagebase, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceDriverFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagebase, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetDeviceDriverFileNameW(JNIEnv* km_env, jclass km_clazz, jlong imagebase, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceDriverFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagebase, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetMappedFileNameA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpv, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMappedFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpv, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)lpv;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetMappedFileNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpv, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMappedFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpv, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)lpv;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetModuleBaseNameA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpbasename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleBaseNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpbasename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpbasename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetModuleBaseNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpbasename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleBaseNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpbasename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpbasename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetModuleFileNameExA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleFileNameExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetModuleFileNameExW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleFileNameExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetModuleInformation(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpmodinfo, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpmodinfo, (uint32_t)cb) : -1;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpmodinfo;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetPerformanceInfo(JNIEnv* km_env, jclass km_clazz, jlong pperformanceinformation, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerformanceInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pperformanceinformation, (uint32_t)cb) : -1;
#else
    (void)pperformanceinformation;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetProcessImageFileNameA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpimagefilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessImageFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpimagefilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)lpimagefilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetProcessImageFileNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpimagefilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessImageFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpimagefilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)lpimagefilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetProcessMemoryInfo(JNIEnv* km_env, jclass km_clazz, jlong process, jlong ppsmemcounters, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessMemoryInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)ppsmemcounters, (uint32_t)cb) : -1;
#else
    (void)process;
    (void)ppsmemcounters;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetWsChanges(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpwatchinfo, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWsChanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpwatchinfo, (uint32_t)cb) : -1;
#else
    (void)hprocess;
    (void)lpwatchinfo;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1GetWsChangesEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpwatchinfoex, jlong cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWsChangesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpwatchinfoex, (void*)(uintptr_t)cb) : -1;
#else
    (void)hprocess;
    (void)lpwatchinfoex;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1InitializeProcessForWsWatch(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeProcessForWsWatch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32EmptyWorkingSet(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EmptyWorkingSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32EnumDeviceDrivers(JNIEnv* km_env, jclass km_clazz, jlong lpimagebase, jint cb, jlong lpcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumDeviceDrivers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpimagebase, (uint32_t)cb, (void*)(uintptr_t)lpcbneeded) : -1;
#else
    (void)lpimagebase;
    (void)cb;
    (void)lpcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32EnumPageFilesA(JNIEnv* km_env, jclass km_clazz, jlong pcallbackroutine, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumPageFilesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcallbackroutine, (void*)(uintptr_t)pcontext) : -1;
#else
    (void)pcallbackroutine;
    (void)pcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32EnumPageFilesW(JNIEnv* km_env, jclass km_clazz, jlong pcallbackroutine, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumPageFilesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcallbackroutine, (void*)(uintptr_t)pcontext) : -1;
#else
    (void)pcallbackroutine;
    (void)pcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32EnumProcessModules(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lphmodule, jint cb, jlong lpcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumProcessModules");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lphmodule, (uint32_t)cb, (void*)(uintptr_t)lpcbneeded) : -1;
#else
    (void)hprocess;
    (void)lphmodule;
    (void)cb;
    (void)lpcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32EnumProcessModulesEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lphmodule, jint cb, jlong lpcbneeded, jint dwfilterflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumProcessModulesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lphmodule, (uint32_t)cb, (void*)(uintptr_t)lpcbneeded, (uint32_t)dwfilterflag) : -1;
#else
    (void)hprocess;
    (void)lphmodule;
    (void)cb;
    (void)lpcbneeded;
    (void)dwfilterflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32EnumProcesses(JNIEnv* km_env, jclass km_clazz, jlong lpidprocess, jint cb, jlong lpcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumProcesses");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpidprocess, (uint32_t)cb, (void*)(uintptr_t)lpcbneeded) : -1;
#else
    (void)lpidprocess;
    (void)cb;
    (void)lpcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetDeviceDriverBaseNameA(JNIEnv* km_env, jclass km_clazz, jlong imagebase, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetDeviceDriverBaseNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagebase, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetDeviceDriverBaseNameW(JNIEnv* km_env, jclass km_clazz, jlong imagebase, jlong lpbasename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetDeviceDriverBaseNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagebase, (void*)(uintptr_t)lpbasename, (uint32_t)nsize) : 0;
#else
    (void)imagebase;
    (void)lpbasename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetDeviceDriverFileNameA(JNIEnv* km_env, jclass km_clazz, jlong imagebase, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetDeviceDriverFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagebase, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetDeviceDriverFileNameW(JNIEnv* km_env, jclass km_clazz, jlong imagebase, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetDeviceDriverFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imagebase, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetMappedFileNameA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpv, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetMappedFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpv, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)lpv;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetMappedFileNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpv, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetMappedFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpv, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)lpv;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetModuleBaseNameA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpbasename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleBaseNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpbasename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpbasename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetModuleBaseNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpbasename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleBaseNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpbasename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpbasename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetModuleFileNameExA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleFileNameExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetModuleFileNameExW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleFileNameExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpfilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetModuleInformation(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong hmodule, jlong lpmodinfo, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpmodinfo, (uint32_t)cb) : -1;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpmodinfo;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetPerformanceInfo(JNIEnv* km_env, jclass km_clazz, jlong pperformanceinformation, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetPerformanceInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pperformanceinformation, (uint32_t)cb) : -1;
#else
    (void)pperformanceinformation;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetProcessImageFileNameA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpimagefilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetProcessImageFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpimagefilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)lpimagefilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetProcessImageFileNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpimagefilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetProcessImageFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpimagefilename, (uint32_t)nsize) : 0;
#else
    (void)hprocess;
    (void)lpimagefilename;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetProcessMemoryInfo(JNIEnv* km_env, jclass km_clazz, jlong process, jlong ppsmemcounters, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetProcessMemoryInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)ppsmemcounters, (uint32_t)cb) : -1;
#else
    (void)process;
    (void)ppsmemcounters;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetWsChanges(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpwatchinfo, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetWsChanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpwatchinfo, (uint32_t)cb) : -1;
#else
    (void)hprocess;
    (void)lpwatchinfo;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32GetWsChangesEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpwatchinfoex, jlong cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetWsChangesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpwatchinfoex, (void*)(uintptr_t)cb) : -1;
#else
    (void)hprocess;
    (void)lpwatchinfoex;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32InitializeProcessForWsWatch(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32InitializeProcessForWsWatch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess) : -1;
#else
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32QueryWorkingSet(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32QueryWorkingSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pv, (uint32_t)cb) : -1;
#else
    (void)hprocess;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1K32QueryWorkingSetEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32QueryWorkingSetEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pv, (uint32_t)cb) : -1;
#else
    (void)hprocess;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1QueryWorkingSet(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryWorkingSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pv, (uint32_t)cb) : -1;
#else
    (void)hprocess;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_processstatus_WindowsWin32SystemProcessstatusJniBridge_windowssys_1windows_1win32_1system_1processstatus_1QueryWorkingSetEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryWorkingSetEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pv, (uint32_t)cb) : -1;
#else
    (void)hprocess;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

