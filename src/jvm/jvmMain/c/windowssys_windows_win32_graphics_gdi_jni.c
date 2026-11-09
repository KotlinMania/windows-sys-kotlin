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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1AbortPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AbortPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1AddFontMemResourceEx(JNIEnv* km_env, jclass km_clazz, jlong pfileview, jint cjsize, jlong pvresrved, jlong pnumfonts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontMemResourceEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfileview, (uint32_t)cjsize, (void*)(uintptr_t)pvresrved, (void*)(uintptr_t)pnumfonts) : NULL;
#else
    (void)pfileview;
    (void)cjsize;
    (void)pvresrved;
    (void)pnumfonts;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1AddFontResourceA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1AddFontResourceExA(JNIEnv* km_env, jclass km_clazz, jlong name, jint fl, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (uint32_t)fl, (void*)(uintptr_t)res) : -1;
#else
    (void)name;
    (void)fl;
    (void)res;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1AddFontResourceExW(JNIEnv* km_env, jclass km_clazz, jlong name, jint fl, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (uint32_t)fl, (void*)(uintptr_t)res) : -1;
#else
    (void)name;
    (void)fl;
    (void)res;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1AddFontResourceW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1AngleArc(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint r, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AngleArc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)r, (float)startangle, (float)sweepangle) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)r;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1AnimatePalette(JNIEnv* km_env, jclass km_clazz, jlong hpal, jint istartindex, jint centries, jlong ppe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AnimatePalette");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpal, (uint32_t)istartindex, (uint32_t)centries, (void*)(uintptr_t)ppe) : -1;
#else
    (void)hpal;
    (void)istartindex;
    (void)centries;
    (void)ppe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1Arc(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Arc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)x3, (int32_t)y3, (int32_t)x4, (int32_t)y4) : -1;
#else
    (void)hdc;
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ArcTo(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom, jint xr1, jint yr1, jint xr2, jint yr2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ArcTo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom, (int32_t)xr1, (int32_t)yr1, (int32_t)xr2, (int32_t)yr2) : -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    (void)xr1;
    (void)yr1;
    (void)xr2;
    (void)yr2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1BeginPaint(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppaint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginPaint");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppaint) : NULL;
#else
    (void)hwnd;
    (void)lppaint;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1BeginPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1BitBlt(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint cx, jint cy, jlong hdcsrc, jint x1, jint y1, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BitBlt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (void*)(uintptr_t)hdcsrc, (int32_t)x1, (int32_t)y1, (uint32_t)rop) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)hdcsrc;
    (void)x1;
    (void)y1;
    (void)rop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CancelDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ChangeDisplaySettingsA(JNIEnv* km_env, jclass km_clazz, jlong lpdevmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdevmode, (uint32_t)dwflags) : -1;
#else
    (void)lpdevmode;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ChangeDisplaySettingsExA(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jlong lpdevmode, jlong hwnd, jint dwflags, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdevicename, (void*)(uintptr_t)lpdevmode, (void*)(uintptr_t)hwnd, (uint32_t)dwflags, (void*)(uintptr_t)lparam) : -1;
#else
    (void)lpszdevicename;
    (void)lpdevmode;
    (void)hwnd;
    (void)dwflags;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ChangeDisplaySettingsExW(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jlong lpdevmode, jlong hwnd, jint dwflags, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdevicename, (void*)(uintptr_t)lpdevmode, (void*)(uintptr_t)hwnd, (uint32_t)dwflags, (void*)(uintptr_t)lparam) : -1;
#else
    (void)lpszdevicename;
    (void)lpdevmode;
    (void)hwnd;
    (void)dwflags;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ChangeDisplaySettingsW(JNIEnv* km_env, jclass km_clazz, jlong lpdevmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdevmode, (uint32_t)dwflags) : -1;
#else
    (void)lpdevmode;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1Chord(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Chord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)x3, (int32_t)y3, (int32_t)x4, (int32_t)y4) : -1;
#else
    (void)hdc;
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ClientToScreen(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClientToScreen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppoint) : -1;
#else
    (void)hwnd;
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CloseEnhMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseEnhMetaFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : NULL;
#else
    (void)hdc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CloseFigure(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseFigure");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CloseMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseMetaFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : NULL;
#else
    (void)hdc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CombineRgn(JNIEnv* km_env, jclass km_clazz, jlong hrgndst, jlong hrgnsrc1, jlong hrgnsrc2, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CombineRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgndst, (void*)(uintptr_t)hrgnsrc1, (void*)(uintptr_t)hrgnsrc2, (int32_t)imode) : -1;
#else
    (void)hrgndst;
    (void)hrgnsrc1;
    (void)hrgnsrc2;
    (void)imode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CombineTransform(JNIEnv* km_env, jclass km_clazz, jlong lpxfout, jlong lpxf1, jlong lpxf2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CombineTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpxfout, (void*)(uintptr_t)lpxf1, (void*)(uintptr_t)lpxf2) : -1;
#else
    (void)lpxfout;
    (void)lpxf1;
    (void)lpxf2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CopyEnhMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong henh, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyEnhMetaFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henh, (void*)(uintptr_t)lpfilename) : NULL;
#else
    (void)henh;
    (void)lpfilename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CopyEnhMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong henh, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyEnhMetaFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henh, (void*)(uintptr_t)lpfilename) : NULL;
#else
    (void)henh;
    (void)lpfilename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CopyMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyMetaFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : NULL;
#else
    (void)param0;
    (void)param1;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CopyMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyMetaFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : NULL;
#else
    (void)param0;
    (void)param1;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CopyRect(JNIEnv* km_env, jclass km_clazz, jlong lprcdst, jlong lprcsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprcdst, (void*)(uintptr_t)lprcsrc) : -1;
#else
    (void)lprcdst;
    (void)lprcsrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateBitmap(JNIEnv* km_env, jclass km_clazz, jint nwidth, jint nheight, jint nplanes, jint nbitcount, jlong lpbits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBitmap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nwidth, (int32_t)nheight, (uint32_t)nplanes, (uint32_t)nbitcount, (void*)(uintptr_t)lpbits) : NULL;
#else
    (void)nwidth;
    (void)nheight;
    (void)nplanes;
    (void)nbitcount;
    (void)lpbits;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateBitmapIndirect(JNIEnv* km_env, jclass km_clazz, jlong pbm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBitmapIndirect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbm) : NULL;
#else
    (void)pbm;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateBrushIndirect(JNIEnv* km_env, jclass km_clazz, jlong plbrush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBrushIndirect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plbrush) : NULL;
#else
    (void)plbrush;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateCompatibleBitmap(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint cx, jint cy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCompatibleBitmap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)cx, (int32_t)cy) : NULL;
#else
    (void)hdc;
    (void)cx;
    (void)cy;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateCompatibleDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCompatibleDC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : NULL;
#else
    (void)hdc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateDCA(JNIEnv* km_env, jclass km_clazz, jlong pwszdriver, jlong pwszdevice, jlong pszport, jlong pdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDCA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszdriver, (void*)(uintptr_t)pwszdevice, (void*)(uintptr_t)pszport, (void*)(uintptr_t)pdm) : NULL;
#else
    (void)pwszdriver;
    (void)pwszdevice;
    (void)pszport;
    (void)pdm;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateDCW(JNIEnv* km_env, jclass km_clazz, jlong pwszdriver, jlong pwszdevice, jlong pszport, jlong pdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDCW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszdriver, (void*)(uintptr_t)pwszdevice, (void*)(uintptr_t)pszport, (void*)(uintptr_t)pdm) : NULL;
#else
    (void)pwszdriver;
    (void)pwszdevice;
    (void)pszport;
    (void)pdm;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateDIBPatternBrush(JNIEnv* km_env, jclass km_clazz, jlong h, jint iusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBPatternBrush");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)h, (uint32_t)iusage) : NULL;
#else
    (void)h;
    (void)iusage;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateDIBPatternBrushPt(JNIEnv* km_env, jclass km_clazz, jlong lppackeddib, jint iusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBPatternBrushPt");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppackeddib, (uint32_t)iusage) : NULL;
#else
    (void)lppackeddib;
    (void)iusage;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateDIBSection(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pbmi, jint usage, jlong ppvbits, jlong hsection, jint offset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBSection");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pbmi, (uint32_t)usage, (void*)(uintptr_t)ppvbits, (void*)(uintptr_t)hsection, (uint32_t)offset) : NULL;
#else
    (void)hdc;
    (void)pbmi;
    (void)usage;
    (void)ppvbits;
    (void)hsection;
    (void)offset;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateDIBitmap(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pbmih, jint flinit, jlong pjbits, jlong pbmi, jint iusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBitmap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pbmih, (uint32_t)flinit, (void*)(uintptr_t)pjbits, (void*)(uintptr_t)pbmi, (uint32_t)iusage) : NULL;
#else
    (void)hdc;
    (void)pbmih;
    (void)flinit;
    (void)pjbits;
    (void)pbmi;
    (void)iusage;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateDiscardableBitmap(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint cx, jint cy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDiscardableBitmap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)cx, (int32_t)cy) : NULL;
#else
    (void)hdc;
    (void)cx;
    (void)cy;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateEllipticRgn(JNIEnv* km_env, jclass km_clazz, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEllipticRgn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2) : NULL;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateEllipticRgnIndirect(JNIEnv* km_env, jclass km_clazz, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEllipticRgnIndirect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprect) : NULL;
#else
    (void)lprect;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateEnhMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpfilename, jlong lprc, jlong lpdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnhMetaFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lprc, (void*)(uintptr_t)lpdesc) : NULL;
#else
    (void)hdc;
    (void)lpfilename;
    (void)lprc;
    (void)lpdesc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateEnhMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpfilename, jlong lprc, jlong lpdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnhMetaFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lprc, (void*)(uintptr_t)lpdesc) : NULL;
