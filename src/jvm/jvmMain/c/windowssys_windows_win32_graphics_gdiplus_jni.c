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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathArc(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathArc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathArcI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathArcI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathBezier(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat x3, jfloat y3, jfloat x4, jfloat y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBezier");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (float)x1, (float)y1, (float)x2, (float)y2, (float)x3, (float)y3, (float)x4, (float)y4) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathBezierI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBezierI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)x3, (int32_t)y3, (int32_t)x4, (int32_t)y4) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathBeziers(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBeziers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathBeziersI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBeziersI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (float)tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (float)tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurveI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathCurve(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathCurve2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (float)tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathCurve2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (float)tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathCurve3(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (int32_t)offset, (int32_t)numberofsegments, (float)tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathCurve3I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve3I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count, (int32_t)offset, (int32_t)numberofsegments, (float)tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathCurveI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurveI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathEllipse(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathEllipse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (float)width, (float)height) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathEllipseI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathEllipseI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathLine(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (float)x1, (float)y1, (float)x2, (float)y2) : -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathLine2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathLine2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathLineI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLineI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2) : -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong addingpath, jint arg_2_connect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)addingpath, (int32_t)arg_2_connect) : -1;
#else
    (void)path;
    (void)addingpath;
    (void)arg_2_connect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathPie(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPie");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathPieI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPieI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathPolygon(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPolygon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathPolygonI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPolygonI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathRectangle(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (float)width, (float)height) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathRectangleI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangleI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathRectangles(JNIEnv* km_env, jclass km_clazz, jlong path, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)rects, (int32_t)count) : -1;
#else
    (void)path;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectanglesI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)rects, (int32_t)count) : -1;
#else
    (void)path;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathString(JNIEnv* km_env, jclass km_clazz, jlong path, jlong string, jint length, jlong family, jint style, jfloat emsize, jlong layoutrect, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)family, (int32_t)style, (float)emsize, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)format) : -1;
#else
    (void)path;
    (void)string;
    (void)length;
    (void)family;
    (void)style;
    (void)emsize;
    (void)layoutrect;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAddPathStringI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong string, jint length, jlong family, jint style, jfloat emsize, jlong layoutrect, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathStringI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)family, (int32_t)style, (float)emsize, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)format) : -1;
#else
    (void)path;
    (void)string;
    (void)length;
    (void)family;
    (void)style;
    (void)emsize;
    (void)layoutrect;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipAlloc(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBeginContainer(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dstrect, jlong srcrect, jint unit, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)dstrect, (void*)(uintptr_t)srcrect, (int32_t)unit, (void*)(uintptr_t)state) : -1;
#else
    (void)graphics;
    (void)dstrect;
    (void)srcrect;
    (void)unit;
    (void)state;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBeginContainer2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainer2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)state) : -1;
#else
    (void)graphics;
    (void)state;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBeginContainerI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dstrect, jlong srcrect, jint unit, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainerI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)dstrect, (void*)(uintptr_t)srcrect, (int32_t)unit, (void*)(uintptr_t)state) : -1;
#else
    (void)graphics;
    (void)dstrect;
    (void)srcrect;
    (void)unit;
    (void)state;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapApplyEffect(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong effect, jlong roi, jint useauxdata, jlong auxdata, jlong auxdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapApplyEffect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)effect, (void*)(uintptr_t)roi, (int32_t)useauxdata, (void*)(uintptr_t)auxdata, (void*)(uintptr_t)auxdatasize) : -1;
#else
    (void)bitmap;
    (void)effect;
    (void)roi;
    (void)useauxdata;
    (void)auxdata;
    (void)auxdatasize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapConvertFormat(JNIEnv* km_env, jclass km_clazz, jlong pinputbitmap, jint format, jint dithertype, jint palettetype, jlong palette, jfloat alphathresholdpercent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapConvertFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinputbitmap, (int32_t)format, (int32_t)dithertype, (int32_t)palettetype, (void*)(uintptr_t)palette, (float)alphathresholdpercent) : -1;
#else
    (void)pinputbitmap;
    (void)format;
    (void)dithertype;
    (void)palettetype;
    (void)palette;
    (void)alphathresholdpercent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapCreateApplyEffect(JNIEnv* km_env, jclass km_clazz, jlong inputbitmaps, jint numinputs, jlong effect, jlong roi, jlong outputrect, jlong outputbitmap, jint useauxdata, jlong auxdata, jlong auxdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapCreateApplyEffect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inputbitmaps, (int32_t)numinputs, (void*)(uintptr_t)effect, (void*)(uintptr_t)roi, (void*)(uintptr_t)outputrect, (void*)(uintptr_t)outputbitmap, (int32_t)useauxdata, (void*)(uintptr_t)auxdata, (void*)(uintptr_t)auxdatasize) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapGetHistogram(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint format, jint numberofentries, jlong channel0, jlong channel1, jlong channel2, jlong channel3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetHistogram");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (int32_t)format, (uint32_t)numberofentries, (void*)(uintptr_t)channel0, (void*)(uintptr_t)channel1, (void*)(uintptr_t)channel2, (void*)(uintptr_t)channel3) : -1;
#else
    (void)bitmap;
    (void)format;
    (void)numberofentries;
    (void)channel0;
    (void)channel1;
    (void)channel2;
    (void)channel3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapGetHistogramSize(JNIEnv* km_env, jclass km_clazz, jint format, jlong numberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetHistogramSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)format, (void*)(uintptr_t)numberofentries) : -1;
#else
    (void)format;
    (void)numberofentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapGetPixel(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint x, jint y, jlong color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetPixel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (int32_t)x, (int32_t)y, (void*)(uintptr_t)color) : -1;
#else
    (void)bitmap;
    (void)x;
    (void)y;
    (void)color;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapLockBits(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong rect, jint flags, jint format, jlong lockedbitmapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapLockBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)rect, (uint32_t)flags, (int32_t)format, (void*)(uintptr_t)lockedbitmapdata) : -1;
#else
    (void)bitmap;
    (void)rect;
    (void)flags;
    (void)format;
    (void)lockedbitmapdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapSetPixel(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint x, jint y, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapSetPixel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (int32_t)x, (int32_t)y, (uint32_t)color) : -1;
#else
    (void)bitmap;
    (void)x;
    (void)y;
    (void)color;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapSetResolution(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jfloat xdpi, jfloat ydpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapSetResolution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (float)xdpi, (float)ydpi) : -1;
#else
    (void)bitmap;
    (void)xdpi;
    (void)ydpi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipBitmapUnlockBits(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong lockedbitmapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapUnlockBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)lockedbitmapdata) : -1;
#else
    (void)bitmap;
    (void)lockedbitmapdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipClearPathMarkers(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClearPathMarkers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneBitmapArea(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat width, jfloat height, jint format, jlong srcbitmap, jlong dstbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, float, float, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBitmapArea");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((float)x, (float)y, (float)width, (float)height, (int32_t)format, (void*)(uintptr_t)srcbitmap, (void*)(uintptr_t)dstbitmap) : -1;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)srcbitmap;
    (void)dstbitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneBitmapAreaI(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint width, jint height, jint format, jlong srcbitmap, jlong dstbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBitmapAreaI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (int32_t)format, (void*)(uintptr_t)srcbitmap, (void*)(uintptr_t)dstbitmap) : -1;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)srcbitmap;
    (void)dstbitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneBrush(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong clonebrush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBrush");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)clonebrush) : -1;
#else
    (void)brush;
    (void)clonebrush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong clonedcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneCustomLineCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)clonedcap) : -1;
#else
    (void)customcap;
    (void)clonedcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneFont(JNIEnv* km_env, jclass km_clazz, jlong font, jlong clonefont) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)clonefont) : -1;
#else
    (void)font;
    (void)clonefont;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneFontFamily(JNIEnv* km_env, jclass km_clazz, jlong fontfamily, jlong clonedfontfamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneFontFamily");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontfamily, (void*)(uintptr_t)clonedfontfamily) : -1;
#else
    (void)fontfamily;
    (void)clonedfontfamily;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneImage(JNIEnv* km_env, jclass km_clazz, jlong image, jlong cloneimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)cloneimage) : -1;
#else
    (void)image;
    (void)cloneimage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jlong cloneimageattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneImageAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (void*)(uintptr_t)cloneimageattr) : -1;
#else
    (void)imageattr;
    (void)cloneimageattr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong clonematrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)clonematrix) : -1;
#else
    (void)matrix;
    (void)clonematrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipClonePath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong clonepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClonePath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)clonepath) : -1;
#else
    (void)path;
    (void)clonepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipClonePen(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong clonepen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClonePen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)clonepen) : -1;
#else
    (void)pen;
    (void)clonepen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong cloneregion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)cloneregion) : -1;
#else
    (void)region;
    (void)cloneregion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCloneStringFormat(JNIEnv* km_env, jclass km_clazz, jlong format, jlong newformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneStringFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)newformat) : -1;
#else
    (void)format;
    (void)newformat;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipClosePathFigure(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClosePathFigure");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipClosePathFigures(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClosePathFigures");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCombineRegionPath(JNIEnv* km_env, jclass km_clazz, jlong region, jlong path, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)path, (int32_t)combinemode) : -1;
#else
    (void)region;
    (void)path;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCombineRegionRect(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rect, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)rect, (int32_t)combinemode) : -1;
#else
    (void)region;
    (void)rect;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCombineRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rect, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)rect, (int32_t)combinemode) : -1;
#else
    (void)region;
    (void)rect;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCombineRegionRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong region2, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)region2, (int32_t)combinemode) : -1;
#else
    (void)region;
    (void)region2;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipComment(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint sizedata, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipComment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)sizedata, (void*)(uintptr_t)data) : -1;
