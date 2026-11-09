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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BeginBufferedAnimation(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdctarget, jlong prctarget, jint dwformat, jlong ppaintparams, jlong panimationparams, jlong phdcfrom, jlong phdcto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginBufferedAnimation");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdctarget, (void*)(uintptr_t)prctarget, (int32_t)dwformat, (void*)(uintptr_t)ppaintparams, (void*)(uintptr_t)panimationparams, (void*)(uintptr_t)phdcfrom, (void*)(uintptr_t)phdcto) : -1;
#else
    (void)hwnd;
    (void)hdctarget;
    (void)prctarget;
    (void)dwformat;
    (void)ppaintparams;
    (void)panimationparams;
    (void)phdcfrom;
    (void)phdcto;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BeginBufferedPaint(JNIEnv* km_env, jclass km_clazz, jlong hdctarget, jlong prctarget, jint dwformat, jlong ppaintparams, jlong phdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginBufferedPaint");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdctarget, (void*)(uintptr_t)prctarget, (int32_t)dwformat, (void*)(uintptr_t)ppaintparams, (void*)(uintptr_t)phdc) : -1;
#else
    (void)hdctarget;
    (void)prctarget;
    (void)dwformat;
    (void)ppaintparams;
    (void)phdc;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BeginPanningFeedback(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginPanningFeedback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BufferedPaintClear(JNIEnv* km_env, jclass km_clazz, jlong hbufferedpaint, jlong prc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintClear");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbufferedpaint, (void*)(uintptr_t)prc) : -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BufferedPaintInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintInit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BufferedPaintRenderAnimation(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdctarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintRenderAnimation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdctarget) : -1;
#else
    (void)hwnd;
    (void)hdctarget;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BufferedPaintSetAlpha(JNIEnv* km_env, jclass km_clazz, jlong hbufferedpaint, jlong prc, jbyte alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintSetAlpha");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbufferedpaint, (void*)(uintptr_t)prc, (uint8_t)alpha) : -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    (void)alpha;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BufferedPaintStopAllAnimations(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintStopAllAnimations");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1BufferedPaintUnInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferedPaintUnInit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CheckDlgButton(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint nidbutton, jint ucheck) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckDlgButton");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)nidbutton, (uint32_t)ucheck) : -1;
#else
    (void)hdlg;
    (void)nidbutton;
    (void)ucheck;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CheckRadioButton(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint nidfirstbutton, jint nidlastbutton, jint nidcheckbutton) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckRadioButton");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)nidfirstbutton, (int32_t)nidlastbutton, (int32_t)nidcheckbutton) : -1;
#else
    (void)hdlg;
    (void)nidfirstbutton;
    (void)nidlastbutton;
    (void)nidcheckbutton;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CloseThemeData(JNIEnv* km_env, jclass km_clazz, jlong htheme) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThemeData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme) : -1;
#else
    (void)htheme;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CreateMappedBitmap(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong idbitmap, jint wflags, jlong lpcolormap, jint inummaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMappedBitmap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (int64_t)idbitmap, (uint32_t)wflags, (void*)(uintptr_t)lpcolormap, (int32_t)inummaps) : NULL;
#else
    (void)hinstance;
    (void)idbitmap;
    (void)wflags;
    (void)lpcolormap;
    (void)inummaps;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CreatePropertySheetPageA(JNIEnv* km_env, jclass km_clazz, jlong constpropsheetpagepointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePropertySheetPageA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)constpropsheetpagepointer) : NULL;
#else
    (void)constpropsheetpagepointer;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CreatePropertySheetPageW(JNIEnv* km_env, jclass km_clazz, jlong constpropsheetpagepointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePropertySheetPageW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)constpropsheetpagepointer) : NULL;
#else
    (void)constpropsheetpagepointer;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CreateStatusWindowA(JNIEnv* km_env, jclass km_clazz, jint style, jlong lpsztext, jlong hwndparent, jint wid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStatusWindowA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)style, (void*)(uintptr_t)lpsztext, (void*)(uintptr_t)hwndparent, (uint32_t)wid) : NULL;
#else
    (void)style;
    (void)lpsztext;
    (void)hwndparent;
    (void)wid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CreateStatusWindowW(JNIEnv* km_env, jclass km_clazz, jint style, jlong lpsztext, jlong hwndparent, jint wid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStatusWindowW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)style, (void*)(uintptr_t)lpsztext, (void*)(uintptr_t)hwndparent, (uint32_t)wid) : NULL;
#else
    (void)style;
    (void)lpsztext;
    (void)hwndparent;
    (void)wid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CreateSyntheticPointerDevice(JNIEnv* km_env, jclass km_clazz, jint pointertype, jint maxcount, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSyntheticPointerDevice");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)pointertype, (uint32_t)maxcount, (int32_t)mode) : NULL;
#else
    (void)pointertype;
    (void)maxcount;
    (void)mode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CreateToolbarEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint ws, jint wid, jint nbitmaps, jlong hbminst, jlong wbmid, jlong lpbuttons, jint inumbuttons, jint dxbutton, jint dybutton, jint dxbitmap, jint dybitmap, jint ustructsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*, uint64_t, void*, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateToolbarEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)ws, (uint32_t)wid, (int32_t)nbitmaps, (void*)(uintptr_t)hbminst, (uint64_t)wbmid, (void*)(uintptr_t)lpbuttons, (int32_t)inumbuttons, (int32_t)dxbutton, (int32_t)dybutton, (int32_t)dxbitmap, (int32_t)dybitmap, (uint32_t)ustructsize) : NULL;
