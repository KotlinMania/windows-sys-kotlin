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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1BroadcastSystemMessageA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong lpinfo, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)lpinfo, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1BroadcastSystemMessageExA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong lpinfo, jint msg, jlong wparam, jlong lparam, jlong pbsminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)lpinfo, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)pbsminfo) : -1;
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)pbsminfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1BroadcastSystemMessageExW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong lpinfo, jint msg, jlong wparam, jlong lparam, jlong pbsminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)lpinfo, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)pbsminfo) : -1;
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)pbsminfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1BroadcastSystemMessageW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong lpinfo, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)lpinfo, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1CloseDesktop(JNIEnv* km_env, jclass km_clazz, jlong hdesktop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseDesktop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdesktop) : -1;
#else
    (void)hdesktop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1CloseWindowStation(JNIEnv* km_env, jclass km_clazz, jlong hwinsta) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseWindowStation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwinsta) : -1;
#else
    (void)hwinsta;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1CreateDesktopA(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jlong lpszdevice, jlong pdevmode, jint dwflags, jint dwdesiredaccess, jlong lpsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdesktop, (void*)(uintptr_t)lpszdevice, (void*)(uintptr_t)pdevmode, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa) : NULL;
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1CreateDesktopExA(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jlong lpszdevice, jlong pdevmode, jint dwflags, jint dwdesiredaccess, jlong lpsa, jint ulheapsize, jlong pvoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdesktop, (void*)(uintptr_t)lpszdevice, (void*)(uintptr_t)pdevmode, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa, (uint32_t)ulheapsize, (void*)(uintptr_t)pvoid) : NULL;
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    (void)ulheapsize;
    (void)pvoid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1CreateDesktopExW(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jlong lpszdevice, jlong pdevmode, jint dwflags, jint dwdesiredaccess, jlong lpsa, jint ulheapsize, jlong pvoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdesktop, (void*)(uintptr_t)lpszdevice, (void*)(uintptr_t)pdevmode, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa, (uint32_t)ulheapsize, (void*)(uintptr_t)pvoid) : NULL;
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    (void)ulheapsize;
    (void)pvoid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1CreateDesktopW(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jlong lpszdevice, jlong pdevmode, jint dwflags, jint dwdesiredaccess, jlong lpsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdesktop, (void*)(uintptr_t)lpszdevice, (void*)(uintptr_t)pdevmode, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa) : NULL;
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1CreateWindowStationA(JNIEnv* km_env, jclass km_clazz, jlong lpwinsta, jint dwflags, jint dwdesiredaccess, jlong lpsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowStationA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwinsta, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa) : NULL;
#else
    (void)lpwinsta;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1CreateWindowStationW(JNIEnv* km_env, jclass km_clazz, jlong lpwinsta, jint dwflags, jint dwdesiredaccess, jlong lpsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowStationW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwinsta, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa) : NULL;
#else
    (void)lpwinsta;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1EnumDesktopsA(JNIEnv* km_env, jclass km_clazz, jlong hwinsta, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDesktopsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwinsta, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam) : -1;
#else
    (void)hwinsta;
    (void)lpenumfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1EnumDesktopsW(JNIEnv* km_env, jclass km_clazz, jlong hwinsta, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDesktopsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwinsta, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam) : -1;
#else
    (void)hwinsta;
    (void)lpenumfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1EnumWindowStationsA(JNIEnv* km_env, jclass km_clazz, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumWindowStationsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenumfunc, (int64_t)lparam) : -1;
#else
    (void)lpenumfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1EnumWindowStationsW(JNIEnv* km_env, jclass km_clazz, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumWindowStationsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenumfunc, (int64_t)lparam) : -1;
#else
    (void)lpenumfunc;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1GetProcessWindowStation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessWindowStation");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1GetThreadDesktop(JNIEnv* km_env, jclass km_clazz, jint dwthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadDesktop");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwthreadid) : NULL;
#else
    (void)dwthreadid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1GetUserObjectInformationA(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint nindex, jlong pvinfo, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectInformationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)nindex, (void*)(uintptr_t)pvinfo, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded) : -1;
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    (void)lpnlengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1GetUserObjectInformationW(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint nindex, jlong pvinfo, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectInformationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)nindex, (void*)(uintptr_t)pvinfo, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded) : -1;
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    (void)lpnlengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1OpenDesktopA(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jint dwflags, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDesktopA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdesktop, (uint32_t)dwflags, (int32_t)finherit, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)lpszdesktop;
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1OpenDesktopW(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jint dwflags, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDesktopW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdesktop, (uint32_t)dwflags, (int32_t)finherit, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)lpszdesktop;
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1OpenInputDesktop(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenInputDesktop");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (int32_t)finherit, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1OpenWindowStationA(JNIEnv* km_env, jclass km_clazz, jlong lpszwinsta, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWindowStationA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszwinsta, (int32_t)finherit, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)lpszwinsta;
    (void)finherit;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1OpenWindowStationW(JNIEnv* km_env, jclass km_clazz, jlong lpszwinsta, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWindowStationW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszwinsta, (int32_t)finherit, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)lpszwinsta;
    (void)finherit;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1SetProcessWindowStation(JNIEnv* km_env, jclass km_clazz, jlong hwinsta) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessWindowStation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwinsta) : -1;
#else
    (void)hwinsta;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1SetThreadDesktop(JNIEnv* km_env, jclass km_clazz, jlong hdesktop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadDesktop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdesktop) : -1;
#else
    (void)hdesktop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1SetUserObjectInformationA(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint nindex, jlong pvinfo, jint nlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectInformationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)nindex, (void*)(uintptr_t)pvinfo, (uint32_t)nlength) : -1;
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1SetUserObjectInformationW(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint nindex, jlong pvinfo, jint nlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectInformationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)nindex, (void*)(uintptr_t)pvinfo, (uint32_t)nlength) : -1;
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1SwitchDesktop(JNIEnv* km_env, jclass km_clazz, jlong hdesktop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchDesktop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdesktop) : -1;
#else
    (void)hdesktop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