#else
    (void)hdc;
    (void)lpfilename;
    (void)lprc;
    (void)lpdesc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateFontA(JNIEnv* km_env, jclass km_clazz, jint cheight, jint cwidth, jint cescapement, jint corientation, jint cweight, jint bitalic, jint bunderline, jint bstrikeout, jint icharset, jint ioutprecision, jint iclipprecision, jint iquality, jint ipitchandfamily, jlong pszfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cheight, (int32_t)cwidth, (int32_t)cescapement, (int32_t)corientation, (int32_t)cweight, (uint32_t)bitalic, (uint32_t)bunderline, (uint32_t)bstrikeout, (uint32_t)icharset, (uint32_t)ioutprecision, (uint32_t)iclipprecision, (uint32_t)iquality, (uint32_t)ipitchandfamily, (void*)(uintptr_t)pszfacename) : NULL;
#else
    (void)cheight;
    (void)cwidth;
    (void)cescapement;
    (void)corientation;
    (void)cweight;
    (void)bitalic;
    (void)bunderline;
    (void)bstrikeout;
    (void)icharset;
    (void)ioutprecision;
    (void)iclipprecision;
    (void)iquality;
    (void)ipitchandfamily;
    (void)pszfacename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateFontIndirectA(JNIEnv* km_env, jclass km_clazz, jlong lplf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplf) : NULL;
#else
    (void)lplf;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateFontIndirectExA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateFontIndirectExW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateFontIndirectW(JNIEnv* km_env, jclass km_clazz, jlong lplf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplf) : NULL;
#else
    (void)lplf;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateFontPackage(JNIEnv* km_env, jclass km_clazz, jlong puchsrcbuffer, jint ulsrcbuffersize, jlong ppuchfontpackagebuffer, jlong pulfontpackagebuffersize, jlong pulbyteswritten, jshort usflag, jshort usttcindex, jshort ussubsetformat, jshort ussubsetlanguage, jshort ussubsetplatform, jshort ussubsetencoding, jlong pussubsetkeeplist, jshort ussubsetlistcount, jlong lpfnallocate, jlong lpfnreallocate, jlong lpfnfree, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint16_t, uint16_t, uint16_t, uint16_t, int16_t, int16_t, void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fontsub.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontPackage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puchsrcbuffer, (uint32_t)ulsrcbuffersize, (void*)(uintptr_t)ppuchfontpackagebuffer, (void*)(uintptr_t)pulfontpackagebuffersize, (void*)(uintptr_t)pulbyteswritten, (uint16_t)usflag, (uint16_t)usttcindex, (uint16_t)ussubsetformat, (uint16_t)ussubsetlanguage, (int16_t)ussubsetplatform, (int16_t)ussubsetencoding, (void*)(uintptr_t)pussubsetkeeplist, (uint16_t)ussubsetlistcount, (void*)(uintptr_t)lpfnallocate, (void*)(uintptr_t)lpfnreallocate, (void*)(uintptr_t)lpfnfree, (void*)(uintptr_t)lpvreserved) : 0;
#else
    (void)puchsrcbuffer;
    (void)ulsrcbuffersize;
    (void)ppuchfontpackagebuffer;
    (void)pulfontpackagebuffersize;
    (void)pulbyteswritten;
    (void)usflag;
    (void)usttcindex;
    (void)ussubsetformat;
    (void)ussubsetlanguage;
    (void)ussubsetplatform;
    (void)ussubsetencoding;
    (void)pussubsetkeeplist;
    (void)ussubsetlistcount;
    (void)lpfnallocate;
    (void)lpfnreallocate;
    (void)lpfnfree;
    (void)lpvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateFontW(JNIEnv* km_env, jclass km_clazz, jint cheight, jint cwidth, jint cescapement, jint corientation, jint cweight, jint bitalic, jint bunderline, jint bstrikeout, jint icharset, jint ioutprecision, jint iclipprecision, jint iquality, jint ipitchandfamily, jlong pszfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cheight, (int32_t)cwidth, (int32_t)cescapement, (int32_t)corientation, (int32_t)cweight, (uint32_t)bitalic, (uint32_t)bunderline, (uint32_t)bstrikeout, (uint32_t)icharset, (uint32_t)ioutprecision, (uint32_t)iclipprecision, (uint32_t)iquality, (uint32_t)ipitchandfamily, (void*)(uintptr_t)pszfacename) : NULL;
#else
    (void)cheight;
    (void)cwidth;
    (void)cescapement;
    (void)corientation;
    (void)cweight;
    (void)bitalic;
    (void)bunderline;
    (void)bstrikeout;
    (void)icharset;
    (void)ioutprecision;
    (void)iclipprecision;
    (void)iquality;
    (void)ipitchandfamily;
    (void)pszfacename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateHalftonePalette(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHalftonePalette");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : NULL;
#else
    (void)hdc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateHatchBrush(JNIEnv* km_env, jclass km_clazz, jint ihatch, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHatchBrush");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)ihatch, (uint32_t)color) : NULL;
#else
    (void)ihatch;
    (void)color;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateICA(JNIEnv* km_env, jclass km_clazz, jlong pszdriver, jlong pszdevice, jlong pszport, jlong pdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateICA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdriver, (void*)(uintptr_t)pszdevice, (void*)(uintptr_t)pszport, (void*)(uintptr_t)pdm) : NULL;
#else
    (void)pszdriver;
    (void)pszdevice;
    (void)pszport;
    (void)pdm;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateICW(JNIEnv* km_env, jclass km_clazz, jlong pszdriver, jlong pszdevice, jlong pszport, jlong pdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateICW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdriver, (void*)(uintptr_t)pszdevice, (void*)(uintptr_t)pszport, (void*)(uintptr_t)pdm) : NULL;
#else
    (void)pszdriver;
    (void)pszdevice;
    (void)pszport;
    (void)pdm;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong pszfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMetaFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile) : NULL;
#else
    (void)pszfile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong pszfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMetaFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile) : NULL;
#else
    (void)pszfile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreatePalette(JNIEnv* km_env, jclass km_clazz, jlong plpal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePalette");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plpal) : NULL;
#else
    (void)plpal;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreatePatternBrush(JNIEnv* km_env, jclass km_clazz, jlong hbm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatternBrush");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbm) : NULL;
#else
    (void)hbm;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreatePen(JNIEnv* km_env, jclass km_clazz, jint istyle, jint cwidth, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)istyle, (int32_t)cwidth, (uint32_t)color) : NULL;
#else
    (void)istyle;
    (void)cwidth;
    (void)color;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreatePenIndirect(JNIEnv* km_env, jclass km_clazz, jlong plpen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePenIndirect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plpen) : NULL;
#else
    (void)plpen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreatePolyPolygonRgn(JNIEnv* km_env, jclass km_clazz, jlong pptl, jlong pc, jint cpoly, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePolyPolygonRgn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pptl, (void*)(uintptr_t)pc, (int32_t)cpoly, (int32_t)imode) : NULL;
#else
    (void)pptl;
    (void)pc;
    (void)cpoly;
    (void)imode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreatePolygonRgn(JNIEnv* km_env, jclass km_clazz, jlong pptl, jint cpoint, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePolygonRgn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pptl, (int32_t)cpoint, (int32_t)imode) : NULL;
#else
    (void)pptl;
    (void)cpoint;
    (void)imode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateRectRgn(JNIEnv* km_env, jclass km_clazz, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRectRgn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2) : NULL;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateRectRgnIndirect(JNIEnv* km_env, jclass km_clazz, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRectRgnIndirect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprect) : NULL;
#else
    (void)lprect;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateRoundRectRgn(JNIEnv* km_env, jclass km_clazz, jint x1, jint y1, jint x2, jint y2, jint w, jint h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRoundRectRgn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)w, (int32_t)h) : NULL;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)w;
    (void)h;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateScalableFontResourceA(JNIEnv* km_env, jclass km_clazz, jint fdwhidden, jlong lpszfont, jlong lpszfile, jlong lpszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateScalableFontResourceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fdwhidden, (void*)(uintptr_t)lpszfont, (void*)(uintptr_t)lpszfile, (void*)(uintptr_t)lpszpath) : -1;
#else
    (void)fdwhidden;
    (void)lpszfont;
    (void)lpszfile;
    (void)lpszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateScalableFontResourceW(JNIEnv* km_env, jclass km_clazz, jint fdwhidden, jlong lpszfont, jlong lpszfile, jlong lpszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateScalableFontResourceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fdwhidden, (void*)(uintptr_t)lpszfont, (void*)(uintptr_t)lpszfile, (void*)(uintptr_t)lpszpath) : -1;
#else
    (void)fdwhidden;
    (void)lpszfont;
    (void)lpszfile;
    (void)lpszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1CreateSolidBrush(JNIEnv* km_env, jclass km_clazz, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSolidBrush");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)color) : NULL;
#else
    (void)color;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DPtoLP(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPtoLP");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt, (int32_t)c) : -1;
#else
    (void)hdc;
    (void)lppt;
    (void)c;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DeleteDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DeleteEnhMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hmf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteEnhMetaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmf) : -1;
#else
    (void)hmf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DeleteMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hmf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMetaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmf) : -1;
#else
    (void)hmf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DeleteObject(JNIEnv* km_env, jclass km_clazz, jlong ho) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ho) : -1;
#else
    (void)ho;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawAnimatedRects(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint idani, jlong lprcfrom, jlong lprcto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawAnimatedRects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)idani, (void*)(uintptr_t)lprcfrom, (void*)(uintptr_t)lprcto) : -1;
#else
    (void)hwnd;
    (void)idani;
    (void)lprcfrom;
    (void)lprcto;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawCaption(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdc, jlong lprect, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawCaption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect, (uint32_t)flags) : -1;
