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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection(JNIEnv* km_env, jclass km_clazz, jlong serverbushandle, jlong abortevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynAcceptBusConnection");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serverbushandle, (void*)(uintptr_t)abortevent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serverbushandle;
    (void)abortevent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle(JNIEnv* km_env, jclass km_clazz, jlong bushandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynCloseBusHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bushandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bushandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus(JNIEnv* km_env, jclass km_clazz, jlong connectionspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynConnectToBus");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connectionspec);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)connectionspec;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus(JNIEnv* km_env, jclass km_clazz, jint outbuffersize, jint inbuffersize, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynCreateBus");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)outbuffersize, (uint32_t)inbuffersize, (void*)(uintptr_t)lpsecurityattributes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)outbuffersize;
    (void)inbuffersize;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents(JNIEnv* km_env, jclass km_clazz, jlong connectedbushandle, jlong eventtoreset, jlong eventtypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynEnumEvents");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connectedbushandle, (void*)(uintptr_t)eventtoreset, (void*)(uintptr_t)eventtypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectedbushandle;
    (void)eventtoreset;
    (void)eventtypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect(JNIEnv* km_env, jclass km_clazz, jlong connectedbushandle, jlong eventhandle, jint eventtypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynEventSelect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connectedbushandle, (void*)(uintptr_t)eventhandle, (uint32_t)eventtypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectedbushandle;
    (void)eventhandle;
    (void)eventtypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus(JNIEnv* km_env, jclass km_clazz, jlong connectedbushandle, jlong buffer, jint bytestoread, jlong bytestransferred, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynReceiveFromBus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connectedbushandle, (void*)(uintptr_t)buffer, (uint32_t)bytestoread, (void*)(uintptr_t)bytestransferred, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectedbushandle;
    (void)buffer;
    (void)bytestoread;
    (void)bytestransferred;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus(JNIEnv* km_env, jclass km_clazz, jlong connectedbushandle, jlong buffer, jint bytestowrite, jlong bytestransferred, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynSendToBus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connectedbushandle, (void*)(uintptr_t)buffer, (uint32_t)bytestowrite, (void*)(uintptr_t)bytestransferred, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectedbushandle;
    (void)buffer;
    (void)bytestowrite;
    (void)bytestransferred;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynQccStatusText(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QCC_StatusText");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)status;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate(JNIEnv* km_env, jclass km_clazz, jlong defaultlanguage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)defaultlanguage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)defaultlanguage;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_empty");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_full");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)language;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg(JNIEnv* km_env, jclass km_clazz, jlong data, jlong arg, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_createfrommsgarg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (int64_t)arg, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)arg;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml(JNIEnv* km_env, jclass km_clazz, jlong data, jlong aboutdataxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_createfromxml");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)aboutdataxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)aboutdataxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(JNIEnv* km_env, jclass km_clazz, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)data;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata(JNIEnv* km_env, jclass km_clazz, jlong data, jlong msgarg, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getaboutdata");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (int64_t)msgarg, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)msgarg;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong ajsoftwareversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getajsoftwareversion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)ajsoftwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)ajsoftwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(JNIEnv* km_env, jclass km_clazz, jlong data, jlong msgarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getannouncedaboutdata");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (int64_t)msgarg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)msgarg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appid, jlong num) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getappid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)appid, (void*)(uintptr_t)num);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appid;
    (void)num;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appname, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getappname");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)appname, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appname;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture(JNIEnv* km_env, jclass km_clazz, jlong data, jlong dateofmanufacture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdateofmanufacture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)dateofmanufacture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)dateofmanufacture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage(JNIEnv* km_env, jclass km_clazz, jlong data, jlong defaultlanguage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdefaultlanguage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)defaultlanguage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)defaultlanguage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription(JNIEnv* km_env, jclass km_clazz, jlong data, jlong description, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)description, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)description;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong deviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdeviceid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)deviceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)deviceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename(JNIEnv* km_env, jclass km_clazz, jlong data, jlong devicename, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdevicename");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)devicename, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)devicename;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield(JNIEnv* km_env, jclass km_clazz, jlong data, jlong name, jlong value, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfield");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)name;
    (void)value;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fields, jlong numFields) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfields");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)fields, (uint64_t)numFields);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fields;
    (void)numFields;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fieldname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfieldsignature");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)fieldname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong hardwareversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_gethardwareversion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)hardwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)hardwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer(JNIEnv* km_env, jclass km_clazz, jlong data, jlong manufacturer, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getmanufacturer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)manufacturer, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)manufacturer;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber(JNIEnv* km_env, jclass km_clazz, jlong data, jlong modelnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getmodelnumber");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)modelnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)modelnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong softwareversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsoftwareversion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)softwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)softwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages(JNIEnv* km_env, jclass km_clazz, jlong data, jlong languagetags, jlong num) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsupportedlanguages");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)languagetags, (uint64_t)num);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)languagetags;
    (void)num;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl(JNIEnv* km_env, jclass km_clazz, jlong data, jlong supporturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsupporturl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)supporturl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)supporturl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fieldname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldannounced");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)fieldname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fieldname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldlocalized");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)fieldname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired(JNIEnv* km_env, jclass km_clazz, jlong data, jlong fieldname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldrequired");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)fieldname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_isvalid");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)data;
    (void)language;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appid, jlong num) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)appid, (uint64_t)num);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appid;
    (void)num;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappid_fromstring");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)appid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname(JNIEnv* km_env, jclass km_clazz, jlong data, jlong appname, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappname");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)appname, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)appname;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture(JNIEnv* km_env, jclass km_clazz, jlong data, jlong dateofmanufacture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdateofmanufacture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)dateofmanufacture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)dateofmanufacture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage(JNIEnv* km_env, jclass km_clazz, jlong data, jlong defaultlanguage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdefaultlanguage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)defaultlanguage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)defaultlanguage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription(JNIEnv* km_env, jclass km_clazz, jlong data, jlong description, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)description, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)description;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid(JNIEnv* km_env, jclass km_clazz, jlong data, jlong deviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdeviceid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)deviceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)deviceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename(JNIEnv* km_env, jclass km_clazz, jlong data, jlong devicename, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdevicename");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)devicename, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)devicename;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield(JNIEnv* km_env, jclass km_clazz, jlong data, jlong name, jlong value, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setfield");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)name, (int64_t)value, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)name;
    (void)value;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong hardwareversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_sethardwareversion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)hardwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)hardwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer(JNIEnv* km_env, jclass km_clazz, jlong data, jlong manufacturer, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setmanufacturer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)manufacturer, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)manufacturer;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber(JNIEnv* km_env, jclass km_clazz, jlong data, jlong modelnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setmodelnumber");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)modelnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)modelnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion(JNIEnv* km_env, jclass km_clazz, jlong data, jlong softwareversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsoftwareversion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)softwareversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)softwareversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage(JNIEnv* km_env, jclass km_clazz, jlong data, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsupportedlanguage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)language;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl(JNIEnv* km_env, jclass km_clazz, jlong data, jlong supporturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsupporturl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)data, (void*)(uintptr_t)supporturl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)data;
    (void)supporturl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdatalistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdatalistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(JNIEnv* km_env, jclass km_clazz, jlong icon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_clear");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)icon);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(JNIEnv* km_env, jclass km_clazz, jlong icon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)icon);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong data, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_getcontent");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)icon, (void*)(uintptr_t)data, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    (void)data;
    (void)size;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong type, jlong url) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_geturl");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)icon, (void*)(uintptr_t)type, (void*)(uintptr_t)url);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    (void)type;
    (void)url;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong type, jlong data, jlong csize, jbyte ownsdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_setcontent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)icon, (void*)(uintptr_t)type, (void*)(uintptr_t)data, (uint64_t)csize, (uint8_t)ownsdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)icon;
    (void)type;
    (void)data;
    (void)csize;
    (void)ownsdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_setcontent_frommsgarg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)icon, (int64_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)icon;
    (void)arg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl(JNIEnv* km_env, jclass km_clazz, jlong icon, jlong type, jlong url) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_seturl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)icon, (void*)(uintptr_t)type, (void*)(uintptr_t)url);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)icon;
    (void)type;
    (void)url;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong icon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonobj_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)icon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)icon;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(JNIEnv* km_env, jclass km_clazz, jlong icon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonobj_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)icon);
    } else {
        errno = ENOSYS;
    }
