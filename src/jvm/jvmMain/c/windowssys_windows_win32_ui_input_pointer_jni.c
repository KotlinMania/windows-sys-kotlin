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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1EnableMouseInPointer(JNIEnv* km_env, jclass km_clazz, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableMouseInPointer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fenable) : -1;
#else
    (void)fenable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerCursorId(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong cursorid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerCursorId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)cursorid) : -1;
#else
    (void)pointerid;
    (void)cursorid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerDevice(JNIEnv* km_env, jclass km_clazz, jlong device, jlong pointerdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDevice");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)device, (void*)(uintptr_t)pointerdevice) : -1;
#else
    (void)device;
    (void)pointerdevice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerDeviceCursors(JNIEnv* km_env, jclass km_clazz, jlong device, jlong cursorcount, jlong devicecursors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDeviceCursors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)device, (void*)(uintptr_t)cursorcount, (void*)(uintptr_t)devicecursors) : -1;
#else
    (void)device;
    (void)cursorcount;
    (void)devicecursors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerDeviceProperties(JNIEnv* km_env, jclass km_clazz, jlong device, jlong propertycount, jlong pointerproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDeviceProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)device, (void*)(uintptr_t)propertycount, (void*)(uintptr_t)pointerproperties) : -1;
#else
    (void)device;
    (void)propertycount;
    (void)pointerproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerDeviceRects(JNIEnv* km_env, jclass km_clazz, jlong device, jlong pointerdevicerect, jlong displayrect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDeviceRects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)device, (void*)(uintptr_t)pointerdevicerect, (void*)(uintptr_t)displayrect) : -1;
#else
    (void)device;
    (void)pointerdevicerect;
    (void)displayrect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerDevices(JNIEnv* km_env, jclass km_clazz, jlong devicecount, jlong pointerdevices) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDevices");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)devicecount, (void*)(uintptr_t)pointerdevices) : -1;
#else
    (void)devicecount;
    (void)pointerdevices;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerFrameInfo(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong pointercount, jlong pointerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFrameInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)pointercount, (void*)(uintptr_t)pointerinfo) : -1;
#else
    (void)pointerid;
    (void)pointercount;
    (void)pointerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerFrameInfoHistory(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong entriescount, jlong pointercount, jlong pointerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFrameInfoHistory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)entriescount, (void*)(uintptr_t)pointercount, (void*)(uintptr_t)pointerinfo) : -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)pointercount;
    (void)pointerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerFramePenInfo(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong pointercount, jlong peninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFramePenInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)pointercount, (void*)(uintptr_t)peninfo) : -1;
#else
    (void)pointerid;
    (void)pointercount;
    (void)peninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerFramePenInfoHistory(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong entriescount, jlong pointercount, jlong peninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFramePenInfoHistory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)entriescount, (void*)(uintptr_t)pointercount, (void*)(uintptr_t)peninfo) : -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)pointercount;
    (void)peninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerFrameTouchInfo(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong pointercount, jlong touchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFrameTouchInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)pointercount, (void*)(uintptr_t)touchinfo) : -1;
#else
    (void)pointerid;
    (void)pointercount;
    (void)touchinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerFrameTouchInfoHistory(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong entriescount, jlong pointercount, jlong touchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFrameTouchInfoHistory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)entriescount, (void*)(uintptr_t)pointercount, (void*)(uintptr_t)touchinfo) : -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)pointercount;
    (void)touchinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerInfo(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong pointerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)pointerinfo) : -1;
#else
    (void)pointerid;
    (void)pointerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerInfoHistory(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong entriescount, jlong pointerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerInfoHistory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)entriescount, (void*)(uintptr_t)pointerinfo) : -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)pointerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerInputTransform(JNIEnv* km_env, jclass km_clazz, jint pointerid, jint historycount, jlong inputtransform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerInputTransform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (uint32_t)historycount, (void*)(uintptr_t)inputtransform) : -1;
#else
    (void)pointerid;
    (void)historycount;
    (void)inputtransform;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerPenInfo(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong peninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerPenInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)peninfo) : -1;
#else
    (void)pointerid;
    (void)peninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerPenInfoHistory(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong entriescount, jlong peninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerPenInfoHistory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)entriescount, (void*)(uintptr_t)peninfo) : -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)peninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerTouchInfo(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong touchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerTouchInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)touchinfo) : -1;
#else
    (void)pointerid;
    (void)touchinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerTouchInfoHistory(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong entriescount, jlong touchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerTouchInfoHistory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)entriescount, (void*)(uintptr_t)touchinfo) : -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)touchinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetPointerType(JNIEnv* km_env, jclass km_clazz, jint pointerid, jlong pointertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (void*)(uintptr_t)pointertype) : -1;
#else
    (void)pointerid;
    (void)pointertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetRawPointerDeviceData(JNIEnv* km_env, jclass km_clazz, jint pointerid, jint historycount, jint propertiescount, jlong pproperties, jlong pvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawPointerDeviceData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid, (uint32_t)historycount, (uint32_t)propertiescount, (void*)(uintptr_t)pproperties, (void*)(uintptr_t)pvalues) : -1;
#else
    (void)pointerid;
    (void)historycount;
    (void)propertiescount;
    (void)pproperties;
    (void)pvalues;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1GetUnpredictedMessagePos(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUnpredictedMessagePos");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1InitializeTouchInjection(JNIEnv* km_env, jclass km_clazz, jint maxcount, jint dwmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeTouchInjection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)maxcount, (uint32_t)dwmode) : -1;
#else
    (void)maxcount;
    (void)dwmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1InjectSyntheticPointerInput(JNIEnv* km_env, jclass km_clazz, jlong device, jlong pointerinfo, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InjectSyntheticPointerInput");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)device, (void*)(uintptr_t)pointerinfo, (uint32_t)count) : -1;
#else
    (void)device;
    (void)pointerinfo;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1InjectTouchInput(JNIEnv* km_env, jclass km_clazz, jint count, jlong contacts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InjectTouchInput");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)count, (void*)(uintptr_t)contacts) : -1;
#else
    (void)count;
    (void)contacts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1IsMouseInPointerEnabled(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsMouseInPointerEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_pointer_WindowsWin32UiInputPointerJniBridge_windowssys_1windows_1win32_1ui_1input_1pointer_1SkipPointerFrameMessages(JNIEnv* km_env, jclass km_clazz, jint pointerid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SkipPointerFrameMessages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)pointerid) : -1;
#else
    (void)pointerid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