#else
    (void)hwnd;
    (void)hdc;
    (void)lprect;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawEdge(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong qrc, jint edge, jint grfflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawEdge");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)qrc, (uint32_t)edge, (uint32_t)grfflags) : -1;
#else
    (void)hdc;
    (void)qrc;
    (void)edge;
    (void)grfflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawEscape(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint iescape, jint cjin, jlong lpin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawEscape");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)iescape, (int32_t)cjin, (void*)(uintptr_t)lpin) : -1;
#else
    (void)hdc;
    (void)iescape;
    (void)cjin;
    (void)lpin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawFocusRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawFocusRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc) : -1;
#else
    (void)hdc;
    (void)lprc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawFrameControl(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawFrameControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (uint32_t)param3) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawStateA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbrfore, jlong qfncallback, jlong ldata, jlong wdata, jint x, jint y, jint cx, jint cy, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint64_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbrfore, (void*)(uintptr_t)qfncallback, (int64_t)ldata, (uint64_t)wdata, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (uint32_t)uflags) : -1;
#else
    (void)hdc;
    (void)hbrfore;
    (void)qfncallback;
    (void)ldata;
    (void)wdata;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawStateW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbrfore, jlong qfncallback, jlong ldata, jlong wdata, jint x, jint y, jint cx, jint cy, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint64_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbrfore, (void*)(uintptr_t)qfncallback, (int64_t)ldata, (uint64_t)wdata, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (uint32_t)uflags) : -1;
#else
    (void)hdc;
    (void)hbrfore;
    (void)qfncallback;
    (void)ldata;
    (void)wdata;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawTextA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpchtext, jint cchtext, jlong lprc, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpchtext, (int32_t)cchtext, (void*)(uintptr_t)lprc, (uint32_t)format) : -1;
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawTextExA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpchtext, jint cchtext, jlong lprc, jint format, jlong lpdtp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpchtext, (int32_t)cchtext, (void*)(uintptr_t)lprc, (uint32_t)format, (void*)(uintptr_t)lpdtp) : -1;
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    (void)lpdtp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawTextExW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpchtext, jint cchtext, jlong lprc, jint format, jlong lpdtp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpchtext, (int32_t)cchtext, (void*)(uintptr_t)lprc, (uint32_t)format, (void*)(uintptr_t)lpdtp) : -1;
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    (void)lpdtp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1DrawTextW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpchtext, jint cchtext, jlong lprc, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpchtext, (int32_t)cchtext, (void*)(uintptr_t)lprc, (uint32_t)format) : -1;
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1Ellipse(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ellipse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom) : -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EndPaint(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppaint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPaint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppaint) : -1;
#else
    (void)hwnd;
    (void)lppaint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EndPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumDisplayDevicesA(JNIEnv* km_env, jclass km_clazz, jlong lpdevice, jint idevnum, jlong lpdisplaydevice, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayDevicesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdevice, (uint32_t)idevnum, (void*)(uintptr_t)lpdisplaydevice, (uint32_t)dwflags) : -1;
#else
    (void)lpdevice;
    (void)idevnum;
    (void)lpdisplaydevice;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumDisplayDevicesW(JNIEnv* km_env, jclass km_clazz, jlong lpdevice, jint idevnum, jlong lpdisplaydevice, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayDevicesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdevice, (uint32_t)idevnum, (void*)(uintptr_t)lpdisplaydevice, (uint32_t)dwflags) : -1;
#else
    (void)lpdevice;
    (void)idevnum;
    (void)lpdisplaydevice;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumDisplayMonitors(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprcclip, jlong lpfnenum, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayMonitors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprcclip, (void*)(uintptr_t)lpfnenum, (int64_t)dwdata) : -1;
#else
    (void)hdc;
    (void)lprcclip;
    (void)lpfnenum;
    (void)dwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumDisplaySettingsA(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jint imodenum, jlong lpdevmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdevicename, (uint32_t)imodenum, (void*)(uintptr_t)lpdevmode) : -1;
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumDisplaySettingsExA(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jint imodenum, jlong lpdevmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdevicename, (uint32_t)imodenum, (void*)(uintptr_t)lpdevmode, (uint32_t)dwflags) : -1;
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumDisplaySettingsExW(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jint imodenum, jlong lpdevmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdevicename, (uint32_t)imodenum, (void*)(uintptr_t)lpdevmode, (uint32_t)dwflags) : -1;
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumDisplaySettingsW(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jint imodenum, jlong lpdevmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdevicename, (uint32_t)imodenum, (void*)(uintptr_t)lpdevmode) : -1;
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumEnhMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hmf, jlong proc, jlong param3, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumEnhMetaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hmf, (void*)(uintptr_t)proc, (void*)(uintptr_t)param3, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hdc;
    (void)hmf;
    (void)proc;
    (void)param3;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumFontFamiliesA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam) : -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumFontFamiliesExA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam, (uint32_t)dwflags) : -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumFontFamiliesExW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam, (uint32_t)dwflags) : -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumFontFamiliesW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam) : -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumFontsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam) : -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumFontsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam) : -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hmf, jlong proc, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumMetaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hmf, (void*)(uintptr_t)proc, (int64_t)param3) : -1;
#else
    (void)hdc;
    (void)hmf;
    (void)proc;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EnumObjects(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ntype, jlong lpfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumObjects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)ntype, (void*)(uintptr_t)lpfunc, (int64_t)lparam) : -1;
#else
    (void)hdc;
    (void)ntype;
    (void)lpfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EqualRect(JNIEnv* km_env, jclass km_clazz, jlong lprc1, jlong lprc2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprc1, (void*)(uintptr_t)lprc2) : -1;
#else
    (void)lprc1;
    (void)lprc2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1EqualRgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn1, jlong hrgn2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgn1, (void*)(uintptr_t)hrgn2) : -1;
#else
    (void)hrgn1;
    (void)hrgn2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ExcludeClipRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExcludeClipRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom) : -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ExcludeUpdateRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExcludeUpdateRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hwnd) : -1;
#else
    (void)hdc;
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ExtCreatePen(JNIEnv* km_env, jclass km_clazz, jint ipenstyle, jint cwidth, jlong plbrush, jint cstyle, jlong pstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtCreatePen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ipenstyle, (uint32_t)cwidth, (void*)(uintptr_t)plbrush, (uint32_t)cstyle, (void*)(uintptr_t)pstyle) : NULL;
#else
    (void)ipenstyle;
    (void)cwidth;
    (void)plbrush;
    (void)cstyle;
    (void)pstyle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ExtCreateRegion(JNIEnv* km_env, jclass km_clazz, jlong lpx, jint ncount, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtCreateRegion");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpx, (uint32_t)ncount, (void*)(uintptr_t)lpdata) : NULL;
#else
    (void)lpx;
    (void)ncount;
    (void)lpdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ExtFloodFill(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint color, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtFloodFill");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)color, (uint32_t)type) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    (void)type;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ExtSelectClipRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtSelectClipRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn, (int32_t)mode) : -1;
#else
    (void)hdc;
    (void)hrgn;
    (void)mode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ExtTextOutA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint options, jlong lprect, jlong lpstring, jint c, jlong lpdx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtTextOutA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)options, (void*)(uintptr_t)lprect, (void*)(uintptr_t)lpstring, (uint32_t)c, (void*)(uintptr_t)lpdx) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)options;
    (void)lprect;
    (void)lpstring;
    (void)c;
    (void)lpdx;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ExtTextOutW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint options, jlong lprect, jlong lpstring, jint c, jlong lpdx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtTextOutW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)options, (void*)(uintptr_t)lprect, (void*)(uintptr_t)lpstring, (uint32_t)c, (void*)(uintptr_t)lpdx) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)options;
    (void)lprect;
    (void)lpstring;
    (void)c;
    (void)lpdx;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1FillPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1FillRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc, jlong hbr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc, (void*)(uintptr_t)hbr) : -1;
#else
    (void)hdc;
    (void)lprc;
    (void)hbr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1FillRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn, jlong hbr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn, (void*)(uintptr_t)hbr) : -1;
#else
    (void)hdc;
    (void)hrgn;
    (void)hbr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1FixBrushOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong ptl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FixBrushOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)ptl) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)ptl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1FlattenPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlattenPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1FloodFill(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FloodFill");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)color) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1FrameRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc, jlong hbr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FrameRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc, (void*)(uintptr_t)hbr) : -1;
#else
    (void)hdc;
    (void)lprc;
    (void)hbr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1FrameRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn, jlong hbr, jint w, jint h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FrameRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn, (void*)(uintptr_t)hbr, (int32_t)w, (int32_t)h) : -1;
#else
    (void)hdc;
    (void)hrgn;
    (void)hbr;
    (void)w;
    (void)h;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GdiComment(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint nsize, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiComment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)nsize, (void*)(uintptr_t)lpdata) : -1;