#else
    (void)icon;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong busname, jint sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)busname, (uint32_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)proxy);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxy;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong icon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_geticon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (int64_t)icon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)icon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_getversion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)version);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)version;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutlistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutlistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(JNIEnv* km_env, jclass km_clazz, jlong obj, jshort sessionport, jlong aboutdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_announce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)obj, (uint16_t)sessionport, (int64_t)aboutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)obj;
    (void)sessionport;
    (void)aboutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(JNIEnv* km_env, jclass km_clazz, jlong obj, jshort sessionport, jlong aboutlistener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_announce_using_datalistener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)obj, (uint16_t)sessionport, (int64_t)aboutlistener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)obj;
    (void)sessionport;
    (void)aboutlistener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jint isannounced) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int32_t)isannounced);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)isannounced;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(JNIEnv* km_env, jclass km_clazz, jlong obj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)obj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)obj;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(JNIEnv* km_env, jclass km_clazz, jlong obj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_unannounce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)obj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)obj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(JNIEnv* km_env, jclass km_clazz, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_clear");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)description);
    } else {
        errno = ENOSYS;
    }
#else
    (void)description;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create_full");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(JNIEnv* km_env, jclass km_clazz, jlong description, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_createfrommsgarg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)description, (int64_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)description;
    (void)arg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(JNIEnv* km_env, jclass km_clazz, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)description);
    } else {
        errno = ENOSYS;
    }
