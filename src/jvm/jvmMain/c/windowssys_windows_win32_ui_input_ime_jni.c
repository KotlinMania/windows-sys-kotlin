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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmAssociateContext(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmAssociateContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : NULL;
#else
    (void)param0;
    (void)param1;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmAssociateContextEx(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmAssociateContextEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmConfigureIMEA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmConfigureIMEA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmConfigureIMEW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmConfigureIMEW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmCreateContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmCreateContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmCreateIMCC(JNIEnv* km_env, jclass km_clazz, jint param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmCreateIMCC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmCreateSoftKeyboard(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jint param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmCreateSoftKeyboard");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (int32_t)param2, (int32_t)param3) : NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmDestroyContext(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDestroyContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmDestroyIMCC(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDestroyIMCC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmDestroySoftKeyboard(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDestroySoftKeyboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmDisableIME(JNIEnv* km_env, jclass km_clazz, jint param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDisableIME");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmDisableLegacyIME(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDisableLegacyIME");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmDisableTextFrameService(JNIEnv* km_env, jclass km_clazz, jint idthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDisableTextFrameService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idthread) : -1;
#else
    (void)idthread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmEnumInputContext(JNIEnv* km_env, jclass km_clazz, jint idthread, jlong lpfn, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEnumInputContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idthread, (void*)(uintptr_t)lpfn, (int64_t)lparam) : -1;
#else
    (void)idthread;
    (void)lpfn;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmEnumRegisterWordA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong lpszreading, jint param3, jlong lpszregister, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEnumRegisterWordA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)lpszreading, (uint32_t)param3, (void*)(uintptr_t)lpszregister, (void*)(uintptr_t)param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)lpszreading;
    (void)param3;
    (void)lpszregister;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmEnumRegisterWordW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong lpszreading, jint param3, jlong lpszregister, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEnumRegisterWordW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)lpszreading, (uint32_t)param3, (void*)(uintptr_t)lpszregister, (void*)(uintptr_t)param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)lpszreading;
    (void)param3;
    (void)lpszregister;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmEscapeA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEscapeA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmEscapeW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEscapeW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGenerateMessage(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGenerateMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCandidateListA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint deindex, jlong lpcandlist, jint dwbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateListA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)deindex, (void*)(uintptr_t)lpcandlist, (uint32_t)dwbuflen) : 0;
#else
    (void)param0;
    (void)deindex;
    (void)lpcandlist;
    (void)dwbuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCandidateListCountA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpdwlistcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateListCountA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpdwlistcount) : 0;
#else
    (void)param0;
    (void)lpdwlistcount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCandidateListCountW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpdwlistcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateListCountW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpdwlistcount) : 0;
#else
    (void)param0;
    (void)lpdwlistcount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCandidateListW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint deindex, jlong lpcandlist, jint dwbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateListW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)deindex, (void*)(uintptr_t)lpcandlist, (uint32_t)dwbuflen) : 0;
#else
    (void)param0;
    (void)deindex;
    (void)lpcandlist;
    (void)dwbuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCandidateWindow(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong lpcandidate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)lpcandidate) : -1;
#else
    (void)param0;
    (void)param1;
    (void)lpcandidate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCompositionFontA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lplf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionFontA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lplf) : -1;
#else
    (void)param0;
    (void)lplf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCompositionFontW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lplf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionFontW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lplf) : -1;
#else
    (void)param0;
    (void)lplf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCompositionStringA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong lpbuf, jint dwbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)lpbuf, (uint32_t)dwbuflen) : -1;
#else
    (void)param0;
    (void)param1;
    (void)lpbuf;
    (void)dwbuflen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCompositionStringW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong lpbuf, jint dwbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)lpbuf, (uint32_t)dwbuflen) : -1;
#else
    (void)param0;
    (void)param1;
    (void)lpbuf;
    (void)dwbuflen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetCompositionWindow(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpcompform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpcompform) : -1;
#else
    (void)param0;
    (void)lpcompform;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetContext(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetConversionListA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong lpsrc, jlong lpdst, jint dwbuflen, jint uflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetConversionListA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)lpsrc, (void*)(uintptr_t)lpdst, (uint32_t)dwbuflen, (uint32_t)uflag) : 0;
#else
    (void)param0;
    (void)param1;
    (void)lpsrc;
    (void)lpdst;
    (void)dwbuflen;
    (void)uflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetConversionListW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong lpsrc, jlong lpdst, jint dwbuflen, jint uflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetConversionListW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)lpsrc, (void*)(uintptr_t)lpdst, (uint32_t)dwbuflen, (uint32_t)uflag) : 0;