#else
    (void)hdc;
    (void)nsize;
    (void)lpdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GdiFlush(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiFlush");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GdiGetBatchLimit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetBatchLimit");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GdiGradientFill(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pvertex, jint nvertex, jlong pmesh, jint ncount, jint ulmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGradientFill");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pvertex, (uint32_t)nvertex, (void*)(uintptr_t)pmesh, (uint32_t)ncount, (uint32_t)ulmode) : -1;
#else
    (void)hdc;
    (void)pvertex;
    (void)nvertex;
    (void)pmesh;
    (void)ncount;
    (void)ulmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GdiSetBatchLimit(JNIEnv* km_env, jclass km_clazz, jint dw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiSetBatchLimit");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dw) : 0;
#else
    (void)dw;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GdiTransparentBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jint xorigindest, jint yorigindest, jint wdest, jint hdest, jlong hdcsrc, jint xoriginsrc, jint yoriginsrc, jint wsrc, jint hsrc, jint crtransparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiTransparentBlt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdcdest, (int32_t)xorigindest, (int32_t)yorigindest, (int32_t)wdest, (int32_t)hdest, (void*)(uintptr_t)hdcsrc, (int32_t)xoriginsrc, (int32_t)yoriginsrc, (int32_t)wsrc, (int32_t)hsrc, (uint32_t)crtransparent) : -1;
#else
    (void)hdcdest;
    (void)xorigindest;
    (void)yorigindest;
    (void)wdest;
    (void)hdest;
    (void)hdcsrc;
    (void)xoriginsrc;
    (void)yoriginsrc;
    (void)wsrc;
    (void)hsrc;
    (void)crtransparent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetArcDirection(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetArcDirection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetAspectRatioFilterEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAspectRatioFilterEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpsize) : -1;
#else
    (void)hdc;
    (void)lpsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetBitmapBits(JNIEnv* km_env, jclass km_clazz, jlong hbit, jint cb, jlong lpvbits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBitmapBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbit, (int32_t)cb, (void*)(uintptr_t)lpvbits) : -1;
#else
    (void)hbit;
    (void)cb;
    (void)lpvbits;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetBitmapDimensionEx(JNIEnv* km_env, jclass km_clazz, jlong hbit, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBitmapDimensionEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbit, (void*)(uintptr_t)lpsize) : -1;
#else
    (void)hbit;
    (void)lpsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetBkColor(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBkColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetBkMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBkMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetBoundsRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprect, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBoundsRect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect, (uint32_t)flags) : 0;
#else
    (void)hdc;
    (void)lprect;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetBrushOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBrushOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharABCWidthsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint wfirst, jint wlast, jlong lpabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)wfirst, (uint32_t)wlast, (void*)(uintptr_t)lpabc) : -1;
#else
    (void)hdc;
    (void)wfirst;
    (void)wlast;
    (void)lpabc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharABCWidthsFloatA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsFloatA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpabc) : -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpabc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharABCWidthsFloatW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsFloatW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpabc) : -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpabc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharABCWidthsI(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint gifirst, jint cgi, jlong pgi, jlong pabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)gifirst, (uint32_t)cgi, (void*)(uintptr_t)pgi, (void*)(uintptr_t)pabc) : -1;
#else
    (void)hdc;
    (void)gifirst;
    (void)cgi;
    (void)pgi;
    (void)pabc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharABCWidthsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint wfirst, jint wlast, jlong lpabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)wfirst, (uint32_t)wlast, (void*)(uintptr_t)lpabc) : -1;
#else
    (void)hdc;
    (void)wfirst;
    (void)wlast;
    (void)lpabc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharWidth32A(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidth32A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharWidth32W(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidth32W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharWidthA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharWidthFloatA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthFloatA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharWidthFloatW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthFloatW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharWidthI(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint gifirst, jint cgi, jlong pgi, jlong piwidths) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)gifirst, (uint32_t)cgi, (void*)(uintptr_t)pgi, (void*)(uintptr_t)piwidths) : -1;
#else
    (void)hdc;
    (void)gifirst;
    (void)cgi;
    (void)pgi;
    (void)piwidths;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharWidthW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharacterPlacementA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint ncount, jint nmexextent, jlong lpresults, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharacterPlacementA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)ncount, (int32_t)nmexextent, (void*)(uintptr_t)lpresults, (uint32_t)dwflags) : 0;
#else
    (void)hdc;
    (void)lpstring;
    (void)ncount;
    (void)nmexextent;
    (void)lpresults;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCharacterPlacementW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint ncount, jint nmexextent, jlong lpresults, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharacterPlacementW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)ncount, (int32_t)nmexextent, (void*)(uintptr_t)lpresults, (uint32_t)dwflags) : 0;
#else
    (void)hdc;
    (void)lpstring;
    (void)ncount;
    (void)nmexextent;
    (void)lpresults;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetClipBox(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipBox");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hdc;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetClipRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn) : -1;
#else
    (void)hdc;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetColorAdjustment(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpca) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorAdjustment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpca) : -1;
#else
    (void)hdc;
    (void)lpca;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCurrentObject(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentObject");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)type) : NULL;
#else
    (void)hdc;
    (void)type;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetCurrentPositionEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPositionEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetDC(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : NULL;
#else
    (void)hwnd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetDCBrushColor(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCBrushColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetDCEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgnclip, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgnclip, (uint32_t)flags) : NULL;
#else
    (void)hwnd;
    (void)hrgnclip;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetDCOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetDCPenColor(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCPenColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetDIBColorTable(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint istart, jint centries, jlong prgbq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDIBColorTable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)prgbq) : 0;
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)prgbq;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetDIBits(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbm, jint start, jint clines, jlong lpvbits, jlong lpbmi, jint usage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDIBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbm, (uint32_t)start, (uint32_t)clines, (void*)(uintptr_t)lpvbits, (void*)(uintptr_t)lpbmi, (uint32_t)usage) : -1;
#else
    (void)hdc;
    (void)hbm;
    (void)start;
    (void)clines;
    (void)lpvbits;
    (void)lpbmi;
    (void)usage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetDeviceCaps(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint arg_1_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceCaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)arg_1_index) : -1;
#else
    (void)hdc;
    (void)arg_1_index;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetEnhMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname) : NULL;
#else
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetEnhMetaFileBits(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint nsize, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileBits");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)nsize, (void*)(uintptr_t)lpdata) : 0;
#else
    (void)hemf;
    (void)nsize;
    (void)lpdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetEnhMetaFileDescriptionA(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cchbuffer, jlong lpdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileDescriptionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cchbuffer, (void*)(uintptr_t)lpdescription) : 0;
#else
    (void)hemf;
    (void)cchbuffer;
    (void)lpdescription;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetEnhMetaFileDescriptionW(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cchbuffer, jlong lpdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileDescriptionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cchbuffer, (void*)(uintptr_t)lpdescription) : 0;
#else
    (void)hemf;
    (void)cchbuffer;
    (void)lpdescription;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetEnhMetaFileHeader(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint nsize, jlong lpenhmetaheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)nsize, (void*)(uintptr_t)lpenhmetaheader) : 0;
#else
    (void)hemf;
    (void)nsize;
    (void)lpenhmetaheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetEnhMetaFilePaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint nnumentries, jlong lppaletteentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFilePaletteEntries");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)nnumentries, (void*)(uintptr_t)lppaletteentries) : 0;
#else
    (void)hemf;
    (void)nnumentries;
    (void)lppaletteentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetEnhMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname) : NULL;
#else
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetFontData(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint dwtable, jint dwoffset, jlong pvbuffer, jint cjbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)dwtable, (uint32_t)dwoffset, (void*)(uintptr_t)pvbuffer, (uint32_t)cjbuffer) : 0;
#else
    (void)hdc;
    (void)dwtable;
    (void)dwoffset;
    (void)pvbuffer;
    (void)cjbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetFontLanguageInfo(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontLanguageInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetFontUnicodeRanges(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpgs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontUnicodeRanges");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpgs) : 0;
#else
    (void)hdc;
    (void)lpgs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetGlyphIndicesA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstr, jint c, jlong pgi, jint fl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphIndicesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstr, (int32_t)c, (void*)(uintptr_t)pgi, (uint32_t)fl) : 0;
#else
    (void)hdc;
    (void)lpstr;
    (void)c;
    (void)pgi;
    (void)fl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetGlyphIndicesW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstr, jint c, jlong pgi, jint fl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphIndicesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstr, (int32_t)c, (void*)(uintptr_t)pgi, (uint32_t)fl) : 0;
#else
    (void)hdc;
    (void)lpstr;
    (void)c;
    (void)pgi;
    (void)fl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetGlyphOutlineA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint uchar, jint fuformat, jlong lpgm, jint cjbuffer, jlong pvbuffer, jlong lpmat2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphOutlineA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)uchar, (uint32_t)fuformat, (void*)(uintptr_t)lpgm, (uint32_t)cjbuffer, (void*)(uintptr_t)pvbuffer, (void*)(uintptr_t)lpmat2) : 0;
#else
    (void)hdc;
    (void)uchar;
    (void)fuformat;
    (void)lpgm;
    (void)cjbuffer;
    (void)pvbuffer;
    (void)lpmat2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetGlyphOutlineW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint uchar, jint fuformat, jlong lpgm, jint cjbuffer, jlong pvbuffer, jlong lpmat2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphOutlineW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)uchar, (uint32_t)fuformat, (void*)(uintptr_t)lpgm, (uint32_t)cjbuffer, (void*)(uintptr_t)pvbuffer, (void*)(uintptr_t)lpmat2) : 0;
#else
    (void)hdc;
    (void)uchar;
    (void)fuformat;
    (void)lpgm;
    (void)cjbuffer;
    (void)pvbuffer;
    (void)lpmat2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetGraphicsMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGraphicsMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetKerningPairsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint npairs, jlong lpkernpair) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKerningPairsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)npairs, (void*)(uintptr_t)lpkernpair) : 0;
#else
    (void)hdc;
    (void)npairs;
    (void)lpkernpair;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetKerningPairsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint npairs, jlong lpkernpair) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKerningPairsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)npairs, (void*)(uintptr_t)lpkernpair) : 0;
#else
    (void)hdc;
    (void)npairs;
    (void)lpkernpair;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetLayout(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLayout");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetMapMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname) : NULL;
#else
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetMetaFileBitsEx(JNIEnv* km_env, jclass km_clazz, jlong hmf, jint cbbuffer, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileBitsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmf, (uint32_t)cbbuffer, (void*)(uintptr_t)lpdata) : 0;
#else
    (void)hmf;
    (void)cbbuffer;
    (void)lpdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname) : NULL;
#else
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetMetaRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn) : -1;
#else
    (void)hdc;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong plimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMiterLimit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)plimit) : -1;
#else
    (void)hdc;
    (void)plimit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetMonitorInfoA(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong lpmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)lpmi) : -1;
#else
    (void)hmonitor;
    (void)lpmi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetMonitorInfoW(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong lpmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)lpmi) : -1;
#else
    (void)hmonitor;
    (void)lpmi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetNearestColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNearestColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color) : 0;