#else
    (void)description;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths(JNIEnv* km_env, jclass km_clazz, jlong description, jlong interfacename, jlong paths, jlong numpaths) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getinterfacepaths");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)description, (void*)(uintptr_t)interfacename, (void*)(uintptr_t)paths, (uint64_t)numpaths);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)interfacename;
    (void)paths;
    (void)numpaths;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces(JNIEnv* km_env, jclass km_clazz, jlong description, jlong path, jlong interfaces, jlong numinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getinterfaces");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)description, (void*)(uintptr_t)path, (void*)(uintptr_t)interfaces, (uint64_t)numinterfaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)path;
    (void)interfaces;
    (void)numinterfaces;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(JNIEnv* km_env, jclass km_clazz, jlong description, jlong msgarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getmsgarg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)description, (int64_t)msgarg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)description;
    (void)msgarg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths(JNIEnv* km_env, jclass km_clazz, jlong description, jlong paths, jlong numpaths) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getpaths");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)description, (void*)(uintptr_t)paths, (uint64_t)numpaths);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)paths;
    (void)numpaths;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface(JNIEnv* km_env, jclass km_clazz, jlong description, jlong interfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_hasinterface");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)description, (void*)(uintptr_t)interfacename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)interfacename;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath(JNIEnv* km_env, jclass km_clazz, jlong description, jlong path, jlong interfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_hasinterfaceatpath");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)description, (void*)(uintptr_t)path, (void*)(uintptr_t)interfacename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)path;
    (void)interfacename;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath(JNIEnv* km_env, jclass km_clazz, jlong description, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_haspath");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)description, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)description;
    (void)path;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong busname, jint sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)busname, (uint32_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)proxy);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxy;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong language, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getaboutdata");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)language, (int64_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)language;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong objectdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getobjectdescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (int64_t)objectdesc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)objectdesc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getversion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)version);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)version;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_applicationstatelistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_applicationstatelistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong authcontext, jint arg2Accept, jlong credentials) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_requestcredentialsresponse");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)listener, (void*)(uintptr_t)authcontext, (int32_t)arg2Accept, (int64_t)credentials);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)authcontext;
    (void)arg2Accept;
    (void)credentials;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong sharedsecret, jlong sharedsecretsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_setsharedsecret");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)listener, (void*)(uintptr_t)sharedsecret, (uint64_t)sharedsecretsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)sharedsecret;
    (void)sharedsecretsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong authcontext, jint arg2Accept) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_verifycredentialsresponse");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)listener, (void*)(uintptr_t)authcontext, (int32_t)arg2Accept);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)authcontext;
    (void)arg2Accept;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistenerasync_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistenerasync_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group, jlong destination) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_adddestination");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)autopinger, (void*)(uintptr_t)group, (void*)(uintptr_t)destination);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)autopinger;
    (void)group;
    (void)destination;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group, jlong listener, jint pinginterval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_addpinggroup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)autopinger, (void*)(uintptr_t)group, (int64_t)listener, (uint32_t)pinginterval);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    (void)group;
    (void)listener;
    (void)pinginterval;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(JNIEnv* km_env, jclass km_clazz, jlong autopinger) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)autopinger);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(JNIEnv* km_env, jclass km_clazz, jlong autopinger) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_pause");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)autopinger);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group, jlong destination, jint removeall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_removedestination");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)autopinger, (void*)(uintptr_t)group, (void*)(uintptr_t)destination, (int32_t)removeall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)autopinger;
    (void)group;
    (void)destination;
    (void)removeall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_removepinggroup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)autopinger, (void*)(uintptr_t)group);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    (void)group;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(JNIEnv* km_env, jclass km_clazz, jlong autopinger) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_resume");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)autopinger);
    } else {
        errno = ENOSYS;
    }
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval(JNIEnv* km_env, jclass km_clazz, jlong autopinger, jlong group, jint pinginterval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_setpinginterval");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)autopinger, (void*)(uintptr_t)group, (uint32_t)pinginterval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)autopinger;
    (void)group;
    (void)pinginterval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong authmechanism, jlong username, jlong password) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_addlogonentry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)username, (void*)(uintptr_t)password);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)authmechanism;
    (void)username;
    (void)password;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong rule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_addmatch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)rule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)rule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jshort transports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_advertisename");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (uint16_t)transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)transports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong sessionport, jlong opts, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_bindsessionport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)sessionport, (int64_t)opts, (int64_t)listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionport;
    (void)opts;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jshort transports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_canceladvertisename");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (uint16_t)transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)transports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong nameprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelfindadvertisedname");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)nameprefix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)nameprefix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong nameprefix, jshort transports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelfindadvertisednamebytransport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)nameprefix, (uint16_t)transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)nameprefix;
    (void)transports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong implementsinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelwhoimplements_interface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)implementsinterface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)implementsinterface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong implementsinterfaces, jlong numberinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelwhoimplements_interfaces");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)implementsinterfaces, (uint64_t)numberinterfaces);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)implementsinterfaces;
    (void)numberinterfaces;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_clearkeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_clearkeystore");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong connectspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_connect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)connectspec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)connectspec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate(JNIEnv* km_env, jclass km_clazz, jlong applicationname, jint allowremotemessages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)applicationname, (int32_t)allowremotemessages);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)applicationname;
    (void)allowremotemessages;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency(JNIEnv* km_env, jclass km_clazz, jlong applicationname, jint allowremotemessages, jint concurrency) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_create_concurrency");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)applicationname, (int32_t)allowremotemessages, (uint32_t)concurrency);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)applicationname;
    (void)allowremotemessages;
    (void)concurrency;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (void*)(uintptr_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jlong iface, jint secpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterface_secure");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (void*)(uintptr_t)iface, (int32_t)secpolicy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)iface;
    (void)secpolicy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong xml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterfacesfromxml");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)xml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)xml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore(JNIEnv* km_env, jclass km_clazz, jlong applicationname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_deletedefaultkeystore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)applicationname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)applicationname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_deleteinterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong unused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_disconnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)unused);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)unused;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_enableconcurrentcallbacks");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong authmechanisms, jlong listener, jlong keystorefilename, jint isshared) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_enablepeersecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)authmechanisms, (int64_t)listener, (void*)(uintptr_t)keystorefilename, (int32_t)isshared);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)authmechanisms;
    (void)listener;
    (void)keystorefilename;
    (void)isshared;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong authmechanisms, jlong authlistener, jlong keystorefilename, jint isshared, jlong permissionconfigurationlistener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)authmechanisms, (int64_t)authlistener, (void*)(uintptr_t)keystorefilename, (int32_t)isshared, (int64_t)permissionconfigurationlistener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)authmechanisms;
    (void)authlistener;
    (void)keystorefilename;
    (void)isshared;
    (void)permissionconfigurationlistener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong nameprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_findadvertisedname");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)nameprefix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)nameprefix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong nameprefix, jshort transports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_findadvertisednamebytransport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)nameprefix, (uint16_t)transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)nameprefix;
    (void)transports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getalljoyndebugobj");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getalljoynproxyobj");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getconcurrency");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getconnectspec");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)bus;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getdbusproxyobj");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getglobalguidstring");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)bus;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getinterface");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong ifaces, jlong numifaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getinterfaces");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)ifaces, (uint64_t)numifaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bus;
    (void)ifaces;
    (void)numifaces;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong guid, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getkeyexpiration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)guid, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)guid;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jlong guid, jlong guidsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getpeerguid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (void*)(uintptr_t)guid, (void*)(uintptr_t)guidsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)guid;
    (void)guidsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getpermissionconfigurator");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_gettimestamp");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getuniquename");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)bus;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_isconnected");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_ispeersecurityenabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_isstarted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_isstopping");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_join");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong sessionhost, jshort sessionport, jlong listener, jlong sessionid, jlong opts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t, int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_joinsession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)sessionhost, (uint16_t)sessionport, (int64_t)listener, (void*)(uintptr_t)sessionid, (int64_t)opts);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionhost;
    (void)sessionport;
    (void)listener;
    (void)sessionid;
    (void)opts;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong sessionhost, jshort sessionport, jlong listener, jlong opts, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t, int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_joinsessionasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)sessionhost, (uint16_t)sessionport, (int64_t)listener, (int64_t)opts, (void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionhost;
    (void)sessionport;
    (void)listener;
    (void)opts;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_leavesession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (uint32_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jlong hasowner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_namehasowner");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (void*)(uintptr_t)hasowner);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)hasowner;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_ping");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (uint32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong aboutlistener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registeraboutlistener");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus, (int64_t)aboutlistener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)aboutlistener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerapplicationstatelistener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbuslistener");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus, (int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong obj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbusobject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)obj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)obj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong obj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbusobject_secure");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)obj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)obj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerkeystorelistener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_releasename");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_reloadkeystore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong rule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_removematch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)rule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)rule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_removesessionmember");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (uint32_t)sessionid, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong requestedname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_requestname");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)requestedname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)requestedname;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jint forceauth) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_secureconnection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (int32_t)forceauth);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)forceauth;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong name, jint forceauth) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_secureconnectionasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)name, (int32_t)forceauth);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)name;
    (void)forceauth;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong module, jint level) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setdaemondebug");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)module, (uint32_t)level);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)module;
    (void)level;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong guid, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setkeyexpiration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)guid, (uint32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)guid;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid, jlong linktimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setlinktimeout");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (uint32_t)sessionid, (void*)(uintptr_t)linktimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    (void)linktimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid, jint linktimeout, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setlinktimeoutasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (uint32_t)sessionid, (uint32_t)linktimeout, (void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    (void)linktimeout;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jint sessionid, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setsessionlistener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (uint32_t)sessionid, (int64_t)listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionid;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_start");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_stop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(JNIEnv* km_env, jclass km_clazz, jlong bus, jshort sessionport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unbindsessionport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (uint16_t)sessionport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)sessionport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong aboutlistener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisteraboutlistener");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus, (int64_t)aboutlistener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)aboutlistener;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterallaboutlisteners");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterallhandlers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterapplicationstatelistener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)listener);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterbuslistener");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus, (int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterbusobject");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus, (int64_t)object);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)object;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong implementsinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_whoimplements_interface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)implementsinterface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)implementsinterface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong implementsinterfaces, jlong numberinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_whoimplements_interfaces");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)implementsinterfaces, (uint64_t)numberinterfaces);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)implementsinterfaces;
    (void)numberinterfaces;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_buslistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_buslistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_addinterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_addinterface_announced");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong entries, jlong numentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_addmethodhandlers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)entries, (uint64_t)numentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_cancelsessionlessmessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(JNIEnv* km_env, jclass km_clazz, jlong bus, jint serialnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_cancelsessionlessmessage_serial");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (uint32_t)serialnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)serialnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate(JNIEnv* km_env, jclass km_clazz, jlong path, jint isplaceholder, jlong callbacksIn, jlong contextIn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (int32_t)isplaceholder, (void*)(uintptr_t)callbacksIn, (void*)(uintptr_t)contextIn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)isplaceholder;
    (void)callbacksIn;
    (void)contextIn;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong ifcname, jlong propnames, jlong numprops, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_emitpropertieschanged");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus, (void*)(uintptr_t)ifcname, (void*)(uintptr_t)propnames, (uint64_t)numprops, (uint32_t)id);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)ifcname;
    (void)propnames;
    (void)numprops;
    (void)id;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong ifcname, jlong propname, jlong val, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_emitpropertychanged");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)bus, (void*)(uintptr_t)ifcname, (void*)(uintptr_t)propname, (int64_t)val, (uint32_t)id);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bus;
    (void)ifcname;
    (void)propname;
    (void)val;
    (void)id;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong interfaces, jlong numinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_getannouncedinterfacenames");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)interfaces, (uint64_t)numinterfaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bus;
    (void)interfaces;
    (void)numinterfaces;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_getbusattachment");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong buffer, jlong buffersz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_getname");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)buffer, (uint64_t)buffersz);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bus;
    (void)buffer;
    (void)buffersz;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_getpath");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)bus;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_issecure");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong msg, jlong args, jlong numargs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_args");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)msg, (int64_t)args, (uint64_t)numargs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)msg;
    (void)args;
    (void)numargs;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong msg, jlong error, jlong errormessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_err");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)msg, (void*)(uintptr_t)error, (void*)(uintptr_t)errormessage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)msg;
    (void)error;
    (void)errormessage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong msg, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_status");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)msg, (int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)msg;
    (void)status;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong iface, jint isannounced) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_setannounceflag");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (int64_t)iface, (int32_t)isannounced);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)iface;
    (void)isannounced;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(JNIEnv* km_env, jclass km_clazz, jlong cred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_clear");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)cred);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(JNIEnv* km_env, jclass km_clazz, jlong cred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)cred);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain(JNIEnv* km_env, jclass km_clazz, jlong cred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getcertchain");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)cred);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(JNIEnv* km_env, jclass km_clazz, jlong cred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getexpiration");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)cred);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cred;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry(JNIEnv* km_env, jclass km_clazz, jlong cred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getlogonentry");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)cred);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword(JNIEnv* km_env, jclass km_clazz, jlong cred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getpassword");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)cred);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey(JNIEnv* km_env, jclass km_clazz, jlong cred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getprivateKey");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)cred);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername(JNIEnv* km_env, jclass km_clazz, jlong cred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getusername");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)cred);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cred;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(JNIEnv* km_env, jclass km_clazz, jlong cred, jshort creds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_isset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)cred, (uint16_t)creds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cred;
    (void)creds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong certchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setcertchain");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)cred, (void*)(uintptr_t)certchain);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)certchain;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(JNIEnv* km_env, jclass km_clazz, jlong cred, jint expiration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setexpiration");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)cred, (uint32_t)expiration);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)expiration;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong logonentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setlogonentry");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)cred, (void*)(uintptr_t)logonentry);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)logonentry;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong pwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setpassword");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)cred, (void*)(uintptr_t)pwd);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)pwd;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong pk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setprivatekey");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)cred, (void*)(uintptr_t)pk);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)pk;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername(JNIEnv* km_env, jclass km_clazz, jlong cred, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setusername");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)cred, (void*)(uintptr_t)username);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cred;
    (void)username;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_getbuildinfo");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_getnumericversion");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynGetversion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_getversion");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_init");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(JNIEnv* km_env, jclass km_clazz, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_activate");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)iface);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addannotation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong argname, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addargannotation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)argname, (void*)(uintptr_t)name, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember(JNIEnv* km_env, jclass km_clazz, jlong iface, jint type, jlong name, jlong inputsig, jlong outsig, jlong argnames, jbyte annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmember");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (int32_t)type, (void*)(uintptr_t)name, (void*)(uintptr_t)inputsig, (void*)(uintptr_t)outsig, (void*)(uintptr_t)argnames, (uint8_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)type;
    (void)name;
    (void)inputsig;
    (void)outsig;
    (void)argnames;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmemberannotation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)name, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong inputsig, jlong outsig, jlong argnames, jbyte annotation, jlong accessperms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmethod");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)inputsig, (void*)(uintptr_t)outsig, (void*)(uintptr_t)argnames, (uint8_t)annotation, (void*)(uintptr_t)accessperms);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)inputsig;
    (void)outsig;
    (void)argnames;
    (void)annotation;
    (void)accessperms;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong signature, jbyte access) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addproperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)signature, (uint8_t)access);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)signature;
    (void)access;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong property, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addpropertyannotation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)property, (void*)(uintptr_t)name, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong sig, jlong argnames, jbyte annotation, jlong accessperms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addsignal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)sig, (void*)(uintptr_t)argnames, (uint8_t)annotation, (void*)(uintptr_t)accessperms);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)sig;
    (void)argnames;
    (void)annotation;
    (void)accessperms;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(JNIEnv* km_env, jclass km_clazz, jlong one, jlong other) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_eql");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)one, (int64_t)other);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong value, jlong valueSize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)valueSize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong arg1Index, jlong name, jlong nameSize, jlong value, jlong valueSize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotationatindex");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)iface, (uint64_t)arg1Index, (void*)(uintptr_t)name, (void*)(uintptr_t)nameSize, (void*)(uintptr_t)value, (void*)(uintptr_t)valueSize);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)arg1Index;
    (void)name;
    (void)nameSize;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(JNIEnv* km_env, jclass km_clazz, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotationscount");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong arg, jlong description, jlong maxlanguagelength, jlong languagetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getargdescriptionforlanguage");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)arg, (void*)(uintptr_t)description, (uint64_t)maxlanguagelength, (void*)(uintptr_t)languagetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)member;
    (void)arg;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong description, jlong maxlanguagelength, jlong languagetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionforlanguage");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)description, (uint64_t)maxlanguagelength, (void*)(uintptr_t)languagetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong languages, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionlanguages");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)languages, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)languages;
    (void)size;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong languages, jlong languagessize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionlanguages2");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)languages, (uint64_t)languagessize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)languages;
    (void)languagessize;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback(JNIEnv* km_env, jclass km_clazz, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptiontranslationcallback");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)iface;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong member) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmember");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)member);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong name, jlong value, jlong valueSize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberannotation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)valueSize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong argname, jlong name, jlong value, jlong valueSize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberargannotation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)argname, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)valueSize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong description, jlong maxlanguagelength, jlong languagetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberdescriptionforlanguage");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)description, (uint64_t)maxlanguagelength, (void*)(uintptr_t)languagetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)member;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong members, jlong nummembers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmembers");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)members, (uint64_t)nummembers);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)members;
    (void)nummembers;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong member) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmethod");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)member);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname(JNIEnv* km_env, jclass km_clazz, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getname");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)iface;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong props, jlong numprops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getproperties");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)props, (uint64_t)numprops);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)props;
    (void)numprops;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong property) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getproperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)property);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)property;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong property, jlong name, jlong value, jlong strSize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getpropertyannotation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)property, (void*)(uintptr_t)name, (void*)(uintptr_t)value, (void*)(uintptr_t)strSize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    (void)strSize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong property, jlong description, jlong maxlanguagelength, jlong languagetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getpropertydescriptionforlanguage");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)property, (void*)(uintptr_t)description, (uint64_t)maxlanguagelength, (void*)(uintptr_t)languagetag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)property;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(JNIEnv* km_env, jclass km_clazz, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getsecuritypolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong member) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getsignal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)member);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(JNIEnv* km_env, jclass km_clazz, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasdescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong insig, jlong outsig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasmember");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)insig, (void*)(uintptr_t)outsig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)insig;
    (void)outsig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(JNIEnv* km_env, jclass km_clazz, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasproperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasproperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong str, jlong buf, jlong indent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_introspect");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)str, (uint64_t)buf, (uint64_t)indent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)iface;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(JNIEnv* km_env, jclass km_clazz, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_issecure");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong argname, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setargdescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)argname, (void*)(uintptr_t)description);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)description;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong arg, jlong description, jlong languagetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setargdescriptionforlanguage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)arg, (void*)(uintptr_t)description, (void*)(uintptr_t)languagetag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)arg;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescription");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)iface, (void*)(uintptr_t)description);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)description;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong description, jlong languagetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptionforlanguage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)description, (void*)(uintptr_t)languagetag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong language) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptionlanguage");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)iface, (void*)(uintptr_t)language);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)language;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong translationcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptiontranslationcallback");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)iface, (void*)(uintptr_t)translationcallback);
    } else {
        errno = ENOSYS;
    }
