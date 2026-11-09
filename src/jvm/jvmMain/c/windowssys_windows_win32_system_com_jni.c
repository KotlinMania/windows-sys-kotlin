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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1BindMoniker(JNIEnv* km_env, jclass km_clazz, jlong pmk, jint grfopt, jlong iidresult, jlong ppvresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmk, (uint32_t)grfopt, (void*)(uintptr_t)iidresult, (void*)(uintptr_t)ppvresult) : -1;
#else
    (void)pmk;
    (void)grfopt;
    (void)iidresult;
    (void)ppvresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CLSIDFromProgID(JNIEnv* km_env, jclass km_clazz, jlong lpszprogid, jlong lpclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLSIDFromProgID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszprogid, (void*)(uintptr_t)lpclsid) : -1;
#else
    (void)lpszprogid;
    (void)lpclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CLSIDFromProgIDEx(JNIEnv* km_env, jclass km_clazz, jlong lpszprogid, jlong lpclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLSIDFromProgIDEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszprogid, (void*)(uintptr_t)lpclsid) : -1;
#else
    (void)lpszprogid;
    (void)lpclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CLSIDFromString(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLSIDFromString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (void*)(uintptr_t)pclsid) : -1;
#else
    (void)lpsz;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoAddRefServerProcess(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoAddRefServerProcess");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoAllowSetForegroundWindow(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoAllowSetForegroundWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)lpvreserved) : -1;
#else
    (void)punk;
    (void)lpvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoAllowUnmarshalerCLSID(JNIEnv* km_env, jclass km_clazz, jlong clsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoAllowUnmarshalerCLSID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clsid) : -1;
#else
    (void)clsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoBuildVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoBuildVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoCancelCall(JNIEnv* km_env, jclass km_clazz, jint dwthreadid, jint ultimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCancelCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwthreadid, (uint32_t)ultimeout) : -1;
#else
    (void)dwthreadid;
    (void)ultimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoCopyProxy(JNIEnv* km_env, jclass km_clazz, jlong pproxy, jlong ppcopy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCopyProxy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproxy, (void*)(uintptr_t)ppcopy) : -1;
#else
    (void)pproxy;
    (void)ppcopy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoCreateFreeThreadedMarshaler(JNIEnv* km_env, jclass km_clazz, jlong punkouter, jlong ppunkmarshal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("combase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateFreeThreadedMarshaler");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punkouter, (void*)(uintptr_t)ppunkmarshal) : -1;
#else
    (void)punkouter;
    (void)ppunkmarshal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoCreateGuid(JNIEnv* km_env, jclass km_clazz, jlong pguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateGuid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pguid) : -1;
#else
    (void)pguid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoCreateInstance(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong punkouter, jint dwclscontext, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)punkouter, (uint32_t)dwclscontext, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)rclsid;
    (void)punkouter;
    (void)dwclscontext;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoCreateInstanceEx(JNIEnv* km_env, jclass km_clazz, jlong clsid, jlong punkouter, jint dwclsctx, jlong pserverinfo, jint dwcount, jlong presults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateInstanceEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clsid, (void*)(uintptr_t)punkouter, (uint32_t)dwclsctx, (void*)(uintptr_t)pserverinfo, (uint32_t)dwcount, (void*)(uintptr_t)presults) : -1;
#else
    (void)clsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)pserverinfo;
    (void)dwcount;
    (void)presults;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoCreateInstanceFromApp(JNIEnv* km_env, jclass km_clazz, jlong clsid, jlong punkouter, jint dwclsctx, jlong reserved, jint dwcount, jlong presults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateInstanceFromApp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clsid, (void*)(uintptr_t)punkouter, (uint32_t)dwclsctx, (void*)(uintptr_t)reserved, (uint32_t)dwcount, (void*)(uintptr_t)presults) : -1;
#else
    (void)clsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)reserved;
    (void)dwcount;
    (void)presults;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoDecrementMTAUsage(JNIEnv* km_env, jclass km_clazz, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDecrementMTAUsage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cookie) : -1;
