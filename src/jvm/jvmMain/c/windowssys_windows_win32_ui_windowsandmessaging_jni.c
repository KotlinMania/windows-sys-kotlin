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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1AdjustWindowRect(JNIEnv* km_env, jclass km_clazz, jlong lprect, jint dwstyle, jint bmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustWindowRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprect, (uint32_t)dwstyle, (int32_t)bmenu) : -1;
#else
    (void)lprect;
    (void)dwstyle;
    (void)bmenu;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1AdjustWindowRectEx(JNIEnv* km_env, jclass km_clazz, jlong lprect, jint dwstyle, jint bmenu, jint dwexstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustWindowRectEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprect, (uint32_t)dwstyle, (int32_t)bmenu, (uint32_t)dwexstyle) : -1;
#else
    (void)lprect;
    (void)dwstyle;
    (void)bmenu;
    (void)dwexstyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1AllowSetForegroundWindow(JNIEnv* km_env, jclass km_clazz, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllowSetForegroundWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwprocessid) : -1;
#else
    (void)dwprocessid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1AnimateWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwtime, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AnimateWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwtime, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)dwtime;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1AnyPopup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AnyPopup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1AppendMenuA(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uflags, jlong uidnewitem, jlong lpnewitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppendMenuA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uflags, (uint64_t)uidnewitem, (void*)(uintptr_t)lpnewitem) : -1;
#else
    (void)hmenu;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1AppendMenuW(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uflags, jlong uidnewitem, jlong lpnewitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppendMenuW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uflags, (uint64_t)uidnewitem, (void*)(uintptr_t)lpnewitem) : -1;
#else
    (void)hmenu;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ArrangeIconicWindows(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ArrangeIconicWindows");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : 0;
#else
    (void)hwnd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1BeginDeferWindowPos(JNIEnv* km_env, jclass km_clazz, jint nnumwindows) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginDeferWindowPos");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nnumwindows) : NULL;
#else
    (void)nnumwindows;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1BringWindowToTop(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BringWindowToTop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CalculatePopupWindowPosition(JNIEnv* km_env, jclass km_clazz, jlong anchorpoint, jlong windowsize, jint flags, jlong excluderect, jlong popupwindowposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CalculatePopupWindowPosition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)anchorpoint, (void*)(uintptr_t)windowsize, (uint32_t)flags, (void*)(uintptr_t)excluderect, (void*)(uintptr_t)popupwindowposition) : -1;
#else
    (void)anchorpoint;
    (void)windowsize;
    (void)flags;
    (void)excluderect;
    (void)popupwindowposition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CallMsgFilterA(JNIEnv* km_env, jclass km_clazz, jlong lpmsg, jint ncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallMsgFilterA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg, (int32_t)ncode) : -1;
#else
    (void)lpmsg;
    (void)ncode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CallMsgFilterW(JNIEnv* km_env, jclass km_clazz, jlong lpmsg, jint ncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallMsgFilterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg, (int32_t)ncode) : -1;
#else
    (void)lpmsg;
    (void)ncode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CallNextHookEx(JNIEnv* km_env, jclass km_clazz, jlong hhk, jint ncode, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNextHookEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hhk, (int32_t)ncode, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hhk;
    (void)ncode;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CallWindowProcA(JNIEnv* km_env, jclass km_clazz, jlong lpprevwndfunc, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallWindowProcA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprevwndfunc, (void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)lpprevwndfunc;
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CallWindowProcW(JNIEnv* km_env, jclass km_clazz, jlong lpprevwndfunc, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallWindowProcW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprevwndfunc, (void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)lpprevwndfunc;
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CancelShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelShutdown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CascadeWindows(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jint whow, jlong lprect, jint ckids, jlong lpkids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CascadeWindows");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (uint32_t)whow, (void*)(uintptr_t)lprect, (uint32_t)ckids, (void*)(uintptr_t)lpkids) : 0;
#else
    (void)hwndparent;
    (void)whow;
    (void)lprect;
    (void)ckids;
    (void)lpkids;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ChangeMenuA(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint cmd, jlong lpsznewitem, jint cmdinsert, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeMenuA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)cmd, (void*)(uintptr_t)lpsznewitem, (uint32_t)cmdinsert, (uint32_t)flags) : -1;
#else
    (void)hmenu;
    (void)cmd;
    (void)lpsznewitem;
    (void)cmdinsert;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ChangeMenuW(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint cmd, jlong lpsznewitem, jint cmdinsert, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeMenuW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)cmd, (void*)(uintptr_t)lpsznewitem, (uint32_t)cmdinsert, (uint32_t)flags) : -1;
#else
    (void)hmenu;
    (void)cmd;
    (void)lpsznewitem;
    (void)cmdinsert;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ChangeWindowMessageFilter(JNIEnv* km_env, jclass km_clazz, jint message, jint dwflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeWindowMessageFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)message, (uint32_t)dwflag) : -1;
#else
    (void)message;
    (void)dwflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ChangeWindowMessageFilterEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint message, jint action, jlong pchangefilterstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeWindowMessageFilterEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)message, (uint32_t)action, (void*)(uintptr_t)pchangefilterstruct) : -1;
#else
    (void)hwnd;
    (void)message;
    (void)action;
    (void)pchangefilterstruct;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharLowerA(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharLowerA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : NULL;
#else
    (void)lpsz;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharLowerBuffA(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jint cchlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharLowerBuffA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (uint32_t)cchlength) : 0;
#else
    (void)lpsz;
    (void)cchlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharLowerBuffW(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jint cchlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharLowerBuffW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (uint32_t)cchlength) : 0;
#else
    (void)lpsz;
    (void)cchlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharLowerW(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharLowerW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : NULL;
#else
    (void)lpsz;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharNextA(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharNextA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : NULL;
#else
    (void)lpsz;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharNextExA(JNIEnv* km_env, jclass km_clazz, jshort codepage, jlong lpcurrentchar, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharNextExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)codepage, (void*)(uintptr_t)lpcurrentchar, (uint32_t)dwflags) : NULL;
#else
    (void)codepage;
    (void)lpcurrentchar;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharNextW(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharNextW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : NULL;
#else
    (void)lpsz;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharPrevA(JNIEnv* km_env, jclass km_clazz, jlong lpszstart, jlong lpszcurrent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharPrevA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszstart, (void*)(uintptr_t)lpszcurrent) : NULL;
#else
    (void)lpszstart;
    (void)lpszcurrent;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharPrevExA(JNIEnv* km_env, jclass km_clazz, jshort codepage, jlong lpstart, jlong lpcurrentchar, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharPrevExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)codepage, (void*)(uintptr_t)lpstart, (void*)(uintptr_t)lpcurrentchar, (uint32_t)dwflags) : NULL;
#else
    (void)codepage;
    (void)lpstart;
    (void)lpcurrentchar;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharPrevW(JNIEnv* km_env, jclass km_clazz, jlong lpszstart, jlong lpszcurrent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharPrevW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszstart, (void*)(uintptr_t)lpszcurrent) : NULL;
#else
    (void)lpszstart;
    (void)lpszcurrent;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharToOemA(JNIEnv* km_env, jclass km_clazz, jlong psrc, jlong pdst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharToOemA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psrc, (void*)(uintptr_t)pdst) : -1;
#else
    (void)psrc;
    (void)pdst;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharToOemBuffA(JNIEnv* km_env, jclass km_clazz, jlong lpszsrc, jlong lpszdst, jint cchdstlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharToOemBuffA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsrc, (void*)(uintptr_t)lpszdst, (uint32_t)cchdstlength) : -1;
#else
    (void)lpszsrc;
    (void)lpszdst;
    (void)cchdstlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharToOemBuffW(JNIEnv* km_env, jclass km_clazz, jlong lpszsrc, jlong lpszdst, jint cchdstlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharToOemBuffW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsrc, (void*)(uintptr_t)lpszdst, (uint32_t)cchdstlength) : -1;
#else
    (void)lpszsrc;
    (void)lpszdst;
    (void)cchdstlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharToOemW(JNIEnv* km_env, jclass km_clazz, jlong psrc, jlong pdst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharToOemW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psrc, (void*)(uintptr_t)pdst) : -1;
#else
    (void)psrc;
    (void)pdst;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharUpperA(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharUpperA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : NULL;
#else
    (void)lpsz;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharUpperBuffA(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jint cchlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharUpperBuffA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (uint32_t)cchlength) : 0;
#else
    (void)lpsz;
    (void)cchlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharUpperBuffW(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jint cchlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharUpperBuffW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (uint32_t)cchlength) : 0;
#else
    (void)lpsz;
    (void)cchlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CharUpperW(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharUpperW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : NULL;
#else
    (void)lpsz;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CheckMenuItem(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uidcheckitem, jint ucheck) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckMenuItem");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uidcheckitem, (uint32_t)ucheck) : 0;
#else
    (void)hmenu;
    (void)uidcheckitem;
    (void)ucheck;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CheckMenuRadioItem(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint first, jint last, jint check, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckMenuRadioItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)first, (uint32_t)last, (uint32_t)check, (uint32_t)flags) : -1;
#else
    (void)hmenu;
    (void)first;
    (void)last;
    (void)check;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ClipCursor(JNIEnv* km_env, jclass km_clazz, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClipCursor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprect) : -1;
#else
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CloseWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CopyAcceleratorTableA(JNIEnv* km_env, jclass km_clazz, jlong haccelsrc, jlong lpacceldst, jint caccelentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyAcceleratorTableA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)haccelsrc, (void*)(uintptr_t)lpacceldst, (int32_t)caccelentries) : -1;
#else
    (void)haccelsrc;
    (void)lpacceldst;
    (void)caccelentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CopyAcceleratorTableW(JNIEnv* km_env, jclass km_clazz, jlong haccelsrc, jlong lpacceldst, jint caccelentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyAcceleratorTableW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)haccelsrc, (void*)(uintptr_t)lpacceldst, (int32_t)caccelentries) : -1;
#else
    (void)haccelsrc;
    (void)lpacceldst;
    (void)caccelentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CopyIcon(JNIEnv* km_env, jclass km_clazz, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyIcon");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hicon) : NULL;
#else
    (void)hicon;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CopyImage(JNIEnv* km_env, jclass km_clazz, jlong h, jint type, jint cx, jint cy, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyImage");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)h, (uint32_t)type, (int32_t)cx, (int32_t)cy, (uint32_t)flags) : NULL;
#else
    (void)h;
    (void)type;
    (void)cx;
    (void)cy;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateAcceleratorTableA(JNIEnv* km_env, jclass km_clazz, jlong paccel, jint caccel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAcceleratorTableA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paccel, (int32_t)caccel) : NULL;
#else
    (void)paccel;
    (void)caccel;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateAcceleratorTableW(JNIEnv* km_env, jclass km_clazz, jlong paccel, jint caccel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAcceleratorTableW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paccel, (int32_t)caccel) : NULL;
#else
    (void)paccel;
    (void)caccel;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateCaret(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hbitmap, jint nwidth, jint nheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaret");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hbitmap, (int32_t)nwidth, (int32_t)nheight) : -1;
#else
    (void)hwnd;
    (void)hbitmap;
    (void)nwidth;
    (void)nheight;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateCursor(JNIEnv* km_env, jclass km_clazz, jlong hinst, jint xhotspot, jint yhotspot, jint nwidth, jint nheight, jlong pvandplane, jlong pvxorplane) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCursor");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (int32_t)xhotspot, (int32_t)yhotspot, (int32_t)nwidth, (int32_t)nheight, (void*)(uintptr_t)pvandplane, (void*)(uintptr_t)pvxorplane) : NULL;
#else
    (void)hinst;
    (void)xhotspot;
    (void)yhotspot;
    (void)nwidth;
    (void)nheight;
    (void)pvandplane;
    (void)pvxorplane;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateDialogIndirectParamA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lptemplate, jlong hwndparent, jlong lpdialogfunc, jlong dwinitparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDialogIndirectParamA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lptemplate, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpdialogfunc, (int64_t)dwinitparam) : NULL;
#else
    (void)hinstance;
    (void)lptemplate;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateDialogIndirectParamW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lptemplate, jlong hwndparent, jlong lpdialogfunc, jlong dwinitparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDialogIndirectParamW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lptemplate, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpdialogfunc, (int64_t)dwinitparam) : NULL;
#else
    (void)hinstance;
    (void)lptemplate;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateDialogParamA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lptemplatename, jlong hwndparent, jlong lpdialogfunc, jlong dwinitparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDialogParamA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lptemplatename, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpdialogfunc, (int64_t)dwinitparam) : NULL;
#else
    (void)hinstance;
    (void)lptemplatename;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateDialogParamW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lptemplatename, jlong hwndparent, jlong lpdialogfunc, jlong dwinitparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDialogParamW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lptemplatename, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpdialogfunc, (int64_t)dwinitparam) : NULL;
