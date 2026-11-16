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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalBstrUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BSTR_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalBstrUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BSTR_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalBstrUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BSTR_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalBstrUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BSTR_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalBstrUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BSTR_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalBstrUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BSTR_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BSTR_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BSTR_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalClipformatUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPFORMAT_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalClipformatUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPFORMAT_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalClipformatUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPFORMAT_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPFORMAT_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalClipformatUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPFORMAT_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalClipformatUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPFORMAT_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPFORMAT_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPFORMAT_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(JNIEnv* km_env, jclass km_clazz, jlong pulsize, jlong riid, jlong punk, jint dwdestcontext, jlong pvdestcontext, jint mshlflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetMarshalSizeMax");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulsize, (void*)(uintptr_t)riid, (void*)(uintptr_t)punk, (uint32_t)dwdestcontext, (void*)(uintptr_t)pvdestcontext, (uint32_t)mshlflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pulsize;
    (void)riid;
    (void)punk;
    (void)dwdestcontext;
    (void)pvdestcontext;
    (void)mshlflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong punk, jint dwdestcontext, jlong pvdestcontext, jint mshlflags, jlong ppmarshal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetStandardMarshal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)punk, (uint32_t)dwdestcontext, (void*)(uintptr_t)pvdestcontext, (uint32_t)mshlflags, (void*)(uintptr_t)ppmarshal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)riid;
    (void)punk;
    (void)dwdestcontext;
    (void)pvdestcontext;
    (void)mshlflags;
    (void)ppmarshal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(JNIEnv* km_env, jclass km_clazz, jlong punkouter, jint smexflags, jlong ppunkinner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetStdMarshalEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punkouter, (uint32_t)smexflags, (void*)(uintptr_t)ppunkinner);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punkouter;
    (void)smexflags;
    (void)ppunkinner;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoMarshalHresult(JNIEnv* km_env, jclass km_clazz, jlong pstm, jint hresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoMarshalHresult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstm, (int32_t)hresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)hresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong punk, jlong ppstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoMarshalInterThreadInterfaceInStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)punk, (void*)(uintptr_t)ppstm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)riid;
    (void)punk;
    (void)ppstm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoMarshalInterface(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong riid, jlong punk, jint dwdestcontext, jlong pvdestcontext, jint mshlflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoMarshalInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)riid, (void*)(uintptr_t)punk, (uint32_t)dwdestcontext, (void*)(uintptr_t)pvdestcontext, (uint32_t)mshlflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)riid;
    (void)punk;
    (void)dwdestcontext;
    (void)pvdestcontext;
    (void)mshlflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(JNIEnv* km_env, jclass km_clazz, jlong pstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoReleaseMarshalData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong phresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoUnmarshalHresult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)phresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)phresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoUnmarshalInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHaccelUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HACCEL_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHaccelUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HACCEL_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHaccelUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HACCEL_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HACCEL_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHaccelUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HACCEL_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHaccelUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HACCEL_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HACCEL_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HACCEL_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHbitmapUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HBITMAP_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHbitmapUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HBITMAP_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HBITMAP_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HBITMAP_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHbitmapUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HBITMAP_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHbitmapUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HBITMAP_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HBITMAP_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HBITMAP_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHdcUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HDC_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHdcUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HDC_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHdcUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HDC_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHdcUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HDC_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHdcUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HDC_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHdcUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HDC_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HDC_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HDC_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHglobalUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HGLOBAL_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHglobalUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HGLOBAL_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHglobalUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HGLOBAL_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HGLOBAL_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHglobalUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HGLOBAL_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHglobalUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HGLOBAL_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HGLOBAL_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HGLOBAL_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHiconUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HICON_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHiconUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HICON_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHiconUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HICON_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHiconUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HICON_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHiconUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HICON_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHiconUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HICON_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HICON_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HICON_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHmenuUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMENU_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHmenuUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMENU_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHmenuUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMENU_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMENU_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHmenuUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMENU_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHmenuUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMENU_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMENU_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMENU_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHpaletteUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HPALETTE_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHpaletteUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HPALETTE_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HPALETTE_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HPALETTE_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHpaletteUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HPALETTE_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHpaletteUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HPALETTE_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HPALETTE_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HPALETTE_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHwndUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HWND_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHwndUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HWND_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHwndUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HWND_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHwndUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HWND_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHwndUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HWND_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHwndUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HWND_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HWND_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HWND_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPSAFEARRAY_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPSAFEARRAY_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPSAFEARRAY_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPSAFEARRAY_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPSAFEARRAY_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPSAFEARRAY_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPSAFEARRAY_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPSAFEARRAY_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalSnbUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SNB_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalSnbUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SNB_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalSnbUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SNB_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalSnbUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SNB_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalSnbUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SNB_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalSnbUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SNB_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SNB_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SNB_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalStgmediumUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STGMEDIUM_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalStgmediumUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STGMEDIUM_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STGMEDIUM_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STGMEDIUM_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalStgmediumUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STGMEDIUM_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalStgmediumUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STGMEDIUM_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STGMEDIUM_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_marshal_WindowsWin32SystemComMarshalJniBridge_windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STGMEDIUM_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