#else
    (void)hdc;
    (void)color;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetNearestPaletteIndex(JNIEnv* km_env, jclass km_clazz, jlong h, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNearestPaletteIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)h, (uint32_t)color) : 0;
#else
    (void)h;
    (void)color;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetObjectA(JNIEnv* km_env, jclass km_clazz, jlong h, jint c, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)h, (int32_t)c, (void*)(uintptr_t)pv) : -1;
#else
    (void)h;
    (void)c;
    (void)pv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetObjectType(JNIEnv* km_env, jclass km_clazz, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectType");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)h) : 0;
#else
    (void)h;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetObjectW(JNIEnv* km_env, jclass km_clazz, jlong h, jint c, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)h, (int32_t)c, (void*)(uintptr_t)pv) : -1;
#else
    (void)h;
    (void)c;
    (void)pv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetOutlineTextMetricsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint cjcopy, jlong potm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOutlineTextMetricsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)cjcopy, (void*)(uintptr_t)potm) : 0;
#else
    (void)hdc;
    (void)cjcopy;
    (void)potm;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetOutlineTextMetricsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint cjcopy, jlong potm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOutlineTextMetricsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)cjcopy, (void*)(uintptr_t)potm) : 0;
#else
    (void)hdc;
    (void)cjcopy;
    (void)potm;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetPaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong hpal, jint istart, jint centries, jlong ppalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPaletteEntries");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpal, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)ppalentries) : 0;
#else
    (void)hpal;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetPath(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jlong aj, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (void*)(uintptr_t)aj, (int32_t)cpt) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)aj;
    (void)cpt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetPixel(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPixel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y) : 0;
#else
    (void)hdc;
    (void)x;
    (void)y;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetPolyFillMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPolyFillMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetROP2(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetROP2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetRandomRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRandomRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn, (int32_t)i) : -1;
#else
    (void)hdc;
    (void)hrgn;
    (void)i;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetRasterizerCaps(JNIEnv* km_env, jclass km_clazz, jlong lpraststat, jint cjbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRasterizerCaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpraststat, (uint32_t)cjbytes) : -1;
#else
    (void)lpraststat;
    (void)cjbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetRegionData(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jint ncount, jlong lprgndata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegionData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgn, (uint32_t)ncount, (void*)(uintptr_t)lprgndata) : 0;
#else
    (void)hrgn;
    (void)ncount;
    (void)lprgndata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetRgnBox(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRgnBox");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgn, (void*)(uintptr_t)lprc) : -1;
#else
    (void)hrgn;
    (void)lprc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetStockObject(JNIEnv* km_env, jclass km_clazz, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStockObject");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)i) : NULL;
#else
    (void)i;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetStretchBltMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStretchBltMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetSysColor(JNIEnv* km_env, jclass km_clazz, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSysColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nindex) : 0;
#else
    (void)nindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetSysColorBrush(JNIEnv* km_env, jclass km_clazz, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSysColorBrush");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nindex) : NULL;
#else
    (void)nindex;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetSystemPaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint istart, jint centries, jlong ppalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPaletteEntries");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)ppalentries) : 0;
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetSystemPaletteUse(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPaletteUse");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTabbedTextExtentA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint chcount, jint ntabpositions, jlong lpntabstoppositions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTabbedTextExtentA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)ntabpositions, (void*)(uintptr_t)lpntabstoppositions) : 0;
#else
    (void)hdc;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTabbedTextExtentW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint chcount, jint ntabpositions, jlong lpntabstoppositions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTabbedTextExtentW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)ntabpositions, (void*)(uintptr_t)lpntabstoppositions) : 0;
#else
    (void)hdc;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextAlign(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextAlign");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextCharacterExtra(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextCharacterExtra");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextColor(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextExtentExPointA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpszstring, jint cchstring, jint nmaxextent, jlong lpnfit, jlong lpndx, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpszstring, (int32_t)cchstring, (int32_t)nmaxextent, (void*)(uintptr_t)lpnfit, (void*)(uintptr_t)lpndx, (void*)(uintptr_t)lpsize) : -1;
#else
    (void)hdc;
    (void)lpszstring;
    (void)cchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextExtentExPointI(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpwszstring, jint cwchstring, jint nmaxextent, jlong lpnfit, jlong lpndx, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpwszstring, (int32_t)cwchstring, (int32_t)nmaxextent, (void*)(uintptr_t)lpnfit, (void*)(uintptr_t)lpndx, (void*)(uintptr_t)lpsize) : -1;
#else
    (void)hdc;
    (void)lpwszstring;
    (void)cwchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextExtentExPointW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpszstring, jint cchstring, jint nmaxextent, jlong lpnfit, jlong lpndx, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpszstring, (int32_t)cchstring, (int32_t)nmaxextent, (void*)(uintptr_t)lpnfit, (void*)(uintptr_t)lpndx, (void*)(uintptr_t)lpsize) : -1;
#else
    (void)hdc;
    (void)lpszstring;
    (void)cchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextExtentPoint32A(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint c, jlong psizl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPoint32A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)c, (void*)(uintptr_t)psizl) : -1;
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)psizl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextExtentPoint32W(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint c, jlong psizl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPoint32W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)c, (void*)(uintptr_t)psizl) : -1;
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)psizl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextExtentPointA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint c, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)c, (void*)(uintptr_t)lpsz) : -1;
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextExtentPointI(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pgiin, jint cgi, jlong psize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pgiin, (int32_t)cgi, (void*)(uintptr_t)psize) : -1;
#else
    (void)hdc;
    (void)pgiin;
    (void)cgi;
    (void)psize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextExtentPointW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint c, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)c, (void*)(uintptr_t)lpsz) : -1;
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextFaceA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint c, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextFaceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)c, (void*)(uintptr_t)lpname) : -1;
#else
    (void)hdc;
    (void)c;
    (void)lpname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextFaceW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint c, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextFaceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)c, (void*)(uintptr_t)lpname) : -1;
#else
    (void)hdc;
    (void)c;
    (void)lpname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextMetricsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lptm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextMetricsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lptm) : -1;
#else
    (void)hdc;
    (void)lptm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetTextMetricsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lptm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextMetricsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lptm) : -1;
#else
    (void)hdc;
    (void)lptm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetUpdateRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprect, jint berase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdateRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprect, (int32_t)berase) : -1;
#else
    (void)hwnd;
    (void)lprect;
    (void)berase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetUpdateRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn, jint berase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdateRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn, (int32_t)berase) : -1;
#else
    (void)hwnd;
    (void)hrgn;
    (void)berase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetViewportExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetViewportExtEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpsize) : -1;
#else
    (void)hdc;
    (void)lpsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetViewportOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetViewportOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppoint) : -1;
#else
    (void)hdc;
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetWinMetaFileBits(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cbdata16, jlong pdata16, jint imapmode, jlong hdcref) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWinMetaFileBits");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cbdata16, (void*)(uintptr_t)pdata16, (int32_t)imapmode, (void*)(uintptr_t)hdcref) : 0;
#else
    (void)hemf;
    (void)cbdata16;
    (void)pdata16;
    (void)imapmode;
    (void)hdcref;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetWindowDC(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowDC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : NULL;
#else
    (void)hwnd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetWindowExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowExtEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpsize) : -1;
#else
    (void)hdc;
    (void)lpsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetWindowOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppoint) : -1;
#else
    (void)hdc;
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetWindowRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn) : -1;
#else
    (void)hwnd;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetWindowRgnBox(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRgnBox");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprc) : -1;
#else
    (void)hwnd;
    (void)lprc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpxf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpxf) : -1;
#else
    (void)hdc;
    (void)lpxf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GradientFill(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pvertex, jint nvertex, jlong pmesh, jint nmesh, jint ulmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msimg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GradientFill");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pvertex, (uint32_t)nvertex, (void*)(uintptr_t)pmesh, (uint32_t)nmesh, (uint32_t)ulmode) : -1;
#else
    (void)hdc;
    (void)pvertex;
    (void)nvertex;
    (void)pmesh;
    (void)nmesh;
    (void)ulmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GrayStringA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbrush, jlong lpoutputfunc, jlong lpdata, jint ncount, jint x, jint y, jint nwidth, jint nheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GrayStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbrush, (void*)(uintptr_t)lpoutputfunc, (int64_t)lpdata, (int32_t)ncount, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight) : -1;
#else
    (void)hdc;
    (void)hbrush;
    (void)lpoutputfunc;
    (void)lpdata;
    (void)ncount;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1GrayStringW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbrush, jlong lpoutputfunc, jlong lpdata, jint ncount, jint x, jint y, jint nwidth, jint nheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GrayStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbrush, (void*)(uintptr_t)lpoutputfunc, (int64_t)lpdata, (int32_t)ncount, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight) : -1;
#else
    (void)hdc;
    (void)hbrush;
    (void)lpoutputfunc;
    (void)lpdata;
    (void)ncount;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1InflateRect(JNIEnv* km_env, jclass km_clazz, jlong lprc, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InflateRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprc, (int32_t)dx, (int32_t)dy) : -1;
#else
    (void)lprc;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1IntersectClipRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntersectClipRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom) : -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1IntersectRect(JNIEnv* km_env, jclass km_clazz, jlong lprcdst, jlong lprcsrc1, jlong lprcsrc2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntersectRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprcdst, (void*)(uintptr_t)lprcsrc1, (void*)(uintptr_t)lprcsrc2) : -1;
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1InvalidateRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprect, jint berase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvalidateRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprect, (int32_t)berase) : -1;
#else
    (void)hwnd;
    (void)lprect;
    (void)berase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1InvalidateRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn, jint berase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvalidateRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn, (int32_t)berase) : -1;
#else
    (void)hwnd;
    (void)hrgn;
    (void)berase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1InvertRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvertRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc) : -1;
#else
    (void)hdc;
    (void)lprc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1InvertRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvertRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn) : -1;
#else
    (void)hdc;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1IsRectEmpty(JNIEnv* km_env, jclass km_clazz, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsRectEmpty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprc) : -1;
