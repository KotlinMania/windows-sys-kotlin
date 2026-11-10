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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathArc(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathArcI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathBezier(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat x3, jfloat y3, jfloat x4, jfloat y4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathBezierI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathBeziers(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathBeziersI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathCurve(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathCurve2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathCurve2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathCurve3(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathCurve3I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathCurveI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathEllipse(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathEllipseI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathLine(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathLine2(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathLine2I(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathLineI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x1, jint y1, jint x2, jint y2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong addingpath, jint arg_2_connect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathPie(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathPieI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathPolygon(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathPolygonI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathRectangle(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jfloat width, jfloat height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathRectangleI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jint width, jint height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathRectangles(JNIEnv* km_env, jclass km_clazz, jlong path, jlong rects, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong rects, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathString(JNIEnv* km_env, jclass km_clazz, jlong path, jlong string, jint length, jlong family, jint style, jfloat emsize, jlong layoutrect, jlong format) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAddPathStringI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong string, jint length, jlong family, jint style, jfloat emsize, jlong layoutrect, jlong format) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipAlloc(JNIEnv* km_env, jclass km_clazz, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBeginContainer(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dstrect, jlong srcrect, jint unit, jlong state) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBeginContainer2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong state) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBeginContainerI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dstrect, jlong srcrect, jint unit, jlong state) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapApplyEffect(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong effect, jlong roi, jint useauxdata, jlong auxdata, jlong auxdatasize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapConvertFormat(JNIEnv* km_env, jclass km_clazz, jlong pinputbitmap, jint format, jint dithertype, jint palettetype, jlong palette, jfloat alphathresholdpercent) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapCreateApplyEffect(JNIEnv* km_env, jclass km_clazz, jlong inputbitmaps, jint numinputs, jlong effect, jlong roi, jlong outputrect, jlong outputbitmap, jint useauxdata, jlong auxdata, jlong auxdatasize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapGetHistogram(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint format, jint numberofentries, jlong channel0, jlong channel1, jlong channel2, jlong channel3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapGetHistogramSize(JNIEnv* km_env, jclass km_clazz, jint format, jlong numberofentries) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapGetPixel(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint x, jint y, jlong color) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapLockBits(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong rect, jint flags, jint format, jlong lockedbitmapdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapSetPixel(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jint x, jint y, jint color) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapSetResolution(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jfloat xdpi, jfloat ydpi) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipBitmapUnlockBits(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong lockedbitmapdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipClearPathMarkers(JNIEnv* km_env, jclass km_clazz, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneBitmapArea(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat width, jfloat height, jint format, jlong srcbitmap, jlong dstbitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneBitmapAreaI(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint width, jint height, jint format, jlong srcbitmap, jlong dstbitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneBrush(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong clonebrush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong clonedcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneFont(JNIEnv* km_env, jclass km_clazz, jlong font, jlong clonefont) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneFontFamily(JNIEnv* km_env, jclass km_clazz, jlong fontfamily, jlong clonedfontfamily) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneImage(JNIEnv* km_env, jclass km_clazz, jlong image, jlong cloneimage) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jlong cloneimageattr) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong clonematrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipClonePath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong clonepath) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipClonePen(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong clonepen) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong cloneregion) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCloneStringFormat(JNIEnv* km_env, jclass km_clazz, jlong format, jlong newformat) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipClosePathFigure(JNIEnv* km_env, jclass km_clazz, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipClosePathFigures(JNIEnv* km_env, jclass km_clazz, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCombineRegionPath(JNIEnv* km_env, jclass km_clazz, jlong region, jlong path, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCombineRegionRect(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rect, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCombineRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rect, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCombineRegionRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong region2, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipComment(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint sizedata, jlong data) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipConvertToEmfPlus(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jint emftype, jlong description, jlong out_metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipConvertToEmfPlusToFile(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jlong filename, jint emftype, jlong description, jlong out_metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipConvertToEmfPlusToStream(JNIEnv* km_env, jclass km_clazz, jlong refgraphics, jlong metafile, jlong conversionfailureflag, jlong stream, jint emftype, jlong description, jlong out_metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateAdjustableArrowCap(JNIEnv* km_env, jclass km_clazz, jfloat height, jfloat width, jint isfilled, jlong cap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromFileICM(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromGdiDib(JNIEnv* km_env, jclass km_clazz, jlong gdibitmapinfo, jlong gdibitmapdata, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromGraphics(JNIEnv* km_env, jclass km_clazz, jint width, jint height, jlong target, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromHBITMAP(JNIEnv* km_env, jclass km_clazz, jlong hbm, jlong hpal, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromHICON(JNIEnv* km_env, jclass km_clazz, jlong hicon, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromResource(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpbitmapname, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromScan0(JNIEnv* km_env, jclass km_clazz, jint width, jint height, jint stride, jint format, jlong scan0, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateBitmapFromStreamICM(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong graphics, jlong cachedbitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong fillpath, jlong strokepath, jint basecap, jfloat baseinset, jlong customcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFont(JNIEnv* km_env, jclass km_clazz, jlong fontfamily, jfloat emsize, jint style, jint unit, jlong font) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFontFamilyFromName(JNIEnv* km_env, jclass km_clazz, jlong name, jlong fontcollection, jlong fontfamily) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFontFromDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong font) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFontFromLogfontA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong logfont, jlong font) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFontFromLogfontW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong logfont, jlong font) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFromHDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFromHDC2(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hdevice, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFromHWND(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateFromHWNDICM(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateHBITMAPFromBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong hbmreturn, jint background) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateHICONFromBitmap(JNIEnv* km_env, jclass km_clazz, jlong bitmap, jlong hbmreturn) {
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateHalftonePalette(JNIEnv* km_env, jclass km_clazz) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateHatchBrush(JNIEnv* km_env, jclass km_clazz, jint hatchstyle, jint forecol, jint backcol, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateLineBrush(JNIEnv* km_env, jclass km_clazz, jlong point1, jlong point2, jint color1, jint color2, jint wrapmode, jlong linegradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateLineBrushFromRect(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jint mode, jint wrapmode, jlong linegradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateLineBrushFromRectI(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jint mode, jint wrapmode, jlong linegradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateLineBrushFromRectWithAngle(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jfloat angle, jint isanglescalable, jint wrapmode, jlong linegradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateLineBrushFromRectWithAngleI(JNIEnv* km_env, jclass km_clazz, jlong rect, jint color1, jint color2, jfloat angle, jint isanglescalable, jint wrapmode, jlong linegradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateLineBrushI(JNIEnv* km_env, jclass km_clazz, jlong point1, jlong point2, jint color1, jint color2, jint wrapmode, jlong linegradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMatrix2(JNIEnv* km_env, jclass km_clazz, jfloat m11, jfloat m12, jfloat m21, jfloat m22, jfloat dx, jfloat dy, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMatrix3(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong dstplg, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMatrix3I(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong dstplg, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMetafileFromEmf(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint deleteemf, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMetafileFromFile(JNIEnv* km_env, jclass km_clazz, jlong file, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMetafileFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMetafileFromWmf(JNIEnv* km_env, jclass km_clazz, jlong hwmf, jint deletewmf, jlong wmfplaceablefileheader, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateMetafileFromWmfFile(JNIEnv* km_env, jclass km_clazz, jlong file, jlong wmfplaceablefileheader, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePath(JNIEnv* km_env, jclass km_clazz, jint brushmode, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePath2(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePath2I(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePathGradient(JNIEnv* km_env, jclass km_clazz, jlong points, jint count, jint wrapmode, jlong polygradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePathGradientFromPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong polygradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePathGradientI(JNIEnv* km_env, jclass km_clazz, jlong points, jint count, jint wrapmode, jlong polygradient) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePathIter(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePen1(JNIEnv* km_env, jclass km_clazz, jint color, jfloat width, jint unit, jlong pen) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreatePen2(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat width, jint unit, jlong pen) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateRegion(JNIEnv* km_env, jclass km_clazz, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateRegionHrgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateRegionPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateRegionRect(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong rect, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateRegionRgnData(JNIEnv* km_env, jclass km_clazz, jlong regiondata, jint size, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateSolidFill(JNIEnv* km_env, jclass km_clazz, jint color, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateStreamOnFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jint access, jlong stream) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateStringFormat(JNIEnv* km_env, jclass km_clazz, jint formatattributes, jshort language, jlong format) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateTexture(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jlong texture) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateTexture2(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jfloat x, jfloat y, jfloat width, jfloat height, jlong texture) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateTexture2I(JNIEnv* km_env, jclass km_clazz, jlong image, jint wrapmode, jint x, jint y, jint width, jint height, jlong texture) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateTextureIA(JNIEnv* km_env, jclass km_clazz, jlong image, jlong imageattributes, jfloat x, jfloat y, jfloat width, jfloat height, jlong texture) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipCreateTextureIAI(JNIEnv* km_env, jclass km_clazz, jlong image, jlong imageattributes, jint x, jint y, jint width, jint height, jlong texture) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteBrush(JNIEnv* km_env, jclass km_clazz, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong cachedbitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteCustomLineCap(JNIEnv* km_env, jclass km_clazz, jlong customcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteEffect(JNIEnv* km_env, jclass km_clazz, jlong effect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteFont(JNIEnv* km_env, jclass km_clazz, jlong font) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteFontFamily(JNIEnv* km_env, jclass km_clazz, jlong fontfamily) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeletePath(JNIEnv* km_env, jclass km_clazz, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeletePathIter(JNIEnv* km_env, jclass km_clazz, jlong iterator) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeletePen(JNIEnv* km_env, jclass km_clazz, jlong pen) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeletePrivateFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteRegion(JNIEnv* km_env, jclass km_clazz, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDeleteStringFormat(JNIEnv* km_env, jclass km_clazz, jlong format) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDisposeImage(JNIEnv* km_env, jclass km_clazz, jlong image) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDisposeImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawArc(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawArcI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawBezier(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat x3, jfloat y3, jfloat x4, jfloat y4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawBezierI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawBeziers(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawBeziersI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawCachedBitmap(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong cachedbitmap, jint x, jint y) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawCurve3(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawCurve3I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count, jint offset, jint numberofsegments, jfloat tension) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawDriverString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong text, jint length, jlong font, jlong brush, jlong positions, jint flags, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawEllipse(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawEllipseI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImage(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImageFX(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong source, jlong xform, jlong effect, jlong imageattributes, jint srcunit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImageI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImagePointRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImagePointRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImagePoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong dstpoints, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImagePointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong dstpoints, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImagePointsRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong points, jint count, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImagePointsRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jlong points, jint count, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImageRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat x, jfloat y, jfloat width, jfloat height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImageRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint x, jint y, jint width, jint height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImageRectRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jfloat dstx, jfloat dsty, jfloat dstwidth, jfloat dstheight, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawImageRectRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong image, jint dstx, jint dsty, jint dstwidth, jint dstheight, jint srcx, jint srcy, jint srcwidth, jint srcheight, jint srcunit, jlong imageattributes, jlong callback, jlong callbackdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawLine(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawLineI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x1, jint y1, jint x2, jint y2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawLines(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawLinesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawPie(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawPieI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawPolygon(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawPolygonI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawRectangle(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jfloat x, jfloat y, jfloat width, jfloat height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawRectangleI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jint x, jint y, jint width, jint height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawRectangles(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong rects, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pen, jlong rects, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipDrawString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEmfToWmfBits(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cbdata16, jlong pdata16, jint imapmode, jint eflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEndContainer(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint state) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileDestPoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileDestPointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileDestPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileDestPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileDestRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileDestRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileSrcRectDestPoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileSrcRectDestPointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoint, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileSrcRectDestPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileSrcRectDestPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destpoints, jint count, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileSrcRectDestRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipEnumerateMetafileSrcRectDestRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong metafile, jlong destrect, jlong srcrect, jint srcunit, jlong callback, jlong callbackdata, jlong imageattributes) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillClosedCurve(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillClosedCurve2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jfloat tension, jint fillmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillClosedCurve2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jfloat tension, jint fillmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillClosedCurveI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillEllipse(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillEllipseI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillPie(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillPieI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height, jfloat startangle, jfloat sweepangle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillPolygon(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jint fillmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillPolygon2(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillPolygon2I(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillPolygonI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong points, jint count, jint fillmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillRectangle(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jfloat x, jfloat y, jfloat width, jfloat height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillRectangleI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jint x, jint y, jint width, jint height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillRectangles(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong rects, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillRectanglesI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong rects, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFillRegion(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong brush, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFindFirstImageItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFindNextImageItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFlattenPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jfloat flatness) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFlush(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint intention) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipFree(JNIEnv* km_env, jclass km_clazz, jlong ptr) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetAdjustableArrowCapFillState(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong fillstate) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetAdjustableArrowCapHeight(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetAdjustableArrowCapMiddleInset(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong middleinset) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetAdjustableArrowCapWidth(JNIEnv* km_env, jclass km_clazz, jlong cap, jlong width) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetAllPropertyItems(JNIEnv* km_env, jclass km_clazz, jlong image, jint totalbuffersize, jint numproperties, jlong allitems) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetBrushType(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong type) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCellAscent(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong cellascent) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCellDescent(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong celldescent) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetClip(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetClipBounds(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetClipBoundsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCompositingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong compositingmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCompositingQuality(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong compositingquality) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCustomLineCapBaseCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong basecap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCustomLineCapBaseInset(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong inset) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCustomLineCapStrokeCaps(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong startcap, jlong endcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCustomLineCapStrokeJoin(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong linejoin) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCustomLineCapType(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong captype) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetCustomLineCapWidthScale(JNIEnv* km_env, jclass km_clazz, jlong customcap, jlong widthscale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetDC(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hdc) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetDpiX(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dpi) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetDpiY(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong dpi) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetEffectParameterSize(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetEffectParameters(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong size, jlong params) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetEmHeight(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong emheight) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetEncoderParameterList(JNIEnv* km_env, jclass km_clazz, jlong image, jlong clsidencoder, jint size, jlong buffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetEncoderParameterListSize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong clsidencoder, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFamily(JNIEnv* km_env, jclass km_clazz, jlong font, jlong family) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFamilyName(JNIEnv* km_env, jclass km_clazz, jlong family, jlong name, jshort language) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFontCollectionFamilyCount(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong numfound) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFontCollectionFamilyList(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jint numsought, jlong gpfamilies, jlong numfound) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFontHeight(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFontHeightGivenDPI(JNIEnv* km_env, jclass km_clazz, jlong font, jfloat dpi, jlong height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFontSize(JNIEnv* km_env, jclass km_clazz, jlong font, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFontStyle(JNIEnv* km_env, jclass km_clazz, jlong font, jlong style) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetFontUnit(JNIEnv* km_env, jclass km_clazz, jlong font, jlong unit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetGenericFontFamilyMonospace(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetGenericFontFamilySansSerif(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetGenericFontFamilySerif(JNIEnv* km_env, jclass km_clazz, jlong nativefamily) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetHatchBackgroundColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong backcol) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetHatchForegroundColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong forecol) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetHatchStyle(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong hatchstyle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetHemfFromMetafile(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong hemf) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageAttributesAdjustedPalette(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jlong colorpalette, jint coloradjusttype) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageBounds(JNIEnv* km_env, jclass km_clazz, jlong image, jlong srcrect, jlong srcunit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageDecoders(JNIEnv* km_env, jclass km_clazz, jint numdecoders, jint size, jlong decoders) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageDecodersSize(JNIEnv* km_env, jclass km_clazz, jlong numdecoders, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageDimension(JNIEnv* km_env, jclass km_clazz, jlong image, jlong width, jlong height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageEncoders(JNIEnv* km_env, jclass km_clazz, jint numencoders, jint size, jlong encoders) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageEncodersSize(JNIEnv* km_env, jclass km_clazz, jlong numencoders, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageFlags(JNIEnv* km_env, jclass km_clazz, jlong image, jlong flags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageGraphicsContext(JNIEnv* km_env, jclass km_clazz, jlong image, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageHeight(JNIEnv* km_env, jclass km_clazz, jlong image, jlong height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageHorizontalResolution(JNIEnv* km_env, jclass km_clazz, jlong image, jlong resolution) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageItemData(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImagePalette(JNIEnv* km_env, jclass km_clazz, jlong image, jlong palette, jint size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImagePaletteSize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImagePixelFormat(JNIEnv* km_env, jclass km_clazz, jlong image, jlong format) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageRawFormat(JNIEnv* km_env, jclass km_clazz, jlong image, jlong format) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageThumbnail(JNIEnv* km_env, jclass km_clazz, jlong image, jint thumbwidth, jint thumbheight, jlong thumbimage, jlong callback, jlong callbackdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageType(JNIEnv* km_env, jclass km_clazz, jlong image, jlong type) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageVerticalResolution(JNIEnv* km_env, jclass km_clazz, jlong image, jlong resolution) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetImageWidth(JNIEnv* km_env, jclass km_clazz, jlong image, jlong width) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetInterpolationMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong interpolationmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineColors(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong colors) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong usegammacorrection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLinePresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLinePresetBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineRect(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineRectI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineSpacing(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong linespacing) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLineWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLogFontA(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong logfonta) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetLogFontW(JNIEnv* km_env, jclass km_clazz, jlong font, jlong graphics, jlong logfontw) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetMatrixElements(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrixout) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetMetafileDownLevelRasterizationLimit(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong metafilerasterizationlimitdpi) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetMetafileHeaderFromEmf(JNIEnv* km_env, jclass km_clazz, jlong hemf, jlong header) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetMetafileHeaderFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong header) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetMetafileHeaderFromMetafile(JNIEnv* km_env, jclass km_clazz, jlong metafile, jlong header) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetMetafileHeaderFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong header) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetMetafileHeaderFromWmf(JNIEnv* km_env, jclass km_clazz, jlong hwmf, jlong wmfplaceablefileheader, jlong header) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetNearestColor(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong argb) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPageScale(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong scale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPageUnit(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong unit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathData(JNIEnv* km_env, jclass km_clazz, jlong path, jlong pathdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathFillMode(JNIEnv* km_env, jclass km_clazz, jlong path, jlong fillmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientCenterColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong colors) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientCenterPoint(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientCenterPointI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientFocusScales(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong xscale, jlong yscale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong usegammacorrection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientPath(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientPointCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientPresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientPresetBlendCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientRect(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientRectI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientSurroundColorCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientSurroundColorsWithCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathGradientWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathLastPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jlong lastpoint) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathPoints(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathPointsI(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathTypes(JNIEnv* km_env, jclass km_clazz, jlong path, jlong types, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathWorldBounds(JNIEnv* km_env, jclass km_clazz, jlong path, jlong bounds, jlong matrix, jlong pen) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPathWorldBoundsI(JNIEnv* km_env, jclass km_clazz, jlong path, jlong bounds, jlong matrix, jlong pen) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenBrushFill(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenColor(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong argb) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenCompoundArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenCompoundCount(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenCustomEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenCustomStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenDashArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenDashCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dashcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenDashCount(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenDashOffset(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong offset) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenDashStyle(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dashstyle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong endcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenFillType(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong type) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenLineJoin(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong linejoin) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong miterlimit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenMode(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong penmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong startcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenUnit(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong unit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPenWidth(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong width) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPixelOffsetMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong pixeloffsetmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPointCount(JNIEnv* km_env, jclass km_clazz, jlong path, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPropertyCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong numofproperty) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPropertyIdList(JNIEnv* km_env, jclass km_clazz, jlong image, jint numofproperty, jlong list) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid, jint propsize, jlong buffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPropertyItemSize(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid, jlong size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetPropertySize(JNIEnv* km_env, jclass km_clazz, jlong image, jlong totalbuffersize, jlong numproperties) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRegionBounds(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRegionBoundsI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRegionData(JNIEnv* km_env, jclass km_clazz, jlong region, jlong buffer, jint buffersize, jlong sizefilled) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRegionDataSize(JNIEnv* km_env, jclass km_clazz, jlong region, jlong buffersize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRegionHRgn(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong hrgn) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRegionScans(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rects, jlong count, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRegionScansCount(JNIEnv* km_env, jclass km_clazz, jlong region, jlong count, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRegionScansI(JNIEnv* km_env, jclass km_clazz, jlong region, jlong rects, jlong count, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetRenderingOrigin(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong x, jlong y) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetSmoothingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong smoothingmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetSolidFillColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jlong align) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatDigitSubstitution(JNIEnv* km_env, jclass km_clazz, jlong format, jlong language, jlong substitute) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatFlags(JNIEnv* km_env, jclass km_clazz, jlong format, jlong flags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatHotkeyPrefix(JNIEnv* km_env, jclass km_clazz, jlong format, jlong hotkeyprefix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatLineAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jlong align) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatMeasurableCharacterRangeCount(JNIEnv* km_env, jclass km_clazz, jlong format, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatTabStopCount(JNIEnv* km_env, jclass km_clazz, jlong format, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatTabStops(JNIEnv* km_env, jclass km_clazz, jlong format, jint count, jlong firsttaboffset, jlong tabstops) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetStringFormatTrimming(JNIEnv* km_env, jclass km_clazz, jlong format, jlong trimming) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetTextContrast(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong contrast) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetTextRenderingHint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong mode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetTextureImage(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong image) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetTextureWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong wrapmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetVisibleClipBounds(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetVisibleClipBoundsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong rect) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGraphicsClear(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint color) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipGraphicsSetAbort(JNIEnv* km_env, jclass km_clazz, jlong pgraphics, jlong piabort) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipImageForceValidation(JNIEnv* km_env, jclass km_clazz, jlong image) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipImageGetFrameCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionid, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipImageGetFrameDimensionsCount(JNIEnv* km_env, jclass km_clazz, jlong image, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipImageGetFrameDimensionsList(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionids, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipImageRotateFlip(JNIEnv* km_env, jclass km_clazz, jlong image, jint rftype) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipImageSelectActiveFrame(JNIEnv* km_env, jclass km_clazz, jlong image, jlong dimensionid, jint frameindex) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipImageSetAbort(JNIEnv* km_env, jclass km_clazz, jlong pimage, jlong piabort) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipInitializePalette(JNIEnv* km_env, jclass km_clazz, jlong palette, jint palettetype, jint optimalcolors, jint usetransparentcolor, jlong bitmap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipInvertMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsClipEmpty(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsEmptyRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsEqualRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong region2, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsInfiniteRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsMatrixEqual(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrix2, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsMatrixIdentity(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsMatrixInvertible(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsOutlineVisiblePathPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jlong pen, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsOutlineVisiblePathPointI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jlong pen, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsStyleAvailable(JNIEnv* km_env, jclass km_clazz, jlong family, jint style, jlong isstyleavailable) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisibleClipEmpty(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisiblePathPoint(JNIEnv* km_env, jclass km_clazz, jlong path, jfloat x, jfloat y, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisiblePathPointI(JNIEnv* km_env, jclass km_clazz, jlong path, jint x, jint y, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisiblePoint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisiblePointI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisibleRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jfloat width, jfloat height, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisibleRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jint width, jint height, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisibleRegionPoint(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat x, jfloat y, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisibleRegionPointI(JNIEnv* km_env, jclass km_clazz, jlong region, jint x, jint y, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisibleRegionRect(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat x, jfloat y, jfloat width, jfloat height, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipIsVisibleRegionRectI(JNIEnv* km_env, jclass km_clazz, jlong region, jint x, jint y, jint width, jint height, jlong graphics, jlong result) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipLoadImageFromFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong image) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipLoadImageFromFileICM(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong image) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipLoadImageFromStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong image) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipLoadImageFromStreamICM(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong image) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMeasureCharacterRanges(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jint regioncount, jlong regions) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMeasureDriverString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong text, jint length, jlong font, jlong positions, jint flags, jlong matrix, jlong boundingbox) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMeasureString(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong string, jint length, jlong font, jlong layoutrect, jlong stringformat, jlong boundingbox, jlong codepointsfitted, jlong linesfilled) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMultiplyLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMultiplyMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong matrix2, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMultiplyPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMultiplyPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMultiplyTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipMultiplyWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipNewInstalledFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipNewPrivateFontCollection(JNIEnv* km_env, jclass km_clazz, jlong fontcollection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterCopyData(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong points, jlong types, jint startindex, jint endindex) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterEnumerate(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong points, jlong types, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterGetCount(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterGetSubpathCount(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterHasCurve(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong hascurve) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterIsValid(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong valid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterNextMarker(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong startindex, jlong endindex) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterNextMarkerPath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterNextPathType(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong pathtype, jlong startindex, jlong endindex) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterNextSubpath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong startindex, jlong endindex, jlong isclosed) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterNextSubpathPath(JNIEnv* km_env, jclass km_clazz, jlong iterator, jlong resultcount, jlong path, jlong isclosed) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPathIterRewind(JNIEnv* km_env, jclass km_clazz, jlong iterator) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPlayMetafileRecord(JNIEnv* km_env, jclass km_clazz, jlong metafile, jint recordtype, jint flags, jint datasize, jlong data) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPrivateAddFontFile(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong filename) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipPrivateAddMemoryFont(JNIEnv* km_env, jclass km_clazz, jlong fontcollection, jlong memory, jint length) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRecordMetafile(JNIEnv* km_env, jclass km_clazz, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRecordMetafileFileName(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRecordMetafileFileNameI(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRecordMetafileI(JNIEnv* km_env, jclass km_clazz, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRecordMetafileStream(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRecordMetafileStreamI(JNIEnv* km_env, jclass km_clazz, jlong stream, jlong referencehdc, jint type, jlong framerect, jint frameunit, jlong description, jlong metafile) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipReleaseDC(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hdc) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRemovePropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jint propid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetClip(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetImageAttributes(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetPageTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetPath(JNIEnv* km_env, jclass km_clazz, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipResetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRestoreGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint state) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipReversePath(JNIEnv* km_env, jclass km_clazz, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRotateLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRotateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat angle, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRotatePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRotatePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat angle, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRotateTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat angle, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipRotateWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat angle, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSaveAdd(JNIEnv* km_env, jclass km_clazz, jlong image, jlong encoderparams) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSaveAddImage(JNIEnv* km_env, jclass km_clazz, jlong image, jlong newimage, jlong encoderparams) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSaveGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong state) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSaveImageToFile(JNIEnv* km_env, jclass km_clazz, jlong image, jlong filename, jlong clsidencoder, jlong encoderparams) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSaveImageToStream(JNIEnv* km_env, jclass km_clazz, jlong image, jlong stream, jlong clsidencoder, jlong encoderparams) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipScaleLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipScaleMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat scalex, jfloat scaley, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipScalePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipScalePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat sx, jfloat sy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipScaleTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat sx, jfloat sy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipScaleWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat sx, jfloat sy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetAdjustableArrowCapFillState(JNIEnv* km_env, jclass km_clazz, jlong cap, jint fillstate) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetAdjustableArrowCapHeight(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat height) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetAdjustableArrowCapMiddleInset(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat middleinset) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetAdjustableArrowCapWidth(JNIEnv* km_env, jclass km_clazz, jlong cap, jfloat width) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetClipGraphics(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong srcgraphics, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetClipHrgn(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong hrgn, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetClipPath(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong path, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetClipRect(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat x, jfloat y, jfloat width, jfloat height, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetClipRectI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y, jint width, jint height, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetClipRegion(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong region, jint combinemode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetCompositingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint compositingmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetCompositingQuality(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint compositingquality) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetCustomLineCapBaseCap(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint basecap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetCustomLineCapBaseInset(JNIEnv* km_env, jclass km_clazz, jlong customcap, jfloat inset) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetCustomLineCapStrokeCaps(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint startcap, jint endcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetCustomLineCapStrokeJoin(JNIEnv* km_env, jclass km_clazz, jlong customcap, jint linejoin) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetCustomLineCapWidthScale(JNIEnv* km_env, jclass km_clazz, jlong customcap, jfloat widthscale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetEffectParameters(JNIEnv* km_env, jclass km_clazz, jlong effect, jlong params, jint size) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetEmpty(JNIEnv* km_env, jclass km_clazz, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesCachedBackground(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint enableflag) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesColorKeys(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint colorlow, jint colorhigh) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesColorMatrix(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jlong colormatrix, jlong graymatrix, jint flags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesGamma(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jfloat gamma) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesNoOp(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesOutputChannel(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint channelflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesOutputChannelColorProfile(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jlong colorprofilefilename) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesRemapTable(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jint mapsize, jlong map) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesThreshold(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type, jint enableflag, jfloat threshold) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesToIdentity(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint type) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImageAttributesWrapMode(JNIEnv* km_env, jclass km_clazz, jlong imageattr, jint wrap, jint argb, jint clamp) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetImagePalette(JNIEnv* km_env, jclass km_clazz, jlong image, jlong palette) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetInfinite(JNIEnv* km_env, jclass km_clazz, jlong region) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetInterpolationMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint interpolationmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetLineBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetLineColors(JNIEnv* km_env, jclass km_clazz, jlong brush, jint color1, jint color2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetLineGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jint usegammacorrection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetLineLinearBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetLinePresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetLineSigmaBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetLineWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetMatrixElements(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat m11, jfloat m12, jfloat m21, jfloat m22, jfloat dx, jfloat dy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetMetafileDownLevelRasterizationLimit(JNIEnv* km_env, jclass km_clazz, jlong metafile, jint metafilerasterizationlimitdpi) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPageScale(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat scale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPageUnit(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint unit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathFillMode(JNIEnv* km_env, jclass km_clazz, jlong path, jint fillmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientCenterColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jint colors) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientCenterPoint(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientCenterPointI(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong points) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientFocusScales(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat xscale, jfloat yscale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientGammaCorrection(JNIEnv* km_env, jclass km_clazz, jlong brush, jint usegammacorrection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientLinearBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientPath(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientPresetBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong blend, jlong positions, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientSigmaBlend(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat focus, jfloat scale) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientSurroundColorsWithCount(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong color, jlong count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathGradientWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPathMarker(JNIEnv* km_env, jclass km_clazz, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenBrushFill(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong brush) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenColor(JNIEnv* km_env, jclass km_clazz, jlong pen, jint argb) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenCompoundArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenCustomEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenCustomStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong customcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenDashArray(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong dash, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenDashCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jint dashcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenDashOffset(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat offset) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenDashStyle(JNIEnv* km_env, jclass km_clazz, jlong pen, jint dashstyle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenEndCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jint endcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenLineCap197819(JNIEnv* km_env, jclass km_clazz, jlong pen, jint startcap, jint endcap, jint dashcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenLineJoin(JNIEnv* km_env, jclass km_clazz, jlong pen, jint linejoin) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat miterlimit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenMode(JNIEnv* km_env, jclass km_clazz, jlong pen, jint penmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenStartCap(JNIEnv* km_env, jclass km_clazz, jlong pen, jint startcap) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenUnit(JNIEnv* km_env, jclass km_clazz, jlong pen, jint unit) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPenWidth(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat width) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPixelOffsetMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint pixeloffsetmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetPropertyItem(JNIEnv* km_env, jclass km_clazz, jlong image, jlong item) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetRenderingOrigin(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint x, jint y) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetSmoothingMode(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint smoothingmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetSolidFillColor(JNIEnv* km_env, jclass km_clazz, jlong brush, jint color) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetStringFormatAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jint align) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetStringFormatDigitSubstitution(JNIEnv* km_env, jclass km_clazz, jlong format, jshort language, jint substitute) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetStringFormatFlags(JNIEnv* km_env, jclass km_clazz, jlong format, jint flags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetStringFormatHotkeyPrefix(JNIEnv* km_env, jclass km_clazz, jlong format, jint hotkeyprefix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetStringFormatLineAlign(JNIEnv* km_env, jclass km_clazz, jlong format, jint align) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetStringFormatMeasurableCharacterRanges(JNIEnv* km_env, jclass km_clazz, jlong format, jint rangecount, jlong ranges) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetStringFormatTabStops(JNIEnv* km_env, jclass km_clazz, jlong format, jfloat firsttaboffset, jint count, jlong tabstops) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetStringFormatTrimming(JNIEnv* km_env, jclass km_clazz, jlong format, jint trimming) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetTextContrast(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint contrast) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetTextRenderingHint(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint mode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetTextureWrapMode(JNIEnv* km_env, jclass km_clazz, jlong brush, jint wrapmode) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipSetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipShearMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat shearx, jfloat sheary, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipStartPathFigure(JNIEnv* km_env, jclass km_clazz, jlong path) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipStringFormatGetGenericDefault(JNIEnv* km_env, jclass km_clazz, jlong format) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipStringFormatGetGenericTypographic(JNIEnv* km_env, jclass km_clazz, jlong format) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTestControl(JNIEnv* km_env, jclass km_clazz, jint control, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTransformMatrixPoints(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTransformMatrixPointsI(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTransformPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTransformPoints(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint destspace, jint srcspace, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTransformPointsI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint destspace, jint srcspace, jlong points, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTransformRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jlong matrix) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslateClip(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat dx, jfloat dy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslateClipI(JNIEnv* km_env, jclass km_clazz, jlong graphics, jint dx, jint dy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslateLineTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslateMatrix(JNIEnv* km_env, jclass km_clazz, jlong matrix, jfloat offsetx, jfloat offsety, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslatePathGradientTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslatePenTransform(JNIEnv* km_env, jclass km_clazz, jlong pen, jfloat dx, jfloat dy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslateRegion(JNIEnv* km_env, jclass km_clazz, jlong region, jfloat dx, jfloat dy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslateRegionI(JNIEnv* km_env, jclass km_clazz, jlong region, jint dx, jint dy) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslateTextureTransform(JNIEnv* km_env, jclass km_clazz, jlong brush, jfloat dx, jfloat dy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipTranslateWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong graphics, jfloat dx, jfloat dy, jint order) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipVectorTransformMatrixPoints(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipVectorTransformMatrixPointsI(JNIEnv* km_env, jclass km_clazz, jlong matrix, jlong pts, jint count) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipWarpPath(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jlong points, jint count, jfloat srcx, jfloat srcy, jfloat srcwidth, jfloat srcheight, jint warpmode, jfloat flatness) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipWidenPath(JNIEnv* km_env, jclass km_clazz, jlong nativepath, jlong pen, jlong matrix, jfloat flatness) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdipWindingModeOutline(JNIEnv* km_env, jclass km_clazz, jlong path, jlong matrix, jfloat flatness) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdiplusNotificationHook(JNIEnv* km_env, jclass km_clazz, jlong token) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdiplusNotificationUnhook(JNIEnv* km_env, jclass km_clazz, jlong token) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdiplusShutdown(JNIEnv* km_env, jclass km_clazz, jlong token) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdiplus_WindowsWin32GraphicsGdiplusJniBridge_windowssys_1windows_1win32_1graphics_1gdiplus_1gdiplusStartup(JNIEnv* km_env, jclass km_clazz, jlong token, jlong input, jlong output) {
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