#else
    (void)hinstance;
    (void)lptemplatename;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateIcon(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jint nwidth, jint nheight, jbyte cplanes, jbyte cbitspixel, jlong lpbandbits, jlong lpbxorbits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint8_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIcon");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (int32_t)nwidth, (int32_t)nheight, (uint8_t)cplanes, (uint8_t)cbitspixel, (void*)(uintptr_t)lpbandbits, (void*)(uintptr_t)lpbxorbits) : NULL;
#else
    (void)hinstance;
    (void)nwidth;
    (void)nheight;
    (void)cplanes;
    (void)cbitspixel;
    (void)lpbandbits;
    (void)lpbxorbits;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateIconFromResource(JNIEnv* km_env, jclass km_clazz, jlong presbits, jint dwressize, jint ficon, jint dwver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIconFromResource");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)presbits, (uint32_t)dwressize, (int32_t)ficon, (uint32_t)dwver) : NULL;
#else
    (void)presbits;
    (void)dwressize;
    (void)ficon;
    (void)dwver;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateIconFromResourceEx(JNIEnv* km_env, jclass km_clazz, jlong presbits, jint dwressize, jint ficon, jint dwver, jint cxdesired, jint cydesired, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIconFromResourceEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)presbits, (uint32_t)dwressize, (int32_t)ficon, (uint32_t)dwver, (int32_t)cxdesired, (int32_t)cydesired, (uint32_t)flags) : NULL;
#else
    (void)presbits;
    (void)dwressize;
    (void)ficon;
    (void)dwver;
    (void)cxdesired;
    (void)cydesired;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateIconIndirect(JNIEnv* km_env, jclass km_clazz, jlong piconinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIconIndirect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)piconinfo) : NULL;
#else
    (void)piconinfo;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateMDIWindowA(JNIEnv* km_env, jclass km_clazz, jlong lpclassname, jlong lpwindowname, jint dwstyle, jint x, jint y, jint nwidth, jint nheight, jlong hwndparent, jlong hinstance, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMDIWindowA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpclassname, (void*)(uintptr_t)lpwindowname, (uint32_t)dwstyle, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hinstance, (int64_t)lparam) : NULL;
#else
    (void)lpclassname;
    (void)lpwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)hinstance;
    (void)lparam;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateMDIWindowW(JNIEnv* km_env, jclass km_clazz, jlong lpclassname, jlong lpwindowname, jint dwstyle, jint x, jint y, jint nwidth, jint nheight, jlong hwndparent, jlong hinstance, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMDIWindowW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpclassname, (void*)(uintptr_t)lpwindowname, (uint32_t)dwstyle, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hinstance, (int64_t)lparam) : NULL;
#else
    (void)lpclassname;
    (void)lpwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)hinstance;
    (void)lparam;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateMenu(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMenu");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreatePopupMenu(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePopupMenu");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateResourceIndexer(JNIEnv* km_env, jclass km_clazz, jlong projectroot, jlong extensiondllpath, jlong ppresourceindexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateResourceIndexer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)projectroot, (void*)(uintptr_t)extensiondllpath, (void*)(uintptr_t)ppresourceindexer) : -1;
#else
    (void)projectroot;
    (void)extensiondllpath;
    (void)ppresourceindexer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateWindowExA(JNIEnv* km_env, jclass km_clazz, jint dwexstyle, jlong lpclassname, jlong lpwindowname, jint dwstyle, jint x, jint y, jint nwidth, jint nheight, jlong hwndparent, jlong hmenu, jlong hinstance, jlong lpparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwexstyle, (void*)(uintptr_t)lpclassname, (void*)(uintptr_t)lpwindowname, (uint32_t)dwstyle, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hmenu, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpparam) : NULL;
#else
    (void)dwexstyle;
    (void)lpclassname;
    (void)lpwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)hmenu;
    (void)hinstance;
    (void)lpparam;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1CreateWindowExW(JNIEnv* km_env, jclass km_clazz, jint dwexstyle, jlong lpclassname, jlong lpwindowname, jint dwstyle, jint x, jint y, jint nwidth, jint nheight, jlong hwndparent, jlong hmenu, jlong hinstance, jlong lpparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwexstyle, (void*)(uintptr_t)lpclassname, (void*)(uintptr_t)lpwindowname, (uint32_t)dwstyle, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hmenu, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpparam) : NULL;
#else
    (void)dwexstyle;
    (void)lpclassname;
    (void)lpwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)hmenu;
    (void)hinstance;
    (void)lpparam;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DefDlgProcA(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefDlgProcA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hdlg;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DefDlgProcW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefDlgProcW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hdlg;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DefFrameProcA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hwndmdiclient, jint umsg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefFrameProcA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hwndmdiclient, (uint32_t)umsg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)hwndmdiclient;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DefFrameProcW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hwndmdiclient, jint umsg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefFrameProcW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hwndmdiclient, (uint32_t)umsg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)hwndmdiclient;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DefMDIChildProcA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint umsg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefMDIChildProcA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)umsg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DefMDIChildProcW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint umsg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefMDIChildProcW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)umsg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DefWindowProcA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefWindowProcA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DefWindowProcW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefWindowProcW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DeferWindowPos(JNIEnv* km_env, jclass km_clazz, jlong hwinposinfo, jlong hwnd, jlong hwndinsertafter, jint x, jint y, jint cx, jint cy, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeferWindowPos");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwinposinfo, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)hwndinsertafter, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (uint32_t)uflags) : NULL;
#else
    (void)hwinposinfo;
    (void)hwnd;
    (void)hwndinsertafter;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)uflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DeleteMenu(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uposition, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMenu");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uposition, (uint32_t)uflags) : -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DeregisterShellHookWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterShellHookWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DestroyAcceleratorTable(JNIEnv* km_env, jclass km_clazz, jlong haccel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyAcceleratorTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)haccel) : -1;
#else
    (void)haccel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DestroyCaret(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyCaret");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DestroyCursor(JNIEnv* km_env, jclass km_clazz, jlong hcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyCursor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcursor) : -1;
#else
    (void)hcursor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DestroyIcon(JNIEnv* km_env, jclass km_clazz, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyIcon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hicon) : -1;
#else
    (void)hicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DestroyIndexedResults(JNIEnv* km_env, jclass km_clazz, jlong resourceuri, jint qualifiercount, jlong qualifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyIndexedResults");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)resourceuri, (uint32_t)qualifiercount, (void*)(uintptr_t)qualifiers);
#else
    (void)resourceuri;
    (void)qualifiercount;
    (void)qualifiers;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DestroyMenu(JNIEnv* km_env, jclass km_clazz, jlong hmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyMenu");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu) : -1;
#else
    (void)hmenu;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DestroyResourceIndexer(JNIEnv* km_env, jclass km_clazz, jlong resourceindexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyResourceIndexer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)resourceindexer);
#else
    (void)resourceindexer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DestroyWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DialogBoxIndirectParamA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong hdialogtemplate, jlong hwndparent, jlong lpdialogfunc, jlong dwinitparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DialogBoxIndirectParamA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)hdialogtemplate, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpdialogfunc, (int64_t)dwinitparam) : -1;
#else
    (void)hinstance;
    (void)hdialogtemplate;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DialogBoxIndirectParamW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong hdialogtemplate, jlong hwndparent, jlong lpdialogfunc, jlong dwinitparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DialogBoxIndirectParamW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)hdialogtemplate, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpdialogfunc, (int64_t)dwinitparam) : -1;
