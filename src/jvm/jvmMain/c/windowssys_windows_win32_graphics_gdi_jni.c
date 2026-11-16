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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiAbortPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AbortPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiAddFontMemResourceEx(JNIEnv* km_env, jclass km_clazz, jlong pfileview, jint cjsize, jlong pvresrved, jlong pnumfonts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontMemResourceEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfileview, (uint32_t)cjsize, (void*)(uintptr_t)pvresrved, (void*)(uintptr_t)pnumfonts);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pfileview;
    (void)cjsize;
    (void)pvresrved;
    (void)pnumfonts;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiAddFontResourceA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiAddFontResourceExA(JNIEnv* km_env, jclass km_clazz, jlong name, jint fl, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)fl, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)fl;
    (void)res;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiAddFontResourceExW(JNIEnv* km_env, jclass km_clazz, jlong name, jint fl, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)fl, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)fl;
    (void)res;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiAddFontResourceW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiAngleArc(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint r, jfloat startangle, jfloat sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AngleArc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)r, (float)startangle, (float)sweepangle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)r;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiAnimatePalette(JNIEnv* km_env, jclass km_clazz, jlong hpal, jint istartindex, jint centries, jlong ppe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AnimatePalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpal, (uint32_t)istartindex, (uint32_t)centries, (void*)(uintptr_t)ppe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpal;
    (void)istartindex;
    (void)centries;
    (void)ppe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiArc(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Arc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)x3, (int32_t)y3, (int32_t)x4, (int32_t)y4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiArcTo(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom, jint xr1, jint yr1, jint xr2, jint yr2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ArcTo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom, (int32_t)xr1, (int32_t)yr1, (int32_t)xr2, (int32_t)yr2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiBeginPaint(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppaint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginPaint");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppaint);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)lppaint;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiBeginPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiBitBlt(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint cx, jint cy, jlong hdcsrc, jint x1, jint y1, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BitBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (void*)(uintptr_t)hdcsrc, (int32_t)x1, (int32_t)y1, (uint32_t)rop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCancelDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsA(JNIEnv* km_env, jclass km_clazz, jlong lpdevmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdevmode, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdevmode;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExA(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jlong lpdevmode, jlong hwnd, jint dwflags, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdevicename, (void*)(uintptr_t)lpdevmode, (void*)(uintptr_t)hwnd, (uint32_t)dwflags, (void*)(uintptr_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdevicename;
    (void)lpdevmode;
    (void)hwnd;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExW(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jlong lpdevmode, jlong hwnd, jint dwflags, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdevicename, (void*)(uintptr_t)lpdevmode, (void*)(uintptr_t)hwnd, (uint32_t)dwflags, (void*)(uintptr_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdevicename;
    (void)lpdevmode;
    (void)hwnd;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsW(JNIEnv* km_env, jclass km_clazz, jlong lpdevmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdevmode, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdevmode;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiChord(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x1, jint y1, jint x2, jint y2, jint x3, jint y3, jint x4, jint y4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Chord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)x3, (int32_t)y3, (int32_t)x4, (int32_t)y4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiClientToScreen(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClientToScreen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)lppoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCloseEnhMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseEnhMetaFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCloseFigure(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseFigure");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCloseMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseMetaFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCombineRgn(JNIEnv* km_env, jclass km_clazz, jlong hrgndst, jlong hrgnsrc1, jlong hrgnsrc2, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CombineRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgndst, (void*)(uintptr_t)hrgnsrc1, (void*)(uintptr_t)hrgnsrc2, (int32_t)imode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrgndst;
    (void)hrgnsrc1;
    (void)hrgnsrc2;
    (void)imode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCombineTransform(JNIEnv* km_env, jclass km_clazz, jlong lpxfout, jlong lpxf1, jlong lpxf2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CombineTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpxfout, (void*)(uintptr_t)lpxf1, (void*)(uintptr_t)lpxf2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpxfout;
    (void)lpxf1;
    (void)lpxf2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong henh, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyEnhMetaFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henh, (void*)(uintptr_t)lpfilename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)henh;
    (void)lpfilename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong henh, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyEnhMetaFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henh, (void*)(uintptr_t)lpfilename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)henh;
    (void)lpfilename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCopyMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyMetaFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCopyMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyMetaFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCopyRect(JNIEnv* km_env, jclass km_clazz, jlong lprcdst, jlong lprcsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprcdst, (void*)(uintptr_t)lprcsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprcdst;
    (void)lprcsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateBitmap(JNIEnv* km_env, jclass km_clazz, jint nwidth, jint nheight, jint nplanes, jint nbitcount, jlong lpbits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBitmap");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nwidth, (int32_t)nheight, (uint32_t)nplanes, (uint32_t)nbitcount, (void*)(uintptr_t)lpbits);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)nwidth;
    (void)nheight;
    (void)nplanes;
    (void)nbitcount;
    (void)lpbits;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateBitmapIndirect(JNIEnv* km_env, jclass km_clazz, jlong pbm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBitmapIndirect");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbm);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pbm;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateBrushIndirect(JNIEnv* km_env, jclass km_clazz, jlong plbrush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBrushIndirect");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plbrush);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)plbrush;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateCompatibleBitmap(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint cx, jint cy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCompatibleBitmap");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)cx, (int32_t)cy);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)cx;
    (void)cy;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateCompatibleDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCompatibleDC");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateDCA(JNIEnv* km_env, jclass km_clazz, jlong pwszdriver, jlong pwszdevice, jlong pszport, jlong pdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDCA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszdriver, (void*)(uintptr_t)pwszdevice, (void*)(uintptr_t)pszport, (void*)(uintptr_t)pdm);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pwszdriver;
    (void)pwszdevice;
    (void)pszport;
    (void)pdm;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateDCW(JNIEnv* km_env, jclass km_clazz, jlong pwszdriver, jlong pwszdevice, jlong pszport, jlong pdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDCW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszdriver, (void*)(uintptr_t)pwszdevice, (void*)(uintptr_t)pszport, (void*)(uintptr_t)pdm);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pwszdriver;
    (void)pwszdevice;
    (void)pszport;
    (void)pdm;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrush(JNIEnv* km_env, jclass km_clazz, jlong h, jint iusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBPatternBrush");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)h, (uint32_t)iusage);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)h;
    (void)iusage;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrushPt(JNIEnv* km_env, jclass km_clazz, jlong lppackeddib, jint iusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBPatternBrushPt");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lppackeddib, (uint32_t)iusage);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lppackeddib;
    (void)iusage;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateDIBSection(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pbmi, jint usage, jlong ppvbits, jlong hsection, jint offset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBSection");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pbmi, (uint32_t)usage, (void*)(uintptr_t)ppvbits, (void*)(uintptr_t)hsection, (uint32_t)offset);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)pbmi;
    (void)usage;
    (void)ppvbits;
    (void)hsection;
    (void)offset;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateDIBitmap(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pbmih, jint flinit, jlong pjbits, jlong pbmi, jint iusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBitmap");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pbmih, (uint32_t)flinit, (void*)(uintptr_t)pjbits, (void*)(uintptr_t)pbmi, (uint32_t)iusage);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)pbmih;
    (void)flinit;
    (void)pjbits;
    (void)pbmi;
    (void)iusage;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateDiscardableBitmap(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint cx, jint cy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDiscardableBitmap");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)cx, (int32_t)cy);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)cx;
    (void)cy;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateEllipticRgn(JNIEnv* km_env, jclass km_clazz, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEllipticRgn");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateEllipticRgnIndirect(JNIEnv* km_env, jclass km_clazz, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEllipticRgnIndirect");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprect);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lprect;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpfilename, jlong lprc, jlong lpdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnhMetaFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lprc, (void*)(uintptr_t)lpdesc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)lpfilename;
    (void)lprc;
    (void)lpdesc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpfilename, jlong lprc, jlong lpdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnhMetaFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lprc, (void*)(uintptr_t)lpdesc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)lpfilename;
    (void)lprc;
    (void)lpdesc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateFontA(JNIEnv* km_env, jclass km_clazz, jint cheight, jint cwidth, jint cescapement, jint corientation, jint cweight, jint bitalic, jint bunderline, jint bstrikeout, jint icharset, jint ioutprecision, jint iclipprecision, jint iquality, jint ipitchandfamily, jlong pszfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cheight, (int32_t)cwidth, (int32_t)cescapement, (int32_t)corientation, (int32_t)cweight, (uint32_t)bitalic, (uint32_t)bunderline, (uint32_t)bstrikeout, (uint32_t)icharset, (uint32_t)ioutprecision, (uint32_t)iclipprecision, (uint32_t)iquality, (uint32_t)ipitchandfamily, (void*)(uintptr_t)pszfacename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
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
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateFontIndirectA(JNIEnv* km_env, jclass km_clazz, jlong lplf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplf);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lplf;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateFontIndirectExA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateFontIndirectExW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateFontIndirectW(JNIEnv* km_env, jclass km_clazz, jlong lplf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplf);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lplf;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateFontPackage(JNIEnv* km_env, jclass km_clazz, jlong puchsrcbuffer, jint ulsrcbuffersize, jlong ppuchfontpackagebuffer, jlong pulfontpackagebuffersize, jlong pulbyteswritten, jshort usflag, jshort usttcindex, jshort ussubsetformat, jshort ussubsetlanguage, jshort ussubsetplatform, jshort ussubsetencoding, jlong pussubsetkeeplist, jshort ussubsetlistcount, jlong lpfnallocate, jlong lpfnreallocate, jlong lpfnfree, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint16_t, uint16_t, uint16_t, uint16_t, int16_t, int16_t, void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fontsub.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontPackage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puchsrcbuffer, (uint32_t)ulsrcbuffersize, (void*)(uintptr_t)ppuchfontpackagebuffer, (void*)(uintptr_t)pulfontpackagebuffersize, (void*)(uintptr_t)pulbyteswritten, (uint16_t)usflag, (uint16_t)usttcindex, (uint16_t)ussubsetformat, (uint16_t)ussubsetlanguage, (int16_t)ussubsetplatform, (int16_t)ussubsetencoding, (void*)(uintptr_t)pussubsetkeeplist, (uint16_t)ussubsetlistcount, (void*)(uintptr_t)lpfnallocate, (void*)(uintptr_t)lpfnreallocate, (void*)(uintptr_t)lpfnfree, (void*)(uintptr_t)lpvreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateFontW(JNIEnv* km_env, jclass km_clazz, jint cheight, jint cwidth, jint cescapement, jint corientation, jint cweight, jint bitalic, jint bunderline, jint bstrikeout, jint icharset, jint ioutprecision, jint iclipprecision, jint iquality, jint ipitchandfamily, jlong pszfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cheight, (int32_t)cwidth, (int32_t)cescapement, (int32_t)corientation, (int32_t)cweight, (uint32_t)bitalic, (uint32_t)bunderline, (uint32_t)bstrikeout, (uint32_t)icharset, (uint32_t)ioutprecision, (uint32_t)iclipprecision, (uint32_t)iquality, (uint32_t)ipitchandfamily, (void*)(uintptr_t)pszfacename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
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
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateHalftonePalette(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHalftonePalette");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateHatchBrush(JNIEnv* km_env, jclass km_clazz, jint ihatch, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHatchBrush");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)ihatch, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ihatch;
    (void)color;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateICA(JNIEnv* km_env, jclass km_clazz, jlong pszdriver, jlong pszdevice, jlong pszport, jlong pdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateICA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdriver, (void*)(uintptr_t)pszdevice, (void*)(uintptr_t)pszport, (void*)(uintptr_t)pdm);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszdriver;
    (void)pszdevice;
    (void)pszport;
    (void)pdm;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateICW(JNIEnv* km_env, jclass km_clazz, jlong pszdriver, jlong pszdevice, jlong pszport, jlong pdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateICW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdriver, (void*)(uintptr_t)pszdevice, (void*)(uintptr_t)pszport, (void*)(uintptr_t)pdm);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszdriver;
    (void)pszdevice;
    (void)pszport;
    (void)pdm;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong pszfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMetaFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszfile);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszfile;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong pszfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMetaFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszfile);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszfile;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreatePalette(JNIEnv* km_env, jclass km_clazz, jlong plpal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePalette");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plpal);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)plpal;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreatePatternBrush(JNIEnv* km_env, jclass km_clazz, jlong hbm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatternBrush");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbm);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hbm;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreatePen(JNIEnv* km_env, jclass km_clazz, jint istyle, jint cwidth, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePen");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)istyle, (int32_t)cwidth, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)istyle;
    (void)cwidth;
    (void)color;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreatePenIndirect(JNIEnv* km_env, jclass km_clazz, jlong plpen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePenIndirect");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plpen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)plpen;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreatePolyPolygonRgn(JNIEnv* km_env, jclass km_clazz, jlong pptl, jlong pc, jint cpoly, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePolyPolygonRgn");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pptl, (void*)(uintptr_t)pc, (int32_t)cpoly, (int32_t)imode);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pptl;
    (void)pc;
    (void)cpoly;
    (void)imode;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreatePolygonRgn(JNIEnv* km_env, jclass km_clazz, jlong pptl, jint cpoint, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePolygonRgn");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pptl, (int32_t)cpoint, (int32_t)imode);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pptl;
    (void)cpoint;
    (void)imode;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateRectRgn(JNIEnv* km_env, jclass km_clazz, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRectRgn");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateRectRgnIndirect(JNIEnv* km_env, jclass km_clazz, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRectRgnIndirect");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprect);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lprect;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateRoundRectRgn(JNIEnv* km_env, jclass km_clazz, jint x1, jint y1, jint x2, jint y2, jint w, jint h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRoundRectRgn");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (int32_t)w, (int32_t)h);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)w;
    (void)h;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceA(JNIEnv* km_env, jclass km_clazz, jint fdwhidden, jlong lpszfont, jlong lpszfile, jlong lpszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateScalableFontResourceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)fdwhidden, (void*)(uintptr_t)lpszfont, (void*)(uintptr_t)lpszfile, (void*)(uintptr_t)lpszpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fdwhidden;
    (void)lpszfont;
    (void)lpszfile;
    (void)lpszpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceW(JNIEnv* km_env, jclass km_clazz, jint fdwhidden, jlong lpszfont, jlong lpszfile, jlong lpszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateScalableFontResourceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)fdwhidden, (void*)(uintptr_t)lpszfont, (void*)(uintptr_t)lpszfile, (void*)(uintptr_t)lpszpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fdwhidden;
    (void)lpszfont;
    (void)lpszfile;
    (void)lpszpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiCreateSolidBrush(JNIEnv* km_env, jclass km_clazz, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSolidBrush");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)color;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDPtoLP(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPtoLP");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt, (int32_t)c);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lppt;
    (void)c;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDeleteDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDeleteEnhMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hmf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteEnhMetaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDeleteMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hmf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMetaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDeleteObject(JNIEnv* km_env, jclass km_clazz, jlong ho) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ho);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ho;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawAnimatedRects(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint idani, jlong lprcfrom, jlong lprcto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawAnimatedRects");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)idani, (void*)(uintptr_t)lprcfrom, (void*)(uintptr_t)lprcto);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)idani;
    (void)lprcfrom;
    (void)lprcto;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawCaption(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdc, jlong lprect, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawCaption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hdc;
    (void)lprect;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawEdge(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong qrc, jint edge, jint grfflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawEdge");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)qrc, (uint32_t)edge, (uint32_t)grfflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)qrc;
    (void)edge;
    (void)grfflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawEscape(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint iescape, jint cjin, jlong lpin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawEscape");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)iescape, (int32_t)cjin, (void*)(uintptr_t)lpin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)iescape;
    (void)cjin;
    (void)lpin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawFocusRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawFocusRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lprc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawFrameControl(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawFrameControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (uint32_t)param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawStateA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbrfore, jlong qfncallback, jlong ldata, jlong wdata, jint x, jint y, jint cx, jint cy, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint64_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStateA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbrfore, (void*)(uintptr_t)qfncallback, (int64_t)ldata, (uint64_t)wdata, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (uint32_t)uflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawStateW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbrfore, jlong qfncallback, jlong ldata, jlong wdata, jint x, jint y, jint cx, jint cy, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint64_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStateW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbrfore, (void*)(uintptr_t)qfncallback, (int64_t)ldata, (uint64_t)wdata, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (uint32_t)uflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawTextA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpchtext, jint cchtext, jlong lprc, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpchtext, (int32_t)cchtext, (void*)(uintptr_t)lprc, (uint32_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawTextExA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpchtext, jint cchtext, jlong lprc, jint format, jlong lpdtp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpchtext, (int32_t)cchtext, (void*)(uintptr_t)lprc, (uint32_t)format, (void*)(uintptr_t)lpdtp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    (void)lpdtp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawTextExW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpchtext, jint cchtext, jlong lprc, jint format, jlong lpdtp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpchtext, (int32_t)cchtext, (void*)(uintptr_t)lprc, (uint32_t)format, (void*)(uintptr_t)lpdtp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    (void)lpdtp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiDrawTextW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpchtext, jint cchtext, jlong lprc, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpchtext, (int32_t)cchtext, (void*)(uintptr_t)lprc, (uint32_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEllipse(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ellipse");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEndPaint(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppaint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPaint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppaint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)lppaint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEndPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesA(JNIEnv* km_env, jclass km_clazz, jlong lpdevice, jint idevnum, jlong lpdisplaydevice, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayDevicesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdevice, (uint32_t)idevnum, (void*)(uintptr_t)lpdisplaydevice, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdevice;
    (void)idevnum;
    (void)lpdisplaydevice;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesW(JNIEnv* km_env, jclass km_clazz, jlong lpdevice, jint idevnum, jlong lpdisplaydevice, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayDevicesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdevice, (uint32_t)idevnum, (void*)(uintptr_t)lpdisplaydevice, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdevice;
    (void)idevnum;
    (void)lpdisplaydevice;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumDisplayMonitors(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprcclip, jlong lpfnenum, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayMonitors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprcclip, (void*)(uintptr_t)lpfnenum, (int64_t)dwdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lprcclip;
    (void)lpfnenum;
    (void)dwdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsA(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jint imodenum, jlong lpdevmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdevicename, (uint32_t)imodenum, (void*)(uintptr_t)lpdevmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExA(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jint imodenum, jlong lpdevmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdevicename, (uint32_t)imodenum, (void*)(uintptr_t)lpdevmode, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExW(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jint imodenum, jlong lpdevmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdevicename, (uint32_t)imodenum, (void*)(uintptr_t)lpdevmode, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsW(JNIEnv* km_env, jclass km_clazz, jlong lpszdevicename, jint imodenum, jlong lpdevmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdevicename, (uint32_t)imodenum, (void*)(uintptr_t)lpdevmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumEnhMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hmf, jlong proc, jlong param3, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumEnhMetaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hmf, (void*)(uintptr_t)proc, (void*)(uintptr_t)param3, (void*)(uintptr_t)lprect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hmf;
    (void)proc;
    (void)param3;
    (void)lprect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumFontFamiliesA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumFontFamiliesW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumFontsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumFontsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplogfont, jlong lpproc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplogfont, (void*)(uintptr_t)lpproc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hmf, jlong proc, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumMetaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hmf, (void*)(uintptr_t)proc, (int64_t)param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hmf;
    (void)proc;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEnumObjects(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ntype, jlong lpfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumObjects");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)ntype, (void*)(uintptr_t)lpfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ntype;
    (void)lpfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEqualRect(JNIEnv* km_env, jclass km_clazz, jlong lprc1, jlong lprc2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprc1, (void*)(uintptr_t)lprc2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprc1;
    (void)lprc2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiEqualRgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn1, jlong hrgn2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgn1, (void*)(uintptr_t)hrgn2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrgn1;
    (void)hrgn2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiExcludeClipRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExcludeClipRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiExcludeUpdateRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExcludeUpdateRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiExtCreatePen(JNIEnv* km_env, jclass km_clazz, jint ipenstyle, jint cwidth, jlong plbrush, jint cstyle, jlong pstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtCreatePen");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ipenstyle, (uint32_t)cwidth, (void*)(uintptr_t)plbrush, (uint32_t)cstyle, (void*)(uintptr_t)pstyle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ipenstyle;
    (void)cwidth;
    (void)plbrush;
    (void)cstyle;
    (void)pstyle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiExtCreateRegion(JNIEnv* km_env, jclass km_clazz, jlong lpx, jint ncount, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtCreateRegion");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpx, (uint32_t)ncount, (void*)(uintptr_t)lpdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpx;
    (void)ncount;
    (void)lpdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiExtFloodFill(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint color, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtFloodFill");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)color, (uint32_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiExtSelectClipRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtSelectClipRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiExtTextOutA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint options, jlong lprect, jlong lpstring, jint c, jlong lpdx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtTextOutA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)options, (void*)(uintptr_t)lprect, (void*)(uintptr_t)lpstring, (uint32_t)c, (void*)(uintptr_t)lpdx);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)options;
    (void)lprect;
    (void)lpstring;
    (void)c;
    (void)lpdx;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiExtTextOutW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint options, jlong lprect, jlong lpstring, jint c, jlong lpdx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtTextOutW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)options, (void*)(uintptr_t)lprect, (void*)(uintptr_t)lpstring, (uint32_t)c, (void*)(uintptr_t)lpdx);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)options;
    (void)lprect;
    (void)lpstring;
    (void)c;
    (void)lpdx;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiFillPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiFillRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc, jlong hbr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc, (void*)(uintptr_t)hbr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lprc;
    (void)hbr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiFillRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn, jlong hbr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn, (void*)(uintptr_t)hbr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    (void)hbr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiFixBrushOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong ptl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FixBrushOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)ptl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)ptl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiFlattenPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlattenPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiFloodFill(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FloodFill");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiFrameRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc, jlong hbr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FrameRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc, (void*)(uintptr_t)hbr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lprc;
    (void)hbr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiFrameRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn, jlong hbr, jint w, jint h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FrameRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn, (void*)(uintptr_t)hbr, (int32_t)w, (int32_t)h);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    (void)hbr;
    (void)w;
    (void)h;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGdiComment(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint nsize, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiComment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)nsize, (void*)(uintptr_t)lpdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)nsize;
    (void)lpdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGdiFlush(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiFlush");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGdiGetBatchLimit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetBatchLimit");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGdiGradientFill(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pvertex, jint nvertex, jlong pmesh, jint ncount, jint ulmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGradientFill");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pvertex, (uint32_t)nvertex, (void*)(uintptr_t)pmesh, (uint32_t)ncount, (uint32_t)ulmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)pvertex;
    (void)nvertex;
    (void)pmesh;
    (void)ncount;
    (void)ulmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(JNIEnv* km_env, jclass km_clazz, jint dw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiSetBatchLimit");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dw);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dw;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGdiTransparentBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jint xorigindest, jint yorigindest, jint wdest, jint hdest, jlong hdcsrc, jint xoriginsrc, jint yoriginsrc, jint wsrc, jint hsrc, jint crtransparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiTransparentBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdcdest, (int32_t)xorigindest, (int32_t)yorigindest, (int32_t)wdest, (int32_t)hdest, (void*)(uintptr_t)hdcsrc, (int32_t)xoriginsrc, (int32_t)yoriginsrc, (int32_t)wsrc, (int32_t)hsrc, (uint32_t)crtransparent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetArcDirection(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetArcDirection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetAspectRatioFilterEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAspectRatioFilterEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetBitmapBits(JNIEnv* km_env, jclass km_clazz, jlong hbit, jint cb, jlong lpvbits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBitmapBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbit, (int32_t)cb, (void*)(uintptr_t)lpvbits);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbit;
    (void)cb;
    (void)lpvbits;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetBitmapDimensionEx(JNIEnv* km_env, jclass km_clazz, jlong hbit, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBitmapDimensionEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbit, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbit;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetBkColor(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBkColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetBkMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBkMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetBoundsRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprect, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBoundsRect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lprect;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetBrushOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBrushOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharABCWidthsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint wfirst, jint wlast, jlong lpabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)wfirst, (uint32_t)wlast, (void*)(uintptr_t)lpabc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)wfirst;
    (void)wlast;
    (void)lpabc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsFloatA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpabc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpabc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsFloatW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpabc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpabc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharABCWidthsI(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint gifirst, jint cgi, jlong pgi, jlong pabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)gifirst, (uint32_t)cgi, (void*)(uintptr_t)pgi, (void*)(uintptr_t)pabc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)gifirst;
    (void)cgi;
    (void)pgi;
    (void)pabc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharABCWidthsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint wfirst, jint wlast, jlong lpabc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)wfirst, (uint32_t)wlast, (void*)(uintptr_t)lpabc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)wfirst;
    (void)wlast;
    (void)lpabc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharWidth32A(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidth32A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharWidth32W(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidth32W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharWidthA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharWidthFloatA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthFloatA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharWidthFloatW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthFloatW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharWidthI(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint gifirst, jint cgi, jlong pgi, jlong piwidths) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)gifirst, (uint32_t)cgi, (void*)(uintptr_t)pgi, (void*)(uintptr_t)piwidths);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)gifirst;
    (void)cgi;
    (void)pgi;
    (void)piwidths;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharWidthW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ifirst, jint ilast, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ifirst, (uint32_t)ilast, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharacterPlacementA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint ncount, jint nmexextent, jlong lpresults, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharacterPlacementA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)ncount, (int32_t)nmexextent, (void*)(uintptr_t)lpresults, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lpstring;
    (void)ncount;
    (void)nmexextent;
    (void)lpresults;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCharacterPlacementW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint ncount, jint nmexextent, jlong lpresults, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharacterPlacementW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)ncount, (int32_t)nmexextent, (void*)(uintptr_t)lpresults, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lpstring;
    (void)ncount;
    (void)nmexextent;
    (void)lpresults;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetClipBox(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipBox");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lprect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetClipRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetColorAdjustment(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpca) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorAdjustment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpca);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpca;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCurrentObject(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentObject");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)type);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)type;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetCurrentPositionEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPositionEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetDC(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDC");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetDCBrushColor(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCBrushColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetDCEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgnclip, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgnclip, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)hrgnclip;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetDCOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetDCPenColor(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCPenColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetDIBColorTable(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint istart, jint centries, jlong prgbq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDIBColorTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)prgbq);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)prgbq;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetDIBits(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbm, jint start, jint clines, jlong lpvbits, jlong lpbmi, jint usage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDIBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbm, (uint32_t)start, (uint32_t)clines, (void*)(uintptr_t)lpvbits, (void*)(uintptr_t)lpbmi, (uint32_t)usage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hbm;
    (void)start;
    (void)clines;
    (void)lpvbits;
    (void)lpbmi;
    (void)usage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetDeviceCaps(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint arg1Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)arg1Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)arg1Index;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetEnhMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetEnhMetaFileBits(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint nsize, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileBits");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)nsize, (void*)(uintptr_t)lpdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)nsize;
    (void)lpdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionA(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cchbuffer, jlong lpdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileDescriptionA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cchbuffer, (void*)(uintptr_t)lpdescription);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)cchbuffer;
    (void)lpdescription;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionW(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cchbuffer, jlong lpdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileDescriptionW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cchbuffer, (void*)(uintptr_t)lpdescription);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)cchbuffer;
    (void)lpdescription;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetEnhMetaFileHeader(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint nsize, jlong lpenhmetaheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)nsize, (void*)(uintptr_t)lpenhmetaheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)nsize;
    (void)lpenhmetaheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetEnhMetaFilePaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint nnumentries, jlong lppaletteentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFilePaletteEntries");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)nnumentries, (void*)(uintptr_t)lppaletteentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)nnumentries;
    (void)lppaletteentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetEnhMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetFontData(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint dwtable, jint dwoffset, jlong pvbuffer, jint cjbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)dwtable, (uint32_t)dwoffset, (void*)(uintptr_t)pvbuffer, (uint32_t)cjbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)dwtable;
    (void)dwoffset;
    (void)pvbuffer;
    (void)cjbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetFontLanguageInfo(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontLanguageInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetFontUnicodeRanges(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpgs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontUnicodeRanges");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpgs);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lpgs;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetGlyphIndicesA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstr, jint c, jlong pgi, jint fl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphIndicesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstr, (int32_t)c, (void*)(uintptr_t)pgi, (uint32_t)fl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lpstr;
    (void)c;
    (void)pgi;
    (void)fl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetGlyphIndicesW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstr, jint c, jlong pgi, jint fl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphIndicesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstr, (int32_t)c, (void*)(uintptr_t)pgi, (uint32_t)fl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lpstr;
    (void)c;
    (void)pgi;
    (void)fl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetGlyphOutlineA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint uchar, jint fuformat, jlong lpgm, jint cjbuffer, jlong pvbuffer, jlong lpmat2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphOutlineA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)uchar, (uint32_t)fuformat, (void*)(uintptr_t)lpgm, (uint32_t)cjbuffer, (void*)(uintptr_t)pvbuffer, (void*)(uintptr_t)lpmat2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)uchar;
    (void)fuformat;
    (void)lpgm;
    (void)cjbuffer;
    (void)pvbuffer;
    (void)lpmat2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetGlyphOutlineW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint uchar, jint fuformat, jlong lpgm, jint cjbuffer, jlong pvbuffer, jlong lpmat2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphOutlineW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)uchar, (uint32_t)fuformat, (void*)(uintptr_t)lpgm, (uint32_t)cjbuffer, (void*)(uintptr_t)pvbuffer, (void*)(uintptr_t)lpmat2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)uchar;
    (void)fuformat;
    (void)lpgm;
    (void)cjbuffer;
    (void)pvbuffer;
    (void)lpmat2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetGraphicsMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGraphicsMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetKerningPairsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint npairs, jlong lpkernpair) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKerningPairsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)npairs, (void*)(uintptr_t)lpkernpair);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)npairs;
    (void)lpkernpair;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetKerningPairsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint npairs, jlong lpkernpair) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKerningPairsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)npairs, (void*)(uintptr_t)lpkernpair);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)npairs;
    (void)lpkernpair;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetLayout(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLayout");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetMapMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetMetaFileA(JNIEnv* km_env, jclass km_clazz, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetMetaFileBitsEx(JNIEnv* km_env, jclass km_clazz, jlong hmf, jint cbbuffer, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileBitsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmf, (uint32_t)cbbuffer, (void*)(uintptr_t)lpdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmf;
    (void)cbbuffer;
    (void)lpdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetMetaFileW(JNIEnv* km_env, jclass km_clazz, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetMetaRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong plimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMiterLimit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)plimit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)plimit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetMonitorInfoA(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong lpmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)lpmi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)lpmi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetMonitorInfoW(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong lpmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)lpmi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)lpmi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetNearestColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNearestColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetNearestPaletteIndex(JNIEnv* km_env, jclass km_clazz, jlong h, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNearestPaletteIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)h, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)h;
    (void)color;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetObjectA(JNIEnv* km_env, jclass km_clazz, jlong h, jint c, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)h, (int32_t)c, (void*)(uintptr_t)pv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)h;
    (void)c;
    (void)pv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetObjectType(JNIEnv* km_env, jclass km_clazz, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectType");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)h);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)h;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetObjectW(JNIEnv* km_env, jclass km_clazz, jlong h, jint c, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)h, (int32_t)c, (void*)(uintptr_t)pv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)h;
    (void)c;
    (void)pv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint cjcopy, jlong potm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOutlineTextMetricsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)cjcopy, (void*)(uintptr_t)potm);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)cjcopy;
    (void)potm;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint cjcopy, jlong potm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOutlineTextMetricsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)cjcopy, (void*)(uintptr_t)potm);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)cjcopy;
    (void)potm;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetPaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong hpal, jint istart, jint centries, jlong ppalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPaletteEntries");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpal, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)ppalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpal;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetPath(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jlong aj, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (void*)(uintptr_t)aj, (int32_t)cpt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)aj;
    (void)cpt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetPixel(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPixel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetPolyFillMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPolyFillMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetROP2(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetROP2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetRandomRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRandomRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn, (int32_t)i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    (void)i;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetRasterizerCaps(JNIEnv* km_env, jclass km_clazz, jlong lpraststat, jint cjbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRasterizerCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpraststat, (uint32_t)cjbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpraststat;
    (void)cjbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetRegionData(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jint ncount, jlong lprgndata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegionData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgn, (uint32_t)ncount, (void*)(uintptr_t)lprgndata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrgn;
    (void)ncount;
    (void)lprgndata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetRgnBox(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRgnBox");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgn, (void*)(uintptr_t)lprc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrgn;
    (void)lprc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetStockObject(JNIEnv* km_env, jclass km_clazz, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStockObject");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)i);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)i;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetStretchBltMode(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStretchBltMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetSysColor(JNIEnv* km_env, jclass km_clazz, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSysColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetSysColorBrush(JNIEnv* km_env, jclass km_clazz, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSysColorBrush");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)nindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetSystemPaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint istart, jint centries, jlong ppalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPaletteEntries");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)ppalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetSystemPaletteUse(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPaletteUse");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint chcount, jint ntabpositions, jlong lpntabstoppositions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTabbedTextExtentA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)ntabpositions, (void*)(uintptr_t)lpntabstoppositions);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint chcount, jint ntabpositions, jlong lpntabstoppositions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTabbedTextExtentW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)ntabpositions, (void*)(uintptr_t)lpntabstoppositions);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextAlign(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextAlign");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextCharacterExtra(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextCharacterExtra");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextColor(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextExtentExPointA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpszstring, jint cchstring, jint nmaxextent, jlong lpnfit, jlong lpndx, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpszstring, (int32_t)cchstring, (int32_t)nmaxextent, (void*)(uintptr_t)lpnfit, (void*)(uintptr_t)lpndx, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpszstring;
    (void)cchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextExtentExPointI(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpwszstring, jint cwchstring, jint nmaxextent, jlong lpnfit, jlong lpndx, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpwszstring, (int32_t)cwchstring, (int32_t)nmaxextent, (void*)(uintptr_t)lpnfit, (void*)(uintptr_t)lpndx, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpwszstring;
    (void)cwchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextExtentExPointW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpszstring, jint cchstring, jint nmaxextent, jlong lpnfit, jlong lpndx, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpszstring, (int32_t)cchstring, (int32_t)nmaxextent, (void*)(uintptr_t)lpnfit, (void*)(uintptr_t)lpndx, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpszstring;
    (void)cchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32A(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint c, jlong psizl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPoint32A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)c, (void*)(uintptr_t)psizl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)psizl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32W(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint c, jlong psizl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPoint32W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)c, (void*)(uintptr_t)psizl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)psizl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextExtentPointA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint c, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)c, (void*)(uintptr_t)lpsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)lpsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextExtentPointI(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pgiin, jint cgi, jlong psize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pgiin, (int32_t)cgi, (void*)(uintptr_t)psize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)pgiin;
    (void)cgi;
    (void)psize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextExtentPointW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpstring, jint c, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpstring, (int32_t)c, (void*)(uintptr_t)lpsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)lpsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextFaceA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint c, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextFaceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)c, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)c;
    (void)lpname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextFaceW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint c, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextFaceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)c, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)c;
    (void)lpname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextMetricsA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lptm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextMetricsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lptm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lptm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetTextMetricsW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lptm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextMetricsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lptm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lptm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetUpdateRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprect, jint berase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdateRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprect, (int32_t)berase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)lprect;
    (void)berase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetUpdateRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn, jint berase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdateRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn, (int32_t)berase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hrgn;
    (void)berase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetViewportExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetViewportExtEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetViewportOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetViewportOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lppoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetWinMetaFileBits(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cbdata16, jlong pdata16, jint imapmode, jlong hdcref) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWinMetaFileBits");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cbdata16, (void*)(uintptr_t)pdata16, (int32_t)imapmode, (void*)(uintptr_t)hdcref);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)cbdata16;
    (void)pdata16;
    (void)imapmode;
    (void)hdcref;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetWindowDC(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowDC");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetWindowExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowExtEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetWindowOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lppoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetWindowRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hrgn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetWindowRgnBox(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRgnBox");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)lprc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpxf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpxf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpxf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGradientFill(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pvertex, jint nvertex, jlong pmesh, jint nmesh, jint ulmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msimg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GradientFill");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pvertex, (uint32_t)nvertex, (void*)(uintptr_t)pmesh, (uint32_t)nmesh, (uint32_t)ulmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)pvertex;
    (void)nvertex;
    (void)pmesh;
    (void)nmesh;
    (void)ulmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGrayStringA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbrush, jlong lpoutputfunc, jlong lpdata, jint ncount, jint x, jint y, jint nwidth, jint nheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GrayStringA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbrush, (void*)(uintptr_t)lpoutputfunc, (int64_t)lpdata, (int32_t)ncount, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiGrayStringW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbrush, jlong lpoutputfunc, jlong lpdata, jint ncount, jint x, jint y, jint nwidth, jint nheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GrayStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbrush, (void*)(uintptr_t)lpoutputfunc, (int64_t)lpdata, (int32_t)ncount, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiInflateRect(JNIEnv* km_env, jclass km_clazz, jlong lprc, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InflateRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprc, (int32_t)dx, (int32_t)dy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprc;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiIntersectClipRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntersectClipRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiIntersectRect(JNIEnv* km_env, jclass km_clazz, jlong lprcdst, jlong lprcsrc1, jlong lprcsrc2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntersectRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprcdst, (void*)(uintptr_t)lprcsrc1, (void*)(uintptr_t)lprcsrc2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiInvalidateRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprect, jint berase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvalidateRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprect, (int32_t)berase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)lprect;
    (void)berase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiInvalidateRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn, jint berase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvalidateRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn, (int32_t)berase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hrgn;
    (void)berase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiInvertRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvertRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lprc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiInvertRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvertRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiIsRectEmpty(JNIEnv* km_env, jclass km_clazz, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsRectEmpty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiLPtoDP(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lppt, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPtoDP");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lppt, (int32_t)c);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lppt;
    (void)c;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiLineDDA(JNIEnv* km_env, jclass km_clazz, jint xstart, jint ystart, jint xend, jint yend, jlong lpproc, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LineDDA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)xstart, (int32_t)ystart, (int32_t)xend, (int32_t)yend, (void*)(uintptr_t)lpproc, (int64_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)xstart;
    (void)ystart;
    (void)xend;
    (void)yend;
    (void)lpproc;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiLineTo(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LineTo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiLoadBitmapA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpbitmapname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadBitmapA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpbitmapname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinstance;
    (void)lpbitmapname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiLoadBitmapW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpbitmapname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadBitmapW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpbitmapname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinstance;
    (void)lpbitmapname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiLockWindowUpdate(JNIEnv* km_env, jclass km_clazz, jlong hwndlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockWindowUpdate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndlock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndlock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiMapWindowPoints(JNIEnv* km_env, jclass km_clazz, jlong hwndfrom, jlong hwndto, jlong lppoints, jint cpoints) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapWindowPoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndfrom, (void*)(uintptr_t)hwndto, (void*)(uintptr_t)lppoints, (uint32_t)cpoints);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndfrom;
    (void)hwndto;
    (void)lppoints;
    (void)cpoints;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiMaskBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jint xdest, jint ydest, jint width, jint height, jlong hdcsrc, jint xsrc, jint ysrc, jlong hbmmask, jint xmask, jint ymask, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MaskBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdcdest, (int32_t)xdest, (int32_t)ydest, (int32_t)width, (int32_t)height, (void*)(uintptr_t)hdcsrc, (int32_t)xsrc, (int32_t)ysrc, (void*)(uintptr_t)hbmmask, (int32_t)xmask, (int32_t)ymask, (uint32_t)rop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiMergeFontPackage(JNIEnv* km_env, jclass km_clazz, jlong puchmergefontbuffer, jint ulmergefontbuffersize, jlong puchfontpackagebuffer, jint ulfontpackagebuffersize, jlong ppuchdestbuffer, jlong puldestbuffersize, jlong pulbyteswritten, jshort usmode, jlong lpfnallocate, jlong lpfnreallocate, jlong lpfnfree, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fontsub.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MergeFontPackage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puchmergefontbuffer, (uint32_t)ulmergefontbuffersize, (void*)(uintptr_t)puchfontpackagebuffer, (uint32_t)ulfontpackagebuffersize, (void*)(uintptr_t)ppuchdestbuffer, (void*)(uintptr_t)puldestbuffersize, (void*)(uintptr_t)pulbyteswritten, (uint16_t)usmode, (void*)(uintptr_t)lpfnallocate, (void*)(uintptr_t)lpfnreallocate, (void*)(uintptr_t)lpfnfree, (void*)(uintptr_t)lpvreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiModifyWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpxf, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpxf, (uint32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpxf;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiMonitorFromRect(JNIEnv* km_env, jclass km_clazz, jlong lprc, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonitorFromRect");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprc, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lprc;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiMonitorFromWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonitorFromWindow");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiMoveToEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveToEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiOffsetClipRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetClipRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiOffsetRect(JNIEnv* km_env, jclass km_clazz, jlong lprc, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprc, (int32_t)dx, (int32_t)dy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprc;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiOffsetRgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgn, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrgn;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiOffsetViewportOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetViewportOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiOffsetWindowOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetWindowOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPaintDesktop(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PaintDesktop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPaintRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PaintRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPatBlt(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint w, jint h, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PatBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (int32_t)w, (int32_t)h, (uint32_t)rop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)w;
    (void)h;
    (void)rop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPathToRegion(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathToRegion");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPie(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom, jint xr1, jint yr1, jint xr2, jint yr2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Pie");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom, (int32_t)xr1, (int32_t)yr1, (int32_t)xr2, (int32_t)yr2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPlayEnhMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hmf, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayEnhMetaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hmf, (void*)(uintptr_t)lprect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hmf;
    (void)lprect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPlayEnhMetaFileRecord(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pht, jlong pmr, jint cht) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayEnhMetaFileRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pht, (void*)(uintptr_t)pmr, (uint32_t)cht);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)pht;
    (void)pmr;
    (void)cht;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPlayMetaFile(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hmf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayMetaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hmf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hmf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPlayMetaFileRecord(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lphandletable, jlong lpmr, jint noobjs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayMetaFileRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lphandletable, (void*)(uintptr_t)lpmr, (uint32_t)noobjs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lphandletable;
    (void)lpmr;
    (void)noobjs;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPlgBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jlong lppoint, jlong hdcsrc, jint xsrc, jint ysrc, jint width, jint height, jlong hbmmask, jint xmask, jint ymask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlgBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdcdest, (void*)(uintptr_t)lppoint, (void*)(uintptr_t)hdcsrc, (int32_t)xsrc, (int32_t)ysrc, (int32_t)width, (int32_t)height, (void*)(uintptr_t)hbmmask, (int32_t)xmask, (int32_t)ymask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolyBezier(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyBezier");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (uint32_t)cpt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolyBezierTo(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyBezierTo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (uint32_t)cpt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolyDraw(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jlong aj, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyDraw");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (void*)(uintptr_t)aj, (int32_t)cpt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)aj;
    (void)cpt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolyPolygon(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jlong asz, jint csz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyPolygon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (void*)(uintptr_t)asz, (int32_t)csz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)asz;
    (void)csz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolyPolyline(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jlong asz, jint csz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyPolyline");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (void*)(uintptr_t)asz, (uint32_t)csz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)asz;
    (void)csz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolyTextOutA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ppt, jint nstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyTextOutA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ppt, (int32_t)nstrings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ppt;
    (void)nstrings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolyTextOutW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ppt, jint nstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyTextOutW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ppt, (int32_t)nstrings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ppt;
    (void)nstrings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolygon(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Polygon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (int32_t)cpt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolyline(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Polyline");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (int32_t)cpt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPolylineTo(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong apt, jint cpt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolylineTo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)apt, (uint32_t)cpt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPtInRegion(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PtInRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgn, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrgn;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiPtVisible(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PtVisible");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRealizePalette(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealizePalette");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRectInRegion(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RectInRegion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgn, (void*)(uintptr_t)lprect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrgn;
    (void)lprect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRectVisible(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RectVisible");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lprect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRectangle(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Rectangle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRedrawWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprcupdate, jlong hrgnupdate, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RedrawWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprcupdate, (void*)(uintptr_t)hrgnupdate, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)lprcupdate;
    (void)hrgnupdate;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiReleaseDC(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRemoveFontMemResourceEx(JNIEnv* km_env, jclass km_clazz, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontMemResourceEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)h);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)h;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRemoveFontResourceA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRemoveFontResourceExA(JNIEnv* km_env, jclass km_clazz, jlong name, jint fl, jlong pdv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)fl, (void*)(uintptr_t)pdv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)fl;
    (void)pdv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRemoveFontResourceExW(JNIEnv* km_env, jclass km_clazz, jlong name, jint fl, jlong pdv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)fl, (void*)(uintptr_t)pdv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)fl;
    (void)pdv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRemoveFontResourceW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiResetDCA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetDCA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpdm);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)lpdm;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiResetDCW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetDCW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpdm);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)lpdm;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiResizePalette(JNIEnv* km_env, jclass km_clazz, jlong hpal, jint n) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResizePalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpal, (uint32_t)n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpal;
    (void)n;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRestoreDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint nsaveddc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)nsaveddc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)nsaveddc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiRoundRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint left, jint top, jint right, jint bottom, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RoundRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    (void)width;
    (void)height;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSaveDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaveDC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiScaleViewportExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xn, jint dx, jint yn, jint yd, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScaleViewportExtEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xn, (int32_t)dx, (int32_t)yn, (int32_t)yd, (void*)(uintptr_t)lpsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)xn;
    (void)dx;
    (void)yn;
    (void)yd;
    (void)lpsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiScaleWindowExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xn, jint xd, jint yn, jint yd, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScaleWindowExtEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xn, (int32_t)xd, (int32_t)yn, (int32_t)yd, (void*)(uintptr_t)lpsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)xn;
    (void)xd;
    (void)yn;
    (void)yd;
    (void)lpsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiScreenToClient(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScreenToClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)lppoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSelectClipPath(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectClipPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSelectClipRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectClipRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hrgn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSelectObject(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectObject");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)h);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)h;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSelectPalette(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hpal, jint bforcebkgd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectPalette");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hpal, (int32_t)bforcebkgd);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)hpal;
    (void)bforcebkgd;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetArcDirection(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint dir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetArcDirection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)dir);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)dir;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetBitmapBits(JNIEnv* km_env, jclass km_clazz, jlong hbm, jint cb, jlong pvbits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBitmapBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbm, (uint32_t)cb, (void*)(uintptr_t)pvbits);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbm;
    (void)cb;
    (void)pvbits;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetBitmapDimensionEx(JNIEnv* km_env, jclass km_clazz, jlong hbm, jint w, jint h, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBitmapDimensionEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbm, (int32_t)w, (int32_t)h, (void*)(uintptr_t)lpsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbm;
    (void)w;
    (void)h;
    (void)lpsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetBkColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBkColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetBkMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBkMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetBoundsRect(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprect, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBoundsRect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprect, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)lprect;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetBrushOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBrushOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetColorAdjustment(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpca) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorAdjustment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpca);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpca;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetDCBrushColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDCBrushColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetDCPenColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDCPenColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetDIBColorTable(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint istart, jint centries, jlong prgbq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBColorTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)prgbq);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)prgbq;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetDIBits(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hbm, jint start, jint clines, jlong lpbits, jlong lpbmi, jint coloruse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hbm, (uint32_t)start, (uint32_t)clines, (void*)(uintptr_t)lpbits, (void*)(uintptr_t)lpbmi, (uint32_t)coloruse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hbm;
    (void)start;
    (void)clines;
    (void)lpbits;
    (void)lpbmi;
    (void)coloruse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetDIBitsToDevice(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xdest, jint ydest, jint w, jint h, jint xsrc, jint ysrc, jint startscan, jint clines, jlong lpvbits, jlong lpbmi, jint coloruse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t, int32_t, int32_t, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBitsToDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xdest, (int32_t)ydest, (uint32_t)w, (uint32_t)h, (int32_t)xsrc, (int32_t)ysrc, (uint32_t)startscan, (uint32_t)clines, (void*)(uintptr_t)lpvbits, (void*)(uintptr_t)lpbmi, (uint32_t)coloruse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetEnhMetaFileBits(JNIEnv* km_env, jclass km_clazz, jint nsize, jlong pb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnhMetaFileBits");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nsize, (void*)(uintptr_t)pb);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)nsize;
    (void)pb;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetGraphicsMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGraphicsMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)imode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)imode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetLayout(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint l) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLayout");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)l);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)l;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetMapMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMapMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)imode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)imode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetMapperFlags(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMapperFlags");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetMetaFileBitsEx(JNIEnv* km_env, jclass km_clazz, jint cbbuffer, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMetaFileBitsEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cbbuffer, (void*)(uintptr_t)lpdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cbbuffer;
    (void)lpdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetMetaRgn(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMetaRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetMiterLimit(JNIEnv* km_env, jclass km_clazz, jlong hdc, jfloat limit, jlong old) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMiterLimit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (float)limit, (void*)(uintptr_t)old);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)limit;
    (void)old;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetPaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong hpal, jint istart, jint centries, jlong ppalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPaletteEntries");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpal, (uint32_t)istart, (uint32_t)centries, (void*)(uintptr_t)ppalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpal;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetPixel(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPixel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetPixelV(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPixelV");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetPolyFillMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPolyFillMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetROP2(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint rop2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetROP2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)rop2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)rop2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetRect(JNIEnv* km_env, jclass km_clazz, jlong lprc, jint xleft, jint ytop, jint xright, jint ybottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprc, (int32_t)xleft, (int32_t)ytop, (int32_t)xright, (int32_t)ybottom);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprc;
    (void)xleft;
    (void)ytop;
    (void)xright;
    (void)ybottom;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetRectEmpty(JNIEnv* km_env, jclass km_clazz, jlong lprc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRectEmpty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetRectRgn(JNIEnv* km_env, jclass km_clazz, jlong hrgn, jint left, jint top, jint right, jint bottom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRectRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrgn, (int32_t)left, (int32_t)top, (int32_t)right, (int32_t)bottom);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrgn;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetStretchBltMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStretchBltMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetSysColors(JNIEnv* km_env, jclass km_clazz, jint celements, jlong lpaelements, jlong lpargbvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSysColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)celements, (void*)(uintptr_t)lpaelements, (void*)(uintptr_t)lpargbvalues);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)celements;
    (void)lpaelements;
    (void)lpargbvalues;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetSystemPaletteUse(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint use) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemPaletteUse");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)use);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)use;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetTextAlign(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint align) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextAlign");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)align);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)align;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetTextCharacterExtra(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint extra) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextCharacterExtra");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)extra);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)extra;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetTextColor(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint color) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)color);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetTextJustification(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint extra, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextJustification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)extra, (int32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)extra;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetViewportExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetViewportExtEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetViewportOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetViewportOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetWindowExtEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowExtEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetWindowOrgEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowOrgEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lppt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetWindowRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn, jint bredraw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn, (int32_t)bredraw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hrgn;
    (void)bredraw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSetWorldTransform(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpxf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWorldTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpxf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpxf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiStretchBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jint xdest, jint ydest, jint wdest, jint hdest, jlong hdcsrc, jint xsrc, jint ysrc, jint wsrc, jint hsrc, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StretchBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdcdest, (int32_t)xdest, (int32_t)ydest, (int32_t)wdest, (int32_t)hdest, (void*)(uintptr_t)hdcsrc, (int32_t)xsrc, (int32_t)ysrc, (int32_t)wsrc, (int32_t)hsrc, (uint32_t)rop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiStretchDIBits(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xdest, jint ydest, jint destwidth, jint destheight, jint xsrc, jint ysrc, jint srcwidth, jint srcheight, jlong lpbits, jlong lpbmi, jint iusage, jint rop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StretchDIBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xdest, (int32_t)ydest, (int32_t)destwidth, (int32_t)destheight, (int32_t)xsrc, (int32_t)ysrc, (int32_t)srcwidth, (int32_t)srcheight, (void*)(uintptr_t)lpbits, (void*)(uintptr_t)lpbmi, (uint32_t)iusage, (uint32_t)rop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiStrokeAndFillPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrokeAndFillPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiStrokePath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrokePath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiSubtractRect(JNIEnv* km_env, jclass km_clazz, jlong lprcdst, jlong lprcsrc1, jlong lprcsrc2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubtractRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprcdst, (void*)(uintptr_t)lprcsrc1, (void*)(uintptr_t)lprcsrc2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTCharToUnicode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong puccharcodes, jint ulcharcodesize, jlong pusshortcodes, jint ulshortcodesize, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTCharToUnicode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)puccharcodes, (uint32_t)ulcharcodesize, (void*)(uintptr_t)pusshortcodes, (uint32_t)ulshortcodesize, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)puccharcodes;
    (void)ulcharcodesize;
    (void)pusshortcodes;
    (void)ulshortcodesize;
    (void)ulflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTDeleteEmbeddedFont(JNIEnv* km_env, jclass km_clazz, jlong hfontreference, jint ulflags, jlong pulstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTDeleteEmbeddedFont");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfontreference, (uint32_t)ulflags, (void*)(uintptr_t)pulstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfontreference;
    (void)ulflags;
    (void)pulstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTEmbedFont(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ulflags, jint ulcharset, jlong pulprivstatus, jlong pulstatus, jlong lpfnwritetostream, jlong lpvwritestream, jlong puscharcodeset, jshort uscharcodecount, jshort uslanguage, jlong pttembedinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFont");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ulflags, (uint32_t)ulcharset, (void*)(uintptr_t)pulprivstatus, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnwritetostream, (void*)(uintptr_t)lpvwritestream, (void*)(uintptr_t)puscharcodeset, (uint16_t)uscharcodecount, (uint16_t)uslanguage, (void*)(uintptr_t)pttembedinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTEmbedFontEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ulflags, jint ulcharset, jlong pulprivstatus, jlong pulstatus, jlong lpfnwritetostream, jlong lpvwritestream, jlong pulcharcodeset, jshort uscharcodecount, jshort uslanguage, jlong pttembedinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFontEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)ulflags, (uint32_t)ulcharset, (void*)(uintptr_t)pulprivstatus, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnwritetostream, (void*)(uintptr_t)lpvwritestream, (void*)(uintptr_t)pulcharcodeset, (uint16_t)uscharcodecount, (uint16_t)uslanguage, (void*)(uintptr_t)pttembedinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTEmbedFontFromFileA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong szfontfilename, jshort usttcindex, jint ulflags, jint ulcharset, jlong pulprivstatus, jlong pulstatus, jlong lpfnwritetostream, jlong lpvwritestream, jlong puscharcodeset, jshort uscharcodecount, jshort uslanguage, jlong pttembedinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFontFromFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)szfontfilename, (uint16_t)usttcindex, (uint32_t)ulflags, (uint32_t)ulcharset, (void*)(uintptr_t)pulprivstatus, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnwritetostream, (void*)(uintptr_t)lpvwritestream, (void*)(uintptr_t)puscharcodeset, (uint16_t)uscharcodecount, (uint16_t)uslanguage, (void*)(uintptr_t)pttembedinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTEnableEmbeddingForFacename(JNIEnv* km_env, jclass km_clazz, jlong lpszfacename, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEnableEmbeddingForFacename");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszfacename, (int32_t)benable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszfacename;
    (void)benable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTGetEmbeddedFontInfo(JNIEnv* km_env, jclass km_clazz, jint ulflags, jlong pulprivstatus, jint ulprivs, jlong pulstatus, jlong lpfnreadfromstream, jlong lpvreadstream, jlong pttloadinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetEmbeddedFontInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulflags, (void*)(uintptr_t)pulprivstatus, (uint32_t)ulprivs, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnreadfromstream, (void*)(uintptr_t)lpvreadstream, (void*)(uintptr_t)pttloadinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulflags;
    (void)pulprivstatus;
    (void)ulprivs;
    (void)pulstatus;
    (void)lpfnreadfromstream;
    (void)lpvreadstream;
    (void)pttloadinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTGetEmbeddingType(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pulembedtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetEmbeddingType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pulembedtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)pulembedtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTGetNewFontName(JNIEnv* km_env, jclass km_clazz, jlong phfontreference, jlong wzwinfamilyname, jint cchmaxwinname, jlong szmacfamilyname, jint cchmaxmacname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetNewFontName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phfontreference, (void*)(uintptr_t)wzwinfamilyname, (int32_t)cchmaxwinname, (void*)(uintptr_t)szmacfamilyname, (int32_t)cchmaxmacname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phfontreference;
    (void)wzwinfamilyname;
    (void)cchmaxwinname;
    (void)szmacfamilyname;
    (void)cchmaxmacname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabled(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pbenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTIsEmbeddingEnabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pbenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)pbenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabledForFacename(JNIEnv* km_env, jclass km_clazz, jlong lpszfacename, jlong pbenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTIsEmbeddingEnabledForFacename");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszfacename, (void*)(uintptr_t)pbenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszfacename;
    (void)pbenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTLoadEmbeddedFont(JNIEnv* km_env, jclass km_clazz, jlong phfontreference, jint ulflags, jlong pulprivstatus, jint ulprivs, jlong pulstatus, jlong lpfnreadfromstream, jlong lpvreadstream, jlong szwinfamilyname, jlong szmacfamilyname, jlong pttloadinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTLoadEmbeddedFont");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phfontreference, (uint32_t)ulflags, (void*)(uintptr_t)pulprivstatus, (uint32_t)ulprivs, (void*)(uintptr_t)pulstatus, (void*)(uintptr_t)lpfnreadfromstream, (void*)(uintptr_t)lpvreadstream, (void*)(uintptr_t)szwinfamilyname, (void*)(uintptr_t)szmacfamilyname, (void*)(uintptr_t)pttloadinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTRunValidationTests(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ptestparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTRunValidationTests");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ptestparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ptestparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTTRunValidationTestsEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ptestparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTRunValidationTestsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ptestparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ptestparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTabbedTextOutA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpstring, jint chcount, jint ntabpositions, jlong lpntabstoppositions, jint ntaborigin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TabbedTextOutA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)ntabpositions, (void*)(uintptr_t)lpntabstoppositions, (int32_t)ntaborigin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    (void)ntaborigin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTabbedTextOutW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpstring, jint chcount, jint ntabpositions, jlong lpntabstoppositions, jint ntaborigin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TabbedTextOutW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)ntabpositions, (void*)(uintptr_t)lpntabstoppositions, (int32_t)ntaborigin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    (void)ntaborigin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTextOutA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpstring, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextOutA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpstring, (int32_t)c);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)c;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTextOutW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong lpstring, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextOutW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)lpstring, (int32_t)c);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)c;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiTransparentBlt(JNIEnv* km_env, jclass km_clazz, jlong hdcdest, jint xorigindest, jint yorigindest, jint wdest, jint hdest, jlong hdcsrc, jint xoriginsrc, jint yoriginsrc, jint wsrc, jint hsrc, jint crtransparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msimg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransparentBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdcdest, (int32_t)xorigindest, (int32_t)yorigindest, (int32_t)wdest, (int32_t)hdest, (void*)(uintptr_t)hdcsrc, (int32_t)xoriginsrc, (int32_t)yoriginsrc, (int32_t)wsrc, (int32_t)hsrc, (uint32_t)crtransparent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiUnionRect(JNIEnv* km_env, jclass km_clazz, jlong lprcdst, jlong lprcsrc1, jlong lprcsrc2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnionRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lprcdst, (void*)(uintptr_t)lprcsrc1, (void*)(uintptr_t)lprcsrc2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiUnrealizeObject(JNIEnv* km_env, jclass km_clazz, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnrealizeObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)h);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)h;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiUpdateColors(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiUpdateWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiValidateRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateRect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)lprect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiValidateRgn(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrgn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateRgn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrgn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hrgn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiWidenPath(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WidenPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiWindowFromDC(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowFromDC");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_gdi_WindowsWin32GraphicsGdiJniBridge_windowssysWindowsWin32GraphicsGdiWglSwapMultipleBuffers(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglSwapMultipleBuffers");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