#else
    (void)hwnd;
    (void)ws;
    (void)wid;
    (void)nbitmaps;
    (void)hbminst;
    (void)wbmid;
    (void)lpbuttons;
    (void)inumbuttons;
    (void)dxbutton;
    (void)dybutton;
    (void)dxbitmap;
    (void)dybitmap;
    (void)ustructsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1CreateUpDownControl(JNIEnv* km_env, jclass km_clazz, jint dwstyle, jint x, jint y, jint cx, jint cy, jlong hparent, jint nid, jlong hinst, jlong hbuddy, jint nupper, jint nlower, jint npos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, void*, int32_t, void*, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUpDownControl");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwstyle, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (void*)(uintptr_t)hparent, (int32_t)nid, (void*)(uintptr_t)hinst, (void*)(uintptr_t)hbuddy, (int32_t)nupper, (int32_t)nlower, (int32_t)npos) : NULL;
#else
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)hparent;
    (void)nid;
    (void)hinst;
    (void)hbuddy;
    (void)nupper;
    (void)nlower;
    (void)npos;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1Clone(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jlong hdpanew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Clone");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (int64_t)hdpanew) : -1;
#else
    (void)hdpa;
    (void)hdpanew;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1Create(JNIEnv* km_env, jclass km_clazz, jint citemgrow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Create");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)citemgrow) : -1;
#else
    (void)citemgrow;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1CreateEx(JNIEnv* km_env, jclass km_clazz, jint cpgrow, jlong hheap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_CreateEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cpgrow, (void*)(uintptr_t)hheap) : -1;
#else
    (void)cpgrow;
    (void)hheap;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1DeleteAllPtrs(JNIEnv* km_env, jclass km_clazz, jlong hdpa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_DeleteAllPtrs");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa) : -1;
#else
    (void)hdpa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1DeletePtr(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_DeletePtr");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (int32_t)i) : NULL;
#else
    (void)hdpa;
    (void)i;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1Destroy(JNIEnv* km_env, jclass km_clazz, jlong hdpa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Destroy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa) : -1;
#else
    (void)hdpa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1DestroyCallback(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jlong pfncb, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_DestroyCallback");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)hdpa, (void*)(uintptr_t)pfncb, (void*)(uintptr_t)pdata);
#else
    (void)hdpa;
    (void)pfncb;
    (void)pdata;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1EnumCallback(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jlong pfncb, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_EnumCallback");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)hdpa, (void*)(uintptr_t)pfncb, (void*)(uintptr_t)pdata);
#else
    (void)hdpa;
    (void)pfncb;
    (void)pdata;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1GetPtr(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jlong i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_GetPtr");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (int64_t)i) : NULL;
#else
    (void)hdpa;
    (void)i;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1GetPtrIndex(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jlong p) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_GetPtrIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (void*)(uintptr_t)p) : -1;
#else
    (void)hdpa;
    (void)p;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1GetSize(JNIEnv* km_env, jclass km_clazz, jlong hdpa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_GetSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa) : 0;
#else
    (void)hdpa;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1Grow(JNIEnv* km_env, jclass km_clazz, jlong pdpa, jint cp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Grow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)pdpa, (int32_t)cp) : -1;
#else
    (void)pdpa;
    (void)cp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1InsertPtr(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jint i, jlong p) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_InsertPtr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (int32_t)i, (void*)(uintptr_t)p) : -1;
#else
    (void)hdpa;
    (void)i;
    (void)p;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1LoadStream(JNIEnv* km_env, jclass km_clazz, jlong phdpa, jlong pfn, jlong pstream, jlong pvinstdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_LoadStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phdpa, (void*)(uintptr_t)pfn, (void*)(uintptr_t)pstream, (void*)(uintptr_t)pvinstdata) : -1;
#else
    (void)phdpa;
    (void)pfn;
    (void)pstream;
    (void)pvinstdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1Merge(JNIEnv* km_env, jclass km_clazz, jlong hdpadest, jlong hdpasrc, jint dwflags, jlong pfncompare, jlong pfnmerge, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Merge");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpadest, (int64_t)hdpasrc, (uint32_t)dwflags, (void*)(uintptr_t)pfncompare, (void*)(uintptr_t)pfnmerge, (int64_t)lparam) : -1;
#else
    (void)hdpadest;
    (void)hdpasrc;
    (void)dwflags;
    (void)pfncompare;
    (void)pfnmerge;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1SaveStream(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jlong pfn, jlong pstream, jlong pvinstdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_SaveStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (void*)(uintptr_t)pfn, (void*)(uintptr_t)pstream, (void*)(uintptr_t)pvinstdata) : -1;
#else
    (void)hdpa;
    (void)pfn;
    (void)pstream;
    (void)pvinstdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1Search(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jlong pfind, jint istart, jlong pfncompare, jlong lparam, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Search");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (void*)(uintptr_t)pfind, (int32_t)istart, (void*)(uintptr_t)pfncompare, (int64_t)lparam, (uint32_t)options) : -1;
#else
    (void)hdpa;
    (void)pfind;
    (void)istart;
    (void)pfncompare;
    (void)lparam;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1SetPtr(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jint i, jlong p) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_SetPtr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (int32_t)i, (void*)(uintptr_t)p) : -1;
#else
    (void)hdpa;
    (void)i;
    (void)p;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DPA_1Sort(JNIEnv* km_env, jclass km_clazz, jlong hdpa, jlong pfncompare, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPA_Sort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdpa, (void*)(uintptr_t)pfncompare, (int64_t)lparam) : -1;
#else
    (void)hdpa;
    (void)pfncompare;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1Clone(JNIEnv* km_env, jclass km_clazz, jlong hdsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_Clone");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa) : -1;
#else
    (void)hdsa;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1Create(JNIEnv* km_env, jclass km_clazz, jint cbitem, jint citemgrow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_Create");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cbitem, (int32_t)citemgrow) : -1;
#else
    (void)cbitem;
    (void)citemgrow;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1DeleteAllItems(JNIEnv* km_env, jclass km_clazz, jlong hdsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_DeleteAllItems");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa) : -1;
#else
    (void)hdsa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1DeleteItem(JNIEnv* km_env, jclass km_clazz, jlong hdsa, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_DeleteItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa, (int32_t)i) : -1;
#else
    (void)hdsa;
    (void)i;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1Destroy(JNIEnv* km_env, jclass km_clazz, jlong hdsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_Destroy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa) : -1;
#else
    (void)hdsa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1DestroyCallback(JNIEnv* km_env, jclass km_clazz, jlong hdsa, jlong pfncb, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_DestroyCallback");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)hdsa, (void*)(uintptr_t)pfncb, (void*)(uintptr_t)pdata);
#else
    (void)hdsa;
    (void)pfncb;
    (void)pdata;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1EnumCallback(JNIEnv* km_env, jclass km_clazz, jlong hdsa, jlong pfncb, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_EnumCallback");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)hdsa, (void*)(uintptr_t)pfncb, (void*)(uintptr_t)pdata);
#else
    (void)hdsa;
    (void)pfncb;
    (void)pdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1GetItem(JNIEnv* km_env, jclass km_clazz, jlong hdsa, jint i, jlong pitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_GetItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa, (int32_t)i, (void*)(uintptr_t)pitem) : -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1GetItemPtr(JNIEnv* km_env, jclass km_clazz, jlong hdsa, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_GetItemPtr");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa, (int32_t)i) : NULL;
#else
    (void)hdsa;
    (void)i;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1GetSize(JNIEnv* km_env, jclass km_clazz, jlong hdsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_GetSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa) : 0;
#else
    (void)hdsa;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1InsertItem(JNIEnv* km_env, jclass km_clazz, jlong hdsa, jint i, jlong pitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_InsertItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa, (int32_t)i, (void*)(uintptr_t)pitem) : -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1SetItem(JNIEnv* km_env, jclass km_clazz, jlong hdsa, jint i, jlong pitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_SetItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdsa, (int32_t)i, (void*)(uintptr_t)pitem) : -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DSA_1Sort(JNIEnv* km_env, jclass km_clazz, jlong pdsa, jlong pfncompare, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSA_Sort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)pdsa, (void*)(uintptr_t)pfncompare, (int64_t)lparam) : -1;
#else
    (void)pdsa;
    (void)pfncompare;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DestroyPropertySheetPage(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPropertySheetPage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DestroySyntheticPointerDevice(JNIEnv* km_env, jclass km_clazz, jlong device) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroySyntheticPointerDevice");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)device);
#else
    (void)device;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DlgDirListA(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong lppathspec, jint nidlistbox, jint nidstaticpath, jint ufiletype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)lppathspec, (int32_t)nidlistbox, (int32_t)nidstaticpath, (uint32_t)ufiletype) : -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidlistbox;
    (void)nidstaticpath;
    (void)ufiletype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DlgDirListComboBoxA(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong lppathspec, jint nidcombobox, jint nidstaticpath, jint ufiletype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirListComboBoxA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)lppathspec, (int32_t)nidcombobox, (int32_t)nidstaticpath, (uint32_t)ufiletype) : -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidcombobox;
    (void)nidstaticpath;
    (void)ufiletype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DlgDirListComboBoxW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong lppathspec, jint nidcombobox, jint nidstaticpath, jint ufiletype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirListComboBoxW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)lppathspec, (int32_t)nidcombobox, (int32_t)nidstaticpath, (uint32_t)ufiletype) : -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidcombobox;
    (void)nidstaticpath;
    (void)ufiletype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DlgDirListW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong lppathspec, jint nidlistbox, jint nidstaticpath, jint ufiletype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)lppathspec, (int32_t)nidlistbox, (int32_t)nidstaticpath, (uint32_t)ufiletype) : -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidlistbox;
    (void)nidstaticpath;
    (void)ufiletype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DlgDirSelectComboBoxExA(JNIEnv* km_env, jclass km_clazz, jlong hwnddlg, jlong lpstring, jint cchout, jint idcombobox) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirSelectComboBoxExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnddlg, (void*)(uintptr_t)lpstring, (int32_t)cchout, (int32_t)idcombobox) : -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)cchout;
    (void)idcombobox;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DlgDirSelectComboBoxExW(JNIEnv* km_env, jclass km_clazz, jlong hwnddlg, jlong lpstring, jint cchout, jint idcombobox) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirSelectComboBoxExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnddlg, (void*)(uintptr_t)lpstring, (int32_t)cchout, (int32_t)idcombobox) : -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)cchout;
    (void)idcombobox;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DlgDirSelectExA(JNIEnv* km_env, jclass km_clazz, jlong hwnddlg, jlong lpstring, jint chcount, jint idlistbox) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirSelectExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnddlg, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)idlistbox) : -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)chcount;
    (void)idlistbox;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DlgDirSelectExW(JNIEnv* km_env, jclass km_clazz, jlong hwnddlg, jlong lpstring, jint chcount, jint idlistbox) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DlgDirSelectExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnddlg, (void*)(uintptr_t)lpstring, (int32_t)chcount, (int32_t)idlistbox) : -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)chcount;
    (void)idlistbox;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawInsert(JNIEnv* km_env, jclass km_clazz, jlong handparent, jlong hlb, jint nitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawInsert");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handparent, (void*)(uintptr_t)hlb, (int32_t)nitem);
#else
    (void)handparent;
    (void)hlb;
    (void)nitem;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawShadowText(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong psztext, jint cch, jlong prc, jint dwflags, jint crtext, jint crshadow, jint ixoffset, jint iyoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawShadowText");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)psztext, (uint32_t)cch, (void*)(uintptr_t)prc, (uint32_t)dwflags, (uint32_t)crtext, (uint32_t)crshadow, (int32_t)ixoffset, (int32_t)iyoffset) : -1;
#else
    (void)hdc;
    (void)psztext;
    (void)cch;
    (void)prc;
    (void)dwflags;
    (void)crtext;
    (void)crshadow;
    (void)ixoffset;
    (void)iyoffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawStatusTextA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc, jlong psztext, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStatusTextA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc, (void*)(uintptr_t)psztext, (uint32_t)uflags);
#else
    (void)hdc;
    (void)lprc;
    (void)psztext;
    (void)uflags;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawStatusTextW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprc, jlong psztext, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStatusTextW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprc, (void*)(uintptr_t)psztext, (uint32_t)uflags);