#else
    (void)hinstance;
    (void)hdialogtemplate;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DialogBoxParamA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lptemplatename, jlong hwndparent, jlong lpdialogfunc, jlong dwinitparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DialogBoxParamA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lptemplatename, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpdialogfunc, (int64_t)dwinitparam) : -1;
#else
    (void)hinstance;
    (void)lptemplatename;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DialogBoxParamW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lptemplatename, jlong hwndparent, jlong lpdialogfunc, jlong dwinitparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DialogBoxParamW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lptemplatename, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpdialogfunc, (int64_t)dwinitparam) : -1;
#else
    (void)hinstance;
    (void)lptemplatename;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DisableProcessWindowsGhosting(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisableProcessWindowsGhosting");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DispatchMessageA(JNIEnv* km_env, jclass km_clazz, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispatchMessageA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg) : -1;
#else
    (void)lpmsg;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DispatchMessageW(JNIEnv* km_env, jclass km_clazz, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispatchMessageW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg) : -1;
#else
    (void)lpmsg;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DragObject(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hwndfrom, jint fmt, jlong data, jlong hcur) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragObject");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hwndfrom, (uint32_t)fmt, (uint64_t)data, (void*)(uintptr_t)hcur) : 0;
#else
    (void)hwndparent;
    (void)hwndfrom;
    (void)fmt;
    (void)data;
    (void)hcur;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DrawIcon(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint x, jint y, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawIcon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)x, (int32_t)y, (void*)(uintptr_t)hicon) : -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)hicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DrawIconEx(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint xleft, jint ytop, jlong hicon, jint cxwidth, jint cywidth, jint istepifanicur, jlong hbrflickerfreedraw, jint diflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawIconEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)xleft, (int32_t)ytop, (void*)(uintptr_t)hicon, (int32_t)cxwidth, (int32_t)cywidth, (uint32_t)istepifanicur, (void*)(uintptr_t)hbrflickerfreedraw, (uint32_t)diflags) : -1;
#else
    (void)hdc;
    (void)xleft;
    (void)ytop;
    (void)hicon;
    (void)cxwidth;
    (void)cywidth;
    (void)istepifanicur;
    (void)hbrflickerfreedraw;
    (void)diflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1DrawMenuBar(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawMenuBar");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EnableMenuItem(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uidenableitem, jint uenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableMenuItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uidenableitem, (uint32_t)uenable) : -1;
#else
    (void)hmenu;
    (void)uidenableitem;
    (void)uenable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EndDeferWindowPos(JNIEnv* km_env, jclass km_clazz, jlong hwinposinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndDeferWindowPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwinposinfo) : -1;
#else
    (void)hwinposinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EndDialog(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong nresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int64_t)nresult) : -1;
#else
    (void)hdlg;
    (void)nresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EndMenu(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndMenu");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EnumChildWindows(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumChildWindows");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam) : -1;
#else
    (void)hwndparent;
    (void)lpenumfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EnumPropsA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpenumfunc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPropsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpenumfunc) : -1;
#else
    (void)hwnd;
    (void)lpenumfunc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EnumPropsExA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPropsExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)lpenumfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EnumPropsExW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPropsExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)lpenumfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EnumPropsW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpenumfunc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPropsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpenumfunc) : -1;
#else
    (void)hwnd;
    (void)lpenumfunc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EnumThreadWindows(JNIEnv* km_env, jclass km_clazz, jint dwthreadid, jlong lpfn, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumThreadWindows");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwthreadid, (void*)(uintptr_t)lpfn, (int64_t)lparam) : -1;
#else
    (void)dwthreadid;
    (void)lpfn;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1EnumWindows(JNIEnv* km_env, jclass km_clazz, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumWindows");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenumfunc, (int64_t)lparam) : -1;
#else
    (void)lpenumfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1FindWindowA(JNIEnv* km_env, jclass km_clazz, jlong lpclassname, jlong lpwindowname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindWindowA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpclassname, (void*)(uintptr_t)lpwindowname) : NULL;
#else
    (void)lpclassname;
    (void)lpwindowname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1FindWindowExA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hwndchildafter, jlong lpszclass, jlong lpszwindow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindWindowExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hwndchildafter, (void*)(uintptr_t)lpszclass, (void*)(uintptr_t)lpszwindow) : NULL;
#else
    (void)hwndparent;
    (void)hwndchildafter;
    (void)lpszclass;
    (void)lpszwindow;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1FindWindowExW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hwndchildafter, jlong lpszclass, jlong lpszwindow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindWindowExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hwndchildafter, (void*)(uintptr_t)lpszclass, (void*)(uintptr_t)lpszwindow) : NULL;
#else
    (void)hwndparent;
    (void)hwndchildafter;
    (void)lpszclass;
    (void)lpszwindow;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1FindWindowW(JNIEnv* km_env, jclass km_clazz, jlong lpclassname, jlong lpwindowname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindWindowW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpclassname, (void*)(uintptr_t)lpwindowname) : NULL;
#else
    (void)lpclassname;
    (void)lpwindowname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1FlashWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint binvert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlashWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)binvert) : -1;
#else
    (void)hwnd;
    (void)binvert;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1FlashWindowEx(JNIEnv* km_env, jclass km_clazz, jlong pfwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlashWindowEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfwi) : -1;
#else
    (void)pfwi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetAltTabInfoA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint iitem, jlong pati, jlong pszitemtext, jint cchitemtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAltTabInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)iitem, (void*)(uintptr_t)pati, (void*)(uintptr_t)pszitemtext, (uint32_t)cchitemtext) : -1;
#else
    (void)hwnd;
    (void)iitem;
    (void)pati;
    (void)pszitemtext;
    (void)cchitemtext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetAltTabInfoW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint iitem, jlong pati, jlong pszitemtext, jint cchitemtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAltTabInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)iitem, (void*)(uintptr_t)pati, (void*)(uintptr_t)pszitemtext, (uint32_t)cchitemtext) : -1;
#else
    (void)hwnd;
    (void)iitem;
    (void)pati;
    (void)pszitemtext;
    (void)cchitemtext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetAncestor(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint gaflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAncestor");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)gaflags) : NULL;
#else
    (void)hwnd;
    (void)gaflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetCaretBlinkTime(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCaretBlinkTime");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetCaretPos(JNIEnv* km_env, jclass km_clazz, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCaretPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppoint) : -1;
#else
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassInfoA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpclassname, jlong lpwndclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpclassname, (void*)(uintptr_t)lpwndclass) : -1;
#else
    (void)hinstance;
    (void)lpclassname;
    (void)lpwndclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassInfoExA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpszclass, jlong lpwcx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassInfoExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpszclass, (void*)(uintptr_t)lpwcx) : -1;
#else
    (void)hinstance;
    (void)lpszclass;
    (void)lpwcx;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassInfoExW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpszclass, jlong lpwcx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassInfoExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpszclass, (void*)(uintptr_t)lpwcx) : -1;
#else
    (void)hinstance;
    (void)lpszclass;
    (void)lpwcx;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassInfoW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpclassname, jlong lpwndclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpclassname, (void*)(uintptr_t)lpwndclass) : -1;
#else
    (void)hinstance;
    (void)lpclassname;
    (void)lpwndclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassLongA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassLongA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : 0;
#else
    (void)hwnd;
    (void)nindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassLongPtrA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassLongPtrA");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : 0;
#else
    (void)hwnd;
    (void)nindex;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassLongPtrW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassLongPtrW");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : 0;
#else
    (void)hwnd;
    (void)nindex;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassLongW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassLongW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : 0;
#else
    (void)hwnd;
    (void)nindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassNameA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpclassname, jint nmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpclassname, (int32_t)nmaxcount) : -1;
#else
    (void)hwnd;
    (void)lpclassname;
    (void)nmaxcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassNameW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpclassname, jint nmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpclassname, (int32_t)nmaxcount) : -1;