#else
    (void)iface;
    (void)translationcallback;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setmemberdescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)description);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)description;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong member, jlong description, jlong languagetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setmemberdescriptionforlanguage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)member, (void*)(uintptr_t)description, (void*)(uintptr_t)languagetag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)member;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setpropertydescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)description);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)description;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage(JNIEnv* km_env, jclass km_clazz, jlong iface, jlong name, jlong description, jlong languagetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setpropertydescriptionforlanguage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)iface, (void*)(uintptr_t)name, (void*)(uintptr_t)description, (void*)(uintptr_t)languagetag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iface;
    (void)name;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong keystore, jlong sink, jlong sinkSz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_getkeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)listener, (int64_t)keystore, (void*)(uintptr_t)sink, (void*)(uintptr_t)sinkSz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)keystore;
    (void)sink;
    (void)sinkSz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong keystore, jlong source, jlong password) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_putkeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)listener, (int64_t)keystore, (void*)(uintptr_t)source, (void*)(uintptr_t)password);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)keystore;
    (void)source;
    (void)password;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_with_synchronization_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(JNIEnv* km_env, jclass km_clazz, jlong bus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong str, jlong buf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_description");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)str, (uint64_t)buf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)msg;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(JNIEnv* km_env, jclass km_clazz, jlong one, jlong other) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_eql");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)one, (int64_t)other);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong argn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getarg");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg, (uint64_t)argn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    (void)argn;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong numargs, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getargs");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)msg, (void*)(uintptr_t)numargs, (void*)(uintptr_t)args);
    } else {
        errno = ENOSYS;
    }
