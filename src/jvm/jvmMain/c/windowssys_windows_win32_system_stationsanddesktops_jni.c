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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1broadcastSystemMessageA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong lpinfo, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)lpinfo, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1broadcastSystemMessageExA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong lpinfo, jint msg, jlong wparam, jlong lparam, jlong pbsminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)lpinfo, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)pbsminfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)pbsminfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1broadcastSystemMessageExW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong lpinfo, jint msg, jlong wparam, jlong lparam, jlong pbsminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)lpinfo, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)pbsminfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)pbsminfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1broadcastSystemMessageW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong lpinfo, jint msg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)lpinfo, (uint32_t)msg, (uint64_t)wparam, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1closeDesktop(JNIEnv* km_env, jclass km_clazz, jlong hdesktop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseDesktop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdesktop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesktop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1closeWindowStation(JNIEnv* km_env, jclass km_clazz, jlong hwinsta) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseWindowStation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwinsta);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwinsta;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1createDesktopA(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jlong lpszdevice, jlong pdevmode, jint dwflags, jint dwdesiredaccess, jlong lpsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdesktop, (void*)(uintptr_t)lpszdevice, (void*)(uintptr_t)pdevmode, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1createDesktopExA(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jlong lpszdevice, jlong pdevmode, jint dwflags, jint dwdesiredaccess, jlong lpsa, jint ulheapsize, jlong pvoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdesktop, (void*)(uintptr_t)lpszdevice, (void*)(uintptr_t)pdevmode, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa, (uint32_t)ulheapsize, (void*)(uintptr_t)pvoid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    (void)ulheapsize;
    (void)pvoid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1createDesktopExW(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jlong lpszdevice, jlong pdevmode, jint dwflags, jint dwdesiredaccess, jlong lpsa, jint ulheapsize, jlong pvoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdesktop, (void*)(uintptr_t)lpszdevice, (void*)(uintptr_t)pdevmode, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa, (uint32_t)ulheapsize, (void*)(uintptr_t)pvoid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    (void)ulheapsize;
    (void)pvoid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1createDesktopW(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jlong lpszdevice, jlong pdevmode, jint dwflags, jint dwdesiredaccess, jlong lpsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdesktop, (void*)(uintptr_t)lpszdevice, (void*)(uintptr_t)pdevmode, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1createWindowStationA(JNIEnv* km_env, jclass km_clazz, jlong lpwinsta, jint dwflags, jint dwdesiredaccess, jlong lpsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowStationA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwinsta, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpwinsta;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1createWindowStationW(JNIEnv* km_env, jclass km_clazz, jlong lpwinsta, jint dwflags, jint dwdesiredaccess, jlong lpsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowStationW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwinsta, (uint32_t)dwflags, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpsa);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpwinsta;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1enumDesktopsA(JNIEnv* km_env, jclass km_clazz, jlong hwinsta, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDesktopsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwinsta, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwinsta;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1enumDesktopsW(JNIEnv* km_env, jclass km_clazz, jlong hwinsta, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDesktopsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwinsta, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwinsta;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1enumWindowStationsA(JNIEnv* km_env, jclass km_clazz, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumWindowStationsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1enumWindowStationsW(JNIEnv* km_env, jclass km_clazz, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumWindowStationsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1getProcessWindowStation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessWindowStation");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1getThreadDesktop(JNIEnv* km_env, jclass km_clazz, jint dwthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadDesktop");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwthreadid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwthreadid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1getUserObjectInformationA(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint nindex, jlong pvinfo, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectInformationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)nindex, (void*)(uintptr_t)pvinfo, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1getUserObjectInformationW(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint nindex, jlong pvinfo, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectInformationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)nindex, (void*)(uintptr_t)pvinfo, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1openDesktopA(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jint dwflags, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDesktopA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdesktop, (uint32_t)dwflags, (int32_t)finherit, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszdesktop;
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1openDesktopW(JNIEnv* km_env, jclass km_clazz, jlong lpszdesktop, jint dwflags, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDesktopW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdesktop, (uint32_t)dwflags, (int32_t)finherit, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszdesktop;
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1openInputDesktop(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenInputDesktop");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (int32_t)finherit, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1openWindowStationA(JNIEnv* km_env, jclass km_clazz, jlong lpszwinsta, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWindowStationA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszwinsta, (int32_t)finherit, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszwinsta;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1openWindowStationW(JNIEnv* km_env, jclass km_clazz, jlong lpszwinsta, jint finherit, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWindowStationW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszwinsta, (int32_t)finherit, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszwinsta;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1setProcessWindowStation(JNIEnv* km_env, jclass km_clazz, jlong hwinsta) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessWindowStation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwinsta);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwinsta;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1setThreadDesktop(JNIEnv* km_env, jclass km_clazz, jlong hdesktop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadDesktop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdesktop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesktop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1setUserObjectInformationA(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint nindex, jlong pvinfo, jint nlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectInformationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)nindex, (void*)(uintptr_t)pvinfo, (uint32_t)nlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1setUserObjectInformationW(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint nindex, jlong pvinfo, jint nlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectInformationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)nindex, (void*)(uintptr_t)pvinfo, (uint32_t)nlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_stationsanddesktops_WindowsWin32SystemStationsanddesktopsJniBridge_windowssys_1windows_1win32_1system_1stationsanddesktops_1switchDesktop(JNIEnv* km_env, jclass km_clazz, jlong hdesktop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchDesktop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdesktop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesktop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