#else
    (void)hwnd;
    (void)lpclassname;
    (void)nmaxcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClassWord(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassWord");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : 0;
#else
    (void)hwnd;
    (void)nindex;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClientRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClientRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hwnd;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetClipCursor(JNIEnv* km_env, jclass km_clazz, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipCursor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprect) : -1;
#else
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetCursor(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCursor");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetCursorInfo(JNIEnv* km_env, jclass km_clazz, jlong pci) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCursorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pci) : -1;
#else
    (void)pci;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetCursorPos(JNIEnv* km_env, jclass km_clazz, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCursorPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppoint) : -1;
#else
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetDesktopWindow(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDesktopWindow");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetDialogBaseUnits(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDialogBaseUnits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetDlgCtrlID(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgCtrlID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetDlgItem(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgItem");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem) : NULL;
#else
    (void)hdlg;
    (void)niddlgitem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetDlgItemInt(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem, jlong lptranslated, jint bsigned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgItemInt");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem, (void*)(uintptr_t)lptranslated, (int32_t)bsigned) : 0;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lptranslated;
    (void)bsigned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetDlgItemTextA(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem, jlong lpstring, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgItemTextA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem, (void*)(uintptr_t)lpstring, (int32_t)cchmax) : 0;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lpstring;
    (void)cchmax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetDlgItemTextW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem, jlong lpstring, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgItemTextW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem, (void*)(uintptr_t)lpstring, (int32_t)cchmax) : 0;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lpstring;
    (void)cchmax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetForegroundWindow(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetForegroundWindow");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetGUIThreadInfo(JNIEnv* km_env, jclass km_clazz, jint idthread, jlong pgui) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGUIThreadInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idthread, (void*)(uintptr_t)pgui) : -1;
#else
    (void)idthread;
    (void)pgui;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetIconInfo(JNIEnv* km_env, jclass km_clazz, jlong hicon, jlong piconinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIconInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hicon, (void*)(uintptr_t)piconinfo) : -1;
#else
    (void)hicon;
    (void)piconinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetIconInfoExA(JNIEnv* km_env, jclass km_clazz, jlong hicon, jlong piconinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIconInfoExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hicon, (void*)(uintptr_t)piconinfo) : -1;
#else
    (void)hicon;
    (void)piconinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetIconInfoExW(JNIEnv* km_env, jclass km_clazz, jlong hicon, jlong piconinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIconInfoExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hicon, (void*)(uintptr_t)piconinfo) : -1;
#else
    (void)hicon;
    (void)piconinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetInputState(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInputState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetLastActivePopup(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLastActivePopup");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : NULL;
#else
    (void)hwnd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetLayeredWindowAttributes(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pcrkey, jlong pbalpha, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLayeredWindowAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pcrkey, (void*)(uintptr_t)pbalpha, (void*)(uintptr_t)pdwflags) : -1;
#else
    (void)hwnd;
    (void)pcrkey;
    (void)pbalpha;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenu(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenu");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : NULL;
#else
    (void)hwnd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuBarInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint idobject, jint iditem, jlong pmbi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuBarInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)idobject, (int32_t)iditem, (void*)(uintptr_t)pmbi) : -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)iditem;
    (void)pmbi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuCheckMarkDimensions(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuCheckMarkDimensions");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuDefaultItem(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint fbypos, jint gmdiflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuDefaultItem");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)fbypos, (uint32_t)gmdiflags) : 0;
#else
    (void)hmenu;
    (void)fbypos;
    (void)gmdiflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuInfo(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuItemCount(JNIEnv* km_env, jclass km_clazz, jlong hmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu) : -1;
#else
    (void)hmenu;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuItemID(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint npos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (int32_t)npos) : 0;
#else
    (void)hmenu;
    (void)npos;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuItemInfoA(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint item, jint fbyposition, jlong lpmii) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)item, (int32_t)fbyposition, (void*)(uintptr_t)lpmii) : -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbyposition;
    (void)lpmii;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuItemInfoW(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint item, jint fbyposition, jlong lpmii) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)item, (int32_t)fbyposition, (void*)(uintptr_t)lpmii) : -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbyposition;
    (void)lpmii;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuItemRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hmenu, jint uitem, jlong lprcitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hmenu, (uint32_t)uitem, (void*)(uintptr_t)lprcitem) : -1;
#else
    (void)hwnd;
    (void)hmenu;
    (void)uitem;
    (void)lprcitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuState(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uid, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuState");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uid, (uint32_t)uflags) : 0;
#else
    (void)hmenu;
    (void)uid;
    (void)uflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuStringA(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uiditem, jlong lpstring, jint cchmax, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uiditem, (void*)(uintptr_t)lpstring, (int32_t)cchmax, (uint32_t)flags) : -1;
#else
    (void)hmenu;
    (void)uiditem;
    (void)lpstring;
    (void)cchmax;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMenuStringW(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uiditem, jlong lpstring, jint cchmax, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uiditem, (void*)(uintptr_t)lpstring, (int32_t)cchmax, (uint32_t)flags) : -1;
#else
    (void)hmenu;
    (void)uiditem;
    (void)lpstring;
    (void)cchmax;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMessageA(JNIEnv* km_env, jclass km_clazz, jlong lpmsg, jlong hwnd, jint wmsgfiltermin, jint wmsgfiltermax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg, (void*)(uintptr_t)hwnd, (uint32_t)wmsgfiltermin, (uint32_t)wmsgfiltermax) : -1;
#else
    (void)lpmsg;
    (void)hwnd;
    (void)wmsgfiltermin;
    (void)wmsgfiltermax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMessageExtraInfo(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessageExtraInfo");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMessagePos(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessagePos");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMessageTime(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessageTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetMessageW(JNIEnv* km_env, jclass km_clazz, jlong lpmsg, jlong hwnd, jint wmsgfiltermin, jint wmsgfiltermax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg, (void*)(uintptr_t)hwnd, (uint32_t)wmsgfiltermin, (uint32_t)wmsgfiltermax) : -1;
#else
    (void)lpmsg;
    (void)hwnd;
    (void)wmsgfiltermin;
    (void)wmsgfiltermax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetNextDlgGroupItem(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong hctl, jint bprevious) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNextDlgGroupItem");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)hctl, (int32_t)bprevious) : NULL;
#else
    (void)hdlg;
    (void)hctl;
    (void)bprevious;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetNextDlgTabItem(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong hctl, jint bprevious) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNextDlgTabItem");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)hctl, (int32_t)bprevious) : NULL;
#else
    (void)hdlg;
    (void)hctl;
    (void)bprevious;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetParent(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetParent");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : NULL;
#else
    (void)hwnd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetPhysicalCursorPos(JNIEnv* km_env, jclass km_clazz, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPhysicalCursorPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppoint) : -1;
#else
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetProcessDefaultLayout(JNIEnv* km_env, jclass km_clazz, jlong pdwdefaultlayout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDefaultLayout");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwdefaultlayout) : -1;
#else
    (void)pdwdefaultlayout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetPropA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPropA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring) : NULL;
#else
    (void)hwnd;
    (void)lpstring;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetPropW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPropW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring) : NULL;
#else
    (void)hwnd;
    (void)lpstring;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetQueueStatus(JNIEnv* km_env, jclass km_clazz, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetQueueStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags) : 0;
#else
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetScrollBarInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint idobject, jlong psbi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScrollBarInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)idobject, (void*)(uintptr_t)psbi) : -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)psbi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetScrollInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nbar, jlong lpsi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScrollInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nbar, (void*)(uintptr_t)lpsi) : -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)lpsi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetScrollPos(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nbar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScrollPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nbar) : -1;
#else
    (void)hwnd;
    (void)nbar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetScrollRange(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nbar, jlong lpminpos, jlong lpmaxpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScrollRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nbar, (void*)(uintptr_t)lpminpos, (void*)(uintptr_t)lpmaxpos) : -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)lpminpos;
    (void)lpmaxpos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetShellWindow(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetShellWindow");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetSubMenu(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint npos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSubMenu");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (int32_t)npos) : NULL;
#else
    (void)hmenu;
    (void)npos;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetSystemMenu(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint brevert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemMenu");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)brevert) : NULL;
#else
    (void)hwnd;
    (void)brevert;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetSystemMetrics(JNIEnv* km_env, jclass km_clazz, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemMetrics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nindex) : -1;
#else
    (void)nindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetTitleBarInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pti) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTitleBarInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pti) : -1;
#else
    (void)hwnd;
    (void)pti;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetTopWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTopWindow");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : NULL;
#else
    (void)hwnd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint ucmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindow");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)ucmd) : NULL;
#else
    (void)hwnd;
    (void)ucmd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowDisplayAffinity(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pdwaffinity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowDisplayAffinity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pdwaffinity) : -1;
#else
    (void)hwnd;
    (void)pdwaffinity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pwi) : -1;
#else
    (void)hwnd;
    (void)pwi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowLongA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowLongA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : -1;
#else
    (void)hwnd;
    (void)nindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowLongPtrA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowLongPtrA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : -1;
#else
    (void)hwnd;
    (void)nindex;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowLongPtrW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowLongPtrW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : -1;
#else
    (void)hwnd;
    (void)nindex;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowLongW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowLongW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : -1;
#else
    (void)hwnd;
    (void)nindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowModuleFileNameA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszfilename, jint cchfilenamemax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowModuleFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszfilename, (uint32_t)cchfilenamemax) : 0;
#else
    (void)hwnd;
    (void)pszfilename;
    (void)cchfilenamemax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowModuleFileNameW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszfilename, jint cchfilenamemax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowModuleFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszfilename, (uint32_t)cchfilenamemax) : 0;
#else
    (void)hwnd;
    (void)pszfilename;
    (void)cchfilenamemax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowPlacement(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpwndpl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowPlacement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpwndpl) : -1;
#else
    (void)hwnd;
    (void)lpwndpl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowRect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hwnd;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowTextA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring, jint nmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring, (int32_t)nmaxcount) : -1;