#else
    (void)msg;
    (void)numargs;
    (void)args;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getauthmechanism");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getcallserial");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getcompressiontoken");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getdestination");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong errormessage, jlong errormessageSize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_geterrorname");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)errormessage, (void*)(uintptr_t)errormessageSize);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    (void)errormessage;
    (void)errormessageSize;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getflags");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getinterface");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getmembername");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getobjectpath");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getreceiveendpointname");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getreplyserial");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getsender");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getsessionid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getsignature");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)msg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_gettimestamp");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_gettype");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isbroadcastsignal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isencrypted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong tillexpirems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isexpired");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)tillexpirems);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    (void)tillexpirems;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isglobalbroadcast");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_issessionless");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(JNIEnv* km_env, jclass km_clazz, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isunreliable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_parseargs");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)signature); break;
            case 1: km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)signature, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)msg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(JNIEnv* km_env, jclass km_clazz, jbyte endian) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_setendianess");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int8_t)endian);
    } else {
        errno = ENOSYS;
    }
#else
    (void)endian;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring(JNIEnv* km_env, jclass km_clazz, jlong msg, jlong str, jlong buf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_tostring");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)msg, (void*)(uintptr_t)str, (uint64_t)buf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)msg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)size;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong arg1Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_element");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)arg1Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet(JNIEnv* km_env, jclass km_clazz, jlong args, jlong numargs, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, uint64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_get");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int64_t)args, (uint64_t)numargs, (void*)(uintptr_t)signature); break;
            case 1: km_res = km_fn_ptr((int64_t)args, (uint64_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int64_t)args, (uint64_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int64_t)args, (uint64_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int64_t)args, (uint64_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)args;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet(JNIEnv* km_env, jclass km_clazz, jlong args, jlong numargs, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_set");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int64_t)args, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature); break;
            case 1: km_res = km_fn_ptr((int64_t)args, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int64_t)args, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int64_t)args, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int64_t)args, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)args;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset(JNIEnv* km_env, jclass km_clazz, jlong args, jlong argoffset, jlong numargs, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, uint64_t, void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_set_offset");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int64_t)args, (uint64_t)argoffset, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature); break;
            case 1: km_res = km_fn_ptr((int64_t)args, (uint64_t)argoffset, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int64_t)args, (uint64_t)argoffset, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int64_t)args, (uint64_t)argoffset, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int64_t)args, (uint64_t)argoffset, (void*)(uintptr_t)numargs, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)args;
    (void)argoffset;
    (void)numargs;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature(JNIEnv* km_env, jclass km_clazz, jlong values, jlong numvalues, jlong str, jlong buf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_signature");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)values, (uint64_t)numvalues, (void*)(uintptr_t)str, (uint64_t)buf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)values;
    (void)numvalues;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring(JNIEnv* km_env, jclass km_clazz, jlong args, jlong numargs, jlong str, jlong buf, jlong indent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_tostring");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)args, (uint64_t)numargs, (void*)(uintptr_t)str, (uint64_t)buf, (uint64_t)indent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)args;
    (void)numargs;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_clear");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(JNIEnv* km_env, jclass km_clazz, jlong destination, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_clone");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)destination, (int64_t)source);
    } else {
        errno = ENOSYS;
    }
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(JNIEnv* km_env, jclass km_clazz, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_copy");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)source;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet(JNIEnv* km_env, jclass km_clazz, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_create_and_set");
    }
    int64_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)signature); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)signature, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(JNIEnv* km_env, jclass km_clazz, jlong lhv, jlong rhv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_equal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)lhv, (int64_t)rhv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lhv;
    (void)rhv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature); break;
            case 1: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong arg1Index, jlong element) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_element");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)arg, (uint64_t)arg1Index, (void*)(uintptr_t)element);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)arg1Index;
    (void)element;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong arg1Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_elementsignature");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)arg1Index);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_numberofelements");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong b) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_bool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)b);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)b;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ab) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_bool_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)ab);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ab;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong d) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_double");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)d);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)d;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ad) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_double_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)ad);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ad;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong n) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int16");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)n;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong an) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int16_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)an);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)an;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)i;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ai) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int32_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)ai);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ai;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong x) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)x);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)x;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int64_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)ax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong o) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_objectpath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)o);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)o;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong g) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_signature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)g);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)g;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_string");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)s;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong q) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint16");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)q);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)q;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong aq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint16_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)aq);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)aq;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong u) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)u);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)u;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong au) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint32_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)au);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)au;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong t) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)t);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)t;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong at) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint64_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)at);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)at;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint8_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)length, (void*)(uintptr_t)ay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_variant");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (int64_t)v);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)v;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature, jlong length, jlong av) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_variant_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (void*)(uintptr_t)length, (void*)(uintptr_t)av);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)signature;
    (void)length;
    (void)av;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong elemsig, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getdictelement");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)elemsig); break;
            case 1: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)elemsig, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)elemsig, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)elemsig, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)elemsig, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)elemsig;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getkey");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong arg1Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getmember");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)arg1Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getnummembers");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_gettype");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getvalue");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_hassignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)signature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature); break;
            case 1: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong signature, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_and_stabilize");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature); break;
            case 1: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    (void)signature;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(JNIEnv* km_env, jclass km_clazz, jlong arg, jint b) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_bool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (int32_t)b);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)b;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ab) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_bool_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)ab);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ab;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(JNIEnv* km_env, jclass km_clazz, jlong arg, jdouble d) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_double");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (double)d);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)d;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ad) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_double_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)ad);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ad;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(JNIEnv* km_env, jclass km_clazz, jlong arg, jshort n) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int16");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (int16_t)n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)n;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong an) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int16_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)an);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)an;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(JNIEnv* km_env, jclass km_clazz, jlong arg, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (int32_t)i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)i;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ai) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int32_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)ai);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ai;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong x) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (int64_t)x);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)x;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int64_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)ax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong o) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_objectpath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)o);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)o;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ao) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_objectpath_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)ao);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ao;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong g) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_signature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)g);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)g;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_signature_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)ag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_string");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)s;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong as) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_string_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)as);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)as;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(JNIEnv* km_env, jclass km_clazz, jlong arg, jshort q) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint16");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint16_t)q);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)q;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong aq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint16_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)aq);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)aq;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(JNIEnv* km_env, jclass km_clazz, jlong arg, jint u) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint32_t)u);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)u;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong au) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint32_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)au);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)au;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong t) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)t);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)t;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong at) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint64_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)at);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)at;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(JNIEnv* km_env, jclass km_clazz, jlong arg, jbyte y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint8_t)y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong length, jlong ay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint8_array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (uint64_t)length, (void*)(uintptr_t)ay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)length;
    (void)ay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong key, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_setdictentry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (int64_t)key, (int64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)key;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong structMembers, jlong numMembers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_setstruct");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (int64_t)structMembers, (uint64_t)numMembers);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg;
    (void)structMembers;
    (void)numMembers;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong str, jlong buf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_signature");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)str, (uint64_t)buf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(JNIEnv* km_env, jclass km_clazz, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_stabilize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)arg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)arg;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring(JNIEnv* km_env, jclass km_clazz, jlong arg, jlong str, jlong buf, jlong indent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_tostring");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)arg, (void*)(uintptr_t)str, (uint64_t)buf, (uint64_t)indent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong mandatoryinterfaces, jlong nummandatoryinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)mandatoryinterfaces, (uint64_t)nummandatoryinterfaces);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)mandatoryinterfaces;
    (void)nummandatoryinterfaces;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(JNIEnv* km_env, jclass km_clazz, jlong observer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)observer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)observer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet(JNIEnv* km_env, jclass km_clazz, jlong observer, jlong uniquebusname, jlong objectpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_get");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)observer, (void*)(uintptr_t)uniquebusname, (void*)(uintptr_t)objectpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)observer;
    (void)uniquebusname;
    (void)objectpath;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(JNIEnv* km_env, jclass km_clazz, jlong observer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_getfirst");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)observer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)observer;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(JNIEnv* km_env, jclass km_clazz, jlong observer, jlong proxyref) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_getnext");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)observer, (int64_t)proxyref);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)observer;
    (void)proxyref;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(JNIEnv* km_env, jclass km_clazz, jlong observer, jlong listener, jint triggeronexisting) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_registerlistener");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)observer, (int64_t)listener, (int32_t)triggeronexisting);
    } else {
        errno = ENOSYS;
    }