#else
    (void)hdc;
    (void)lprc;
    (void)psztext;
    (void)uflags;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawThemeBackground(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong prect, jlong pcliprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeBackground");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)prect, (void*)(uintptr_t)pcliprect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)pcliprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawThemeBackgroundEx(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong prect, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeBackgroundEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)prect, (void*)(uintptr_t)poptions) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawThemeEdge(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong pdestrect, jint uedge, jint uflags, jlong pcontentrect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeEdge");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)pdestrect, (uint32_t)uedge, (uint32_t)uflags, (void*)(uintptr_t)pcontentrect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pdestrect;
    (void)uedge;
    (void)uflags;
    (void)pcontentrect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawThemeIcon(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong prect, jlong himl, jint iimageindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeIcon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)prect, (int64_t)himl, (int32_t)iimageindex) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)himl;
    (void)iimageindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawThemeParentBackground(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdc, jlong prc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeParentBackground");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdc, (void*)(uintptr_t)prc) : -1;
#else
    (void)hwnd;
    (void)hdc;
    (void)prc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawThemeParentBackgroundEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdc, jint dwflags, jlong prc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeParentBackgroundEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdc, (uint32_t)dwflags, (void*)(uintptr_t)prc) : -1;
#else
    (void)hwnd;
    (void)hdc;
    (void)dwflags;
    (void)prc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawThemeText(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong psztext, jint cchtext, jint dwtextflags, jint dwtextflags2, jlong prect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeText");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)psztext, (int32_t)cchtext, (uint32_t)dwtextflags, (uint32_t)dwtextflags2, (void*)(uintptr_t)prect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchtext;
    (void)dwtextflags;
    (void)dwtextflags2;
    (void)prect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1DrawThemeTextEx(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong psztext, jint cchtext, jint dwtextflags, jlong prect, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawThemeTextEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)psztext, (int32_t)cchtext, (uint32_t)dwtextflags, (void*)(uintptr_t)prect, (void*)(uintptr_t)poptions) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchtext;
    (void)dwtextflags;
    (void)prect;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1EnableScrollBar(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wsbflags, jint warrows) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableScrollBar");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wsbflags, (uint32_t)warrows) : -1;
