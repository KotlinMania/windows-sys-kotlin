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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathArc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathArcI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat x3, jfloat y3, jfloat x4, jfloat y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBezier");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (float)x1, (float)y1, (float)x2, (float)y2, (float)x3, (float)y3, (float)x4, (float)y4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBezierI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)x3, (int32_t)y3, (int32_t)x4, (int32_t)y4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBeziers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBeziersI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurveI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (int32_t)offset, (int32_t)numberofsegments, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve3I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (int32_t)offset, (int32_t)numberofsegments, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurveI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathEllipse");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (float)width, (float)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathEllipseI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (float)x1, (float)y1, (float)x2, (float)y2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLineI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong addingpath, jint arg2Connect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)addingpath, (int32_t)arg2Connect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)addingpath;
    (void)arg2Connect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPie");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPieI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPolygon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPolygonI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (float)width, (float)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangleI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(JNIEnv* km_env, jclass km_clazz, jlong path, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)rects, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectanglesI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)rects, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathString(JNIEnv* km_env, jclass km_clazz, jlong path, jlong string, jint length, jlong family, jint style, jfloat emsize, jlong layoutrect, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)family, (int32_t)style, (float)emsize, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)string;
    (void)length;
    (void)family;
    (void)style;
    (void)emsize;
    (void)layoutrect;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong string, jint length, jlong family, jint style, jfloat emsize, jlong layoutrect, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathStringI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)family, (int32_t)style, (float)emsize, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)string;
    (void)length;
    (void)family;
    (void)style;
    (void)emsize;
    (void)layoutrect;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipAlloc(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAlloc");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dstrect, jlong srcrect, jint unit, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)dstrect, (void*)(uintptr_t)srcrect, (int32_t)unit, (void*)(uintptr_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)dstrect;
    (void)srcrect;
    (void)unit;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainer2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dstrect, jlong srcrect, jint unit, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainerI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)dstrect, (void*)(uintptr_t)srcrect, (int32_t)unit, (void*)(uintptr_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)dstrect;
    (void)srcrect;
    (void)unit;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong effect, jlong roi, jint useauxdata, jlong auxdata, jlong auxdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapApplyEffect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)effect, (void*)(uintptr_t)roi, (int32_t)useauxdata, (void*)(uintptr_t)auxdata, (void*)(uintptr_t)auxdatasize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)effect;
    (void)roi;
    (void)useauxdata;
    (void)auxdata;
    (void)auxdatasize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(JNIEnv* km_env, jclass km_clazz, jlong pinputbitmap, jint format, jint dithertype, jint palettetype, jlong palette, jfloat alphathresholdpercent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapConvertFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinputbitmap, (int32_t)format, (int32_t)dithertype, (int32_t)palettetype, (void*)(uintptr_t)palette, (float)alphathresholdpercent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinputbitmap;
    (void)format;
    (void)dithertype;
    (void)palettetype;
    (void)palette;
    (void)alphathresholdpercent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(JNIEnv* km_env, jclass km_clazz, jlong inputbitmaps, jint numinputs, jlong effect, jlong roi, jlong outputrect, jlong outputbitmap, jint useauxdata, jlong auxdata, jlong auxdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapCreateApplyEffect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inputbitmaps, (int32_t)numinputs, (void*)(uintptr_t)effect, (void*)(uintptr_t)roi, (void*)(uintptr_t)outputrect, (void*)(uintptr_t)outputbitmap, (int32_t)useauxdata, (void*)(uintptr_t)auxdata, (void*)(uintptr_t)auxdatasize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inputbitmaps;
    (void)numinputs;
    (void)effect;
    (void)roi;
    (void)outputrect;
    (void)outputbitmap;
    (void)useauxdata;
    (void)auxdata;
    (void)auxdatasize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint format, jint numberofentries, jlong channel0, jlong channel1, jlong channel2, jlong channel3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetHistogram");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (int32_t)format, (uint32_t)numberofentries, (void*)(uintptr_t)channel0, (void*)(uintptr_t)channel1, (void*)(uintptr_t)channel2, (void*)(uintptr_t)channel3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)format;
    (void)numberofentries;
    (void)channel0;
    (void)channel1;
    (void)channel2;
    (void)channel3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(JNIEnv* km_env, jclass km_clazz, jint format, jlong numberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetHistogramSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)format, (void*)(uintptr_t)numberofentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)numberofentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint x, jint y, jlong color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetPixel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (int32_t)x, (int32_t)y, (void*)(uintptr_t)color);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong rect, jint flags, jint format, jlong lockedbitmapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapLockBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)rect, (uint32_t)flags, (int32_t)format, (void*)(uintptr_t)lockedbitmapdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)rect;
    (void)flags;
    (void)format;
    (void)lockedbitmapdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint x, jint y, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapSetPixel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (int32_t)x, (int32_t)y, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jfloat xdpi, jfloat ydpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapSetResolution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (float)xdpi, (float)ydpi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)xdpi;
    (void)ydpi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong lockedbitmapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapUnlockBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)lockedbitmapdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)lockedbitmapdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClearPathMarkers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat width, jfloat height, jint format, jlong srcbitmap, jlong dstbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, float, float, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBitmapArea");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)x, (float)y, (float)width, (float)height, (int32_t)format, (void*)(uintptr_t)srcbitmap, (void*)(uintptr_t)dstbitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)srcbitmap;
    (void)dstbitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint width, jint height, jint format, jlong srcbitmap, jlong dstbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBitmapAreaI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (int32_t)format, (void*)(uintptr_t)srcbitmap, (void*)(uintptr_t)dstbitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)srcbitmap;
    (void)dstbitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong clonebrush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBrush");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)clonebrush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)clonebrush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong clonedcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneCustomLineCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)clonedcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)clonedcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneFont(JNIEnv* km_env, jclass km_clazz, jlong font, jlong clonefont) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneFont");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)clonefont);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)clonefont;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(JNIEnv* km_env, jclass km_clazz, jlong fontfamily, jlong clonedfontfamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneFontFamily");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontfamily, (void*)(uintptr_t)clonedfontfamily);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontfamily;
    (void)clonedfontfamily;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneImage(JNIEnv* km_env, jclass km_clazz, jlong image, jlong cloneimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneImage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)cloneimage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)cloneimage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jlong cloneimageattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneImageAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (void*)(uintptr_t)cloneimageattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)cloneimageattr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong clonematrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)clonematrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)clonematrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipClonePath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong clonepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClonePath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)clonepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)clonepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipClonePen(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong clonepen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClonePen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)clonepen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)clonepen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong cloneregion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)cloneregion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)cloneregion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(JNIEnv* km_env, jclass km_clazz, jlong format, jlong newformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneStringFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)newformat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)newformat;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClosePathFigure");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClosePathFigures");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(JNIEnv* km_env, jclass km_clazz, jlong region, jlong path, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)path, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)path;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rect, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)rect, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)rect;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rect, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)rect, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)rect;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong region2, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)region2, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)region2;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipComment(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint sizedata, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipComment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)sizedata, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)sizedata;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jint emftype, jlong description, jlong outMetafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)refgraphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)conversionfailureflag, (int32_t)emftype, (void*)(uintptr_t)description, (void*)(uintptr_t)outMetafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)emftype;
    (void)description;
    (void)outMetafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jlong filename, jint emftype, jlong description, jlong outMetafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlusToFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)refgraphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)conversionfailureflag, (void*)(uintptr_t)filename, (int32_t)emftype, (void*)(uintptr_t)description, (void*)(uintptr_t)outMetafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)filename;
    (void)emftype;
    (void)description;
    (void)outMetafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jlong stream, jint emftype, jlong description, jlong outMetafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlusToStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)refgraphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)conversionfailureflag, (void*)(uintptr_t)stream, (int32_t)emftype, (void*)(uintptr_t)description, (void*)(uintptr_t)outMetafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)stream;
    (void)emftype;
    (void)description;
    (void)outMetafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(JNIEnv* km_env, jclass km_clazz, jfloat height, jfloat width, jint isfilled, jlong cap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateAdjustableArrowCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)height, (float)width, (int32_t)isfilled, (void*)(uintptr_t)cap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)height;
    (void)width;
    (void)isfilled;
    (void)cap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromFileICM");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(JNIEnv* km_env, jclass km_clazz, jlong gdibitmapinfo, jlong gdibitmapdata, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromGdiDib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)gdibitmapinfo, (void*)(uintptr_t)gdibitmapdata, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)gdibitmapinfo;
    (void)gdibitmapdata;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(JNIEnv* km_env, jclass km_clazz, jint width, jint height, jlong target, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromGraphics");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)width, (int32_t)height, (void*)(uintptr_t)target, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)width;
    (void)height;
    (void)target;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(JNIEnv* km_env, jclass km_clazz, jlong hbm, jlong hpal, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromHBITMAP");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbm, (void*)(uintptr_t)hpal, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbm;
    (void)hpal;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(JNIEnv* km_env, jclass km_clazz, jlong hicon, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromHICON");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hicon, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hicon;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpbitmapname, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromResource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpbitmapname, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinstance;
    (void)lpbitmapname;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(JNIEnv* km_env, jclass km_clazz, jint width, jint height, jint stride, jint format, jlong scan0, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromScan0");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)width, (int32_t)height, (int32_t)stride, (int32_t)format, (void*)(uintptr_t)scan0, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)width;
    (void)height;
    (void)stride;
    (void)format;
    (void)scan0;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stream;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromStreamICM");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stream;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong graphics, jlong cachedbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateCachedBitmap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)graphics, (void*)(uintptr_t)cachedbitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)graphics;
    (void)cachedbitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong fillpath, jlong strokepath, jint basecap, jfloat baseinset, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateCustomLineCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fillpath, (void*)(uintptr_t)strokepath, (int32_t)basecap, (float)baseinset, (void*)(uintptr_t)customcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fillpath;
    (void)strokepath;
    (void)basecap;
    (void)baseinset;
    (void)customcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFont(JNIEnv* km_env, jclass km_clazz, jlong fontfamily, jfloat emsize, jint style, jint unit, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFont");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontfamily, (float)emsize, (int32_t)style, (int32_t)unit, (void*)(uintptr_t)font);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontfamily;
    (void)emsize;
    (void)style;
    (void)unit;
    (void)font;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(JNIEnv* km_env, jclass km_clazz, jlong name, jlong fontcollection, jlong fontfamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFamilyFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)fontcollection, (void*)(uintptr_t)fontfamily);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)fontcollection;
    (void)fontfamily;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)font);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)font;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong logfont, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromLogfontA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)logfont, (void*)(uintptr_t)font);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)logfont;
    (void)font;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong logfont, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromLogfontW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)logfont, (void*)(uintptr_t)font);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)logfont;
    (void)font;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hdevice, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHDC2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hdevice, (void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hdevice;
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHWND");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHWNDICM");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong hbmreturn, jint background) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHBITMAPFromBitmap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)hbmreturn, (uint32_t)background);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)hbmreturn;
    (void)background;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong hbmreturn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHICONFromBitmap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)hbmreturn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bitmap;
    (void)hbmreturn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHalftonePalette");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(JNIEnv* km_env, jclass km_clazz, jint hatchstyle, jint forecol, jint backcol, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHatchBrush");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)hatchstyle, (uint32_t)forecol, (uint32_t)backcol, (void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hatchstyle;
    (void)forecol;
    (void)backcol;
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateImageAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(JNIEnv* km_env, jclass km_clazz, jlong point1, jlong point2, jint color1, jint color2, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrush");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)point1, (void*)(uintptr_t)point2, (uint32_t)color1, (uint32_t)color2, (int32_t)wrapmode, (void*)(uintptr_t)linegradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)point1;
    (void)point2;
    (void)color1;
    (void)color2;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jint mode, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rect, (uint32_t)color1, (uint32_t)color2, (int32_t)mode, (int32_t)wrapmode, (void*)(uintptr_t)linegradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)mode;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jint mode, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rect, (uint32_t)color1, (uint32_t)color2, (int32_t)mode, (int32_t)wrapmode, (void*)(uintptr_t)linegradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)mode;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jfloat angle, jint isanglescalable, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectWithAngle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rect, (uint32_t)color1, (uint32_t)color2, (float)angle, (int32_t)isanglescalable, (int32_t)wrapmode, (void*)(uintptr_t)linegradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)angle;
    (void)isanglescalable;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jfloat angle, jint isanglescalable, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectWithAngleI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rect, (uint32_t)color1, (uint32_t)color2, (float)angle, (int32_t)isanglescalable, (int32_t)wrapmode, (void*)(uintptr_t)linegradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)angle;
    (void)isanglescalable;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(JNIEnv* km_env, jclass km_clazz, jlong point1, jlong point2, jint color1, jint color2, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)point1, (void*)(uintptr_t)point2, (uint32_t)color1, (uint32_t)color2, (int32_t)wrapmode, (void*)(uintptr_t)linegradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)point1;
    (void)point2;
    (void)color1;
    (void)color2;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(JNIEnv* km_env, jclass km_clazz, jfloat m11, jfloat m12, jfloat m21, jfloat m22, jfloat dx, jfloat dy, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)m11, (float)m12, (float)m21, (float)m22, (float)dx, (float)dy, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)m11;
    (void)m12;
    (void)m21;
    (void)m22;
    (void)dx;
    (void)dy;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong dstplg, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rect, (void*)(uintptr_t)dstplg, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rect;
    (void)dstplg;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong dstplg, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix3I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rect, (void*)(uintptr_t)dstplg, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rect;
    (void)dstplg;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint deleteemf, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromEmf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (int32_t)deleteemf, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hemf;
    (void)deleteemf;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(JNIEnv* km_env, jclass km_clazz, jlong file, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)file;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stream;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(JNIEnv* km_env, jclass km_clazz, jlong hwmf, jint deletewmf, jlong wmfplaceablefileheader, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromWmf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwmf, (int32_t)deletewmf, (void*)(uintptr_t)wmfplaceablefileheader, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwmf;
    (void)deletewmf;
    (void)wmfplaceablefileheader;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(JNIEnv* km_env, jclass km_clazz, jlong file, jlong wmfplaceablefileheader, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromWmfFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)wmfplaceablefileheader, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)file;
    (void)wmfplaceablefileheader;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePath(JNIEnv* km_env, jclass km_clazz, jint brushmode, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)brushmode, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brushmode;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2, (int32_t)param3, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2, (int32_t)param3, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(JNIEnv* km_env, jclass km_clazz, jlong points, jint count, jint wrapmode, jlong polygradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)points, (int32_t)count, (int32_t)wrapmode, (void*)(uintptr_t)polygradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)points;
    (void)count;
    (void)wrapmode;
    (void)polygradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong polygradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradientFromPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)polygradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)polygradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(JNIEnv* km_env, jclass km_clazz, jlong points, jint count, jint wrapmode, jlong polygradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradientI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)points, (int32_t)count, (int32_t)wrapmode, (void*)(uintptr_t)polygradient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)points;
    (void)count;
    (void)wrapmode;
    (void)polygradient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathIter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(JNIEnv* km_env, jclass km_clazz, jint color, jfloat width, jint unit, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePen1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)color, (float)width, (int32_t)unit, (void*)(uintptr_t)pen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)color;
    (void)width;
    (void)unit;
    (void)pen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat width, jint unit, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePen2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)width, (int32_t)unit, (void*)(uintptr_t)pen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)width;
    (void)unit;
    (void)pen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(JNIEnv* km_env, jclass km_clazz, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionHrgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgn, (void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrgn;
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rect, (void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rect;
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rect, (void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rect;
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(JNIEnv* km_env, jclass km_clazz, jlong regiondata, jint size, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRgnData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)regiondata, (int32_t)size, (void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)regiondata;
    (void)size;
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(JNIEnv* km_env, jclass km_clazz, jint color, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateSolidFill");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)color, (void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)color;
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jint access, jlong stream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateStreamOnFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (uint32_t)access, (void*)(uintptr_t)stream);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)access;
    (void)stream;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(JNIEnv* km_env, jclass km_clazz, jint formatattributes, jshort language, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateStringFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)formatattributes, (uint16_t)language, (void*)(uintptr_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)formatattributes;
    (void)language;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (int32_t)wrapmode, (void*)(uintptr_t)texture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)wrapmode;
    (void)texture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jfloat x, jfloat y, jfloat width, jfloat height, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (int32_t)wrapmode, (float)x, (float)y, (float)width, (float)height, (void*)(uintptr_t)texture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)wrapmode;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jint x, jint y, jint width, jint height, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (int32_t)wrapmode, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (void*)(uintptr_t)texture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)wrapmode;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(JNIEnv* km_env, jclass km_clazz, jlong image, jlong imageattributes, jfloat x, jfloat y, jfloat width, jfloat height, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTextureIA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)imageattributes, (float)x, (float)y, (float)width, (float)height, (void*)(uintptr_t)texture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)imageattributes;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(JNIEnv* km_env, jclass km_clazz, jlong image, jlong imageattributes, jint x, jint y, jint width, jint height, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTextureIAI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)imageattributes, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (void*)(uintptr_t)texture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)imageattributes;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(JNIEnv* km_env, jclass km_clazz, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteBrush");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong cachedbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteCachedBitmap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cachedbitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cachedbitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteCustomLineCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(JNIEnv* km_env, jclass km_clazz, jlong effect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteEffect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)effect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)effect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(JNIEnv* km_env, jclass km_clazz, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteFont");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(JNIEnv* km_env, jclass km_clazz, jlong fontfamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteFontFamily");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontfamily);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontfamily;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteGraphics");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeletePath(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(JNIEnv* km_env, jclass km_clazz, jlong iterator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePathIter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeletePen(JNIEnv* km_env, jclass km_clazz, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePrivateFontCollection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontcollection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontcollection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(JNIEnv* km_env, jclass km_clazz, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(JNIEnv* km_env, jclass km_clazz, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteStringFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(JNIEnv* km_env, jclass km_clazz, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDisposeImage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDisposeImageAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawArc(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawArc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawArcI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat x3, jfloat y3, jfloat x4, jfloat y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBezier");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x1, (float)y1, (float)x2, (float)y2, (float)x3, (float)y3, (float)x4, (float)y4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBezierI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)x3, (int32_t)y3, (int32_t)x4, (int32_t)y4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBeziers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBeziersI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong cachedbitmap, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCachedBitmap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)cachedbitmap, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)cachedbitmap;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurveI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (int32_t)offset, (int32_t)numberofsegments, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve3I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (int32_t)offset, (int32_t)numberofsegments, (float)tension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurveI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong text, jint length, jlong font, jlong brush, jlong positions, jint flags, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawDriverString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)text, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)brush, (void*)(uintptr_t)positions, (int32_t)flags, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)text;
    (void)length;
    (void)font;
    (void)brush;
    (void)positions;
    (void)flags;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawEllipse");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x, (float)y, (float)width, (float)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawEllipseI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImage(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (float)x, (float)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong source, jlong xform, jlong effect, jlong imageattributes, jint srcunit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageFX");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)source, (void*)(uintptr_t)xform, (void*)(uintptr_t)effect, (void*)(uintptr_t)imageattributes, (int32_t)srcunit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)source;
    (void)xform;
    (void)effect;
    (void)imageattributes;
    (void)srcunit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (float)x, (float)y, (float)srcx, (float)srcy, (float)srcwidth, (float)srcheight, (int32_t)srcunit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (int32_t)x, (int32_t)y, (int32_t)srcx, (int32_t)srcy, (int32_t)srcwidth, (int32_t)srcheight, (int32_t)srcunit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong dstpoints, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)dstpoints, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)dstpoints;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong dstpoints, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)dstpoints, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)dstpoints;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong points, jint count, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, float, float, float, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)points, (int32_t)count, (float)srcx, (float)srcy, (float)srcwidth, (float)srcheight, (int32_t)srcunit, (void*)(uintptr_t)imageattributes, (int64_t)callback, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong points, jint count, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)points, (int32_t)count, (int32_t)srcx, (int32_t)srcy, (int32_t)srcwidth, (int32_t)srcheight, (int32_t)srcunit, (void*)(uintptr_t)imageattributes, (int64_t)callback, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (float)x, (float)y, (float)width, (float)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat dstx, jfloat dsty, jfloat dstwidth, jfloat dstheight, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, float, float, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (float)dstx, (float)dsty, (float)dstwidth, (float)dstheight, (float)srcx, (float)srcy, (float)srcwidth, (float)srcheight, (int32_t)srcunit, (void*)(uintptr_t)imageattributes, (int64_t)callback, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)dstx;
    (void)dsty;
    (void)dstwidth;
    (void)dstheight;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint dstx, jint dsty, jint dstwidth, jint dstheight, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (int32_t)dstx, (int32_t)dsty, (int32_t)dstwidth, (int32_t)dstheight, (int32_t)srcx, (int32_t)srcy, (int32_t)srcwidth, (int32_t)srcheight, (int32_t)srcunit, (void*)(uintptr_t)imageattributes, (int64_t)callback, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)image;
    (void)dstx;
    (void)dsty;
    (void)dstwidth;
    (void)dstheight;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawLine(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLine");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x1, (float)y1, (float)x2, (float)y2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLineI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawLines(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLines");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLinesI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawPie(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPie");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPieI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPolygon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPolygonI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x, (float)y, (float)width, (float)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangleI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)rects, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectanglesI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)rects, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pen;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipDrawString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)stringformat, (void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cbdata16, jlong pdata16, jint imapmode, jint eflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEmfToWmfBits");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cbdata16, (void*)(uintptr_t)pdata16, (int32_t)imapmode, (int32_t)eflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)cbdata16;
    (void)pdata16;
    (void)imapmode;
    (void)eflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEndContainer(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEndContainer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoint, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoint, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoints, (int32_t)count, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPointsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoints, (int32_t)count, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destrect, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destrect, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoint, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoint, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoints, (int32_t)count, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPointsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoints, (int32_t)count, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destrect, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destrect, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jfloat tension, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count, (float)tension, (int32_t)fillmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)tension;
    (void)fillmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jfloat tension, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count, (float)tension, (int32_t)fillmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)tension;
    (void)fillmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurveI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillEllipse");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (float)x, (float)y, (float)width, (float)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillEllipseI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillPie(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPie");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillPieI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPieI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count, (int32_t)fillmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)fillmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon2I");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygonI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count, (int32_t)fillmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)fillmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (float)x, (float)y, (float)width, (float)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangleI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)rects, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectanglesI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)rects, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFillRegion(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)brush;
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFindFirstImageItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)item);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)item;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFindNextImageItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)item);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)item;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jfloat flatness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFlattenPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)matrix, (float)flatness);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)matrix;
    (void)flatness;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFlush(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint intention) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFlush");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)intention);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)intention;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipFree(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptr;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong fillstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapFillState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cap, (void*)(uintptr_t)fillstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cap;
    (void)fillstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapHeight");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cap, (void*)(uintptr_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cap;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong middleinset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapMiddleInset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cap, (void*)(uintptr_t)middleinset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cap;
    (void)middleinset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapWidth");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cap, (void*)(uintptr_t)width);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cap;
    (void)width;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(JNIEnv* km_env, jclass km_clazz, jlong image, jint totalbuffersize, jint numproperties, jlong allitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAllPropertyItems");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (uint32_t)totalbuffersize, (uint32_t)numproperties, (void*)(uintptr_t)allitems);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)totalbuffersize;
    (void)numproperties;
    (void)allitems;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetBrushType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong cellascent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCellAscent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)cellascent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)family;
    (void)style;
    (void)cellascent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong celldescent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCellDescent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)celldescent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)family;
    (void)style;
    (void)celldescent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetClip(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClip");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClipBounds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClipBoundsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong compositingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCompositingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)compositingmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)compositingmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong compositingquality) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCompositingQuality");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)compositingquality);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)compositingquality;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong basecap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapBaseCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)basecap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)basecap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong inset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapBaseInset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)inset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)inset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong startcap, jlong endcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapStrokeCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)startcap, (void*)(uintptr_t)endcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)startcap;
    (void)endcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong linejoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapStrokeJoin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)linejoin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)linejoin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong captype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)captype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)captype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong widthscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapWidthScale");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)widthscale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)widthscale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetDC(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDpiX");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)dpi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)dpi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDpiY");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)dpi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)dpi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEffectParameterSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)effect, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)effect;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong size, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEffectParameters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)effect, (void*)(uintptr_t)size, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)effect;
    (void)size;
    (void)params;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong emheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEmHeight");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)emheight);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)family;
    (void)style;
    (void)emheight;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(JNIEnv* km_env, jclass km_clazz, jlong image, jlong clsidencoder, jint size, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEncoderParameterList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)clsidencoder, (uint32_t)size, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)clsidencoder;
    (void)size;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong clsidencoder, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEncoderParameterListSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)clsidencoder, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)clsidencoder;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFamily(JNIEnv* km_env, jclass km_clazz, jlong font, jlong family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFamily");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)family);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)family;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(JNIEnv* km_env, jclass km_clazz, jlong family, jlong name, jshort language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFamilyName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)family, (void*)(uintptr_t)name, (uint16_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)family;
    (void)name;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong numfound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontCollectionFamilyCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontcollection, (void*)(uintptr_t)numfound);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontcollection;
    (void)numfound;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jint numsought, jlong gpfamilies, jlong numfound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontCollectionFamilyList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontcollection, (int32_t)numsought, (void*)(uintptr_t)gpfamilies, (void*)(uintptr_t)numfound);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontcollection;
    (void)numsought;
    (void)gpfamilies;
    (void)numfound;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontHeight");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)graphics, (void*)(uintptr_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)graphics;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(JNIEnv* km_env, jclass km_clazz, jlong font, jfloat dpi, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontHeightGivenDPI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (float)dpi, (void*)(uintptr_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)dpi;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(JNIEnv* km_env, jclass km_clazz, jlong font, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(JNIEnv* km_env, jclass km_clazz, jlong font, jlong style) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontStyle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)style);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)style;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(JNIEnv* km_env, jclass km_clazz, jlong font, jlong unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontUnit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)unit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)unit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilyMonospace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nativefamily);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nativefamily;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilySansSerif");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nativefamily);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nativefamily;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilySerif");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nativefamily);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nativefamily;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong backcol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchBackgroundColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)backcol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)backcol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong forecol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchForegroundColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)forecol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)forecol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong hatchstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchStyle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)hatchstyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)hatchstyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong hemf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHemfFromMetafile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metafile, (void*)(uintptr_t)hemf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metafile;
    (void)hemf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jlong colorpalette, jint coloradjusttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageAttributesAdjustedPalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (void*)(uintptr_t)colorpalette, (int32_t)coloradjusttype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)colorpalette;
    (void)coloradjusttype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(JNIEnv* km_env, jclass km_clazz, jlong image, jlong srcrect, jlong srcunit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageBounds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)srcrect, (void*)(uintptr_t)srcunit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)srcrect;
    (void)srcunit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(JNIEnv* km_env, jclass km_clazz, jint numdecoders, jint size, jlong decoders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDecoders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)numdecoders, (uint32_t)size, (void*)(uintptr_t)decoders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)numdecoders;
    (void)size;
    (void)decoders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(JNIEnv* km_env, jclass km_clazz, jlong numdecoders, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDecodersSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)numdecoders, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)numdecoders;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(JNIEnv* km_env, jclass km_clazz, jlong image, jlong width, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDimension");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)width, (void*)(uintptr_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(JNIEnv* km_env, jclass km_clazz, jint numencoders, jint size, jlong encoders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageEncoders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)numencoders, (uint32_t)size, (void*)(uintptr_t)encoders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)numencoders;
    (void)size;
    (void)encoders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(JNIEnv* km_env, jclass km_clazz, jlong numencoders, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageEncodersSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)numencoders, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)numencoders;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(JNIEnv* km_env, jclass km_clazz, jlong image, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageFlags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(JNIEnv* km_env, jclass km_clazz, jlong image, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageGraphicsContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(JNIEnv* km_env, jclass km_clazz, jlong image, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageHeight");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(JNIEnv* km_env, jclass km_clazz, jlong image, jlong resolution) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageHorizontalResolution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)resolution);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)resolution;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageItemData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)item);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)item;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(JNIEnv* km_env, jclass km_clazz, jlong image, jlong palette, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)palette, (int32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)palette;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePaletteSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(JNIEnv* km_env, jclass km_clazz, jlong image, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePixelFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(JNIEnv* km_env, jclass km_clazz, jlong image, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageRawFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(JNIEnv* km_env, jclass km_clazz, jlong image, jint thumbwidth, jint thumbheight, jlong thumbimage, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageThumbnail");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (uint32_t)thumbwidth, (uint32_t)thumbheight, (void*)(uintptr_t)thumbimage, (int64_t)callback, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)thumbwidth;
    (void)thumbheight;
    (void)thumbimage;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageType(JNIEnv* km_env, jclass km_clazz, jlong image, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(JNIEnv* km_env, jclass km_clazz, jlong image, jlong resolution) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageVerticalResolution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)resolution);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)resolution;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(JNIEnv* km_env, jclass km_clazz, jlong image, jlong width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageWidth");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)width);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)width;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong interpolationmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetInterpolationMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)interpolationmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)interpolationmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineBlendCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong colors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)colors);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)colors;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong usegammacorrection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineGammaCorrection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)usegammacorrection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)usegammacorrection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLinePresetBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLinePresetBlendCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong linespacing) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineSpacing");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)linespacing);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)family;
    (void)style;
    (void)linespacing;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineWrapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)wrapmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong logfonta) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLogFontA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)graphics, (void*)(uintptr_t)logfonta);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)graphics;
    (void)logfonta;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong logfontw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLogFontW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)graphics, (void*)(uintptr_t)logfontw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)font;
    (void)graphics;
    (void)logfontw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrixout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMatrixElements");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)matrixout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)matrixout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong metafilerasterizationlimitdpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileDownLevelRasterizationLimit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metafile, (void*)(uintptr_t)metafilerasterizationlimitdpi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metafile;
    (void)metafilerasterizationlimitdpi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(JNIEnv* km_env, jclass km_clazz, jlong hemf, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromEmf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (void*)(uintptr_t)header);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hemf;
    (void)header;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)header);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)header;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromMetafile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metafile, (void*)(uintptr_t)header);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metafile;
    (void)header;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)header);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stream;
    (void)header;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(JNIEnv* km_env, jclass km_clazz, jlong hwmf, jlong wmfplaceablefileheader, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromWmf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwmf, (void*)(uintptr_t)wmfplaceablefileheader, (void*)(uintptr_t)header);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwmf;
    (void)wmfplaceablefileheader;
    (void)header;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong argb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetNearestColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)argb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)argb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPageScale");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)scale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)scale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPageUnit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)unit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)unit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathData(JNIEnv* km_env, jclass km_clazz, jlong path, jlong pathdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)pathdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)pathdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(JNIEnv* km_env, jclass km_clazz, jlong path, jlong fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathFillMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)fillmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)fillmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientBlendCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong colors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)colors);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)colors;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)points);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)points;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)points);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)points;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong xscale, jlong yscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientFocusScales");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)xscale, (void*)(uintptr_t)yscale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)xscale;
    (void)yscale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong usegammacorrection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientGammaCorrection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)usegammacorrection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)usegammacorrection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPointCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPresetBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPresetBlendCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientSurroundColorCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientSurroundColorsWithCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)color, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)color;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientWrapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)wrapmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jlong lastpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathLastPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)lastpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)lastpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathPoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathPointsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(JNIEnv* km_env, jclass km_clazz, jlong path, jlong types, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathTypes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)types, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)types;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(JNIEnv* km_env, jclass km_clazz, jlong path, jlong bounds, jlong matrix, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathWorldBounds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)bounds, (void*)(uintptr_t)matrix, (void*)(uintptr_t)pen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)bounds;
    (void)matrix;
    (void)pen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong bounds, jlong matrix, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathWorldBoundsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)bounds, (void*)(uintptr_t)matrix, (void*)(uintptr_t)pen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)bounds;
    (void)matrix;
    (void)pen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenBrushFill");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong argb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)argb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)argb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCompoundArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dash, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dash;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCompoundCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCustomEndCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)customcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)customcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCustomStartCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)customcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)customcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dash, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dash;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dashcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashCap197819");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dashcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dashcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong offset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashOffset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)offset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)offset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dashstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashStyle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dashstyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dashstyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong endcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenEndCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)endcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)endcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenFillType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong linejoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenLineJoin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)linejoin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)linejoin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong miterlimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenMiterLimit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)miterlimit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)miterlimit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong penmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)penmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)penmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong startcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenStartCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)startcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)startcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenUnit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)unit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)unit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenWidth");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)width);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)width;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pixeloffsetmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPixelOffsetMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pixeloffsetmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pixeloffsetmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(JNIEnv* km_env, jclass km_clazz, jlong path, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPointCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong numofproperty) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)numofproperty);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)numofproperty;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(JNIEnv* km_env, jclass km_clazz, jlong image, jint numofproperty, jlong list) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyIdList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (uint32_t)numofproperty, (void*)(uintptr_t)list);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)numofproperty;
    (void)list;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid, jint propsize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (uint32_t)propid, (uint32_t)propsize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)propid;
    (void)propsize;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyItemSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (uint32_t)propid, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)propid;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong totalbuffersize, jlong numproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertySize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)totalbuffersize, (void*)(uintptr_t)numproperties);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)totalbuffersize;
    (void)numproperties;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionBounds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionBoundsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(JNIEnv* km_env, jclass km_clazz, jlong region, jlong buffer, jint buffersize, jlong sizefilled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)sizefilled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)buffer;
    (void)buffersize;
    (void)sizefilled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(JNIEnv* km_env, jclass km_clazz, jlong region, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionDataSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)buffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionHRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)hrgn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)graphics;
    (void)hrgn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rects, jlong count, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScans");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)rects, (void*)(uintptr_t)count, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)rects;
    (void)count;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(JNIEnv* km_env, jclass km_clazz, jlong region, jlong count, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScansCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)count, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)count;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rects, jlong count, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScansI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)rects, (void*)(uintptr_t)count, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)rects;
    (void)count;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong x, jlong y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRenderingOrigin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)x, (void*)(uintptr_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong smoothingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetSmoothingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)smoothingmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)smoothingmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetSolidFillColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)color);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)color;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jlong align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatAlign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)align);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)align;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(JNIEnv* km_env, jclass km_clazz, jlong format, jlong language, jlong substitute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatDigitSubstitution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)language, (void*)(uintptr_t)substitute);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)language;
    (void)substitute;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(JNIEnv* km_env, jclass km_clazz, jlong format, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatFlags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(JNIEnv* km_env, jclass km_clazz, jlong format, jlong hotkeyprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatHotkeyPrefix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)hotkeyprefix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)hotkeyprefix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jlong align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatLineAlign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)align);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)align;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(JNIEnv* km_env, jclass km_clazz, jlong format, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatMeasurableCharacterRangeCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(JNIEnv* km_env, jclass km_clazz, jlong format, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTabStopCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(JNIEnv* km_env, jclass km_clazz, jlong format, jint count, jlong firsttaboffset, jlong tabstops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTabStops");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (int32_t)count, (void*)(uintptr_t)firsttaboffset, (void*)(uintptr_t)tabstops);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)count;
    (void)firsttaboffset;
    (void)tabstops;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(JNIEnv* km_env, jclass km_clazz, jlong format, jlong trimming) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTrimming");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)trimming);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)trimming;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong contrast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextContrast");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)contrast);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)contrast;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextRenderingHint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureImage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)image);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)image;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureWrapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)wrapmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetVisibleClipBounds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetVisibleClipBoundsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)rect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGraphicsClear");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)color;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(JNIEnv* km_env, jclass km_clazz, jlong pgraphics, jlong piabort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGraphicsSetAbort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pgraphics, (void*)(uintptr_t)piabort);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pgraphics;
    (void)piabort;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(JNIEnv* km_env, jclass km_clazz, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageForceValidation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionid, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)dimensionid, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)dimensionid;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameDimensionsCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionids, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameDimensionsList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)dimensionids, (uint32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)dimensionids;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(JNIEnv* km_env, jclass km_clazz, jlong image, jint rftype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageRotateFlip");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (int32_t)rftype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)rftype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionid, jint frameindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageSelectActiveFrame");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)dimensionid, (uint32_t)frameindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)dimensionid;
    (void)frameindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(JNIEnv* km_env, jclass km_clazz, jlong pimage, jlong piabort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageSetAbort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pimage, (void*)(uintptr_t)piabort);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pimage;
    (void)piabort;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(JNIEnv* km_env, jclass km_clazz, jlong palette, jint palettetype, jint optimalcolors, jint usetransparentcolor, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipInitializePalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)palette, (int32_t)palettetype, (int32_t)optimalcolors, (int32_t)usetransparentcolor, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)palette;
    (void)palettetype;
    (void)optimalcolors;
    (void)usetransparentcolor;
    (void)bitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipInvertMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsClipEmpty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsEmptyRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong region2, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsEqualRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)region2, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)region2;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsInfiniteRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrix2, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixEqual");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)matrix2, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)matrix2;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixInvertible");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jlong pen, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsOutlineVisiblePathPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (void*)(uintptr_t)pen, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)pen;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jlong pen, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsOutlineVisiblePathPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (void*)(uintptr_t)pen, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)pen;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong isstyleavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsStyleAvailable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)isstyleavailable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)family;
    (void)style;
    (void)isstyleavailable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleClipEmpty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePathPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePathPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (float)x, (float)y, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)x, (int32_t)y, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jfloat width, jfloat height, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (float)x, (float)y, (float)width, (float)height, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jint width, jint height, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat x, jfloat y, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (float)x, (float)y, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(JNIEnv* km_env, jclass km_clazz, jlong region, jint x, jint y, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (int32_t)x, (int32_t)y, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat x, jfloat y, jfloat width, jfloat height, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (float)x, (float)y, (float)width, (float)height, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong region, jint x, jint y, jint width, jint height, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)image);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)image;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromFileICM");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)image);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)image;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)image);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stream;
    (void)image;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromStreamICM");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)image);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stream;
    (void)image;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jint regioncount, jlong regions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureCharacterRanges");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)stringformat, (int32_t)regioncount, (void*)(uintptr_t)regions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)regioncount;
    (void)regions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong text, jint length, jlong font, jlong positions, jint flags, jlong matrix, jlong boundingbox) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureDriverString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)text, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)positions, (int32_t)flags, (void*)(uintptr_t)matrix, (void*)(uintptr_t)boundingbox);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)text;
    (void)length;
    (void)font;
    (void)positions;
    (void)flags;
    (void)matrix;
    (void)boundingbox;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMeasureString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jlong boundingbox, jlong codepointsfitted, jlong linesfilled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)stringformat, (void*)(uintptr_t)boundingbox, (void*)(uintptr_t)codepointsfitted, (void*)(uintptr_t)linesfilled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)boundingbox;
    (void)codepointsfitted;
    (void)linesfilled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyLineTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrix2, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)matrix2, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)matrix2;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyPathGradientTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyPenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)matrix, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyTextureTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)matrix, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipNewInstalledFontCollection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontcollection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontcollection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipNewPrivateFontCollection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontcollection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontcollection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong points, jlong types, jint startindex, jint endindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterCopyData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)points, (void*)(uintptr_t)types, (int32_t)startindex, (int32_t)endindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)resultcount;
    (void)points;
    (void)types;
    (void)startindex;
    (void)endindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong points, jlong types, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterEnumerate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)points, (void*)(uintptr_t)types, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)resultcount;
    (void)points;
    (void)types;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterGetCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterGetSubpathCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong hascurve) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterHasCurve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)hascurve);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)hascurve;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong valid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterIsValid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)valid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)valid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong startindex, jlong endindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextMarker");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)startindex, (void*)(uintptr_t)endindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)resultcount;
    (void)startindex;
    (void)endindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextMarkerPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)resultcount;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong pathtype, jlong startindex, jlong endindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextPathType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)pathtype, (void*)(uintptr_t)startindex, (void*)(uintptr_t)endindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)resultcount;
    (void)pathtype;
    (void)startindex;
    (void)endindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong startindex, jlong endindex, jlong isclosed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextSubpath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)startindex, (void*)(uintptr_t)endindex, (void*)(uintptr_t)isclosed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)resultcount;
    (void)startindex;
    (void)endindex;
    (void)isclosed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong path, jlong isclosed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextSubpathPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)path, (void*)(uintptr_t)isclosed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    (void)resultcount;
    (void)path;
    (void)isclosed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(JNIEnv* km_env, jclass km_clazz, jlong iterator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterRewind");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)iterator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iterator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(JNIEnv* km_env, jclass km_clazz, jlong metafile, jint recordtype, jint flags, jint datasize, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPlayMetafileRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metafile, (int32_t)recordtype, (uint32_t)flags, (uint32_t)datasize, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metafile;
    (void)recordtype;
    (void)flags;
    (void)datasize;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong filename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPrivateAddFontFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontcollection, (void*)(uintptr_t)filename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontcollection;
    (void)filename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong memory, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPrivateAddMemoryFont");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fontcollection, (void*)(uintptr_t)memory, (int32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fontcollection;
    (void)memory;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(JNIEnv* km_env, jclass km_clazz, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileFileName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileFileNameI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(JNIEnv* km_env, jclass km_clazz, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stream;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileStreamI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stream;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipReleaseDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRemovePropertyItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (uint32_t)propid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)propid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetClip(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetClip");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetImageAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetLineTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPageTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetPath(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPathGradientTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetTextureTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRestoreGraphics");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipReversePath(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipReversePath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateLineTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)angle, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (float)angle, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotatePathGradientTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)angle, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotatePenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (float)angle, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateTextureTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)angle, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (float)angle, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(JNIEnv* km_env, jclass km_clazz, jlong image, jlong encoderparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveAdd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)encoderparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)encoderparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(JNIEnv* km_env, jclass km_clazz, jlong image, jlong newimage, jlong encoderparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveAddImage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)newimage, (void*)(uintptr_t)encoderparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)newimage;
    (void)encoderparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveGraphics");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(JNIEnv* km_env, jclass km_clazz, jlong image, jlong filename, jlong clsidencoder, jlong encoderparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveImageToFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)filename, (void*)(uintptr_t)clsidencoder, (void*)(uintptr_t)encoderparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)filename;
    (void)clsidencoder;
    (void)encoderparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(JNIEnv* km_env, jclass km_clazz, jlong image, jlong stream, jlong clsidencoder, jlong encoderparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveImageToStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)stream, (void*)(uintptr_t)clsidencoder, (void*)(uintptr_t)encoderparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)stream;
    (void)clsidencoder;
    (void)encoderparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleLineTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)sx, (float)sy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat scalex, jfloat scaley, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (float)scalex, (float)scaley, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)scalex;
    (void)scaley;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScalePathGradientTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)sx, (float)sy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScalePenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (float)sx, (float)sy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleTextureTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)sx, (float)sy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (float)sx, (float)sy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(JNIEnv* km_env, jclass km_clazz, jlong cap, jint fillstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapFillState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cap, (int32_t)fillstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cap;
    (void)fillstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapHeight");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cap, (float)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cap;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat middleinset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapMiddleInset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cap, (float)middleinset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cap;
    (void)middleinset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapWidth");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cap, (float)width);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cap;
    (void)width;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong srcgraphics, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipGraphics");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)srcgraphics, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)srcgraphics;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hrgn, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipHrgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)hrgn, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)hrgn;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong path, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)path, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)path;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jfloat width, jfloat height, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (float)x, (float)y, (float)width, (float)height, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jint width, jint height, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRectI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong region, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)region, (int32_t)combinemode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)region;
    (void)combinemode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint compositingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCompositingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)compositingmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)compositingmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint compositingquality) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCompositingQuality");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)compositingquality);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)compositingquality;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint basecap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapBaseCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (int32_t)basecap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)basecap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(JNIEnv* km_env, jclass km_clazz, jlong customcap, jfloat inset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapBaseInset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (float)inset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)inset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint startcap, jint endcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapStrokeCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (int32_t)startcap, (int32_t)endcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)startcap;
    (void)endcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint linejoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapStrokeJoin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (int32_t)linejoin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)linejoin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(JNIEnv* km_env, jclass km_clazz, jlong customcap, jfloat widthscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapWidthScale");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcap, (float)widthscale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcap;
    (void)widthscale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong params, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetEffectParameters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)effect, (void*)(uintptr_t)params, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)effect;
    (void)params;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(JNIEnv* km_env, jclass km_clazz, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetEmpty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint enableflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesCachedBackground");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)enableflag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)enableflag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint colorlow, jint colorhigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesColorKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (uint32_t)colorlow, (uint32_t)colorhigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colorlow;
    (void)colorhigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jlong colormatrix, jlong graymatrix, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesColorMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (void*)(uintptr_t)colormatrix, (void*)(uintptr_t)graymatrix, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colormatrix;
    (void)graymatrix;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jfloat gamma) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesGamma");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (float)gamma);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)gamma;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesNoOp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint channelflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesOutputChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (int32_t)channelflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)channelflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jlong colorprofilefilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesOutputChannelColorProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (void*)(uintptr_t)colorprofilefilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colorprofilefilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint mapsize, jlong map) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesRemapTable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (uint32_t)mapsize, (void*)(uintptr_t)map);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)mapsize;
    (void)map;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jfloat threshold) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesThreshold");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (float)threshold);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)threshold;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesToIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint wrap, jint argb, jint clamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesWrapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)wrap, (uint32_t)argb, (int32_t)clamp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imageattr;
    (void)wrap;
    (void)argb;
    (void)clamp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(JNIEnv* km_env, jclass km_clazz, jlong image, jlong palette) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImagePalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)palette);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)palette;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(JNIEnv* km_env, jclass km_clazz, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetInfinite");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint interpolationmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetInterpolationMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)interpolationmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)interpolationmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(JNIEnv* km_env, jclass km_clazz, jlong brush, jint color1, jint color2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (uint32_t)color1, (uint32_t)color2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)color1;
    (void)color2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jint usegammacorrection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineGammaCorrection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (int32_t)usegammacorrection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)usegammacorrection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineLinearBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)focus, (float)scale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)focus;
    (void)scale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLinePresetBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineSigmaBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)focus, (float)scale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)focus;
    (void)scale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineWrapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (int32_t)wrapmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat m11, jfloat m12, jfloat m21, jfloat m22, jfloat dx, jfloat dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetMatrixElements");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (float)m11, (float)m12, (float)m21, (float)m22, (float)dx, (float)dy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)m11;
    (void)m12;
    (void)m21;
    (void)m22;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(JNIEnv* km_env, jclass km_clazz, jlong metafile, jint metafilerasterizationlimitdpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetMetafileDownLevelRasterizationLimit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metafile, (uint32_t)metafilerasterizationlimitdpi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metafile;
    (void)metafilerasterizationlimitdpi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPageScale");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (float)scale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)scale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPageUnit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)unit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)unit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(JNIEnv* km_env, jclass km_clazz, jlong path, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathFillMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)fillmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)fillmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jint colors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (uint32_t)colors);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)colors;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)points);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)points;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)points);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)points;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat xscale, jfloat yscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientFocusScales");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)xscale, (float)yscale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)xscale;
    (void)yscale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jint usegammacorrection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientGammaCorrection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (int32_t)usegammacorrection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)usegammacorrection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientLinearBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)focus, (float)scale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)focus;
    (void)scale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientPresetBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientSigmaBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)focus, (float)scale);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)focus;
    (void)scale;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientSurroundColorsWithCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)color, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)color;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientWrapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (int32_t)wrapmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathMarker");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenBrushFill");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)brush);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)brush;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(JNIEnv* km_env, jclass km_clazz, jlong pen, jint argb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (uint32_t)argb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)argb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCompoundArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dash, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dash;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCustomEndCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)customcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)customcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCustomStartCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)customcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)customcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dash, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dash;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jint dashcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashCap197819");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (int32_t)dashcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dashcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat offset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashOffset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (float)offset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)offset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(JNIEnv* km_env, jclass km_clazz, jlong pen, jint dashstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashStyle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (int32_t)dashstyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dashstyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jint endcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenEndCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (int32_t)endcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)endcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jint startcap, jint endcap, jint dashcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenLineCap197819");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (int32_t)startcap, (int32_t)endcap, (int32_t)dashcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)startcap;
    (void)endcap;
    (void)dashcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(JNIEnv* km_env, jclass km_clazz, jlong pen, jint linejoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenLineJoin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (int32_t)linejoin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)linejoin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat miterlimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenMiterLimit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (float)miterlimit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)miterlimit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(JNIEnv* km_env, jclass km_clazz, jlong pen, jint penmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (int32_t)penmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)penmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jint startcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenStartCap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (int32_t)startcap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)startcap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(JNIEnv* km_env, jclass km_clazz, jlong pen, jint unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenUnit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (int32_t)unit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)unit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenWidth");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (float)width);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)width;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint pixeloffsetmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPixelOffsetMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)pixeloffsetmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)pixeloffsetmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPropertyItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)item);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)image;
    (void)item;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetRenderingOrigin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint smoothingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetSmoothingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)smoothingmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)smoothingmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetSolidFillColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)color;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jint align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatAlign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (int32_t)align);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)align;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(JNIEnv* km_env, jclass km_clazz, jlong format, jshort language, jint substitute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatDigitSubstitution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (uint16_t)language, (int32_t)substitute);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)language;
    (void)substitute;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(JNIEnv* km_env, jclass km_clazz, jlong format, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatFlags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(JNIEnv* km_env, jclass km_clazz, jlong format, jint hotkeyprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatHotkeyPrefix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (int32_t)hotkeyprefix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)hotkeyprefix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jint align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatLineAlign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (int32_t)align);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)align;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(JNIEnv* km_env, jclass km_clazz, jlong format, jint rangecount, jlong ranges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatMeasurableCharacterRanges");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (int32_t)rangecount, (void*)(uintptr_t)ranges);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)rangecount;
    (void)ranges;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(JNIEnv* km_env, jclass km_clazz, jlong format, jfloat firsttaboffset, jint count, jlong tabstops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatTabStops");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (float)firsttaboffset, (int32_t)count, (void*)(uintptr_t)tabstops);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)firsttaboffset;
    (void)count;
    (void)tabstops;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(JNIEnv* km_env, jclass km_clazz, jlong format, jint trimming) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatTrimming");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format, (int32_t)trimming);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)trimming;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint contrast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextContrast");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)contrast);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)contrast;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextRenderingHint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextureTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextureWrapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (int32_t)wrapmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat shearx, jfloat sheary, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipShearMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (float)shearx, (float)sheary, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)shearx;
    (void)sheary;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStartPathFigure");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(JNIEnv* km_env, jclass km_clazz, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStringFormatGetGenericDefault");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(JNIEnv* km_env, jclass km_clazz, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStringFormatGetGenericTypographic");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTestControl(JNIEnv* km_env, jclass km_clazz, jint control, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTestControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)control, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)control;
    (void)param1;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformMatrixPoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)pts, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)pts;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformMatrixPointsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)pts, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)pts;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTransformPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint destspace, jint srcspace, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)destspace, (int32_t)srcspace, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)destspace;
    (void)srcspace;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint destspace, jint srcspace, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPointsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)destspace, (int32_t)srcspace, (void*)(uintptr_t)points, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)destspace;
    (void)srcspace;
    (void)points;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)matrix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)matrix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat dx, jfloat dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateClip");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (float)dx, (float)dy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateClipI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)dx, (int32_t)dy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateLineTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)dx, (float)dy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat offsetx, jfloat offsety, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateMatrix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (float)offsetx, (float)offsety, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)offsetx;
    (void)offsety;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslatePathGradientTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)dx, (float)dy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslatePenTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pen, (float)dx, (float)dy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pen;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat dx, jfloat dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (float)dx, (float)dy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(JNIEnv* km_env, jclass km_clazz, jlong region, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateRegionI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)region, (int32_t)dx, (int32_t)dy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)region;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateTextureTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)brush, (float)dx, (float)dy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)graphics, (float)dx, (float)dy, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipVectorTransformMatrixPoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)pts, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)pts;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipVectorTransformMatrixPointsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)pts, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)matrix;
    (void)pts;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipWarpPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jlong points, jint count, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint warpmode, jfloat flatness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, float, float, float, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWarpPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)matrix, (void*)(uintptr_t)points, (int32_t)count, (float)srcx, (float)srcy, (float)srcwidth, (float)srcheight, (int32_t)warpmode, (float)flatness);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)matrix;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)warpmode;
    (void)flatness;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipWidenPath(JNIEnv* km_env, jclass km_clazz, jlong nativepath, jlong pen, jlong matrix, jfloat flatness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWidenPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nativepath, (void*)(uintptr_t)pen, (void*)(uintptr_t)matrix, (float)flatness);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nativepath;
    (void)pen;
    (void)matrix;
    (void)flatness;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jfloat flatness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWindingModeOutline");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)matrix, (float)flatness);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)matrix;
    (void)flatness;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusNotificationHook");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusNotificationUnhook");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint64_t)token);
    } else {
        errno = ENOSYS;
    }
#else
    (void)token;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusShutdown");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint64_t)token);
    } else {
        errno = ENOSYS;
    }
#else
    (void)token;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssysWindowsWin32GraphicsGdiplusGdiplusStartup(JNIEnv* km_env, jclass km_clazz, jlong token, jlong input, jlong output) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusStartup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)input, (void*)(uintptr_t)output);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    (void)input;
    (void)output;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