#else
    (void)observer;
    (void)listener;
    (void)triggeronexisting;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(JNIEnv* km_env, jclass km_clazz, jlong observer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_unregisteralllisteners");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)observer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)observer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(JNIEnv* km_env, jclass km_clazz, jlong observer, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_unregisterlistener");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)observer, (int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)observer;
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observerlistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observerlistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials(JNIEnv* km_env, jclass km_clazz, jlong authmechanism, jlong password) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_passwordmanager_setcredentials");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authmechanism, (void*)(uintptr_t)password);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authmechanism;
    (void)password;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurationlistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurationlistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy(JNIEnv* km_env, jclass km_clazz, jlong certificatechain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificatechain_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)certificatechain);
    } else {
        errno = ENOSYS;
    }
#else
    (void)certificatechain;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup(JNIEnv* km_env, jclass km_clazz, jlong certificateid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificateid_cleanup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)certificateid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)certificateid;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup(JNIEnv* km_env, jclass km_clazz, jlong certificateidarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificateidarray_cleanup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)certificateidarray);
    } else {
        errno = ENOSYS;
    }
#else
    (void)certificateidarray;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong cakey, jlong identitycertificatechain, jlong groupid, jlong groupsize, jlong groupauthority, jlong manifestsxmls, jlong manifestscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_claim");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)cakey, (void*)(uintptr_t)identitycertificatechain, (void*)(uintptr_t)groupid, (uint64_t)groupsize, (void*)(uintptr_t)groupauthority, (void*)(uintptr_t)manifestsxmls, (uint64_t)manifestscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)cakey;
    (void)identitycertificatechain;
    (void)groupid;
    (void)groupsize;
    (void)groupauthority;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(JNIEnv* km_env, jclass km_clazz, jlong configurator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_endmanagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getapplicationstate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong claimcapabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getclaimcapabilities");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)claimcapabilities);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)claimcapabilities;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong additionalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)additionalinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)additionalinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getdefaultclaimcapabilities");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong policyxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getdefaultpolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong identitycertificatechain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getidentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)identitycertificatechain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)identitycertificatechain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong certificateid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getidentitycertificateid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)certificateid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)certificateid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong manifestarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmanifests");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)manifestarray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)manifestarray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong manifesttemplatexml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmanifesttemplate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)manifesttemplatexml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong certificateids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmembershipsummaries");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)certificateids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)certificateids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong policyxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getpolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong publickey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getpublickey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)publickey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)publickey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong manifestsxmls, jlong manifestscount, jint append) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_installmanifests");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)manifestsxmls, (uint64_t)manifestscount, (int32_t)append);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)manifestsxmls;
    (void)manifestscount;
    (void)append;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong membershipcertificatechain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_installmembership");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)membershipcertificatechain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)membershipcertificatechain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup(JNIEnv* km_env, jclass km_clazz, jlong manifestarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_manifestarray_cleanup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)manifestarray);
    } else {
        errno = ENOSYS;
    }
