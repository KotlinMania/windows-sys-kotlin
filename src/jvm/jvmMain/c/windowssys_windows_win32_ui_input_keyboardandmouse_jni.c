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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1activateKeyboardLayout(JNIEnv* km_env, jclass km_clazz, jlong hkl, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivateKeyboardLayout");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkl, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hkl;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1blockInput(JNIEnv* km_env, jclass km_clazz, jint fblockit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BlockInput");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fblockit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fblockit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1enableWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)benable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)benable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getActiveWindow(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveWindow");
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

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getAsyncKeyState(JNIEnv* km_env, jclass km_clazz, jint vkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAsyncKeyState");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)vkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vkey;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getCapture(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCapture");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getDoubleClickTime(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDoubleClickTime");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getFocus(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFocus");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKBCodePage(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKBCodePage");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyNameTextA(JNIEnv* km_env, jclass km_clazz, jint lparam, jlong lpstring, jint cchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyNameTextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lparam, (void*)(uintptr_t)lpstring, (int32_t)cchsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lparam;
    (void)lpstring;
    (void)cchsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyNameTextW(JNIEnv* km_env, jclass km_clazz, jint lparam, jlong lpstring, jint cchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyNameTextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lparam, (void*)(uintptr_t)lpstring, (int32_t)cchsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lparam;
    (void)lpstring;
    (void)cchsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyState(JNIEnv* km_env, jclass km_clazz, jint nvirtkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyState");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nvirtkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nvirtkey;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyboardLayout(JNIEnv* km_env, jclass km_clazz, jint idthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardLayout");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idthread);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)idthread;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyboardLayoutList(JNIEnv* km_env, jclass km_clazz, jint nbuff, jlong lplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardLayoutList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nbuff, (void*)(uintptr_t)lplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nbuff;
    (void)lplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyboardLayoutNameA(JNIEnv* km_env, jclass km_clazz, jlong pwszklid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardLayoutNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszklid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszklid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyboardLayoutNameW(JNIEnv* km_env, jclass km_clazz, jlong pwszklid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardLayoutNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszklid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszklid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyboardState(JNIEnv* km_env, jclass km_clazz, jlong lpkeystate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpkeystate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpkeystate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getKeyboardType(JNIEnv* km_env, jclass km_clazz, jint ntypeflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)ntypeflag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ntypeflag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getLastInputInfo(JNIEnv* km_env, jclass km_clazz, jlong plii) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLastInputInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plii);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plii;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1getMouseMovePointsEx(JNIEnv* km_env, jclass km_clazz, jint cbsize, jlong lppt, jlong lpptbuf, jint nbufpoints, jint resolution) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMouseMovePointsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cbsize, (void*)(uintptr_t)lppt, (void*)(uintptr_t)lpptbuf, (int32_t)nbufpoints, (uint32_t)resolution);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cbsize;
    (void)lppt;
    (void)lpptbuf;
    (void)nbufpoints;
    (void)resolution;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1isWindowEnabled(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindowEnabled");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1loadKeyboardLayoutA(JNIEnv* km_env, jclass km_clazz, jlong pwszklid, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadKeyboardLayoutA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszklid, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pwszklid;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1loadKeyboardLayoutW(JNIEnv* km_env, jclass km_clazz, jlong pwszklid, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadKeyboardLayoutW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszklid, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pwszklid;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1mapVirtualKeyA(JNIEnv* km_env, jclass km_clazz, jint ucode, jint umaptype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapVirtualKeyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ucode, (uint32_t)umaptype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ucode;
    (void)umaptype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1mapVirtualKeyExA(JNIEnv* km_env, jclass km_clazz, jint ucode, jint umaptype, jlong dwhkl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapVirtualKeyExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ucode, (uint32_t)umaptype, (void*)(uintptr_t)dwhkl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ucode;
    (void)umaptype;
    (void)dwhkl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1mapVirtualKeyExW(JNIEnv* km_env, jclass km_clazz, jint ucode, jint umaptype, jlong dwhkl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapVirtualKeyExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ucode, (uint32_t)umaptype, (void*)(uintptr_t)dwhkl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ucode;
    (void)umaptype;
    (void)dwhkl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1mapVirtualKeyW(JNIEnv* km_env, jclass km_clazz, jint ucode, jint umaptype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapVirtualKeyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ucode, (uint32_t)umaptype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ucode;
    (void)umaptype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1oemKeyScan(JNIEnv* km_env, jclass km_clazz, jshort woemchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemKeyScan");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)woemchar);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)woemchar;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1registerHotKey(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint id, jint fsmodifiers, jint vk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterHotKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)id, (uint32_t)fsmodifiers, (uint32_t)vk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)id;
    (void)fsmodifiers;
    (void)vk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1releaseCapture(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseCapture");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1sendInput(JNIEnv* km_env, jclass km_clazz, jint cinputs, jlong pinputs, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendInput");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cinputs, (void*)(uintptr_t)pinputs, (int32_t)cbsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cinputs;
    (void)pinputs;
    (void)cbsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1setActiveWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetActiveWindow");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1setCapture(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCapture");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1setDoubleClickTime(JNIEnv* km_env, jclass km_clazz, jint param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDoubleClickTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0);
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1setFocus(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFocus");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1setKeyboardState(JNIEnv* km_env, jclass km_clazz, jlong lpkeystate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetKeyboardState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpkeystate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpkeystate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1swapMouseButton(JNIEnv* km_env, jclass km_clazz, jint fswap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwapMouseButton");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fswap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fswap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1toAscii(JNIEnv* km_env, jclass km_clazz, jint uvirtkey, jint uscancode, jlong lpkeystate, jlong lpchar, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ToAscii");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uvirtkey, (uint32_t)uscancode, (void*)(uintptr_t)lpkeystate, (void*)(uintptr_t)lpchar, (uint32_t)uflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uvirtkey;
    (void)uscancode;
    (void)lpkeystate;
    (void)lpchar;
    (void)uflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1toAsciiEx(JNIEnv* km_env, jclass km_clazz, jint uvirtkey, jint uscancode, jlong lpkeystate, jlong lpchar, jint uflags, jlong dwhkl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ToAsciiEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uvirtkey, (uint32_t)uscancode, (void*)(uintptr_t)lpkeystate, (void*)(uintptr_t)lpchar, (uint32_t)uflags, (void*)(uintptr_t)dwhkl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uvirtkey;
    (void)uscancode;
    (void)lpkeystate;
    (void)lpchar;
    (void)uflags;
    (void)dwhkl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1toUnicode(JNIEnv* km_env, jclass km_clazz, jint wvirtkey, jint wscancode, jlong lpkeystate, jlong pwszbuff, jint cchbuff, jint wflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ToUnicode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)wvirtkey, (uint32_t)wscancode, (void*)(uintptr_t)lpkeystate, (void*)(uintptr_t)pwszbuff, (int32_t)cchbuff, (uint32_t)wflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wvirtkey;
    (void)wscancode;
    (void)lpkeystate;
    (void)pwszbuff;
    (void)cchbuff;
    (void)wflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1toUnicodeEx(JNIEnv* km_env, jclass km_clazz, jint wvirtkey, jint wscancode, jlong lpkeystate, jlong pwszbuff, jint cchbuff, jint wflags, jlong dwhkl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ToUnicodeEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)wvirtkey, (uint32_t)wscancode, (void*)(uintptr_t)lpkeystate, (void*)(uintptr_t)pwszbuff, (int32_t)cchbuff, (uint32_t)wflags, (void*)(uintptr_t)dwhkl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wvirtkey;
    (void)wscancode;
    (void)lpkeystate;
    (void)pwszbuff;
    (void)cchbuff;
    (void)wflags;
    (void)dwhkl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1trackMouseEvent(JNIEnv* km_env, jclass km_clazz, jlong lpeventtrack) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TrackMouseEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpeventtrack);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpeventtrack;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1unloadKeyboardLayout(JNIEnv* km_env, jclass km_clazz, jlong hkl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadKeyboardLayout");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1unregisterHotKey(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterHotKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1vkKeyScanA(JNIEnv* km_env, jclass km_clazz, jbyte ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VkKeyScanA");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)ch);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ch;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1vkKeyScanExA(JNIEnv* km_env, jclass km_clazz, jbyte ch, jlong dwhkl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VkKeyScanExA");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)ch, (void*)(uintptr_t)dwhkl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ch;
    (void)dwhkl;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1vkKeyScanExW(JNIEnv* km_env, jclass km_clazz, jshort ch, jlong dwhkl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VkKeyScanExW");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)ch, (void*)(uintptr_t)dwhkl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ch;
    (void)dwhkl;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1vkKeyScanW(JNIEnv* km_env, jclass km_clazz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VkKeyScanW");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)ch);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ch;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1keybdEvent(JNIEnv* km_env, jclass km_clazz, jbyte bvk, jbyte bscan, jint dwflags, jlong dwextrainfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "keybd_event");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint8_t)bvk, (uint8_t)bscan, (uint32_t)dwflags, (uint64_t)dwextrainfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bvk;
    (void)bscan;
    (void)dwflags;
    (void)dwextrainfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_keyboardandmouse_WindowsWin32UiInputKeyboardandmouseJniBridge_windowssys_1windows_1win32_1ui_1input_1keyboardandmouse_1mouseEvent(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint dx, jint dy, jint dwdata, jlong dwextrainfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mouse_event");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)dwflags, (int32_t)dx, (int32_t)dy, (int32_t)dwdata, (uint64_t)dwextrainfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwflags;
    (void)dx;
    (void)dy;
    (void)dwdata;
    (void)dwextrainfo;
    errno = ENOSYS;
#endif
}

