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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1CloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobject) : -1;
#else
    (void)hobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1CompareObjectHandles(JNIEnv* km_env, jclass km_clazz, jlong hfirstobjecthandle, jlong hsecondobjecthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-handle-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareObjectHandles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfirstobjecthandle, (void*)(uintptr_t)hsecondobjecthandle) : -1;
#else
    (void)hfirstobjecthandle;
    (void)hsecondobjecthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1DuplicateHandle(JNIEnv* km_env, jclass km_clazz, jlong hsourceprocesshandle, jlong hsourcehandle, jlong htargetprocesshandle, jlong lptargethandle, jint dwdesiredaccess, jint binherithandle, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsourceprocesshandle, (void*)(uintptr_t)hsourcehandle, (void*)(uintptr_t)htargetprocesshandle, (void*)(uintptr_t)lptargethandle, (uint32_t)dwdesiredaccess, (int32_t)binherithandle, (uint32_t)dwoptions) : -1;
#else
    (void)hsourceprocesshandle;
    (void)hsourcehandle;
    (void)htargetprocesshandle;
    (void)lptargethandle;
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1FreeLibrary(JNIEnv* km_env, jclass km_clazz, jlong hlibmodule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeLibrary");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlibmodule) : -1;
#else
    (void)hlibmodule;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1GetHandleInformation(JNIEnv* km_env, jclass km_clazz, jlong hobject, jlong lpdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHandleInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobject, (void*)(uintptr_t)lpdwflags) : -1;
#else
    (void)hobject;
    (void)lpdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1GetLastError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLastError");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1GlobalFree(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFree");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : NULL;
#else
    (void)hmem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1LocalFree(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFree");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : NULL;
#else
    (void)hmem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1RtlNtStatusToDosError(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNtStatusToDosError");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)status) : 0;
#else
    (void)status;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SetHandleInformation(JNIEnv* km_env, jclass km_clazz, jlong hobject, jint dwmask, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetHandleInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobject, (uint32_t)dwmask, (uint32_t)dwflags) : -1;
#else
    (void)hobject;
    (void)dwmask;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SetLastError(JNIEnv* km_env, jclass km_clazz, jint dwerrcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLastError");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwerrcode);
#else
    (void)dwerrcode;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SetLastErrorEx(JNIEnv* km_env, jclass km_clazz, jint dwerrcode, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLastErrorEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwerrcode, (uint32_t)dwtype);
#else
    (void)dwerrcode;
    (void)dwtype;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysAddRefString(JNIEnv* km_env, jclass km_clazz, jlong bstrstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAddRefString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bstrstring) : -1;
#else
    (void)bstrstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysAllocString(JNIEnv* km_env, jclass km_clazz, jlong psz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocString");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz) : NULL;
#else
    (void)psz;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysAllocStringByteLen(JNIEnv* km_env, jclass km_clazz, jlong psz, jint len) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocStringByteLen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (uint32_t)len) : NULL;
#else
    (void)psz;
    (void)len;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysAllocStringLen(JNIEnv* km_env, jclass km_clazz, jlong strin, jint ui) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocStringLen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)ui) : NULL;
#else
    (void)strin;
    (void)ui;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysFreeString(JNIEnv* km_env, jclass km_clazz, jlong bstrstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysFreeString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bstrstring);
#else
    (void)bstrstring;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysReAllocString(JNIEnv* km_env, jclass km_clazz, jlong pbstr, jlong psz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReAllocString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbstr, (void*)(uintptr_t)psz) : -1;
#else
    (void)pbstr;
    (void)psz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysReAllocStringLen(JNIEnv* km_env, jclass km_clazz, jlong pbstr, jlong psz, jint len) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReAllocStringLen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbstr, (void*)(uintptr_t)psz, (uint32_t)len) : -1;
#else
    (void)pbstr;
    (void)psz;
    (void)len;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysReleaseString(JNIEnv* km_env, jclass km_clazz, jlong bstrstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReleaseString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bstrstring);
#else
    (void)bstrstring;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysStringByteLen(JNIEnv* km_env, jclass km_clazz, jlong bstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysStringByteLen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bstr) : 0;
#else
    (void)bstr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_foundation_WindowsWin32FoundationJniBridge_windowssys_1windows_1win32_1foundation_1SysStringLen(JNIEnv* km_env, jclass km_clazz, jlong pbstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysStringLen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbstr) : 0;
#else
    (void)pbstr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