#else
    (void)cookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoDisableCallCancellation(JNIEnv* km_env, jclass km_clazz, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDisableCallCancellation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preserved) : -1;
#else
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoDisconnectContext(JNIEnv* km_env, jclass km_clazz, jint dwtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDisconnectContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtimeout) : -1;
#else
    (void)dwtimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoDisconnectObject(JNIEnv* km_env, jclass km_clazz, jlong punk, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDisconnectObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (uint32_t)dwreserved) : -1;
#else
    (void)punk;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoDosDateTimeToFileTime(JNIEnv* km_env, jclass km_clazz, jshort ndosdate, jshort ndostime, jlong lpfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDosDateTimeToFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)ndosdate, (uint16_t)ndostime, (void*)(uintptr_t)lpfiletime) : -1;
#else
    (void)ndosdate;
    (void)ndostime;
    (void)lpfiletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoEnableCallCancellation(JNIEnv* km_env, jclass km_clazz, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoEnableCallCancellation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preserved) : -1;
#else
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoFileTimeNow(JNIEnv* km_env, jclass km_clazz, jlong lpfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFileTimeNow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiletime) : -1;
#else
    (void)lpfiletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoFileTimeToDosDateTime(JNIEnv* km_env, jclass km_clazz, jlong lpfiletime, jlong lpdosdate, jlong lpdostime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFileTimeToDosDateTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiletime, (void*)(uintptr_t)lpdosdate, (void*)(uintptr_t)lpdostime) : -1;
#else
    (void)lpfiletime;
    (void)lpdosdate;
    (void)lpdostime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoFreeAllLibraries(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFreeAllLibraries");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoFreeLibrary(JNIEnv* km_env, jclass km_clazz, jlong hinst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFreeLibrary");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hinst);
#else
    (void)hinst;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoFreeUnusedLibraries(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFreeUnusedLibraries");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoFreeUnusedLibrariesEx(JNIEnv* km_env, jclass km_clazz, jint dwunloaddelay, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFreeUnusedLibrariesEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwunloaddelay, (uint32_t)dwreserved);
#else
    (void)dwunloaddelay;
    (void)dwreserved;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetApartmentType(JNIEnv* km_env, jclass km_clazz, jlong papttype, jlong paptqualifier) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetApartmentType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)papttype, (void*)(uintptr_t)paptqualifier) : -1;
#else
    (void)papttype;
    (void)paptqualifier;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetCallContext(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong ppinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCallContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)ppinterface) : -1;
#else
    (void)riid;
    (void)ppinterface;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetCallerTID(JNIEnv* km_env, jclass km_clazz, jlong lpdwtid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCallerTID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwtid) : -1;
#else
    (void)lpdwtid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetCancelObject(JNIEnv* km_env, jclass km_clazz, jint dwthreadid, jlong iid, jlong ppunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCancelObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwthreadid, (void*)(uintptr_t)iid, (void*)(uintptr_t)ppunk) : -1;
#else
    (void)dwthreadid;
    (void)iid;
    (void)ppunk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetClassObject(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jint dwclscontext, jlong pvreserved, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetClassObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid, (uint32_t)dwclscontext, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)rclsid;
    (void)dwclscontext;
    (void)pvreserved;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetContextToken(JNIEnv* km_env, jclass km_clazz, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetContextToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptoken) : -1;