#else
    (void)lprc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1LPtoDP(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPtoDP");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt, (int32_t)c) : -1;
#else
    (void)hdc;
    (void)lppt;
    (void)c;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1LineDDA(JNIEnv* km_env, jclass km_clazz, jint xstart, jint ystart, jint xend, jint yend, jlong lpproc, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LineDDA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)xstart, (int32_t)ystart, (int32_t)xend, (int32_t)yend, (void*)(uintptr_t)lpproc, (int64_t)data) : -1;
#else
    (void)xstart;
    (void)ystart;
    (void)xend;
    (void)yend;
    (void)lpproc;
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1LineTo(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LineTo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1LoadBitmapA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpbitmapname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadBitmapA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpbitmapname) : NULL;
#else
    (void)hinstance;
    (void)lpbitmapname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1LoadBitmapW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpbitmapname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadBitmapW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpbitmapname) : NULL;
#else
    (void)hinstance;
    (void)lpbitmapname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1LockWindowUpdate(JNIEnv* km_env, jclass km_clazz, jlong hwndlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockWindowUpdate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndlock) : -1;
#else
    (void)hwndlock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1MapWindowPoints(JNIEnv* km_env, jclass km_clazz, jlong hwndfrom, jlong hwndto, jlong lppoints, jint cpoints) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapWindowPoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndfrom, (void*)(uintptr_t)hwndto, (void*)(uintptr_t)lppoints, (uint32_t)cpoints) : -1;
#else
    (void)hwndfrom;
    (void)hwndto;
    (void)lppoints;
    (void)cpoints;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1MaskBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jint xdest, jint ydest, jint width, jint height, jlong hdcsrc, jint xsrc, jint ysrc, jlong hbmmask, jint xmask, jint ymask, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MaskBlt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdcdest, (int32_t)xdest, (int32_t)ydest, (int32_t)width, (int32_t)height, (void*)(uintptr_t)hdcsrc, (int32_t)xsrc, (int32_t)ysrc, (void*)(uintptr_t)hbmmask, (int32_t)xmask, (int32_t)ymask, (uint32_t)rop) : -1;
#else
    (void)hdcdest;
    (void)xdest;
    (void)ydest;
    (void)width;
    (void)height;
    (void)hdcsrc;
    (void)xsrc;
    (void)ysrc;
    (void)hbmmask;
    (void)xmask;
    (void)ymask;
    (void)rop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1MergeFontPackage(JNIEnv* km_env, jclass km_clazz, jlong puchmergefontbuffer, jint ulmergefontbuffersize, jlong puchfontpackagebuffer, jint ulfontpackagebuffersize, jlong ppuchdestbuffer, jlong puldestbuffersize, jlong pulbyteswritten, jshort usmode, jlong lpfnallocate, jlong lpfnreallocate, jlong lpfnfree, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fontsub.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MergeFontPackage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puchmergefontbuffer, (uint32_t)ulmergefontbuffersize, (void*)(uintptr_t)puchfontpackagebuffer, (uint32_t)ulfontpackagebuffersize, (void*)(uintptr_t)ppuchdestbuffer, (void*)(uintptr_t)puldestbuffersize, (void*)(uintptr_t)pulbyteswritten, (uint16_t)usmode, (void*)(uintptr_t)lpfnallocate, (void*)(uintptr_t)lpfnreallocate, (void*)(uintptr_t)lpfnfree, (void*)(uintptr_t)lpvreserved) : 0;
#else
    (void)puchmergefontbuffer;
    (void)ulmergefontbuffersize;
    (void)puchfontpackagebuffer;
    (void)ulfontpackagebuffersize;
    (void)ppuchdestbuffer;
    (void)puldestbuffersize;
    (void)pulbyteswritten;
    (void)usmode;
    (void)lpfnallocate;
    (void)lpfnreallocate;
    (void)lpfnfree;
    (void)lpvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ModifyWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpxf, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpxf, (uint32_t)mode) : -1;
#else
    (void)hdc;
    (void)lpxf;
    (void)mode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1MonitorFromRect(JNIEnv* km_env, jclass km_clazz, jlong lprc, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonitorFromRect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprc, (uint32_t)dwflags) : NULL;
#else
    (void)lprc;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1MonitorFromWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonitorFromWindow");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwflags) : NULL;
#else
    (void)hwnd;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1MoveToEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveToEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1OffsetClipRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetClipRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1OffsetRect(JNIEnv* km_env, jclass km_clazz, jlong lprc, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprc, (int32_t)dx, (int32_t)dy) : -1;
#else
    (void)lprc;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1OffsetRgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgn, (int32_t)x, (int32_t)y) : -1;
#else
    (void)hrgn;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1OffsetViewportOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetViewportOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1OffsetWindowOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetWindowOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PaintDesktop(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PaintDesktop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PaintRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PaintRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn) : -1;
#else
    (void)hdc;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PatBlt(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint w, jint h, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PatBlt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (int32_t)w, (int32_t)h, (uint32_t)rop) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)w;
    (void)h;
    (void)rop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PathToRegion(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathToRegion");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : NULL;
#else
    (void)hdc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1Pie(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom, jint xr1, jint yr1, jint xr2, jint yr2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Pie");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom, (int32_t)xr1, (int32_t)yr1, (int32_t)xr2, (int32_t)yr2) : -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    (void)xr1;
    (void)yr1;
    (void)xr2;
    (void)yr2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PlayEnhMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hmf, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayEnhMetaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hmf, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hdc;
    (void)hmf;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PlayEnhMetaFileRecord(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pht, jlong pmr, jint cht) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayEnhMetaFileRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pht, (void*)(uintptr_t)pmr, (uint32_t)cht) : -1;
#else
    (void)hdc;
    (void)pht;
    (void)pmr;
    (void)cht;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PlayMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hmf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayMetaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hmf) : -1;
#else
    (void)hdc;
    (void)hmf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PlayMetaFileRecord(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lphandletable, jlong lpmr, jint noobjs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayMetaFileRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lphandletable, (void*)(uintptr_t)lpmr, (uint32_t)noobjs) : -1;
#else
    (void)hdc;
    (void)lphandletable;
    (void)lpmr;
    (void)noobjs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PlgBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jlong lppoint, jlong hdcsrc, jint xsrc, jint ysrc, jint width, jint height, jlong hbmmask, jint xmask, jint ymask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlgBlt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdcdest, (void*)(uintptr_t)lppoint, (void*)(uintptr_t)hdcsrc, (int32_t)xsrc, (int32_t)ysrc, (int32_t)width, (int32_t)height, (void*)(uintptr_t)hbmmask, (int32_t)xmask, (int32_t)ymask) : -1;
#else
    (void)hdcdest;
    (void)lppoint;
    (void)hdcsrc;
    (void)xsrc;
    (void)ysrc;
    (void)width;
    (void)height;
    (void)hbmmask;
    (void)xmask;
    (void)ymask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PolyBezier(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyBezier");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (uint32_t)cpt) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PolyBezierTo(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyBezierTo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (uint32_t)cpt) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PolyDraw(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jlong aj, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyDraw");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (void*)(uintptr_t)aj, (int32_t)cpt) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)aj;
    (void)cpt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PolyPolygon(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jlong asz, jint csz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyPolygon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (void*)(uintptr_t)asz, (int32_t)csz) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)asz;
    (void)csz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PolyPolyline(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jlong asz, jint csz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyPolyline");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (void*)(uintptr_t)asz, (uint32_t)csz) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)asz;
    (void)csz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PolyTextOutA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ppt, jint nstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyTextOutA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ppt, (int32_t)nstrings) : -1;
#else
    (void)hdc;
    (void)ppt;
    (void)nstrings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PolyTextOutW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ppt, jint nstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyTextOutW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ppt, (int32_t)nstrings) : -1;
#else
    (void)hdc;
    (void)ppt;
    (void)nstrings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1Polygon(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Polygon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (int32_t)cpt) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1Polyline(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Polyline");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (int32_t)cpt) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PolylineTo(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolylineTo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (uint32_t)cpt) : -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PtInRegion(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PtInRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgn, (int32_t)x, (int32_t)y) : -1;
#else
    (void)hrgn;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1PtVisible(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PtVisible");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RealizePalette(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealizePalette");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : 0;
#else
    (void)hdc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RectInRegion(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RectInRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgn, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hrgn;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RectVisible(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RectVisible");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hdc;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1Rectangle(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Rectangle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom) : -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RedrawWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprcupdate, jlong hrgnupdate, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RedrawWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprcupdate, (void*)(uintptr_t)hrgnupdate, (uint32_t)flags) : -1;
#else
    (void)hwnd;
    (void)lprcupdate;
    (void)hrgnupdate;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ReleaseDC(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdc) : -1;
#else
    (void)hwnd;
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RemoveFontMemResourceEx(JNIEnv* km_env, jclass km_clazz, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontMemResourceEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)h) : -1;
#else
    (void)h;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RemoveFontResourceA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RemoveFontResourceExA(JNIEnv* km_env, jclass km_clazz, jlong name, jint fl, jlong pdv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (uint32_t)fl, (void*)(uintptr_t)pdv) : -1;
#else
    (void)name;
    (void)fl;
    (void)pdv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RemoveFontResourceExW(JNIEnv* km_env, jclass km_clazz, jlong name, jint fl, jlong pdv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (uint32_t)fl, (void*)(uintptr_t)pdv) : -1;
#else
    (void)name;
    (void)fl;
    (void)pdv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RemoveFontResourceW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ResetDCA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetDCA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpdm) : NULL;
#else
    (void)hdc;
    (void)lpdm;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ResetDCW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetDCW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpdm) : NULL;
#else
    (void)hdc;
    (void)lpdm;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ResizePalette(JNIEnv* km_env, jclass km_clazz, jlong hpal, jint n) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResizePalette");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpal, (uint32_t)n) : -1;
