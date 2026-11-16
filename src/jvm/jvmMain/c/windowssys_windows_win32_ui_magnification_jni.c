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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagGetColorEffect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong peffect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetColorEffect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)peffect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)peffect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(JNIEnv* km_env, jclass km_clazz, jlong peffect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetFullscreenColorEffect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)peffect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)peffect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(JNIEnv* km_env, jclass km_clazz, jlong pmaglevel, jlong pxoffset, jlong pyoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetFullscreenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmaglevel, (void*)(uintptr_t)pxoffset, (void*)(uintptr_t)pyoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmaglevel;
    (void)pxoffset;
    (void)pyoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagGetImageScalingCallback(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetImageScalingCallback");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagGetInputTransform(JNIEnv* km_env, jclass km_clazz, jlong pfenabled, jlong prectsource, jlong prectdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetInputTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfenabled, (void*)(uintptr_t)prectsource, (void*)(uintptr_t)prectdest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfenabled;
    (void)prectsource;
    (void)prectdest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagGetWindowFilterList(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pdwfiltermode, jint count, jlong phwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetWindowFilterList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pdwfiltermode, (int32_t)count, (void*)(uintptr_t)phwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pdwfiltermode;
    (void)count;
    (void)phwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagGetWindowSource(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong prect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetWindowSource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)prect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)prect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagGetWindowTransform(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ptransform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagGetWindowTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ptransform);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)ptransform;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagInitialize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagInitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagSetColorEffect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong peffect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetColorEffect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)peffect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)peffect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(JNIEnv* km_env, jclass km_clazz, jlong peffect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetFullscreenColorEffect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)peffect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)peffect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(JNIEnv* km_env, jclass km_clazz, jfloat maglevel, jint xoffset, jint yoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetFullscreenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)maglevel, (int32_t)xoffset, (int32_t)yoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)maglevel;
    (void)xoffset;
    (void)yoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetImageScalingCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagSetInputTransform(JNIEnv* km_env, jclass km_clazz, jint fenabled, jlong prectsource, jlong prectdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetInputTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fenabled, (void*)(uintptr_t)prectsource, (void*)(uintptr_t)prectdest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fenabled;
    (void)prectsource;
    (void)prectdest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagSetWindowFilterList(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwfiltermode, jint count, jlong phwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetWindowFilterList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwfiltermode, (int32_t)count, (void*)(uintptr_t)phwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)dwfiltermode;
    (void)count;
    (void)phwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagSetWindowTransform(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ptransform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagSetWindowTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ptransform);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)ptransform;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagShowSystemCursor(JNIEnv* km_env, jclass km_clazz, jint fshowcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagShowSystemCursor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fshowcursor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fshowcursor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_magnification_WindowsWin32UiMagnificationJniBridge_windowssysWindowsWin32UiMagnificationMagUninitialize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("magnification.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MagUninitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