#else
    (void)graphics;
    (void)sizedata;
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipConvertToEmfPlus(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jint emftype, jlong description, jlong out_metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)refgraphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)conversionfailureflag, (int32_t)emftype, (void*)(uintptr_t)description, (void*)(uintptr_t)out_metafile) : -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)emftype;
    (void)description;
    (void)out_metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipConvertToEmfPlusToFile(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jlong filename, jint emftype, jlong description, jlong out_metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlusToFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)refgraphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)conversionfailureflag, (void*)(uintptr_t)filename, (int32_t)emftype, (void*)(uintptr_t)description, (void*)(uintptr_t)out_metafile) : -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)filename;
    (void)emftype;
    (void)description;
    (void)out_metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipConvertToEmfPlusToStream(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jlong stream, jint emftype, jlong description, jlong out_metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlusToStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)refgraphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)conversionfailureflag, (void*)(uintptr_t)stream, (int32_t)emftype, (void*)(uintptr_t)description, (void*)(uintptr_t)out_metafile) : -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)stream;
    (void)emftype;
    (void)description;
    (void)out_metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateAdjustableArrowCap(JNIEnv* km_env, jclass km_clazz, jfloat height, jfloat width, jint isfilled, jlong cap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateAdjustableArrowCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((float)height, (float)width, (int32_t)isfilled, (void*)(uintptr_t)cap) : -1;
#else
    (void)height;
    (void)width;
    (void)isfilled;
    (void)cap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)filename;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromFileICM(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromFileICM");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)filename;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromGdiDib(JNIEnv* km_env, jclass km_clazz, jlong gdibitmapinfo, jlong gdibitmapdata, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromGdiDib");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)gdibitmapinfo, (void*)(uintptr_t)gdibitmapdata, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)gdibitmapinfo;
    (void)gdibitmapdata;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromGraphics(JNIEnv* km_env, jclass km_clazz, jint width, jint height, jlong target, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromGraphics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)width, (int32_t)height, (void*)(uintptr_t)target, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)width;
    (void)height;
    (void)target;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromHBITMAP(JNIEnv* km_env, jclass km_clazz, jlong hbm, jlong hpal, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromHBITMAP");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbm, (void*)(uintptr_t)hpal, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)hbm;
    (void)hpal;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromHICON(JNIEnv* km_env, jclass km_clazz, jlong hicon, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromHICON");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hicon, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)hicon;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromResource(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpbitmapname, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromResource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpbitmapname, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)hinstance;
    (void)lpbitmapname;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromScan0(JNIEnv* km_env, jclass km_clazz, jint width, jint height, jint stride, jint format, jlong scan0, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromScan0");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)width, (int32_t)height, (int32_t)stride, (int32_t)format, (void*)(uintptr_t)scan0, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)width;
    (void)height;
    (void)stride;
    (void)format;
    (void)scan0;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)stream;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateBitmapFromStreamICM(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromStreamICM");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)stream;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong graphics, jlong cachedbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateCachedBitmap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)graphics, (void*)(uintptr_t)cachedbitmap) : -1;
#else
    (void)bitmap;
    (void)graphics;
    (void)cachedbitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong fillpath, jlong strokepath, jint basecap, jfloat baseinset, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateCustomLineCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fillpath, (void*)(uintptr_t)strokepath, (int32_t)basecap, (float)baseinset, (void*)(uintptr_t)customcap) : -1;
#else
    (void)fillpath;
    (void)strokepath;
    (void)basecap;
    (void)baseinset;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFont(JNIEnv* km_env, jclass km_clazz, jlong fontfamily, jfloat emsize, jint style, jint unit, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontfamily, (float)emsize, (int32_t)style, (int32_t)unit, (void*)(uintptr_t)font) : -1;
#else
    (void)fontfamily;
    (void)emsize;
    (void)style;
    (void)unit;
    (void)font;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFontFamilyFromName(JNIEnv* km_env, jclass km_clazz, jlong name, jlong fontcollection, jlong fontfamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFamilyFromName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)fontcollection, (void*)(uintptr_t)fontfamily) : -1;
#else
    (void)name;
    (void)fontcollection;
    (void)fontfamily;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFontFromDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)font) : -1;
#else
    (void)hdc;
    (void)font;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFontFromLogfontA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong logfont, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromLogfontA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)logfont, (void*)(uintptr_t)font) : -1;
#else
    (void)hdc;
    (void)logfont;
    (void)font;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFontFromLogfontW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong logfont, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromLogfontW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)logfont, (void*)(uintptr_t)font) : -1;
#else
    (void)hdc;
    (void)logfont;
    (void)font;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFromHDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)graphics) : -1;
#else
    (void)hdc;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFromHDC2(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hdevice, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHDC2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hdevice, (void*)(uintptr_t)graphics) : -1;
#else
    (void)hdc;
    (void)hdevice;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFromHWND(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHWND");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)graphics) : -1;
#else
    (void)hwnd;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateFromHWNDICM(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHWNDICM");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)graphics) : -1;
#else
    (void)hwnd;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateHBITMAPFromBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong hbmreturn, jint background) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHBITMAPFromBitmap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)hbmreturn, (uint32_t)background) : -1;
#else
    (void)bitmap;
    (void)hbmreturn;
    (void)background;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateHICONFromBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong hbmreturn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHICONFromBitmap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bitmap, (void*)(uintptr_t)hbmreturn) : -1;
#else
    (void)bitmap;
    (void)hbmreturn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateHalftonePalette(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHalftonePalette");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateHatchBrush(JNIEnv* km_env, jclass km_clazz, jint hatchstyle, jint forecol, jint backcol, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHatchBrush");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hatchstyle, (uint32_t)forecol, (uint32_t)backcol, (void*)(uintptr_t)brush) : -1;
#else
    (void)hatchstyle;
    (void)forecol;
    (void)backcol;
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateImageAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr) : -1;
#else
    (void)imageattr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateLineBrush(JNIEnv* km_env, jclass km_clazz, jlong point1, jlong point2, jint color1, jint color2, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrush");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)point1, (void*)(uintptr_t)point2, (uint32_t)color1, (uint32_t)color2, (int32_t)wrapmode, (void*)(uintptr_t)linegradient) : -1;
#else
    (void)point1;
    (void)point2;
    (void)color1;
    (void)color2;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateLineBrushFromRect(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jint mode, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rect, (uint32_t)color1, (uint32_t)color2, (int32_t)mode, (int32_t)wrapmode, (void*)(uintptr_t)linegradient) : -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)mode;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateLineBrushFromRectI(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jint mode, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rect, (uint32_t)color1, (uint32_t)color2, (int32_t)mode, (int32_t)wrapmode, (void*)(uintptr_t)linegradient) : -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)mode;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateLineBrushFromRectWithAngle(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jfloat angle, jint isanglescalable, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectWithAngle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rect, (uint32_t)color1, (uint32_t)color2, (float)angle, (int32_t)isanglescalable, (int32_t)wrapmode, (void*)(uintptr_t)linegradient) : -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)angle;
    (void)isanglescalable;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateLineBrushFromRectWithAngleI(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jfloat angle, jint isanglescalable, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectWithAngleI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rect, (uint32_t)color1, (uint32_t)color2, (float)angle, (int32_t)isanglescalable, (int32_t)wrapmode, (void*)(uintptr_t)linegradient) : -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)angle;
    (void)isanglescalable;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateLineBrushI(JNIEnv* km_env, jclass km_clazz, jlong point1, jlong point2, jint color1, jint color2, jint wrapmode, jlong linegradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)point1, (void*)(uintptr_t)point2, (uint32_t)color1, (uint32_t)color2, (int32_t)wrapmode, (void*)(uintptr_t)linegradient) : -1;
#else
    (void)point1;
    (void)point2;
    (void)color1;
    (void)color2;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix) : -1;
#else
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMatrix2(JNIEnv* km_env, jclass km_clazz, jfloat m11, jfloat m12, jfloat m21, jfloat m22, jfloat dx, jfloat dy, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((float)m11, (float)m12, (float)m21, (float)m22, (float)dx, (float)dy, (void*)(uintptr_t)matrix) : -1;
#else
    (void)m11;
    (void)m12;
    (void)m21;
    (void)m22;
    (void)dx;
    (void)dy;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMatrix3(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong dstplg, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rect, (void*)(uintptr_t)dstplg, (void*)(uintptr_t)matrix) : -1;
#else
    (void)rect;
    (void)dstplg;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMatrix3I(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong dstplg, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix3I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rect, (void*)(uintptr_t)dstplg, (void*)(uintptr_t)matrix) : -1;
#else
    (void)rect;
    (void)dstplg;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMetafileFromEmf(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint deleteemf, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromEmf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (int32_t)deleteemf, (void*)(uintptr_t)metafile) : -1;
#else
    (void)hemf;
    (void)deleteemf;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMetafileFromFile(JNIEnv* km_env, jclass km_clazz, jlong file, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)metafile) : -1;
#else
    (void)file;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMetafileFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)metafile) : -1;
#else
    (void)stream;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMetafileFromWmf(JNIEnv* km_env, jclass km_clazz, jlong hwmf, jint deletewmf, jlong wmfplaceablefileheader, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromWmf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwmf, (int32_t)deletewmf, (void*)(uintptr_t)wmfplaceablefileheader, (void*)(uintptr_t)metafile) : -1;
#else
    (void)hwmf;
    (void)deletewmf;
    (void)wmfplaceablefileheader;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateMetafileFromWmfFile(JNIEnv* km_env, jclass km_clazz, jlong file, jlong wmfplaceablefileheader, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromWmfFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)wmfplaceablefileheader, (void*)(uintptr_t)metafile) : -1;
#else
    (void)file;
    (void)wmfplaceablefileheader;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePath(JNIEnv* km_env, jclass km_clazz, jint brushmode, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)brushmode, (void*)(uintptr_t)path) : -1;
#else
    (void)brushmode;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePath2(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2, (int32_t)param3, (void*)(uintptr_t)path) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePath2I(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2, (int32_t)param3, (void*)(uintptr_t)path) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePathGradient(JNIEnv* km_env, jclass km_clazz, jlong points, jint count, jint wrapmode, jlong polygradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)points, (int32_t)count, (int32_t)wrapmode, (void*)(uintptr_t)polygradient) : -1;
#else
    (void)points;
    (void)count;
    (void)wrapmode;
    (void)polygradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePathGradientFromPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong polygradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradientFromPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)polygradient) : -1;
#else
    (void)path;
    (void)polygradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePathGradientI(JNIEnv* km_env, jclass km_clazz, jlong points, jint count, jint wrapmode, jlong polygradient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradientI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)points, (int32_t)count, (int32_t)wrapmode, (void*)(uintptr_t)polygradient) : -1;
#else
    (void)points;
    (void)count;
    (void)wrapmode;
    (void)polygradient;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePathIter(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathIter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)path) : -1;
#else
    (void)iterator;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePen1(JNIEnv* km_env, jclass km_clazz, jint color, jfloat width, jint unit, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePen1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)color, (float)width, (int32_t)unit, (void*)(uintptr_t)pen) : -1;
#else
    (void)color;
    (void)width;
    (void)unit;
    (void)pen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreatePen2(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat width, jint unit, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePen2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)width, (int32_t)unit, (void*)(uintptr_t)pen) : -1;
#else
    (void)brush;
    (void)width;
    (void)unit;
    (void)pen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateRegion(JNIEnv* km_env, jclass km_clazz, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region) : -1;