#else
    (void)hwnd;
    (void)wsbflags;
    (void)warrows;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1EnableThemeDialogTexture(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableThemeDialogTexture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1EnableTheming(JNIEnv* km_env, jclass km_clazz, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableTheming");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fenable) : -1;
#else
    (void)fenable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1EndBufferedAnimation(JNIEnv* km_env, jclass km_clazz, jlong hbpanimation, jint fupdatetarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndBufferedAnimation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbpanimation, (int32_t)fupdatetarget) : -1;
#else
    (void)hbpanimation;
    (void)fupdatetarget;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1EndBufferedPaint(JNIEnv* km_env, jclass km_clazz, jlong hbufferedpaint, jint fupdatetarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndBufferedPaint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbufferedpaint, (int32_t)fupdatetarget) : -1;
#else
    (void)hbufferedpaint;
    (void)fupdatetarget;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1EndPanningFeedback(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint fanimateback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPanningFeedback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)fanimateback) : -1;
#else
    (void)hwnd;
    (void)fanimateback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1EvaluateProximityToPolygon(JNIEnv* km_env, jclass km_clazz, jint numvertices, jlong controlpolygon, jlong phittestinginput, jlong pproximityeval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvaluateProximityToPolygon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)numvertices, (void*)(uintptr_t)controlpolygon, (void*)(uintptr_t)phittestinginput, (void*)(uintptr_t)pproximityeval) : -1;
#else
    (void)numvertices;
    (void)controlpolygon;
    (void)phittestinginput;
    (void)pproximityeval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1EvaluateProximityToRect(JNIEnv* km_env, jclass km_clazz, jlong controlboundingbox, jlong phittestinginput, jlong pproximityeval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvaluateProximityToRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)controlboundingbox, (void*)(uintptr_t)phittestinginput, (void*)(uintptr_t)pproximityeval) : -1;
#else
    (void)controlboundingbox;
    (void)phittestinginput;
    (void)pproximityeval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1EnableScrollBar(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_EnableScrollBar");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (uint32_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1GetScrollInfo(JNIEnv* km_env, jclass km_clazz, jlong param0, jint code, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_GetScrollInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)code, (void*)(uintptr_t)param2) : -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1GetScrollPos(JNIEnv* km_env, jclass km_clazz, jlong param0, jint code) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_GetScrollPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)code) : -1;
#else
    (void)param0;
    (void)code;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1GetScrollProp(JNIEnv* km_env, jclass km_clazz, jlong param0, jint propindex, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_GetScrollProp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)propindex, (void*)(uintptr_t)param2) : -1;
#else
    (void)param0;
    (void)propindex;
    (void)param2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1GetScrollRange(JNIEnv* km_env, jclass km_clazz, jlong param0, jint code, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_GetScrollRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)code, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3) : -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1SetScrollInfo(JNIEnv* km_env, jclass km_clazz, jlong param0, jint code, jlong psi, jint fredraw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_SetScrollInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)code, (void*)(uintptr_t)psi, (int32_t)fredraw) : -1;
#else
    (void)param0;
    (void)code;
    (void)psi;
    (void)fredraw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1SetScrollPos(JNIEnv* km_env, jclass km_clazz, jlong param0, jint code, jint pos, jint fredraw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_SetScrollPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)code, (int32_t)pos, (int32_t)fredraw) : -1;
#else
    (void)param0;
    (void)code;
    (void)pos;
    (void)fredraw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1SetScrollProp(JNIEnv* km_env, jclass km_clazz, jlong param0, jint arg_1_index, jlong newvalue, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_SetScrollProp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)arg_1_index, (int64_t)newvalue, (int32_t)param3) : -1;
#else
    (void)param0;
    (void)arg_1_index;
    (void)newvalue;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1SetScrollRange(JNIEnv* km_env, jclass km_clazz, jlong param0, jint code, jint min, jint max, jint fredraw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_SetScrollRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)code, (int32_t)min, (int32_t)max, (int32_t)fredraw) : -1;