#else
    (void)hpal;
    (void)n;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RestoreDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint nsaveddc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)nsaveddc) : -1;
#else
    (void)hdc;
    (void)nsaveddc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1RoundRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RoundRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom, (int32_t)width, (int32_t)height) : -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SaveDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaveDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ScaleViewportExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xn, jint dx, jint yn, jint yd, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScaleViewportExtEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xn, (int32_t)dx, (int32_t)yn, (int32_t)yd, (void*)(uintptr_t)lpsz) : -1;
#else
    (void)hdc;
    (void)xn;
    (void)dx;
    (void)yn;
    (void)yd;
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ScaleWindowExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xn, jint xd, jint yn, jint yd, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScaleWindowExtEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xn, (int32_t)xd, (int32_t)yn, (int32_t)yd, (void*)(uintptr_t)lpsz) : -1;
#else
    (void)hdc;
    (void)xn;
    (void)xd;
    (void)yn;
    (void)yd;
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ScreenToClient(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScreenToClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppoint) : -1;
#else
    (void)hwnd;
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SelectClipPath(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectClipPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode) : -1;
#else
    (void)hdc;
    (void)mode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SelectClipRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectClipRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn) : -1;
#else
    (void)hdc;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SelectObject(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectObject");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)h) : NULL;
#else
    (void)hdc;
    (void)h;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SelectPalette(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hpal, jint bforcebkgd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectPalette");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hpal, (int32_t)bforcebkgd) : NULL;
#else
    (void)hdc;
    (void)hpal;
    (void)bforcebkgd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetArcDirection(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint dir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetArcDirection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)dir) : -1;
#else
    (void)hdc;
    (void)dir;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetBitmapBits(JNIEnv* km_env, jclass km_clazz, jlong hbm, jint cb, jlong pvbits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBitmapBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbm, (uint32_t)cb, (void*)(uintptr_t)pvbits) : -1;
#else
    (void)hbm;
    (void)cb;
    (void)pvbits;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetBitmapDimensionEx(JNIEnv* km_env, jclass km_clazz, jlong hbm, jint w, jint h, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBitmapDimensionEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbm, (int32_t)w, (int32_t)h, (void*)(uintptr_t)lpsz) : -1;
#else
    (void)hbm;
    (void)w;
    (void)h;
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetBkColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBkColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color) : 0;
#else
    (void)hdc;
    (void)color;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetBkMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBkMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode) : -1;
#else
    (void)hdc;
    (void)mode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetBoundsRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprect, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBoundsRect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect, (uint32_t)flags) : 0;
#else
    (void)hdc;
    (void)lprect;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetBrushOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBrushOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetColorAdjustment(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpca) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorAdjustment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpca) : -1;
#else
    (void)hdc;
    (void)lpca;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetDCBrushColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDCBrushColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color) : 0;
#else
    (void)hdc;
    (void)color;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetDCPenColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDCPenColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color) : 0;
#else
    (void)hdc;
    (void)color;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetDIBColorTable(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint istart, jint centries, jlong prgbq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBColorTable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)prgbq) : 0;
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)prgbq;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetDIBits(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbm, jint start, jint clines, jlong lpbits, jlong lpbmi, jint coloruse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbm, (uint32_t)start, (uint32_t)clines, (void*)(uintptr_t)lpbits, (void*)(uintptr_t)lpbmi, (uint32_t)coloruse) : -1;
#else
    (void)hdc;
    (void)hbm;
    (void)start;
    (void)clines;
    (void)lpbits;
    (void)lpbmi;
    (void)coloruse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetDIBitsToDevice(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xdest, jint ydest, jint w, jint h, jint xsrc, jint ysrc, jint startscan, jint clines, jlong lpvbits, jlong lpbmi, jint coloruse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t, int32_t, int32_t, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBitsToDevice");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xdest, (int32_t)ydest, (uint32_t)w, (uint32_t)h, (int32_t)xsrc, (int32_t)ysrc, (uint32_t)startscan, (uint32_t)clines, (void*)(uintptr_t)lpvbits, (void*)(uintptr_t)lpbmi, (uint32_t)coloruse) : -1;
#else
    (void)hdc;
    (void)xdest;
    (void)ydest;
    (void)w;
    (void)h;
    (void)xsrc;
    (void)ysrc;
    (void)startscan;
    (void)clines;
    (void)lpvbits;
    (void)lpbmi;
    (void)coloruse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetEnhMetaFileBits(JNIEnv* km_env, jclass km_clazz, jint nsize, jlong pb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnhMetaFileBits");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nsize, (void*)(uintptr_t)pb) : NULL;
#else
    (void)nsize;
    (void)pb;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetGraphicsMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGraphicsMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)imode) : -1;
#else
    (void)hdc;
    (void)imode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetLayout(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint l) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLayout");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)l) : 0;
#else
    (void)hdc;
    (void)l;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetMapMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMapMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)imode) : -1;
#else
    (void)hdc;
    (void)imode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetMapperFlags(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMapperFlags");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)flags) : 0;
#else
    (void)hdc;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetMetaFileBitsEx(JNIEnv* km_env, jclass km_clazz, jint cbbuffer, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMetaFileBitsEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cbbuffer, (void*)(uintptr_t)lpdata) : NULL;
#else
    (void)cbbuffer;
    (void)lpdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetMetaRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMetaRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong hdc, jfloat limit, jlong old) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMiterLimit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (float)limit, (void*)(uintptr_t)old) : -1;
#else
    (void)hdc;
    (void)limit;
    (void)old;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetPaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong hpal, jint istart, jint centries, jlong ppalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPaletteEntries");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpal, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)ppalentries) : 0;
#else
    (void)hpal;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetPixel(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPixel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)color) : 0;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetPixelV(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPixelV");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)color) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetPolyFillMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPolyFillMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode) : -1;
#else
    (void)hdc;
    (void)mode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetROP2(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint rop2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetROP2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)rop2) : -1;
#else
    (void)hdc;
    (void)rop2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetRect(JNIEnv* km_env, jclass km_clazz, jlong lprc, jint xleft, jint ytop, jint xright, jint ybottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprc, (int32_t)xleft, (int32_t)ytop, (int32_t)xright, (int32_t)ybottom) : -1;
#else
    (void)lprc;
    (void)xleft;
    (void)ytop;
    (void)xright;
    (void)ybottom;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetRectEmpty(JNIEnv* km_env, jclass km_clazz, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRectEmpty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprc) : -1;
#else
    (void)lprc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetRectRgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRectRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrgn, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom) : -1;
#else
    (void)hrgn;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetStretchBltMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStretchBltMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode) : -1;
#else
    (void)hdc;
    (void)mode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetSysColors(JNIEnv* km_env, jclass km_clazz, jint celements, jlong lpaelements, jlong lpargbvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSysColors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)celements, (void*)(uintptr_t)lpaelements, (void*)(uintptr_t)lpargbvalues) : -1;
#else
    (void)celements;
    (void)lpaelements;
    (void)lpargbvalues;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetSystemPaletteUse(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint use) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemPaletteUse");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)use) : 0;
#else
    (void)hdc;
    (void)use;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetTextAlign(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextAlign");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)align) : 0;
#else
    (void)hdc;
    (void)align;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetTextCharacterExtra(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint extra) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextCharacterExtra");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)extra) : -1;
#else
    (void)hdc;
    (void)extra;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetTextColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color) : 0;
#else
    (void)hdc;
    (void)color;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetTextJustification(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint extra, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextJustification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)extra, (int32_t)count) : -1;
#else
    (void)hdc;
    (void)extra;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetViewportExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetViewportExtEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpsz) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetViewportOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetViewportOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetWindowExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowExtEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpsz) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetWindowOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowOrgEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetWindowRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn, jint bredraw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn, (int32_t)bredraw) : -1;
#else
    (void)hwnd;
    (void)hrgn;
    (void)bredraw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpxf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWorldTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpxf) : -1;
#else
    (void)hdc;
    (void)lpxf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1StretchBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jint xdest, jint ydest, jint wdest, jint hdest, jlong hdcsrc, jint xsrc, jint ysrc, jint wsrc, jint hsrc, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StretchBlt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdcdest, (int32_t)xdest, (int32_t)ydest, (int32_t)wdest, (int32_t)hdest, (void*)(uintptr_t)hdcsrc, (int32_t)xsrc, (int32_t)ysrc, (int32_t)wsrc, (int32_t)hsrc, (uint32_t)rop) : -1;
#else
    (void)hdcdest;
    (void)xdest;
    (void)ydest;
    (void)wdest;
    (void)hdest;
    (void)hdcsrc;
    (void)xsrc;
    (void)ysrc;
    (void)wsrc;
    (void)hsrc;
    (void)rop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1StretchDIBits(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xdest, jint ydest, jint destwidth, jint destheight, jint xsrc, jint ysrc, jint srcwidth, jint srcheight, jlong lpbits, jlong lpbmi, jint iusage, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StretchDIBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xdest, (int32_t)ydest, (int32_t)destwidth, (int32_t)destheight, (int32_t)xsrc, (int32_t)ysrc, (int32_t)srcwidth, (int32_t)srcheight, (void*)(uintptr_t)lpbits, (void*)(uintptr_t)lpbmi, (uint32_t)iusage, (uint32_t)rop) : -1;