#else
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateRegionHrgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionHrgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgn, (void*)(uintptr_t)region) : -1;
#else
    (void)hrgn;
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateRegionPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)region) : -1;
#else
    (void)path;
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateRegionRect(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rect, (void*)(uintptr_t)region) : -1;
#else
    (void)rect;
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rect, (void*)(uintptr_t)region) : -1;
#else
    (void)rect;
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateRegionRgnData(JNIEnv* km_env, jclass km_clazz, jlong regiondata, jint size, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRgnData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)regiondata, (int32_t)size, (void*)(uintptr_t)region) : -1;
#else
    (void)regiondata;
    (void)size;
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateSolidFill(JNIEnv* km_env, jclass km_clazz, jint color, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateSolidFill");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)color, (void*)(uintptr_t)brush) : -1;
#else
    (void)color;
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateStreamOnFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jint access, jlong stream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateStreamOnFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (uint32_t)access, (void*)(uintptr_t)stream) : -1;
#else
    (void)filename;
    (void)access;
    (void)stream;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateStringFormat(JNIEnv* km_env, jclass km_clazz, jint formatattributes, jshort language, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateStringFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)formatattributes, (uint16_t)language, (void*)(uintptr_t)format) : -1;
#else
    (void)formatattributes;
    (void)language;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateTexture(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (int32_t)wrapmode, (void*)(uintptr_t)texture) : -1;
#else
    (void)image;
    (void)wrapmode;
    (void)texture;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateTexture2(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jfloat x, jfloat y, jfloat width, jfloat height, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (int32_t)wrapmode, (float)x, (float)y, (float)width, (float)height, (void*)(uintptr_t)texture) : -1;
#else
    (void)image;
    (void)wrapmode;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateTexture2I(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jint x, jint y, jint width, jint height, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (int32_t)wrapmode, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (void*)(uintptr_t)texture) : -1;
#else
    (void)image;
    (void)wrapmode;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateTextureIA(JNIEnv* km_env, jclass km_clazz, jlong image, jlong imageattributes, jfloat x, jfloat y, jfloat width, jfloat height, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTextureIA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)imageattributes, (float)x, (float)y, (float)width, (float)height, (void*)(uintptr_t)texture) : -1;
#else
    (void)image;
    (void)imageattributes;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipCreateTextureIAI(JNIEnv* km_env, jclass km_clazz, jlong image, jlong imageattributes, jint x, jint y, jint width, jint height, jlong texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTextureIAI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)imageattributes, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (void*)(uintptr_t)texture) : -1;
#else
    (void)image;
    (void)imageattributes;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteBrush(JNIEnv* km_env, jclass km_clazz, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteBrush");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush) : -1;
#else
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong cachedbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteCachedBitmap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cachedbitmap) : -1;
#else
    (void)cachedbitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteCustomLineCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap) : -1;
#else
    (void)customcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteEffect(JNIEnv* km_env, jclass km_clazz, jlong effect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteEffect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)effect) : -1;
#else
    (void)effect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteFont(JNIEnv* km_env, jclass km_clazz, jlong font) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font) : -1;
#else
    (void)font;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteFontFamily(JNIEnv* km_env, jclass km_clazz, jlong fontfamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteFontFamily");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontfamily) : -1;
#else
    (void)fontfamily;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteGraphics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics) : -1;
#else
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix) : -1;
#else
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeletePath(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeletePathIter(JNIEnv* km_env, jclass km_clazz, jlong iterator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePathIter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator) : -1;
#else
    (void)iterator;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeletePen(JNIEnv* km_env, jclass km_clazz, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen) : -1;
#else
    (void)pen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeletePrivateFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePrivateFontCollection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontcollection) : -1;
#else
    (void)fontcollection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteRegion(JNIEnv* km_env, jclass km_clazz, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region) : -1;
#else
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDeleteStringFormat(JNIEnv* km_env, jclass km_clazz, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteStringFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format) : -1;
#else
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDisposeImage(JNIEnv* km_env, jclass km_clazz, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDisposeImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image) : -1;
#else
    (void)image;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDisposeImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDisposeImageAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr) : -1;
#else
    (void)imageattr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawArc(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawArc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawArcI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawArcI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawBezier(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat x3, jfloat y3, jfloat x4, jfloat y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBezier");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x1, (float)y1, (float)x2, (float)y2, (float)x3, (float)y3, (float)x4, (float)y4) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawBezierI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBezierI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)x3, (int32_t)y3, (int32_t)x4, (int32_t)y4) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawBeziers(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBeziers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawBeziersI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBeziersI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong cachedbitmap, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCachedBitmap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)cachedbitmap, (int32_t)x, (int32_t)y) : -1;
#else
    (void)graphics;
    (void)cachedbitmap;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (float)tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (float)tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurveI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (float)tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (float)tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawCurve3(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (int32_t)offset, (int32_t)numberofsegments, (float)tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawCurve3I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve3I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count, (int32_t)offset, (int32_t)numberofsegments, (float)tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurveI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawDriverString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong text, jint length, jlong font, jlong brush, jlong positions, jint flags, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawDriverString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)text, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)brush, (void*)(uintptr_t)positions, (int32_t)flags, (void*)(uintptr_t)matrix) : -1;
#else
    (void)graphics;
    (void)text;
    (void)length;
    (void)font;
    (void)brush;
    (void)positions;
    (void)flags;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawEllipse(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawEllipse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x, (float)y, (float)width, (float)height) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawEllipseI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawEllipseI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImage(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (float)x, (float)y) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImageFX(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong source, jlong xform, jlong effect, jlong imageattributes, jint srcunit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageFX");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)source, (void*)(uintptr_t)xform, (void*)(uintptr_t)effect, (void*)(uintptr_t)imageattributes, (int32_t)srcunit) : -1;
#else
    (void)graphics;
    (void)image;
    (void)source;
    (void)xform;
    (void)effect;
    (void)imageattributes;
    (void)srcunit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImageI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (int32_t)x, (int32_t)y) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImagePointRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (float)x, (float)y, (float)srcx, (float)srcy, (float)srcwidth, (float)srcheight, (int32_t)srcunit) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImagePointRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (int32_t)x, (int32_t)y, (int32_t)srcx, (int32_t)srcy, (int32_t)srcwidth, (int32_t)srcheight, (int32_t)srcunit) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImagePoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong dstpoints, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)dstpoints, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)image;
    (void)dstpoints;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImagePointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong dstpoints, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)dstpoints, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)image;
    (void)dstpoints;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImagePointsRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong points, jint count, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, float, float, float, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)points, (int32_t)count, (float)srcx, (float)srcy, (float)srcwidth, (float)srcheight, (int32_t)srcunit, (void*)(uintptr_t)imageattributes, (int64_t)callback, (void*)(uintptr_t)callbackdata) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImagePointsRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong points, jint count, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (void*)(uintptr_t)points, (int32_t)count, (int32_t)srcx, (int32_t)srcy, (int32_t)srcwidth, (int32_t)srcheight, (int32_t)srcunit, (void*)(uintptr_t)imageattributes, (int64_t)callback, (void*)(uintptr_t)callbackdata) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImageRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (float)x, (float)y, (float)width, (float)height) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImageRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImageRectRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat dstx, jfloat dsty, jfloat dstwidth, jfloat dstheight, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, float, float, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (float)dstx, (float)dsty, (float)dstwidth, (float)dstheight, (float)srcx, (float)srcy, (float)srcwidth, (float)srcheight, (int32_t)srcunit, (void*)(uintptr_t)imageattributes, (int64_t)callback, (void*)(uintptr_t)callbackdata) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawImageRectRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint dstx, jint dsty, jint dstwidth, jint dstheight, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)image, (int32_t)dstx, (int32_t)dsty, (int32_t)dstwidth, (int32_t)dstheight, (int32_t)srcx, (int32_t)srcy, (int32_t)srcwidth, (int32_t)srcheight, (int32_t)srcunit, (void*)(uintptr_t)imageattributes, (int64_t)callback, (void*)(uintptr_t)callbackdata) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawLine(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x1, (float)y1, (float)x2, (float)y2) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawLineI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLineI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawLines(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLines");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawLinesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLinesI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)path) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawPie(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPie");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawPieI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPieI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawPolygon(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPolygon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawPolygonI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPolygonI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawRectangle(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (float)x, (float)y, (float)width, (float)height) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawRectangleI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangleI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawRectangles(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)rects, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectanglesI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pen, (void*)(uintptr_t)rects, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipDrawString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)stringformat, (void*)(uintptr_t)brush) : -1;
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEmfToWmfBits(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cbdata16, jlong pdata16, jint imapmode, jint eflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEmfToWmfBits");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cbdata16, (void*)(uintptr_t)pdata16, (int32_t)imapmode, (int32_t)eflags) : 0;
#else
    (void)hemf;
    (void)cbdata16;
    (void)pdata16;
    (void)imapmode;
    (void)eflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEndContainer(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEndContainer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)state) : -1;
#else
    (void)graphics;
    (void)state;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileDestPoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoint, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileDestPointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoint, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileDestPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoints, (int32_t)count, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileDestPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPointsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoints, (int32_t)count, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileDestRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destrect, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileDestRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destrect, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileSrcRectDestPoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoint, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileSrcRectDestPointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoint, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileSrcRectDestPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoints, (int32_t)count, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileSrcRectDestPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPointsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destpoints, (int32_t)count, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileSrcRectDestRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destrect, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipEnumerateMetafileSrcRectDestRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)metafile, (void*)(uintptr_t)destrect, (void*)(uintptr_t)srcrect, (int32_t)srcunit, (int64_t)callback, (void*)(uintptr_t)callbackdata, (void*)(uintptr_t)imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jfloat tension, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count, (float)tension, (int32_t)fillmode) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)tension;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jfloat tension, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count, (float)tension, (int32_t)fillmode) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)tension;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurveI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillEllipse(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillEllipse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (float)x, (float)y, (float)width, (float)height) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillEllipseI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillEllipseI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)path) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillPie(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPie");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (float)x, (float)y, (float)width, (float)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillPieI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPieI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (float)startangle, (float)sweepangle) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillPolygon(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count, (int32_t)fillmode) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillPolygon2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillPolygon2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon2I");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillPolygonI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygonI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)points, (int32_t)count, (int32_t)fillmode) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillRectangle(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (float)x, (float)y, (float)width, (float)height) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillRectangleI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangleI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillRectangles(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)rects, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong rects, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectanglesI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)rects, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFillRegion(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)brush, (void*)(uintptr_t)region) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFindFirstImageItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFindFirstImageItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)item) : -1;
#else
    (void)image;
    (void)item;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFindNextImageItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFindNextImageItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)item) : -1;
#else
    (void)image;
    (void)item;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFlattenPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jfloat flatness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFlattenPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)matrix, (float)flatness) : -1;
#else
    (void)path;
    (void)matrix;
    (void)flatness;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFlush(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint intention) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFlush");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)intention) : -1;
#else
    (void)graphics;
    (void)intention;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipFree(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptr);
