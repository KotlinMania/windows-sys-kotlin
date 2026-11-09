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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmAttachMilContent(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmAttachMilContent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmDefWindowProc(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam, jlong plresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmDefWindowProc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)plresult) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)plresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmDetachMilContent(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmDetachMilContent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmEnableBlurBehindWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pblurbehind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableBlurBehindWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pblurbehind) : -1;
#else
    (void)hwnd;
    (void)pblurbehind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmEnableComposition(JNIEnv* km_env, jclass km_clazz, jint ucompositionaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableComposition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ucompositionaction) : -1;
#else
    (void)ucompositionaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmEnableMMCSS(JNIEnv* km_env, jclass km_clazz, jint fenablemmcss) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableMMCSS");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fenablemmcss) : -1;
#else
    (void)fenablemmcss;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmExtendFrameIntoClientArea(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pmarinset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmExtendFrameIntoClientArea");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pmarinset) : -1;
#else
    (void)hwnd;
    (void)pmarinset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmFlush(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmFlush");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmGetColorizationColor(JNIEnv* km_env, jclass km_clazz, jlong pcrcolorization, jlong pfopaqueblend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetColorizationColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcrcolorization, (void*)(uintptr_t)pfopaqueblend) : -1;
#else
    (void)pcrcolorization;
    (void)pfopaqueblend;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmGetCompositionTimingInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ptiminginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetCompositionTimingInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ptiminginfo) : -1;
#else
    (void)hwnd;
    (void)ptiminginfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmGetGraphicsStreamClient(JNIEnv* km_env, jclass km_clazz, jint uindex, jlong pclientuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetGraphicsStreamClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uindex, (void*)(uintptr_t)pclientuuid) : -1;
#else
    (void)uindex;
    (void)pclientuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmGetGraphicsStreamTransformHint(JNIEnv* km_env, jclass km_clazz, jint uindex, jlong ptransform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetGraphicsStreamTransformHint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uindex, (void*)(uintptr_t)ptransform) : -1;
#else
    (void)uindex;
    (void)ptransform;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmGetTransportAttributes(JNIEnv* km_env, jclass km_clazz, jlong pfisremoting, jlong pfisconnected, jlong pdwgeneration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetTransportAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfisremoting, (void*)(uintptr_t)pfisconnected, (void*)(uintptr_t)pdwgeneration) : -1;
#else
    (void)pfisremoting;
    (void)pfisconnected;
    (void)pdwgeneration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmGetUnmetTabRequirements(JNIEnv* km_env, jclass km_clazz, jlong appwindow, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetUnmetTabRequirements");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)appwindow, (void*)(uintptr_t)value) : -1;
#else
    (void)appwindow;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmGetWindowAttribute(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwattribute, jlong pvattribute, jint cbattribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetWindowAttribute");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwattribute, (void*)(uintptr_t)pvattribute, (uint32_t)cbattribute) : -1;
#else
    (void)hwnd;
    (void)dwattribute;
    (void)pvattribute;
    (void)cbattribute;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmInvalidateIconicBitmaps(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmInvalidateIconicBitmaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmIsCompositionEnabled(JNIEnv* km_env, jclass km_clazz, jlong pfenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmIsCompositionEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfenabled) : -1;
#else
    (void)pfenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmModifyPreviousDxFrameDuration(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint crefreshes, jint frelative) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmModifyPreviousDxFrameDuration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)crefreshes, (int32_t)frelative) : -1;
#else
    (void)hwnd;
    (void)crefreshes;
    (void)frelative;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmQueryThumbnailSourceSize(JNIEnv* km_env, jclass km_clazz, jlong hthumbnail, jlong psize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmQueryThumbnailSourceSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hthumbnail, (void*)(uintptr_t)psize) : -1;
#else
    (void)hthumbnail;
    (void)psize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmRegisterThumbnail(JNIEnv* km_env, jclass km_clazz, jlong hwnddestination, jlong hwndsource, jlong phthumbnailid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmRegisterThumbnail");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnddestination, (void*)(uintptr_t)hwndsource, (void*)(uintptr_t)phthumbnailid) : -1;
#else
    (void)hwnddestination;
    (void)hwndsource;
    (void)phthumbnailid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmRenderGesture(JNIEnv* km_env, jclass km_clazz, jint gt, jint ccontacts, jlong pdwpointerid, jlong ppoints) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmRenderGesture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)gt, (uint32_t)ccontacts, (void*)(uintptr_t)pdwpointerid, (void*)(uintptr_t)ppoints) : -1;
#else
    (void)gt;
    (void)ccontacts;
    (void)pdwpointerid;
    (void)ppoints;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmSetDxFrameDuration(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint crefreshes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetDxFrameDuration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)crefreshes) : -1;
#else
    (void)hwnd;
    (void)crefreshes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmSetIconicLivePreviewBitmap(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hbmp, jlong pptclient, jint dwsitflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetIconicLivePreviewBitmap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hbmp, (void*)(uintptr_t)pptclient, (uint32_t)dwsitflags) : -1;
#else
    (void)hwnd;
    (void)hbmp;
    (void)pptclient;
    (void)dwsitflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmSetIconicThumbnail(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hbmp, jint dwsitflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetIconicThumbnail");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hbmp, (uint32_t)dwsitflags) : -1;
#else
    (void)hwnd;
    (void)hbmp;
    (void)dwsitflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmSetPresentParameters(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ppresentparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetPresentParameters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppresentparams) : -1;
#else
    (void)hwnd;
    (void)ppresentparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmSetWindowAttribute(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwattribute, jlong pvattribute, jint cbattribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetWindowAttribute");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwattribute, (void*)(uintptr_t)pvattribute, (uint32_t)cbattribute) : -1;
#else
    (void)hwnd;
    (void)dwattribute;
    (void)pvattribute;
    (void)cbattribute;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmShowContact(JNIEnv* km_env, jclass km_clazz, jint dwpointerid, jint eshowcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmShowContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwpointerid, (uint32_t)eshowcontact) : -1;
#else
    (void)dwpointerid;
    (void)eshowcontact;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmTransitionOwnedWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint target) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmTransitionOwnedWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)target) : -1;
#else
    (void)hwnd;
    (void)target;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmUnregisterThumbnail(JNIEnv* km_env, jclass km_clazz, jlong hthumbnailid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmUnregisterThumbnail");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hthumbnailid) : -1;
#else
    (void)hthumbnailid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssys_1windows_1win32_1graphics_1dwm_1DwmUpdateThumbnailProperties(JNIEnv* km_env, jclass km_clazz, jlong hthumbnailid, jlong ptnproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmUpdateThumbnailProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hthumbnailid, (void*)(uintptr_t)ptnproperties) : -1;
#else
    (void)hthumbnailid;
    (void)ptnproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

