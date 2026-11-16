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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsChooseColorA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChooseColorA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsChooseColorW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChooseColorW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsChooseFontA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChooseFontA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsChooseFontW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChooseFontW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsCommDlgExtendedError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommDlgExtendedError");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsFindTextA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindTextA");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsFindTextW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindTextW");
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

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsGetFileTitleA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong buf, jshort cchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileTitleA");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)buf, (uint16_t)cchsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)buf;
    (void)cchsize;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsGetFileTitleW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong buf, jshort cchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileTitleW");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)buf, (uint16_t)cchsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)buf;
    (void)cchsize;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenFileNameA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenFileNameW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSaveFileNameA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSaveFileNameW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsPageSetupDlgA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PageSetupDlgA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsPageSetupDlgW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PageSetupDlgW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsPrintDlgA(JNIEnv* km_env, jclass km_clazz, jlong ppd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintDlgA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsPrintDlgExA(JNIEnv* km_env, jclass km_clazz, jlong ppd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintDlgExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsPrintDlgExW(JNIEnv* km_env, jclass km_clazz, jlong ppd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintDlgExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsPrintDlgW(JNIEnv* km_env, jclass km_clazz, jlong ppd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintDlgW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsReplaceTextA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplaceTextA");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_controls_dialogs_WindowsWin32UiControlsDialogsJniBridge_windowssysWindowsWin32UiControlsDialogsReplaceTextW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comdlg32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplaceTextW");
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