#else
    (void)ptr;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetAdjustableArrowCapFillState(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong fillstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapFillState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cap, (void*)(uintptr_t)fillstate) : -1;
#else
    (void)cap;
    (void)fillstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetAdjustableArrowCapHeight(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapHeight");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cap, (void*)(uintptr_t)height) : -1;
#else
    (void)cap;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetAdjustableArrowCapMiddleInset(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong middleinset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapMiddleInset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cap, (void*)(uintptr_t)middleinset) : -1;
#else
    (void)cap;
    (void)middleinset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetAdjustableArrowCapWidth(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapWidth");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cap, (void*)(uintptr_t)width) : -1;
#else
    (void)cap;
    (void)width;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetAllPropertyItems(JNIEnv* km_env, jclass km_clazz, jlong image, jint totalbuffersize, jint numproperties, jlong allitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAllPropertyItems");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (uint32_t)totalbuffersize, (uint32_t)numproperties, (void*)(uintptr_t)allitems) : -1;
#else
    (void)image;
    (void)totalbuffersize;
    (void)numproperties;
    (void)allitems;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetBrushType(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetBrushType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)type) : -1;
#else
    (void)brush;
    (void)type;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCellAscent(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong cellascent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCellAscent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)cellascent) : -1;
#else
    (void)family;
    (void)style;
    (void)cellascent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCellDescent(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong celldescent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCellDescent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)celldescent) : -1;
#else
    (void)family;
    (void)style;
    (void)celldescent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetClip(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClip");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)region) : -1;
#else
    (void)graphics;
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetClipBounds(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClipBounds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)rect) : -1;
#else
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetClipBoundsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClipBoundsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)rect) : -1;
#else
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCompositingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong compositingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCompositingMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)compositingmode) : -1;
#else
    (void)graphics;
    (void)compositingmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCompositingQuality(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong compositingquality) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCompositingQuality");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)compositingquality) : -1;
#else
    (void)graphics;
    (void)compositingquality;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCustomLineCapBaseCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong basecap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapBaseCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)basecap) : -1;
#else
    (void)customcap;
    (void)basecap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCustomLineCapBaseInset(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong inset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapBaseInset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)inset) : -1;
#else
    (void)customcap;
    (void)inset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCustomLineCapStrokeCaps(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong startcap, jlong endcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapStrokeCaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)startcap, (void*)(uintptr_t)endcap) : -1;
#else
    (void)customcap;
    (void)startcap;
    (void)endcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCustomLineCapStrokeJoin(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong linejoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapStrokeJoin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)linejoin) : -1;
#else
    (void)customcap;
    (void)linejoin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCustomLineCapType(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong captype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)captype) : -1;
#else
    (void)customcap;
    (void)captype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetCustomLineCapWidthScale(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong widthscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapWidthScale");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (void*)(uintptr_t)widthscale) : -1;
#else
    (void)customcap;
    (void)widthscale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetDC(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)hdc) : -1;
#else
    (void)graphics;
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetDpiX(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDpiX");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)dpi) : -1;
#else
    (void)graphics;
    (void)dpi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetDpiY(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDpiY");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)dpi) : -1;
#else
    (void)graphics;
    (void)dpi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetEffectParameterSize(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEffectParameterSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)effect, (void*)(uintptr_t)size) : -1;
#else
    (void)effect;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetEffectParameters(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong size, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEffectParameters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)effect, (void*)(uintptr_t)size, (void*)(uintptr_t)params) : -1;
#else
    (void)effect;
    (void)size;
    (void)params;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetEmHeight(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong emheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEmHeight");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)emheight) : -1;
#else
    (void)family;
    (void)style;
    (void)emheight;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetEncoderParameterList(JNIEnv* km_env, jclass km_clazz, jlong image, jlong clsidencoder, jint size, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEncoderParameterList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)clsidencoder, (uint32_t)size, (void*)(uintptr_t)buffer) : -1;
#else
    (void)image;
    (void)clsidencoder;
    (void)size;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetEncoderParameterListSize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong clsidencoder, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEncoderParameterListSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)clsidencoder, (void*)(uintptr_t)size) : -1;
#else
    (void)image;
    (void)clsidencoder;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFamily(JNIEnv* km_env, jclass km_clazz, jlong font, jlong family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFamily");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)family) : -1;
#else
    (void)font;
    (void)family;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFamilyName(JNIEnv* km_env, jclass km_clazz, jlong family, jlong name, jshort language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFamilyName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)family, (void*)(uintptr_t)name, (uint16_t)language) : -1;
#else
    (void)family;
    (void)name;
    (void)language;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFontCollectionFamilyCount(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong numfound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontCollectionFamilyCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontcollection, (void*)(uintptr_t)numfound) : -1;
#else
    (void)fontcollection;
    (void)numfound;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFontCollectionFamilyList(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jint numsought, jlong gpfamilies, jlong numfound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontCollectionFamilyList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontcollection, (int32_t)numsought, (void*)(uintptr_t)gpfamilies, (void*)(uintptr_t)numfound) : -1;
#else
    (void)fontcollection;
    (void)numsought;
    (void)gpfamilies;
    (void)numfound;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFontHeight(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontHeight");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)graphics, (void*)(uintptr_t)height) : -1;
#else
    (void)font;
    (void)graphics;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFontHeightGivenDPI(JNIEnv* km_env, jclass km_clazz, jlong font, jfloat dpi, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontHeightGivenDPI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (float)dpi, (void*)(uintptr_t)height) : -1;
#else
    (void)font;
    (void)dpi;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFontSize(JNIEnv* km_env, jclass km_clazz, jlong font, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)size) : -1;
#else
    (void)font;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFontStyle(JNIEnv* km_env, jclass km_clazz, jlong font, jlong style) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontStyle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)style) : -1;
#else
    (void)font;
    (void)style;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetFontUnit(JNIEnv* km_env, jclass km_clazz, jlong font, jlong unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)unit) : -1;
#else
    (void)font;
    (void)unit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetGenericFontFamilyMonospace(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilyMonospace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nativefamily) : -1;
#else
    (void)nativefamily;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetGenericFontFamilySansSerif(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilySansSerif");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nativefamily) : -1;
#else
    (void)nativefamily;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetGenericFontFamilySerif(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilySerif");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nativefamily) : -1;
#else
    (void)nativefamily;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetHatchBackgroundColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong backcol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchBackgroundColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)backcol) : -1;
#else
    (void)brush;
    (void)backcol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetHatchForegroundColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong forecol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchForegroundColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)forecol) : -1;
#else
    (void)brush;
    (void)forecol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetHatchStyle(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong hatchstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchStyle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)hatchstyle) : -1;
#else
    (void)brush;
    (void)hatchstyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetHemfFromMetafile(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong hemf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHemfFromMetafile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)metafile, (void*)(uintptr_t)hemf) : -1;
#else
    (void)metafile;
    (void)hemf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageAttributesAdjustedPalette(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jlong colorpalette, jint coloradjusttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageAttributesAdjustedPalette");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (void*)(uintptr_t)colorpalette, (int32_t)coloradjusttype) : -1;
#else
    (void)imageattr;
    (void)colorpalette;
    (void)coloradjusttype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageBounds(JNIEnv* km_env, jclass km_clazz, jlong image, jlong srcrect, jlong srcunit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageBounds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)srcrect, (void*)(uintptr_t)srcunit) : -1;
#else
    (void)image;
    (void)srcrect;
    (void)srcunit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageDecoders(JNIEnv* km_env, jclass km_clazz, jint numdecoders, jint size, jlong decoders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDecoders");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)numdecoders, (uint32_t)size, (void*)(uintptr_t)decoders) : -1;
#else
    (void)numdecoders;
    (void)size;
    (void)decoders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageDecodersSize(JNIEnv* km_env, jclass km_clazz, jlong numdecoders, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDecodersSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)numdecoders, (void*)(uintptr_t)size) : -1;
#else
    (void)numdecoders;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageDimension(JNIEnv* km_env, jclass km_clazz, jlong image, jlong width, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDimension");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)width, (void*)(uintptr_t)height) : -1;
#else
    (void)image;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageEncoders(JNIEnv* km_env, jclass km_clazz, jint numencoders, jint size, jlong encoders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageEncoders");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)numencoders, (uint32_t)size, (void*)(uintptr_t)encoders) : -1;
#else
    (void)numencoders;
    (void)size;
    (void)encoders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageEncodersSize(JNIEnv* km_env, jclass km_clazz, jlong numencoders, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageEncodersSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)numencoders, (void*)(uintptr_t)size) : -1;
#else
    (void)numencoders;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageFlags(JNIEnv* km_env, jclass km_clazz, jlong image, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)flags) : -1;
#else
    (void)image;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageGraphicsContext(JNIEnv* km_env, jclass km_clazz, jlong image, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageGraphicsContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)graphics) : -1;
#else
    (void)image;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageHeight(JNIEnv* km_env, jclass km_clazz, jlong image, jlong height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageHeight");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)height) : -1;
#else
    (void)image;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageHorizontalResolution(JNIEnv* km_env, jclass km_clazz, jlong image, jlong resolution) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageHorizontalResolution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)resolution) : -1;
#else
    (void)image;
    (void)resolution;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageItemData(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageItemData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)item) : -1;
#else
    (void)image;
    (void)item;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImagePalette(JNIEnv* km_env, jclass km_clazz, jlong image, jlong palette, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePalette");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)palette, (int32_t)size) : -1;
#else
    (void)image;
    (void)palette;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImagePaletteSize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePaletteSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)size) : -1;
#else
    (void)image;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImagePixelFormat(JNIEnv* km_env, jclass km_clazz, jlong image, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePixelFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)format) : -1;
#else
    (void)image;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageRawFormat(JNIEnv* km_env, jclass km_clazz, jlong image, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageRawFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)format) : -1;
#else
    (void)image;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageThumbnail(JNIEnv* km_env, jclass km_clazz, jlong image, jint thumbwidth, jint thumbheight, jlong thumbimage, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageThumbnail");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (uint32_t)thumbwidth, (uint32_t)thumbheight, (void*)(uintptr_t)thumbimage, (int64_t)callback, (void*)(uintptr_t)callbackdata) : -1;
#else
    (void)image;
    (void)thumbwidth;
    (void)thumbheight;
    (void)thumbimage;
    (void)callback;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageType(JNIEnv* km_env, jclass km_clazz, jlong image, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)type) : -1;
#else
    (void)image;
    (void)type;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageVerticalResolution(JNIEnv* km_env, jclass km_clazz, jlong image, jlong resolution) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageVerticalResolution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)resolution) : -1;