#else
    (void)hwnd;
    (void)lpstring;
    (void)nmaxcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowTextLengthA(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTextLengthA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowTextLengthW(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTextLengthW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowTextW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring, jint nmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring, (int32_t)nmaxcount) : -1;
#else
    (void)hwnd;
    (void)lpstring;
    (void)nmaxcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowThreadProcessId(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpdwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowThreadProcessId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpdwprocessid) : 0;
#else
    (void)hwnd;
    (void)lpdwprocessid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1GetWindowWord(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowWord");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex) : 0;
#else
    (void)hwnd;
    (void)nindex;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1HideCaret(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HideCaret");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1HiliteMenuItem(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hmenu, jint uidhiliteitem, jint uhilite) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HiliteMenuItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hmenu, (uint32_t)uidhiliteitem, (uint32_t)uhilite) : -1;
#else
    (void)hwnd;
    (void)hmenu;
    (void)uidhiliteitem;
    (void)uhilite;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1InSendMessage(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InSendMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1InSendMessageEx(JNIEnv* km_env, jclass km_clazz, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InSendMessageEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpreserved) : 0;
#else
    (void)lpreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IndexFilePath(JNIEnv* km_env, jclass km_clazz, jlong resourceindexer, jlong filepath, jlong ppresourceuri, jlong pqualifiercount, jlong ppqualifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IndexFilePath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)resourceindexer, (void*)(uintptr_t)filepath, (void*)(uintptr_t)ppresourceuri, (void*)(uintptr_t)pqualifiercount, (void*)(uintptr_t)ppqualifiers) : -1;
#else
    (void)resourceindexer;
    (void)filepath;
    (void)ppresourceuri;
    (void)pqualifiercount;
    (void)ppqualifiers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1InheritWindowMonitor(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hwndinherit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InheritWindowMonitor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hwndinherit) : -1;
#else
    (void)hwnd;
    (void)hwndinherit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1InsertMenuA(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uposition, jint uflags, jlong uidnewitem, jlong lpnewitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InsertMenuA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uposition, (uint32_t)uflags, (uint64_t)uidnewitem, (void*)(uintptr_t)lpnewitem) : -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1InsertMenuItemA(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint item, jint fbyposition, jlong lpmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InsertMenuItemA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)item, (int32_t)fbyposition, (void*)(uintptr_t)lpmi) : -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbyposition;
    (void)lpmi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1InsertMenuItemW(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint item, jint fbyposition, jlong lpmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InsertMenuItemW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)item, (int32_t)fbyposition, (void*)(uintptr_t)lpmi) : -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbyposition;
    (void)lpmi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1InsertMenuW(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uposition, jint uflags, jlong uidnewitem, jlong lpnewitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InsertMenuW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uposition, (uint32_t)uflags, (uint64_t)uidnewitem, (void*)(uintptr_t)lpnewitem) : -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1InternalGetWindowText(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pstring, jint cchmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternalGetWindowText");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pstring, (int32_t)cchmaxcount) : -1;
#else
    (void)hwnd;
    (void)pstring;
    (void)cchmaxcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsCharAlphaA(JNIEnv* km_env, jclass km_clazz, jbyte ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharAlphaA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int8_t)ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsCharAlphaNumericA(JNIEnv* km_env, jclass km_clazz, jbyte ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharAlphaNumericA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int8_t)ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsCharAlphaNumericW(JNIEnv* km_env, jclass km_clazz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharAlphaNumericW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsCharAlphaW(JNIEnv* km_env, jclass km_clazz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharAlphaW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsCharLowerA(JNIEnv* km_env, jclass km_clazz, jbyte ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharLowerA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int8_t)ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsCharUpperA(JNIEnv* km_env, jclass km_clazz, jbyte ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharUpperA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int8_t)ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsCharUpperW(JNIEnv* km_env, jclass km_clazz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharUpperW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsChild(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsChild");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwndparent;
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsDialogMessageA(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDialogMessageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)lpmsg) : -1;
#else
    (void)hdlg;
    (void)lpmsg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsDialogMessageW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDialogMessageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)lpmsg) : -1;
#else
    (void)hdlg;
    (void)lpmsg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsGUIThread(JNIEnv* km_env, jclass km_clazz, jint bconvert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsGUIThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)bconvert) : -1;
#else
    (void)bconvert;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsHungAppWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsHungAppWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsIconic(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsIconic");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsMenu(JNIEnv* km_env, jclass km_clazz, jlong hmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsMenu");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu) : -1;
#else
    (void)hmenu;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsProcessDPIAware(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessDPIAware");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsWindowArranged(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindowArranged");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsWindowUnicode(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindowUnicode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsWindowVisible(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindowVisible");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsWow64Message(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64Message");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1IsZoomed(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsZoomed");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1KillTimer(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong uidevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KillTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)uidevent) : -1;
#else
    (void)hwnd;
    (void)uidevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadAcceleratorsA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lptablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadAcceleratorsA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lptablename) : NULL;
#else
    (void)hinstance;
    (void)lptablename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadAcceleratorsW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lptablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadAcceleratorsW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lptablename) : NULL;
#else
    (void)hinstance;
    (void)lptablename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadCursorA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpcursorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadCursorA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpcursorname) : NULL;
#else
    (void)hinstance;
    (void)lpcursorname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadCursorFromFileA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadCursorFromFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : NULL;
#else
    (void)lpfilename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadCursorFromFileW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadCursorFromFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : NULL;
#else
    (void)lpfilename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadCursorW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpcursorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadCursorW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpcursorname) : NULL;
#else
    (void)hinstance;
    (void)lpcursorname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadIconA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpiconname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIconA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpiconname) : NULL;
#else
    (void)hinstance;
    (void)lpiconname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadIconW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpiconname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIconW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpiconname) : NULL;
#else
    (void)hinstance;
    (void)lpiconname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadImageA(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong name, jint type, jint cx, jint cy, jint fuload) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadImageA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)name, (uint32_t)type, (int32_t)cx, (int32_t)cy, (uint32_t)fuload) : NULL;
#else
    (void)hinst;
    (void)name;
    (void)type;
    (void)cx;
    (void)cy;
    (void)fuload;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadImageW(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong name, jint type, jint cx, jint cy, jint fuload) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadImageW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)name, (uint32_t)type, (int32_t)cx, (int32_t)cy, (uint32_t)fuload) : NULL;
#else
    (void)hinst;
    (void)name;
    (void)type;
    (void)cx;
    (void)cy;
    (void)fuload;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadMenuA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpmenuname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadMenuA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpmenuname) : NULL;
#else
    (void)hinstance;
    (void)lpmenuname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadMenuIndirectA(JNIEnv* km_env, jclass km_clazz, jlong lpmenutemplate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadMenuIndirectA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmenutemplate) : NULL;
#else
    (void)lpmenutemplate;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadMenuIndirectW(JNIEnv* km_env, jclass km_clazz, jlong lpmenutemplate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadMenuIndirectW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmenutemplate) : NULL;
#else
    (void)lpmenutemplate;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadMenuW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpmenuname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadMenuW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpmenuname) : NULL;
#else
    (void)hinstance;
    (void)lpmenuname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadStringA(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jint uid, jlong lpbuffer, jint cchbuffermax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (uint32_t)uid, (void*)(uintptr_t)lpbuffer, (int32_t)cchbuffermax) : -1;
#else
    (void)hinstance;
    (void)uid;
    (void)lpbuffer;
    (void)cchbuffermax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LoadStringW(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jint uid, jlong lpbuffer, jint cchbuffermax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (uint32_t)uid, (void*)(uintptr_t)lpbuffer, (int32_t)cchbuffermax) : -1;
#else
    (void)hinstance;
    (void)uid;
    (void)lpbuffer;
    (void)cchbuffermax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LockSetForegroundWindow(JNIEnv* km_env, jclass km_clazz, jint ulockcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockSetForegroundWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ulockcode) : -1;
#else
    (void)ulockcode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LogicalToPhysicalPoint(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogicalToPhysicalPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppoint) : -1;
#else
    (void)hwnd;
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LookupIconIdFromDirectory(JNIEnv* km_env, jclass km_clazz, jlong presbits, jint ficon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupIconIdFromDirectory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)presbits, (int32_t)ficon) : -1;
#else
    (void)presbits;
    (void)ficon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1LookupIconIdFromDirectoryEx(JNIEnv* km_env, jclass km_clazz, jlong presbits, jint ficon, jint cxdesired, jint cydesired, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupIconIdFromDirectoryEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)presbits, (int32_t)ficon, (int32_t)cxdesired, (int32_t)cydesired, (uint32_t)flags) : -1;
#else
    (void)presbits;
    (void)ficon;
    (void)cxdesired;
    (void)cydesired;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MapDialogRect(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong lprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapDialogRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)lprect) : -1;
#else
    (void)hdlg;
    (void)lprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MessageBoxA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lptext, jlong lpcaption, jint utype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lptext, (void*)(uintptr_t)lpcaption, (uint32_t)utype) : -1;
#else
    (void)hwnd;
    (void)lptext;
    (void)lpcaption;
    (void)utype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MessageBoxExA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lptext, jlong lpcaption, jint utype, jshort wlanguageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lptext, (void*)(uintptr_t)lpcaption, (uint32_t)utype, (uint16_t)wlanguageid) : -1;
#else
    (void)hwnd;
    (void)lptext;
    (void)lpcaption;
    (void)utype;
    (void)wlanguageid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MessageBoxExW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lptext, jlong lpcaption, jint utype, jshort wlanguageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lptext, (void*)(uintptr_t)lpcaption, (uint32_t)utype, (uint16_t)wlanguageid) : -1;
#else
    (void)hwnd;
    (void)lptext;
    (void)lpcaption;
    (void)utype;
    (void)wlanguageid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MessageBoxIndirectA(JNIEnv* km_env, jclass km_clazz, jlong lpmbp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxIndirectA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmbp) : -1;
#else
    (void)lpmbp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MessageBoxIndirectW(JNIEnv* km_env, jclass km_clazz, jlong lpmbp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxIndirectW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmbp) : -1;
#else
    (void)lpmbp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MessageBoxW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lptext, jlong lpcaption, jint utype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lptext, (void*)(uintptr_t)lpcaption, (uint32_t)utype) : -1;
#else
    (void)hwnd;
    (void)lptext;
    (void)lpcaption;
    (void)utype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ModifyMenuA(JNIEnv* km_env, jclass km_clazz, jlong hmnu, jint uposition, jint uflags, jlong uidnewitem, jlong lpnewitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyMenuA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmnu, (uint32_t)uposition, (uint32_t)uflags, (uint64_t)uidnewitem, (void*)(uintptr_t)lpnewitem) : -1;
#else
    (void)hmnu;
    (void)uposition;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ModifyMenuW(JNIEnv* km_env, jclass km_clazz, jlong hmnu, jint uposition, jint uflags, jlong uidnewitem, jlong lpnewitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyMenuW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmnu, (uint32_t)uposition, (uint32_t)uflags, (uint64_t)uidnewitem, (void*)(uintptr_t)lpnewitem) : -1;
#else
    (void)hmnu;
    (void)uposition;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MoveWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint x, jint y, jint nwidth, jint nheight, jint brepaint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight, (int32_t)brepaint) : -1;
