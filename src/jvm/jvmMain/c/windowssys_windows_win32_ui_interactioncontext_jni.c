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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1AddPointerInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint pointerid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPointerInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)pointerid) : -1;
#else
    (void)interactioncontext;
    (void)pointerid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1BufferPointerPacketsInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint entriescount, jlong pointerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferPointerPacketsInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)entriescount, (void*)(uintptr_t)pointerinfo) : -1;
#else
    (void)interactioncontext;
    (void)entriescount;
    (void)pointerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1CreateInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1DestroyInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetCrossSlideParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint threshold, jlong distance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCrossSlideParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)threshold, (void*)(uintptr_t)distance) : -1;
#else
    (void)interactioncontext;
    (void)threshold;
    (void)distance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetHoldParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHoldParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (void*)(uintptr_t)value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetInertiaParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint inertiaparameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInertiaParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)inertiaparameter, (void*)(uintptr_t)value) : -1;
#else
    (void)interactioncontext;
    (void)inertiaparameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetInteractionConfigurationInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint configurationcount, jlong configuration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInteractionConfigurationInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)configurationcount, (void*)(uintptr_t)configuration) : -1;
#else
    (void)interactioncontext;
    (void)configurationcount;
    (void)configuration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetMouseWheelParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMouseWheelParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (void*)(uintptr_t)value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetPropertyInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint contextproperty, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPropertyInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)contextproperty, (void*)(uintptr_t)value) : -1;
#else
    (void)interactioncontext;
    (void)contextproperty;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetStateInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jlong pointerinfo, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStateInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (void*)(uintptr_t)pointerinfo, (void*)(uintptr_t)state) : -1;
#else
    (void)interactioncontext;
    (void)pointerinfo;
    (void)state;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetTapParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (void*)(uintptr_t)value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1GetTranslationParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTranslationParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (void*)(uintptr_t)value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1ProcessBufferedPacketsInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessBufferedPacketsInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1ProcessInertiaInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessInertiaInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1ProcessPointerFramesInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint entriescount, jint pointercount, jlong pointerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessPointerFramesInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)entriescount, (uint32_t)pointercount, (void*)(uintptr_t)pointerinfo) : -1;
#else
    (void)interactioncontext;
    (void)entriescount;
    (void)pointercount;
    (void)pointerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1RegisterOutputCallbackInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jlong outputcallback, jlong clientdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterOutputCallbackInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (void*)(uintptr_t)outputcallback, (void*)(uintptr_t)clientdata) : -1;
#else
    (void)interactioncontext;
    (void)outputcallback;
    (void)clientdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1RegisterOutputCallbackInteractionContext2(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jlong outputcallback, jlong clientdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterOutputCallbackInteractionContext2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (void*)(uintptr_t)outputcallback, (void*)(uintptr_t)clientdata) : -1;
#else
    (void)interactioncontext;
    (void)outputcallback;
    (void)clientdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1RemovePointerInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint pointerid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePointerInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)pointerid) : -1;
#else
    (void)interactioncontext;
    (void)pointerid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1ResetInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetCrossSlideParametersInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parametercount, jlong crossslideparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCrossSlideParametersInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)parametercount, (void*)(uintptr_t)crossslideparameters) : -1;
#else
    (void)interactioncontext;
    (void)parametercount;
    (void)crossslideparameters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetHoldParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetHoldParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (float)value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetInertiaParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint inertiaparameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetInertiaParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)inertiaparameter, (float)value) : -1;
#else
    (void)interactioncontext;
    (void)inertiaparameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetInteractionConfigurationInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint configurationcount, jlong configuration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetInteractionConfigurationInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (uint32_t)configurationcount, (void*)(uintptr_t)configuration) : -1;
#else
    (void)interactioncontext;
    (void)configurationcount;
    (void)configuration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetMouseWheelParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMouseWheelParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (float)value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetPivotInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jfloat x, jfloat y, jfloat radius) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPivotInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (float)x, (float)y, (float)radius) : -1;
#else
    (void)interactioncontext;
    (void)x;
    (void)y;
    (void)radius;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetPropertyInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint contextproperty, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPropertyInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)contextproperty, (uint32_t)value) : -1;
#else
    (void)interactioncontext;
    (void)contextproperty;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetTapParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTapParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (float)value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1SetTranslationParameterInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext, jint parameter, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTranslationParameterInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext, (int32_t)parameter, (float)value) : -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_interactioncontext_WindowsWin32UiInteractioncontextJniBridge_windowssys_1windows_1win32_1ui_1interactioncontext_1StopInteractionContext(JNIEnv* km_env, jclass km_clazz, jlong interactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StopInteractionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interactioncontext) : -1;
#else
    (void)interactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