#else
    (void)image;
    (void)resolution;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetImageWidth(JNIEnv* km_env, jclass km_clazz, jlong image, jlong width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageWidth");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)width) : -1;
#else
    (void)image;
    (void)width;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetInterpolationMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong interpolationmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetInterpolationMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)interpolationmode) : -1;
#else
    (void)graphics;
    (void)interpolationmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineBlendCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineColors(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong colors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineColors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)colors) : -1;
#else
    (void)brush;
    (void)colors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong usegammacorrection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineGammaCorrection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)usegammacorrection) : -1;
#else
    (void)brush;
    (void)usegammacorrection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLinePresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLinePresetBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLinePresetBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLinePresetBlendCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineRect(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)rect) : -1;
#else
    (void)brush;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineRectI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)rect) : -1;
#else
    (void)brush;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineSpacing(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong linespacing) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineSpacing");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)linespacing) : -1;
#else
    (void)family;
    (void)style;
    (void)linespacing;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLineWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineWrapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLogFontA(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong logfonta) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLogFontA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)graphics, (void*)(uintptr_t)logfonta) : -1;
#else
    (void)font;
    (void)graphics;
    (void)logfonta;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetLogFontW(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong logfontw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLogFontW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)font, (void*)(uintptr_t)graphics, (void*)(uintptr_t)logfontw) : -1;
#else
    (void)font;
    (void)graphics;
    (void)logfontw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetMatrixElements(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrixout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMatrixElements");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)matrixout) : -1;
#else
    (void)matrix;
    (void)matrixout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetMetafileDownLevelRasterizationLimit(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong metafilerasterizationlimitdpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileDownLevelRasterizationLimit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)metafile, (void*)(uintptr_t)metafilerasterizationlimitdpi) : -1;
#else
    (void)metafile;
    (void)metafilerasterizationlimitdpi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetMetafileHeaderFromEmf(JNIEnv* km_env, jclass km_clazz, jlong hemf, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromEmf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (void*)(uintptr_t)header) : -1;
#else
    (void)hemf;
    (void)header;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetMetafileHeaderFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)header) : -1;
#else
    (void)filename;
    (void)header;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetMetafileHeaderFromMetafile(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromMetafile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)metafile, (void*)(uintptr_t)header) : -1;
#else
    (void)metafile;
    (void)header;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetMetafileHeaderFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)header) : -1;
#else
    (void)stream;
    (void)header;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetMetafileHeaderFromWmf(JNIEnv* km_env, jclass km_clazz, jlong hwmf, jlong wmfplaceablefileheader, jlong header) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromWmf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwmf, (void*)(uintptr_t)wmfplaceablefileheader, (void*)(uintptr_t)header) : -1;
#else
    (void)hwmf;
    (void)wmfplaceablefileheader;
    (void)header;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetNearestColor(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong argb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetNearestColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)argb) : -1;
#else
    (void)graphics;
    (void)argb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPageScale(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPageScale");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)scale) : -1;
#else
    (void)graphics;
    (void)scale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPageUnit(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPageUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)unit) : -1;
#else
    (void)graphics;
    (void)unit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathData(JNIEnv* km_env, jclass km_clazz, jlong path, jlong pathdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)pathdata) : -1;
#else
    (void)path;
    (void)pathdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathFillMode(JNIEnv* km_env, jclass km_clazz, jlong path, jlong fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathFillMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)fillmode) : -1;
#else
    (void)path;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientBlendCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientCenterColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong colors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)colors) : -1;
#else
    (void)brush;
    (void)colors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientCenterPoint(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)points) : -1;
#else
    (void)brush;
    (void)points;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientCenterPointI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)points) : -1;
#else
    (void)brush;
    (void)points;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientFocusScales(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong xscale, jlong yscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientFocusScales");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)xscale, (void*)(uintptr_t)yscale) : -1;
#else
    (void)brush;
    (void)xscale;
    (void)yscale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong usegammacorrection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientGammaCorrection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)usegammacorrection) : -1;
#else
    (void)brush;
    (void)usegammacorrection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientPath(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)path) : -1;
#else
    (void)brush;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientPointCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPointCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientPresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPresetBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientPresetBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPresetBlendCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientRect(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)rect) : -1;
#else
    (void)brush;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientRectI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)rect) : -1;
#else
    (void)brush;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientSurroundColorCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientSurroundColorCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientSurroundColorsWithCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientSurroundColorsWithCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)color, (void*)(uintptr_t)count) : -1;
#else
    (void)brush;
    (void)color;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathGradientWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientWrapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathLastPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jlong lastpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathLastPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)lastpoint) : -1;
#else
    (void)path;
    (void)lastpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathPoints(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathPoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)param0;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathPointsI(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathPointsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)param0;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathTypes(JNIEnv* km_env, jclass km_clazz, jlong path, jlong types, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathTypes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)types, (int32_t)count) : -1;
#else
    (void)path;
    (void)types;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathWorldBounds(JNIEnv* km_env, jclass km_clazz, jlong path, jlong bounds, jlong matrix, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathWorldBounds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)bounds, (void*)(uintptr_t)matrix, (void*)(uintptr_t)pen) : -1;
#else
    (void)path;
    (void)bounds;
    (void)matrix;
    (void)pen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPathWorldBoundsI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong bounds, jlong matrix, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathWorldBoundsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)bounds, (void*)(uintptr_t)matrix, (void*)(uintptr_t)pen) : -1;
#else
    (void)path;
    (void)bounds;
    (void)matrix;
    (void)pen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenBrushFill(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenBrushFill");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)brush) : -1;
#else
    (void)pen;
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenColor(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong argb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)argb) : -1;
#else
    (void)pen;
    (void)argb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenCompoundArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCompoundArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dash, (int32_t)count) : -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenCompoundCount(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCompoundCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)count) : -1;
#else
    (void)pen;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenCustomEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCustomEndCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)customcap) : -1;
#else
    (void)pen;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenCustomStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCustomStartCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)customcap) : -1;
#else
    (void)pen;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenDashArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dash, (int32_t)count) : -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenDashCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dashcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashCap197819");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dashcap) : -1;
#else
    (void)pen;
    (void)dashcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenDashCount(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)count) : -1;
#else
    (void)pen;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenDashOffset(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong offset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashOffset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)offset) : -1;
#else
    (void)pen;
    (void)offset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenDashStyle(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dashstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashStyle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dashstyle) : -1;
#else
    (void)pen;
    (void)dashstyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong endcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenEndCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)endcap) : -1;
#else
    (void)pen;
    (void)endcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenFillType(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenFillType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)type) : -1;
#else
    (void)pen;
    (void)type;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenLineJoin(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong linejoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenLineJoin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)linejoin) : -1;
#else
    (void)pen;
    (void)linejoin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong miterlimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenMiterLimit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)miterlimit) : -1;
#else
    (void)pen;
    (void)miterlimit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenMode(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong penmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)penmode) : -1;
#else
    (void)pen;
    (void)penmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong startcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenStartCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)startcap) : -1;
#else
    (void)pen;
    (void)startcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)matrix) : -1;
#else
    (void)pen;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenUnit(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)unit) : -1;
#else
    (void)pen;
    (void)unit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPenWidth(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenWidth");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)width) : -1;
#else
    (void)pen;
    (void)width;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPixelOffsetMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pixeloffsetmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPixelOffsetMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)pixeloffsetmode) : -1;
#else
    (void)graphics;
    (void)pixeloffsetmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPointCount(JNIEnv* km_env, jclass km_clazz, jlong path, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPointCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)count) : -1;
#else
    (void)path;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPropertyCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong numofproperty) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)numofproperty) : -1;
#else
    (void)image;
    (void)numofproperty;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPropertyIdList(JNIEnv* km_env, jclass km_clazz, jlong image, jint numofproperty, jlong list) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyIdList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (uint32_t)numofproperty, (void*)(uintptr_t)list) : -1;
#else
    (void)image;
    (void)numofproperty;
    (void)list;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid, jint propsize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (uint32_t)propid, (uint32_t)propsize, (void*)(uintptr_t)buffer) : -1;
#else
    (void)image;
    (void)propid;
    (void)propsize;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPropertyItemSize(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyItemSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (uint32_t)propid, (void*)(uintptr_t)size) : -1;
#else
    (void)image;
    (void)propid;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetPropertySize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong totalbuffersize, jlong numproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertySize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)totalbuffersize, (void*)(uintptr_t)numproperties) : -1;
#else
    (void)image;
    (void)totalbuffersize;
    (void)numproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRegionBounds(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionBounds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)rect) : -1;
#else
    (void)region;
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRegionBoundsI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionBoundsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)rect) : -1;
#else
    (void)region;
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRegionData(JNIEnv* km_env, jclass km_clazz, jlong region, jlong buffer, jint buffersize, jlong sizefilled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)sizefilled) : -1;
#else
    (void)region;
    (void)buffer;
    (void)buffersize;
    (void)sizefilled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRegionDataSize(JNIEnv* km_env, jclass km_clazz, jlong region, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionDataSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)buffersize) : -1;
#else
    (void)region;
    (void)buffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRegionHRgn(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionHRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)hrgn) : -1;
#else
    (void)region;
    (void)graphics;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRegionScans(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rects, jlong count, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScans");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)rects, (void*)(uintptr_t)count, (void*)(uintptr_t)matrix) : -1;
#else
    (void)region;
    (void)rects;
    (void)count;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRegionScansCount(JNIEnv* km_env, jclass km_clazz, jlong region, jlong count, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScansCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)count, (void*)(uintptr_t)matrix) : -1;
#else
    (void)region;
    (void)count;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRegionScansI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rects, jlong count, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScansI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)rects, (void*)(uintptr_t)count, (void*)(uintptr_t)matrix) : -1;
#else
    (void)region;
    (void)rects;
    (void)count;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetRenderingOrigin(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong x, jlong y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRenderingOrigin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)x, (void*)(uintptr_t)y) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetSmoothingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong smoothingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetSmoothingMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)smoothingmode) : -1;
#else
    (void)graphics;
    (void)smoothingmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetSolidFillColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetSolidFillColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)color) : -1;
#else
    (void)brush;
    (void)color;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jlong align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatAlign");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)align) : -1;
#else
    (void)format;
    (void)align;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatDigitSubstitution(JNIEnv* km_env, jclass km_clazz, jlong format, jlong language, jlong substitute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatDigitSubstitution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)language, (void*)(uintptr_t)substitute) : -1;
#else
    (void)format;
    (void)language;
    (void)substitute;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatFlags(JNIEnv* km_env, jclass km_clazz, jlong format, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)flags) : -1;
#else
    (void)format;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatHotkeyPrefix(JNIEnv* km_env, jclass km_clazz, jlong format, jlong hotkeyprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatHotkeyPrefix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)hotkeyprefix) : -1;