#else
    (void)hwnd;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)brepaint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmCreateConfig(JNIEnv* km_env, jclass km_clazz, jint platformversion, jlong defaultqualifiers, jlong outputxmlfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)platformversion, (void*)(uintptr_t)defaultqualifiers, (void*)(uintptr_t)outputxmlfile) : -1;
#else
    (void)platformversion;
    (void)defaultqualifiers;
    (void)outputxmlfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmCreateConfigInMemory(JNIEnv* km_env, jclass km_clazz, jint platformversion, jlong defaultqualifiers, jlong outputxmldata, jlong outputxmlsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateConfigInMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)platformversion, (void*)(uintptr_t)defaultqualifiers, (void*)(uintptr_t)outputxmldata, (void*)(uintptr_t)outputxmlsize) : -1;
#else
    (void)platformversion;
    (void)defaultqualifiers;
    (void)outputxmldata;
    (void)outputxmlsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmCreateResourceIndexer(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong projectroot, jint platformversion, jlong defaultqualifiers, jlong indexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)projectroot, (int32_t)platformversion, (void*)(uintptr_t)defaultqualifiers, (void*)(uintptr_t)indexer) : -1;
#else
    (void)packagefamilyname;
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)indexer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmCreateResourceIndexerFromPreviousPriData(JNIEnv* km_env, jclass km_clazz, jlong projectroot, jint platformversion, jlong defaultqualifiers, jlong pridata, jint prisize, jlong indexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerFromPreviousPriData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)projectroot, (int32_t)platformversion, (void*)(uintptr_t)defaultqualifiers, (void*)(uintptr_t)pridata, (uint32_t)prisize, (void*)(uintptr_t)indexer) : -1;
#else
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)pridata;
    (void)prisize;
    (void)indexer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmCreateResourceIndexerFromPreviousPriFile(JNIEnv* km_env, jclass km_clazz, jlong projectroot, jint platformversion, jlong defaultqualifiers, jlong prifile, jlong indexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerFromPreviousPriFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)projectroot, (int32_t)platformversion, (void*)(uintptr_t)defaultqualifiers, (void*)(uintptr_t)prifile, (void*)(uintptr_t)indexer) : -1;
#else
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)prifile;
    (void)indexer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmCreateResourceIndexerFromPreviousSchemaData(JNIEnv* km_env, jclass km_clazz, jlong projectroot, jint platformversion, jlong defaultqualifiers, jlong schemaxmldata, jint schemaxmlsize, jlong indexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerFromPreviousSchemaData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)projectroot, (int32_t)platformversion, (void*)(uintptr_t)defaultqualifiers, (void*)(uintptr_t)schemaxmldata, (uint32_t)schemaxmlsize, (void*)(uintptr_t)indexer) : -1;
#else
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)schemaxmldata;
    (void)schemaxmlsize;
    (void)indexer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmCreateResourceIndexerFromPreviousSchemaFile(JNIEnv* km_env, jclass km_clazz, jlong projectroot, jint platformversion, jlong defaultqualifiers, jlong schemafile, jlong indexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerFromPreviousSchemaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)projectroot, (int32_t)platformversion, (void*)(uintptr_t)defaultqualifiers, (void*)(uintptr_t)schemafile, (void*)(uintptr_t)indexer) : -1;
#else
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)schemafile;
    (void)indexer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmCreateResourceIndexerWithFlags(JNIEnv* km_env, jclass km_clazz, jlong packagefamilyname, jlong projectroot, jint platformversion, jlong defaultqualifiers, jint flags, jlong indexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerWithFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)packagefamilyname, (void*)(uintptr_t)projectroot, (int32_t)platformversion, (void*)(uintptr_t)defaultqualifiers, (int32_t)flags, (void*)(uintptr_t)indexer) : -1;
#else
    (void)packagefamilyname;
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)flags;
    (void)indexer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmDumpPriDataInMemory(JNIEnv* km_env, jclass km_clazz, jlong inputpridata, jint inputprisize, jlong schemapridata, jint schemaprisize, jint dumptype, jlong outputxmldata, jlong outputxmlsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmDumpPriDataInMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inputpridata, (uint32_t)inputprisize, (void*)(uintptr_t)schemapridata, (uint32_t)schemaprisize, (int32_t)dumptype, (void*)(uintptr_t)outputxmldata, (void*)(uintptr_t)outputxmlsize) : -1;
#else
    (void)inputpridata;
    (void)inputprisize;
    (void)schemapridata;
    (void)schemaprisize;
    (void)dumptype;
    (void)outputxmldata;
    (void)outputxmlsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmDumpPriFile(JNIEnv* km_env, jclass km_clazz, jlong indexfilename, jlong schemaprifile, jint dumptype, jlong outputxmlfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmDumpPriFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)indexfilename, (void*)(uintptr_t)schemaprifile, (int32_t)dumptype, (void*)(uintptr_t)outputxmlfile) : -1;
#else
    (void)indexfilename;
    (void)schemaprifile;
    (void)dumptype;
    (void)outputxmlfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmDumpPriFileInMemory(JNIEnv* km_env, jclass km_clazz, jlong indexfilename, jlong schemaprifile, jint dumptype, jlong outputxmldata, jlong outputxmlsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmDumpPriFileInMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)indexfilename, (void*)(uintptr_t)schemaprifile, (int32_t)dumptype, (void*)(uintptr_t)outputxmldata, (void*)(uintptr_t)outputxmlsize) : -1;
#else
    (void)indexfilename;
    (void)schemaprifile;
    (void)dumptype;
    (void)outputxmldata;
    (void)outputxmlsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmFreeMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)data) : -1;
#else
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MrmGetPriFileContentChecksum(JNIEnv* km_env, jclass km_clazz, jlong prifile, jlong checksum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmGetPriFileContentChecksum");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prifile, (void*)(uintptr_t)checksum) : -1;
#else
    (void)prifile;
    (void)checksum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MsgWaitForMultipleObjects(JNIEnv* km_env, jclass km_clazz, jint ncount, jlong phandles, jint fwaitall, jint dwmilliseconds, jint dwwakemask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsgWaitForMultipleObjects");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ncount, (void*)(uintptr_t)phandles, (int32_t)fwaitall, (uint32_t)dwmilliseconds, (uint32_t)dwwakemask) : 0;
#else
    (void)ncount;
    (void)phandles;
    (void)fwaitall;
    (void)dwmilliseconds;
    (void)dwwakemask;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1MsgWaitForMultipleObjectsEx(JNIEnv* km_env, jclass km_clazz, jint ncount, jlong phandles, jint dwmilliseconds, jint dwwakemask, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsgWaitForMultipleObjectsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ncount, (void*)(uintptr_t)phandles, (uint32_t)dwmilliseconds, (uint32_t)dwwakemask, (uint32_t)dwflags) : 0;
#else
    (void)ncount;
    (void)phandles;
    (void)dwmilliseconds;
    (void)dwwakemask;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1OemToCharA(JNIEnv* km_env, jclass km_clazz, jlong psrc, jlong pdst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemToCharA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psrc, (void*)(uintptr_t)pdst) : -1;
#else
    (void)psrc;
    (void)pdst;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1OemToCharBuffA(JNIEnv* km_env, jclass km_clazz, jlong lpszsrc, jlong lpszdst, jint cchdstlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemToCharBuffA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsrc, (void*)(uintptr_t)lpszdst, (uint32_t)cchdstlength) : -1;
#else
    (void)lpszsrc;
    (void)lpszdst;
    (void)cchdstlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1OemToCharBuffW(JNIEnv* km_env, jclass km_clazz, jlong lpszsrc, jlong lpszdst, jint cchdstlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemToCharBuffW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsrc, (void*)(uintptr_t)lpszdst, (uint32_t)cchdstlength) : -1;
#else
    (void)lpszsrc;
    (void)lpszdst;
    (void)cchdstlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1OemToCharW(JNIEnv* km_env, jclass km_clazz, jlong psrc, jlong pdst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemToCharW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psrc, (void*)(uintptr_t)pdst) : -1;
#else
    (void)psrc;
    (void)pdst;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1OpenIcon(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenIcon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PeekMessageA(JNIEnv* km_env, jclass km_clazz, jlong lpmsg, jlong hwnd, jint wmsgfiltermin, jint wmsgfiltermax, jint wremovemsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekMessageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg, (void*)(uintptr_t)hwnd, (uint32_t)wmsgfiltermin, (uint32_t)wmsgfiltermax, (uint32_t)wremovemsg) : -1;
#else
    (void)lpmsg;
    (void)hwnd;
    (void)wmsgfiltermin;
    (void)wmsgfiltermax;
    (void)wremovemsg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PeekMessageW(JNIEnv* km_env, jclass km_clazz, jlong lpmsg, jlong hwnd, jint wmsgfiltermin, jint wmsgfiltermax, jint wremovemsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekMessageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg, (void*)(uintptr_t)hwnd, (uint32_t)wmsgfiltermin, (uint32_t)wmsgfiltermax, (uint32_t)wremovemsg) : -1;
#else
    (void)lpmsg;
    (void)hwnd;
    (void)wmsgfiltermin;
    (void)wmsgfiltermax;
    (void)wremovemsg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PhysicalToLogicalPoint(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lppoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PhysicalToLogicalPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lppoint) : -1;
#else
    (void)hwnd;
    (void)lppoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PostMessageA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostMessageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PostMessageW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostMessageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PostQuitMessage(JNIEnv* km_env, jclass km_clazz, jint nexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostQuitMessage");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)nexitcode);
#else
    (void)nexitcode;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PostThreadMessageA(JNIEnv* km_env, jclass km_clazz, jint idthread, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostThreadMessageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idthread, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)idthread;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PostThreadMessageW(JNIEnv* km_env, jclass km_clazz, jint idthread, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostThreadMessageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idthread, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)idthread;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PrivateExtractIconsA(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jint niconindex, jint cxicon, jint cyicon, jlong phicon, jlong piconid, jint nicons, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivateExtractIconsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (int32_t)niconindex, (int32_t)cxicon, (int32_t)cyicon, (void*)(uintptr_t)phicon, (void*)(uintptr_t)piconid, (uint32_t)nicons, (uint32_t)flags) : 0;
#else
    (void)szfilename;
    (void)niconindex;
    (void)cxicon;
    (void)cyicon;
    (void)phicon;
    (void)piconid;
    (void)nicons;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1PrivateExtractIconsW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jint niconindex, jint cxicon, jint cyicon, jlong phicon, jlong piconid, jint nicons, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivateExtractIconsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (int32_t)niconindex, (int32_t)cxicon, (int32_t)cyicon, (void*)(uintptr_t)phicon, (void*)(uintptr_t)piconid, (uint32_t)nicons, (uint32_t)flags) : 0;
#else
    (void)szfilename;
    (void)niconindex;
    (void)cxicon;
    (void)cyicon;
    (void)phicon;
    (void)piconid;
    (void)nicons;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RealGetWindowClassA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ptszclassname, jint cchclassnamemax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealGetWindowClassA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ptszclassname, (uint32_t)cchclassnamemax) : 0;
#else
    (void)hwnd;
    (void)ptszclassname;
    (void)cchclassnamemax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RealGetWindowClassW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ptszclassname, jint cchclassnamemax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealGetWindowClassW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ptszclassname, (uint32_t)cchclassnamemax) : 0;
#else
    (void)hwnd;
    (void)ptszclassname;
    (void)cchclassnamemax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterClassA(JNIEnv* km_env, jclass km_clazz, jlong lpwndclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClassA");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwndclass) : 0;
#else
    (void)lpwndclass;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterClassExA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClassExA");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterClassExW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClassExW");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterClassW(JNIEnv* km_env, jclass km_clazz, jlong lpwndclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClassW");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwndclass) : 0;
#else
    (void)lpwndclass;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterDeviceNotificationA(JNIEnv* km_env, jclass km_clazz, jlong hrecipient, jlong notificationfilter, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceNotificationA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrecipient, (void*)(uintptr_t)notificationfilter, (uint32_t)flags) : NULL;
#else
    (void)hrecipient;
    (void)notificationfilter;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterDeviceNotificationW(JNIEnv* km_env, jclass km_clazz, jlong hrecipient, jlong notificationfilter, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceNotificationW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrecipient, (void*)(uintptr_t)notificationfilter, (uint32_t)flags) : NULL;
#else
    (void)hrecipient;
    (void)notificationfilter;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterForTooltipDismissNotification(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint tdflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterForTooltipDismissNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)tdflags) : -1;
#else
    (void)hwnd;
    (void)tdflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterShellHookWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterShellHookWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterWindowMessageA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWindowMessageA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RegisterWindowMessageW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWindowMessageW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RemoveMenu(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uposition, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveMenu");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uposition, (uint32_t)uflags) : -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RemovePropA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePropA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring) : NULL;
#else
    (void)hwnd;
    (void)lpstring;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1RemovePropW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePropW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring) : NULL;
#else
    (void)hwnd;
    (void)lpstring;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ReplyMessage(JNIEnv* km_env, jclass km_clazz, jlong lresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplyMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)lresult) : -1;