#else
    (void)param0;
    (void)code;
    (void)min;
    (void)max;
    (void)fredraw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1FlatSB_1ShowScrollBar(JNIEnv* km_env, jclass km_clazz, jlong param0, jint code, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlatSB_ShowScrollBar");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)code, (int32_t)param2) : -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetBufferedPaintBits(JNIEnv* km_env, jclass km_clazz, jlong hbufferedpaint, jlong ppbbuffer, jlong pcxrow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBufferedPaintBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbufferedpaint, (void*)(uintptr_t)ppbbuffer, (void*)(uintptr_t)pcxrow) : -1;
#else
    (void)hbufferedpaint;
    (void)ppbbuffer;
    (void)pcxrow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetBufferedPaintDC(JNIEnv* km_env, jclass km_clazz, jlong hbufferedpaint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBufferedPaintDC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbufferedpaint) : NULL;
#else
    (void)hbufferedpaint;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetBufferedPaintTargetDC(JNIEnv* km_env, jclass km_clazz, jlong hbufferedpaint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBufferedPaintTargetDC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbufferedpaint) : NULL;
#else
    (void)hbufferedpaint;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetBufferedPaintTargetRect(JNIEnv* km_env, jclass km_clazz, jlong hbufferedpaint, jlong prc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBufferedPaintTargetRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbufferedpaint, (void*)(uintptr_t)prc) : -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetComboBoxInfo(JNIEnv* km_env, jclass km_clazz, jlong hwndcombo, jlong pcbi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComboBoxInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndcombo, (void*)(uintptr_t)pcbi) : -1;
#else
    (void)hwndcombo;
    (void)pcbi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetCurrentThemeName(JNIEnv* km_env, jclass km_clazz, jlong pszthemefilename, jint cchmaxnamechars, jlong pszcolorbuff, jint cchmaxcolorchars, jlong pszsizebuff, jint cchmaxsizechars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThemeName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszthemefilename, (int32_t)cchmaxnamechars, (void*)(uintptr_t)pszcolorbuff, (int32_t)cchmaxcolorchars, (void*)(uintptr_t)pszsizebuff, (int32_t)cchmaxsizechars) : -1;
#else
    (void)pszthemefilename;
    (void)cchmaxnamechars;
    (void)pszcolorbuff;
    (void)cchmaxcolorchars;
    (void)pszsizebuff;
    (void)cchmaxsizechars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetEffectiveClientRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprc, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEffectiveClientRect");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprc, (void*)(uintptr_t)lpinfo);
#else
    (void)hwnd;
    (void)lprc;
    (void)lpinfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetListBoxInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetListBoxInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : 0;
#else
    (void)hwnd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetMUILanguage(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMUILanguage");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeAnimationProperty(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint istoryboardid, jint itargetid, jint eproperty, jlong pvproperty, jint cbsize, jlong pcbsizeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeAnimationProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)istoryboardid, (int32_t)itargetid, (int32_t)eproperty, (void*)(uintptr_t)pvproperty, (uint32_t)cbsize, (void*)(uintptr_t)pcbsizeout) : -1;
#else
    (void)htheme;
    (void)istoryboardid;
    (void)itargetid;
    (void)eproperty;
    (void)pvproperty;
    (void)cbsize;
    (void)pcbsizeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeAnimationTransform(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint istoryboardid, jint itargetid, jint dwtransformindex, jlong ptransform, jint cbsize, jlong pcbsizeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeAnimationTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)istoryboardid, (int32_t)itargetid, (uint32_t)dwtransformindex, (void*)(uintptr_t)ptransform, (uint32_t)cbsize, (void*)(uintptr_t)pcbsizeout) : -1;
#else
    (void)htheme;
    (void)istoryboardid;
    (void)itargetid;
    (void)dwtransformindex;
    (void)ptransform;
    (void)cbsize;
    (void)pcbsizeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeAppProperties(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeAppProperties");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeBackgroundContentRect(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong pboundingrect, jlong pcontentrect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBackgroundContentRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)pboundingrect, (void*)(uintptr_t)pcontentrect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pboundingrect;
    (void)pcontentrect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeBackgroundExtent(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong pcontentrect, jlong pextentrect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBackgroundExtent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)pcontentrect, (void*)(uintptr_t)pextentrect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pcontentrect;
    (void)pextentrect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeBackgroundRegion(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong prect, jlong pregion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBackgroundRegion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)prect, (void*)(uintptr_t)pregion) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)pregion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeBitmap(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jint dwflags, jlong phbitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBitmap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (uint32_t)dwflags, (void*)(uintptr_t)phbitmap) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)dwflags;
    (void)phbitmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeBool(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong pfval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeBool");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pfval) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pfval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeColor(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong pcolor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeColor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pcolor) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pcolor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeDocumentationProperty(JNIEnv* km_env, jclass km_clazz, jlong pszthemename, jlong pszpropertyname, jlong pszvaluebuff, jint cchmaxvalchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeDocumentationProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszthemename, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)pszvaluebuff, (int32_t)cchmaxvalchars) : -1;
#else
    (void)pszthemename;
    (void)pszpropertyname;
    (void)pszvaluebuff;
    (void)cchmaxvalchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeEnumValue(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong pival) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeEnumValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pival) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeFilename(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong pszthemefilename, jint cchmaxbuffchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeFilename");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pszthemefilename, (int32_t)cchmaxbuffchars) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pszthemefilename;
    (void)cchmaxbuffchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeFont(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jint ipropid, jlong pfont) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pfont) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pfont;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeInt(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong pival) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeInt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pival) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeIntList(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong pintlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeIntList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pintlist) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pintlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeMargins(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jint ipropid, jlong prc, jlong pmargins) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeMargins");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)prc, (void*)(uintptr_t)pmargins) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)prc;
    (void)pmargins;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeMetric(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jint ipropid, jlong pival) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeMetric");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pival) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemePartSize(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong prc, jint esize, jlong psz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemePartSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)prc, (int32_t)esize, (void*)(uintptr_t)psz) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prc;
    (void)esize;
    (void)psz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemePosition(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong ppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemePosition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)ppoint) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)ppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemePropertyOrigin(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong porigin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemePropertyOrigin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)porigin) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)porigin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeRect(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong prect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)prect) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)prect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeStream(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong ppvstream, jlong pcbstream, jlong hinst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)ppvstream, (void*)(uintptr_t)pcbstream, (void*)(uintptr_t)hinst) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)ppvstream;
    (void)pcbstream;
    (void)hinst;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeString(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid, jint ipropid, jlong pszbuff, jint cchmaxbuffchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid, (int32_t)ipropid, (void*)(uintptr_t)pszbuff, (int32_t)cchmaxbuffchars) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pszbuff;
    (void)cchmaxbuffchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeSysBool(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint iboolid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysBool");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)iboolid) : -1;
#else
    (void)htheme;
    (void)iboolid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeSysColor(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint icolorid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)icolorid) : 0;
#else
    (void)htheme;
    (void)icolorid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeSysColorBrush(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint icolorid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysColorBrush");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)icolorid) : NULL;
#else
    (void)htheme;
    (void)icolorid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeSysFont(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ifontid, jlong plf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysFont");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ifontid, (void*)(uintptr_t)plf) : -1;
#else
    (void)htheme;
    (void)ifontid;
    (void)plf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeSysInt(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint iintid, jlong pivalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysInt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)iintid, (void*)(uintptr_t)pivalue) : -1;
#else
    (void)htheme;
    (void)iintid;
    (void)pivalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeSysSize(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint isizeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)isizeid) : -1;
#else
    (void)htheme;
    (void)isizeid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeSysString(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint istringid, jlong pszstringbuff, jint cchmaxstringchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeSysString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)istringid, (void*)(uintptr_t)pszstringbuff, (int32_t)cchmaxstringchars) : -1;