#else
    (void)format;
    (void)hotkeyprefix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatLineAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jlong align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatLineAlign");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)align) : -1;
#else
    (void)format;
    (void)align;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatMeasurableCharacterRangeCount(JNIEnv* km_env, jclass km_clazz, jlong format, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatMeasurableCharacterRangeCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)count) : -1;
#else
    (void)format;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatTabStopCount(JNIEnv* km_env, jclass km_clazz, jlong format, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTabStopCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)count) : -1;
#else
    (void)format;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatTabStops(JNIEnv* km_env, jclass km_clazz, jlong format, jint count, jlong firsttaboffset, jlong tabstops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTabStops");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (int32_t)count, (void*)(uintptr_t)firsttaboffset, (void*)(uintptr_t)tabstops) : -1;
#else
    (void)format;
    (void)count;
    (void)firsttaboffset;
    (void)tabstops;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetStringFormatTrimming(JNIEnv* km_env, jclass km_clazz, jlong format, jlong trimming) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTrimming");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (void*)(uintptr_t)trimming) : -1;
#else
    (void)format;
    (void)trimming;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetTextContrast(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong contrast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextContrast");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)contrast) : -1;
#else
    (void)graphics;
    (void)contrast;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetTextRenderingHint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextRenderingHint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)mode) : -1;
#else
    (void)graphics;
    (void)mode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetTextureImage(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)image) : -1;
#else
    (void)brush;
    (void)image;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetTextureWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureWrapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetVisibleClipBounds(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetVisibleClipBounds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)rect) : -1;
#else
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetVisibleClipBoundsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetVisibleClipBoundsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)rect) : -1;
#else
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)matrix) : -1;
#else
    (void)graphics;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGraphicsClear(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGraphicsClear");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)color) : -1;
#else
    (void)graphics;
    (void)color;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipGraphicsSetAbort(JNIEnv* km_env, jclass km_clazz, jlong pgraphics, jlong piabort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGraphicsSetAbort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pgraphics, (void*)(uintptr_t)piabort) : -1;
#else
    (void)pgraphics;
    (void)piabort;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipImageForceValidation(JNIEnv* km_env, jclass km_clazz, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageForceValidation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image) : -1;
#else
    (void)image;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipImageGetFrameCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionid, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)dimensionid, (void*)(uintptr_t)count) : -1;
#else
    (void)image;
    (void)dimensionid;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipImageGetFrameDimensionsCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameDimensionsCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)count) : -1;
#else
    (void)image;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipImageGetFrameDimensionsList(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionids, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameDimensionsList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)dimensionids, (uint32_t)count) : -1;
#else
    (void)image;
    (void)dimensionids;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipImageRotateFlip(JNIEnv* km_env, jclass km_clazz, jlong image, jint rftype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageRotateFlip");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (int32_t)rftype) : -1;
#else
    (void)image;
    (void)rftype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipImageSelectActiveFrame(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionid, jint frameindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageSelectActiveFrame");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)dimensionid, (uint32_t)frameindex) : -1;
#else
    (void)image;
    (void)dimensionid;
    (void)frameindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipImageSetAbort(JNIEnv* km_env, jclass km_clazz, jlong pimage, jlong piabort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageSetAbort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pimage, (void*)(uintptr_t)piabort) : -1;
#else
    (void)pimage;
    (void)piabort;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipInitializePalette(JNIEnv* km_env, jclass km_clazz, jlong palette, jint palettetype, jint optimalcolors, jint usetransparentcolor, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipInitializePalette");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)palette, (int32_t)palettetype, (int32_t)optimalcolors, (int32_t)usetransparentcolor, (void*)(uintptr_t)bitmap) : -1;
#else
    (void)palette;
    (void)palettetype;
    (void)optimalcolors;
    (void)usetransparentcolor;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipInvertMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipInvertMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix) : -1;
#else
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsClipEmpty(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsClipEmpty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsEmptyRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsEmptyRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)region;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsEqualRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong region2, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsEqualRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)region2, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)region;
    (void)region2;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsInfiniteRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsInfiniteRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)region;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsMatrixEqual(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrix2, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixEqual");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)matrix2, (void*)(uintptr_t)result) : -1;
#else
    (void)matrix;
    (void)matrix2;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsMatrixIdentity(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)result) : -1;
#else
    (void)matrix;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsMatrixInvertible(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixInvertible");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)result) : -1;
#else
    (void)matrix;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsOutlineVisiblePathPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jlong pen, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsOutlineVisiblePathPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (void*)(uintptr_t)pen, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)pen;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsOutlineVisiblePathPointI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jlong pen, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsOutlineVisiblePathPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (void*)(uintptr_t)pen, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)pen;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsStyleAvailable(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong isstyleavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsStyleAvailable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)family, (int32_t)style, (void*)(uintptr_t)isstyleavailable) : -1;
#else
    (void)family;
    (void)style;
    (void)isstyleavailable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisibleClipEmpty(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleClipEmpty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisiblePathPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePathPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (float)x, (float)y, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisiblePathPointI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePathPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)x, (int32_t)y, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisiblePoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (float)x, (float)y, (void*)(uintptr_t)result) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisiblePointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)x, (int32_t)y, (void*)(uintptr_t)result) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisibleRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jfloat width, jfloat height, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (float)x, (float)y, (float)width, (float)height, (void*)(uintptr_t)result) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisibleRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jint width, jint height, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (void*)(uintptr_t)result) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisibleRegionPoint(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat x, jfloat y, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (float)x, (float)y, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisibleRegionPointI(JNIEnv* km_env, jclass km_clazz, jlong region, jint x, jint y, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (int32_t)x, (int32_t)y, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisibleRegionRect(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat x, jfloat y, jfloat width, jfloat height, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (float)x, (float)y, (float)width, (float)height, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipIsVisibleRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong region, jint x, jint y, jint width, jint height, jlong graphics, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (void*)(uintptr_t)graphics, (void*)(uintptr_t)result) : -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipLoadImageFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)image) : -1;
#else
    (void)filename;
    (void)image;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipLoadImageFromFileICM(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromFileICM");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)image) : -1;
#else
    (void)filename;
    (void)image;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipLoadImageFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)image) : -1;
#else
    (void)stream;
    (void)image;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipLoadImageFromStreamICM(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong image) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromStreamICM");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)image) : -1;
#else
    (void)stream;
    (void)image;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMeasureCharacterRanges(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jint regioncount, jlong regions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureCharacterRanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)stringformat, (int32_t)regioncount, (void*)(uintptr_t)regions) : -1;
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)regioncount;
    (void)regions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMeasureDriverString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong text, jint length, jlong font, jlong positions, jint flags, jlong matrix, jlong boundingbox) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureDriverString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)text, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)positions, (int32_t)flags, (void*)(uintptr_t)matrix, (void*)(uintptr_t)boundingbox) : -1;
#else
    (void)graphics;
    (void)text;
    (void)length;
    (void)font;
    (void)positions;
    (void)flags;
    (void)matrix;
    (void)boundingbox;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMeasureString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jlong boundingbox, jlong codepointsfitted, jlong linesfilled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)string, (int32_t)length, (void*)(uintptr_t)font, (void*)(uintptr_t)layoutrect, (void*)(uintptr_t)stringformat, (void*)(uintptr_t)boundingbox, (void*)(uintptr_t)codepointsfitted, (void*)(uintptr_t)linesfilled) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMultiplyLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyLineTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix, (int32_t)order) : -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMultiplyMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrix2, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)matrix2, (int32_t)order) : -1;
#else
    (void)matrix;
    (void)matrix2;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMultiplyPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyPathGradientTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix, (int32_t)order) : -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMultiplyPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyPenTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)matrix, (int32_t)order) : -1;
#else
    (void)pen;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMultiplyTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyTextureTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix, (int32_t)order) : -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipMultiplyWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)matrix, (int32_t)order) : -1;
#else
    (void)graphics;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipNewInstalledFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipNewInstalledFontCollection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontcollection) : -1;
#else
    (void)fontcollection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipNewPrivateFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipNewPrivateFontCollection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontcollection) : -1;
#else
    (void)fontcollection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterCopyData(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong points, jlong types, jint startindex, jint endindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterCopyData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)points, (void*)(uintptr_t)types, (int32_t)startindex, (int32_t)endindex) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)points;
    (void)types;
    (void)startindex;
    (void)endindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterEnumerate(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong points, jlong types, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterEnumerate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)points, (void*)(uintptr_t)types, (int32_t)count) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)points;
    (void)types;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterGetCount(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterGetCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)count) : -1;
#else
    (void)iterator;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterGetSubpathCount(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterGetSubpathCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)count) : -1;
#else
    (void)iterator;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterHasCurve(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong hascurve) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterHasCurve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)hascurve) : -1;
#else
    (void)iterator;
    (void)hascurve;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterIsValid(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong valid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterIsValid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)valid) : -1;
#else
    (void)iterator;
    (void)valid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterNextMarker(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong startindex, jlong endindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextMarker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)startindex, (void*)(uintptr_t)endindex) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)startindex;
    (void)endindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterNextMarkerPath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextMarkerPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)path) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterNextPathType(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong pathtype, jlong startindex, jlong endindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextPathType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)pathtype, (void*)(uintptr_t)startindex, (void*)(uintptr_t)endindex) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)pathtype;
    (void)startindex;
    (void)endindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterNextSubpath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong startindex, jlong endindex, jlong isclosed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextSubpath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)startindex, (void*)(uintptr_t)endindex, (void*)(uintptr_t)isclosed) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)startindex;
    (void)endindex;
    (void)isclosed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterNextSubpathPath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong path, jlong isclosed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextSubpathPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator, (void*)(uintptr_t)resultcount, (void*)(uintptr_t)path, (void*)(uintptr_t)isclosed) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)path;
    (void)isclosed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPathIterRewind(JNIEnv* km_env, jclass km_clazz, jlong iterator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterRewind");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)iterator) : -1;
#else
    (void)iterator;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPlayMetafileRecord(JNIEnv* km_env, jclass km_clazz, jlong metafile, jint recordtype, jint flags, jint datasize, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPlayMetafileRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)metafile, (int32_t)recordtype, (uint32_t)flags, (uint32_t)datasize, (void*)(uintptr_t)data) : -1;
#else
    (void)metafile;
    (void)recordtype;
    (void)flags;
    (void)datasize;
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPrivateAddFontFile(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong filename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPrivateAddFontFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontcollection, (void*)(uintptr_t)filename) : -1;
#else
    (void)fontcollection;
    (void)filename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipPrivateAddMemoryFont(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong memory, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPrivateAddMemoryFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fontcollection, (void*)(uintptr_t)memory, (int32_t)length) : -1;