#else
    (void)hdc;
    (void)xdest;
    (void)ydest;
    (void)destwidth;
    (void)destheight;
    (void)xsrc;
    (void)ysrc;
    (void)srcwidth;
    (void)srcheight;
    (void)lpbits;
    (void)lpbmi;
    (void)iusage;
    (void)rop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1StrokeAndFillPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrokeAndFillPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1StrokePath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrokePath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1SubtractRect(JNIEnv* km_env, jclass km_clazz, jlong lprcdst, jlong lprcsrc1, jlong lprcsrc2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubtractRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprcdst, (void*)(uintptr_t)lprcsrc1, (void*)(uintptr_t)lprcsrc2) : -1;
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTCharToUnicode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong puccharcodes, jint ulcharcodesize, jlong pusshortcodes, jint ulshortcodesize, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTCharToUnicode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)puccharcodes, (uint32_t)ulcharcodesize, (void*)(uintptr_t)pusshortcodes, (uint32_t)ulshortcodesize, (uint32_t)ulflags) : -1;
#else
    (void)hdc;
    (void)puccharcodes;
    (void)ulcharcodesize;
    (void)pusshortcodes;
    (void)ulshortcodesize;
    (void)ulflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTDeleteEmbeddedFont(JNIEnv* km_env, jclass km_clazz, jlong hfontreference, jint ulflags, jlong pulstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTDeleteEmbeddedFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfontreference, (uint32_t)ulflags, (void*)(uintptr_t)pulstatus) : -1;
#else
    (void)hfontreference;
    (void)ulflags;
    (void)pulstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTEmbedFont(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ulflags, jint ulcharset, jlong pulprivstatus, jlong pulstatus, jlong lpfnwritetostream, jlong lpvwritestream, jlong puscharcodeset, jshort uscharcodecount, jshort uslanguage, jlong pttembedinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ulflags, (uint32_t)ulcharset, (void*)(uintptr_t)pulprivstatus, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnwritetostream, (void*)(uintptr_t)lpvwritestream, (void*)(uintptr_t)puscharcodeset, (uint16_t)uscharcodecount, (uint16_t)uslanguage, (void*)(uintptr_t)pttembedinfo) : -1;
#else
    (void)hdc;
    (void)ulflags;
    (void)ulcharset;
    (void)pulprivstatus;
    (void)pulstatus;
    (void)lpfnwritetostream;
    (void)lpvwritestream;
    (void)puscharcodeset;
    (void)uscharcodecount;
    (void)uslanguage;
    (void)pttembedinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTEmbedFontEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ulflags, jint ulcharset, jlong pulprivstatus, jlong pulstatus, jlong lpfnwritetostream, jlong lpvwritestream, jlong pulcharcodeset, jshort uscharcodecount, jshort uslanguage, jlong pttembedinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFontEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ulflags, (uint32_t)ulcharset, (void*)(uintptr_t)pulprivstatus, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnwritetostream, (void*)(uintptr_t)lpvwritestream, (void*)(uintptr_t)pulcharcodeset, (uint16_t)uscharcodecount, (uint16_t)uslanguage, (void*)(uintptr_t)pttembedinfo) : -1;
#else
    (void)hdc;
    (void)ulflags;
    (void)ulcharset;
    (void)pulprivstatus;
    (void)pulstatus;
    (void)lpfnwritetostream;
    (void)lpvwritestream;
    (void)pulcharcodeset;
    (void)uscharcodecount;
    (void)uslanguage;
    (void)pttembedinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTEmbedFontFromFileA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong szfontfilename, jshort usttcindex, jint ulflags, jint ulcharset, jlong pulprivstatus, jlong pulstatus, jlong lpfnwritetostream, jlong lpvwritestream, jlong puscharcodeset, jshort uscharcodecount, jshort uslanguage, jlong pttembedinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFontFromFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)szfontfilename, (uint16_t)usttcindex, (uint32_t)ulflags, (uint32_t)ulcharset, (void*)(uintptr_t)pulprivstatus, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnwritetostream, (void*)(uintptr_t)lpvwritestream, (void*)(uintptr_t)puscharcodeset, (uint16_t)uscharcodecount, (uint16_t)uslanguage, (void*)(uintptr_t)pttembedinfo) : -1;
#else
    (void)hdc;
    (void)szfontfilename;
    (void)usttcindex;
    (void)ulflags;
    (void)ulcharset;
    (void)pulprivstatus;
    (void)pulstatus;
    (void)lpfnwritetostream;
    (void)lpvwritestream;
    (void)puscharcodeset;
    (void)uscharcodecount;
    (void)uslanguage;
    (void)pttembedinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTEnableEmbeddingForFacename(JNIEnv* km_env, jclass km_clazz, jlong lpszfacename, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEnableEmbeddingForFacename");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfacename, (int32_t)benable) : -1;
#else
    (void)lpszfacename;
    (void)benable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTGetEmbeddedFontInfo(JNIEnv* km_env, jclass km_clazz, jint ulflags, jlong pulprivstatus, jint ulprivs, jlong pulstatus, jlong lpfnreadfromstream, jlong lpvreadstream, jlong pttloadinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetEmbeddedFontInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ulflags, (void*)(uintptr_t)pulprivstatus, (uint32_t)ulprivs, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnreadfromstream, (void*)(uintptr_t)lpvreadstream, (void*)(uintptr_t)pttloadinfo) : -1;
#else
    (void)ulflags;
    (void)pulprivstatus;
    (void)ulprivs;
    (void)pulstatus;
    (void)lpfnreadfromstream;
    (void)lpvreadstream;
    (void)pttloadinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTGetEmbeddingType(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pulembedtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetEmbeddingType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pulembedtype) : -1;
#else
    (void)hdc;
    (void)pulembedtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTGetNewFontName(JNIEnv* km_env, jclass km_clazz, jlong phfontreference, jlong wzwinfamilyname, jint cchmaxwinname, jlong szmacfamilyname, jint cchmaxmacname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetNewFontName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phfontreference, (void*)(uintptr_t)wzwinfamilyname, (int32_t)cchmaxwinname, (void*)(uintptr_t)szmacfamilyname, (int32_t)cchmaxmacname) : -1;
#else
    (void)phfontreference;
    (void)wzwinfamilyname;
    (void)cchmaxwinname;
    (void)szmacfamilyname;
    (void)cchmaxmacname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTIsEmbeddingEnabled(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pbenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTIsEmbeddingEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pbenabled) : -1;
#else
    (void)hdc;
    (void)pbenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTIsEmbeddingEnabledForFacename(JNIEnv* km_env, jclass km_clazz, jlong lpszfacename, jlong pbenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTIsEmbeddingEnabledForFacename");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfacename, (void*)(uintptr_t)pbenabled) : -1;
#else
    (void)lpszfacename;
    (void)pbenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTLoadEmbeddedFont(JNIEnv* km_env, jclass km_clazz, jlong phfontreference, jint ulflags, jlong pulprivstatus, jint ulprivs, jlong pulstatus, jlong lpfnreadfromstream, jlong lpvreadstream, jlong szwinfamilyname, jlong szmacfamilyname, jlong pttloadinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTLoadEmbeddedFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phfontreference, (uint32_t)ulflags, (void*)(uintptr_t)pulprivstatus, (uint32_t)ulprivs, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnreadfromstream, (void*)(uintptr_t)lpvreadstream, (void*)(uintptr_t)szwinfamilyname, (void*)(uintptr_t)szmacfamilyname, (void*)(uintptr_t)pttloadinfo) : -1;
#else
    (void)phfontreference;
    (void)ulflags;
    (void)pulprivstatus;
    (void)ulprivs;
    (void)pulstatus;
    (void)lpfnreadfromstream;
    (void)lpvreadstream;
    (void)szwinfamilyname;
    (void)szmacfamilyname;
    (void)pttloadinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTRunValidationTests(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ptestparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTRunValidationTests");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ptestparam) : -1;
#else
    (void)hdc;
    (void)ptestparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TTRunValidationTestsEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ptestparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTRunValidationTestsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ptestparam) : -1;
#else
    (void)hdc;
    (void)ptestparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TabbedTextOutA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpstring, jint chcount, jint ntabpositions, jlong lpntabstoppositions, jint ntaborigin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TabbedTextOutA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)ntabpositions, (void*)(uintptr_t)lpntabstoppositions, (int32_t)ntaborigin) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    (void)ntaborigin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TabbedTextOutW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpstring, jint chcount, jint ntabpositions, jlong lpntabstoppositions, jint ntaborigin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TabbedTextOutW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)ntabpositions, (void*)(uintptr_t)lpntabstoppositions, (int32_t)ntaborigin) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    (void)ntaborigin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TextOutA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpstring, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextOutA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpstring, (int32_t)c) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)c;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TextOutW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpstring, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextOutW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpstring, (int32_t)c) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)c;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1TransparentBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jint xorigindest, jint yorigindest, jint wdest, jint hdest, jlong hdcsrc, jint xoriginsrc, jint yoriginsrc, jint wsrc, jint hsrc, jint crtransparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msimg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransparentBlt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdcdest, (int32_t)xorigindest, (int32_t)yorigindest, (int32_t)wdest, (int32_t)hdest, (void*)(uintptr_t)hdcsrc, (int32_t)xoriginsrc, (int32_t)yoriginsrc, (int32_t)wsrc, (int32_t)hsrc, (uint32_t)crtransparent) : -1;
#else
    (void)hdcdest;
    (void)xorigindest;
    (void)yorigindest;
    (void)wdest;
    (void)hdest;
    (void)hdcsrc;
    (void)xoriginsrc;
    (void)yoriginsrc;
    (void)wsrc;
    (void)hsrc;
    (void)crtransparent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1UnionRect(JNIEnv* km_env, jclass km_clazz, jlong lprcdst, jlong lprcsrc1, jlong lprcsrc2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnionRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprcdst, (void*)(uintptr_t)lprcsrc1, (void*)(uintptr_t)lprcsrc2) : -1;
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1UnrealizeObject(JNIEnv* km_env, jclass km_clazz, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnrealizeObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)h) : -1;
#else
    (void)h;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1UpdateColors(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateColors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1UpdateWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ValidateRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hwnd;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1ValidateRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateRgn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn) : -1;
#else
    (void)hwnd;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1WidenPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WidenPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : -1;
#else
    (void)hdc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1WindowFromDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowFromDC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : NULL;
#else
    (void)hdc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssys_1windows_1win32_1graphics_1gdi_1wglSwapMultipleBuffers(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglSwapMultipleBuffers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

