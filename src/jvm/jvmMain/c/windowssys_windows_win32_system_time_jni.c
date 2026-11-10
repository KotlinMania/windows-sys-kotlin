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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1enumDynamicTimeZoneInformation(JNIEnv* km_env, jclass km_clazz, jint dwindex, jlong lptimezoneinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDynamicTimeZoneInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwindex, (void*)(uintptr_t)lptimezoneinformation) : 0;
#else
    (void)dwindex;
    (void)lptimezoneinformation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1fileTimeToSystemTime(JNIEnv* km_env, jclass km_clazz, jlong lpfiletime, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileTimeToSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiletime, (void*)(uintptr_t)lpsystemtime) : -1;
#else
    (void)lpfiletime;
    (void)lpsystemtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1getDynamicTimeZoneInformation(JNIEnv* km_env, jclass km_clazz, jlong ptimezoneinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDynamicTimeZoneInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptimezoneinformation) : 0;
#else
    (void)ptimezoneinformation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1getDynamicTimeZoneInformationEffectiveYears(JNIEnv* km_env, jclass km_clazz, jlong lptimezoneinformation, jlong firstyear, jlong lastyear) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDynamicTimeZoneInformationEffectiveYears");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimezoneinformation, (void*)(uintptr_t)firstyear, (void*)(uintptr_t)lastyear) : 0;
#else
    (void)lptimezoneinformation;
    (void)firstyear;
    (void)lastyear;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1getTimeZoneInformation(JNIEnv* km_env, jclass km_clazz, jlong lptimezoneinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimeZoneInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimezoneinformation) : 0;
#else
    (void)lptimezoneinformation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1getTimeZoneInformationForYear(JNIEnv* km_env, jclass km_clazz, jshort wyear, jlong pdtzi, jlong ptzi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimeZoneInformationForYear");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wyear, (void*)(uintptr_t)pdtzi, (void*)(uintptr_t)ptzi) : -1;
#else
    (void)wyear;
    (void)pdtzi;
    (void)ptzi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1localFileTimeToLocalSystemTime(JNIEnv* km_env, jclass km_clazz, jlong timezoneinformation, jlong localfiletime, jlong localsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFileTimeToLocalSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timezoneinformation, (void*)(uintptr_t)localfiletime, (void*)(uintptr_t)localsystemtime) : -1;
#else
    (void)timezoneinformation;
    (void)localfiletime;
    (void)localsystemtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1localSystemTimeToLocalFileTime(JNIEnv* km_env, jclass km_clazz, jlong timezoneinformation, jlong localsystemtime, jlong localfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalSystemTimeToLocalFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timezoneinformation, (void*)(uintptr_t)localsystemtime, (void*)(uintptr_t)localfiletime) : -1;
#else
    (void)timezoneinformation;
    (void)localsystemtime;
    (void)localfiletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1setDynamicTimeZoneInformation(JNIEnv* km_env, jclass km_clazz, jlong lptimezoneinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDynamicTimeZoneInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimezoneinformation) : -1;
#else
    (void)lptimezoneinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1setTimeZoneInformation(JNIEnv* km_env, jclass km_clazz, jlong lptimezoneinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTimeZoneInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimezoneinformation) : -1;
#else
    (void)lptimezoneinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1systemTimeToFileTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime, jlong lpfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemTimeToFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemtime, (void*)(uintptr_t)lpfiletime) : -1;
#else
    (void)lpsystemtime;
    (void)lpfiletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1systemTimeToTzSpecificLocalTime(JNIEnv* km_env, jclass km_clazz, jlong lptimezoneinformation, jlong lpuniversaltime, jlong lplocaltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemTimeToTzSpecificLocalTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimezoneinformation, (void*)(uintptr_t)lpuniversaltime, (void*)(uintptr_t)lplocaltime) : -1;
#else
    (void)lptimezoneinformation;
    (void)lpuniversaltime;
    (void)lplocaltime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1systemTimeToTzSpecificLocalTimeEx(JNIEnv* km_env, jclass km_clazz, jlong lptimezoneinformation, jlong lpuniversaltime, jlong lplocaltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemTimeToTzSpecificLocalTimeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimezoneinformation, (void*)(uintptr_t)lpuniversaltime, (void*)(uintptr_t)lplocaltime) : -1;
#else
    (void)lptimezoneinformation;
    (void)lpuniversaltime;
    (void)lplocaltime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1tzSpecificLocalTimeToSystemTime(JNIEnv* km_env, jclass km_clazz, jlong lptimezoneinformation, jlong lplocaltime, jlong lpuniversaltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TzSpecificLocalTimeToSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimezoneinformation, (void*)(uintptr_t)lplocaltime, (void*)(uintptr_t)lpuniversaltime) : -1;
#else
    (void)lptimezoneinformation;
    (void)lplocaltime;
    (void)lpuniversaltime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_time_WindowsWin32SystemTimeJniBridge_windowssys_1windows_1win32_1system_1time_1tzSpecificLocalTimeToSystemTimeEx(JNIEnv* km_env, jclass km_clazz, jlong lptimezoneinformation, jlong lplocaltime, jlong lpuniversaltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TzSpecificLocalTimeToSystemTimeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimezoneinformation, (void*)(uintptr_t)lplocaltime, (void*)(uintptr_t)lpuniversaltime) : -1;
#else
    (void)lptimezoneinformation;
    (void)lplocaltime;
    (void)lpuniversaltime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