#else
    (void)fontcollection;
    (void)memory;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRecordMetafile(JNIEnv* km_env, jclass km_clazz, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile) : -1;
#else
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRecordMetafileFileName(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileFileName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile) : -1;
#else
    (void)filename;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRecordMetafileFileNameI(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileFileNameI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile) : -1;
#else
    (void)filename;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRecordMetafileI(JNIEnv* km_env, jclass km_clazz, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile) : -1;
#else
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRecordMetafileStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile) : -1;
#else
    (void)stream;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRecordMetafileStreamI(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileStreamI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stream, (void*)(uintptr_t)referencehdc, (int32_t)type, (void*)(uintptr_t)framerect, (int32_t)frameunit, (void*)(uintptr_t)description, (void*)(uintptr_t)metafile) : -1;
#else
    (void)stream;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipReleaseDC(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipReleaseDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)hdc) : -1;
#else
    (void)graphics;
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRemovePropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRemovePropertyItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (uint32_t)propid) : -1;
#else
    (void)image;
    (void)propid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetClip(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetClip");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics) : -1;
#else
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetImageAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type) : -1;
#else
    (void)imageattr;
    (void)type;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetLineTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush) : -1;
#else
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetPageTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPageTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics) : -1;
#else
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetPath(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPathGradientTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush) : -1;
#else
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPenTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen) : -1;
#else
    (void)pen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetTextureTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush) : -1;
#else
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipResetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics) : -1;
#else
    (void)graphics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRestoreGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRestoreGraphics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)state) : -1;
#else
    (void)graphics;
    (void)state;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipReversePath(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipReversePath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRotateLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateLineTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)angle, (int32_t)order) : -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRotateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (float)angle, (int32_t)order) : -1;
#else
    (void)matrix;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRotatePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotatePathGradientTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)angle, (int32_t)order) : -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRotatePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotatePenTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (float)angle, (int32_t)order) : -1;
#else
    (void)pen;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRotateTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateTextureTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)angle, (int32_t)order) : -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipRotateWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat angle, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (float)angle, (int32_t)order) : -1;
#else
    (void)graphics;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSaveAdd(JNIEnv* km_env, jclass km_clazz, jlong image, jlong encoderparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveAdd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)encoderparams) : -1;
#else
    (void)image;
    (void)encoderparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSaveAddImage(JNIEnv* km_env, jclass km_clazz, jlong image, jlong newimage, jlong encoderparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveAddImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)newimage, (void*)(uintptr_t)encoderparams) : -1;
#else
    (void)image;
    (void)newimage;
    (void)encoderparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSaveGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveGraphics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)state) : -1;
#else
    (void)graphics;
    (void)state;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSaveImageToFile(JNIEnv* km_env, jclass km_clazz, jlong image, jlong filename, jlong clsidencoder, jlong encoderparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveImageToFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)filename, (void*)(uintptr_t)clsidencoder, (void*)(uintptr_t)encoderparams) : -1;
#else
    (void)image;
    (void)filename;
    (void)clsidencoder;
    (void)encoderparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSaveImageToStream(JNIEnv* km_env, jclass km_clazz, jlong image, jlong stream, jlong clsidencoder, jlong encoderparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveImageToStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)stream, (void*)(uintptr_t)clsidencoder, (void*)(uintptr_t)encoderparams) : -1;
#else
    (void)image;
    (void)stream;
    (void)clsidencoder;
    (void)encoderparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipScaleLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleLineTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)sx, (float)sy, (int32_t)order) : -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipScaleMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat scalex, jfloat scaley, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (float)scalex, (float)scaley, (int32_t)order) : -1;
#else
    (void)matrix;
    (void)scalex;
    (void)scaley;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipScalePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScalePathGradientTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)sx, (float)sy, (int32_t)order) : -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipScalePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScalePenTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (float)sx, (float)sy, (int32_t)order) : -1;
#else
    (void)pen;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipScaleTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleTextureTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)sx, (float)sy, (int32_t)order) : -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipScaleWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat sx, jfloat sy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (float)sx, (float)sy, (int32_t)order) : -1;
#else
    (void)graphics;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetAdjustableArrowCapFillState(JNIEnv* km_env, jclass km_clazz, jlong cap, jint fillstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapFillState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cap, (int32_t)fillstate) : -1;
#else
    (void)cap;
    (void)fillstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetAdjustableArrowCapHeight(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapHeight");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cap, (float)height) : -1;
#else
    (void)cap;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetAdjustableArrowCapMiddleInset(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat middleinset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapMiddleInset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cap, (float)middleinset) : -1;
#else
    (void)cap;
    (void)middleinset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetAdjustableArrowCapWidth(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapWidth");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cap, (float)width) : -1;
#else
    (void)cap;
    (void)width;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetClipGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong srcgraphics, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipGraphics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)srcgraphics, (int32_t)combinemode) : -1;
#else
    (void)graphics;
    (void)srcgraphics;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetClipHrgn(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hrgn, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipHrgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)hrgn, (int32_t)combinemode) : -1;
#else
    (void)graphics;
    (void)hrgn;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetClipPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong path, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)path, (int32_t)combinemode) : -1;
#else
    (void)graphics;
    (void)path;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetClipRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jfloat width, jfloat height, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (float)x, (float)y, (float)width, (float)height, (int32_t)combinemode) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetClipRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jint width, jint height, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRectI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (int32_t)combinemode) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetClipRegion(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong region, jint combinemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)region, (int32_t)combinemode) : -1;
#else
    (void)graphics;
    (void)region;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetCompositingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint compositingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCompositingMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)compositingmode) : -1;
#else
    (void)graphics;
    (void)compositingmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetCompositingQuality(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint compositingquality) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCompositingQuality");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)compositingquality) : -1;
#else
    (void)graphics;
    (void)compositingquality;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetCustomLineCapBaseCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint basecap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapBaseCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (int32_t)basecap) : -1;
#else
    (void)customcap;
    (void)basecap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetCustomLineCapBaseInset(JNIEnv* km_env, jclass km_clazz, jlong customcap, jfloat inset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapBaseInset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (float)inset) : -1;
#else
    (void)customcap;
    (void)inset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetCustomLineCapStrokeCaps(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint startcap, jint endcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapStrokeCaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (int32_t)startcap, (int32_t)endcap) : -1;
#else
    (void)customcap;
    (void)startcap;
    (void)endcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetCustomLineCapStrokeJoin(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint linejoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapStrokeJoin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (int32_t)linejoin) : -1;
#else
    (void)customcap;
    (void)linejoin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetCustomLineCapWidthScale(JNIEnv* km_env, jclass km_clazz, jlong customcap, jfloat widthscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapWidthScale");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcap, (float)widthscale) : -1;
#else
    (void)customcap;
    (void)widthscale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetEffectParameters(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong params, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetEffectParameters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)effect, (void*)(uintptr_t)params, (uint32_t)size) : -1;
#else
    (void)effect;
    (void)params;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetEmpty(JNIEnv* km_env, jclass km_clazz, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetEmpty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region) : -1;
#else
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesCachedBackground(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint enableflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesCachedBackground");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)enableflag) : -1;
#else
    (void)imageattr;
    (void)enableflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesColorKeys(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint colorlow, jint colorhigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesColorKeys");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (uint32_t)colorlow, (uint32_t)colorhigh) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colorlow;
    (void)colorhigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesColorMatrix(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jlong colormatrix, jlong graymatrix, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesColorMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (void*)(uintptr_t)colormatrix, (void*)(uintptr_t)graymatrix, (int32_t)flags) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colormatrix;
    (void)graymatrix;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesGamma(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jfloat gamma) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesGamma");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (float)gamma) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)gamma;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesNoOp(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesNoOp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesOutputChannel(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint channelflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesOutputChannel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (int32_t)channelflags) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)channelflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesOutputChannelColorProfile(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jlong colorprofilefilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesOutputChannelColorProfile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (void*)(uintptr_t)colorprofilefilename) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colorprofilefilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesRemapTable(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint mapsize, jlong map) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesRemapTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (uint32_t)mapsize, (void*)(uintptr_t)map) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)mapsize;
    (void)map;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesThreshold(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jfloat threshold) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesThreshold");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type, (int32_t)enableflag, (float)threshold) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)threshold;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesToIdentity(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesToIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)type) : -1;
#else
    (void)imageattr;
    (void)type;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImageAttributesWrapMode(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint wrap, jint argb, jint clamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesWrapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)imageattr, (int32_t)wrap, (uint32_t)argb, (int32_t)clamp) : -1;
#else
    (void)imageattr;
    (void)wrap;
    (void)argb;
    (void)clamp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetImagePalette(JNIEnv* km_env, jclass km_clazz, jlong image, jlong palette) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImagePalette");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)palette) : -1;
#else
    (void)image;
    (void)palette;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetInfinite(JNIEnv* km_env, jclass km_clazz, jlong region) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetInfinite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region) : -1;
#else
    (void)region;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetInterpolationMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint interpolationmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetInterpolationMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)interpolationmode) : -1;
#else
    (void)graphics;
    (void)interpolationmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetLineBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetLineColors(JNIEnv* km_env, jclass km_clazz, jlong brush, jint color1, jint color2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineColors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (uint32_t)color1, (uint32_t)color2) : -1;
#else
    (void)brush;
    (void)color1;
    (void)color2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetLineGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jint usegammacorrection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineGammaCorrection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (int32_t)usegammacorrection) : -1;
#else
    (void)brush;
    (void)usegammacorrection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetLineLinearBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineLinearBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)focus, (float)scale) : -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetLinePresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLinePresetBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetLineSigmaBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineSigmaBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)focus, (float)scale) : -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetLineWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineWrapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (int32_t)wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetMatrixElements(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat m11, jfloat m12, jfloat m21, jfloat m22, jfloat dx, jfloat dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetMatrixElements");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (float)m11, (float)m12, (float)m21, (float)m22, (float)dx, (float)dy) : -1;
#else
    (void)matrix;
    (void)m11;
    (void)m12;
    (void)m21;
    (void)m22;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetMetafileDownLevelRasterizationLimit(JNIEnv* km_env, jclass km_clazz, jlong metafile, jint metafilerasterizationlimitdpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetMetafileDownLevelRasterizationLimit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)metafile, (uint32_t)metafilerasterizationlimitdpi) : -1;
#else
    (void)metafile;
    (void)metafilerasterizationlimitdpi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPageScale(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPageScale");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (float)scale) : -1;
#else
    (void)graphics;
    (void)scale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPageUnit(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPageUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)unit) : -1;
#else
    (void)graphics;
    (void)unit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathFillMode(JNIEnv* km_env, jclass km_clazz, jlong path, jint fillmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathFillMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (int32_t)fillmode) : -1;