#else
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetCurrentLogicalThreadId(JNIEnv* km_env, jclass km_clazz, jlong pguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCurrentLogicalThreadId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pguid) : -1;
#else
    (void)pguid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetCurrentProcess(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCurrentProcess");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetMalloc(JNIEnv* km_env, jclass km_clazz, jint dwmemcontext, jlong ppmalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetMalloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwmemcontext, (void*)(uintptr_t)ppmalloc) : -1;
#else
    (void)dwmemcontext;
    (void)ppmalloc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetObject(JNIEnv* km_env, jclass km_clazz, jlong pszname, jlong pbindoptions, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (void*)(uintptr_t)pbindoptions, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pszname;
    (void)pbindoptions;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetObjectContext(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetObjectContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetPSClsid(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetPSClsid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)pclsid) : -1;
#else
    (void)riid;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetSystemSecurityPermissions(JNIEnv* km_env, jclass km_clazz, jint comsdtype, jlong ppsd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetSystemSecurityPermissions");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)comsdtype, (void*)(uintptr_t)ppsd) : -1;
#else
    (void)comsdtype;
    (void)ppsd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoGetTreatAsClass(JNIEnv* km_env, jclass km_clazz, jlong clsidold, jlong pclsidnew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetTreatAsClass");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clsidold, (void*)(uintptr_t)pclsidnew) : -1;
#else
    (void)clsidold;
    (void)pclsidnew;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoImpersonateClient(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoImpersonateClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoIncrementMTAUsage(JNIEnv* km_env, jclass km_clazz, jlong pcookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("combase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoIncrementMTAUsage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcookie) : -1;
#else
    (void)pcookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoInitialize(JNIEnv* km_env, jclass km_clazz, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInitialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvreserved) : -1;
#else
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoInitializeEx(JNIEnv* km_env, jclass km_clazz, jlong pvreserved, jint dwcoinit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInitializeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvreserved, (uint32_t)dwcoinit) : -1;
#else
    (void)pvreserved;
    (void)dwcoinit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoInitializeSecurity(JNIEnv* km_env, jclass km_clazz, jlong psecdesc, jint cauthsvc, jlong asauthsvc, jlong preserved1, jint dwauthnlevel, jint dwimplevel, jlong pauthlist, jint dwcapabilities, jlong preserved3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInitializeSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecdesc, (int32_t)cauthsvc, (void*)(uintptr_t)asauthsvc, (void*)(uintptr_t)preserved1, (uint32_t)dwauthnlevel, (uint32_t)dwimplevel, (void*)(uintptr_t)pauthlist, (uint32_t)dwcapabilities, (void*)(uintptr_t)preserved3) : -1;
#else
    (void)psecdesc;
    (void)cauthsvc;
    (void)asauthsvc;
    (void)preserved1;
    (void)dwauthnlevel;
    (void)dwimplevel;
    (void)pauthlist;
    (void)dwcapabilities;
    (void)preserved3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoInstall(JNIEnv* km_env, jclass km_clazz, jlong pbc, jint dwflags, jlong pclassspec, jlong pquery, jlong pszcodebase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInstall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbc, (uint32_t)dwflags, (void*)(uintptr_t)pclassspec, (void*)(uintptr_t)pquery, (void*)(uintptr_t)pszcodebase) : -1;
#else
    (void)pbc;
    (void)dwflags;
    (void)pclassspec;
    (void)pquery;
    (void)pszcodebase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoInvalidateRemoteMachineBindings(JNIEnv* km_env, jclass km_clazz, jlong pszmachinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInvalidateRemoteMachineBindings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszmachinename) : -1;
#else
    (void)pszmachinename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoIsHandlerConnected(JNIEnv* km_env, jclass km_clazz, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoIsHandlerConnected");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk) : -1;
#else
    (void)punk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoIsOle1Class(JNIEnv* km_env, jclass km_clazz, jlong rclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoIsOle1Class");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid) : -1;
#else
    (void)rclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoLoadLibrary(JNIEnv* km_env, jclass km_clazz, jlong lpszlibname, jint bautofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoLoadLibrary");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszlibname, (int32_t)bautofree) : NULL;
#else
    (void)lpszlibname;
    (void)bautofree;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoLockObjectExternal(JNIEnv* km_env, jclass km_clazz, jlong punk, jint flock, jint flastunlockreleases) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoLockObjectExternal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (int32_t)flock, (int32_t)flastunlockreleases) : -1;
#else
    (void)punk;
    (void)flock;
    (void)flastunlockreleases;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoQueryAuthenticationServices(JNIEnv* km_env, jclass km_clazz, jlong pcauthsvc, jlong asauthsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoQueryAuthenticationServices");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcauthsvc, (void*)(uintptr_t)asauthsvc) : -1;
#else
    (void)pcauthsvc;
    (void)asauthsvc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoQueryClientBlanket(JNIEnv* km_env, jclass km_clazz, jlong pauthnsvc, jlong pauthzsvc, jlong pserverprincname, jlong pauthnlevel, jlong pimplevel, jlong pprivs, jlong pcapabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoQueryClientBlanket");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauthnsvc, (void*)(uintptr_t)pauthzsvc, (void*)(uintptr_t)pserverprincname, (void*)(uintptr_t)pauthnlevel, (void*)(uintptr_t)pimplevel, (void*)(uintptr_t)pprivs, (void*)(uintptr_t)pcapabilities) : -1;
#else
    (void)pauthnsvc;
    (void)pauthzsvc;
    (void)pserverprincname;
    (void)pauthnlevel;
    (void)pimplevel;
    (void)pprivs;
    (void)pcapabilities;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoQueryProxyBlanket(JNIEnv* km_env, jclass km_clazz, jlong pproxy, jlong pwauthnsvc, jlong pauthzsvc, jlong pserverprincname, jlong pauthnlevel, jlong pimplevel, jlong pauthinfo, jlong pcapabilites) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoQueryProxyBlanket");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproxy, (void*)(uintptr_t)pwauthnsvc, (void*)(uintptr_t)pauthzsvc, (void*)(uintptr_t)pserverprincname, (void*)(uintptr_t)pauthnlevel, (void*)(uintptr_t)pimplevel, (void*)(uintptr_t)pauthinfo, (void*)(uintptr_t)pcapabilites) : -1;
#else
    (void)pproxy;
    (void)pwauthnsvc;
    (void)pauthzsvc;
    (void)pserverprincname;
    (void)pauthnlevel;
    (void)pimplevel;
    (void)pauthinfo;
    (void)pcapabilites;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRegisterActivationFilter(JNIEnv* km_env, jclass km_clazz, jlong pactivationfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterActivationFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pactivationfilter) : -1;
#else
    (void)pactivationfilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRegisterChannelHook(JNIEnv* km_env, jclass km_clazz, jlong extensionuuid, jlong pchannelhook) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterChannelHook");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)extensionuuid, (void*)(uintptr_t)pchannelhook) : -1;
#else
    (void)extensionuuid;
    (void)pchannelhook;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRegisterClassObject(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong punk, jint dwclscontext, jint flags, jlong lpdwregister) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterClassObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)punk, (uint32_t)dwclscontext, (uint32_t)flags, (void*)(uintptr_t)lpdwregister) : -1;
#else
    (void)rclsid;
    (void)punk;
    (void)dwclscontext;
    (void)flags;
    (void)lpdwregister;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRegisterDeviceCatalog(JNIEnv* km_env, jclass km_clazz, jlong deviceinstanceid, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterDeviceCatalog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceinstanceid, (void*)(uintptr_t)cookie) : -1;
#else
    (void)deviceinstanceid;
    (void)cookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRegisterInitializeSpy(JNIEnv* km_env, jclass km_clazz, jlong pspy, jlong pulicookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterInitializeSpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pspy, (void*)(uintptr_t)pulicookie) : -1;
#else
    (void)pspy;
    (void)pulicookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRegisterMallocSpy(JNIEnv* km_env, jclass km_clazz, jlong pmallocspy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterMallocSpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmallocspy) : -1;
#else
    (void)pmallocspy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRegisterPSClsid(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong rclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterPSClsid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)rclsid) : -1;
#else
    (void)riid;
    (void)rclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRegisterSurrogate(JNIEnv* km_env, jclass km_clazz, jlong psurrogate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterSurrogate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psurrogate) : -1;
#else
    (void)psurrogate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoReleaseServerProcess(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoReleaseServerProcess");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoResumeClassObjects(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoResumeClassObjects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRevertToSelf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevertToSelf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRevokeClassObject(JNIEnv* km_env, jclass km_clazz, jint dwregister) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevokeClassObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwregister) : -1;
#else
    (void)dwregister;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRevokeDeviceCatalog(JNIEnv* km_env, jclass km_clazz, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevokeDeviceCatalog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cookie) : -1;
#else
    (void)cookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRevokeInitializeSpy(JNIEnv* km_env, jclass km_clazz, jlong ulicookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevokeInitializeSpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)ulicookie) : -1;
#else
    (void)ulicookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoRevokeMallocSpy(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevokeMallocSpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoSetCancelObject(JNIEnv* km_env, jclass km_clazz, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoSetCancelObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk) : -1;
#else
    (void)punk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoSetProxyBlanket(JNIEnv* km_env, jclass km_clazz, jlong pproxy, jint dwauthnsvc, jint dwauthzsvc, jlong pserverprincname, jint dwauthnlevel, jint dwimplevel, jlong pauthinfo, jint dwcapabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoSetProxyBlanket");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproxy, (uint32_t)dwauthnsvc, (uint32_t)dwauthzsvc, (void*)(uintptr_t)pserverprincname, (uint32_t)dwauthnlevel, (uint32_t)dwimplevel, (void*)(uintptr_t)pauthinfo, (uint32_t)dwcapabilities) : -1;
#else
    (void)pproxy;
    (void)dwauthnsvc;
    (void)dwauthzsvc;
    (void)pserverprincname;
    (void)dwauthnlevel;
    (void)dwimplevel;
    (void)pauthinfo;
    (void)dwcapabilities;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoSuspendClassObjects(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoSuspendClassObjects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoSwitchCallContext(JNIEnv* km_env, jclass km_clazz, jlong pnewobject, jlong ppoldobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoSwitchCallContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pnewobject, (void*)(uintptr_t)ppoldobject) : -1;
#else
    (void)pnewobject;
    (void)ppoldobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoTaskMemAlloc(JNIEnv* km_env, jclass km_clazz, jlong cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("combase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTaskMemAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)cb) : NULL;
#else
    (void)cb;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoTaskMemFree(JNIEnv* km_env, jclass km_clazz, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("combase.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTaskMemFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pv);
#else
    (void)pv;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoTaskMemRealloc(JNIEnv* km_env, jclass km_clazz, jlong pv, jlong cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTaskMemRealloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pv, (uint64_t)cb) : NULL;
#else
    (void)pv;
    (void)cb;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoTestCancel(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTestCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoTreatAsClass(JNIEnv* km_env, jclass km_clazz, jlong clsidold, jlong clsidnew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTreatAsClass");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clsidold, (void*)(uintptr_t)clsidnew) : -1;
#else
    (void)clsidold;
    (void)clsidnew;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoUninitialize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoUninitialize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoWaitForMultipleHandles(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint dwtimeout, jint chandles, jlong phandles, jlong lpdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoWaitForMultipleHandles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (uint32_t)dwtimeout, (uint32_t)chandles, (void*)(uintptr_t)phandles, (void*)(uintptr_t)lpdwindex) : -1;
#else
    (void)dwflags;
    (void)dwtimeout;
    (void)chandles;
    (void)phandles;
    (void)lpdwindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CoWaitForMultipleObjects(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint dwtimeout, jint chandles, jlong phandles, jlong lpdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoWaitForMultipleObjects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (uint32_t)dwtimeout, (uint32_t)chandles, (void*)(uintptr_t)phandles, (void*)(uintptr_t)lpdwindex) : -1;
#else
    (void)dwflags;
    (void)dwtimeout;
    (void)chandles;
    (void)phandles;
    (void)lpdwindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateAntiMoniker(JNIEnv* km_env, jclass km_clazz, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAntiMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppmk) : -1;
#else
    (void)ppmk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateBindCtx(JNIEnv* km_env, jclass km_clazz, jint reserved, jlong ppbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBindCtx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)reserved, (void*)(uintptr_t)ppbc) : -1;
#else
    (void)reserved;
    (void)ppbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateClassMoniker(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClassMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)ppmk) : -1;
#else
    (void)rclsid;
    (void)ppmk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateDataAdviseHolder(JNIEnv* km_env, jclass km_clazz, jlong ppdaholder) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDataAdviseHolder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppdaholder) : -1;
#else
    (void)ppdaholder;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateDataCache(JNIEnv* km_env, jclass km_clazz, jlong punkouter, jlong rclsid, jlong iid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDataCache");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punkouter, (void*)(uintptr_t)rclsid, (void*)(uintptr_t)iid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)punkouter;
    (void)rclsid;
    (void)iid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateFileMoniker(JNIEnv* km_env, jclass km_clazz, jlong lpszpathname, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszpathname, (void*)(uintptr_t)ppmk) : -1;
#else
    (void)lpszpathname;
    (void)ppmk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateGenericComposite(JNIEnv* km_env, jclass km_clazz, jlong pmkfirst, jlong pmkrest, jlong ppmkcomposite) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateGenericComposite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmkfirst, (void*)(uintptr_t)pmkrest, (void*)(uintptr_t)ppmkcomposite) : -1;
#else
    (void)pmkfirst;
    (void)pmkrest;
    (void)ppmkcomposite;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateIUriBuilder(JNIEnv* km_env, jclass km_clazz, jlong piuri, jint dwflags, jlong dwreserved, jlong ppiuribuilder) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIUriBuilder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)piuri, (uint32_t)dwflags, (uint64_t)dwreserved, (void*)(uintptr_t)ppiuribuilder) : -1;
#else
    (void)piuri;
    (void)dwflags;
    (void)dwreserved;
    (void)ppiuribuilder;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateItemMoniker(JNIEnv* km_env, jclass km_clazz, jlong lpszdelim, jlong lpszitem, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateItemMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdelim, (void*)(uintptr_t)lpszitem, (void*)(uintptr_t)ppmk) : -1;
#else
    (void)lpszdelim;
    (void)lpszitem;
    (void)ppmk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateObjrefMoniker(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateObjrefMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)ppmk) : -1;
#else
    (void)punk;
    (void)ppmk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreatePointerMoniker(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePointerMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)ppmk) : -1;
#else
    (void)punk;
    (void)ppmk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateStdProgressIndicator(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong psztitle, jlong pibsccaller, jlong ppibsc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdProgressIndicator");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)psztitle, (void*)(uintptr_t)pibsccaller, (void*)(uintptr_t)ppibsc) : -1;
#else
    (void)hwndparent;
    (void)psztitle;
    (void)pibsccaller;
    (void)ppibsc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateUri(JNIEnv* km_env, jclass km_clazz, jlong pwzuri, jint dwflags, jlong dwreserved, jlong ppuri) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUri");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzuri, (uint32_t)dwflags, (uint64_t)dwreserved, (void*)(uintptr_t)ppuri) : -1;
#else
    (void)pwzuri;
    (void)dwflags;
    (void)dwreserved;
    (void)ppuri;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateUriFromMultiByteString(JNIEnv* km_env, jclass km_clazz, jlong pszansiinputuri, jint dwencodingflags, jint dwcodepage, jint dwcreateflags, jlong dwreserved, jlong ppuri) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUriFromMultiByteString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszansiinputuri, (uint32_t)dwencodingflags, (uint32_t)dwcodepage, (uint32_t)dwcreateflags, (uint64_t)dwreserved, (void*)(uintptr_t)ppuri) : -1;
#else
    (void)pszansiinputuri;
    (void)dwencodingflags;
    (void)dwcodepage;
    (void)dwcreateflags;
    (void)dwreserved;
    (void)ppuri;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1CreateUriWithFragment(JNIEnv* km_env, jclass km_clazz, jlong pwzuri, jlong pwzfragment, jint dwflags, jlong dwreserved, jlong ppuri) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUriWithFragment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzuri, (void*)(uintptr_t)pwzfragment, (uint32_t)dwflags, (uint64_t)dwreserved, (void*)(uintptr_t)ppuri) : -1;
#else
    (void)pwzuri;
    (void)pwzfragment;
    (void)dwflags;
    (void)dwreserved;
    (void)ppuri;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1DcomChannelSetHResult(JNIEnv* km_env, jclass km_clazz, jlong pvreserved, jlong pulreserved, jint appshr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DcomChannelSetHResult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pulreserved, (int32_t)appshr) : -1;
#else
    (void)pvreserved;
    (void)pulreserved;
    (void)appshr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1GetClassFile(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)pclsid) : -1;
#else
    (void)szfilename;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1GetErrorInfo(JNIEnv* km_env, jclass km_clazz, jint dwreserved, jlong pperrinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetErrorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreserved, (void*)(uintptr_t)pperrinfo) : -1;
#else
    (void)dwreserved;
    (void)pperrinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1GetRunningObjectTable(JNIEnv* km_env, jclass km_clazz, jint reserved, jlong pprot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRunningObjectTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)reserved, (void*)(uintptr_t)pprot) : -1;
#else
    (void)reserved;
    (void)pprot;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1IIDFromString(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jlong lpiid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IIDFromString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (void*)(uintptr_t)lpiid) : -1;
#else
    (void)lpsz;
    (void)lpiid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1MkParseDisplayName(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong szusername, jlong pcheaten, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MkParseDisplayName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)szusername, (void*)(uintptr_t)pcheaten, (void*)(uintptr_t)ppmk) : -1;
#else
    (void)pbc;
    (void)szusername;
    (void)pcheaten;
    (void)ppmk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1MonikerCommonPrefixWith(JNIEnv* km_env, jclass km_clazz, jlong pmkthis, jlong pmkother, jlong ppmkcommon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonikerCommonPrefixWith");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmkthis, (void*)(uintptr_t)pmkother, (void*)(uintptr_t)ppmkcommon) : -1;
#else
    (void)pmkthis;
    (void)pmkother;
    (void)ppmkcommon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1MonikerRelativePathTo(JNIEnv* km_env, jclass km_clazz, jlong pmksrc, jlong pmkdest, jlong ppmkrelpath, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonikerRelativePathTo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmksrc, (void*)(uintptr_t)pmkdest, (void*)(uintptr_t)ppmkrelpath, (int32_t)dwreserved) : -1;
#else
    (void)pmksrc;
    (void)pmkdest;
    (void)ppmkrelpath;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1ProgIDFromCLSID(JNIEnv* km_env, jclass km_clazz, jlong clsid, jlong lplpszprogid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProgIDFromCLSID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clsid, (void*)(uintptr_t)lplpszprogid) : -1;
#else
    (void)clsid;
    (void)lplpszprogid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1SetErrorInfo(JNIEnv* km_env, jclass km_clazz, jint dwreserved, jlong perrinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetErrorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreserved, (void*)(uintptr_t)perrinfo) : -1;
#else
    (void)dwreserved;
    (void)perrinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1StringFromCLSID(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong lplpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StringFromCLSID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)lplpsz) : -1;
#else
    (void)rclsid;
    (void)lplpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1StringFromGUID2(JNIEnv* km_env, jclass km_clazz, jlong rguid, jlong lpsz, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StringFromGUID2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rguid, (void*)(uintptr_t)lpsz, (int32_t)cchmax) : -1;
#else
    (void)rguid;
    (void)lpsz;
    (void)cchmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_WindowsWin32SystemComJniBridge_windowssys_1windows_1win32_1system_1com_1StringFromIID(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong lplpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StringFromIID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)lplpsz) : -1;
#else
    (void)rclsid;
    (void)lplpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

