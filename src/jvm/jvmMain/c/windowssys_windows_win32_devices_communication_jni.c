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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1buildCommDCBA(JNIEnv* km_env, jclass km_clazz, jlong lpdef, jlong lpdcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildCommDCBA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdef, (void*)(uintptr_t)lpdcb) : -1;
#else
    (void)lpdef;
    (void)lpdcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1buildCommDCBAndTimeoutsA(JNIEnv* km_env, jclass km_clazz, jlong lpdef, jlong lpdcb, jlong lpcommtimeouts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildCommDCBAndTimeoutsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdef, (void*)(uintptr_t)lpdcb, (void*)(uintptr_t)lpcommtimeouts) : -1;
#else
    (void)lpdef;
    (void)lpdcb;
    (void)lpcommtimeouts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1buildCommDCBAndTimeoutsW(JNIEnv* km_env, jclass km_clazz, jlong lpdef, jlong lpdcb, jlong lpcommtimeouts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildCommDCBAndTimeoutsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdef, (void*)(uintptr_t)lpdcb, (void*)(uintptr_t)lpcommtimeouts) : -1;
#else
    (void)lpdef;
    (void)lpdcb;
    (void)lpcommtimeouts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1buildCommDCBW(JNIEnv* km_env, jclass km_clazz, jlong lpdef, jlong lpdcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildCommDCBW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdef, (void*)(uintptr_t)lpdcb) : -1;
#else
    (void)lpdef;
    (void)lpdcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1clearCommBreak(JNIEnv* km_env, jclass km_clazz, jlong hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearCommBreak");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile) : -1;
#else
    (void)hfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1clearCommError(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lperrors, jlong lpstat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearCommError");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lperrors, (void*)(uintptr_t)lpstat) : -1;
#else
    (void)hfile;
    (void)lperrors;
    (void)lpstat;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1commConfigDialogA(JNIEnv* km_env, jclass km_clazz, jlong lpszname, jlong hwnd, jlong lpcc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommConfigDialogA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszname, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpcc) : -1;
#else
    (void)lpszname;
    (void)hwnd;
    (void)lpcc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1commConfigDialogW(JNIEnv* km_env, jclass km_clazz, jlong lpszname, jlong hwnd, jlong lpcc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommConfigDialogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszname, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpcc) : -1;
#else
    (void)lpszname;
    (void)hwnd;
    (void)lpcc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1escapeCommFunction(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwfunc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EscapeCommFunction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwfunc) : -1;
#else
    (void)hfile;
    (void)dwfunc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getCommConfig(JNIEnv* km_env, jclass km_clazz, jlong hcommdev, jlong lpcc, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcommdev, (void*)(uintptr_t)lpcc, (void*)(uintptr_t)lpdwsize) : -1;
#else
    (void)hcommdev;
    (void)lpcc;
    (void)lpdwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getCommMask(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpevtmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommMask");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpevtmask) : -1;
#else
    (void)hfile;
    (void)lpevtmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getCommModemStatus(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpmodemstat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommModemStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpmodemstat) : -1;
#else
    (void)hfile;
    (void)lpmodemstat;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getCommPorts(JNIEnv* km_env, jclass km_clazz, jlong lpportnumbers, jint uportnumberscount, jlong puportnumbersfound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-comm-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommPorts");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpportnumbers, (uint32_t)uportnumberscount, (void*)(uintptr_t)puportnumbersfound) : 0;
#else
    (void)lpportnumbers;
    (void)uportnumberscount;
    (void)puportnumbersfound;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getCommProperties(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpcommprop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpcommprop) : -1;
#else
    (void)hfile;
    (void)lpcommprop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getCommState(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpdcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpdcb) : -1;
#else
    (void)hfile;
    (void)lpdcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getCommTimeouts(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpcommtimeouts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommTimeouts");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpcommtimeouts) : -1;
#else
    (void)hfile;
    (void)lpcommtimeouts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getDefaultCommConfigA(JNIEnv* km_env, jclass km_clazz, jlong lpszname, jlong lpcc, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultCommConfigA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcc, (void*)(uintptr_t)lpdwsize) : -1;
#else
    (void)lpszname;
    (void)lpcc;
    (void)lpdwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1getDefaultCommConfigW(JNIEnv* km_env, jclass km_clazz, jlong lpszname, jlong lpcc, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultCommConfigW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcc, (void*)(uintptr_t)lpdwsize) : -1;
#else
    (void)lpszname;
    (void)lpcc;
    (void)lpdwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1openCommPort(JNIEnv* km_env, jclass km_clazz, jint uportnumber, jint dwdesiredaccess, jint dwflagsandattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-comm-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenCommPort");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uportnumber, (uint32_t)dwdesiredaccess, (uint32_t)dwflagsandattributes) : NULL;
#else
    (void)uportnumber;
    (void)dwdesiredaccess;
    (void)dwflagsandattributes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1purgeComm(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PurgeComm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwflags) : -1;
#else
    (void)hfile;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1setCommBreak(JNIEnv* km_env, jclass km_clazz, jlong hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommBreak");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile) : -1;
#else
    (void)hfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1setCommConfig(JNIEnv* km_env, jclass km_clazz, jlong hcommdev, jlong lpcc, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcommdev, (void*)(uintptr_t)lpcc, (uint32_t)dwsize) : -1;
#else
    (void)hcommdev;
    (void)lpcc;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1setCommMask(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwevtmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommMask");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwevtmask) : -1;
#else
    (void)hfile;
    (void)dwevtmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1setCommState(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpdcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpdcb) : -1;
#else
    (void)hfile;
    (void)lpdcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1setCommTimeouts(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpcommtimeouts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommTimeouts");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpcommtimeouts) : -1;
#else
    (void)hfile;
    (void)lpcommtimeouts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1setDefaultCommConfigA(JNIEnv* km_env, jclass km_clazz, jlong lpszname, jlong lpcc, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultCommConfigA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcc, (uint32_t)dwsize) : -1;
#else
    (void)lpszname;
    (void)lpcc;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1setDefaultCommConfigW(JNIEnv* km_env, jclass km_clazz, jlong lpszname, jlong lpcc, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultCommConfigW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcc, (uint32_t)dwsize) : -1;
#else
    (void)lpszname;
    (void)lpcc;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1setupComm(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwinqueue, jint dwoutqueue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupComm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwinqueue, (uint32_t)dwoutqueue) : -1;
#else
    (void)hfile;
    (void)dwinqueue;
    (void)dwoutqueue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1transmitCommChar(JNIEnv* km_env, jclass km_clazz, jlong hfile, jbyte cchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransmitCommChar");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (int8_t)cchar) : -1;
#else
    (void)hfile;
    (void)cchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_communication_WindowsWin32DevicesCommunicationJniBridge_windowssys_1windows_1win32_1devices_1communication_1waitCommEvent(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpevtmask, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitCommEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpevtmask, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hfile;
    (void)lpevtmask;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

