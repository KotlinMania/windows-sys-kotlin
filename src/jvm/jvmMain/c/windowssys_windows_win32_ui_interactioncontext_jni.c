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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint pointerid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPointerInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)pointerid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)pointerid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint entriescount, jlong pointerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferPointerPacketsInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)entriescount, (void*)(uintptr_t)pointerinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)entriescount;
    (void)pointerinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextCreateInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint threshold, jlong distance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCrossSlideParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)threshold, (void*)(uintptr_t)distance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)threshold;
    (void)distance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHoldParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint inertiaparameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInertiaParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)inertiaparameter, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)inertiaparameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint configurationcount, jlong configuration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInteractionConfigurationInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)configurationcount, (void*)(uintptr_t)configuration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)configurationcount;
    (void)configuration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMouseWheelParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint contextproperty, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPropertyInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)contextproperty, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)contextproperty;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jlong pointerinfo, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStateInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (void*)(uintptr_t)pointerinfo, (void*)(uintptr_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)pointerinfo;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTranslationParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessBufferedPacketsInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessInertiaInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint entriescount, jint pointercount, jlong pointerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessPointerFramesInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)entriescount, (uint32_t)pointercount, (void*)(uintptr_t)pointerinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)entriescount;
    (void)pointercount;
    (void)pointerinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jlong outputcallback, jlong clientdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterOutputCallbackInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (void*)(uintptr_t)outputcallback, (void*)(uintptr_t)clientdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)outputcallback;
    (void)clientdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jlong outputcallback, jlong clientdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterOutputCallbackInteractionContext2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (void*)(uintptr_t)outputcallback, (void*)(uintptr_t)clientdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)outputcallback;
    (void)clientdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint pointerid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePointerInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)pointerid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)pointerid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextResetInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parametercount, jlong crossslideparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCrossSlideParametersInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)parametercount, (void*)(uintptr_t)crossslideparameters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parametercount;
    (void)crossslideparameters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetHoldParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (float)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint inertiaparameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetInertiaParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)inertiaparameter, (float)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)inertiaparameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint configurationcount, jlong configuration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetInteractionConfigurationInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)configurationcount, (void*)(uintptr_t)configuration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)configurationcount;
    (void)configuration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMouseWheelParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (float)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jfloat x, jfloat y, jfloat radius) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPivotInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (float)x, (float)y, (float)radius);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)x;
    (void)y;
    (void)radius;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint contextproperty, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPropertyInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)contextproperty, (uint32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)contextproperty;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTapParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (float)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTranslationParameterInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (float)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssysWindowsWin32UiInteractioncontextStopInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StopInteractionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interactioncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interactioncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