#else
    (void)param0;
    (void)param1;
    (void)lpsrc;
    (void)lpdst;
    (void)dwbuflen;
    (void)uflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetConversionStatus(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpfdwconversion, jlong lpfdwsentence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetConversionStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpfdwconversion, (void*)(uintptr_t)lpfdwsentence) : -1;
#else
    (void)param0;
    (void)lpfdwconversion;
    (void)lpfdwsentence;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetDefaultIMEWnd(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetDefaultIMEWnd");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetDescriptionA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpszdescription, jint ubuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetDescriptionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpszdescription, (uint32_t)ubuflen) : 0;
#else
    (void)param0;
    (void)lpszdescription;
    (void)ubuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetDescriptionW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpszdescription, jint ubuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetDescriptionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpszdescription, (uint32_t)ubuflen) : 0;
#else
    (void)param0;
    (void)lpszdescription;
    (void)ubuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetGuideLineA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint dwindex, jlong lpbuf, jint dwbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetGuideLineA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)dwindex, (void*)(uintptr_t)lpbuf, (uint32_t)dwbuflen) : 0;
#else
    (void)param0;
    (void)dwindex;
    (void)lpbuf;
    (void)dwbuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetGuideLineW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint dwindex, jlong lpbuf, jint dwbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetGuideLineW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)dwindex, (void*)(uintptr_t)lpbuf, (uint32_t)dwbuflen) : 0;
#else
    (void)param0;
    (void)dwindex;
    (void)lpbuf;
    (void)dwbuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetHotKey(JNIEnv* km_env, jclass km_clazz, jint param0, jlong lpumodifiers, jlong lpuvkey, jlong phkl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetHotKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)lpumodifiers, (void*)(uintptr_t)lpuvkey, (void*)(uintptr_t)phkl) : -1;
#else
    (void)param0;
    (void)lpumodifiers;
    (void)lpuvkey;
    (void)phkl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetIMCCLockCount(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMCCLockCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetIMCCSize(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMCCSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetIMCLockCount(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMCLockCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetIMEFileNameA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpszfilename, jint ubuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMEFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpszfilename, (uint32_t)ubuflen) : 0;
#else
    (void)param0;
    (void)lpszfilename;
    (void)ubuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetIMEFileNameW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpszfilename, jint ubuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMEFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpszfilename, (uint32_t)ubuflen) : 0;
#else
    (void)param0;
    (void)lpszfilename;
    (void)ubuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetImeMenuItemsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jlong lpimeparentmenu, jlong lpimemenu, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetImeMenuItemsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint32_t)param2, (void*)(uintptr_t)lpimeparentmenu, (void*)(uintptr_t)lpimemenu, (uint32_t)dwsize) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)lpimeparentmenu;
    (void)lpimemenu;
    (void)dwsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetImeMenuItemsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jlong lpimeparentmenu, jlong lpimemenu, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetImeMenuItemsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint32_t)param2, (void*)(uintptr_t)lpimeparentmenu, (void*)(uintptr_t)lpimemenu, (uint32_t)dwsize) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)lpimeparentmenu;
    (void)lpimemenu;
    (void)dwsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetOpenStatus(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetOpenStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetProperty(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetRegisterWordStyleA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint nitem, jlong lpstylebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetRegisterWordStyleA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)nitem, (void*)(uintptr_t)lpstylebuf) : 0;
#else
    (void)param0;
    (void)nitem;
    (void)lpstylebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetRegisterWordStyleW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint nitem, jlong lpstylebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetRegisterWordStyleW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)nitem, (void*)(uintptr_t)lpstylebuf) : 0;
#else
    (void)param0;
    (void)nitem;
    (void)lpstylebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetStatusWindowPos(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpptpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetStatusWindowPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpptpos) : -1;