#else
    (void)lresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ScrollDC(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint dx, jint dy, jlong lprcscroll, jlong lprcclip, jlong hrgnupdate, jlong lprcupdate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollDC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)dx, (int32_t)dy, (void*)(uintptr_t)lprcscroll, (void*)(uintptr_t)lprcclip, (void*)(uintptr_t)hrgnupdate, (void*)(uintptr_t)lprcupdate) : -1;
#else
    (void)hdc;
    (void)dx;
    (void)dy;
    (void)lprcscroll;
    (void)lprcclip;
    (void)hrgnupdate;
    (void)lprcupdate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ScrollWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint xamount, jint yamount, jlong lprect, jlong lpcliprect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)xamount, (int32_t)yamount, (void*)(uintptr_t)lprect, (void*)(uintptr_t)lpcliprect) : -1;
#else
    (void)hwnd;
    (void)xamount;
    (void)yamount;
    (void)lprect;
    (void)lpcliprect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ScrollWindowEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dx, jint dy, jlong prcscroll, jlong prcclip, jlong hrgnupdate, jlong prcupdate, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollWindowEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)dx, (int32_t)dy, (void*)(uintptr_t)prcscroll, (void*)(uintptr_t)prcclip, (void*)(uintptr_t)hrgnupdate, (void*)(uintptr_t)prcupdate, (uint32_t)flags) : -1;
#else
    (void)hwnd;
    (void)dx;
    (void)dy;
    (void)prcscroll;
    (void)prcclip;
    (void)hrgnupdate;
    (void)prcupdate;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendDlgItemMessageA(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendDlgItemMessageA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendDlgItemMessageW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendDlgItemMessageW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendMessageA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendMessageCallbackA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam, jlong lpresultcallback, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageCallbackA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)lpresultcallback, (uint64_t)dwdata) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)lpresultcallback;
    (void)dwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendMessageCallbackW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam, jlong lpresultcallback, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageCallbackW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)lpresultcallback, (uint64_t)dwdata) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)lpresultcallback;
    (void)dwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendMessageTimeoutA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam, jint fuflags, jint utimeout, jlong lpdwresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageTimeoutA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (uint32_t)fuflags, (uint32_t)utimeout, (void*)(uintptr_t)lpdwresult) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)fuflags;
    (void)utimeout;
    (void)lpdwresult;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendMessageTimeoutW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam, jint fuflags, jint utimeout, jlong lpdwresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageTimeoutW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (uint32_t)fuflags, (uint32_t)utimeout, (void*)(uintptr_t)lpdwresult) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)fuflags;
    (void)utimeout;
    (void)lpdwresult;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendMessageW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendNotifyMessageA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendNotifyMessageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SendNotifyMessageW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendNotifyMessageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetAdditionalForegroundBoostProcesses(JNIEnv* km_env, jclass km_clazz, jlong toplevelwindow, jint processhandlecount, jlong processhandlearray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAdditionalForegroundBoostProcesses");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)toplevelwindow, (uint32_t)processhandlecount, (void*)(uintptr_t)processhandlearray) : -1;
#else
    (void)toplevelwindow;
    (void)processhandlecount;
    (void)processhandlearray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetCaretBlinkTime(JNIEnv* km_env, jclass km_clazz, jint umseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCaretBlinkTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)umseconds) : -1;
#else
    (void)umseconds;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetCaretPos(JNIEnv* km_env, jclass km_clazz, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCaretPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)x, (int32_t)y) : -1;
#else
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetClassLongA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jint dwnewlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassLongA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (int32_t)dwnewlong) : 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetClassLongPtrA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jlong dwnewlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassLongPtrA");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (int64_t)dwnewlong) : 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetClassLongPtrW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jlong dwnewlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassLongPtrW");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (int64_t)dwnewlong) : 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetClassLongW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jint dwnewlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassLongW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (int32_t)dwnewlong) : 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetClassWord(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jshort wnewword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassWord");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (uint16_t)wnewword) : 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)wnewword;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetCoalescableTimer(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong nidevent, jint uelapse, jlong lptimerfunc, jint utolerancedelay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCoalescableTimer");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)nidevent, (uint32_t)uelapse, (void*)(uintptr_t)lptimerfunc, (uint32_t)utolerancedelay) : 0;
#else
    (void)hwnd;
    (void)nidevent;
    (void)uelapse;
    (void)lptimerfunc;
    (void)utolerancedelay;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetCursor(JNIEnv* km_env, jclass km_clazz, jlong hcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCursor");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcursor) : NULL;
#else
    (void)hcursor;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetCursorPos(JNIEnv* km_env, jclass km_clazz, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCursorPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)x, (int32_t)y) : -1;
#else
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetDebugErrorLevel(JNIEnv* km_env, jclass km_clazz, jint dwlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDebugErrorLevel");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwlevel);
#else
    (void)dwlevel;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetDlgItemInt(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem, jint uvalue, jint bsigned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDlgItemInt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem, (uint32_t)uvalue, (int32_t)bsigned) : -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)uvalue;
    (void)bsigned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetDlgItemTextA(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDlgItemTextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem, (void*)(uintptr_t)lpstring) : -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetDlgItemTextW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint niddlgitem, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDlgItemTextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)niddlgitem, (void*)(uintptr_t)lpstring) : -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetForegroundWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetForegroundWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetLayeredWindowAttributes(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint crkey, jbyte balpha, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLayeredWindowAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)crkey, (uint8_t)balpha, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)crkey;
    (void)balpha;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetMenu(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenu");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hmenu) : -1;
#else
    (void)hwnd;
    (void)hmenu;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetMenuDefaultItem(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uitem, jint fbypos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuDefaultItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uitem, (uint32_t)fbypos) : -1;
#else
    (void)hmenu;
    (void)uitem;
    (void)fbypos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetMenuInfo(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetMenuItemBitmaps(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uposition, jint uflags, jlong hbitmapunchecked, jlong hbitmapchecked) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuItemBitmaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uposition, (uint32_t)uflags, (void*)(uintptr_t)hbitmapunchecked, (void*)(uintptr_t)hbitmapchecked) : -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    (void)hbitmapunchecked;
    (void)hbitmapchecked;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetMenuItemInfoA(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint item, jint fbypositon, jlong lpmii) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuItemInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)item, (int32_t)fbypositon, (void*)(uintptr_t)lpmii) : -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbypositon;
    (void)lpmii;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetMenuItemInfoW(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint item, jint fbypositon, jlong lpmii) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuItemInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)item, (int32_t)fbypositon, (void*)(uintptr_t)lpmii) : -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbypositon;
    (void)lpmii;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetMessageExtraInfo(JNIEnv* km_env, jclass km_clazz, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMessageExtraInfo");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)lparam) : -1;
#else
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetMessageQueue(JNIEnv* km_env, jclass km_clazz, jint cmessagesmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMessageQueue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cmessagesmax) : -1;
#else
    (void)cmessagesmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetParent(JNIEnv* km_env, jclass km_clazz, jlong hwndchild, jlong hwndnewparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetParent");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndchild, (void*)(uintptr_t)hwndnewparent) : NULL;
#else
    (void)hwndchild;
    (void)hwndnewparent;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetPhysicalCursorPos(JNIEnv* km_env, jclass km_clazz, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPhysicalCursorPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)x, (int32_t)y) : -1;
#else
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetProcessDPIAware(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDPIAware");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetProcessDefaultLayout(JNIEnv* km_env, jclass km_clazz, jint dwdefaultlayout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDefaultLayout");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdefaultlayout) : -1;
#else
    (void)dwdefaultlayout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetPropA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring, jlong hdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPropA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring, (void*)(uintptr_t)hdata) : -1;