#else
    (void)htheme;
    (void)istringid;
    (void)pszstringbuff;
    (void)cchmaxstringchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeTextExtent(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong psztext, jint cchcharcount, jint dwtextflags, jlong pboundingrect, jlong pextentrect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeTextExtent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)psztext, (int32_t)cchcharcount, (uint32_t)dwtextflags, (void*)(uintptr_t)pboundingrect, (void*)(uintptr_t)pextentrect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchcharcount;
    (void)dwtextflags;
    (void)pboundingrect;
    (void)pextentrect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeTextMetrics(JNIEnv* km_env, jclass km_clazz, jlong htheme, jlong hdc, jint ipartid, jint istateid, jlong ptm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeTextMetrics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (void*)(uintptr_t)hdc, (int32_t)ipartid, (int32_t)istateid, (void*)(uintptr_t)ptm) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ptm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeTimingFunction(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint itimingfunctionid, jlong ptimingfunction, jint cbsize, jlong pcbsizeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeTimingFunction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)itimingfunctionid, (void*)(uintptr_t)ptimingfunction, (uint32_t)cbsize, (void*)(uintptr_t)pcbsizeout) : -1;
#else
    (void)htheme;
    (void)itimingfunctionid;
    (void)ptimingfunction;
    (void)cbsize;
    (void)pcbsizeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetThemeTransitionDuration(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateidfrom, jint istateidto, jint ipropid, jlong pdwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThemeTransitionDuration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateidfrom, (int32_t)istateidto, (int32_t)ipropid, (void*)(uintptr_t)pdwduration) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateidfrom;
    (void)istateidto;
    (void)ipropid;
    (void)pdwduration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetWindowFeedbackSetting(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint feedback, jint dwflags, jlong psize, jlong config) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowFeedbackSetting");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)feedback, (uint32_t)dwflags, (void*)(uintptr_t)psize, (void*)(uintptr_t)config) : -1;