#else
    (void)param0;
    (void)lpptpos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmGetVirtualKey(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetVirtualKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmInstallIMEA(JNIEnv* km_env, jclass km_clazz, jlong lpszimefilename, jlong lpszlayouttext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmInstallIMEA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszimefilename, (void*)(uintptr_t)lpszlayouttext) : NULL;
#else
    (void)lpszimefilename;
    (void)lpszlayouttext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmInstallIMEW(JNIEnv* km_env, jclass km_clazz, jlong lpszimefilename, jlong lpszlayouttext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmInstallIMEW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszimefilename, (void*)(uintptr_t)lpszlayouttext) : NULL;
#else
    (void)lpszimefilename;
    (void)lpszlayouttext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmIsIME(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmIsIME");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmIsUIMessageA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmIsUIMessageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint64_t)param2, (int64_t)param3) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmIsUIMessageW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmIsUIMessageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint64_t)param2, (int64_t)param3) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmLockIMC(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmLockIMC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmLockIMCC(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmLockIMCC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmNotifyIME(JNIEnv* km_env, jclass km_clazz, jlong param0, jint dwaction, jint dwindex, jint dwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmNotifyIME");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)dwaction, (uint32_t)dwindex, (uint32_t)dwvalue) : -1;
#else
    (void)param0;
    (void)dwaction;
    (void)dwindex;
    (void)dwvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmReSizeIMCC(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmReSizeIMCC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1) : NULL;
#else
    (void)param0;
    (void)param1;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmRegisterWordA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpszreading, jint param2, jlong lpszregister) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmRegisterWordA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpszreading, (uint32_t)param2, (void*)(uintptr_t)lpszregister) : -1;
#else
    (void)param0;
    (void)lpszreading;
    (void)param2;
    (void)lpszregister;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmRegisterWordW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpszreading, jint param2, jlong lpszregister) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmRegisterWordW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpszreading, (uint32_t)param2, (void*)(uintptr_t)lpszregister) : -1;
#else
    (void)param0;
    (void)lpszreading;
    (void)param2;
    (void)lpszregister;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmReleaseContext(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmReleaseContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmRequestMessageA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmRequestMessageA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint64_t)param1, (int64_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmRequestMessageW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmRequestMessageW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint64_t)param1, (int64_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetCandidateWindow(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpcandidate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCandidateWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpcandidate) : -1;
#else
    (void)param0;
    (void)lpcandidate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetCompositionFontA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lplf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionFontA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lplf) : -1;
#else
    (void)param0;
    (void)lplf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetCompositionFontW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lplf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionFontW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lplf) : -1;
#else
    (void)param0;
    (void)lplf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetCompositionStringA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint dwindex, jlong lpcomp, jint dwcomplen, jlong lpread, jint dwreadlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)dwindex, (void*)(uintptr_t)lpcomp, (uint32_t)dwcomplen, (void*)(uintptr_t)lpread, (uint32_t)dwreadlen) : -1;
#else
    (void)param0;
    (void)dwindex;
    (void)lpcomp;
    (void)dwcomplen;
    (void)lpread;
    (void)dwreadlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetCompositionStringW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint dwindex, jlong lpcomp, jint dwcomplen, jlong lpread, jint dwreadlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)dwindex, (void*)(uintptr_t)lpcomp, (uint32_t)dwcomplen, (void*)(uintptr_t)lpread, (uint32_t)dwreadlen) : -1;
#else
    (void)param0;
    (void)dwindex;
    (void)lpcomp;
    (void)dwcomplen;
    (void)lpread;
    (void)dwreadlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetCompositionWindow(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpcompform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpcompform) : -1;
#else
    (void)param0;
    (void)lpcompform;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetConversionStatus(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetConversionStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint32_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetHotKey(JNIEnv* km_env, jclass km_clazz, jint param0, jint param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetHotKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (uint32_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetOpenStatus(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetOpenStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSetStatusWindowPos(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpptpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetStatusWindowPos");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpptpos) : -1;
#else
    (void)param0;
    (void)lpptpos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmShowSoftKeyboard(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmShowSoftKeyboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmSimulateHotKey(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSimulateHotKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmUnlockIMC(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmUnlockIMC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmUnlockIMCC(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmUnlockIMCC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmUnregisterWordA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpszreading, jint param2, jlong lpszunregister) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmUnregisterWordA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpszreading, (uint32_t)param2, (void*)(uintptr_t)lpszunregister) : -1;
#else
    (void)param0;
    (void)lpszreading;
    (void)param2;
    (void)lpszunregister;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_ime_WindowsWin32UiInputImeJniBridge_windowssys_1windows_1win32_1ui_1input_1ime_1ImmUnregisterWordW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong lpszreading, jint param2, jlong lpszunregister) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmUnregisterWordW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)lpszreading, (uint32_t)param2, (void*)(uintptr_t)lpszunregister) : -1;
#else
    (void)param0;
    (void)lpszreading;
    (void)param2;
    (void)lpszunregister;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