#else
    (void)manifestarray;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy(JNIEnv* km_env, jclass km_clazz, jlong manifesttemplatexml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_manifesttemplate_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)manifesttemplatexml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)manifesttemplatexml;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy(JNIEnv* km_env, jclass km_clazz, jlong policyxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_policy_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)policyxml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)policyxml;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy(JNIEnv* km_env, jclass km_clazz, jlong publickey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_publickey_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)publickey);
    } else {
        errno = ENOSYS;
    }
#else
    (void)publickey;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong serial, jlong seriallen, jlong issuerpublickey, jlong issueraki, jlong issuerakilen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_removemembership");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)serial, (uint64_t)seriallen, (void*)(uintptr_t)issuerpublickey, (void*)(uintptr_t)issueraki, (uint64_t)issuerakilen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)serial;
    (void)seriallen;
    (void)issuerpublickey;
    (void)issueraki;
    (void)issuerakilen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(JNIEnv* km_env, jclass km_clazz, jlong configurator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_reset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(JNIEnv* km_env, jclass km_clazz, jlong configurator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_resetpolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(JNIEnv* km_env, jclass km_clazz, jlong configurator, jint state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setapplicationstate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (int32_t)state);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)state;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(JNIEnv* km_env, jclass km_clazz, jlong configurator, jshort claimcapabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setclaimcapabilities");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (uint16_t)claimcapabilities);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)claimcapabilities;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(JNIEnv* km_env, jclass km_clazz, jlong configurator, jshort additionalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (uint16_t)additionalinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)additionalinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong manifesttemplatexml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setmanifesttemplatefromxml");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)manifesttemplatexml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(JNIEnv* km_env, jclass km_clazz, jlong configurator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_startmanagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong identitycertificatechain, jlong manifestsxmls, jlong manifestscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_updateidentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)identitycertificatechain, (void*)(uintptr_t)manifestsxmls, (uint64_t)manifestscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)identitycertificatechain;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy(JNIEnv* km_env, jclass km_clazz, jlong configurator, jlong policyxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_updatepolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)configurator, (void*)(uintptr_t)policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_pinglistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_pinglistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong child) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addchild");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (int64_t)child);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)child;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addinterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (int64_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addinterface_by_name");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)name;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(JNIEnv* km_env, jclass km_clazz, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_copy");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)source;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong service, jlong path, jint sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)service, (void*)(uintptr_t)path, (uint32_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)service;
    (void)path;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong service, jlong path, jint sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_create_secure");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)service, (void*)(uintptr_t)path, (uint32_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)service;
    (void)path;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_enablepropertycaching");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getallproperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface, (int64_t)values);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)values;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong callback, jint timeout, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getallpropertiesasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface, (void*)(uintptr_t)callback, (uint32_t)timeout, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getchild");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)path;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong children, jlong numchildren) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getchildren");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)children, (uint64_t)numchildren);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proxyobj;
    (void)children;
    (void)numchildren;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getinterface");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong ifaces, jlong numifaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getinterfaces");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)ifaces, (uint64_t)numifaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proxyobj;
    (void)ifaces;
    (void)numifaces;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getpath");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong property, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getproperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface, (void*)(uintptr_t)property, (int64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong property, jlong callback, jint timeout, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getpropertyasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface, (void*)(uintptr_t)property, (void*)(uintptr_t)callback, (uint32_t)timeout, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getservicename");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getsessionid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getuniquename");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_implementsinterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_introspectremoteobject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_introspectremoteobjectasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_issecure");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(JNIEnv* km_env, jclass km_clazz, jlong proxyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_isvalid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong ifacename, jlong methodname, jlong args, jlong numargs, jlong replymsg, jint timeout, jbyte flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint64_t, int64_t, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)ifacename, (void*)(uintptr_t)methodname, (int64_t)args, (uint64_t)numargs, (int64_t)replymsg, (uint32_t)timeout, (uint8_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)args;
    (void)numargs;
    (void)replymsg;
    (void)timeout;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong ifacename, jlong methodname, jlong args, jlong numargs, jbyte flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcall_noreply");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)ifacename, (void*)(uintptr_t)methodname, (int64_t)args, (uint64_t)numargs, (uint8_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)args;
    (void)numargs;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong ifacename, jlong methodname, jlong replyfunc, jlong args, jlong numargs, jlong context, jint timeout, jbyte flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, int64_t, uint64_t, void*, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcallasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)ifacename, (void*)(uintptr_t)methodname, (void*)(uintptr_t)replyfunc, (int64_t)args, (uint64_t)numargs, (void*)(uintptr_t)context, (uint32_t)timeout, (uint8_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)replyfunc;
    (void)args;
    (void)numargs;
    (void)context;
    (void)timeout;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong xml, jlong identifier) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_parsexml");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)xml, (void*)(uintptr_t)identifier);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)xml;
    (void)identifier;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(JNIEnv* km_env, jclass km_clazz, jlong ref) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_decref");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)ref);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ref;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(JNIEnv* km_env, jclass km_clazz, jlong ref) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_get");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)ref);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ref;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(JNIEnv* km_env, jclass km_clazz, jlong ref) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_incref");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)ref);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ref;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong properties, jlong numproperties, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_registerpropertieschangedlistener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface, (void*)(uintptr_t)properties, (uint64_t)numproperties, (void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)properties;
    (void)numproperties;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_removechild");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)path;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jint forceauth) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_secureconnection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (int32_t)forceauth);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)forceauth;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jint forceauth) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_secureconnectionasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (int32_t)forceauth);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)forceauth;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong property, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_setproperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface, (void*)(uintptr_t)property, (int64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong property, jlong value, jlong callback, jint timeout, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_setpropertyasync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface, (void*)(uintptr_t)property, (int64_t)value, (void*)(uintptr_t)callback, (uint32_t)timeout, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener(JNIEnv* km_env, jclass km_clazz, jlong proxyobj, jlong iface, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_unregisterpropertieschangedlistener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxyobj, (void*)(uintptr_t)iface, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxyobj;
    (void)iface;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_routerinit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig(JNIEnv* km_env, jclass km_clazz, jlong configxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_routerinitwithconfig");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)configxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)configxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_routershutdown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong cakey, jlong identitycertificatechain, jlong groupid, jlong groupsize, jlong groupauthority, jlong manifestsxmls, jlong manifestscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_claim");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)cakey, (void*)(uintptr_t)identitycertificatechain, (void*)(uintptr_t)groupid, (uint64_t)groupsize, (void*)(uintptr_t)groupauthority, (void*)(uintptr_t)manifestsxmls, (uint64_t)manifestscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)cakey;
    (void)identitycertificatechain;
    (void)groupid;
    (void)groupsize;
    (void)groupauthority;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest(JNIEnv* km_env, jclass km_clazz, jlong unsignedmanifestxml, jlong identitycertificatepem, jlong digest, jlong digestsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_computemanifestdigest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)unsignedmanifestxml, (void*)(uintptr_t)identitycertificatepem, (void*)(uintptr_t)digest, (void*)(uintptr_t)digestsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)digest;
    (void)digestsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate(JNIEnv* km_env, jclass km_clazz, jlong bus, jlong appbusname, jint sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)bus, (void*)(uintptr_t)appbusname, (uint32_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bus;
    (void)appbusname;
    (void)sessionid;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)proxy);
    } else {
        errno = ENOSYS;
    }