#else
    (void)path;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientCenterColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jint colors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (uint32_t)colors) : -1;
#else
    (void)brush;
    (void)colors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientCenterPoint(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)points) : -1;
#else
    (void)brush;
    (void)points;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientCenterPointI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)points) : -1;
#else
    (void)brush;
    (void)points;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientFocusScales(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat xscale, jfloat yscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientFocusScales");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)xscale, (float)yscale) : -1;
#else
    (void)brush;
    (void)xscale;
    (void)yscale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jint usegammacorrection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientGammaCorrection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (int32_t)usegammacorrection) : -1;
#else
    (void)brush;
    (void)usegammacorrection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientLinearBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientLinearBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)focus, (float)scale) : -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientPath(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)path) : -1;
#else
    (void)brush;
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientPresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientPresetBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)blend, (void*)(uintptr_t)positions, (int32_t)count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientSigmaBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientSigmaBlend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)focus, (float)scale) : -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientSurroundColorsWithCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientSurroundColorsWithCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)color, (void*)(uintptr_t)count) : -1;
#else
    (void)brush;
    (void)color;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathGradientWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientWrapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (int32_t)wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPathMarker(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathMarker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenBrushFill(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong brush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenBrushFill");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)brush) : -1;
#else
    (void)pen;
    (void)brush;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenColor(JNIEnv* km_env, jclass km_clazz, jlong pen, jint argb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (uint32_t)argb) : -1;
#else
    (void)pen;
    (void)argb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenCompoundArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCompoundArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dash, (int32_t)count) : -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenCustomEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCustomEndCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)customcap) : -1;
#else
    (void)pen;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenCustomStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCustomStartCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)customcap) : -1;
#else
    (void)pen;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenDashArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)dash, (int32_t)count) : -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenDashCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jint dashcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashCap197819");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (int32_t)dashcap) : -1;
#else
    (void)pen;
    (void)dashcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenDashOffset(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat offset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashOffset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (float)offset) : -1;
#else
    (void)pen;
    (void)offset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenDashStyle(JNIEnv* km_env, jclass km_clazz, jlong pen, jint dashstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashStyle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (int32_t)dashstyle) : -1;
#else
    (void)pen;
    (void)dashstyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jint endcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenEndCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (int32_t)endcap) : -1;
#else
    (void)pen;
    (void)endcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenLineCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jint startcap, jint endcap, jint dashcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenLineCap197819");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (int32_t)startcap, (int32_t)endcap, (int32_t)dashcap) : -1;
#else
    (void)pen;
    (void)startcap;
    (void)endcap;
    (void)dashcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenLineJoin(JNIEnv* km_env, jclass km_clazz, jlong pen, jint linejoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenLineJoin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (int32_t)linejoin) : -1;
#else
    (void)pen;
    (void)linejoin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat miterlimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenMiterLimit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (float)miterlimit) : -1;
#else
    (void)pen;
    (void)miterlimit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenMode(JNIEnv* km_env, jclass km_clazz, jlong pen, jint penmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (int32_t)penmode) : -1;
#else
    (void)pen;
    (void)penmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jint startcap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenStartCap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (int32_t)startcap) : -1;
#else
    (void)pen;
    (void)startcap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (void*)(uintptr_t)matrix) : -1;
#else
    (void)pen;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenUnit(JNIEnv* km_env, jclass km_clazz, jlong pen, jint unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (int32_t)unit) : -1;
#else
    (void)pen;
    (void)unit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPenWidth(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenWidth");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (float)width) : -1;
#else
    (void)pen;
    (void)width;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPixelOffsetMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint pixeloffsetmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPixelOffsetMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)pixeloffsetmode) : -1;
#else
    (void)graphics;
    (void)pixeloffsetmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetPropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPropertyItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)image, (void*)(uintptr_t)item) : -1;
#else
    (void)image;
    (void)item;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetRenderingOrigin(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetRenderingOrigin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)x, (int32_t)y) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetSmoothingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint smoothingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetSmoothingMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)smoothingmode) : -1;
#else
    (void)graphics;
    (void)smoothingmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetSolidFillColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetSolidFillColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (uint32_t)color) : -1;
#else
    (void)brush;
    (void)color;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetStringFormatAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jint align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatAlign");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (int32_t)align) : -1;
#else
    (void)format;
    (void)align;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetStringFormatDigitSubstitution(JNIEnv* km_env, jclass km_clazz, jlong format, jshort language, jint substitute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatDigitSubstitution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (uint16_t)language, (int32_t)substitute) : -1;
#else
    (void)format;
    (void)language;
    (void)substitute;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetStringFormatFlags(JNIEnv* km_env, jclass km_clazz, jlong format, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (int32_t)flags) : -1;
#else
    (void)format;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetStringFormatHotkeyPrefix(JNIEnv* km_env, jclass km_clazz, jlong format, jint hotkeyprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatHotkeyPrefix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (int32_t)hotkeyprefix) : -1;
#else
    (void)format;
    (void)hotkeyprefix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetStringFormatLineAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jint align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatLineAlign");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (int32_t)align) : -1;
#else
    (void)format;
    (void)align;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetStringFormatMeasurableCharacterRanges(JNIEnv* km_env, jclass km_clazz, jlong format, jint rangecount, jlong ranges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatMeasurableCharacterRanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (int32_t)rangecount, (void*)(uintptr_t)ranges) : -1;
#else
    (void)format;
    (void)rangecount;
    (void)ranges;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetStringFormatTabStops(JNIEnv* km_env, jclass km_clazz, jlong format, jfloat firsttaboffset, jint count, jlong tabstops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatTabStops");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (float)firsttaboffset, (int32_t)count, (void*)(uintptr_t)tabstops) : -1;
#else
    (void)format;
    (void)firsttaboffset;
    (void)count;
    (void)tabstops;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetStringFormatTrimming(JNIEnv* km_env, jclass km_clazz, jlong format, jint trimming) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatTrimming");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format, (int32_t)trimming) : -1;
#else
    (void)format;
    (void)trimming;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetTextContrast(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint contrast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextContrast");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (uint32_t)contrast) : -1;
#else
    (void)graphics;
    (void)contrast;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetTextRenderingHint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextRenderingHint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)mode) : -1;
#else
    (void)graphics;
    (void)mode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextureTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (void*)(uintptr_t)matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetTextureWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextureWrapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (int32_t)wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipSetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (void*)(uintptr_t)matrix) : -1;
#else
    (void)graphics;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipShearMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat shearx, jfloat sheary, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipShearMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (float)shearx, (float)sheary, (int32_t)order) : -1;
#else
    (void)matrix;
    (void)shearx;
    (void)sheary;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipStartPathFigure(JNIEnv* km_env, jclass km_clazz, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStartPathFigure");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipStringFormatGetGenericDefault(JNIEnv* km_env, jclass km_clazz, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStringFormatGetGenericDefault");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format) : -1;
#else
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipStringFormatGetGenericTypographic(JNIEnv* km_env, jclass km_clazz, jlong format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStringFormatGetGenericTypographic");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)format) : -1;
#else
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTestControl(JNIEnv* km_env, jclass km_clazz, jint control, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTestControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)control, (void*)(uintptr_t)param1) : -1;
#else
    (void)control;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTransformMatrixPoints(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformMatrixPoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)pts, (int32_t)count) : -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTransformMatrixPointsI(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformMatrixPointsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)pts, (int32_t)count) : -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTransformPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)matrix) : -1;
#else
    (void)path;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTransformPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint destspace, jint srcspace, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)destspace, (int32_t)srcspace, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)destspace;
    (void)srcspace;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTransformPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint destspace, jint srcspace, jlong points, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPointsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)destspace, (int32_t)srcspace, (void*)(uintptr_t)points, (int32_t)count) : -1;
#else
    (void)graphics;
    (void)destspace;
    (void)srcspace;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTransformRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong matrix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (void*)(uintptr_t)matrix) : -1;
#else
    (void)region;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslateClip(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat dx, jfloat dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateClip");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (float)dx, (float)dy) : -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslateClipI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateClipI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (int32_t)dx, (int32_t)dy) : -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslateLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateLineTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)dx, (float)dy, (int32_t)order) : -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat offsetx, jfloat offsety, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateMatrix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (float)offsetx, (float)offsety, (int32_t)order) : -1;
#else
    (void)matrix;
    (void)offsetx;
    (void)offsety;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslatePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslatePathGradientTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)dx, (float)dy, (int32_t)order) : -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslatePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslatePenTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pen, (float)dx, (float)dy, (int32_t)order) : -1;
#else
    (void)pen;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslateRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat dx, jfloat dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (float)dx, (float)dy) : -1;
#else
    (void)region;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslateRegionI(JNIEnv* km_env, jclass km_clazz, jlong region, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateRegionI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)region, (int32_t)dx, (int32_t)dy) : -1;
#else
    (void)region;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslateTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateTextureTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)brush, (float)dx, (float)dy, (int32_t)order) : -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipTranslateWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat dx, jfloat dy, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)graphics, (float)dx, (float)dy, (int32_t)order) : -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipVectorTransformMatrixPoints(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipVectorTransformMatrixPoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)pts, (int32_t)count) : -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipVectorTransformMatrixPointsI(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipVectorTransformMatrixPointsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)matrix, (void*)(uintptr_t)pts, (int32_t)count) : -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipWarpPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jlong points, jint count, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint warpmode, jfloat flatness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, float, float, float, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWarpPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)matrix, (void*)(uintptr_t)points, (int32_t)count, (float)srcx, (float)srcy, (float)srcwidth, (float)srcheight, (int32_t)warpmode, (float)flatness) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipWidenPath(JNIEnv* km_env, jclass km_clazz, jlong nativepath, jlong pen, jlong matrix, jfloat flatness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWidenPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nativepath, (void*)(uintptr_t)pen, (void*)(uintptr_t)matrix, (float)flatness) : -1;
#else
    (void)nativepath;
    (void)pen;
    (void)matrix;
    (void)flatness;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdipWindingModeOutline(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jfloat flatness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWindingModeOutline");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (void*)(uintptr_t)matrix, (float)flatness) : -1;
#else
    (void)path;
    (void)matrix;
    (void)flatness;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdiplusNotificationHook(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusNotificationHook");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token) : -1;
#else
    (void)token;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdiplusNotificationUnhook(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusNotificationUnhook");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint64_t)token);
#else
    (void)token;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdiplusShutdown(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusShutdown");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint64_t)token);
#else
    (void)token;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1GdiplusStartup(JNIEnv* km_env, jclass km_clazz, jlong token, jlong input, jlong output) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusStartup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)input, (void*)(uintptr_t)output) : -1;
#else
    (void)token;
    (void)input;
    (void)output;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