#else
    (void)hwnd;
    (void)lpstring;
    (void)hdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetPropW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring, jlong hdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPropW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring, (void*)(uintptr_t)hdata) : -1;
#else
    (void)hwnd;
    (void)lpstring;
    (void)hdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetSystemCursor(JNIEnv* km_env, jclass km_clazz, jlong hcur, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemCursor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcur, (uint32_t)id) : -1;
#else
    (void)hcur;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetTimer(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong nidevent, jint uelapse, jlong lptimerfunc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTimer");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)nidevent, (uint32_t)uelapse, (void*)(uintptr_t)lptimerfunc) : 0;
#else
    (void)hwnd;
    (void)nidevent;
    (void)uelapse;
    (void)lptimerfunc;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowDisplayAffinity(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwaffinity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowDisplayAffinity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwaffinity) : -1;
#else
    (void)hwnd;
    (void)dwaffinity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowLongA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jint dwnewlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowLongA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (int32_t)dwnewlong) : -1;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowLongPtrA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jlong dwnewlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowLongPtrA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (int64_t)dwnewlong) : -1;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowLongPtrW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jlong dwnewlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowLongPtrW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (int64_t)dwnewlong) : -1;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowLongW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jint dwnewlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowLongW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (int32_t)dwnewlong) : -1;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowPlacement(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpwndpl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowPlacement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpwndpl) : -1;
#else
    (void)hwnd;
    (void)lpwndpl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowPos(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hwndinsertafter, jint x, jint y, jint cx, jint cy, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hwndinsertafter, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (uint32_t)uflags) : -1;
#else
    (void)hwnd;
    (void)hwndinsertafter;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowTextA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowTextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring) : -1;
#else
    (void)hwnd;
    (void)lpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowTextW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowTextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpstring) : -1;
#else
    (void)hwnd;
    (void)lpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowWord(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint nindex, jshort wnewword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowWord");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)nindex, (uint16_t)wnewword) : 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)wnewword;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowsHookA(JNIEnv* km_env, jclass km_clazz, jint nfiltertype, jlong pfnfilterproc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowsHookA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nfiltertype, (void*)(uintptr_t)pfnfilterproc) : NULL;
#else
    (void)nfiltertype;
    (void)pfnfilterproc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowsHookExA(JNIEnv* km_env, jclass km_clazz, jint idhook, jlong lpfn, jlong hmod, jint dwthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowsHookExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)idhook, (void*)(uintptr_t)lpfn, (void*)(uintptr_t)hmod, (uint32_t)dwthreadid) : NULL;
#else
    (void)idhook;
    (void)lpfn;
    (void)hmod;
    (void)dwthreadid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowsHookExW(JNIEnv* km_env, jclass km_clazz, jint idhook, jlong lpfn, jlong hmod, jint dwthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowsHookExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)idhook, (void*)(uintptr_t)lpfn, (void*)(uintptr_t)hmod, (uint32_t)dwthreadid) : NULL;
#else
    (void)idhook;
    (void)lpfn;
    (void)hmod;
    (void)dwthreadid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SetWindowsHookW(JNIEnv* km_env, jclass km_clazz, jint nfiltertype, jlong pfnfilterproc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowsHookW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nfiltertype, (void*)(uintptr_t)pfnfilterproc) : NULL;
#else
    (void)nfiltertype;
    (void)pfnfilterproc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ShowCaret(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowCaret");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ShowCursor(JNIEnv* km_env, jclass km_clazz, jint bshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowCursor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)bshow) : -1;
#else
    (void)bshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ShowOwnedPopups(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint fshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowOwnedPopups");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)fshow) : -1;
#else
    (void)hwnd;
    (void)fshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ShowWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint ncmdshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)ncmdshow) : -1;
#else
    (void)hwnd;
    (void)ncmdshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1ShowWindowAsync(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint ncmdshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowWindowAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)ncmdshow) : -1;
#else
    (void)hwnd;
    (void)ncmdshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SoundSentry(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SoundSentry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SwitchToThisWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint funknown) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchToThisWindow");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)funknown);
#else
    (void)hwnd;
    (void)funknown;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SystemParametersInfoA(JNIEnv* km_env, jclass km_clazz, jint uiaction, jint uiparam, jlong pvparam, jint fwinini) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemParametersInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uiaction, (uint32_t)uiparam, (void*)(uintptr_t)pvparam, (uint32_t)fwinini) : -1;
#else
    (void)uiaction;
    (void)uiparam;
    (void)pvparam;
    (void)fwinini;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1SystemParametersInfoW(JNIEnv* km_env, jclass km_clazz, jint uiaction, jint uiparam, jlong pvparam, jint fwinini) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemParametersInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uiaction, (uint32_t)uiparam, (void*)(uintptr_t)pvparam, (uint32_t)fwinini) : -1;
#else
    (void)uiaction;
    (void)uiparam;
    (void)pvparam;
    (void)fwinini;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1TileWindows(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jint whow, jlong lprect, jint ckids, jlong lpkids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TileWindows");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (uint32_t)whow, (void*)(uintptr_t)lprect, (uint32_t)ckids, (void*)(uintptr_t)lpkids) : 0;
#else
    (void)hwndparent;
    (void)whow;
    (void)lprect;
    (void)ckids;
    (void)lpkids;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1TrackPopupMenu(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uflags, jint x, jint y, jint nreserved, jlong hwnd, jlong prcrect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TrackPopupMenu");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uflags, (int32_t)x, (int32_t)y, (int32_t)nreserved, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)prcrect) : -1;
#else
    (void)hmenu;
    (void)uflags;
    (void)x;
    (void)y;
    (void)nreserved;
    (void)hwnd;
    (void)prcrect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1TrackPopupMenuEx(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint uflags, jint x, jint y, jlong hwnd, jlong lptpm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TrackPopupMenuEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)uflags, (int32_t)x, (int32_t)y, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lptpm) : -1;
#else
    (void)hmenu;
    (void)uflags;
    (void)x;
    (void)y;
    (void)hwnd;
    (void)lptpm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1TranslateAcceleratorA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hacctable, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateAcceleratorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hacctable, (void*)(uintptr_t)lpmsg) : -1;
#else
    (void)hwnd;
    (void)hacctable;
    (void)lpmsg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1TranslateAcceleratorW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hacctable, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateAcceleratorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hacctable, (void*)(uintptr_t)lpmsg) : -1;
#else
    (void)hwnd;
    (void)hacctable;
    (void)lpmsg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1TranslateMDISysAccel(JNIEnv* km_env, jclass km_clazz, jlong hwndclient, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateMDISysAccel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndclient, (void*)(uintptr_t)lpmsg) : -1;
#else
    (void)hwndclient;
    (void)lpmsg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1TranslateMessage(JNIEnv* km_env, jclass km_clazz, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmsg) : -1;
#else
    (void)lpmsg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1UnhookWindowsHook(JNIEnv* km_env, jclass km_clazz, jint ncode, jlong pfnfilterproc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhookWindowsHook");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)ncode, (void*)(uintptr_t)pfnfilterproc) : -1;
#else
    (void)ncode;
    (void)pfnfilterproc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1UnhookWindowsHookEx(JNIEnv* km_env, jclass km_clazz, jlong hhk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhookWindowsHookEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hhk) : -1;
#else
    (void)hhk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1UnregisterClassA(JNIEnv* km_env, jclass km_clazz, jlong lpclassname, jlong hinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterClassA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpclassname, (void*)(uintptr_t)hinstance) : -1;
#else
    (void)lpclassname;
    (void)hinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1UnregisterClassW(JNIEnv* km_env, jclass km_clazz, jlong lpclassname, jlong hinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterClassW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpclassname, (void*)(uintptr_t)hinstance) : -1;
#else
    (void)lpclassname;
    (void)hinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1UnregisterDeviceNotification(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterDeviceNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1UpdateLayeredWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hdcdst, jlong pptdst, jlong psize, jlong hdcsrc, jlong pptsrc, jint crkey, jlong pblend, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateLayeredWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdcdst, (void*)(uintptr_t)pptdst, (void*)(uintptr_t)psize, (void*)(uintptr_t)hdcsrc, (void*)(uintptr_t)pptsrc, (uint32_t)crkey, (void*)(uintptr_t)pblend, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)hdcdst;
    (void)pptdst;
    (void)psize;
    (void)hdcsrc;
    (void)pptsrc;
    (void)crkey;
    (void)pblend;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1UpdateLayeredWindowIndirect(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pulwinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateLayeredWindowIndirect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pulwinfo) : -1;
#else
    (void)hwnd;
    (void)pulwinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1WaitMessage(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1wvsprintfA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wvsprintfA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)arglist) : -1;
#else
    (void)param0;
    (void)param1;
    (void)arglist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_windowsandmessaging_WindowsWin32UiWindowsandmessagingJniBridge_windowssys_1windows_1win32_1ui_1windowsandmessaging_1wvsprintfW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wvsprintfW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)arglist) : -1;
#else
    (void)param0;
    (void)param1;
    (void)arglist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