#else
    (void)proxy;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy(JNIEnv* km_env, jclass km_clazz, jlong digest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_digest_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)digest);
    } else {
        errno = ENOSYS;
    }
#else
    (void)digest;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy(JNIEnv* km_env, jclass km_clazz, jlong eccpublickey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_eccpublickey_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)eccpublickey);
    } else {
        errno = ENOSYS;
    }
#else
    (void)eccpublickey;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_endmanagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong applicationstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getapplicationstate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)applicationstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)applicationstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong capabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getclaimcapabilities");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)capabilities);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)capabilities;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong additionalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)additionalinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)additionalinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong policyxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getdefaultpolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong eccpublickey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_geteccpublickey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)eccpublickey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)eccpublickey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong manifesttemplatexml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getmanifesttemplate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)manifesttemplatexml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getpermissionmanagementsessionport");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong policyxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getpolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong membershipcertificatechain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_installmembership");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)membershipcertificatechain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)membershipcertificatechain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy(JNIEnv* km_env, jclass km_clazz, jlong signedmanifestxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_manifest_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)signedmanifestxml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)signedmanifestxml;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy(JNIEnv* km_env, jclass km_clazz, jlong manifesttemplatexml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_manifesttemplate_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)manifesttemplatexml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)manifesttemplatexml;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy(JNIEnv* km_env, jclass km_clazz, jlong policyxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_policy_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)policyxml);
    } else {
        errno = ENOSYS;
    }
#else
    (void)policyxml;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_reset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_resetpolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature(JNIEnv* km_env, jclass km_clazz, jlong unsignedmanifestxml, jlong identitycertificatepem, jlong signature, jlong signaturesize, jlong signedmanifestxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_setmanifestsignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)unsignedmanifestxml, (void*)(uintptr_t)identitycertificatepem, (void*)(uintptr_t)signature, (uint64_t)signaturesize, (void*)(uintptr_t)signedmanifestxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)signature;
    (void)signaturesize;
    (void)signedmanifestxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest(JNIEnv* km_env, jclass km_clazz, jlong unsignedmanifestxml, jlong identitycertificatepem, jlong signingprivatekeypem, jlong signedmanifestxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_signmanifest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)unsignedmanifestxml, (void*)(uintptr_t)identitycertificatepem, (void*)(uintptr_t)signingprivatekeypem, (void*)(uintptr_t)signedmanifestxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)signingprivatekeypem;
    (void)signedmanifestxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(JNIEnv* km_env, jclass km_clazz, jlong proxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_startmanagement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong identitycertificatechain, jlong manifestsxmls, jlong manifestscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_updateidentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)identitycertificatechain, (void*)(uintptr_t)manifestsxmls, (uint64_t)manifestscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)identitycertificatechain;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy(JNIEnv* km_env, jclass km_clazz, jlong proxy, jlong policyxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_updatepolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)proxy, (void*)(uintptr_t)policyxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionlistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionlistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(JNIEnv* km_env, jclass km_clazz, jlong one, jlong other) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_cmp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)one, (int64_t)other);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(JNIEnv* km_env, jclass km_clazz, jbyte traffic, jint ismultipoint, jbyte proximity, jshort transports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint8_t, int32_t, uint8_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)traffic, (int32_t)ismultipoint, (uint8_t)proximity, (uint16_t)transports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)traffic;
    (void)ismultipoint;
    (void)proximity;
    (void)transports;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(JNIEnv* km_env, jclass km_clazz, jlong opts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)opts);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(JNIEnv* km_env, jclass km_clazz, jlong opts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_multipoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)opts);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)opts;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(JNIEnv* km_env, jclass km_clazz, jlong opts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_proximity");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)opts);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)opts;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(JNIEnv* km_env, jclass km_clazz, jlong opts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_traffic");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)opts);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)opts;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(JNIEnv* km_env, jclass km_clazz, jlong opts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_transports");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)opts);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)opts;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(JNIEnv* km_env, jclass km_clazz, jlong one, jlong other) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_iscompatible");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)one, (int64_t)other);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(JNIEnv* km_env, jclass km_clazz, jlong opts, jint ismultipoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_multipoint");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)opts, (int32_t)ismultipoint);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    (void)ismultipoint;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(JNIEnv* km_env, jclass km_clazz, jlong opts, jbyte proximity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_proximity");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)opts, (uint8_t)proximity);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    (void)proximity;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(JNIEnv* km_env, jclass km_clazz, jlong opts, jbyte traffic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_traffic");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)opts, (uint8_t)traffic);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    (void)traffic;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(JNIEnv* km_env, jclass km_clazz, jlong opts, jshort transports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_transports");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)opts, (uint16_t)transports);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opts;
    (void)transports;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionportlistener_create");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionportlistener_destroy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_shutdown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_unity_deferred_callbacks_process");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_alljoyn_WindowsWin32DevicesAlljoynJniBridge_windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(JNIEnv* km_env, jclass km_clazz, jint mainthreadOnly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_unity_set_deferred_callback_mainthread_only");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)mainthreadOnly);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mainthreadOnly;
    errno = ENOSYS;
#endif
}

