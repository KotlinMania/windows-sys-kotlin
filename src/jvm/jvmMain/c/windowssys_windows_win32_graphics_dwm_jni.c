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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmAttachMilContent(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmAttachMilContent");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmDefWindowProc(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam, jlong plresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmDefWindowProc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)plresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)plresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmDetachMilContent(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmDetachMilContent");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pblurbehind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableBlurBehindWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pblurbehind);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pblurbehind;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmEnableComposition(JNIEnv* km_env, jclass km_clazz, jint ucompositionaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableComposition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ucompositionaction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ucompositionaction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(JNIEnv* km_env, jclass km_clazz, jint fenablemmcss) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmEnableMMCSS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fenablemmcss);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fenablemmcss;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pmarinset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmExtendFrameIntoClientArea");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pmarinset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pmarinset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmFlush(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmFlush");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(JNIEnv* km_env, jclass km_clazz, jlong pcrcolorization, jlong pfopaqueblend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetColorizationColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcrcolorization, (void*)(uintptr_t)pfopaqueblend);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcrcolorization;
    (void)pfopaqueblend;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ptiminginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetCompositionTimingInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ptiminginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)ptiminginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(JNIEnv* km_env, jclass km_clazz, jint uindex, jlong pclientuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetGraphicsStreamClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uindex, (void*)(uintptr_t)pclientuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uindex;
    (void)pclientuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(JNIEnv* km_env, jclass km_clazz, jint uindex, jlong ptransform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetGraphicsStreamTransformHint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uindex, (void*)(uintptr_t)ptransform);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uindex;
    (void)ptransform;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(JNIEnv* km_env, jclass km_clazz, jlong pfisremoting, jlong pfisconnected, jlong pdwgeneration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetTransportAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfisremoting, (void*)(uintptr_t)pfisconnected, (void*)(uintptr_t)pdwgeneration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfisremoting;
    (void)pfisconnected;
    (void)pdwgeneration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(JNIEnv* km_env, jclass km_clazz, jlong appwindow, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetUnmetTabRequirements");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)appwindow, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)appwindow;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwattribute, jlong pvattribute, jint cbattribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmGetWindowAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwattribute, (void*)(uintptr_t)pvattribute, (uint32_t)cbattribute);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)dwattribute;
    (void)pvattribute;
    (void)cbattribute;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmInvalidateIconicBitmaps");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(JNIEnv* km_env, jclass km_clazz, jlong pfenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmIsCompositionEnabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint crefreshes, jint frelative) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmModifyPreviousDxFrameDuration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)crefreshes, (int32_t)frelative);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)crefreshes;
    (void)frelative;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(JNIEnv* km_env, jclass km_clazz, jlong hthumbnail, jlong psize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmQueryThumbnailSourceSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hthumbnail, (void*)(uintptr_t)psize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthumbnail;
    (void)psize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(JNIEnv* km_env, jclass km_clazz, jlong hwnddestination, jlong hwndsource, jlong phthumbnailid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmRegisterThumbnail");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnddestination, (void*)(uintptr_t)hwndsource, (void*)(uintptr_t)phthumbnailid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnddestination;
    (void)hwndsource;
    (void)phthumbnailid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmRenderGesture(JNIEnv* km_env, jclass km_clazz, jint gt, jint ccontacts, jlong pdwpointerid, jlong ppoints) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmRenderGesture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)gt, (uint32_t)ccontacts, (void*)(uintptr_t)pdwpointerid, (void*)(uintptr_t)ppoints);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)gt;
    (void)ccontacts;
    (void)pdwpointerid;
    (void)ppoints;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint crefreshes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetDxFrameDuration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)crefreshes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)crefreshes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hbmp, jlong pptclient, jint dwsitflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetIconicLivePreviewBitmap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hbmp, (void*)(uintptr_t)pptclient, (uint32_t)dwsitflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hbmp;
    (void)pptclient;
    (void)dwsitflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hbmp, jint dwsitflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetIconicThumbnail");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hbmp, (uint32_t)dwsitflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hbmp;
    (void)dwsitflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ppresentparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetPresentParameters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppresentparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)ppresentparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwattribute, jlong pvattribute, jint cbattribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmSetWindowAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwattribute, (void*)(uintptr_t)pvattribute, (uint32_t)cbattribute);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)dwattribute;
    (void)pvattribute;
    (void)cbattribute;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmShowContact(JNIEnv* km_env, jclass km_clazz, jint dwpointerid, jint eshowcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmShowContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwpointerid, (uint32_t)eshowcontact);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwpointerid;
    (void)eshowcontact;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint target) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmTransitionOwnedWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)target);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)target;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(JNIEnv* km_env, jclass km_clazz, jlong hthumbnailid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmUnregisterThumbnail");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hthumbnailid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthumbnailid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_dwm_WindowsWin32GraphicsDwmJniBridge_windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(JNIEnv* km_env, jclass km_clazz, jlong hthumbnailid, jlong ptnproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dwmapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DwmUpdateThumbnailProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hthumbnailid, (void*)(uintptr_t)ptnproperties);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthumbnailid;
    (void)ptnproperties;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

