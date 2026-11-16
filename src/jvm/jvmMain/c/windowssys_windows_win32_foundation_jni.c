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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationCompareObjectHandles(JNIEnv* km_env, jclass km_clazz, jlong hfirstobjecthandle, jlong hsecondobjecthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-handle-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareObjectHandles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfirstobjecthandle, (void*)(uintptr_t)hsecondobjecthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfirstobjecthandle;
    (void)hsecondobjecthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationDuplicateHandle(JNIEnv* km_env, jclass km_clazz, jlong hsourceprocesshandle, jlong hsourcehandle, jlong htargetprocesshandle, jlong lptargethandle, jint dwdesiredaccess, jint binherithandle, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsourceprocesshandle, (void*)(uintptr_t)hsourcehandle, (void*)(uintptr_t)htargetprocesshandle, (void*)(uintptr_t)lptargethandle, (uint32_t)dwdesiredaccess, (int32_t)binherithandle, (uint32_t)dwoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsourceprocesshandle;
    (void)hsourcehandle;
    (void)htargetprocesshandle;
    (void)lptargethandle;
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationFreeLibrary(JNIEnv* km_env, jclass km_clazz, jlong hlibmodule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeLibrary");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlibmodule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlibmodule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationGetHandleInformation(JNIEnv* km_env, jclass km_clazz, jlong hobject, jlong lpdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHandleInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobject, (void*)(uintptr_t)lpdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)lpdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationGetLastError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLastError");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationGlobalFree(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFree");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmem);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hmem;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationLocalFree(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFree");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmem);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hmem;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationRtlNtStatusToDosError(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNtStatusToDosError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)status;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSetHandleInformation(JNIEnv* km_env, jclass km_clazz, jlong hobject, jint dwmask, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetHandleInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobject, (uint32_t)dwmask, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)dwmask;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSetLastError(JNIEnv* km_env, jclass km_clazz, jint dwerrcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLastError");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)dwerrcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwerrcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSetLastErrorEx(JNIEnv* km_env, jclass km_clazz, jint dwerrcode, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLastErrorEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)dwerrcode, (uint32_t)dwtype);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwerrcode;
    (void)dwtype;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysAddRefString(JNIEnv* km_env, jclass km_clazz, jlong bstrstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAddRefString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bstrstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bstrstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysAllocString(JNIEnv* km_env, jclass km_clazz, jlong psz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocString");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psz);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)psz;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysAllocStringByteLen(JNIEnv* km_env, jclass km_clazz, jlong psz, jint len) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocStringByteLen");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psz, (uint32_t)len);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)psz;
    (void)len;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysAllocStringLen(JNIEnv* km_env, jclass km_clazz, jlong strin, jint ui) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocStringLen");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)ui);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)strin;
    (void)ui;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysFreeString(JNIEnv* km_env, jclass km_clazz, jlong bstrstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysFreeString");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bstrstring);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bstrstring;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysReAllocString(JNIEnv* km_env, jclass km_clazz, jlong pbstr, jlong psz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReAllocString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbstr, (void*)(uintptr_t)psz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbstr;
    (void)psz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysReAllocStringLen(JNIEnv* km_env, jclass km_clazz, jlong pbstr, jlong psz, jint len) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReAllocStringLen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbstr, (void*)(uintptr_t)psz, (uint32_t)len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbstr;
    (void)psz;
    (void)len;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysReleaseString(JNIEnv* km_env, jclass km_clazz, jlong bstrstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReleaseString");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bstrstring);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bstrstring;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysStringByteLen(JNIEnv* km_env, jclass km_clazz, jlong bstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysStringByteLen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bstr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bstr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssysWindowsWin32FoundationSysStringLen(JNIEnv* km_env, jclass km_clazz, jlong pbstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysStringLen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbstr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbstr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