#else
    (void)hwnd;
    (void)feedback;
    (void)dwflags;
    (void)psize;
    (void)config;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1GetWindowTheme(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTheme");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1HIMAGELIST_1QueryInterface(JNIEnv* km_env, jclass km_clazz, jlong himl, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HIMAGELIST_QueryInterface");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)himl;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Add(JNIEnv* km_env, jclass km_clazz, jlong himl, jlong hbmimage, jlong hbmmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Add");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (void*)(uintptr_t)hbmimage, (void*)(uintptr_t)hbmmask) : -1;
#else
    (void)himl;
    (void)hbmimage;
    (void)hbmmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1AddMasked(JNIEnv* km_env, jclass km_clazz, jlong himl, jlong hbmimage, jint crmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_AddMasked");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (void*)(uintptr_t)hbmimage, (uint32_t)crmask) : -1;
#else
    (void)himl;
    (void)hbmimage;
    (void)crmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1BeginDrag(JNIEnv* km_env, jclass km_clazz, jlong himltrack, jint itrack, jint dxhotspot, jint dyhotspot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_BeginDrag");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himltrack, (int32_t)itrack, (int32_t)dxhotspot, (int32_t)dyhotspot) : -1;
#else
    (void)himltrack;
    (void)itrack;
    (void)dxhotspot;
    (void)dyhotspot;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1CoCreateInstance(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong punkouter, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_CoCreateInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)punkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)rclsid;
    (void)punkouter;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Copy(JNIEnv* km_env, jclass km_clazz, jlong himldst, jint idst, jlong himlsrc, jint isrc, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Copy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himldst, (int32_t)idst, (int64_t)himlsrc, (int32_t)isrc, (uint32_t)uflags) : -1;
#else
    (void)himldst;
    (void)idst;
    (void)himlsrc;
    (void)isrc;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Create(JNIEnv* km_env, jclass km_clazz, jint cx, jint cy, jint flags, jint cinitial, jint cgrow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Create");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cx, (int32_t)cy, (uint32_t)flags, (int32_t)cinitial, (int32_t)cgrow) : -1;
#else
    (void)cx;
    (void)cy;
    (void)flags;
    (void)cinitial;
    (void)cgrow;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Destroy(JNIEnv* km_env, jclass km_clazz, jlong himl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Destroy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl) : -1;
#else
    (void)himl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1DragEnter(JNIEnv* km_env, jclass km_clazz, jlong hwndlock, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DragEnter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndlock, (int32_t)x, (int32_t)y) : -1;
#else
    (void)hwndlock;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1DragLeave(JNIEnv* km_env, jclass km_clazz, jlong hwndlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DragLeave");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndlock) : -1;
#else
    (void)hwndlock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1DragMove(JNIEnv* km_env, jclass km_clazz, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DragMove");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)x, (int32_t)y) : -1;
#else
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1DragShowNolock(JNIEnv* km_env, jclass km_clazz, jint fshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DragShowNolock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fshow) : -1;
#else
    (void)fshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Draw(JNIEnv* km_env, jclass km_clazz, jlong himl, jint i, jlong hdcdst, jint x, jint y, jint fstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Draw");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)i, (void*)(uintptr_t)hdcdst, (int32_t)x, (int32_t)y, (uint32_t)fstyle) : -1;
#else
    (void)himl;
    (void)i;
    (void)hdcdst;
    (void)x;
    (void)y;
    (void)fstyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1DrawEx(JNIEnv* km_env, jclass km_clazz, jlong himl, jint i, jlong hdcdst, jint x, jint y, jint dx, jint dy, jint rgbbk, jint rgbfg, jint fstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DrawEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)i, (void*)(uintptr_t)hdcdst, (int32_t)x, (int32_t)y, (int32_t)dx, (int32_t)dy, (uint32_t)rgbbk, (uint32_t)rgbfg, (uint32_t)fstyle) : -1;
#else
    (void)himl;
    (void)i;
    (void)hdcdst;
    (void)x;
    (void)y;
    (void)dx;
    (void)dy;
    (void)rgbbk;
    (void)rgbfg;
    (void)fstyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1DrawIndirect(JNIEnv* km_env, jclass km_clazz, jlong pimldp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_DrawIndirect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pimldp) : -1;
#else
    (void)pimldp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Duplicate(JNIEnv* km_env, jclass km_clazz, jlong himl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Duplicate");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl) : -1;
#else
    (void)himl;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1EndDrag(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_EndDrag");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1GetBkColor(JNIEnv* km_env, jclass km_clazz, jlong himl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetBkColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl) : 0;
#else
    (void)himl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1GetDragImage(JNIEnv* km_env, jclass km_clazz, jlong ppt, jlong ppthotspot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetDragImage");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppt, (void*)(uintptr_t)ppthotspot) : -1;
#else
    (void)ppt;
    (void)ppthotspot;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1GetIcon(JNIEnv* km_env, jclass km_clazz, jlong himl, jint i, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetIcon");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)i, (uint32_t)flags) : NULL;
#else
    (void)himl;
    (void)i;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1GetIconSize(JNIEnv* km_env, jclass km_clazz, jlong himl, jlong cx, jlong cy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetIconSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (void*)(uintptr_t)cx, (void*)(uintptr_t)cy) : -1;
#else
    (void)himl;
    (void)cx;
    (void)cy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1GetImageCount(JNIEnv* km_env, jclass km_clazz, jlong himl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetImageCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl) : -1;
#else
    (void)himl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1GetImageInfo(JNIEnv* km_env, jclass km_clazz, jlong himl, jint i, jlong pimageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_GetImageInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)i, (void*)(uintptr_t)pimageinfo) : -1;
#else
    (void)himl;
    (void)i;
    (void)pimageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1LoadImageA(JNIEnv* km_env, jclass km_clazz, jlong hi, jlong lpbmp, jint cx, jint cgrow, jint crmask, jint utype, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_LoadImageA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hi, (void*)(uintptr_t)lpbmp, (int32_t)cx, (int32_t)cgrow, (uint32_t)crmask, (uint32_t)utype, (uint32_t)uflags) : -1;
#else
    (void)hi;
    (void)lpbmp;
    (void)cx;
    (void)cgrow;
    (void)crmask;
    (void)utype;
    (void)uflags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1LoadImageW(JNIEnv* km_env, jclass km_clazz, jlong hi, jlong lpbmp, jint cx, jint cgrow, jint crmask, jint utype, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_LoadImageW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hi, (void*)(uintptr_t)lpbmp, (int32_t)cx, (int32_t)cgrow, (uint32_t)crmask, (uint32_t)utype, (uint32_t)uflags) : -1;
#else
    (void)hi;
    (void)lpbmp;
    (void)cx;
    (void)cgrow;
    (void)crmask;
    (void)utype;
    (void)uflags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Merge(JNIEnv* km_env, jclass km_clazz, jlong himl1, jint i1, jlong himl2, jint i2, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int32_t, int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Merge");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl1, (int32_t)i1, (int64_t)himl2, (int32_t)i2, (int32_t)dx, (int32_t)dy) : -1;
#else
    (void)himl1;
    (void)i1;
    (void)himl2;
    (void)i2;
    (void)dx;
    (void)dy;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Read(JNIEnv* km_env, jclass km_clazz, jlong pstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Read");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm) : -1;
#else
    (void)pstm;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1ReadEx(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pstm, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_ReadEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pstm, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)dwflags;
    (void)pstm;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Remove(JNIEnv* km_env, jclass km_clazz, jlong himl, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Remove");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)i) : -1;
#else
    (void)himl;
    (void)i;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Replace(JNIEnv* km_env, jclass km_clazz, jlong himl, jint i, jlong hbmimage, jlong hbmmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Replace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)i, (void*)(uintptr_t)hbmimage, (void*)(uintptr_t)hbmmask) : -1;
#else
    (void)himl;
    (void)i;
    (void)hbmimage;
    (void)hbmmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1ReplaceIcon(JNIEnv* km_env, jclass km_clazz, jlong himl, jint i, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_ReplaceIcon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)i, (void*)(uintptr_t)hicon) : -1;
#else
    (void)himl;
    (void)i;
    (void)hicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1SetBkColor(JNIEnv* km_env, jclass km_clazz, jlong himl, jint clrbk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetBkColor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (uint32_t)clrbk) : 0;
#else
    (void)himl;
    (void)clrbk;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1SetDragCursorImage(JNIEnv* km_env, jclass km_clazz, jlong himldrag, jint idrag, jint dxhotspot, jint dyhotspot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetDragCursorImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himldrag, (int32_t)idrag, (int32_t)dxhotspot, (int32_t)dyhotspot) : -1;
#else
    (void)himldrag;
    (void)idrag;
    (void)dxhotspot;
    (void)dyhotspot;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1SetIconSize(JNIEnv* km_env, jclass km_clazz, jlong himl, jint cx, jint cy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetIconSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)cx, (int32_t)cy) : -1;
#else
    (void)himl;
    (void)cx;
    (void)cy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1SetImageCount(JNIEnv* km_env, jclass km_clazz, jlong himl, jint unewcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetImageCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (uint32_t)unewcount) : -1;
#else
    (void)himl;
    (void)unewcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1SetOverlayImage(JNIEnv* km_env, jclass km_clazz, jlong himl, jint iimage, jint ioverlay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_SetOverlayImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (int32_t)iimage, (int32_t)ioverlay) : -1;
#else
    (void)himl;
    (void)iimage;
    (void)ioverlay;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1Write(JNIEnv* km_env, jclass km_clazz, jlong himl, jlong pstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_Write");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (void*)(uintptr_t)pstm) : -1;
#else
    (void)himl;
    (void)pstm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ImageList_1WriteEx(JNIEnv* km_env, jclass km_clazz, jlong himl, jint dwflags, jlong pstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageList_WriteEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)himl, (uint32_t)dwflags, (void*)(uintptr_t)pstm) : -1;
#else
    (void)himl;
    (void)dwflags;
    (void)pstm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1InitCommonControls(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitCommonControls");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1InitCommonControlsEx(JNIEnv* km_env, jclass km_clazz, jlong picce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitCommonControlsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)picce) : -1;
#else
    (void)picce;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1InitMUILanguage(JNIEnv* km_env, jclass km_clazz, jshort uilang) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitMUILanguage");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint16_t)uilang);
#else
    (void)uilang;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1InitializeFlatSB(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeFlatSB");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1IsAppThemed(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAppThemed");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1IsCharLowerW(JNIEnv* km_env, jclass km_clazz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharLowerW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1IsCompositionActive(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCompositionActive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1IsDlgButtonChecked(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint nidbutton) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDlgButtonChecked");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)nidbutton) : 0;
#else
    (void)hdlg;
    (void)nidbutton;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1IsThemeActive(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThemeActive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1IsThemeBackgroundPartiallyTransparent(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThemeBackgroundPartiallyTransparent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1IsThemeDialogTextureEnabled(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThemeDialogTextureEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1IsThemePartDefined(JNIEnv* km_env, jclass km_clazz, jlong htheme, jint ipartid, jint istateid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThemePartDefined");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)htheme, (int32_t)ipartid, (int32_t)istateid) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1LoadIconMetric(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong pszname, jint lims, jlong phico) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIconMetric");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)pszname, (int32_t)lims, (void*)(uintptr_t)phico) : -1;
#else
    (void)hinst;
    (void)pszname;
    (void)lims;
    (void)phico;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1LoadIconWithScaleDown(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong pszname, jint cx, jint cy, jlong phico) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIconWithScaleDown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)pszname, (int32_t)cx, (int32_t)cy, (void*)(uintptr_t)phico) : -1;
#else
    (void)hinst;
    (void)pszname;
    (void)cx;
    (void)cy;
    (void)phico;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1MakeDragList(JNIEnv* km_env, jclass km_clazz, jlong hlb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeDragList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlb) : -1;
#else
    (void)hlb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1MenuHelp(JNIEnv* km_env, jclass km_clazz, jint umsg, jlong wparam, jlong lparam, jlong hmainmenu, jlong hinst, jlong hwndstatus, jlong lpwids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint64_t, int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MenuHelp");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)umsg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)hmainmenu, (void*)(uintptr_t)hinst, (void*)(uintptr_t)hwndstatus, (void*)(uintptr_t)lpwids);
#else
    (void)umsg;
    (void)wparam;
    (void)lparam;
    (void)hmainmenu;
    (void)hinst;
    (void)hwndstatus;
    (void)lpwids;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1OpenThemeData(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszclasslist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThemeData");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszclasslist) : -1;
#else
    (void)hwnd;
    (void)pszclasslist;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1OpenThemeDataEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszclasslist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThemeDataEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszclasslist, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)pszclasslist;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1PackTouchHitTestingProximityEvaluation(JNIEnv* km_env, jclass km_clazz, jlong phittestinginput, jlong pproximityeval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackTouchHitTestingProximityEvaluation");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phittestinginput, (void*)(uintptr_t)pproximityeval) : -1;
#else
    (void)phittestinginput;
    (void)pproximityeval;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1PropertySheetA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertySheetA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1PropertySheetW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertySheetW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1RegisterPointerDeviceNotifications(JNIEnv* km_env, jclass km_clazz, jlong window, jint notifyrange) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPointerDeviceNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)window, (int32_t)notifyrange) : -1;
#else
    (void)window;
    (void)notifyrange;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1RegisterTouchHitTestingWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTouchHitTestingWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)value) : -1;
#else
    (void)hwnd;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1SetScrollInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nbar, jlong lpsi, jint redraw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetScrollInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nbar, (void*)(uintptr_t)lpsi, (int32_t)redraw) : -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)lpsi;
    (void)redraw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1SetScrollPos(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nbar, jint npos, jint bredraw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetScrollPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nbar, (int32_t)npos, (int32_t)bredraw) : -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)npos;
    (void)bredraw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1SetScrollRange(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nbar, jint nminpos, jint nmaxpos, jint bredraw) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetScrollRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nbar, (int32_t)nminpos, (int32_t)nmaxpos, (int32_t)bredraw) : -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)nminpos;
    (void)nmaxpos;
    (void)bredraw;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1SetThemeAppProperties(JNIEnv* km_env, jclass km_clazz, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThemeAppProperties");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwflags);
#else
    (void)dwflags;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1SetWindowFeedbackSetting(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint feedback, jint dwflags, jint size, jlong configuration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowFeedbackSetting");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)feedback, (uint32_t)dwflags, (uint32_t)size, (void*)(uintptr_t)configuration) : -1;
#else
    (void)hwnd;
    (void)feedback;
    (void)dwflags;
    (void)size;
    (void)configuration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1SetWindowTheme(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszsubappname, jlong pszsubidlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowTheme");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszsubappname, (void*)(uintptr_t)pszsubidlist) : -1;
#else
    (void)hwnd;
    (void)pszsubappname;
    (void)pszsubidlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1SetWindowThemeAttribute(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint eattribute, jlong pvattribute, jint cbattribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowThemeAttribute");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)eattribute, (void*)(uintptr_t)pvattribute, (uint32_t)cbattribute) : -1;
#else
    (void)hwnd;
    (void)eattribute;
    (void)pvattribute;
    (void)cbattribute;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ShowHideMenuCtl(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong uflags, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowHideMenuCtl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)uflags, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)hwnd;
    (void)uflags;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1ShowScrollBar(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wbar, jint bshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowScrollBar");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)wbar, (int32_t)bshow) : -1;
#else
    (void)hwnd;
    (void)wbar;
    (void)bshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1Str_1SetPtrW(JNIEnv* km_env, jclass km_clazz, jlong ppsz, jlong psz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Str_SetPtrW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppsz, (void*)(uintptr_t)psz) : -1;
#else
    (void)ppsz;
    (void)psz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1TaskDialog(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong hinstance, jlong pszwindowtitle, jlong pszmaininstruction, jlong pszcontent, jint dwcommonbuttons, jlong pszicon, jlong pnbutton) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TaskDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)pszwindowtitle, (void*)(uintptr_t)pszmaininstruction, (void*)(uintptr_t)pszcontent, (int32_t)dwcommonbuttons, (void*)(uintptr_t)pszicon, (void*)(uintptr_t)pnbutton) : -1;
#else
    (void)hwndowner;
    (void)hinstance;
    (void)pszwindowtitle;
    (void)pszmaininstruction;
    (void)pszcontent;
    (void)dwcommonbuttons;
    (void)pszicon;
    (void)pnbutton;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1TaskDialogIndirect(JNIEnv* km_env, jclass km_clazz, jlong ptaskconfig, jlong pnbutton, jlong pnradiobutton, jlong pfverificationflagchecked) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TaskDialogIndirect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptaskconfig, (void*)(uintptr_t)pnbutton, (void*)(uintptr_t)pnradiobutton, (void*)(uintptr_t)pfverificationflagchecked) : -1;
#else
    (void)ptaskconfig;
    (void)pnbutton;
    (void)pnradiobutton;
    (void)pfverificationflagchecked;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1UninitializeFlatSB(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UninitializeFlatSB");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_WindowsWin32UiControlsJniBridge_windowssys_1windows_1win32_1ui_1controls_1UpdatePanningFeedback(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint ltotaloverpanoffsetx, jint ltotaloverpanoffsety, jint fininertia) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdatePanningFeedback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)ltotaloverpanoffsetx, (int32_t)ltotaloverpanoffsety, (int32_t)fininertia) : -1;
#else
    (void)hwnd;
    (void)ltotaloverpanoffsetx;
    (void)ltotaloverpanoffsety;
    (void)fininertia;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

